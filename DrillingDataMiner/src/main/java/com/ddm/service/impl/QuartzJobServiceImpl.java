package com.ddm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ddm.entity.QuartzJobEntity;
import com.ddm.mapper.QuartzJobMapper;
import com.ddm.service.IQuartzJobService;
import org.springframework.stereotype.Service;

@Service
public class QuartzJobServiceImpl extends ServiceImpl<QuartzJobMapper, QuartzJobEntity> implements IQuartzJobService {
}
