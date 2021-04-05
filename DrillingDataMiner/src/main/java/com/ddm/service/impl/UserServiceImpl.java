package com.ddm.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ddm.common.exception.EntityNotFoundException;
import com.ddm.dto.UserDto;
import com.ddm.entity.UserEntity;
import com.ddm.mapper.UserMapper;
import com.ddm.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@CacheConfig(cacheNames = "user")
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements IUserService {

    private final com.ddm.mapstruct.UserMapper userMapStruct;

    @Override
    public UserDto findByName(String userName) {
        UserEntity user = super.baseMapper.findByName(userName);
        if (user == null) {
            throw new EntityNotFoundException(UserEntity.class, "name", userName);
        } else {
            return userMapStruct.toDto(user);
        }
    }
}
