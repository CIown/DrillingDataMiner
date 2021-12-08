package com.ddm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ddm.dto.UserDto;
import com.ddm.entity.UserEntity;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

public interface IUserService extends IService<UserEntity> {
    UserDto findById(Long id);
    UserDto findByName(String userName);
    List<UserDto> findAll(Integer page,Integer size);
    List<UserDto> findAll();
    /**
     * 新增用户
     * @param resources /
     */
    void create(UserEntity resources);

    void deleteIds(Set<Long> ids);

    void updateUser(UserEntity resources);

    void updateCenter(UserEntity resources);

    void updatePass(String username, String pass);
}
