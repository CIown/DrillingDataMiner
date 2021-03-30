package com.ddm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ddm.entity.VisitsEntity;
import com.ddm.mapper.VisitsMapper;
import com.ddm.service.IVisitsService;
import org.springframework.stereotype.Service;

@Service
public class VisitsServiceImpl extends ServiceImpl<VisitsMapper, VisitsEntity> implements IVisitsService {
}
