package cn.zciel.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * tpo_jtfmx
 *
 * @author
 */
public class TpoJtfmx implements Serializable {
    /**
     * 主键ID
     */
    private String ID;

    /**
     * 申请人账号
     */
    private String SQRZH;

    /**
     * 缴退费金额
     */
    private BigDecimal JTJE;

    /**
     * 发票号
     */
    private String FPH;

    /**
     * 缴费类型（缴租金押金）
     */
    private String JFLX;

    /**
     * 缴费时间起
     */
    private Date JFSJQ;

    /**
     * 缴费时间止
     */
    private Date JFSJZ;

    /**
     * 退费原因
     */
    private String TFYY;

    /**
     * 出账期
     */
    private String CZQ;

    /**
     * 缴费方式（按月按季）
     */
    private String JFFS;

    /**
     * 配租ID
     */
    private String PZID;

    /**
     * 配租CODE
     */
    private String PZCODE;

    /**
     * 发票代码
     */
    private String FPDM;

    /**
     * 收据编号
     */
    private String SJBH;

    /**
     * 收缴窗口ID
     */
    private String SJCKID;

    /**
     * 纳税人识别号
     */
    private String NSRSBH;

    /**
     * 缴费状态（待缴已缴）
     */
    private String JFZT;

    /**
     * 缴费途径（支付宝）
     */
    private String JFTJ;

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

    public String getSQRZH() {
        return SQRZH;
    }

    public void setSQRZH(String SQRZH) {
        this.SQRZH = SQRZH;
    }

    public BigDecimal getJTJE() {
        return JTJE;
    }

    public void setJTJE(BigDecimal JTJE) {
        this.JTJE = JTJE;
    }

    public String getFPH() {
        return FPH;
    }

    public void setFPH(String FPH) {
        this.FPH = FPH;
    }

    public String getJFLX() {
        return JFLX;
    }

    public void setJFLX(String JFLX) {
        this.JFLX = JFLX;
    }

    public Date getJFSJQ() {
        return JFSJQ;
    }

    public void setJFSJQ(Date JFSJQ) {
        this.JFSJQ = JFSJQ;
    }

    public Date getJFSJZ() {
        return JFSJZ;
    }

    public void setJFSJZ(Date JFSJZ) {
        this.JFSJZ = JFSJZ;
    }

    public String getTFYY() {
        return TFYY;
    }

    public void setTFYY(String TFYY) {
        this.TFYY = TFYY;
    }

    public String getCZQ() {
        return CZQ;
    }

    public void setCZQ(String CZQ) {
        this.CZQ = CZQ;
    }

    public String getJFFS() {
        return JFFS;
    }

    public void setJFFS(String JFFS) {
        this.JFFS = JFFS;
    }

    public String getPZID() {
        return PZID;
    }

    public void setPZID(String PZID) {
        this.PZID = PZID;
    }

    public String getPZCODE() {
        return PZCODE;
    }

    public void setPZCODE(String PZCODE) {
        this.PZCODE = PZCODE;
    }

    public String getFPDM() {
        return FPDM;
    }

    public void setFPDM(String FPDM) {
        this.FPDM = FPDM;
    }

    public String getSJBH() {
        return SJBH;
    }

    public void setSJBH(String SJBH) {
        this.SJBH = SJBH;
    }

    public String getSJCKID() {
        return SJCKID;
    }

    public void setSJCKID(String SJCKID) {
        this.SJCKID = SJCKID;
    }

    public String getNSRSBH() {
        return NSRSBH;
    }

    public void setNSRSBH(String NSRSBH) {
        this.NSRSBH = NSRSBH;
    }

    public String getJFZT() {
        return JFZT;
    }

    public void setJFZT(String JFZT) {
        this.JFZT = JFZT;
    }

    public String getJFTJ() {
        return JFTJ;
    }

    public void setJFTJ(String JFTJ) {
        this.JFTJ = JFTJ;
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
        TpoJtfmx other = (TpoJtfmx) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
                && (this.getSQRZH() == null ? other.getSQRZH() == null : this.getSQRZH().equals(other.getSQRZH()))
                && (this.getJTJE() == null ? other.getJTJE() == null : this.getJTJE().equals(other.getJTJE()))
                && (this.getFPH() == null ? other.getFPH() == null : this.getFPH().equals(other.getFPH()))
                && (this.getJFLX() == null ? other.getJFLX() == null : this.getJFLX().equals(other.getJFLX()))
                && (this.getJFSJQ() == null ? other.getJFSJQ() == null : this.getJFSJQ().equals(other.getJFSJQ()))
                && (this.getJFSJZ() == null ? other.getJFSJZ() == null : this.getJFSJZ().equals(other.getJFSJZ()))
                && (this.getTFYY() == null ? other.getTFYY() == null : this.getTFYY().equals(other.getTFYY()))
                && (this.getCZQ() == null ? other.getCZQ() == null : this.getCZQ().equals(other.getCZQ()))
                && (this.getJFFS() == null ? other.getJFFS() == null : this.getJFFS().equals(other.getJFFS()))
                && (this.getPZID() == null ? other.getPZID() == null : this.getPZID().equals(other.getPZID()))
                && (this.getPZCODE() == null ? other.getPZCODE() == null : this.getPZCODE().equals(other.getPZCODE()))
                && (this.getFPDM() == null ? other.getFPDM() == null : this.getFPDM().equals(other.getFPDM()))
                && (this.getSJBH() == null ? other.getSJBH() == null : this.getSJBH().equals(other.getSJBH()))
                && (this.getSJCKID() == null ? other.getSJCKID() == null : this.getSJCKID().equals(other.getSJCKID()))
                && (this.getNSRSBH() == null ? other.getNSRSBH() == null : this.getNSRSBH().equals(other.getNSRSBH()))
                && (this.getJFZT() == null ? other.getJFZT() == null : this.getJFZT().equals(other.getJFZT()))
                && (this.getJFTJ() == null ? other.getJFTJ() == null : this.getJFTJ().equals(other.getJFTJ()))
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
        result = prime * result + ((getSQRZH() == null) ? 0 : getSQRZH().hashCode());
        result = prime * result + ((getJTJE() == null) ? 0 : getJTJE().hashCode());
        result = prime * result + ((getFPH() == null) ? 0 : getFPH().hashCode());
        result = prime * result + ((getJFLX() == null) ? 0 : getJFLX().hashCode());
        result = prime * result + ((getJFSJQ() == null) ? 0 : getJFSJQ().hashCode());
        result = prime * result + ((getJFSJZ() == null) ? 0 : getJFSJZ().hashCode());
        result = prime * result + ((getTFYY() == null) ? 0 : getTFYY().hashCode());
        result = prime * result + ((getCZQ() == null) ? 0 : getCZQ().hashCode());
        result = prime * result + ((getJFFS() == null) ? 0 : getJFFS().hashCode());
        result = prime * result + ((getPZID() == null) ? 0 : getPZID().hashCode());
        result = prime * result + ((getPZCODE() == null) ? 0 : getPZCODE().hashCode());
        result = prime * result + ((getFPDM() == null) ? 0 : getFPDM().hashCode());
        result = prime * result + ((getSJBH() == null) ? 0 : getSJBH().hashCode());
        result = prime * result + ((getSJCKID() == null) ? 0 : getSJCKID().hashCode());
        result = prime * result + ((getNSRSBH() == null) ? 0 : getNSRSBH().hashCode());
        result = prime * result + ((getJFZT() == null) ? 0 : getJFZT().hashCode());
        result = prime * result + ((getJFTJ() == null) ? 0 : getJFTJ().hashCode());
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
        sb.append(", SQRZH=").append(SQRZH);
        sb.append(", JTJE=").append(JTJE);
        sb.append(", FPH=").append(FPH);
        sb.append(", JFLX=").append(JFLX);
        sb.append(", JFSJQ=").append(JFSJQ);
        sb.append(", JFSJZ=").append(JFSJZ);
        sb.append(", TFYY=").append(TFYY);
        sb.append(", CZQ=").append(CZQ);
        sb.append(", JFFS=").append(JFFS);
        sb.append(", PZID=").append(PZID);
        sb.append(", PZCODE=").append(PZCODE);
        sb.append(", FPDM=").append(FPDM);
        sb.append(", SJBH=").append(SJBH);
        sb.append(", SJCKID=").append(SJCKID);
        sb.append(", NSRSBH=").append(NSRSBH);
        sb.append(", JFZT=").append(JFZT);
        sb.append(", JFTJ=").append(JFTJ);
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
