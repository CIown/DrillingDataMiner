package com.ddm.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ddm.entity.WellDrillbitUsageEntity;
import com.ddm.form.DrillbitUsageForm;
import org.springframework.security.core.parameters.P;

import java.util.List;

public interface IWellDrillbitUsageService extends IService<WellDrillbitUsageEntity> {
    public List getPageResult(Integer page, Integer size);

    public String insert(DrillbitUsageForm drillbitUsageForm);

}
