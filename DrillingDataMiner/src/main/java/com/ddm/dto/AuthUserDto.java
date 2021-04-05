package com.ddm.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class AuthUserDto {

    private String username;

    private String password;

    private String code;

    private String uuid = "";
}
