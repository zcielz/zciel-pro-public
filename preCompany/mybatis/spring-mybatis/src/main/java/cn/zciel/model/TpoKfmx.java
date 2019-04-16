package cn.zciel.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * tpo_kfmx
 *
 * @author
 */
public class TpoKfmx implements Serializable {
    /**
     * 主键ID
     */
    private String ID;

    /**
     * 配租ID
     */
    private String PZID;

    /**
     * 配租CODE
     */
    private String PZCODE;

    /**
     * 账号ID
     */
    private String ZHID;

    /**
     * 账号CODE
     */
    private String ZHCODE;

    /**
     * 资金账号
     */
    private String ZJZH;

    /**
     * 年份
     */
    private Integer NF;

    /**
     * 月份
     */
    private Integer YF;

    /**
     * 应扣
     */
    private BigDecimal YGZJ;

    /**
     * 实扣
     */
    private BigDecimal SGZJ;

    /**
     * 扣费状态
     */
    private Short KFZT;

    /**
     * 扣费日期
     */
    private Date KFSJ;

    /**
     * 租金明细ID
     */
    private String ZJMXID;

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

    public String getZHID() {
        return ZHID;
    }

    public void setZHID(String ZHID) {
        this.ZHID = ZHID;
    }

    public String getZHCODE() {
        return ZHCODE;
    }

    public void setZHCODE(String ZHCODE) {
        this.ZHCODE = ZHCODE;
    }

    public String getZJZH() {
        return ZJZH;
    }

    public void setZJZH(String ZJZH) {
        this.ZJZH = ZJZH;
    }

    public Integer getNF() {
        return NF;
    }

    public void setNF(Integer NF) {
        this.NF = NF;
    }

    public Integer getYF() {
        return YF;
    }

    public void setYF(Integer YF) {
        this.YF = YF;
    }

    public BigDecimal getYGZJ() {
        return YGZJ;
    }

    public void setYGZJ(BigDecimal YGZJ) {
        this.YGZJ = YGZJ;
    }

    public BigDecimal getSGZJ() {
        return SGZJ;
    }

    public void setSGZJ(BigDecimal SGZJ) {
        this.SGZJ = SGZJ;
    }

    public Short getKFZT() {
        return KFZT;
    }

    public void setKFZT(Short KFZT) {
        this.KFZT = KFZT;
    }

    public Date getKFSJ() {
        return KFSJ;
    }

    public void setKFSJ(Date KFSJ) {
        this.KFSJ = KFSJ;
    }

    public String getZJMXID() {
        return ZJMXID;
    }

    public void setZJMXID(String ZJMXID) {
        this.ZJMXID = ZJMXID;
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
        TpoKfmx other = (TpoKfmx) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
                && (this.getPZID() == null ? other.getPZID() == null : this.getPZID().equals(other.getPZID()))
                && (this.getPZCODE() == null ? other.getPZCODE() == null : this.getPZCODE().equals(other.getPZCODE()))
                && (this.getZHID() == null ? other.getZHID() == null : this.getZHID().equals(other.getZHID()))
                && (this.getZHCODE() == null ? other.getZHCODE() == null : this.getZHCODE().equals(other.getZHCODE()))
                && (this.getZJZH() == null ? other.getZJZH() == null : this.getZJZH().equals(other.getZJZH()))
                && (this.getNF() == null ? other.getNF() == null : this.getNF().equals(other.getNF()))
                && (this.getYF() == null ? other.getYF() == null : this.getYF().equals(other.getYF()))
                && (this.getYGZJ() == null ? other.getYGZJ() == null : this.getYGZJ().equals(other.getYGZJ()))
                && (this.getSGZJ() == null ? other.getSGZJ() == null : this.getSGZJ().equals(other.getSGZJ()))
                && (this.getKFZT() == null ? other.getKFZT() == null : this.getKFZT().equals(other.getKFZT()))
                && (this.getKFSJ() == null ? other.getKFSJ() == null : this.getKFSJ().equals(other.getKFSJ()))
                && (this.getZJMXID() == null ? other.getZJMXID() == null : this.getZJMXID().equals(other.getZJMXID()))
                && (this.getSORT_NUM() == null ? other.getSORT_NUM() == null : this.getSORT_NUM().equals(other.getSORT_NUM()))
                && (this.getDATA_VERSION() == null ? other.getDATA_VERSION() == null : this.getDATA_VERSION().equals(other.getDATA_VERSION()))
                && (this.getCREATOR() == null ? other.getCREATOR() == null : this.getCREATOR().equals(other.getCREATOR()))
                && (this.getCREATE_TIME() == null ? other.getCREATE_TIME() == null : this.getCREATE_TIME().equals(other.getCREATE_TIME()))
                && (this.getUPDATOR() == null ? other.getUPDATOR() == null : this.getUPDATOR().equals(other.getUPDATOR()))
                && (this.getUPDATE_TIME() == null ? other.getUPDATE_TIME() == null : this.getUPDATE_TIME().equals(other.getUPDATE_TIME()))
                && (this.getCOMMENTS() == null ? other.getCOMMENTS() == null : this.getCOMMENTS().equals(other.getCOMMENTS()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getPZID() == null) ? 0 : getPZID().hashCode());
        result = prime * result + ((getPZCODE() == null) ? 0 : getPZCODE().hashCode());
        result = prime * result + ((getZHID() == null) ? 0 : getZHID().hashCode());
        result = prime * result + ((getZHCODE() == null) ? 0 : getZHCODE().hashCode());
        result = prime * result + ((getZJZH() == null) ? 0 : getZJZH().hashCode());
        result = prime * result + ((getNF() == null) ? 0 : getNF().hashCode());
        result = prime * result + ((getYF() == null) ? 0 : getYF().hashCode());
        result = prime * result + ((getYGZJ() == null) ? 0 : getYGZJ().hashCode());
        result = prime * result + ((getSGZJ() == null) ? 0 : getSGZJ().hashCode());
        result = prime * result + ((getKFZT() == null) ? 0 : getKFZT().hashCode());
        result = prime * result + ((getKFSJ() == null) ? 0 : getKFSJ().hashCode());
        result = prime * result + ((getZJMXID() == null) ? 0 : getZJMXID().hashCode());
        result = prime * result + ((getSORT_NUM() == null) ? 0 : getSORT_NUM().hashCode());
        result = prime * result + ((getDATA_VERSION() == null) ? 0 : getDATA_VERSION().hashCode());
        result = prime * result + ((getCREATOR() == null) ? 0 : getCREATOR().hashCode());
        result = prime * result + ((getCREATE_TIME() == null) ? 0 : getCREATE_TIME().hashCode());
        result = prime * result + ((getUPDATOR() == null) ? 0 : getUPDATOR().hashCode());
        result = prime * result + ((getUPDATE_TIME() == null) ? 0 : getUPDATE_TIME().hashCode());
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
        sb.append(", PZID=").append(PZID);
        sb.append(", PZCODE=").append(PZCODE);
        sb.append(", ZHID=").append(ZHID);
        sb.append(", ZHCODE=").append(ZHCODE);
        sb.append(", ZJZH=").append(ZJZH);
        sb.append(", NF=").append(NF);
        sb.append(", YF=").append(YF);
        sb.append(", YGZJ=").append(YGZJ);
        sb.append(", SGZJ=").append(SGZJ);
        sb.append(", KFZT=").append(KFZT);
        sb.append(", KFSJ=").append(KFSJ);
        sb.append(", ZJMXID=").append(ZJMXID);
        sb.append(", SORT_NUM=").append(SORT_NUM);
        sb.append(", DATA_VERSION=").append(DATA_VERSION);
        sb.append(", CREATOR=").append(CREATOR);
        sb.append(", CREATE_TIME=").append(CREATE_TIME);
        sb.append(", UPDATOR=").append(UPDATOR);
        sb.append(", UPDATE_TIME=").append(UPDATE_TIME);
        sb.append(", COMMENTS=").append(COMMENTS);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
