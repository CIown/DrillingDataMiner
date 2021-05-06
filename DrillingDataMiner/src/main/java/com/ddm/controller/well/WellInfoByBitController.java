package com.ddm.controller.well;

import com.ddm.common.DDMResponse;
import com.ddm.service.IWellInfoByBitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/wellInfoByBit")
public class WellInfoByBitController {
    @Autowired
    private IWellInfoByBitService service;

    @GetMapping("all")
    public ResponseEntity all() {
        return DDMResponse.success(service.list());
    }
}
