package com.ddm.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("SYS_DICT_DETAIL")
public class StatusDictionaryDetailEntity {
    @TableId
    private long id;
    private String label;
    private String value;
    private String sort;
    private long dict_id;
    private LocalDateTime create_time;
}