package com.ddm.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Data
@Getter
@Setter
public class UserDto extends BaseDTO implements Serializable {

    private Long id;

    private Set<RoleSmallDto> roles;

    private Set<JobSmallDto> jobs;

    private DeptSmallDto dept;

    private Long deptId;

    private String username;

    private String nickName;

    private String email;

    private String phone;

    private String sex;

    private String avatarName;

    private String avatarPath;

    @JSONField(serialize = false)
    private String password;

    private Boolean enabled;

    @JSONField(serialize = false)
    private Boolean isAdmin = false;

    private Date pwdResetTime;

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", roles=" + roles +
                ", jobs=" + jobs +
                ", dept=" + dept +
                ", deptId=" + deptId +
                ", username='" + username + '\'' +
                ", nickName='" + nickName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", sex='" + sex + '\'' +
                ", avatarName='" + avatarName + '\'' +
                ", avatarPath='" + avatarPath + '\'' +
                ", password='" + password + '\'' +
                ", enabled=" + enabled +
                ", isAdmin=" + isAdmin +
                ", pwdResetTime=" + pwdResetTime +
                '}';
    }
}
