package com.ddm.controller.system.user;

import com.ddm.common.DDMResponse;
import com.ddm.entity.DepartmentEntity;
import com.ddm.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dept")
public class DepartmentController {
    @Autowired
    private IDepartmentService service;

    @GetMapping
    public ResponseEntity all() {
        return DDMResponse.success(service.list());
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody List<DepartmentEntity> list) {
        return service.saveOrUpdateBatch(list) ? DDMResponse.success() : DDMResponse.failure();
    }
}
