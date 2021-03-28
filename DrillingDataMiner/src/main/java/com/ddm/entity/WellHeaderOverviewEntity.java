package com.ddm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

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
    private String wellConstructionDuration;
    @TableField("\"DrillingDuration\"")
    private float drillingDuration;

    public WellHeaderOverviewEntity() {
    }

    public String getIdwell() {
        return idwell;
    }

    public void setIdwell(String idwell) {
        this.idwell = idwell;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getBasin() {
        return basin;
    }

    public void setBasin(String basin) {
        this.basin = basin;
    }

    public String getBasinCode() {
        return basinCode;
    }

    public void setBasinCode(String basinCode) {
        this.basinCode = basinCode;
    }

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCurrentWellStatus1() {
        return currentWellStatus1;
    }

    public void setCurrentWellStatus1(String currentWellStatus1) {
        this.currentWellStatus1 = currentWellStatus1;
    }

    public String getCurrentWellStatus2() {
        return currentWellStatus2;
    }

    public void setCurrentWellStatus2(String currentWellStatus2) {
        this.currentWellStatus2 = currentWellStatus2;
    }

    public String getDirectionsToWell() {
        return directionsToWell;
    }

    public void setDirectionsToWell(String directionsToWell) {
        this.directionsToWell = directionsToWell;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getDtTmAbandon() {
        return dtTmAbandon;
    }

    public void setDtTmAbandon(String dtTmAbandon) {
        this.dtTmAbandon = dtTmAbandon;
    }

    public String getDtTmFirstProd() {
        return dtTmFirstProd;
    }

    public void setDtTmFirstProd(String dtTmFirstProd) {
        this.dtTmFirstProd = dtTmFirstProd;
    }

    public String getDtTmRR() {
        return dtTmRR;
    }

    public void setDtTmRR(String dtTmRR) {
        this.dtTmRR = dtTmRR;
    }

    public String getDtTmSpud() {
        return dtTmSpud;
    }

    public void setDtTmSpud(String dtTmSpud) {
        this.dtTmSpud = dtTmSpud;
    }

    public String getDtTmWellClass() {
        return dtTmWellClass;
    }

    public void setDtTmWellClass(String dtTmWellClass) {
        this.dtTmWellClass = dtTmWellClass;
    }

    public String getDtTmWellLic() {
        return dtTmWellLic;
    }

    public void setDtTmWellLic(String dtTmWellLic) {
        this.dtTmWellLic = dtTmWellLic;
    }

    public float getElvCasFlange() {
        return elvCasFlange;
    }

    public void setElvCasFlange(float elvCasFlange) {
        this.elvCasFlange = elvCasFlange;
    }

    public float getElvGround() {
        return elvGround;
    }

    public void setElvGround(float elvGround) {
        this.elvGround = elvGround;
    }

    public float getElvMudLine() {
        return elvMudLine;
    }

    public void setElvMudLine(float elvMudLine) {
        this.elvMudLine = elvMudLine;
    }

    public float getElvOrigKB() {
        return elvOrigKB;
    }

    public void setElvOrigKB(float elvOrigKB) {
        this.elvOrigKB = elvOrigKB;
    }

    public float getElvTubHead() {
        return elvTubHead;
    }

    public void setElvTubHead(float elvTubHead) {
        this.elvTubHead = elvTubHead;
    }

    public boolean isEnvironmentSensitive() {
        return environmentSensitive;
    }

    public void setEnvironmentSensitive(boolean environmentSensitive) {
        this.environmentSensitive = environmentSensitive;
    }

    public float geteWDist() {
        return eWDist;
    }

    public void seteWDist(float eWDist) {
        this.eWDist = eWDist;
    }

    public String geteWFlag() {
        return eWFlag;
    }

    public void seteWFlag(String eWFlag) {
        this.eWFlag = eWFlag;
    }

    public String getFieldCode() {
        return fieldCode;
    }

    public void setFieldCode(String fieldCode) {
        this.fieldCode = fieldCode;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldOffice() {
        return fieldOffice;
    }

    public void setFieldOffice(String fieldOffice) {
        this.fieldOffice = fieldOffice;
    }

    public String getGovAuthority() {
        return govAuthority;
    }

    public void setGovAuthority(String govAuthority) {
        this.govAuthority = govAuthority;
    }

    public boolean isHiH2S() {
        return hiH2S;
    }

    public void setHiH2S(boolean hiH2S) {
        this.hiH2S = hiH2S;
    }

    public boolean isHiSITP() {
        return hiSITP;
    }

    public void setHiSITP(boolean hiSITP) {
        this.hiSITP = hiSITP;
    }

    public String getiDRecElvHistory() {
        return iDRecElvHistory;
    }

    public void setiDRecElvHistory(String iDRecElvHistory) {
        this.iDRecElvHistory = iDRecElvHistory;
    }

    public String getiDRecElvHistoryTK() {
        return iDRecElvHistoryTK;
    }

    public void setiDRecElvHistoryTK(String iDRecElvHistoryTK) {
        this.iDRecElvHistoryTK = iDRecElvHistoryTK;
    }

    public String getiDRecProblem() {
        return iDRecProblem;
    }

    public void setiDRecProblem(String iDRecProblem) {
        this.iDRecProblem = iDRecProblem;
    }

    public String getiDRecProblemTK() {
        return iDRecProblemTK;
    }

    public void setiDRecProblemTK(String iDRecProblemTK) {
        this.iDRecProblemTK = iDRecProblemTK;
    }

    public String getiDRecSite() {
        return iDRecSite;
    }

    public void setiDRecSite(String iDRecSite) {
        this.iDRecSite = iDRecSite;
    }

    public String getiDRecSiteTK() {
        return iDRecSiteTK;
    }

    public void setiDRecSiteTK(String iDRecSiteTK) {
        this.iDRecSiteTK = iDRecSiteTK;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public String getLatLongDatum() {
        return latLongDatum;
    }

    public void setLatLongDatum(String latLongDatum) {
        this.latLongDatum = latLongDatum;
    }

    public String getLatLongSource() {
        return latLongSource;
    }

    public void setLatLongSource(String latLongSource) {
        this.latLongSource = latLongSource;
    }

    public String getLease() {
        return lease;
    }

    public void setLease(String lease) {
        this.lease = lease;
    }

    public String getLeaseCode() {
        return leaseCode;
    }

    public void setLeaseCode(String leaseCode) {
        this.leaseCode = leaseCode;
    }

    public String getLegalSurveyLoc() {
        return legalSurveyLoc;
    }

    public void setLegalSurveyLoc(String legalSurveyLoc) {
        this.legalSurveyLoc = legalSurveyLoc;
    }

    public String getLegalSurveySubTyp() {
        return legalSurveySubTyp;
    }

    public void setLegalSurveySubTyp(String legalSurveySubTyp) {
        this.legalSurveySubTyp = legalSurveySubTyp;
    }

    public String getLegalSurveyTyp() {
        return legalSurveyTyp;
    }

    public void setLegalSurveyTyp(String legalSurveyTyp) {
        this.legalSurveyTyp = legalSurveyTyp;
    }

    public String getLocationNote() {
        return locationNote;
    }

    public void setLocationNote(String locationNote) {
        this.locationNote = locationNote;
    }

    public String getLocationRef() {
        return locationRef;
    }

    public void setLocationRef(String locationRef) {
        this.locationRef = locationRef;
    }

    public boolean isLocationSensitive() {
        return locationSensitive;
    }

    public void setLocationSensitive(boolean locationSensitive) {
        this.locationSensitive = locationSensitive;
    }

    public String getLocationTyp() {
        return locationTyp;
    }

    public void setLocationTyp(String locationTyp) {
        this.locationTyp = locationTyp;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getnSDist() {
        return nSDist;
    }

    public void setnSDist(float nSDist) {
        this.nSDist = nSDist;
    }

    public String getnSFlag() {
        return nSFlag;
    }

    public void setnSFlag(String nSFlag) {
        this.nSFlag = nSFlag;
    }

    public boolean isOperated() {
        return operated;
    }

    public void setOperated(boolean operated) {
        this.operated = operated;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperatorCode() {
        return operatorCode;
    }

    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public boolean isProblemFlag() {
        return problemFlag;
    }

    public void setProblemFlag(boolean problemFlag) {
        this.problemFlag = problemFlag;
    }

    public String getRiskClass() {
        return riskClass;
    }

    public void setRiskClass(String riskClass) {
        this.riskClass = riskClass;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public String getStateProv() {
        return stateProv;
    }

    public void setStateProv(String stateProv) {
        this.stateProv = stateProv;
    }

    public String getSurfaceRights() {
        return surfaceRights;
    }

    public void setSurfaceRights(String surfaceRights) {
        this.surfaceRights = surfaceRights;
    }

    public float getTownDist() {
        return townDist;
    }

    public void setTownDist(float townDist) {
        this.townDist = townDist;
    }

    public String getTownFlag() {
        return townFlag;
    }

    public void setTownFlag(String townFlag) {
        this.townFlag = townFlag;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public String getTownStateProv() {
        return townStateProv;
    }

    public void setTownStateProv(String townStateProv) {
        this.townStateProv = townStateProv;
    }

    public boolean isUserBoolean1() {
        return userBoolean1;
    }

    public void setUserBoolean1(boolean userBoolean1) {
        this.userBoolean1 = userBoolean1;
    }

    public boolean isUserBoolean2() {
        return userBoolean2;
    }

    public void setUserBoolean2(boolean userBoolean2) {
        this.userBoolean2 = userBoolean2;
    }

    public boolean isUserBoolean3() {
        return userBoolean3;
    }

    public void setUserBoolean3(boolean userBoolean3) {
        this.userBoolean3 = userBoolean3;
    }

    public boolean isUserBoolean4() {
        return userBoolean4;
    }

    public void setUserBoolean4(boolean userBoolean4) {
        this.userBoolean4 = userBoolean4;
    }

    public boolean isUserBoolean5() {
        return userBoolean5;
    }

    public void setUserBoolean5(boolean userBoolean5) {
        this.userBoolean5 = userBoolean5;
    }

    public String getUserDtTm1() {
        return userDtTm1;
    }

    public void setUserDtTm1(String userDtTm1) {
        this.userDtTm1 = userDtTm1;
    }

    public String getUserDtTm2() {
        return userDtTm2;
    }

    public void setUserDtTm2(String userDtTm2) {
        this.userDtTm2 = userDtTm2;
    }

    public String getUserDtTm3() {
        return userDtTm3;
    }

    public void setUserDtTm3(String userDtTm3) {
        this.userDtTm3 = userDtTm3;
    }

    public String getUserDtTm4() {
        return userDtTm4;
    }

    public void setUserDtTm4(String userDtTm4) {
        this.userDtTm4 = userDtTm4;
    }

    public String getUserDtTm5() {
        return userDtTm5;
    }

    public void setUserDtTm5(String userDtTm5) {
        this.userDtTm5 = userDtTm5;
    }

    public float getUserNum1() {
        return userNum1;
    }

    public void setUserNum1(float userNum1) {
        this.userNum1 = userNum1;
    }

    public float getUserNum2() {
        return userNum2;
    }

    public void setUserNum2(float userNum2) {
        this.userNum2 = userNum2;
    }

    public float getUserNum3() {
        return userNum3;
    }

    public void setUserNum3(float userNum3) {
        this.userNum3 = userNum3;
    }

    public float getUserNum4() {
        return userNum4;
    }

    public void setUserNum4(float userNum4) {
        this.userNum4 = userNum4;
    }

    public float getUserNum5() {
        return userNum5;
    }

    public void setUserNum5(float userNum5) {
        this.userNum5 = userNum5;
    }

    public String getUserTxt1() {
        return userTxt1;
    }

    public void setUserTxt1(String userTxt1) {
        this.userTxt1 = userTxt1;
    }

    public String getUserTxt10() {
        return userTxt10;
    }

    public void setUserTxt10(String userTxt10) {
        this.userTxt10 = userTxt10;
    }

    public String getUserTxt2() {
        return userTxt2;
    }

    public void setUserTxt2(String userTxt2) {
        this.userTxt2 = userTxt2;
    }

    public String getUserTxt3() {
        return userTxt3;
    }

    public void setUserTxt3(String userTxt3) {
        this.userTxt3 = userTxt3;
    }

    public String getUserTxt4() {
        return userTxt4;
    }

    public void setUserTxt4(String userTxt4) {
        this.userTxt4 = userTxt4;
    }

    public String getUserTxt5() {
        return userTxt5;
    }

    public void setUserTxt5(String userTxt5) {
        this.userTxt5 = userTxt5;
    }

    public String getUserTxt6() {
        return userTxt6;
    }

    public void setUserTxt6(String userTxt6) {
        this.userTxt6 = userTxt6;
    }

    public String getUserTxt7() {
        return userTxt7;
    }

    public void setUserTxt7(String userTxt7) {
        this.userTxt7 = userTxt7;
    }

    public String getUserTxt8() {
        return userTxt8;
    }

    public void setUserTxt8(String userTxt8) {
        this.userTxt8 = userTxt8;
    }

    public String getUserTxt9() {
        return userTxt9;
    }

    public void setUserTxt9(String userTxt9) {
        this.userTxt9 = userTxt9;
    }

    public int getuTMGridZone() {
        return uTMGridZone;
    }

    public void setuTMGridZone(int uTMGridZone) {
        this.uTMGridZone = uTMGridZone;
    }

    public String getuTMSource() {
        return uTMSource;
    }

    public void setuTMSource(String uTMSource) {
        this.uTMSource = uTMSource;
    }

    public float getuTMx() {
        return uTMx;
    }

    public void setuTMx(float uTMx) {
        this.uTMx = uTMx;
    }

    public float getuTMy() {
        return uTMy;
    }

    public void setuTMy(float uTMy) {
        this.uTMy = uTMy;
    }

    public float getWaterDepth() {
        return waterDepth;
    }

    public void setWaterDepth(float waterDepth) {
        this.waterDepth = waterDepth;
    }

    public String getWellClass() {
        return wellClass;
    }

    public void setWellClass(String wellClass) {
        this.wellClass = wellClass;
    }

    public String getWellConfig() {
        return wellConfig;
    }

    public void setWellConfig(String wellConfig) {
        this.wellConfig = wellConfig;
    }

    public String getWellIDA() {
        return wellIDA;
    }

    public void setWellIDA(String wellIDA) {
        this.wellIDA = wellIDA;
    }

    public String getWellIDB() {
        return wellIDB;
    }

    public void setWellIDB(String wellIDB) {
        this.wellIDB = wellIDB;
    }

    public String getWellIDC() {
        return wellIDC;
    }

    public void setWellIDC(String wellIDC) {
        this.wellIDC = wellIDC;
    }

    public String getWellIDD() {
        return wellIDD;
    }

    public void setWellIDD(String wellIDD) {
        this.wellIDD = wellIDD;
    }

    public String getWellIDE() {
        return wellIDE;
    }

    public void setWellIDE(String wellIDE) {
        this.wellIDE = wellIDE;
    }

    public String getWellLicensee() {
        return wellLicensee;
    }

    public void setWellLicensee(String wellLicensee) {
        this.wellLicensee = wellLicensee;
    }

    public String getWellLicenseNo() {
        return wellLicenseNo;
    }

    public void setWellLicenseNo(String wellLicenseNo) {
        this.wellLicenseNo = wellLicenseNo;
    }

    public String getWellName() {
        return wellName;
    }

    public void setWellName(String wellName) {
        this.wellName = wellName;
    }

    public String getWellTyp1() {
        return wellTyp1;
    }

    public void setWellTyp1(String wellTyp1) {
        this.wellTyp1 = wellTyp1;
    }

    public String getWellTyp2() {
        return wellTyp2;
    }

    public void setWellTyp2(String wellTyp2) {
        this.wellTyp2 = wellTyp2;
    }

    public float getWorkingInt() {
        return workingInt;
    }

    public void setWorkingInt(float workingInt) {
        this.workingInt = workingInt;
    }

    public boolean isSysLockMeUI() {
        return sysLockMeUI;
    }

    public void setSysLockMeUI(boolean sysLockMeUI) {
        this.sysLockMeUI = sysLockMeUI;
    }

    public boolean isSysLockChildrenUI() {
        return sysLockChildrenUI;
    }

    public void setSysLockChildrenUI(boolean sysLockChildrenUI) {
        this.sysLockChildrenUI = sysLockChildrenUI;
    }

    public boolean isSysLockMe() {
        return sysLockMe;
    }

    public void setSysLockMe(boolean sysLockMe) {
        this.sysLockMe = sysLockMe;
    }

    public boolean isSysLockChildren() {
        return sysLockChildren;
    }

    public void setSysLockChildren(boolean sysLockChildren) {
        this.sysLockChildren = sysLockChildren;
    }

    public String getSysLockDate() {
        return sysLockDate;
    }

    public void setSysLockDate(String sysLockDate) {
        this.sysLockDate = sysLockDate;
    }

    public String getSysModDate() {
        return sysModDate;
    }

    public void setSysModDate(String sysModDate) {
        this.sysModDate = sysModDate;
    }

    public String getSysModUser() {
        return sysModUser;
    }

    public void setSysModUser(String sysModUser) {
        this.sysModUser = sysModUser;
    }

    public String getSysCreateDate() {
        return sysCreateDate;
    }

    public void setSysCreateDate(String sysCreateDate) {
        this.sysCreateDate = sysCreateDate;
    }

    public String getSysCreateUser() {
        return sysCreateUser;
    }

    public void setSysCreateUser(String sysCreateUser) {
        this.sysCreateUser = sysCreateUser;
    }

    public String getSysTag() {
        return sysTag;
    }

    public void setSysTag(String sysTag) {
        this.sysTag = sysTag;
    }

    public String getSysModDateDB() {
        return sysModDateDB;
    }

    public void setSysModDateDB(String sysModDateDB) {
        this.sysModDateDB = sysModDateDB;
    }

    public String getSysModUserDB() {
        return sysModUserDB;
    }

    public void setSysModUserDB(String sysModUserDB) {
        this.sysModUserDB = sysModUserDB;
    }

    public String getSysSecurityTyp() {
        return sysSecurityTyp;
    }

    public void setSysSecurityTyp(String sysSecurityTyp) {
        this.sysSecurityTyp = sysSecurityTyp;
    }

    public String getSysLockDateMaster() {
        return sysLockDateMaster;
    }

    public void setSysLockDateMaster(String sysLockDateMaster) {
        this.sysLockDateMaster = sysLockDateMaster;
    }

    public float getmD() {
        return mD;
    }

    public void setmD(float mD) {
        this.mD = mD;
    }

    public String getWellConstructionDuration() {
        return wellConstructionDuration;
    }

    public void setWellConstructionDuration(String wellConstructionDuration) {
        this.wellConstructionDuration = wellConstructionDuration;
    }

    public float getDrillingDuration() {
        return drillingDuration;
    }

    public void setDrillingDuration(float drillingDuration) {
        this.drillingDuration = drillingDuration;
    }

    public WellHeaderOverviewEntity(String idwell, String agent, String area, String basin, String basinCode, String com, String country, String county, String currentWellStatus1, String currentWellStatus2, String directionsToWell, String district, String division, String dtTmAbandon, String dtTmFirstProd, String dtTmRR, String dtTmSpud, String dtTmWellClass, String dtTmWellLic, float elvCasFlange, float elvGround, float elvMudLine, float elvOrigKB, float elvTubHead, boolean environmentSensitive, float eWDist, String eWFlag, String fieldCode, String fieldName, String fieldOffice, String govAuthority, boolean hiH2S, boolean hiSITP, String iDRecElvHistory, String iDRecElvHistoryTK, String iDRecProblem, String iDRecProblemTK, String iDRecSite, String iDRecSiteTK, float latitude, String latLongDatum, String latLongSource, String lease, String leaseCode, String legalSurveyLoc, String legalSurveySubTyp, String legalSurveyTyp, String locationNote, String locationRef, boolean locationSensitive, String locationTyp, float longitude, float nSDist, String nSFlag, boolean operated, String operator, String operatorCode, String platform, boolean problemFlag, String riskClass, String slot, String stateProv, String surfaceRights, float townDist, String townFlag, String townName, String townStateProv, boolean userBoolean1, boolean userBoolean2, boolean userBoolean3, boolean userBoolean4, boolean userBoolean5, String userDtTm1, String userDtTm2, String userDtTm3, String userDtTm4, String userDtTm5, float userNum1, float userNum2, float userNum3, float userNum4, float userNum5, String userTxt1, String userTxt10, String userTxt2, String userTxt3, String userTxt4, String userTxt5, String userTxt6, String userTxt7, String userTxt8, String userTxt9, int uTMGridZone, String uTMSource, float uTMx, float uTMy, float waterDepth, String wellClass, String wellConfig, String wellIDA, String wellIDB, String wellIDC, String wellIDD, String wellIDE, String wellLicensee, String wellLicenseNo, String wellName, String wellTyp1, String wellTyp2, float workingInt, boolean sysLockMeUI, boolean sysLockChildrenUI, boolean sysLockMe, boolean sysLockChildren, String sysLockDate, String sysModDate, String sysModUser, String sysCreateDate, String sysCreateUser, String sysTag, String sysModDateDB, String sysModUserDB, String sysSecurityTyp, String sysLockDateMaster, float mD, String wellConstructionDuration, float drillingDuration) {
        this.idwell = idwell;
        this.agent = agent;
        this.area = area;
        this.basin = basin;
        this.basinCode = basinCode;
        this.com = com;
        this.country = country;
        this.county = county;
        this.currentWellStatus1 = currentWellStatus1;
        this.currentWellStatus2 = currentWellStatus2;
        this.directionsToWell = directionsToWell;
        this.district = district;
        this.division = division;
        this.dtTmAbandon = dtTmAbandon;
        this.dtTmFirstProd = dtTmFirstProd;
        this.dtTmRR = dtTmRR;
        this.dtTmSpud = dtTmSpud;
        this.dtTmWellClass = dtTmWellClass;
        this.dtTmWellLic = dtTmWellLic;
        this.elvCasFlange = elvCasFlange;
        this.elvGround = elvGround;
        this.elvMudLine = elvMudLine;
        this.elvOrigKB = elvOrigKB;
        this.elvTubHead = elvTubHead;
        this.environmentSensitive = environmentSensitive;
        this.eWDist = eWDist;
        this.eWFlag = eWFlag;
        this.fieldCode = fieldCode;
        this.fieldName = fieldName;
        this.fieldOffice = fieldOffice;
        this.govAuthority = govAuthority;
        this.hiH2S = hiH2S;
        this.hiSITP = hiSITP;
        this.iDRecElvHistory = iDRecElvHistory;
        this.iDRecElvHistoryTK = iDRecElvHistoryTK;
        this.iDRecProblem = iDRecProblem;
        this.iDRecProblemTK = iDRecProblemTK;
        this.iDRecSite = iDRecSite;
        this.iDRecSiteTK = iDRecSiteTK;
        this.latitude = latitude;
        this.latLongDatum = latLongDatum;
        this.latLongSource = latLongSource;
        this.lease = lease;
        this.leaseCode = leaseCode;
        this.legalSurveyLoc = legalSurveyLoc;
        this.legalSurveySubTyp = legalSurveySubTyp;
        this.legalSurveyTyp = legalSurveyTyp;
        this.locationNote = locationNote;
        this.locationRef = locationRef;
        this.locationSensitive = locationSensitive;
        this.locationTyp = locationTyp;
        this.longitude = longitude;
        this.nSDist = nSDist;
        this.nSFlag = nSFlag;
        this.operated = operated;
        this.operator = operator;
        this.operatorCode = operatorCode;
        this.platform = platform;
        this.problemFlag = problemFlag;
        this.riskClass = riskClass;
        this.slot = slot;
        this.stateProv = stateProv;
        this.surfaceRights = surfaceRights;
        this.townDist = townDist;
        this.townFlag = townFlag;
        this.townName = townName;
        this.townStateProv = townStateProv;
        this.userBoolean1 = userBoolean1;
        this.userBoolean2 = userBoolean2;
        this.userBoolean3 = userBoolean3;
        this.userBoolean4 = userBoolean4;
        this.userBoolean5 = userBoolean5;
        this.userDtTm1 = userDtTm1;
        this.userDtTm2 = userDtTm2;
        this.userDtTm3 = userDtTm3;
        this.userDtTm4 = userDtTm4;
        this.userDtTm5 = userDtTm5;
        this.userNum1 = userNum1;
        this.userNum2 = userNum2;
        this.userNum3 = userNum3;
        this.userNum4 = userNum4;
        this.userNum5 = userNum5;
        this.userTxt1 = userTxt1;
        this.userTxt10 = userTxt10;
        this.userTxt2 = userTxt2;
        this.userTxt3 = userTxt3;
        this.userTxt4 = userTxt4;
        this.userTxt5 = userTxt5;
        this.userTxt6 = userTxt6;
        this.userTxt7 = userTxt7;
        this.userTxt8 = userTxt8;
        this.userTxt9 = userTxt9;
        this.uTMGridZone = uTMGridZone;
        this.uTMSource = uTMSource;
        this.uTMx = uTMx;
        this.uTMy = uTMy;
        this.waterDepth = waterDepth;
        this.wellClass = wellClass;
        this.wellConfig = wellConfig;
        this.wellIDA = wellIDA;
        this.wellIDB = wellIDB;
        this.wellIDC = wellIDC;
        this.wellIDD = wellIDD;
        this.wellIDE = wellIDE;
        this.wellLicensee = wellLicensee;
        this.wellLicenseNo = wellLicenseNo;
        this.wellName = wellName;
        this.wellTyp1 = wellTyp1;
        this.wellTyp2 = wellTyp2;
        this.workingInt = workingInt;
        this.sysLockMeUI = sysLockMeUI;
        this.sysLockChildrenUI = sysLockChildrenUI;
        this.sysLockMe = sysLockMe;
        this.sysLockChildren = sysLockChildren;
        this.sysLockDate = sysLockDate;
        this.sysModDate = sysModDate;
        this.sysModUser = sysModUser;
        this.sysCreateDate = sysCreateDate;
        this.sysCreateUser = sysCreateUser;
        this.sysTag = sysTag;
        this.sysModDateDB = sysModDateDB;
        this.sysModUserDB = sysModUserDB;
        this.sysSecurityTyp = sysSecurityTyp;
        this.sysLockDateMaster = sysLockDateMaster;
        this.mD = mD;
        this.wellConstructionDuration = wellConstructionDuration;
        this.drillingDuration = drillingDuration;
    }
}
