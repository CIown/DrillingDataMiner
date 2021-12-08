package com.ddm.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@TableName("SYS_USER")
public class UserEntity {
    @TableId
    private Long id;
    private Long avatarId;
    private String email;
    private boolean enabled;
    private String password;
    private String username;
    private String phone;
    private Timestamp createTime;
    private Timestamp lastPasswordResetTime;
    private String nickName;
    private String sex;
    private Set<RoleEntity> roles;
    private Set<JobEntity> jobs;
    private DepartmentEntity dept;
    private Boolean isAdmin;
}
