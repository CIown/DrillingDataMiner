package com.ddm.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("SYS_COLUMN_CONFIG")
public class ColumnConfigEntity {
    @TableId
    private long id;
    private String table_name;
    private String column_name;
    private String column_type;
    private String dict_name;
    private String extra;
    private boolean form_show;
    private String form_type;
    private String key_type;
    private boolean list_show;
    private boolean not_null;
    private String query_type;
    private String remark;
    private String date_annotation;
}
