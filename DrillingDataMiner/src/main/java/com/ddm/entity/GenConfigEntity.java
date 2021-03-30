package com.ddm.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("IPA_GEN_CONFIG")
public class GenConfigEntity {
    @TableId
    private long id;
    private String table_name;
    private String author;
    private boolean cover;
    private String module_name;
    private String pack;
    private String path;
    private String api_path;
    private String prefix;
    private String api_alias;
}
