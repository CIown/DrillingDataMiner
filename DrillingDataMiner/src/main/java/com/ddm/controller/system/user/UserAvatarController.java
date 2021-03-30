package com.ddm.controller.system.user;

import com.ddm.common.DDMResponse;
import com.ddm.entity.StatusDictionaryDetailEntity;
import com.ddm.entity.UserAvatarEntity;
import com.ddm.service.IStatusDictionaryDetailService;
import com.ddm.service.IUserAvatarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/user_avatar")
public class UserAvatarController {
    @Autowired
    private IUserAvatarService service;

    @GetMapping("/all")
    public ResponseEntity all() {
        return DDMResponse.success(service.list());
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody List<UserAvatarEntity> list) {
        return service.saveOrUpdateBatch(list) ? DDMResponse.success() : DDMResponse.failure();
    }
}
