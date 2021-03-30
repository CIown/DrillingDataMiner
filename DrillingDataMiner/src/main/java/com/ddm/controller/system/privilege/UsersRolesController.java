package com.ddm.controller.system.privilege;

import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.ddm.common.DDMResponse;
import com.ddm.entity.RolesMenusEntity;
import com.ddm.entity.UsersRolesEntity;
import com.ddm.service.IRolesMenusService;
import com.ddm.service.IUsersRolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/system/user_role")
public class UsersRolesController {
    @Autowired
    private IUsersRolesService service;

    @GetMapping("/many")
    public ResponseEntity many(@RequestParam(name = "user_id") long userId) {
        QueryChainWrapper<UsersRolesEntity> query = service.query();
        return DDMResponse.success(query.eq("user_id", userId));
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody List<UsersRolesEntity> list) {
        return service.saveOrUpdateBatch(list) ? DDMResponse.success() : DDMResponse.failure();
    }

    @GetMapping("/one")
    public ResponseEntity one(@RequestParam(name = "user_id") long userId,
                              @RequestParam(name = "role_id") long roleId) {
        QueryChainWrapper<UsersRolesEntity> query = service.query();
        HashMap<String, Long> params = new HashMap<>();
        params.put("role_id", roleId);
        params.put("user_id", userId);

        return DDMResponse.success(query.allEq(params).one());
    }
}
