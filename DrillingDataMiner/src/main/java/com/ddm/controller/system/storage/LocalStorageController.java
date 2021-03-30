package com.ddm.controller.system.storage;

import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.ddm.common.DDMResponse;
import com.ddm.entity.LocalStorageEntity;
import com.ddm.service.ILocalStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/local_storage")
public class LocalStorageController {

    @Autowired
    private ILocalStorageService service;

    @GetMapping("/all")
    public ResponseEntity all() {
        return DDMResponse.success(service.list());
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody List<LocalStorageEntity> list) {
        QueryChainWrapper<LocalStorageEntity> query = service.query();

        return service.saveOrUpdateBatch(list) ? DDMResponse.success() : DDMResponse.failure();
    }
}
