package com.ddm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ddm.entity.UserAvatarEntity;
import com.ddm.mapper.UserAvatarMapper;
import com.ddm.service.IUserAvatarService;
import org.springframework.stereotype.Service;

@Service
public class UserAvatarServiceImpl extends ServiceImpl<UserAvatarMapper, UserAvatarEntity> implements IUserAvatarService {
}
