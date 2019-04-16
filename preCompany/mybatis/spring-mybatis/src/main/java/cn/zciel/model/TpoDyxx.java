package cn.zciel.model;

import java.io.Serializable;
import java.util.Date;

/**
 * tpo_dyxx
 *
 * @author
 */
public class TpoDyxx implements Serializable {
    /**
     * ID
     */
    private String ID;

    /**
     * 项目ID
     */
    private String XMID;

    /**
     * 项目CODE
     */
    private String XMCODE;

    /**
     * 幢ID
     */
    private String ZRZID;

    /**
     * 幢CODE
     */
    private String ZRZCODE;

    /**
     * 幢号
     */
    private String ZRZH;

    /**
     * 单元号
     */
    private String DYH;

    /**
     * 单元名称
     */
    private String DYMC;

    /**
     * 总层数
     */
    private Integer ZCS;

    /**
     * 项目名称
     */
    private String XMMC;

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

    public String getZRZH() {
        return ZRZH;
    }

    public void setZRZH(String ZRZH) {
        this.ZRZH = ZRZH;
    }

    public String getDYH() {
        return DYH;
    }

    public void setDYH(String DYH) {
        this.DYH = DYH;
    }

    public String getDYMC() {
        return DYMC;
    }

    public void setDYMC(String DYMC) {
        this.DYMC = DYMC;
    }

    public Integer getZCS() {
        return ZCS;
    }

    public void setZCS(Integer ZCS) {
        this.ZCS = ZCS;
    }

    public String getXMMC() {
        return XMMC;
    }

    public void setXMMC(String XMMC) {
        this.XMMC = XMMC;
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
        TpoDyxx other = (TpoDyxx) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
                && (this.getXMID() == null ? other.getXMID() == null : this.getXMID().equals(other.getXMID()))
                && (this.getXMCODE() == null ? other.getXMCODE() == null : this.getXMCODE().equals(other.getXMCODE()))
                && (this.getZRZID() == null ? other.getZRZID() == null : this.getZRZID().equals(other.getZRZID()))
                && (this.getZRZCODE() == null ? other.getZRZCODE() == null : this.getZRZCODE().equals(other.getZRZCODE()))
                && (this.getZRZH() == null ? other.getZRZH() == null : this.getZRZH().equals(other.getZRZH()))
                && (this.getDYH() == null ? other.getDYH() == null : this.getDYH().equals(other.getDYH()))
                && (this.getDYMC() == null ? other.getDYMC() == null : this.getDYMC().equals(other.getDYMC()))
                && (this.getZCS() == null ? other.getZCS() == null : this.getZCS().equals(other.getZCS()))
                && (this.getXMMC() == null ? other.getXMMC() == null : this.getXMMC().equals(other.getXMMC()))
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
        result = prime * result + ((getXMID() == null) ? 0 : getXMID().hashCode());
        result = prime * result + ((getXMCODE() == null) ? 0 : getXMCODE().hashCode());
        result = prime * result + ((getZRZID() == null) ? 0 : getZRZID().hashCode());
        result = prime * result + ((getZRZCODE() == null) ? 0 : getZRZCODE().hashCode());
        result = prime * result + ((getZRZH() == null) ? 0 : getZRZH().hashCode());
        result = prime * result + ((getDYH() == null) ? 0 : getDYH().hashCode());
        result = prime * result + ((getDYMC() == null) ? 0 : getDYMC().hashCode());
        result = prime * result + ((getZCS() == null) ? 0 : getZCS().hashCode());
        result = prime * result + ((getXMMC() == null) ? 0 : getXMMC().hashCode());
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
        sb.append(", XMID=").append(XMID);
        sb.append(", XMCODE=").append(XMCODE);
        sb.append(", ZRZID=").append(ZRZID);
        sb.append(", ZRZCODE=").append(ZRZCODE);
        sb.append(", ZRZH=").append(ZRZH);
        sb.append(", DYH=").append(DYH);
        sb.append(", DYMC=").append(DYMC);
        sb.append(", ZCS=").append(ZCS);
        sb.append(", XMMC=").append(XMMC);
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
