package com.ddm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ddm.entity.WellDrillbitUsageEntity;
import com.ddm.entity.WellHeaderEntity;
import com.ddm.form.DrillbitUsageForm;
import com.ddm.mapper.WellDrillbitUsageMapper;
import com.ddm.service.IWellDrillbitUsageService;
import com.mchange.v2.beans.BeansUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WellDrillbitUsageServiceImpl extends ServiceImpl<WellDrillbitUsageMapper, WellDrillbitUsageEntity> implements IWellDrillbitUsageService {

    @Autowired
    private WellDrillbitUsageMapper mapper;

    @Override
    public List<WellDrillbitUsageEntity> getPageResult(Integer page, Integer size){
        Page<WellDrillbitUsageEntity> wellDrillbitUsagePage = new Page<>(page,size);
        Page<WellDrillbitUsageEntity> wellDrillbitUsagePageResult = this.mapper
                .selectPage(wellDrillbitUsagePage,null);
        List<WellDrillbitUsageEntity> records = wellDrillbitUsagePageResult.getRecords();
        return records;
    }

    @Override
    public String insert(DrillbitUsageForm drillbitUsageForm){
        WellDrillbitUsageEntity entity = new WellDrillbitUsageEntity();
        BeanUtils.copyProperties(drillbitUsageForm,entity);
        System.out.println(drillbitUsageForm);
        System.out.println(entity);
        mapper.insert(entity);
        return null;
    }
}
