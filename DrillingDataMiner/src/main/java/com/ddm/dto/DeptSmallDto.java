package com.ddm.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class DeptSmallDto implements Serializable {

    private Long id;

    private String name;
}