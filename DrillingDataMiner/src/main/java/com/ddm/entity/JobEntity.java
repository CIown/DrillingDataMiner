package com.ddm.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@TableName("SYS_JOB")
public class JobEntity {
    @TableId
    private long id;
    private String name;
    private boolean enabled;
    private long sort;
    private long deptId;
    private Timestamp createTime;
}
