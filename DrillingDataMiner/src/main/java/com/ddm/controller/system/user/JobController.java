package com.ddm.controller.system.user;

import com.ddm.common.DDMResponse;
import com.ddm.entity.DepartmentEntity;
import com.ddm.entity.JobEntity;
import com.ddm.service.IDepartmentService;
import com.ddm.service.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/job")
public class JobController {

    @Autowired
    private IJobService service;

    @GetMapping
    public ResponseEntity all() {
        return DDMResponse.success(service.list());
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody List<JobEntity> list) {
        return service.saveOrUpdateBatch(list) ? DDMResponse.success() : DDMResponse.failure();
    }
}
