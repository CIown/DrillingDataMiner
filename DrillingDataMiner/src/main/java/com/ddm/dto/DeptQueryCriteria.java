package com.ddm.dto;

import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
public class DeptQueryCriteria{

    private String name;

    private Boolean enabled;

    private Long pid;

    private Boolean pidIsNull;

    private List<Timestamp> createTime;
}