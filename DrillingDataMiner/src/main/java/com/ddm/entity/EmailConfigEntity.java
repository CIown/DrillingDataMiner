package com.ddm.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("SYS_EMAIL_CONFIG")
@Data
public class EmailConfigEntity {
    @TableId
    private long id;
    private String from_user;
    private String host;
    private String pass;
    private String port;
    private String user;
}
