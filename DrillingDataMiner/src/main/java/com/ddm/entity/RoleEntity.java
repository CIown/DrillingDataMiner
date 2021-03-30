package com.ddm.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("IPA_ROLE")
public class RoleEntity {
    @TableId
    private long id;
    private String name;
    private String remark;
    private String data_scope;
    private int level;
    private LocalDateTime create_time;
    private String permission;
}
