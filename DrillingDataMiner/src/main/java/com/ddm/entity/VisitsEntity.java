package com.ddm.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("IPA_VISITS")
public class VisitsEntity {
    @TableId
    private long id;
    private LocalDateTime create_time;
    private String date;
    private long ip_counts;
    private long pv_counts;
    private String week_day;
}
