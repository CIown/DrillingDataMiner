package com.ddm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ddm.entity.WellHeaderEntity;
import com.ddm.mapper.WellHeaderMapper;
import com.ddm.service.IWellHeaderService;
import org.springframework.stereotype.Service;

@Service
public class WellHeaderServiceImpl extends ServiceImpl<WellHeaderMapper, WellHeaderEntity> implements IWellHeaderService {
}
