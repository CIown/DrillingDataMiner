package com.ddm.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ddm.common.utils.StringUtils;
import com.ddm.dto.RoleSmallDto;
import com.ddm.dto.UserDto;
import com.ddm.entity.MenuEntity;
import com.ddm.entity.RoleEntity;
import com.ddm.entity.RolesMenusEntity;
import com.ddm.mapper.RolesMenusMapper;
import com.ddm.service.IRolesMenusService;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@CacheConfig(cacheNames = "role_menu")
public class RolesMenusServiceImpl extends ServiceImpl<RolesMenusMapper, RolesMenusEntity> implements IRolesMenusService {
    @Override
    public LinkedHashSet<MenuEntity> findByRoleIdsAndTypeNot(Set<Long> roleIds,int type)
    {
        return super.baseMapper.findByRoleIdsAndTypeNot(roleIds, type);
    }
    @Override
    public Set<MenuEntity> getMenus(Long role_id) {
        return super.baseMapper.getMenus(role_id);
    }
}
