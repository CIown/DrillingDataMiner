package com.ddm.controller.well;

import com.ddm.common.DDMResponse;
import com.ddm.service.IWellInfoByWellNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/wellInfoByWellName")
public class WellInfoByWellNameController {
    @Autowired
    private IWellInfoByWellNameService service;

    @GetMapping("all")
    public ResponseEntity all() {
        List entities = service.list();
        return DDMResponse.success(entities);
    }
}
