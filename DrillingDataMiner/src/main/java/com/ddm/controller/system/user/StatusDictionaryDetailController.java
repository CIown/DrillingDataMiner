package com.ddm.controller.system.user;

import com.ddm.common.DDMResponse;
import com.ddm.entity.StatusDictionaryDetailEntity;
import com.ddm.entity.StatusDictionaryEntity;
import com.ddm.service.IStatusDictionaryDetailService;
import com.ddm.service.IStatusDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dictDetail")
public class StatusDictionaryDetailController {

    @Autowired
    private IStatusDictionaryDetailService service;

    @GetMapping
    public ResponseEntity all() {
        return DDMResponse.success(service.list());
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody List<StatusDictionaryDetailEntity> list) {
        return service.saveOrUpdateBatch(list) ? DDMResponse.success() : DDMResponse.failure();
    }
}
