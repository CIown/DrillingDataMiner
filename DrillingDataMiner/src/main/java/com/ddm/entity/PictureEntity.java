package com.ddm.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@TableName("IPA_PICTURE")
public class PictureEntity {
    @TableId
    private long id;
    private LocalDateTime create_time;
    private String delete_url;
    private String filename;
    private String height;
    private String size;
    private String url;
    private String username;
    private String width;
    private String md5code;
}
