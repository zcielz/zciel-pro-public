package cn.zciel.model;

import java.io.Serializable;
import java.util.Date;

/**
 * tpo_fyzt
 *
 * @author
 */
public class TpoFyzt implements Serializable {
    /**
     * 主键ID
     */
    private String ID;

    /**
     * 配租状态
     */
    private Short PZZT;

    /**
     * 占用状态
     */
    private Short ZYZT;

    /**
     * 冻结状态
     */
    private Short DJZT;

    /**
     * 分配状态
     */
    private String FPZT;

    /**
     * 入库标志
     */
    private Short RKBZ;

    /**
     * 冻结原因
     */
    private String DJYY;

    /**
     * 使用状态(正常使用、逾期在用、闲置)
     */
    private String SYZT;

    /**
     * 租金状态(待缴、欠租、已缴)
     */
    private String ZJZT;

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

    private static final long serialVersionUID = 1L;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Short getPZZT() {
        return PZZT;
    }

    public void setPZZT(Short PZZT) {
        this.PZZT = PZZT;
    }

    public Short getZYZT() {
        return ZYZT;
    }

    public void setZYZT(Short ZYZT) {
        this.ZYZT = ZYZT;
    }

    public Short getDJZT() {
        return DJZT;
    }

    public void setDJZT(Short DJZT) {
        this.DJZT = DJZT;
    }

    public String getFPZT() {
        return FPZT;
    }

    public void setFPZT(String FPZT) {
        this.FPZT = FPZT;
    }

    public Short getRKBZ() {
        return RKBZ;
    }

    public void setRKBZ(Short RKBZ) {
        this.RKBZ = RKBZ;
    }

    public String getDJYY() {
        return DJYY;
    }

    public void setDJYY(String DJYY) {
        this.DJYY = DJYY;
    }

    public String getSYZT() {
        return SYZT;
    }

    public void setSYZT(String SYZT) {
        this.SYZT = SYZT;
    }

    public String getZJZT() {
        return ZJZT;
    }

    public void setZJZT(String ZJZT) {
        this.ZJZT = ZJZT;
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
        TpoFyzt other = (TpoFyzt) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
                && (this.getPZZT() == null ? other.getPZZT() == null : this.getPZZT().equals(other.getPZZT()))
                && (this.getZYZT() == null ? other.getZYZT() == null : this.getZYZT().equals(other.getZYZT()))
                && (this.getDJZT() == null ? other.getDJZT() == null : this.getDJZT().equals(other.getDJZT()))
                && (this.getFPZT() == null ? other.getFPZT() == null : this.getFPZT().equals(other.getFPZT()))
                && (this.getRKBZ() == null ? other.getRKBZ() == null : this.getRKBZ().equals(other.getRKBZ()))
                && (this.getDJYY() == null ? other.getDJYY() == null : this.getDJYY().equals(other.getDJYY()))
                && (this.getSYZT() == null ? other.getSYZT() == null : this.getSYZT().equals(other.getSYZT()))
                && (this.getZJZT() == null ? other.getZJZT() == null : this.getZJZT().equals(other.getZJZT()))
                && (this.getSZCS() == null ? other.getSZCS() == null : this.getSZCS().equals(other.getSZCS()))
                && (this.getSZCQ() == null ? other.getSZCQ() == null : this.getSZCQ().equals(other.getSZCQ()))
                && (this.getSORT_NUM() == null ? other.getSORT_NUM() == null : this.getSORT_NUM().equals(other.getSORT_NUM()))
                && (this.getDATA_VERSION() == null ? other.getDATA_VERSION() == null : this.getDATA_VERSION().equals(other.getDATA_VERSION()))
                && (this.getCREATOR() == null ? other.getCREATOR() == null : this.getCREATOR().equals(other.getCREATOR()))
                && (this.getCREATE_TIME() == null ? other.getCREATE_TIME() == null : this.getCREATE_TIME().equals(other.getCREATE_TIME()))
                && (this.getUPDATOR() == null ? other.getUPDATOR() == null : this.getUPDATOR().equals(other.getUPDATOR()))
                && (this.getUPDATE_TIME() == null ? other.getUPDATE_TIME() == null : this.getUPDATE_TIME().equals(other.getUPDATE_TIME()))
                && (this.getYXBZ() == null ? other.getYXBZ() == null : this.getYXBZ().equals(other.getYXBZ()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getPZZT() == null) ? 0 : getPZZT().hashCode());
        result = prime * result + ((getZYZT() == null) ? 0 : getZYZT().hashCode());
        result = prime * result + ((getDJZT() == null) ? 0 : getDJZT().hashCode());
        result = prime * result + ((getFPZT() == null) ? 0 : getFPZT().hashCode());
        result = prime * result + ((getRKBZ() == null) ? 0 : getRKBZ().hashCode());
        result = prime * result + ((getDJYY() == null) ? 0 : getDJYY().hashCode());
        result = prime * result + ((getSYZT() == null) ? 0 : getSYZT().hashCode());
        result = prime * result + ((getZJZT() == null) ? 0 : getZJZT().hashCode());
        result = prime * result + ((getSZCS() == null) ? 0 : getSZCS().hashCode());
        result = prime * result + ((getSZCQ() == null) ? 0 : getSZCQ().hashCode());
        result = prime * result + ((getSORT_NUM() == null) ? 0 : getSORT_NUM().hashCode());
        result = prime * result + ((getDATA_VERSION() == null) ? 0 : getDATA_VERSION().hashCode());
        result = prime * result + ((getCREATOR() == null) ? 0 : getCREATOR().hashCode());
        result = prime * result + ((getCREATE_TIME() == null) ? 0 : getCREATE_TIME().hashCode());
        result = prime * result + ((getUPDATOR() == null) ? 0 : getUPDATOR().hashCode());
        result = prime * result + ((getUPDATE_TIME() == null) ? 0 : getUPDATE_TIME().hashCode());
        result = prime * result + ((getYXBZ() == null) ? 0 : getYXBZ().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", PZZT=").append(PZZT);
        sb.append(", ZYZT=").append(ZYZT);
        sb.append(", DJZT=").append(DJZT);
        sb.append(", FPZT=").append(FPZT);
        sb.append(", RKBZ=").append(RKBZ);
        sb.append(", DJYY=").append(DJYY);
        sb.append(", SYZT=").append(SYZT);
        sb.append(", ZJZT=").append(ZJZT);
        sb.append(", SZCS=").append(SZCS);
        sb.append(", SZCQ=").append(SZCQ);
        sb.append(", SORT_NUM=").append(SORT_NUM);
        sb.append(", DATA_VERSION=").append(DATA_VERSION);
        sb.append(", CREATOR=").append(CREATOR);
        sb.append(", CREATE_TIME=").append(CREATE_TIME);
        sb.append(", UPDATOR=").append(UPDATOR);
        sb.append(", UPDATE_TIME=").append(UPDATE_TIME);
        sb.append(", YXBZ=").append(YXBZ);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
