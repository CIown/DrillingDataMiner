package com.ddm.controller.system.user;

import com.ddm.common.DDMResponse;
import com.ddm.common.exception.BadRequestException;
import com.ddm.common.utils.RsaProperties;
import com.ddm.common.utils.RsaUtils;
import com.ddm.common.utils.SecurityUtils;
import com.ddm.dto.RoleSmallDto;
import com.ddm.dto.UserDto;
import com.ddm.entity.RoleEntity;
import com.ddm.entity.UserEntity;
import com.ddm.entity.vo.UserPassVo;
import com.ddm.service.IRoleService;
import com.ddm.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.management.relation.Role;
import javax.servlet.http.HttpServletRequest;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
//@RequestMapping("/system/user")
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final IUserService service;
    private final PasswordEncoder passwordEncoder;
    private final IRoleService roleService;


    //    @ApiOperation("查询用户")
    @GetMapping
    @PreAuthorize("@el.check('user:list')")
    public ResponseEntity page(@RequestParam(value = "page", required = false) Integer page,
                              @RequestParam(value = "size", required = false) Integer size) {
        if(page == null && size == null){
            return DDMResponse.success(service.findAll());
        }
        return DDMResponse.success(service.findAll(page,size));
    }

    @PostMapping("/download")
    public ResponseEntity save(@RequestBody List<UserEntity> list) {
        return service.saveOrUpdateBatch(list) ? DDMResponse.success() : DDMResponse.failure();
//        return DDMResponse.success(service.findAll());
    }


    @PostMapping
    @PreAuthorize("@el.check('user:add')")
    public ResponseEntity<Object> create(@Validated @RequestBody UserEntity resources){
//        checkLevel(resources);
        // 默认密码 123456
        resources.setPassword(passwordEncoder.encode("123456"));
        System.out.println(resources.getRoles());

        service.create(resources);
        return DDMResponse.success();
    }

    @PutMapping
    @PreAuthorize("@el.check('user:edit')")
    public ResponseEntity update(@RequestBody UserEntity resources) throws Exception {
//        checkLevel(resources);
        System.out.println("updatacontroller");
        service.updateUser(resources);
        return DDMResponse.success();
    }

    @PutMapping(value = "/center")
    public ResponseEntity<Object> center(@RequestBody UserEntity resources){
        if(!resources.getId().equals(SecurityUtils.getCurrentUserId())){
            throw new BadRequestException("不能修改他人资料");
        }
        service.updateCenter(resources);
        return DDMResponse.success();
    }

    @DeleteMapping
    @PreAuthorize("@el.check('user:del')")
    public ResponseEntity delete(@RequestBody Set<Long> ids){
        for (Long id : ids) {

            Integer currentLevel =  Collections.min(roleService.findByUsersId(SecurityUtils.getCurrentUserId()).stream().map(RoleSmallDto::getLevel).collect(Collectors.toList()));

            Integer optLevel =  Collections.min(roleService.findByUsersId(id).stream().map(RoleSmallDto::getLevel).collect(Collectors.toList()));

            if (currentLevel > optLevel) {
                throw new BadRequestException("角色权限不足，不能删除：" + service.findById(id).getUsername());
            }
        }
        System.out.println("ids:");
        System.out.println(ids);
        service.deleteIds(ids);
        return DDMResponse.success();
    }

    @PostMapping(value = "/updatePass")
    public ResponseEntity<Object> updatePass(@RequestBody UserPassVo passVo) throws Exception {
        String oldPass = RsaUtils.decryptByPrivateKey(RsaProperties.privateKey,passVo.getOldPass());
        String newPass = RsaUtils.decryptByPrivateKey(RsaProperties.privateKey,passVo.getNewPass());
        UserDto user = service.findByName(SecurityUtils.getCurrentUsername());
        System.out.println("1");
        if(!passwordEncoder.matches(oldPass, user.getPassword())){
            throw new BadRequestException("修改失败，旧密码错误");
        }
        System.out.println("2");
        if(passwordEncoder.matches(newPass, user.getPassword())){
            throw new BadRequestException("新密码不能与旧密码相同");
        }
        System.out.println("3");
        service.updatePass(user.getUsername(),passwordEncoder.encode(newPass));
        System.out.println("4");
        return DDMResponse.success();
    }
    /**
     * 如果当前用户的角色级别低于创建用户的角色级别，则抛出权限不足的错误
     * @param resources /
     */
//    private void checkLevel(UserEntity resources) {
//        Integer currentLevel =  Collections.min(roleService.findByUsersId(SecurityUtils.getCurrentUserId()).stream().map(RoleSmallDto::getLevel).collect(Collectors.toList()));
//        Integer optLevel = roleService.findByRoles(resources.getRoles());
//        if (currentLevel > optLevel) {
//            throw new BadRequestException("角色权限不足");
//        }
//    }
}
