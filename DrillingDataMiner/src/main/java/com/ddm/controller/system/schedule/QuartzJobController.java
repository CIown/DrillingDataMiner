package com.ddm.controller.system.schedule;

import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.ddm.common.DDMResponse;
import com.ddm.entity.QuartzJobEntity;
import com.ddm.entity.UsersRolesEntity;
import com.ddm.entity.VisitsEntity;
import com.ddm.service.IQuartzJobService;
import com.ddm.service.IVisitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/system/quartz_job")
public class QuartzJobController {
    @Autowired
    private IQuartzJobService service;

    @GetMapping("/all")
    public ResponseEntity all() {
        return DDMResponse.success(service.list());
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody List<QuartzJobEntity> list) {
        return service.saveOrUpdateBatch(list) ? DDMResponse.success() : DDMResponse.failure();
    }

    @GetMapping("/one")
    public ResponseEntity one(@RequestParam(name = "quartz_job_id") long quartz_job_id) {
        QueryChainWrapper<QuartzJobEntity> query = service.query();

        return DDMResponse.success(query.eq("id", quartz_job_id));
    }
}
