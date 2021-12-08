package com.ddm.form;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class DrillbitUsageForm {
    private String wellName;
    private String serialNumber;
    private String sizeMM;
    private String sizeInch;
    private String drillbitNumber;
    private String drillbitType;
    private String drillbitModel;
    private String drillingSectionStart;
    private String drillingSectionEnd;
    private String factory;
    private String formName;
    private String depthDrilled;
    private String tmDrilled;
    private String rop;
    private String wob;
    private String rpmString;
    private String liquidInjRate;
    private String dia;
}
