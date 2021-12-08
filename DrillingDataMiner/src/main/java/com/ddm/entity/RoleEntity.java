package com.ddm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@TableName("SYS_ROLE")
public class RoleEntity {
    @TableId
    private long id;
    @TableField("name")
    private String name;
    @TableField("remark")
    private String remark;
    @TableField("data_scope")
    private String dataScope;
    @TableField("level")
    private int level;
    @TableField("create_time")
    private Timestamp createTime;
    @TableField("permission")
    private String permission;
}
