package com.ddm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ddm.entity.WellInfoByWellNameEntity;
import com.ddm.mapper.WellInfoByWellNameMapper;
import com.ddm.service.IWellInfoByWellNameService;
import org.springframework.stereotype.Service;

@Service
public class WellInfoByWellNameServiceImpl extends ServiceImpl<WellInfoByWellNameMapper, WellInfoByWellNameEntity> implements IWellInfoByWellNameService {
}
