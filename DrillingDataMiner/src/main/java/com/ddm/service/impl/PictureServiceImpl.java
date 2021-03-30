package com.ddm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ddm.entity.PictureEntity;
import com.ddm.mapper.PictureMapper;
import com.ddm.service.IPictureService;
import org.springframework.stereotype.Service;

@Service
public class PictureServiceImpl extends ServiceImpl<PictureMapper, PictureEntity> implements IPictureService {
}
