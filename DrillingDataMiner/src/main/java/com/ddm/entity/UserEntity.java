package com.ddm.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("IPA_USER")
public class UserEntity {
    @TableId
    private long id;
    private long avatar_id;
    private String email;
    private boolean enabled;
    private String password;
    private String username;
    private long dept_id;
    private String phone;
    private long job_id;
    private LocalDateTime create_time;
    private LocalDateTime last_password_reset_time;
    private String nick_name;
    private String sex;
}
