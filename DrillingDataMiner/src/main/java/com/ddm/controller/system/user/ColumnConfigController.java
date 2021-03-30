package com.ddm.controller.system.user;

import com.ddm.common.DDMResponse;
import com.ddm.entity.ColumnConfigEntity;
import com.ddm.service.IColumnConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/column_config")
public class ColumnConfigController {
    @Autowired
    private IColumnConfigService service;

    @GetMapping("/all")
    public ResponseEntity all() {
        return DDMResponse.success(service.list());
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody List<ColumnConfigEntity> list) {
        return service.saveOrUpdateBatch(list) ? DDMResponse.success() : DDMResponse.failure();
    }
}
