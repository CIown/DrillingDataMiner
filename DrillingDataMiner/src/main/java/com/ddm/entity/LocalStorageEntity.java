package com.ddm.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("IPA_LOCAL_STORAGE")
public class LocalStorageEntity {
    @TableId
    private long id;
    private String real_name;
    private String name;
    private String suffix;
    private String path;
    private String type;
    private String size;
    private String operate;
    private LocalDateTime create_time;
}
