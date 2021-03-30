package com.ddm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ddm.entity.EmailConfigEntity;
import com.ddm.mapper.EmailConfigMapper;
import com.ddm.service.IEmailConfigService;
import org.springframework.stereotype.Service;

@Service
public class EmailConfigServiceImpl extends ServiceImpl<EmailConfigMapper, EmailConfigEntity> implements IEmailConfigService {
}
