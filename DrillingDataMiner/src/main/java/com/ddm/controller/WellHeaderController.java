package com.ddm.controller;

import com.ddm.common.DDMResponse;
import com.ddm.service.IWellHeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/wellheader")
public class WellHeaderController {

    @Autowired
    private IWellHeaderService service;

    @GetMapping("/list")
    public ResponseEntity list() {
        List entities = service.list();
        return DDMResponse.success(entities);
    }
}
