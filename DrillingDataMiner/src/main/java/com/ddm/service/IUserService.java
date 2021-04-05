package com.ddm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ddm.dto.UserDto;
import com.ddm.entity.UserEntity;

public interface IUserService extends IService<UserEntity> {
    UserDto findByName(String userName);
}
