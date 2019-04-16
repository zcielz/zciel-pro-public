package cn.zciel.springjpa.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * tpo_fyxx
 *
 * @author
 */
@Entity(name = "tpo_fyxx")
public class TpoFyxx implements Serializable {
    /**
     * ID
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private String ID;

    /**
     * 父ID
     */
    private String FID;

    /**
     * 房源CODE
     */
    private String CODE;

    /**
     * 测绘房屋ID
     */
    private String FWID;

    /**
     * 测绘房屋CODE
     */
    private String FWCODE;

    /**
     * 不动产单元代码
     */
    private String BDCDYDM;

    /**
     * 邮政地址
     */
    private String YZDZ;

    /**
     * 房屋坐落
     */
    private String FWZL;

    /**
     * 房屋性质
     */
    private String FWXZ;

    /**
     * 土地等级
     */
    private String TDDJ;

    /**
     * 产权证号
     */
    private String CQZH;

    /**
     * 产权单位
     */
    private String CQDW;

    /**
     * 户型
     */
    private String HX;

    /**
     * 分配方式
     */
    private String FPFS;

    /**
     * 房屋分配状态
     */
    private String FWFPZT;

    /**
     * 首次配租时间
     */
    private Date SCPZSJ;

    /**
     * 此次配租时间
     */
    private Date CCPZSJ;

    /**
     * 累计使用时间
     */
    private Short LJSYSJ;

    /**
     * 总层数
     */
    private Integer ZCS;

    /**
     * 所在城市
     */
    private String SZCS;

    /**
     * 房屋结构
     */
    private String FWJG;

    /**
     * 建筑面积
     */
    private Integer JZMJ;

    /**
     * 套内建筑面积
     */
    private Integer TNJZMJ;

    /**
     * 分摊公共面积
     */
    private Integer FTGGMJ;

    /**
     * 使用面积
     */
    private Integer SYMJ;

    /**
     * 竣工时间
     */
    private Date JGSJ;

    /**
     * 接收时间
     */
    private Date JSSJ;

    /**
     * 可租赁总户数
     */
    private Integer KPZZHS;

    /**
     * 已租赁户数
     */
    private Integer YPZHS;

    /**
     * 房号
     */
    private String FH;

    /**
     * 单元ID
     */
    private String DYID;

    /**
     * 单元号
     */
    private String DYH;

    /**
     * 房屋类型（期房、现房）
     */
    private String FWLX;

    /**
     * 自然幢ID
     */
    private String ZRZID;

    /**
     * 自然幢CODE
     */
    private String ZRZCODE;

    /**
     * 幢号
     */
    private String ZH;

    /**
     * 地号
     */
    private String DH;

    /**
     * 所在城区
     */
    private String SZCQ;

    /**
     * 保障类型
     */
    private String BZLX;

    /**
     * 划拨批次ID
     */
    private String HBPCID;

    /**
     * 划拨时间
     */
    private Date HBSJ;

    /**
     * 划拨人
     */
    private String HBR;

    /**
     * 所在层
     */
    private Integer LAYER;

    /**
     * 房屋来源
     */
    private String FWLY;

    /**
     * 保障房源统一编号
     */
    private String BZFYTYBH;

    /**
     * 保障项目统一编号
     */
    private String BZXMTYBH;

    /**
     * 项目ID
     */
    private String XMID;

    /**
     * 项目CODE
     */
    private String XMCODE;

    /**
     * 项目名称
     */
    private String XMMC;

    /**
     * 阁楼建筑面积
     */
    private Integer GLJZMJ;

    /**
     * 储藏室面积
     */
    private Integer CCSMJ;

    /**
     * 是否成套
     */
    private Short SFCT;

    /**
     * 是否整体租赁
     */
    private Short SFZTZL;

    /**
     * 是否纳入省级台账
     */
    private Short SFNRSJTZ;

    /**
     * 是否过渡房
     */
    private Short SFGDF;

    /**
     * 是否直管公房
     */
    private Short SFZGGF;

    /**
     * 房屋档案号
     */
    private String FWDAH;

    /**
     * 划分区块
     */
    private String HFQK;

    /**
     * 排序
     */
    private Integer SORT_NUM;

    /**
     * 版本
     */
    private Integer DATA_VERSION;

    /**
     * 创建人
     */
    private String CREATOR;

    /**
     * 创建时间
     */
    private Date CREATE_TIME;

    /**
     * 终止时间
     */
    private Date ZZSJ;

    /**
     * 更新人
     */
    private String UPDATOR;

    /**
     * 更新时间
     */
    private Date UPDATE_TIME;

    /**
     * 有效标志
     */
    private Short YXBZ;

    /**
     * 备注
     */
    private String COMMENTS;

    private static final long serialVersionUID = 1L;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFID() {
        return FID;
    }

    public void setFID(String FID) {
        this.FID = FID;
    }

    public String getCODE() {
        return CODE;
    }

    public void setCODE(String CODE) {
        this.CODE = CODE;
    }

    public String getFWID() {
        return FWID;
    }

    public void setFWID(String FWID) {
        this.FWID = FWID;
    }

    public String getFWCODE() {
        return FWCODE;
    }

    public void setFWCODE(String FWCODE) {
        this.FWCODE = FWCODE;
    }

    public String getBDCDYDM() {
        return BDCDYDM;
    }

    public void setBDCDYDM(String BDCDYDM) {
        this.BDCDYDM = BDCDYDM;
    }

    public String getYZDZ() {
        return YZDZ;
    }

    public void setYZDZ(String YZDZ) {
        this.YZDZ = YZDZ;
    }

    public String getFWZL() {
        return FWZL;
    }

    public void setFWZL(String FWZL) {
        this.FWZL = FWZL;
    }

    public String getFWXZ() {
        return FWXZ;
    }

    public void setFWXZ(String FWXZ) {
        this.FWXZ = FWXZ;
    }

    public String getTDDJ() {
        return TDDJ;
    }

    public void setTDDJ(String TDDJ) {
        this.TDDJ = TDDJ;
    }

    public String getCQZH() {
        return CQZH;
    }

    public void setCQZH(String CQZH) {
        this.CQZH = CQZH;
    }

    public String getCQDW() {
        return CQDW;
    }

    public void setCQDW(String CQDW) {
        this.CQDW = CQDW;
    }

    public String getHX() {
        return HX;
    }

    public void setHX(String HX) {
        this.HX = HX;
    }

    public String getFPFS() {
        return FPFS;
    }

    public void setFPFS(String FPFS) {
        this.FPFS = FPFS;
    }

    public String getFWFPZT() {
        return FWFPZT;
    }

    public void setFWFPZT(String FWFPZT) {
        this.FWFPZT = FWFPZT;
    }

    public Date getSCPZSJ() {
        return SCPZSJ;
    }

    public void setSCPZSJ(Date SCPZSJ) {
        this.SCPZSJ = SCPZSJ;
    }

    public Date getCCPZSJ() {
        return CCPZSJ;
    }

    public void setCCPZSJ(Date CCPZSJ) {
        this.CCPZSJ = CCPZSJ;
    }

    public Short getLJSYSJ() {
        return LJSYSJ;
    }

    public void setLJSYSJ(Short LJSYSJ) {
        this.LJSYSJ = LJSYSJ;
    }

    public Integer getZCS() {
        return ZCS;
    }

    public void setZCS(Integer ZCS) {
        this.ZCS = ZCS;
    }

    public String getSZCS() {
        return SZCS;
    }

    public void setSZCS(String SZCS) {
        this.SZCS = SZCS;
    }

    public String getFWJG() {
        return FWJG;
    }

    public void setFWJG(String FWJG) {
        this.FWJG = FWJG;
    }

    public Integer getJZMJ() {
        return JZMJ;
    }

    public void setJZMJ(Integer JZMJ) {
        this.JZMJ = JZMJ;
    }

    public Integer getTNJZMJ() {
        return TNJZMJ;
    }

    public void setTNJZMJ(Integer TNJZMJ) {
        this.TNJZMJ = TNJZMJ;
    }

    public Integer getFTGGMJ() {
        return FTGGMJ;
    }

    public void setFTGGMJ(Integer FTGGMJ) {
        this.FTGGMJ = FTGGMJ;
    }

    public Integer getSYMJ() {
        return SYMJ;
    }

    public void setSYMJ(Integer SYMJ) {
        this.SYMJ = SYMJ;
    }

    public Date getJGSJ() {
        return JGSJ;
    }

    public void setJGSJ(Date JGSJ) {
        this.JGSJ = JGSJ;
    }

    public Date getJSSJ() {
        return JSSJ;
    }

    public void setJSSJ(Date JSSJ) {
        this.JSSJ = JSSJ;
    }

    public Integer getKPZZHS() {
        return KPZZHS;
    }

    public void setKPZZHS(Integer KPZZHS) {
        this.KPZZHS = KPZZHS;
    }

    public Integer getYPZHS() {
        return YPZHS;
    }

    public void setYPZHS(Integer YPZHS) {
        this.YPZHS = YPZHS;
    }

    public String getFH() {
        return FH;
    }

    public void setFH(String FH) {
        this.FH = FH;
    }

    public String getDYID() {
        return DYID;
    }

    public void setDYID(String DYID) {
        this.DYID = DYID;
    }

    public String getDYH() {
        return DYH;
    }

    public void setDYH(String DYH) {
        this.DYH = DYH;
    }

    public String getFWLX() {
        return FWLX;
    }

    public void setFWLX(String FWLX) {
        this.FWLX = FWLX;
    }

    public String getZRZID() {
        return ZRZID;
    }

    public void setZRZID(String ZRZID) {
        this.ZRZID = ZRZID;
    }

    public String getZRZCODE() {
        return ZRZCODE;
    }

    public void setZRZCODE(String ZRZCODE) {
        this.ZRZCODE = ZRZCODE;
    }

    public String getZH() {
        return ZH;
    }

    public void setZH(String ZH) {
        this.ZH = ZH;
    }

    public String getDH() {
        return DH;
    }

    public void setDH(String DH) {
        this.DH = DH;
    }

    public String getSZCQ() {
        return SZCQ;
    }

    public void setSZCQ(String SZCQ) {
        this.SZCQ = SZCQ;
    }

    public String getBZLX() {
        return BZLX;
    }

    public void setBZLX(String BZLX) {
        this.BZLX = BZLX;
    }

    public String getHBPCID() {
        return HBPCID;
    }

    public void setHBPCID(String HBPCID) {
        this.HBPCID = HBPCID;
    }

    public Date getHBSJ() {
        return HBSJ;
    }

    public void setHBSJ(Date HBSJ) {
        this.HBSJ = HBSJ;
    }

    public String getHBR() {
        return HBR;
    }

    public void setHBR(String HBR) {
        this.HBR = HBR;
    }

    public Integer getLAYER() {
        return LAYER;
    }

    public void setLAYER(Integer LAYER) {
        this.LAYER = LAYER;
    }

    public String getFWLY() {
        return FWLY;
    }

    public void setFWLY(String FWLY) {
        this.FWLY = FWLY;
    }

    public String getBZFYTYBH() {
        return BZFYTYBH;
    }

    public void setBZFYTYBH(String BZFYTYBH) {
        this.BZFYTYBH = BZFYTYBH;
    }

    public String getBZXMTYBH() {
        return BZXMTYBH;
    }

    public void setBZXMTYBH(String BZXMTYBH) {
        this.BZXMTYBH = BZXMTYBH;
    }

    public String getXMID() {
        return XMID;
    }

    public void setXMID(String XMID) {
        this.XMID = XMID;
    }

    public String getXMCODE() {
        return XMCODE;
    }

    public void setXMCODE(String XMCODE) {
        this.XMCODE = XMCODE;
    }

    public String getXMMC() {
        return XMMC;
    }

    public void setXMMC(String XMMC) {
        this.XMMC = XMMC;
    }

    public Integer getGLJZMJ() {
        return GLJZMJ;
    }

    public void setGLJZMJ(Integer GLJZMJ) {
        this.GLJZMJ = GLJZMJ;
    }

    public Integer getCCSMJ() {
        return CCSMJ;
    }

    public void setCCSMJ(Integer CCSMJ) {
        this.CCSMJ = CCSMJ;
    }

    public Short getSFCT() {
        return SFCT;
    }

    public void setSFCT(Short SFCT) {
        this.SFCT = SFCT;
    }

    public Short getSFZTZL() {
        return SFZTZL;
    }

    public void setSFZTZL(Short SFZTZL) {
        this.SFZTZL = SFZTZL;
    }

    public Short getSFNRSJTZ() {
        return SFNRSJTZ;
    }

    public void setSFNRSJTZ(Short SFNRSJTZ) {
        this.SFNRSJTZ = SFNRSJTZ;
    }

    public Short getSFGDF() {
        return SFGDF;
    }

    public void setSFGDF(Short SFGDF) {
        this.SFGDF = SFGDF;
    }

    public Short getSFZGGF() {
        return SFZGGF;
    }

    public void setSFZGGF(Short SFZGGF) {
        this.SFZGGF = SFZGGF;
    }

    public String getFWDAH() {
        return FWDAH;
    }

    public void setFWDAH(String FWDAH) {
        this.FWDAH = FWDAH;
    }

    public String getHFQK() {
        return HFQK;
    }

    public void setHFQK(String HFQK) {
        this.HFQK = HFQK;
    }

    public Integer getSORT_NUM() {
        return SORT_NUM;
    }

    public void setSORT_NUM(Integer SORT_NUM) {
        this.SORT_NUM = SORT_NUM;
    }

    public Integer getDATA_VERSION() {
        return DATA_VERSION;
    }

    public void setDATA_VERSION(Integer DATA_VERSION) {
        this.DATA_VERSION = DATA_VERSION;
    }

    public String getCREATOR() {
        return CREATOR;
    }

    public void setCREATOR(String CREATOR) {
        this.CREATOR = CREATOR;
    }

    public Date getCREATE_TIME() {
        return CREATE_TIME;
    }

    public void setCREATE_TIME(Date CREATE_TIME) {
        this.CREATE_TIME = CREATE_TIME;
    }

    public Date getZZSJ() {
        return ZZSJ;
    }

    public void setZZSJ(Date ZZSJ) {
        this.ZZSJ = ZZSJ;
    }

    public String getUPDATOR() {
        return UPDATOR;
    }

    public void setUPDATOR(String UPDATOR) {
        this.UPDATOR = UPDATOR;
    }

    public Date getUPDATE_TIME() {
        return UPDATE_TIME;
    }

    public void setUPDATE_TIME(Date UPDATE_TIME) {
        this.UPDATE_TIME = UPDATE_TIME;
    }

    public Short getYXBZ() {
        return YXBZ;
    }

    public void setYXBZ(Short YXBZ) {
        this.YXBZ = YXBZ;
    }

    public String getCOMMENTS() {
        return COMMENTS;
    }

    public void setCOMMENTS(String COMMENTS) {
        this.COMMENTS = COMMENTS;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TpoFyxx other = (TpoFyxx) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
                && (this.getFID() == null ? other.getFID() == null : this.getFID().equals(other.getFID()))
                && (this.getCODE() == null ? other.getCODE() == null : this.getCODE().equals(other.getCODE()))
                && (this.getFWID() == null ? other.getFWID() == null : this.getFWID().equals(other.getFWID()))
                && (this.getFWCODE() == null ? other.getFWCODE() == null : this.getFWCODE().equals(other.getFWCODE()))
                && (this.getBDCDYDM() == null ? other.getBDCDYDM() == null : this.getBDCDYDM().equals(other.getBDCDYDM()))
                && (this.getYZDZ() == null ? other.getYZDZ() == null : this.getYZDZ().equals(other.getYZDZ()))
                && (this.getFWZL() == null ? other.getFWZL() == null : this.getFWZL().equals(other.getFWZL()))
                && (this.getFWXZ() == null ? other.getFWXZ() == null : this.getFWXZ().equals(other.getFWXZ()))
                && (this.getTDDJ() == null ? other.getTDDJ() == null : this.getTDDJ().equals(other.getTDDJ()))
                && (this.getCQZH() == null ? other.getCQZH() == null : this.getCQZH().equals(other.getCQZH()))
                && (this.getCQDW() == null ? other.getCQDW() == null : this.getCQDW().equals(other.getCQDW()))
                && (this.getHX() == null ? other.getHX() == null : this.getHX().equals(other.getHX()))
                && (this.getFPFS() == null ? other.getFPFS() == null : this.getFPFS().equals(other.getFPFS()))
                && (this.getFWFPZT() == null ? other.getFWFPZT() == null : this.getFWFPZT().equals(other.getFWFPZT()))
                && (this.getSCPZSJ() == null ? other.getSCPZSJ() == null : this.getSCPZSJ().equals(other.getSCPZSJ()))
                && (this.getCCPZSJ() == null ? other.getCCPZSJ() == null : this.getCCPZSJ().equals(other.getCCPZSJ()))
                && (this.getLJSYSJ() == null ? other.getLJSYSJ() == null : this.getLJSYSJ().equals(other.getLJSYSJ()))
                && (this.getZCS() == null ? other.getZCS() == null : this.getZCS().equals(other.getZCS()))
                && (this.getSZCS() == null ? other.getSZCS() == null : this.getSZCS().equals(other.getSZCS()))
                && (this.getFWJG() == null ? other.getFWJG() == null : this.getFWJG().equals(other.getFWJG()))
                && (this.getJZMJ() == null ? other.getJZMJ() == null : this.getJZMJ().equals(other.getJZMJ()))
                && (this.getTNJZMJ() == null ? other.getTNJZMJ() == null : this.getTNJZMJ().equals(other.getTNJZMJ()))
                && (this.getFTGGMJ() == null ? other.getFTGGMJ() == null : this.getFTGGMJ().equals(other.getFTGGMJ()))
                && (this.getSYMJ() == null ? other.getSYMJ() == null : this.getSYMJ().equals(other.getSYMJ()))
                && (this.getJGSJ() == null ? other.getJGSJ() == null : this.getJGSJ().equals(other.getJGSJ()))
                && (this.getJSSJ() == null ? other.getJSSJ() == null : this.getJSSJ().equals(other.getJSSJ()))
                && (this.getKPZZHS() == null ? other.getKPZZHS() == null : this.getKPZZHS().equals(other.getKPZZHS()))
                && (this.getYPZHS() == null ? other.getYPZHS() == null : this.getYPZHS().equals(other.getYPZHS()))
                && (this.getFH() == null ? other.getFH() == null : this.getFH().equals(other.getFH()))
                && (this.getDYID() == null ? other.getDYID() == null : this.getDYID().equals(other.getDYID()))
                && (this.getDYH() == null ? other.getDYH() == null : this.getDYH().equals(other.getDYH()))
                && (this.getFWLX() == null ? other.getFWLX() == null : this.getFWLX().equals(other.getFWLX()))
                && (this.getZRZID() == null ? other.getZRZID() == null : this.getZRZID().equals(other.getZRZID()))
                && (this.getZRZCODE() == null ? other.getZRZCODE() == null : this.getZRZCODE().equals(other.getZRZCODE()))
                && (this.getZH() == null ? other.getZH() == null : this.getZH().equals(other.getZH()))
                && (this.getDH() == null ? other.getDH() == null : this.getDH().equals(other.getDH()))
                && (this.getSZCQ() == null ? other.getSZCQ() == null : this.getSZCQ().equals(other.getSZCQ()))
                && (this.getBZLX() == null ? other.getBZLX() == null : this.getBZLX().equals(other.getBZLX()))
                && (this.getHBPCID() == null ? other.getHBPCID() == null : this.getHBPCID().equals(other.getHBPCID()))
                && (this.getHBSJ() == null ? other.getHBSJ() == null : this.getHBSJ().equals(other.getHBSJ()))
                && (this.getHBR() == null ? other.getHBR() == null : this.getHBR().equals(other.getHBR()))
                && (this.getLAYER() == null ? other.getLAYER() == null : this.getLAYER().equals(other.getLAYER()))
                && (this.getFWLY() == null ? other.getFWLY() == null : this.getFWLY().equals(other.getFWLY()))
                && (this.getBZFYTYBH() == null ? other.getBZFYTYBH() == null : this.getBZFYTYBH().equals(other.getBZFYTYBH()))
                && (this.getBZXMTYBH() == null ? other.getBZXMTYBH() == null : this.getBZXMTYBH().equals(other.getBZXMTYBH()))
                && (this.getXMID() == null ? other.getXMID() == null : this.getXMID().equals(other.getXMID()))
                && (this.getXMCODE() == null ? other.getXMCODE() == null : this.getXMCODE().equals(other.getXMCODE()))
                && (this.getXMMC() == null ? other.getXMMC() == null : this.getXMMC().equals(other.getXMMC()))
                && (this.getGLJZMJ() == null ? other.getGLJZMJ() == null : this.getGLJZMJ().equals(other.getGLJZMJ()))
                && (this.getCCSMJ() == null ? other.getCCSMJ() == null : this.getCCSMJ().equals(other.getCCSMJ()))
                && (this.getSFCT() == null ? other.getSFCT() == null : this.getSFCT().equals(other.getSFCT()))
                && (this.getSFZTZL() == null ? other.getSFZTZL() == null : this.getSFZTZL().equals(other.getSFZTZL()))
                && (this.getSFNRSJTZ() == null ? other.getSFNRSJTZ() == null : this.getSFNRSJTZ().equals(other.getSFNRSJTZ()))
                && (this.getSFGDF() == null ? other.getSFGDF() == null : this.getSFGDF().equals(other.getSFGDF()))
                && (this.getSFZGGF() == null ? other.getSFZGGF() == null : this.getSFZGGF().equals(other.getSFZGGF()))
                && (this.getFWDAH() == null ? other.getFWDAH() == null : this.getFWDAH().equals(other.getFWDAH()))
                && (this.getHFQK() == null ? other.getHFQK() == null : this.getHFQK().equals(other.getHFQK()))
                && (this.getSORT_NUM() == null ? other.getSORT_NUM() == null : this.getSORT_NUM().equals(other.getSORT_NUM()))
                && (this.getDATA_VERSION() == null ? other.getDATA_VERSION() == null : this.getDATA_VERSION().equals(other.getDATA_VERSION()))
                && (this.getCREATOR() == null ? other.getCREATOR() == null : this.getCREATOR().equals(other.getCREATOR()))
                && (this.getCREATE_TIME() == null ? other.getCREATE_TIME() == null : this.getCREATE_TIME().equals(other.getCREATE_TIME()))
                && (this.getZZSJ() == null ? other.getZZSJ() == null : this.getZZSJ().equals(other.getZZSJ()))
                && (this.getUPDATOR() == null ? other.getUPDATOR() == null : this.getUPDATOR().equals(other.getUPDATOR()))
                && (this.getUPDATE_TIME() == null ? other.getUPDATE_TIME() == null : this.getUPDATE_TIME().equals(other.getUPDATE_TIME()))
                && (this.getYXBZ() == null ? other.getYXBZ() == null : this.getYXBZ().equals(other.getYXBZ()))
                && (this.getCOMMENTS() == null ? other.getCOMMENTS() == null : this.getCOMMENTS().equals(other.getCOMMENTS()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getFID() == null) ? 0 : getFID().hashCode());
        result = prime * result + ((getCODE() == null) ? 0 : getCODE().hashCode());
        result = prime * result + ((getFWID() == null) ? 0 : getFWID().hashCode());
        result = prime * result + ((getFWCODE() == null) ? 0 : getFWCODE().hashCode());
        result = prime * result + ((getBDCDYDM() == null) ? 0 : getBDCDYDM().hashCode());
        result = prime * result + ((getYZDZ() == null) ? 0 : getYZDZ().hashCode());
        result = prime * result + ((getFWZL() == null) ? 0 : getFWZL().hashCode());
        result = prime * result + ((getFWXZ() == null) ? 0 : getFWXZ().hashCode());
        result = prime * result + ((getTDDJ() == null) ? 0 : getTDDJ().hashCode());
        result = prime * result + ((getCQZH() == null) ? 0 : getCQZH().hashCode());
        result = prime * result + ((getCQDW() == null) ? 0 : getCQDW().hashCode());
        result = prime * result + ((getHX() == null) ? 0 : getHX().hashCode());
        result = prime * result + ((getFPFS() == null) ? 0 : getFPFS().hashCode());
        result = prime * result + ((getFWFPZT() == null) ? 0 : getFWFPZT().hashCode());
        result = prime * result + ((getSCPZSJ() == null) ? 0 : getSCPZSJ().hashCode());
        result = prime * result + ((getCCPZSJ() == null) ? 0 : getCCPZSJ().hashCode());
        result = prime * result + ((getLJSYSJ() == null) ? 0 : getLJSYSJ().hashCode());
        result = prime * result + ((getZCS() == null) ? 0 : getZCS().hashCode());
        result = prime * result + ((getSZCS() == null) ? 0 : getSZCS().hashCode());
        result = prime * result + ((getFWJG() == null) ? 0 : getFWJG().hashCode());
        result = prime * result + ((getJZMJ() == null) ? 0 : getJZMJ().hashCode());
        result = prime * result + ((getTNJZMJ() == null) ? 0 : getTNJZMJ().hashCode());
        result = prime * result + ((getFTGGMJ() == null) ? 0 : getFTGGMJ().hashCode());
        result = prime * result + ((getSYMJ() == null) ? 0 : getSYMJ().hashCode());
        result = prime * result + ((getJGSJ() == null) ? 0 : getJGSJ().hashCode());
        result = prime * result + ((getJSSJ() == null) ? 0 : getJSSJ().hashCode());
        result = prime * result + ((getKPZZHS() == null) ? 0 : getKPZZHS().hashCode());
        result = prime * result + ((getYPZHS() == null) ? 0 : getYPZHS().hashCode());
        result = prime * result + ((getFH() == null) ? 0 : getFH().hashCode());
        result = prime * result + ((getDYID() == null) ? 0 : getDYID().hashCode());
        result = prime * result + ((getDYH() == null) ? 0 : getDYH().hashCode());
        result = prime * result + ((getFWLX() == null) ? 0 : getFWLX().hashCode());
        result = prime * result + ((getZRZID() == null) ? 0 : getZRZID().hashCode());
        result = prime * result + ((getZRZCODE() == null) ? 0 : getZRZCODE().hashCode());
        result = prime * result + ((getZH() == null) ? 0 : getZH().hashCode());
        result = prime * result + ((getDH() == null) ? 0 : getDH().hashCode());
        result = prime * result + ((getSZCQ() == null) ? 0 : getSZCQ().hashCode());
        result = prime * result + ((getBZLX() == null) ? 0 : getBZLX().hashCode());
        result = prime * result + ((getHBPCID() == null) ? 0 : getHBPCID().hashCode());
        result = prime * result + ((getHBSJ() == null) ? 0 : getHBSJ().hashCode());
        result = prime * result + ((getHBR() == null) ? 0 : getHBR().hashCode());
        result = prime * result + ((getLAYER() == null) ? 0 : getLAYER().hashCode());
        result = prime * result + ((getFWLY() == null) ? 0 : getFWLY().hashCode());
        result = prime * result + ((getBZFYTYBH() == null) ? 0 : getBZFYTYBH().hashCode());
        result = prime * result + ((getBZXMTYBH() == null) ? 0 : getBZXMTYBH().hashCode());
        result = prime * result + ((getXMID() == null) ? 0 : getXMID().hashCode());
        result = prime * result + ((getXMCODE() == null) ? 0 : getXMCODE().hashCode());
        result = prime * result + ((getXMMC() == null) ? 0 : getXMMC().hashCode());
        result = prime * result + ((getGLJZMJ() == null) ? 0 : getGLJZMJ().hashCode());
        result = prime * result + ((getCCSMJ() == null) ? 0 : getCCSMJ().hashCode());
        result = prime * result + ((getSFCT() == null) ? 0 : getSFCT().hashCode());
        result = prime * result + ((getSFZTZL() == null) ? 0 : getSFZTZL().hashCode());
        result = prime * result + ((getSFNRSJTZ() == null) ? 0 : getSFNRSJTZ().hashCode());
        result = prime * result + ((getSFGDF() == null) ? 0 : getSFGDF().hashCode());
        result = prime * result + ((getSFZGGF() == null) ? 0 : getSFZGGF().hashCode());
        result = prime * result + ((getFWDAH() == null) ? 0 : getFWDAH().hashCode());
        result = prime * result + ((getHFQK() == null) ? 0 : getHFQK().hashCode());
        result = prime * result + ((getSORT_NUM() == null) ? 0 : getSORT_NUM().hashCode());
        result = prime * result + ((getDATA_VERSION() == null) ? 0 : getDATA_VERSION().hashCode());
        result = prime * result + ((getCREATOR() == null) ? 0 : getCREATOR().hashCode());
        result = prime * result + ((getCREATE_TIME() == null) ? 0 : getCREATE_TIME().hashCode());
        result = prime * result + ((getZZSJ() == null) ? 0 : getZZSJ().hashCode());
        result = prime * result + ((getUPDATOR() == null) ? 0 : getUPDATOR().hashCode());
        result = prime * result + ((getUPDATE_TIME() == null) ? 0 : getUPDATE_TIME().hashCode());
        result = prime * result + ((getYXBZ() == null) ? 0 : getYXBZ().hashCode());
        result = prime * result + ((getCOMMENTS() == null) ? 0 : getCOMMENTS().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", FID=").append(FID);
        sb.append(", CODE=").append(CODE);
        sb.append(", FWID=").append(FWID);
        sb.append(", FWCODE=").append(FWCODE);
        sb.append(", BDCDYDM=").append(BDCDYDM);
        sb.append(", YZDZ=").append(YZDZ);
        sb.append(", FWZL=").append(FWZL);
        sb.append(", FWXZ=").append(FWXZ);
        sb.append(", TDDJ=").append(TDDJ);
        sb.append(", CQZH=").append(CQZH);
        sb.append(", CQDW=").append(CQDW);
        sb.append(", HX=").append(HX);
        sb.append(", FPFS=").append(FPFS);
        sb.append(", FWFPZT=").append(FWFPZT);
        sb.append(", SCPZSJ=").append(SCPZSJ);
        sb.append(", CCPZSJ=").append(CCPZSJ);
        sb.append(", LJSYSJ=").append(LJSYSJ);
        sb.append(", ZCS=").append(ZCS);
        sb.append(", SZCS=").append(SZCS);
        sb.append(", FWJG=").append(FWJG);
        sb.append(", JZMJ=").append(JZMJ);
        sb.append(", TNJZMJ=").append(TNJZMJ);
        sb.append(", FTGGMJ=").append(FTGGMJ);
        sb.append(", SYMJ=").append(SYMJ);
        sb.append(", JGSJ=").append(JGSJ);
        sb.append(", JSSJ=").append(JSSJ);
        sb.append(", KPZZHS=").append(KPZZHS);
        sb.append(", YPZHS=").append(YPZHS);
        sb.append(", FH=").append(FH);
        sb.append(", DYID=").append(DYID);
        sb.append(", DYH=").append(DYH);
        sb.append(", FWLX=").append(FWLX);
        sb.append(", ZRZID=").append(ZRZID);
        sb.append(", ZRZCODE=").append(ZRZCODE);
        sb.append(", ZH=").append(ZH);
        sb.append(", DH=").append(DH);
        sb.append(", SZCQ=").append(SZCQ);
        sb.append(", BZLX=").append(BZLX);
        sb.append(", HBPCID=").append(HBPCID);
        sb.append(", HBSJ=").append(HBSJ);
        sb.append(", HBR=").append(HBR);
        sb.append(", LAYER=").append(LAYER);
        sb.append(", FWLY=").append(FWLY);
        sb.append(", BZFYTYBH=").append(BZFYTYBH);
        sb.append(", BZXMTYBH=").append(BZXMTYBH);
        sb.append(", XMID=").append(XMID);
        sb.append(", XMCODE=").append(XMCODE);
        sb.append(", XMMC=").append(XMMC);
        sb.append(", GLJZMJ=").append(GLJZMJ);
        sb.append(", CCSMJ=").append(CCSMJ);
        sb.append(", SFCT=").append(SFCT);
        sb.append(", SFZTZL=").append(SFZTZL);
        sb.append(", SFNRSJTZ=").append(SFNRSJTZ);
        sb.append(", SFGDF=").append(SFGDF);
        sb.append(", SFZGGF=").append(SFZGGF);
        sb.append(", FWDAH=").append(FWDAH);
        sb.append(", HFQK=").append(HFQK);
        sb.append(", SORT_NUM=").append(SORT_NUM);
        sb.append(", DATA_VERSION=").append(DATA_VERSION);
        sb.append(", CREATOR=").append(CREATOR);
        sb.append(", CREATE_TIME=").append(CREATE_TIME);
        sb.append(", ZZSJ=").append(ZZSJ);
        sb.append(", UPDATOR=").append(UPDATOR);
        sb.append(", UPDATE_TIME=").append(UPDATE_TIME);
        sb.append(", YXBZ=").append(YXBZ);
        sb.append(", COMMENTS=").append(COMMENTS);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
