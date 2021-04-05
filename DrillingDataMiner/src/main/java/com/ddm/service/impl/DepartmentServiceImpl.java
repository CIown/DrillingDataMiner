package com.ddm.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ddm.common.utils.RedisUtils;
import com.ddm.dto.DeptDto;
import com.ddm.dto.DeptQueryCriteria;
import com.ddm.entity.DepartmentEntity;
import com.ddm.mapper.DepartmentMapper;
import com.ddm.service.IDepartmentService;
import com.ddm.service.IRoleService;
import com.ddm.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service

public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, DepartmentEntity> implements IDepartmentService {

}
