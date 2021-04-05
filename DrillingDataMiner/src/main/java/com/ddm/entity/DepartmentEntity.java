package com.ddm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("SYS_DEPT")
public class DepartmentEntity {
    @TableId
    private long id;
    private String name;
    private long pid;
    private boolean enabled;
    private LocalDateTime create_time;
}
