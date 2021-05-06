package com.ddm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("\"V_DDM_WellInfoByWellName\"")
public class WellInfoByWellNameEntity {
    @TableField("\"WellName\"")
    private String wellName;
    @TableField("\"WellTyp1\"")
    private String wellTyp1;
    @TableField("\"WellConfig\"")
    private String wellConfig;
    @TableField("\"FieldName\"")
    private String fieldName;
    @TableField("\"UTMx\"")
    private float uTMx;
    @TableField("\"UTMy\"")
    private float uTMy;
    @TableField("\"WaterDepth\"")
    private float waterDepth;
    @TableField("\"UserNum1\"")
    private float userNum1;
    @TableField("\"FormName\"")
    private String formName;
    @TableField("\"DepthDrillingTop\"")
    private float depthDrillingTop;
    @TableField("\"DepthDrillingBtm\"")
    private float depthDrillingBtm;
    @TableField("\"DepthFinalTop\"")
    private float depthFinalTop;
    @TableField("\"DepthFinalBtm\"")
    private float depthFinalBtm;
    @TableField("\"Com\"")
    private String com;
    @TableField("\"DesLithology\"")
    private String desLithology;
    @TableField("dwsdes")
    private String dwsdes;
    @TableField("\"Sz\"")
    private float sz;
    @TableField("\"DepthTopActual\"")
    private float depthTopActual;
    @TableField("\"DepthBtmActual\"")
    private float depthBtmActual;
    @TableField("\"IDRecWellbore\"")
    private String idRecWellbore;
    @TableField("djpmdes")
    private String djpmdes;
    @TableField("\"DepthStart\"")
    private float depthStart;
    @TableField("\"DepthEnd\"")
    private float depthEnd;
    @TableField("\"MudTyp\"")
    private String mudTyp;
    @TableField("\"DensityMin\"")
    private float densityMin;
    @TableField("\"DensityMax\"")
    private float densityMax;
    @TableField("\"FunnelViscosityMin\"")
    private float funnelViscosityMin;
    @TableField("\"FunnelViscosityMax\"")
    private float funnelViscosityMax;
    @TableField("\"YieldPtMin\"")
    private float yieldPtMin;
    @TableField("\"YieldPtMax\"")
    private float yieldPtMax;
}
