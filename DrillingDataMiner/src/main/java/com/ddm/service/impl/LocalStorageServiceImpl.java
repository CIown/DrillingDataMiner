package com.ddm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ddm.entity.LocalStorageEntity;
import com.ddm.mapper.LocalStorageMapper;
import com.ddm.service.ILocalStorageService;
import org.springframework.stereotype.Service;

@Service
public class LocalStorageServiceImpl extends ServiceImpl<LocalStorageMapper, LocalStorageEntity> implements ILocalStorageService {
}
