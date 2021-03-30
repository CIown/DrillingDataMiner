package com.ddm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ddm.entity.QuartzLogEntity;
import com.ddm.mapper.QuartzLogMapper;
import com.ddm.service.IQuartzJobService;
import com.ddm.service.IQuartzLogService;
import org.springframework.stereotype.Service;

@Service
public class QuartzLogServiceImpl extends ServiceImpl<QuartzLogMapper, QuartzLogEntity> implements IQuartzLogService {
}
