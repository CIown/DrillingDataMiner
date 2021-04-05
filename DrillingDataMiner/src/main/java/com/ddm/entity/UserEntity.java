package com.ddm.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@TableName("SYS_USER")
public class UserEntity {
    @TableId
    private long id;
    private long avatar_id;
    private String email;
    private boolean enabled;
    private String password;
    private String username;
    private String phone;
    private LocalDateTime create_time;
    private LocalDateTime last_password_reset_time;
    private String nick_name;
    private String sex;
    private Set<RoleEntity> roles;
    private Set<JobEntity> jobs;
    private DepartmentEntity dept;
}
