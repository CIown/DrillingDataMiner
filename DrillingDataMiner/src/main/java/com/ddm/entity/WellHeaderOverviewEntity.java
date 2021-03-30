package com.ddm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("\"V_DDM_WellInfoOverview\"")
public class WellHeaderOverviewEntity {
    @TableId("\"idwell\"")
    private String idwell;
    @TableField("\"Agent\"")
    private String agent;
    @TableField("\"Area\"")
    private String area;
    @TableField("\"Basin\"")
    private String basin;
    @TableField("\"BasinCode\"")
    private String basinCode;
    @TableField("\"Com\"")
    private String com;
    @TableField("\"Country\"")
    private String country;
    @TableField("\"County\"")
    private String county;
    @TableField("\"CurrentWellStatus1\"")
    private String currentWellStatus1;
    @TableField("\"CurrentWellStatus2\"")
    private String currentWellStatus2;
    @TableField("\"DirectionsToWell\"")
    private String directionsToWell;
    @TableField("\"District\"")
    private String district;
    @TableField("\"Division\"")
    private String division;
    @TableField("\"DtTmAbandon\"")
    private String dtTmAbandon;
    @TableField("\"DtTmFirstProd\"")
    private String dtTmFirstProd;
    @TableField("\"DtTmRR\"")
    private String dtTmRR;
    @TableField("\"DtTmSpud\"")
    private String dtTmSpud;
    @TableField("\"DtTmWellClass\"")
    private String dtTmWellClass;
    @TableField("\"DtTmWellLic\"")
    private String dtTmWellLic;
    @TableField("\"ElvCasFlange\"")
    private float elvCasFlange;
    @TableField("\"ElvGround\"")
    private float elvGround;
    @TableField("\"ElvMudLine\"")
    private float elvMudLine;
    @TableField("\"ElvOrigKB\"")
    private float elvOrigKB;
    @TableField("\"ElvTubHead\"")
    private float elvTubHead;
    @TableField("\"EnvironmentSensitive\"")
    private boolean environmentSensitive;
    @TableField("\"EWDist\"")
    private float eWDist;
    @TableField("\"EWFlag\"")
    private String eWFlag;
    @TableField("\"FieldCode\"")
    private String fieldCode;
    @TableField("\"FieldName\"")
    private String fieldName;
    @TableField("\"FieldOffice\"")
    private String fieldOffice;
    @TableField("\"GovAuthority\"")
    private String govAuthority;
    @TableField("\"HiH2S\"")
    private boolean hiH2S;
    @TableField("\"HiSITP\"")
    private boolean hiSITP;
    @TableField("\"IDRecElvHistory\"")
    private String iDRecElvHistory;
    @TableField("\"IDRecElvHistoryTK\"")
    private String iDRecElvHistoryTK;
    @TableField("\"IDRecProblem\"")
    private String iDRecProblem;
    @TableField("\"IDRecProblemTK\"")
    private String iDRecProblemTK;
    @TableField("\"IDRecSite\"")
    private String iDRecSite;
    @TableField("\"IDRecSiteTK\"")
    private String iDRecSiteTK;
    @TableField("\"Latitude\"")
    private float latitude;
    @TableField("\"LatLongDatum\"")
    private String latLongDatum;
    @TableField("\"LatLongSource\"")
    private String latLongSource;
    @TableField("\"Lease\"")
    private String lease;
    @TableField("\"LeaseCode\"")
    private String leaseCode;
    @TableField("\"LegalSurveyLoc\"")
    private String legalSurveyLoc;
    @TableField("\"LegalSurveySubTyp\"")
    private String legalSurveySubTyp;
    @TableField("\"LegalSurveyTyp\"")
    private String legalSurveyTyp;
    @TableField("\"LocationNote\"")
    private String locationNote;
    @TableField("\"LocationRef\"")
    private String locationRef;
    @TableField("\"LocationSensitive\"")
    private boolean locationSensitive;
    @TableField("\"LocationTyp\"")
    private String locationTyp;
    @TableField("\"Longitude\"")
    private float longitude;
    @TableField("\"NSDist\"")
    private float nSDist;
    @TableField("\"NSFlag\"")
    private String nSFlag;
    @TableField("\"Operated\"")
    private boolean operated;
    @TableField("\"Operator\"")
    private String operator;
    @TableField("\"OperatorCode\"")
    private String operatorCode;
    @TableField("\"Platform\"")
    private String platform;
    @TableField("\"ProblemFlag\"")
    private boolean problemFlag;
    @TableField("\"RiskClass\"")
    private String riskClass;
    @TableField("\"Slot\"")
    private String slot;
    @TableField("\"StateProv\"")
    private String stateProv;
    @TableField("\"SurfaceRights\"")
    private String surfaceRights;
    @TableField("\"TownDist\"")
    private float townDist;
    @TableField("\"TownFlag\"")
    private String townFlag;
    @TableField("\"TownName\"")
    private String townName;
    @TableField("\"TownStateProv\"")
    private String townStateProv;
    @TableField("\"UserBoolean1\"")
    private boolean userBoolean1;
    @TableField("\"UserBoolean2\"")
    private boolean userBoolean2;
    @TableField("\"UserBoolean3\"")
    private boolean userBoolean3;
    @TableField("\"UserBoolean4\"")
    private boolean userBoolean4;
    @TableField("\"UserBoolean5\"")
    private boolean userBoolean5;
    @TableField("\"UserDtTm1\"")
    private String userDtTm1;
    @TableField("\"UserDtTm2\"")
    private String userDtTm2;
    @TableField("\"UserDtTm3\"")
    private String userDtTm3;
    @TableField("\"UserDtTm4\"")
    private String userDtTm4;
    @TableField("\"UserDtTm5\"")
    private String userDtTm5;
    @TableField("\"UserNum1\"")
    private float userNum1;
    @TableField("\"UserNum2\"")
    private float userNum2;
    @TableField("\"UserNum3\"")
    private float userNum3;
    @TableField("\"UserNum4\"")
    private float userNum4;
    @TableField("\"UserNum5\"")
    private float userNum5;
    @TableField("\"UserTxt1\"")
    private String userTxt1;
    @TableField("\"UserTxt10\"")
    private String userTxt10;
    @TableField("\"UserTxt2\"")
    private String userTxt2;
    @TableField("\"UserTxt3\"")
    private String userTxt3;
    @TableField("\"UserTxt4\"")
    private String userTxt4;
    @TableField("\"UserTxt5\"")
    private String userTxt5;
    @TableField("\"UserTxt6\"")
    private String userTxt6;
    @TableField("\"UserTxt7\"")
    private String userTxt7;
    @TableField("\"UserTxt8\"")
    private String userTxt8;
    @TableField("\"UserTxt9\"")
    private String userTxt9;
    @TableField("\"UTMGridZone\"")
    private int uTMGridZone;
    @TableField("\"UTMSource\"")
    private String uTMSource;
    @TableField("\"UTMx\"")
    private float uTMx;
    @TableField("\"UTMy\"")
    private float uTMy;
    @TableField("\"WaterDepth\"")
    private float waterDepth;
    @TableField("\"WellClass\"")
    private String wellClass;
    @TableField("\"WellConfig\"")
    private String wellConfig;
    @TableField("\"WellIDA\"")
    private String wellIDA;
    @TableField("\"WellIDB\"")
    private String wellIDB;
    @TableField("\"WellIDC\"")
    private String wellIDC;
    @TableField("\"WellIDD\"")
    private String wellIDD;
    @TableField("\"WellIDE\"")
    private String wellIDE;
    @TableField("\"WellLicensee\"")
    private String wellLicensee;
    @TableField("\"WellLicenseNo\"")
    private String wellLicenseNo;
    @TableField("\"WellName\"")
    private String wellName;
    @TableField("\"WellTyp1\"")
    private String wellTyp1;
    @TableField("\"WellTyp2\"")
    private String wellTyp2;
    @TableField("\"WorkingInt\"")
    private float workingInt;
    @TableField("\"sysLockMeUI\"")
    private boolean sysLockMeUI;
    @TableField("\"sysLockChildrenUI\"")
    private boolean sysLockChildrenUI;
    @TableField("\"sysLockMe\"")
    private boolean sysLockMe;
    @TableField("\"sysLockChildren\"")
    private boolean sysLockChildren;
    @TableField("\"sysLockDate\"")
    private String sysLockDate;
    @TableField("\"sysModDate\"")
    private String sysModDate;
    @TableField("\"sysModUser\"")
    private String sysModUser;
    @TableField("\"sysCreateDate\"")
    private String sysCreateDate;
    @TableField("\"sysCreateUser\"")
    private String sysCreateUser;
    @TableField("\"sysTag\"")
    private String sysTag;
    @TableField("\"sysModDateDB\"")
    private String sysModDateDB;
    @TableField("\"sysModUserDB\"")
    private String sysModUserDB;
    @TableField("\"sysSecurityTyp\"")
    private String sysSecurityTyp;
    @TableField("\"sysLockDateMaster\"")
    private String sysLockDateMaster;
    @TableField("\"MD\"")
    private float mD;
    @TableField("\"WellConstructionDuration\"")
    private float wellConstructionDuration;
    @TableField("\"DrillingDuration\"")
    private float drillingDuration;
}
