package com.ddm.controller.system.privilege;

import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.ddm.common.DDMResponse;
import com.ddm.entity.RolesMenusEntity;
import com.ddm.service.IRolesMenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/system/role_menu")
public class RolesMenusController {
    @Autowired
    private IRolesMenusService service;

    @GetMapping("/many")
    public ResponseEntity many(@RequestParam(name = "role_id") long roleId) {
        QueryChainWrapper<RolesMenusEntity> query = service.query();
        return DDMResponse.success(query.eq("role_id", roleId));
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody List<RolesMenusEntity> list) {
        return service.saveOrUpdateBatch(list) ? DDMResponse.success() : DDMResponse.failure();
    }

    @GetMapping("/one")
    public ResponseEntity one(@RequestParam(name = "role_id") long roleId,
                              @RequestParam(name = "menu_id") long deptId) {
        QueryChainWrapper<RolesMenusEntity> query = service.query();
        HashMap<String, Long> params = new HashMap<>();
        params.put("role_id", roleId);
        params.put("dept_id", deptId);

        return DDMResponse.success(query.allEq(params).one());
    }
}
