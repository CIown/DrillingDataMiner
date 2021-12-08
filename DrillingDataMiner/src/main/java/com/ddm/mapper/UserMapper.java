package com.ddm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ddm.entity.UserEntity;
import org.apache.ibatis.annotations.*;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
//      没去除部门
//    @Select("select u.*,r.name as role_name, r.remark, r.data_scope, r.level, r.create_time as role_create_time, r.permission,\n" +
//            "j.name as job_name, j.enabled as job_enabled, j.sort, j.create_time as job_create_time,d.name as dept_name, d.pid, d.enabled as dept_enabled, d.create_time as dept_create_time \n" +
//            "from sys_user u join sys_users_roles ur on u.id = ur.user_id join sys_role r on ur.role_id = r.id\n" +
//            "join sys_job j on u.job_id = j.id join sys_dept d on u.dept_id = d.id")

//    去除了部门
    @Select("select u.*,r.id as role_id,r.name as role_name, r.remark, r.data_scope, r.level, r.create_time as role_create_time, r.permission,\n" +
            "j.id as job_id,j.name as job_name, j.enabled as job_enabled, j.sort, j.create_time as job_create_time\n" +
            "from sys_user u join sys_users_roles ur on u.id = ur.user_id join sys_role r on ur.role_id = r.id\n" +
            "join sys_job j on u.job_id = j.id where u.id = #{id}")
    @ResultMap("detailedUserExt")
    UserEntity findById(@Param("id") Long id);
    //    去掉了部门
    @Select("select u.*,r.id as role_id,r.name as role_name, r.remark, r.data_scope, r.level, r.create_time as role_create_time, r.permission,\n" +
            "j.id as job_id,j.name as job_name, j.enabled as job_enabled, j.sort, j.create_time as job_create_time\n" +
            "from sys_user u join sys_users_roles ur on u.id = ur.user_id join sys_role r on ur.role_id = r.id\n" +
            "join sys_job j on u.job_id = j.id  where u.username = #{username}")
    @ResultMap("detailedUserExt")
    UserEntity findByName(@Param("username") String username);
    //    去掉了部门
    @Select("select u.*,r.id as role_id,r.name as role_name, r.remark, r.data_scope, r.level, r.create_time as role_create_time, r.permission,\n" +
            "j.id as job_id,j.name as job_name, j.enabled as job_enabled, j.sort, j.create_time as job_create_time\n" +
            "from sys_user u join sys_users_roles ur on u.id = ur.user_id join sys_role r on ur.role_id = r.id\n" +
            "join sys_job j on u.job_id = j.id  where u.email = #{email}")
    @ResultMap("detailedUserExt")
    UserEntity findByEmail(@Param("email") String email);
    //    去掉了部门
    @Select("select u.*,r.id as role_id,r.name as role_name, r.remark, r.data_scope, r.level, r.create_time as role_create_time, r.permission,\n" +
            "j.id as job_id,j.name as job_name, j.enabled as job_enabled, j.sort, j.create_time as job_create_time\n" +
            "from sys_user u join sys_users_roles ur on u.id = ur.user_id join sys_role r on ur.role_id = r.id\n" +
            "join sys_job j on u.job_id = j.id  where u.phone = #{phone}")
    @ResultMap("detailedUserExt")
    UserEntity findByPhone(@Param("phone") String phone);
    //    去掉了部门
    @Select("select u.*, r.id as role_id,r.name as role_name, r.remark, r.data_scope, r.level, r.create_time as role_create_time, r.permission,\n" +
            "j.id as job_id,j.name as job_name, j.enabled as job_enabled, j.sort, j.create_time as job_create_time\n" +
            "from sys_user u join sys_users_roles ur on u.id = ur.user_id join sys_role r on ur.role_id = r.id\n" +
            "join sys_job j on u.job_id = j.id ")
    @ResultMap("detailedUserExt")
    Page<UserEntity> findPage(Page<UserEntity> page);

//    去掉了部门
    @Select("select u.*,r.id as role_id,r.name as role_name, r.remark, r.data_scope, r.level, r.create_time as role_create_time, r.permission,\n" +
        "j.id as job_id,j.name as job_name, j.enabled as job_enabled, j.sort, j.create_time as job_create_time\n" +
        "from sys_user u join sys_users_roles ur on u.id = ur.user_id join sys_role r on ur.role_id = r.id\n" +
        "join sys_job j on u.job_id = j.id ")
    @ResultMap("detailedUserExt")
    List<UserEntity> findAll();

    @Options(useGeneratedKeys = true,keyProperty="resources.id", keyColumn="id")
    @Insert("insert into sys_user(email,enabled,password,username,dept_id,phone,job_id,\n" +
            "nick_name,sex,is_admin) values (#{resources.email},true,#{resources.password},#{resources.username},#{[deptId]},\n" +
            "#{resources.phone},#{[jobId]},#{resources.nickName},#{resources.sex},#{resources.isAdmin})")
    void save(@Param("resources") UserEntity resources, long deptId,long jobId);

    @Update("update sys_user set email = #{resources.email},enabled = true,password = #{resources.password}, \n" +
            "username = #{resources.username},dept_id = #{deptId},phone = #{resources.phone},job_id = #{jobId},\n" +
            "nick_name = #{resources.nickName},sex = #{resources.sex} \n" +
            "where id = #{resources.id}")
    void updateUser(@Param("resources") UserEntity resources, long deptId,long jobId);

    @Update("update sys_user set password = #{password},last_password_reset_time = #{date} where username = #{username}")
    void updatePass(@Param("username") String username, @Param("password") String password,Timestamp date);

    @Delete(value = "delete from sys_user where id = #{id}")
    void removeByIds(@Param("id") Long id);

}
