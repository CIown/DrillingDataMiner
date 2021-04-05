package com.ddm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ddm.dto.DeptDto;
import com.ddm.dto.DeptQueryCriteria;
import com.ddm.entity.DepartmentEntity;
import com.ddm.mapper.DepartmentMapper;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Set;

public interface IDepartmentService extends IService<DepartmentEntity> {

}
