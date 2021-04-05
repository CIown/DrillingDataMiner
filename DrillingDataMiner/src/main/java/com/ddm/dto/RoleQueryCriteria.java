package com.ddm.dto;

import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
public class RoleQueryCriteria {
    private String blurry;

    private List<Timestamp> createTime;
}
