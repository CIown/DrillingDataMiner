package com.ddm.mapper;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ddm.entity.MenuEntity;
import com.ddm.entity.RoleEntity;
import com.ddm.entity.RolesMenusEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.LinkedHashSet;
import java.util.Set;

@Mapper
public interface RolesMenusMapper extends BaseMapper<RolesMenusEntity> {


    @Select({"<script>",
            "SELECT m.* FROM sys_menu m, sys_roles_menus r WHERE " +
            "m.id = r.menu_id AND r.role_id IN <foreach item='item' collection='roleIds' " +
            "open='(' separator=',' close=')'> #{item} </foreach> AND type != #{type} order by m.sort asc",
            "</script>"})
    LinkedHashSet<MenuEntity> findByRoleIdsAndTypeNot(@Param("roleIds") Set<Long> roleIds, @Param("type") int type);


    @Select(value = "select m2.* from sys_role r join sys_roles_menus rm on r.id = rm.role_id join sys_menu m2 on rm.menu_id = m2.id where r.id = #{role_id}")
    Set<MenuEntity> getMenus(@Param("role_id") Long role_id);
}
