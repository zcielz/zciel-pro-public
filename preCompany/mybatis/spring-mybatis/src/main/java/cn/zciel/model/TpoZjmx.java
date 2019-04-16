package cn.zciel.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * tpo_zjmx
 *
 * @author
 */
public class TpoZjmx implements Serializable {
    /**
     * 主键ID
     */
    private String ID;

    /**
     * CODE
     */
    private String CODE;

    /**
     * 配租ID
     */
    private String PZID;

    /**
     * 配租CODE
     */
    private String PZCODE;

    /**
     * 租金规则ID
     */
    private String ZJGZID;

    /**
     * 租金规则CODE
     */
    private String ZJGZCODE;

    /**
     * 承租人
     */
    private String CZR;

    /**
     * 月租金
     */
    private BigDecimal YZJ;

    /**
     * 房屋坐落
     */
    private String FWZL;

    /**
     * 开始日期（租金规则）
     */
    private Date SXSJ;

    /**
     * 结束日期（租金规则）
     */
    private Date JSSJ;

    /**
     * 建筑面积
     */
    private BigDecimal JZMJ;

    /**
     * 减免月租金
     */
    private BigDecimal JMYZJ;

    /**
     * 减免开始日期
     */
    private Date JMKSRQ;

    /**
     * 减免结束日期
     */
    private Date JMJSRQ;

    /**
     * 困难证号
     */
    private String KNZH;

    /**
     * 保障类型
     */
    private String BZLX;

    /**
     * 困难证类型
     */
    private String KNZLX;

    /**
     * 过渡期标准月租金
     */
    private BigDecimal GDQBZYZJ;

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

    public String getZJGZID() {
        return ZJGZID;
    }

    public void setZJGZID(String ZJGZID) {
        this.ZJGZID = ZJGZID;
    }

    public String getZJGZCODE() {
        return ZJGZCODE;
    }

    public void setZJGZCODE(String ZJGZCODE) {
        this.ZJGZCODE = ZJGZCODE;
    }

    public String getCZR() {
        return CZR;
    }

    public void setCZR(String CZR) {
        this.CZR = CZR;
    }

    public BigDecimal getYZJ() {
        return YZJ;
    }

    public void setYZJ(BigDecimal YZJ) {
        this.YZJ = YZJ;
    }

    public String getFWZL() {
        return FWZL;
    }

    public void setFWZL(String FWZL) {
        this.FWZL = FWZL;
    }

    public Date getSXSJ() {
        return SXSJ;
    }

    public void setSXSJ(Date SXSJ) {
        this.SXSJ = SXSJ;
    }

    public Date getJSSJ() {
        return JSSJ;
    }

    public void setJSSJ(Date JSSJ) {
        this.JSSJ = JSSJ;
    }

    public BigDecimal getJZMJ() {
        return JZMJ;
    }

    public void setJZMJ(BigDecimal JZMJ) {
        this.JZMJ = JZMJ;
    }

    public BigDecimal getJMYZJ() {
        return JMYZJ;
    }

    public void setJMYZJ(BigDecimal JMYZJ) {
        this.JMYZJ = JMYZJ;
    }

    public Date getJMKSRQ() {
        return JMKSRQ;
    }

    public void setJMKSRQ(Date JMKSRQ) {
        this.JMKSRQ = JMKSRQ;
    }

    public Date getJMJSRQ() {
        return JMJSRQ;
    }

    public void setJMJSRQ(Date JMJSRQ) {
        this.JMJSRQ = JMJSRQ;
    }

    public String getKNZH() {
        return KNZH;
    }

    public void setKNZH(String KNZH) {
        this.KNZH = KNZH;
    }

    public String getBZLX() {
        return BZLX;
    }

    public void setBZLX(String BZLX) {
        this.BZLX = BZLX;
    }

    public String getKNZLX() {
        return KNZLX;
    }

    public void setKNZLX(String KNZLX) {
        this.KNZLX = KNZLX;
    }

    public BigDecimal getGDQBZYZJ() {
        return GDQBZYZJ;
    }

    public void setGDQBZYZJ(BigDecimal GDQBZYZJ) {
        this.GDQBZYZJ = GDQBZYZJ;
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
        TpoZjmx other = (TpoZjmx) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
                && (this.getCODE() == null ? other.getCODE() == null : this.getCODE().equals(other.getCODE()))
                && (this.getPZID() == null ? other.getPZID() == null : this.getPZID().equals(other.getPZID()))
                && (this.getPZCODE() == null ? other.getPZCODE() == null : this.getPZCODE().equals(other.getPZCODE()))
                && (this.getZJGZID() == null ? other.getZJGZID() == null : this.getZJGZID().equals(other.getZJGZID()))
                && (this.getZJGZCODE() == null ? other.getZJGZCODE() == null : this.getZJGZCODE().equals(other.getZJGZCODE()))
                && (this.getCZR() == null ? other.getCZR() == null : this.getCZR().equals(other.getCZR()))
                && (this.getYZJ() == null ? other.getYZJ() == null : this.getYZJ().equals(other.getYZJ()))
                && (this.getFWZL() == null ? other.getFWZL() == null : this.getFWZL().equals(other.getFWZL()))
                && (this.getSXSJ() == null ? other.getSXSJ() == null : this.getSXSJ().equals(other.getSXSJ()))
                && (this.getJSSJ() == null ? other.getJSSJ() == null : this.getJSSJ().equals(other.getJSSJ()))
                && (this.getJZMJ() == null ? other.getJZMJ() == null : this.getJZMJ().equals(other.getJZMJ()))
                && (this.getJMYZJ() == null ? other.getJMYZJ() == null : this.getJMYZJ().equals(other.getJMYZJ()))
                && (this.getJMKSRQ() == null ? other.getJMKSRQ() == null : this.getJMKSRQ().equals(other.getJMKSRQ()))
                && (this.getJMJSRQ() == null ? other.getJMJSRQ() == null : this.getJMJSRQ().equals(other.getJMJSRQ()))
                && (this.getKNZH() == null ? other.getKNZH() == null : this.getKNZH().equals(other.getKNZH()))
                && (this.getBZLX() == null ? other.getBZLX() == null : this.getBZLX().equals(other.getBZLX()))
                && (this.getKNZLX() == null ? other.getKNZLX() == null : this.getKNZLX().equals(other.getKNZLX()))
                && (this.getGDQBZYZJ() == null ? other.getGDQBZYZJ() == null : this.getGDQBZYZJ().equals(other.getGDQBZYZJ()))
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
        result = prime * result + ((getPZID() == null) ? 0 : getPZID().hashCode());
        result = prime * result + ((getPZCODE() == null) ? 0 : getPZCODE().hashCode());
        result = prime * result + ((getZJGZID() == null) ? 0 : getZJGZID().hashCode());
        result = prime * result + ((getZJGZCODE() == null) ? 0 : getZJGZCODE().hashCode());
        result = prime * result + ((getCZR() == null) ? 0 : getCZR().hashCode());
        result = prime * result + ((getYZJ() == null) ? 0 : getYZJ().hashCode());
        result = prime * result + ((getFWZL() == null) ? 0 : getFWZL().hashCode());
        result = prime * result + ((getSXSJ() == null) ? 0 : getSXSJ().hashCode());
        result = prime * result + ((getJSSJ() == null) ? 0 : getJSSJ().hashCode());
        result = prime * result + ((getJZMJ() == null) ? 0 : getJZMJ().hashCode());
        result = prime * result + ((getJMYZJ() == null) ? 0 : getJMYZJ().hashCode());
        result = prime * result + ((getJMKSRQ() == null) ? 0 : getJMKSRQ().hashCode());
        result = prime * result + ((getJMJSRQ() == null) ? 0 : getJMJSRQ().hashCode());
        result = prime * result + ((getKNZH() == null) ? 0 : getKNZH().hashCode());
        result = prime * result + ((getBZLX() == null) ? 0 : getBZLX().hashCode());
        result = prime * result + ((getKNZLX() == null) ? 0 : getKNZLX().hashCode());
        result = prime * result + ((getGDQBZYZJ() == null) ? 0 : getGDQBZYZJ().hashCode());
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
        sb.append(", PZID=").append(PZID);
        sb.append(", PZCODE=").append(PZCODE);
        sb.append(", ZJGZID=").append(ZJGZID);
        sb.append(", ZJGZCODE=").append(ZJGZCODE);
        sb.append(", CZR=").append(CZR);
        sb.append(", YZJ=").append(YZJ);
        sb.append(", FWZL=").append(FWZL);
        sb.append(", SXSJ=").append(SXSJ);
        sb.append(", JSSJ=").append(JSSJ);
        sb.append(", JZMJ=").append(JZMJ);
        sb.append(", JMYZJ=").append(JMYZJ);
        sb.append(", JMKSRQ=").append(JMKSRQ);
        sb.append(", JMJSRQ=").append(JMJSRQ);
        sb.append(", KNZH=").append(KNZH);
        sb.append(", BZLX=").append(BZLX);
        sb.append(", KNZLX=").append(KNZLX);
        sb.append(", GDQBZYZJ=").append(GDQBZYZJ);
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
