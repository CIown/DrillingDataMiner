package com.ddm.controller.well;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.ddm.common.DDMResponse;
import com.ddm.entity.WellHeaderOverviewEntity;
import com.ddm.service.IWellHeaderOverviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/StatisticsWellPosition")
public class WellPositionController {
    @Autowired
    IWellHeaderOverviewService service;

    @GetMapping("/all")
    public ResponseEntity all() {
        List entities = service.list();
        return DDMResponse.success(entities);
    }

    @GetMapping("/one")
    public ResponseEntity one(@RequestParam(value = "field_name", required = true) String fieldName,
                              @RequestParam(value = "well_name", required = true) String wellName
    )
    {
        QueryWrapper<WellHeaderOverviewEntity> query = new QueryWrapper<>();
        Map<String, String> params = new HashMap<>();
        params.put("\"FieldName\"", fieldName);
        params.put("\"WellName\"", wellName);
        query.allEq(params);

        return DDMResponse.success(service.list(query));
    }

}
