package com.ddm.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "SYS_ROLES_DEPTS", resultMap = "detailedRolesDepartment")
public class RolesDepartmentEntity {
    private long role_id;
    private long dept_id;
}
