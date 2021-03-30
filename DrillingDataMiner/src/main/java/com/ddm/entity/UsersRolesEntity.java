package com.sap.xian.dev.support.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "IPA_USERS_ROLES", resultMap = "detailedUsersRoles")
public class UsersRolesEntity {
    private long user_id;
    private long role_id;
}
