package com.ddm.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "SYS_USERS_ROLES", resultMap = "detailedUsersRoles")
public class UsersRolesEntity {
    private long user_id;
    private long role_id;
}
