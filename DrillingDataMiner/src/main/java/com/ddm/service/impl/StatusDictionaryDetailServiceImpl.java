package com.ddm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ddm.entity.StatusDictionaryDetailEntity;
import com.ddm.mapper.StatusDictionaryDetailMapper;
import com.ddm.service.IStatusDictionaryDetailService;
import org.springframework.stereotype.Service;

@Service
public class StatusDictionaryDetailServiceImpl extends ServiceImpl<StatusDictionaryDetailMapper, StatusDictionaryDetailEntity> implements IStatusDictionaryDetailService {
}
