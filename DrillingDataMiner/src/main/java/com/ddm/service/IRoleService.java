package com.ddm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ddm.dto.RoleDto;
import com.ddm.dto.RoleQueryCriteria;
import com.ddm.dto.RoleSmallDto;
import com.ddm.dto.UserDto;
import com.ddm.entity.RoleEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.GrantedAuthority;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Set;

public interface IRoleService extends IService<RoleEntity> {
    List<RoleSmallDto> findByUsersId(Long id);

}
