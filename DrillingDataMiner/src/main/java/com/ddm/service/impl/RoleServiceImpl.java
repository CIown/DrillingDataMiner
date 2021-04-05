package com.ddm.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ddm.common.utils.RedisUtils;
import com.ddm.common.utils.StringUtils;
import com.ddm.dto.RoleDto;
import com.ddm.dto.RoleQueryCriteria;
import com.ddm.dto.RoleSmallDto;
import com.ddm.dto.UserDto;
import com.ddm.entity.MenuEntity;
import com.ddm.entity.RoleEntity;
import com.ddm.mapper.RoleMapper;
import com.ddm.security.service.UserCacheClean;
import com.ddm.service.IDepartmentService;
import com.ddm.service.IMenuService;
import com.ddm.service.IRoleService;
import com.ddm.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@CacheConfig(cacheNames = "role")
public class RoleServiceImpl extends ServiceImpl<RoleMapper, RoleEntity> implements IRoleService {

    private final RedisUtils redisUtils;
    private final IUserService userService;
    private final UserCacheClean userCacheClean;





}
