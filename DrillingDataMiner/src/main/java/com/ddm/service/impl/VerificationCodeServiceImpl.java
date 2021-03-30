package com.ddm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ddm.entity.VerificationCodeEntity;
import com.ddm.mapper.VerificationCodeMapper;
import com.ddm.service.IVerificationCodeService;
import org.springframework.stereotype.Service;

@Service
public class VerificationCodeServiceImpl extends ServiceImpl<VerificationCodeMapper, VerificationCodeEntity> implements IVerificationCodeService {
}
