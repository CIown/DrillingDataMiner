package com.ddm.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("SYS_LOG")
public class LogEntity {
    @TableId
    private long id;
    private LocalDateTime create_time;
    private String ddescription;
    private String exception_detail;
    private String log_type;
    private String method;
    private String params;
    private String request_ip;
    private LocalDateTime time;
    private String username;
    private String address;
    private String browser;
}
