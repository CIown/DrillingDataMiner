package com.ddm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ddm.entity.UsersRolesEntity;
import com.ddm.mapper.UsersRolesMapper;
import com.ddm.service.IUsersRolesService;
import org.springframework.stereotype.Service;

@Service
public class UsersRolesServiceImpl extends ServiceImpl<UsersRolesMapper, UsersRolesEntity> implements IUsersRolesService {
}
