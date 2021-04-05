package com.ddm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ddm.dto.RoleSmallDto;
import com.ddm.dto.UserDto;
import com.ddm.entity.UsersRolesEntity;
import org.springframework.security.core.GrantedAuthority;

import java.util.List;

public interface IUsersRolesService extends IService<UsersRolesEntity> {
    List<RoleSmallDto> findByUsersId(Long id);
    List<GrantedAuthority> mapToGrantedAuthorities(UserDto user);
}
