package com.ddm.controller.system.schedule;

import com.ddm.DevSupportApplication;
import com.ddm.common.DDMResponse;
import com.ddm.entity.QuartzLogEntity;
import com.ddm.service.IQuartzLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/quartz_log")
public class QuartzLogController {
    @Autowired
    private IQuartzLogService service;

    @GetMapping("/all")
    public ResponseEntity all() {
        return DDMResponse.success(service.list());
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody List<QuartzLogEntity> list) {
        return service.saveOrUpdateBatch(list) ? DDMResponse.success() : DDMResponse.failure();
    }
}
