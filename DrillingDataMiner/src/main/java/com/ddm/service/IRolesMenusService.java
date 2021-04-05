package com.ddm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ddm.dto.RoleSmallDto;
import com.ddm.dto.UserDto;
import com.ddm.entity.MenuEntity;
import com.ddm.entity.RolesMenusEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.security.core.GrantedAuthority;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public interface IRolesMenusService extends IService<RolesMenusEntity> {
    Set<MenuEntity> getMenus(Long role_id);
    LinkedHashSet<MenuEntity> findByRoleIdsAndTypeNot(@Param("roleIds") Set<Long> roleIds, @Param("type") int type);
}
