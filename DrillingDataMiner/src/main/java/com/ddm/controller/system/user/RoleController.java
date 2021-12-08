package com.ddm.controller.system.user;

import com.ddm.common.DDMResponse;
import com.ddm.entity.MenuEntity;
import com.ddm.entity.RoleEntity;
import com.ddm.service.IMenuService;
import com.ddm.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RoleController {
    @Autowired
    private IRoleService service;

    @GetMapping("/all")
    public ResponseEntity all() {
        return DDMResponse.success(service.list());
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody List<RoleEntity> list) {
        return service.saveOrUpdateBatch(list) ? DDMResponse.success() : DDMResponse.failure();
    }
}
