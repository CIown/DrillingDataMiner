package com.ddm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("\"V_DDM_WellInfoByBit\"")
public class WellInfoByBitEntity {
    @TableField("\"WellName\"")
    private String wellName;
    @TableField("\"IDRec\"")
    private String idRec;
    @TableField("\"Typ\"")
    private String typ;
    @TableField("\"SzODDrill\"")
    private float szODDrill;
    @TableField("\"Make\"")
    private String make;
    @TableField("\"Model\"")
    private String model;
    @TableField("\"UsedClass\"")
    private String usedClass;
    @TableField("\"DepthDrilledStart\"")
    private float depthDrilledStart;
    @TableField("\"DtTmStart\"")
    private LocalDateTime dtTmStart;
    @TableField("\"DtTmEnd\"")
    private LocalDateTime dtTmEnd;
    @TableField("\"DepthStart\"")
    private float depthStart;
    @TableField("\"DepthEnd\"")
    private float depthEnd;
    @TableField("\"TmDrill\"")
    private float tmDrill;
    @TableField("\"TmCirc\"")
    private float tmCirc;
    @TableField("\"ROPInst\"")
    private float ropInst;
    @TableField("\"WOB\"")
    private float wOB;
    @TableField("\"RPMString\"")
    private float rpmString;
    @TableField("\"SPPDrill\"")
    private float sppDrill;
    @TableField("\"LiquidInjRate\"")
    private float liquidInjRate;
    @TableField("\"WearInner\"")
    private int wearInner;
    @TableField("\"WearOuter\"")
    private int wearOuter;
    @TableField("\"WearDull\"")
    private String wearDull;
    @TableField("\"WearLoc\"")
    private String wearLoc;
    @TableField("\"WearBearing\"")
    private String wearBearing;
    @TableField("\"WearGauge\"")
    private String wearGauge;
    @TableField("\"WearOther\"")
    private String wearOther;
    @TableField("\"WearPulled\"")
    private String wearPulled;
    @TableField("\"depthdrilledcalc\"")
    private float depthdrilledcalc;
    @TableField("\"ropcalc\"")
    private float ropcalc;
    @TableField("\"depthincalc\"")
    private float depthincalc;
    @TableField("\"depthoutcalc\"")
    private float depthoutcalc;
    @TableField("\"depthdrilledjobcalc\"")
    private float depthdrilledjobcalc;
    @TableField("\"tmdrilledjobcalc\"")
    private float tmdrilledjobcalc;
    @TableField("\"FieldName\"")
    private String fieldName;


}
