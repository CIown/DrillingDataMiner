package com.ddm.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "SYS_ROLES_MENUS", resultMap = "detailedRolesMenus")
public class RolesMenusEntity {
    private long menu_id;
    private long role_id;
}
