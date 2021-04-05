package com.ddm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ddm.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {

    @Select("select u.*,r.name as role_name, r.remark, r.data_scope, r.level, r.create_time as role_create_time, r.permission,\n" +
            "j.name as job_name, j.enabled as job_enabled, j.sort, j.create_time as job_create_time,d.name as dept_name, d.pid, d.enabled as dept_enabled, d.create_time as dept_create_time \n" +
            "from sys_user u join sys_users_roles ur on u.id = ur.user_id join sys_role r on ur.role_id = r.id\n" +
            "join sys_job j on u.job_id = j.id join sys_dept d on u.dept_id = d.id where u.username = #{username}")
    @ResultMap("detailedUserExt")
    UserEntity findByName(@Param("username") String username);
}
