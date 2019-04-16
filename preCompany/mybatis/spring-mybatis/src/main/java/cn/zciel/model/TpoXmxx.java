package cn.zciel.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * tpo_xmxx
 *
 * @author
 */
public class TpoXmxx implements Serializable {
    /**
     * 主键ID
     */
    private String ID;

    /**
     * CODE
     */
    private String CODE;

    /**
     * 小区名称
     */
    private String XQMC;

    /**
     * 坐落
     */
    private String ZL;

    /**
     * 项目编码
     */
    private String XMBM;

    /**
     * 年度计划id
     */
    private String NDJHID;

    /**
     * 项目名称
     */
    private String XMMC;

    /**
     * 项目坐落
     */
    private String XMZL;

    /**
     * 建设方式
     */
    private String JSFS;

    /**
     * 项目位置(坐标)
     */
    private String ZB;

    /**
     * 经度
     */
    private Long JD;

    /**
     * 纬度
     */
    private Long WD;

    /**
     * 保障类型
     */
    private String BZLX;

    /**
     * 土地取得方式
     */
    private String TDQDFS;

    /**
     * 土地面积
     */
    private BigDecimal TDMJ;

    /**
     * 所在城区
     */
    private String SZCQ;

    /**
     * 所在城市
     */
    private String SZCS;

    /**
     * 项目性质
     */
    private String XMXZ;

    /**
     * 项目开工时间
     */
    private Date XMKGSJ;

    /**
     * 项目竣工时间
     */
    private Date XMJGSJ;

    /**
     * 竣工决算日期
     */
    private Date JGJSRQ;

    /**
     * 已开工套（间）数
     */
    private Integer YKGTJS;

    /**
     * 在建套（间）数
     */
    private Integer ZJTJS;

    /**
     * 已竣工套（间）数
     */
    private Integer YJGTJS;

    /**
     * 已分配套（间）数
     */
    private Integer YFPTJS;

    /**
     * 保养维护单位
     */
    private String BYWHDW;

    /**
     * 交付使用日期
     */
    private Date JFSYRQ;

    /**
     * 资金来源
     */
    private String ZJLY;

    /**
     * 土地获取时间
     */
    private Date TDHQSJ;

    /**
     * 土地费用
     */
    private BigDecimal TDFY;

    /**
     * 建筑面积
     */
    private BigDecimal JZMJ;

    /**
     * 产权所有人
     */
    private String CQSYR;

    /**
     * 产权证编号
     */
    private String CQZBH;

    /**
     * 计划类别
     */
    private String JHLB;

    /**
     * 列入计划年度
     */
    private Date LRJHND;

    /**
     * 总投资（万元）
     */
    private BigDecimal ZTZ;

    /**
     * 项目负责人
     */
    private String XMFZR;

    /**
     * 建设单位名称
     */
    private String JSDWMC;

    /**
     * 建设单位组织机构代码
     */
    private String JSDWZZJGDM;

    /**
     * 配套公建面积
     */
    private BigDecimal PTGJMJ;

    /**
     * 配套商业用房面积
     */
    private BigDecimal PTSYYFMJ;

    /**
     * 投资主体
     */
    private String TZZT;

    /**
     * 项目来源
     */
    private String XMLY;

    /**
     * 规划CODE
     */
    private String GHCODE;

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

    public String getCODE() {
        return CODE;
    }

    public void setCODE(String CODE) {
        this.CODE = CODE;
    }

    public String getXQMC() {
        return XQMC;
    }

    public void setXQMC(String XQMC) {
        this.XQMC = XQMC;
    }

    public String getZL() {
        return ZL;
    }

    public void setZL(String ZL) {
        this.ZL = ZL;
    }

    public String getXMBM() {
        return XMBM;
    }

    public void setXMBM(String XMBM) {
        this.XMBM = XMBM;
    }

    public String getNDJHID() {
        return NDJHID;
    }

    public void setNDJHID(String NDJHID) {
        this.NDJHID = NDJHID;
    }

    public String getXMMC() {
        return XMMC;
    }

    public void setXMMC(String XMMC) {
        this.XMMC = XMMC;
    }

    public String getXMZL() {
        return XMZL;
    }

    public void setXMZL(String XMZL) {
        this.XMZL = XMZL;
    }

    public String getJSFS() {
        return JSFS;
    }

    public void setJSFS(String JSFS) {
        this.JSFS = JSFS;
    }

    public String getZB() {
        return ZB;
    }

    public void setZB(String ZB) {
        this.ZB = ZB;
    }

    public Long getJD() {
        return JD;
    }

    public void setJD(Long JD) {
        this.JD = JD;
    }

    public Long getWD() {
        return WD;
    }

    public void setWD(Long WD) {
        this.WD = WD;
    }

    public String getBZLX() {
        return BZLX;
    }

    public void setBZLX(String BZLX) {
        this.BZLX = BZLX;
    }

    public String getTDQDFS() {
        return TDQDFS;
    }

    public void setTDQDFS(String TDQDFS) {
        this.TDQDFS = TDQDFS;
    }

    public BigDecimal getTDMJ() {
        return TDMJ;
    }

    public void setTDMJ(BigDecimal TDMJ) {
        this.TDMJ = TDMJ;
    }

    public String getSZCQ() {
        return SZCQ;
    }

    public void setSZCQ(String SZCQ) {
        this.SZCQ = SZCQ;
    }

    public String getSZCS() {
        return SZCS;
    }

    public void setSZCS(String SZCS) {
        this.SZCS = SZCS;
    }

    public String getXMXZ() {
        return XMXZ;
    }

    public void setXMXZ(String XMXZ) {
        this.XMXZ = XMXZ;
    }

    public Date getXMKGSJ() {
        return XMKGSJ;
    }

    public void setXMKGSJ(Date XMKGSJ) {
        this.XMKGSJ = XMKGSJ;
    }

    public Date getXMJGSJ() {
        return XMJGSJ;
    }

    public void setXMJGSJ(Date XMJGSJ) {
        this.XMJGSJ = XMJGSJ;
    }

    public Date getJGJSRQ() {
        return JGJSRQ;
    }

    public void setJGJSRQ(Date JGJSRQ) {
        this.JGJSRQ = JGJSRQ;
    }

    public Integer getYKGTJS() {
        return YKGTJS;
    }

    public void setYKGTJS(Integer YKGTJS) {
        this.YKGTJS = YKGTJS;
    }

    public Integer getZJTJS() {
        return ZJTJS;
    }

    public void setZJTJS(Integer ZJTJS) {
        this.ZJTJS = ZJTJS;
    }

    public Integer getYJGTJS() {
        return YJGTJS;
    }

    public void setYJGTJS(Integer YJGTJS) {
        this.YJGTJS = YJGTJS;
    }

    public Integer getYFPTJS() {
        return YFPTJS;
    }

    public void setYFPTJS(Integer YFPTJS) {
        this.YFPTJS = YFPTJS;
    }

    public String getBYWHDW() {
        return BYWHDW;
    }

    public void setBYWHDW(String BYWHDW) {
        this.BYWHDW = BYWHDW;
    }

    public Date getJFSYRQ() {
        return JFSYRQ;
    }

    public void setJFSYRQ(Date JFSYRQ) {
        this.JFSYRQ = JFSYRQ;
    }

    public String getZJLY() {
        return ZJLY;
    }

    public void setZJLY(String ZJLY) {
        this.ZJLY = ZJLY;
    }

    public Date getTDHQSJ() {
        return TDHQSJ;
    }

    public void setTDHQSJ(Date TDHQSJ) {
        this.TDHQSJ = TDHQSJ;
    }

    public BigDecimal getTDFY() {
        return TDFY;
    }

    public void setTDFY(BigDecimal TDFY) {
        this.TDFY = TDFY;
    }

    public BigDecimal getJZMJ() {
        return JZMJ;
    }

    public void setJZMJ(BigDecimal JZMJ) {
        this.JZMJ = JZMJ;
    }

    public String getCQSYR() {
        return CQSYR;
    }

    public void setCQSYR(String CQSYR) {
        this.CQSYR = CQSYR;
    }

    public String getCQZBH() {
        return CQZBH;
    }

    public void setCQZBH(String CQZBH) {
        this.CQZBH = CQZBH;
    }

    public String getJHLB() {
        return JHLB;
    }

    public void setJHLB(String JHLB) {
        this.JHLB = JHLB;
    }

    public Date getLRJHND() {
        return LRJHND;
    }

    public void setLRJHND(Date LRJHND) {
        this.LRJHND = LRJHND;
    }

    public BigDecimal getZTZ() {
        return ZTZ;
    }

    public void setZTZ(BigDecimal ZTZ) {
        this.ZTZ = ZTZ;
    }

    public String getXMFZR() {
        return XMFZR;
    }

    public void setXMFZR(String XMFZR) {
        this.XMFZR = XMFZR;
    }

    public String getJSDWMC() {
        return JSDWMC;
    }

    public void setJSDWMC(String JSDWMC) {
        this.JSDWMC = JSDWMC;
    }

    public String getJSDWZZJGDM() {
        return JSDWZZJGDM;
    }

    public void setJSDWZZJGDM(String JSDWZZJGDM) {
        this.JSDWZZJGDM = JSDWZZJGDM;
    }

    public BigDecimal getPTGJMJ() {
        return PTGJMJ;
    }

    public void setPTGJMJ(BigDecimal PTGJMJ) {
        this.PTGJMJ = PTGJMJ;
    }

    public BigDecimal getPTSYYFMJ() {
        return PTSYYFMJ;
    }

    public void setPTSYYFMJ(BigDecimal PTSYYFMJ) {
        this.PTSYYFMJ = PTSYYFMJ;
    }

    public String getTZZT() {
        return TZZT;
    }

    public void setTZZT(String TZZT) {
        this.TZZT = TZZT;
    }

    public String getXMLY() {
        return XMLY;
    }

    public void setXMLY(String XMLY) {
        this.XMLY = XMLY;
    }

    public String getGHCODE() {
        return GHCODE;
    }

    public void setGHCODE(String GHCODE) {
        this.GHCODE = GHCODE;
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
        TpoXmxx other = (TpoXmxx) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
                && (this.getCODE() == null ? other.getCODE() == null : this.getCODE().equals(other.getCODE()))
                && (this.getXQMC() == null ? other.getXQMC() == null : this.getXQMC().equals(other.getXQMC()))
                && (this.getZL() == null ? other.getZL() == null : this.getZL().equals(other.getZL()))
                && (this.getXMBM() == null ? other.getXMBM() == null : this.getXMBM().equals(other.getXMBM()))
                && (this.getNDJHID() == null ? other.getNDJHID() == null : this.getNDJHID().equals(other.getNDJHID()))
                && (this.getXMMC() == null ? other.getXMMC() == null : this.getXMMC().equals(other.getXMMC()))
                && (this.getXMZL() == null ? other.getXMZL() == null : this.getXMZL().equals(other.getXMZL()))
                && (this.getJSFS() == null ? other.getJSFS() == null : this.getJSFS().equals(other.getJSFS()))
                && (this.getZB() == null ? other.getZB() == null : this.getZB().equals(other.getZB()))
                && (this.getJD() == null ? other.getJD() == null : this.getJD().equals(other.getJD()))
                && (this.getWD() == null ? other.getWD() == null : this.getWD().equals(other.getWD()))
                && (this.getBZLX() == null ? other.getBZLX() == null : this.getBZLX().equals(other.getBZLX()))
                && (this.getTDQDFS() == null ? other.getTDQDFS() == null : this.getTDQDFS().equals(other.getTDQDFS()))
                && (this.getTDMJ() == null ? other.getTDMJ() == null : this.getTDMJ().equals(other.getTDMJ()))
                && (this.getSZCQ() == null ? other.getSZCQ() == null : this.getSZCQ().equals(other.getSZCQ()))
                && (this.getSZCS() == null ? other.getSZCS() == null : this.getSZCS().equals(other.getSZCS()))
                && (this.getXMXZ() == null ? other.getXMXZ() == null : this.getXMXZ().equals(other.getXMXZ()))
                && (this.getXMKGSJ() == null ? other.getXMKGSJ() == null : this.getXMKGSJ().equals(other.getXMKGSJ()))
                && (this.getXMJGSJ() == null ? other.getXMJGSJ() == null : this.getXMJGSJ().equals(other.getXMJGSJ()))
                && (this.getJGJSRQ() == null ? other.getJGJSRQ() == null : this.getJGJSRQ().equals(other.getJGJSRQ()))
                && (this.getYKGTJS() == null ? other.getYKGTJS() == null : this.getYKGTJS().equals(other.getYKGTJS()))
                && (this.getZJTJS() == null ? other.getZJTJS() == null : this.getZJTJS().equals(other.getZJTJS()))
                && (this.getYJGTJS() == null ? other.getYJGTJS() == null : this.getYJGTJS().equals(other.getYJGTJS()))
                && (this.getYFPTJS() == null ? other.getYFPTJS() == null : this.getYFPTJS().equals(other.getYFPTJS()))
                && (this.getBYWHDW() == null ? other.getBYWHDW() == null : this.getBYWHDW().equals(other.getBYWHDW()))
                && (this.getJFSYRQ() == null ? other.getJFSYRQ() == null : this.getJFSYRQ().equals(other.getJFSYRQ()))
                && (this.getZJLY() == null ? other.getZJLY() == null : this.getZJLY().equals(other.getZJLY()))
                && (this.getTDHQSJ() == null ? other.getTDHQSJ() == null : this.getTDHQSJ().equals(other.getTDHQSJ()))
                && (this.getTDFY() == null ? other.getTDFY() == null : this.getTDFY().equals(other.getTDFY()))
                && (this.getJZMJ() == null ? other.getJZMJ() == null : this.getJZMJ().equals(other.getJZMJ()))
                && (this.getCQSYR() == null ? other.getCQSYR() == null : this.getCQSYR().equals(other.getCQSYR()))
                && (this.getCQZBH() == null ? other.getCQZBH() == null : this.getCQZBH().equals(other.getCQZBH()))
                && (this.getJHLB() == null ? other.getJHLB() == null : this.getJHLB().equals(other.getJHLB()))
                && (this.getLRJHND() == null ? other.getLRJHND() == null : this.getLRJHND().equals(other.getLRJHND()))
                && (this.getZTZ() == null ? other.getZTZ() == null : this.getZTZ().equals(other.getZTZ()))
                && (this.getXMFZR() == null ? other.getXMFZR() == null : this.getXMFZR().equals(other.getXMFZR()))
                && (this.getJSDWMC() == null ? other.getJSDWMC() == null : this.getJSDWMC().equals(other.getJSDWMC()))
                && (this.getJSDWZZJGDM() == null ? other.getJSDWZZJGDM() == null : this.getJSDWZZJGDM().equals(other.getJSDWZZJGDM()))
                && (this.getPTGJMJ() == null ? other.getPTGJMJ() == null : this.getPTGJMJ().equals(other.getPTGJMJ()))
                && (this.getPTSYYFMJ() == null ? other.getPTSYYFMJ() == null : this.getPTSYYFMJ().equals(other.getPTSYYFMJ()))
                && (this.getTZZT() == null ? other.getTZZT() == null : this.getTZZT().equals(other.getTZZT()))
                && (this.getXMLY() == null ? other.getXMLY() == null : this.getXMLY().equals(other.getXMLY()))
                && (this.getGHCODE() == null ? other.getGHCODE() == null : this.getGHCODE().equals(other.getGHCODE()))
                && (this.getSORT_NUM() == null ? other.getSORT_NUM() == null : this.getSORT_NUM().equals(other.getSORT_NUM()))
                && (this.getDATA_VERSION() == null ? other.getDATA_VERSION() == null : this.getDATA_VERSION().equals(other.getDATA_VERSION()))
                && (this.getCREATOR() == null ? other.getCREATOR() == null : this.getCREATOR().equals(other.getCREATOR()))
                && (this.getCREATE_TIME() == null ? other.getCREATE_TIME() == null : this.getCREATE_TIME().equals(other.getCREATE_TIME()))
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
        result = prime * result + ((getCODE() == null) ? 0 : getCODE().hashCode());
        result = prime * result + ((getXQMC() == null) ? 0 : getXQMC().hashCode());
        result = prime * result + ((getZL() == null) ? 0 : getZL().hashCode());
        result = prime * result + ((getXMBM() == null) ? 0 : getXMBM().hashCode());
        result = prime * result + ((getNDJHID() == null) ? 0 : getNDJHID().hashCode());
        result = prime * result + ((getXMMC() == null) ? 0 : getXMMC().hashCode());
        result = prime * result + ((getXMZL() == null) ? 0 : getXMZL().hashCode());
        result = prime * result + ((getJSFS() == null) ? 0 : getJSFS().hashCode());
        result = prime * result + ((getZB() == null) ? 0 : getZB().hashCode());
        result = prime * result + ((getJD() == null) ? 0 : getJD().hashCode());
        result = prime * result + ((getWD() == null) ? 0 : getWD().hashCode());
        result = prime * result + ((getBZLX() == null) ? 0 : getBZLX().hashCode());
        result = prime * result + ((getTDQDFS() == null) ? 0 : getTDQDFS().hashCode());
        result = prime * result + ((getTDMJ() == null) ? 0 : getTDMJ().hashCode());
        result = prime * result + ((getSZCQ() == null) ? 0 : getSZCQ().hashCode());
        result = prime * result + ((getSZCS() == null) ? 0 : getSZCS().hashCode());
        result = prime * result + ((getXMXZ() == null) ? 0 : getXMXZ().hashCode());
        result = prime * result + ((getXMKGSJ() == null) ? 0 : getXMKGSJ().hashCode());
        result = prime * result + ((getXMJGSJ() == null) ? 0 : getXMJGSJ().hashCode());
        result = prime * result + ((getJGJSRQ() == null) ? 0 : getJGJSRQ().hashCode());
        result = prime * result + ((getYKGTJS() == null) ? 0 : getYKGTJS().hashCode());
        result = prime * result + ((getZJTJS() == null) ? 0 : getZJTJS().hashCode());
        result = prime * result + ((getYJGTJS() == null) ? 0 : getYJGTJS().hashCode());
        result = prime * result + ((getYFPTJS() == null) ? 0 : getYFPTJS().hashCode());
        result = prime * result + ((getBYWHDW() == null) ? 0 : getBYWHDW().hashCode());
        result = prime * result + ((getJFSYRQ() == null) ? 0 : getJFSYRQ().hashCode());
        result = prime * result + ((getZJLY() == null) ? 0 : getZJLY().hashCode());
        result = prime * result + ((getTDHQSJ() == null) ? 0 : getTDHQSJ().hashCode());
        result = prime * result + ((getTDFY() == null) ? 0 : getTDFY().hashCode());
        result = prime * result + ((getJZMJ() == null) ? 0 : getJZMJ().hashCode());
        result = prime * result + ((getCQSYR() == null) ? 0 : getCQSYR().hashCode());
        result = prime * result + ((getCQZBH() == null) ? 0 : getCQZBH().hashCode());
        result = prime * result + ((getJHLB() == null) ? 0 : getJHLB().hashCode());
        result = prime * result + ((getLRJHND() == null) ? 0 : getLRJHND().hashCode());
        result = prime * result + ((getZTZ() == null) ? 0 : getZTZ().hashCode());
        result = prime * result + ((getXMFZR() == null) ? 0 : getXMFZR().hashCode());
        result = prime * result + ((getJSDWMC() == null) ? 0 : getJSDWMC().hashCode());
        result = prime * result + ((getJSDWZZJGDM() == null) ? 0 : getJSDWZZJGDM().hashCode());
        result = prime * result + ((getPTGJMJ() == null) ? 0 : getPTGJMJ().hashCode());
        result = prime * result + ((getPTSYYFMJ() == null) ? 0 : getPTSYYFMJ().hashCode());
        result = prime * result + ((getTZZT() == null) ? 0 : getTZZT().hashCode());
        result = prime * result + ((getXMLY() == null) ? 0 : getXMLY().hashCode());
        result = prime * result + ((getGHCODE() == null) ? 0 : getGHCODE().hashCode());
        result = prime * result + ((getSORT_NUM() == null) ? 0 : getSORT_NUM().hashCode());
        result = prime * result + ((getDATA_VERSION() == null) ? 0 : getDATA_VERSION().hashCode());
        result = prime * result + ((getCREATOR() == null) ? 0 : getCREATOR().hashCode());
        result = prime * result + ((getCREATE_TIME() == null) ? 0 : getCREATE_TIME().hashCode());
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
        sb.append(", CODE=").append(CODE);
        sb.append(", XQMC=").append(XQMC);
        sb.append(", ZL=").append(ZL);
        sb.append(", XMBM=").append(XMBM);
        sb.append(", NDJHID=").append(NDJHID);
        sb.append(", XMMC=").append(XMMC);
        sb.append(", XMZL=").append(XMZL);
        sb.append(", JSFS=").append(JSFS);
        sb.append(", ZB=").append(ZB);
        sb.append(", JD=").append(JD);
        sb.append(", WD=").append(WD);
        sb.append(", BZLX=").append(BZLX);
        sb.append(", TDQDFS=").append(TDQDFS);
        sb.append(", TDMJ=").append(TDMJ);
        sb.append(", SZCQ=").append(SZCQ);
        sb.append(", SZCS=").append(SZCS);
        sb.append(", XMXZ=").append(XMXZ);
        sb.append(", XMKGSJ=").append(XMKGSJ);
        sb.append(", XMJGSJ=").append(XMJGSJ);
        sb.append(", JGJSRQ=").append(JGJSRQ);
        sb.append(", YKGTJS=").append(YKGTJS);
        sb.append(", ZJTJS=").append(ZJTJS);
        sb.append(", YJGTJS=").append(YJGTJS);
        sb.append(", YFPTJS=").append(YFPTJS);
        sb.append(", BYWHDW=").append(BYWHDW);
        sb.append(", JFSYRQ=").append(JFSYRQ);
        sb.append(", ZJLY=").append(ZJLY);
        sb.append(", TDHQSJ=").append(TDHQSJ);
        sb.append(", TDFY=").append(TDFY);
        sb.append(", JZMJ=").append(JZMJ);
        sb.append(", CQSYR=").append(CQSYR);
        sb.append(", CQZBH=").append(CQZBH);
        sb.append(", JHLB=").append(JHLB);
        sb.append(", LRJHND=").append(LRJHND);
        sb.append(", ZTZ=").append(ZTZ);
        sb.append(", XMFZR=").append(XMFZR);
        sb.append(", JSDWMC=").append(JSDWMC);
        sb.append(", JSDWZZJGDM=").append(JSDWZZJGDM);
        sb.append(", PTGJMJ=").append(PTGJMJ);
        sb.append(", PTSYYFMJ=").append(PTSYYFMJ);
        sb.append(", TZZT=").append(TZZT);
        sb.append(", XMLY=").append(XMLY);
        sb.append(", GHCODE=").append(GHCODE);
        sb.append(", SORT_NUM=").append(SORT_NUM);
        sb.append(", DATA_VERSION=").append(DATA_VERSION);
        sb.append(", CREATOR=").append(CREATOR);
        sb.append(", CREATE_TIME=").append(CREATE_TIME);
        sb.append(", UPDATOR=").append(UPDATOR);
        sb.append(", UPDATE_TIME=").append(UPDATE_TIME);
        sb.append(", YXBZ=").append(YXBZ);
        sb.append(", COMMENTS=").append(COMMENTS);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
