package com.ddm.security.controller;

import com.ddm.service.IVerificationCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system/v_code")
public class VerificationCodeController {
    @Autowired
    private IVerificationCodeService service;

}
