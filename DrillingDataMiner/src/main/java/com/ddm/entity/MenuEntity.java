package com.ddm.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@TableName("SYS_MENU")
public class MenuEntity {
    @TableId
    private Long id;

    @JSONField(serialize = false)
    private Set<RoleEntity> roles;

    private String title;

    @TableField("name")
    private String componentName;

    @TableField("sort")
    private Integer menuSort = 999;

    private String component;

    private String path;

    private Integer type;

    private String permission;

    private String icon;

    private Boolean cache;

    private Boolean hidden;

    private Long pid;

    private Integer subCount = 0;

    @TableField("i_frame")
    private Boolean iFrame;
}
