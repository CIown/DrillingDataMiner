package com.ddm.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("IPA_MENU")
public class MenuEntity {
    @TableId
    private long id;
    private boolean i_frame;
    private String name;
    private String component;
    private long pid;
    private long sort;
    private String icon;
    private String path;
    private boolean cache;
    private boolean hidden;
    private String component_name;
    private LocalDateTime create_time;
    private String permission;
    private int type;
}
