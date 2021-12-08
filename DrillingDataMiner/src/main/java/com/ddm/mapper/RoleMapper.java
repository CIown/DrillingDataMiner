package com.ddm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ddm.entity.MenuEntity;
import com.ddm.entity.RoleEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Set;

@Mapper
public interface RoleMapper extends BaseMapper<RoleEntity> {
    @Select(value = "SELECT r.* FROM sys_role r, sys_users_roles u WHERE " +
            "r.id = u.role_id AND u.user_id = #{id}")
    @ResultMap("detailedRoles")
    Set<RoleEntity> findByUserId(@Param("id") Long id);

    @Select(value = "SELECT r.id, r.name, r.remark, r.data_scope, r.level, r.create_time, r.permission FROM sys_role r, sys_users_roles u WHERE " +
            "r.id = u.role_id AND u.user_id = #{id}")
    @ResultMap("detailedRoles")
    List<RoleEntity> findRoleListByUserId(@Param("id") Long id);
}
