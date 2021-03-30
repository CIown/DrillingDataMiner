package com.ddm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ddm.entity.GenConfigEntity;
import com.ddm.mapper.GenConfigMapper;
import com.ddm.service.IGenConfigService;
import org.springframework.stereotype.Service;

@Service
public class GenConfigServiceImpl extends ServiceImpl<GenConfigMapper, GenConfigEntity> implements IGenConfigService {

}
