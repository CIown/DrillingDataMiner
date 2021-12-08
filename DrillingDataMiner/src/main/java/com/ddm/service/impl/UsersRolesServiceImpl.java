package com.ddm.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ddm.common.utils.StringUtils;
import com.ddm.dto.RoleSmallDto;
import com.ddm.dto.UserDto;
import com.ddm.entity.MenuEntity;
import com.ddm.entity.RoleEntity;
import com.ddm.entity.UsersRolesEntity;
import com.ddm.mapper.UsersRolesMapper;
import com.ddm.service.IRolesMenusService;
import com.ddm.service.IUsersRolesService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@CacheConfig(cacheNames = "users_roles")
public class UsersRolesServiceImpl extends ServiceImpl<UsersRolesMapper, UsersRolesEntity> implements IUsersRolesService {
    private final com.ddm.mapstruct.RoleMapper roleMapStruct;
    private final com.ddm.mapstruct.RoleSmallMapper roleSmallMapStruct;
    private final IRolesMenusService rolesMenusService;
    @Override
    public List<RoleSmallDto> findByUsersId(Long id) {
        List<RoleEntity> roles = super.baseMapper.findRoleListByUserId(id);
        return roleSmallMapStruct.toDto(roles);
    }

    @Override
//    @Cacheable(key = "'auth:' + #p0.id")
    public List<GrantedAuthority> mapToGrantedAuthorities(UserDto user) {
        Set<String> permissions = new HashSet<>();
        // 如果是管理员直接返回
        System.out.println(user.getIsAdmin());
        System.out.println("isadmin");
        if (user.getIsAdmin() != null && user.getIsAdmin()) {
            permissions.add("admin");
            return permissions.stream().map(SimpleGrantedAuthority::new)
                    .collect(Collectors.toList());
        }
        QueryChainWrapper query = super.query();

        Set<RoleEntity> roles = super.baseMapper.findByUserId(user.getId());

        permissions = roles.stream().flatMap(role -> rolesMenusService.getMenus(role.getId()).stream())
                .filter(menu -> StringUtils.isNotBlank(menu.getPermission()))
                .map(MenuEntity::getPermission).collect(Collectors.toSet());
        return permissions.stream().map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }
}
