package com.ddm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ddm.entity.StatusDictionaryEntity;
import com.ddm.mapper.StatusDictionaryMapper;
import com.ddm.service.IStatusDictionaryService;
import org.springframework.stereotype.Service;

@Service
public class StatusDictionaryServiceImpl extends ServiceImpl<StatusDictionaryMapper, StatusDictionaryEntity> implements IStatusDictionaryService {
}
