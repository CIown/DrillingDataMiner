package com.ddm.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("IPA_QUARTZ_JOB")
public class QuartzJobEntity {
    @TableId
    private long id;
    private String bean_name;
    private String cron_expression;
    private boolean is_pause;
    private String job_name;
    private String method_name;
    private String params;
    private String remark;
    private LocalDateTime create_time;
}
