package cn.zciel.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * tpo_zrz
 *
 * @author
 */
public class TpoZrz implements Serializable {
    /**
     * 主键ID
     */
    private String ID;

    /**
     * CODE
     */
    private String CODE;

    /**
     * 自然幢号
     */
    private String ZRZH;

    /**
     * 施工幢号
     */
    private String SGZH;

    /**
     * 测绘类型
     */
    private String CHLX;

    /**
     * 项目ID
     */
    private String XMID;

    /**
     * 项目CODE
     */
    private String XMCODE;

    /**
     * 自然幢坐落
     */
    private String ZRZZL;

    /**
     * 幢名称
     */
    private String ZMC;

    /**
     * 总层数
     */
    private String ZCS;

    /**
     * 建成年份
     */
    private Date JZNF;

    /**
     * 总套数
     */
    private Integer ZTS;

    /**
     * 地上层数
     */
    private Integer DSCS;

    /**
     * 地下层数
     */
    private Integer DXCS;

    /**
     * 总建筑面积
     */
    private BigDecimal ZJZMJ;

    /**
     * 占地面积
     */
    private BigDecimal ZDMJ;

    /**
     * 地上面积
     */
    private BigDecimal DSMJ;

    /**
     * 地下面积
     */
    private BigDecimal DXMJ;

    /**
     * 其他面积
     */
    private BigDecimal QTMJ;

    /**
     * 建筑结构
     */
    private String JZJG;

    /**
     * 竣工日期
     */
    private Date JGRQ;

    /**
     * 指北针角度
     */
    private Integer ZBZJD;

    /**
     * 测绘单位名称
     */
    private String CHDWMC;

    /**
     * 幢统一编号
     */
    private String ZTYBH;

    /**
     * 开发企业CODE
     */
    private String KFQYCODE;

    /**
     * 东墙界
     */
    private String EQJ;

    /**
     * 南墙界
     */
    private String SQJ;

    /**
     * 西墙界
     */
    private String WQJ;

    /**
     * 北墙界
     */
    private String NQJ;

    /**
     * 坐标
     */
    private String GISZB;

    /**
     * 自然幢序列号
     */
    private String ZRZXLH;

    /**
     * 幢内码
     */
    private String ZID;

    /**
     * 所在城市
     */
    private String SZCS;

    /**
     * 所在城区
     */
    private String SZCQ;

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

    public String getZRZH() {
        return ZRZH;
    }

    public void setZRZH(String ZRZH) {
        this.ZRZH = ZRZH;
    }

    public String getSGZH() {
        return SGZH;
    }

    public void setSGZH(String SGZH) {
        this.SGZH = SGZH;
    }

    public String getCHLX() {
        return CHLX;
    }

    public void setCHLX(String CHLX) {
        this.CHLX = CHLX;
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

    public String getZRZZL() {
        return ZRZZL;
    }

    public void setZRZZL(String ZRZZL) {
        this.ZRZZL = ZRZZL;
    }

    public String getZMC() {
        return ZMC;
    }

    public void setZMC(String ZMC) {
        this.ZMC = ZMC;
    }

    public String getZCS() {
        return ZCS;
    }

    public void setZCS(String ZCS) {
        this.ZCS = ZCS;
    }

    public Date getJZNF() {
        return JZNF;
    }

    public void setJZNF(Date JZNF) {
        this.JZNF = JZNF;
    }

    public Integer getZTS() {
        return ZTS;
    }

    public void setZTS(Integer ZTS) {
        this.ZTS = ZTS;
    }

    public Integer getDSCS() {
        return DSCS;
    }

    public void setDSCS(Integer DSCS) {
        this.DSCS = DSCS;
    }

    public Integer getDXCS() {
        return DXCS;
    }

    public void setDXCS(Integer DXCS) {
        this.DXCS = DXCS;
    }

    public BigDecimal getZJZMJ() {
        return ZJZMJ;
    }

    public void setZJZMJ(BigDecimal ZJZMJ) {
        this.ZJZMJ = ZJZMJ;
    }

    public BigDecimal getZDMJ() {
        return ZDMJ;
    }

    public void setZDMJ(BigDecimal ZDMJ) {
        this.ZDMJ = ZDMJ;
    }

    public BigDecimal getDSMJ() {
        return DSMJ;
    }

    public void setDSMJ(BigDecimal DSMJ) {
        this.DSMJ = DSMJ;
    }

    public BigDecimal getDXMJ() {
        return DXMJ;
    }

    public void setDXMJ(BigDecimal DXMJ) {
        this.DXMJ = DXMJ;
    }

    public BigDecimal getQTMJ() {
        return QTMJ;
    }

    public void setQTMJ(BigDecimal QTMJ) {
        this.QTMJ = QTMJ;
    }

    public String getJZJG() {
        return JZJG;
    }

    public void setJZJG(String JZJG) {
        this.JZJG = JZJG;
    }

    public Date getJGRQ() {
        return JGRQ;
    }

    public void setJGRQ(Date JGRQ) {
        this.JGRQ = JGRQ;
    }

    public Integer getZBZJD() {
        return ZBZJD;
    }

    public void setZBZJD(Integer ZBZJD) {
        this.ZBZJD = ZBZJD;
    }

    public String getCHDWMC() {
        return CHDWMC;
    }

    public void setCHDWMC(String CHDWMC) {
        this.CHDWMC = CHDWMC;
    }

    public String getZTYBH() {
        return ZTYBH;
    }

    public void setZTYBH(String ZTYBH) {
        this.ZTYBH = ZTYBH;
    }

    public String getKFQYCODE() {
        return KFQYCODE;
    }

    public void setKFQYCODE(String KFQYCODE) {
        this.KFQYCODE = KFQYCODE;
    }

    public String getEQJ() {
        return EQJ;
    }

    public void setEQJ(String EQJ) {
        this.EQJ = EQJ;
    }

    public String getSQJ() {
        return SQJ;
    }

    public void setSQJ(String SQJ) {
        this.SQJ = SQJ;
    }

    public String getWQJ() {
        return WQJ;
    }

    public void setWQJ(String WQJ) {
        this.WQJ = WQJ;
    }

    public String getNQJ() {
        return NQJ;
    }

    public void setNQJ(String NQJ) {
        this.NQJ = NQJ;
    }

    public String getGISZB() {
        return GISZB;
    }

    public void setGISZB(String GISZB) {
        this.GISZB = GISZB;
    }

    public String getZRZXLH() {
        return ZRZXLH;
    }

    public void setZRZXLH(String ZRZXLH) {
        this.ZRZXLH = ZRZXLH;
    }

    public String getZID() {
        return ZID;
    }

    public void setZID(String ZID) {
        this.ZID = ZID;
    }

    public String getSZCS() {
        return SZCS;
    }

    public void setSZCS(String SZCS) {
        this.SZCS = SZCS;
    }

    public String getSZCQ() {
        return SZCQ;
    }

    public void setSZCQ(String SZCQ) {
        this.SZCQ = SZCQ;
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
        TpoZrz other = (TpoZrz) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
                && (this.getCODE() == null ? other.getCODE() == null : this.getCODE().equals(other.getCODE()))
                && (this.getZRZH() == null ? other.getZRZH() == null : this.getZRZH().equals(other.getZRZH()))
                && (this.getSGZH() == null ? other.getSGZH() == null : this.getSGZH().equals(other.getSGZH()))
                && (this.getCHLX() == null ? other.getCHLX() == null : this.getCHLX().equals(other.getCHLX()))
                && (this.getXMID() == null ? other.getXMID() == null : this.getXMID().equals(other.getXMID()))
                && (this.getXMCODE() == null ? other.getXMCODE() == null : this.getXMCODE().equals(other.getXMCODE()))
                && (this.getZRZZL() == null ? other.getZRZZL() == null : this.getZRZZL().equals(other.getZRZZL()))
                && (this.getZMC() == null ? other.getZMC() == null : this.getZMC().equals(other.getZMC()))
                && (this.getZCS() == null ? other.getZCS() == null : this.getZCS().equals(other.getZCS()))
                && (this.getJZNF() == null ? other.getJZNF() == null : this.getJZNF().equals(other.getJZNF()))
                && (this.getZTS() == null ? other.getZTS() == null : this.getZTS().equals(other.getZTS()))
                && (this.getDSCS() == null ? other.getDSCS() == null : this.getDSCS().equals(other.getDSCS()))
                && (this.getDXCS() == null ? other.getDXCS() == null : this.getDXCS().equals(other.getDXCS()))
                && (this.getZJZMJ() == null ? other.getZJZMJ() == null : this.getZJZMJ().equals(other.getZJZMJ()))
                && (this.getZDMJ() == null ? other.getZDMJ() == null : this.getZDMJ().equals(other.getZDMJ()))
                && (this.getDSMJ() == null ? other.getDSMJ() == null : this.getDSMJ().equals(other.getDSMJ()))
                && (this.getDXMJ() == null ? other.getDXMJ() == null : this.getDXMJ().equals(other.getDXMJ()))
                && (this.getQTMJ() == null ? other.getQTMJ() == null : this.getQTMJ().equals(other.getQTMJ()))
                && (this.getJZJG() == null ? other.getJZJG() == null : this.getJZJG().equals(other.getJZJG()))
                && (this.getJGRQ() == null ? other.getJGRQ() == null : this.getJGRQ().equals(other.getJGRQ()))
                && (this.getZBZJD() == null ? other.getZBZJD() == null : this.getZBZJD().equals(other.getZBZJD()))
                && (this.getCHDWMC() == null ? other.getCHDWMC() == null : this.getCHDWMC().equals(other.getCHDWMC()))
                && (this.getZTYBH() == null ? other.getZTYBH() == null : this.getZTYBH().equals(other.getZTYBH()))
                && (this.getKFQYCODE() == null ? other.getKFQYCODE() == null : this.getKFQYCODE().equals(other.getKFQYCODE()))
                && (this.getEQJ() == null ? other.getEQJ() == null : this.getEQJ().equals(other.getEQJ()))
                && (this.getSQJ() == null ? other.getSQJ() == null : this.getSQJ().equals(other.getSQJ()))
                && (this.getWQJ() == null ? other.getWQJ() == null : this.getWQJ().equals(other.getWQJ()))
                && (this.getNQJ() == null ? other.getNQJ() == null : this.getNQJ().equals(other.getNQJ()))
                && (this.getGISZB() == null ? other.getGISZB() == null : this.getGISZB().equals(other.getGISZB()))
                && (this.getZRZXLH() == null ? other.getZRZXLH() == null : this.getZRZXLH().equals(other.getZRZXLH()))
                && (this.getZID() == null ? other.getZID() == null : this.getZID().equals(other.getZID()))
                && (this.getSZCS() == null ? other.getSZCS() == null : this.getSZCS().equals(other.getSZCS()))
                && (this.getSZCQ() == null ? other.getSZCQ() == null : this.getSZCQ().equals(other.getSZCQ()))
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
        result = prime * result + ((getZRZH() == null) ? 0 : getZRZH().hashCode());
        result = prime * result + ((getSGZH() == null) ? 0 : getSGZH().hashCode());
        result = prime * result + ((getCHLX() == null) ? 0 : getCHLX().hashCode());
        result = prime * result + ((getXMID() == null) ? 0 : getXMID().hashCode());
        result = prime * result + ((getXMCODE() == null) ? 0 : getXMCODE().hashCode());
        result = prime * result + ((getZRZZL() == null) ? 0 : getZRZZL().hashCode());
        result = prime * result + ((getZMC() == null) ? 0 : getZMC().hashCode());
        result = prime * result + ((getZCS() == null) ? 0 : getZCS().hashCode());
        result = prime * result + ((getJZNF() == null) ? 0 : getJZNF().hashCode());
        result = prime * result + ((getZTS() == null) ? 0 : getZTS().hashCode());
        result = prime * result + ((getDSCS() == null) ? 0 : getDSCS().hashCode());
        result = prime * result + ((getDXCS() == null) ? 0 : getDXCS().hashCode());
        result = prime * result + ((getZJZMJ() == null) ? 0 : getZJZMJ().hashCode());
        result = prime * result + ((getZDMJ() == null) ? 0 : getZDMJ().hashCode());
        result = prime * result + ((getDSMJ() == null) ? 0 : getDSMJ().hashCode());
        result = prime * result + ((getDXMJ() == null) ? 0 : getDXMJ().hashCode());
        result = prime * result + ((getQTMJ() == null) ? 0 : getQTMJ().hashCode());
        result = prime * result + ((getJZJG() == null) ? 0 : getJZJG().hashCode());
        result = prime * result + ((getJGRQ() == null) ? 0 : getJGRQ().hashCode());
        result = prime * result + ((getZBZJD() == null) ? 0 : getZBZJD().hashCode());
        result = prime * result + ((getCHDWMC() == null) ? 0 : getCHDWMC().hashCode());
        result = prime * result + ((getZTYBH() == null) ? 0 : getZTYBH().hashCode());
        result = prime * result + ((getKFQYCODE() == null) ? 0 : getKFQYCODE().hashCode());
        result = prime * result + ((getEQJ() == null) ? 0 : getEQJ().hashCode());
        result = prime * result + ((getSQJ() == null) ? 0 : getSQJ().hashCode());
        result = prime * result + ((getWQJ() == null) ? 0 : getWQJ().hashCode());
        result = prime * result + ((getNQJ() == null) ? 0 : getNQJ().hashCode());
        result = prime * result + ((getGISZB() == null) ? 0 : getGISZB().hashCode());
        result = prime * result + ((getZRZXLH() == null) ? 0 : getZRZXLH().hashCode());
        result = prime * result + ((getZID() == null) ? 0 : getZID().hashCode());
        result = prime * result + ((getSZCS() == null) ? 0 : getSZCS().hashCode());
        result = prime * result + ((getSZCQ() == null) ? 0 : getSZCQ().hashCode());
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
        sb.append(", ZRZH=").append(ZRZH);
        sb.append(", SGZH=").append(SGZH);
        sb.append(", CHLX=").append(CHLX);
        sb.append(", XMID=").append(XMID);
        sb.append(", XMCODE=").append(XMCODE);
        sb.append(", ZRZZL=").append(ZRZZL);
        sb.append(", ZMC=").append(ZMC);
        sb.append(", ZCS=").append(ZCS);
        sb.append(", JZNF=").append(JZNF);
        sb.append(", ZTS=").append(ZTS);
        sb.append(", DSCS=").append(DSCS);
        sb.append(", DXCS=").append(DXCS);
        sb.append(", ZJZMJ=").append(ZJZMJ);
        sb.append(", ZDMJ=").append(ZDMJ);
        sb.append(", DSMJ=").append(DSMJ);
        sb.append(", DXMJ=").append(DXMJ);
        sb.append(", QTMJ=").append(QTMJ);
        sb.append(", JZJG=").append(JZJG);
        sb.append(", JGRQ=").append(JGRQ);
        sb.append(", ZBZJD=").append(ZBZJD);
        sb.append(", CHDWMC=").append(CHDWMC);
        sb.append(", ZTYBH=").append(ZTYBH);
        sb.append(", KFQYCODE=").append(KFQYCODE);
        sb.append(", EQJ=").append(EQJ);
        sb.append(", SQJ=").append(SQJ);
        sb.append(", WQJ=").append(WQJ);
        sb.append(", NQJ=").append(NQJ);
        sb.append(", GISZB=").append(GISZB);
        sb.append(", ZRZXLH=").append(ZRZXLH);
        sb.append(", ZID=").append(ZID);
        sb.append(", SZCS=").append(SZCS);
        sb.append(", SZCQ=").append(SZCQ);
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
