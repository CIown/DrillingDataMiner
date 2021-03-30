package com.ddm.controller.system.privilege;

import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.ddm.common.DDMResponse;
import com.ddm.entity.RolesDepartmentEntity;
import com.ddm.service.IRolesDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/system/role_dept")
public class RolesDepartmentController {
    @Autowired
    private IRolesDepartmentService service;

    @GetMapping("/many")
    public ResponseEntity many(@RequestParam(name = "role_id") long roleId) {
        QueryChainWrapper<RolesDepartmentEntity> query = service.query();
        return DDMResponse.success(query.eq("role_id", roleId).list());
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody List<RolesDepartmentEntity> list) {
        return service.saveOrUpdateBatch(list) ? DDMResponse.success() : DDMResponse.failure();
    }

    @GetMapping("/one")
    public ResponseEntity one(@RequestParam(name = "role_id") long roleId,
                              @RequestParam(name = "dept_id") long deptId) {
        QueryChainWrapper<RolesDepartmentEntity> query = service.query();

        HashMap<String, Long> params = new HashMap<String, Long>();
        params.put("role_id", roleId);
        params.put("dept_id", deptId);

        return DDMResponse.success(query.allEq(params).one());

    }
}
