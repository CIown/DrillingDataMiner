package com.ddm.controller.well;

import com.ddm.common.DDMResponse;
import com.ddm.entity.WellDrillbitUsageEntity;
import com.ddm.form.DrillbitUsageForm;
import com.ddm.service.IWellDrillbitUsageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/getData/wellDrillbitUsage")
public class WellDrillbitUsageController {
    @Autowired
    private IWellDrillbitUsageService service;

    @GetMapping("all")
    public ResponseEntity all(){
        List entities = service.list();
        System.out.println(entities);
        return DDMResponse.success(entities);
    }


    @GetMapping("/count")
    public ResponseEntity count()
    {
        return DDMResponse.success(service.count());
    }

    @GetMapping("page")
    public ResponseEntity page(@RequestParam(value = "page", required = true) Integer page,
                              @RequestParam(value = "size", required = true) Integer size){
//        List entities = service.list();
        List entities = service.getPageResult(page,size);
        return DDMResponse.success(entities);
    }

    @PostMapping("created")
    public ResponseEntity created(@RequestBody DrillbitUsageForm drillbitUsageForm ){
        System.out.println(drillbitUsageForm);
        service.insert(drillbitUsageForm);
        return DDMResponse.success();
    }

    @PostMapping("update")
    public ResponseEntity update(@RequestBody WellDrillbitUsageEntity wellDrillbitUsageEntity ){
        System.out.println(wellDrillbitUsageEntity);
        service.updateById(wellDrillbitUsageEntity);
        return DDMResponse.success();
    }

    @DeleteMapping ("delete")
    public ResponseEntity update(@RequestParam(value = "id", required = true) Long id ){
        System.out.println(id);
        service.removeById(id);
        return DDMResponse.success();
    }
}
