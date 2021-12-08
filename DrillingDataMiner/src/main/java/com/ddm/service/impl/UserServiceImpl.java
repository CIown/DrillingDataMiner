package com.ddm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ddm.common.exception.EntityExistException;
import com.ddm.common.exception.EntityNotFoundException;
import com.ddm.common.utils.CacheKey;
import com.ddm.common.utils.PageUtil;
import com.ddm.common.utils.RedisUtils;
import com.ddm.dto.BaseDTO;
import com.ddm.dto.UserDto;
import com.ddm.entity.JobEntity;
import com.ddm.entity.RoleEntity;
import com.ddm.entity.UserEntity;
import com.ddm.entity.UsersRolesEntity;
import com.ddm.mapper.UserMapper;
import com.ddm.security.service.UserCacheClean;
import com.ddm.service.IUserService;
import com.ddm.service.IUsersRolesService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Array;
import java.sql.Timestamp;
import java.util.*;

@Service
@RequiredArgsConstructor
//@CacheConfig(cacheNames = "user")
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements IUserService {

    private final com.ddm.mapstruct.UserMapper userMapStruct;
    private final com.ddm.mapper.UserMapper userMapper;
    private final com.ddm.mapper.UsersRolesMapper usersRolesMapper;
    private final RedisUtils redisUtils;
    private final UserCacheClean userCacheClean;


    public UserDto findById(Long id){
        UserEntity user = this.userMapper.findById(id);
        if (user == null) {
            throw new EntityNotFoundException(UserEntity.class, "id", id.toString());
        } else {
            return userMapStruct.toDto(user);
        }
    }

    @Override
    public UserDto findByName(String userName) {
        UserEntity user = this.userMapper.findByName(userName);
        if (user == null) {
            throw new EntityNotFoundException(UserEntity.class, "name", userName);
        } else {
            return userMapStruct.toDto(user);
        }
    }

    @Override
    public List<UserDto> findAll(Integer page,Integer size) {
        Page<UserEntity> userPage = new Page<>(page,size);
        Page<UserEntity> userPageResult = this.userMapper.findPage(userPage);
        List<UserEntity> user = userPageResult.getRecords();
        if (user == null) {
            throw new EntityNotFoundException(UserEntity.class, "name", "user");
        } else {
//            return PageUtil.toPage(userMapStruct.toDto(user),userPageResult.getTotal());
          return userMapStruct.toDto(user);
        }
    }

    @Override
    public List<UserDto> findAll() {
        List<UserEntity> user = userMapper.findAll();
        if (user == null) {
            throw new EntityNotFoundException(UserEntity.class, "name", "user");
        } else {
            return userMapStruct.toDto(user);
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void create(UserEntity resources) {
        if (userMapper.findByName(resources.getUsername()) != null) {
            throw new EntityNotFoundException(UserEntity.class, "username", resources.getUsername());
        }
        if (userMapper.findByEmail(resources.getEmail()) != null) {
            throw new EntityNotFoundException(UserEntity.class, "email", resources.getEmail());
        }
        if (userMapper.findByPhone(resources.getPhone()) != null) {
            throw new EntityNotFoundException(UserEntity.class, "phone", resources.getPhone());
        }
        long deptId = resources.getDept().getId();
        long jobId = -1;
        long roleId = -1;
        for (JobEntity job:resources.getJobs()) {
            jobId = job.getId();
        }
        for(RoleEntity role:resources.getRoles()){
            roleId = role.getId();
        }
        UsersRolesEntity usersRoles = new UsersRolesEntity();
        usersRoles.setRole_id(roleId);

        userMapper.save(resources,deptId,jobId);
        usersRoles.setUser_id(resources.getId());
        usersRolesMapper.insert(usersRoles);
    }

    @Transactional(rollbackFor = Exception.class)
    public void deleteIds(Set<Long> ids){
        for (Long id:ids) {
            userMapper.removeByIds(id);
            usersRolesMapper.removeByUserIds(id);
        }

    }

    @Transactional(rollbackFor = Exception.class)
    public void updateUser(UserEntity resources){
        long jobId = -1;
        long roleId = -1;

        long deptId = resources.getDept().getId();
        for (JobEntity job:resources.getJobs()) {
            jobId = job.getId();
        }
        for(RoleEntity role:resources.getRoles()){
            roleId = role.getId();
        }
        UsersRolesEntity usersRoles = new UsersRolesEntity();
        usersRoles.setRole_id(roleId);
        usersRoles.setUser_id(resources.getId());
        userMapper.updateUser(resources,deptId,jobId);
        usersRolesMapper.updateByUserId(usersRoles);
    }

    @Transactional(rollbackFor = Exception.class)
    public void updateCenter(UserEntity resources) {
        UserEntity user = userMapper.findById(resources.getId());

        if(user == null) {
            user = new UserEntity();
        }
        UserEntity user1 = userMapper.findByPhone(resources.getPhone());
        if (user1 != null && !user.getId().equals(user1.getId())) {
            throw new EntityExistException(UserEntity.class, "phone", resources.getPhone());
        }
        user.setNickName(resources.getNickName());
        user.setPhone(resources.getPhone());
        user.setSex(resources.getSex());

        Long deptId = user.getDept().getId();
        long jobId = -1;
        long roleId = -1;
        for (JobEntity job:user.getJobs()) {
            jobId = job.getId();
        }

        userMapper.updateUser(user,deptId,jobId);
        // 清理缓存
        delCaches(user.getId(), user.getUsername());
    }

    @Transactional(rollbackFor = Exception.class)
    public void updatePass(String username, String pass) {
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        userMapper.updatePass(username, pass, timestamp);
        flushCache(username);
    }

    public void delCaches(Long id, String username) {
        redisUtils.del(CacheKey.USER_ID + id);
        flushCache(username);
    }
    /**
     * 清理 登陆时 用户缓存信息
     *
     * @param username /
     */
    private void flushCache(String username) {
        userCacheClean.cleanUserCache(username);
    }
}
