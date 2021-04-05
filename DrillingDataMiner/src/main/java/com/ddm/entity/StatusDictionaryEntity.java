package com.ddm.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("SYS_DICT")
public class StatusDictionaryEntity {
    @TableId
    private long id;
    private String name;
    private String remark;
    private LocalDateTime create_time;
}
