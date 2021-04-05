package com.ddm.dto;

import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
public class MenuQueryCriteria {

    private String blurry;

    private List<Timestamp> createTime;

    private Boolean pidIsNull;

    private Long pid;
}
