package com.ddm.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("IPA_VERIFICATION_CODE")
public class VerificationCodeEntity {
    @TableId
    private long id;
    private String code;
    private LocalDateTime create_time;
    private boolean status;
    private String type;
    private String value;
    private String scenes;
}
