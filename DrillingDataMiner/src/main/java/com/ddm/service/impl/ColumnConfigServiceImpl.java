package com.ddm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ddm.entity.ColumnConfigEntity;
import com.ddm.mapper.ColumnConfigMapper;
import com.ddm.service.IColumnConfigService;
import org.springframework.stereotype.Service;

@Service
public class ColumnConfigServiceImpl extends ServiceImpl<ColumnConfigMapper, ColumnConfigEntity> implements IColumnConfigService {
}
