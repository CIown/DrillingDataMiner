package com.ddm.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("IPA_USER_AVATAR")
public class UserAvatarEntity {
    @TableId
    private long id;
    private String real_name;
    private String path;
    private String size;
    private LocalDateTime create_time;
}
