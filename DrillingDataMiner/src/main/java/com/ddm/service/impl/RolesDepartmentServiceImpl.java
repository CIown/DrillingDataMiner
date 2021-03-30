package com.ddm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ddm.entity.RolesDepartmentEntity;
import com.ddm.mapper.RolesDepartmentMapper;
import com.ddm.service.IRolesDepartmentService;
import org.springframework.stereotype.Service;

@Service
public class RolesDepartmentServiceImpl extends ServiceImpl<RolesDepartmentMapper, RolesDepartmentEntity> implements IRolesDepartmentService {
}
