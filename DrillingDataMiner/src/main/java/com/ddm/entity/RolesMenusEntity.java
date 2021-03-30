package com.sap.xian.dev.support.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "IPA_ROLES_MENUS", resultMap = "detailedRolesMenus")
public class RolesMenusEntity {
    private long menu_id;
    private long role_id;
}
