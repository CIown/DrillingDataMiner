package com.ddm.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("SYS_QUARTZ_LOG")
public class QuartzLogEntity {
    @TableId
    private long id;
    private String bean_name;
    private LocalDateTime create_time;
    private String cron_expression;
    private String exception_detail;
    private boolean is_success;
    private String job_name;
    private String method_name;
    private String params;
    private LocalDateTime time;
}
