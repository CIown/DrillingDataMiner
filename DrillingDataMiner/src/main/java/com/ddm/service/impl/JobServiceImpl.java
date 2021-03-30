package com.ddm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ddm.entity.JobEntity;
import com.ddm.mapper.JobMapper;
import com.ddm.service.IJobService;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl extends ServiceImpl<JobMapper, JobEntity> implements IJobService {
}
