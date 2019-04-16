package cn.zciel.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * tpo_pzxx
 *
 * @author
 */
public class TpoPzxx implements Serializable {
    /**
     * 主键ID
     */
    private String ID;

    /**
     * 编号
     */
    private String CODE;

    /**
     * 申请人联系电话
     */
    private String SQRLXDH;

    /**
     * 申请人姓名
     */
    private String SQRXM;

    /**
     * 共同租赁标识（相当于家庭code,标识合租人集合）
     */
    private String GTZLBH;

    /**
     * 房源ID
     */
    private String FYID;

    /**
     * 房源编码
     */
    private String FYCODE;

    /**
     * 房屋坐落
     */
    private String FWZL;

    /**
     * 合同ID
     */
    private String HTID;

    /**
     * 合同编号
     */
    private String HTCODE;

    /**
     * 合租编号
     */
    private String HZBH;

    /**
     * 配租开始时间
     */
    private Date PZKSSJ;

    /**
     * 配租结束时间
     */
    private Date PZJSSJ;

    /**
     * 月租金
     */
    private BigDecimal YZJ;

    /**
     * 配租人数
     */
    private Integer PZRS;

    /**
     * 选房结果ID
     */
    private String XFJGID;

    /**
     * 申请人证件号码
     */
    private String SQRZJHM;

    /**
     * 银行名称
     */
    private String YHMC;

    /**
     * 银行卡号
     */
    private String YHKH;

    /**
     * 保障类型
     */
    private String BZLX;

    /**
     * 是否合租
     */
    private Short SFHZ;

    /**
     * 银行资金账户ID
     */
    private String YHZJZHID;

    /**
     * 配租户型
     */
    private String PZHX;

    /**
     * 配租资格证号
     */
    private String PZZGZH;

    /**
     * 续租类型
     */
    private String XZLX;

    /**
     * 是否年审不通过续租
     */
    private Short SFNSBTGXZ;

    /**
     * 外网合同编号
     */
    private String WWHTBH;

    /**
     * 建筑面积
     */
    private BigDecimal JZMJ;

    /**
     * 押金
     */
    private BigDecimal YJ;

    /**
     * 申请人ID
     */
    private String ZHID;

    /**
     * 配租类型（公租房、长租公寓）
     */
    private String PZLX;

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

    public String getCODE() {
        return CODE;
    }

    public void setCODE(String CODE) {
        this.CODE = CODE;
    }

    public String getSQRLXDH() {
        return SQRLXDH;
    }

    public void setSQRLXDH(String SQRLXDH) {
        this.SQRLXDH = SQRLXDH;
    }

    public String getSQRXM() {
        return SQRXM;
    }

    public void setSQRXM(String SQRXM) {
        this.SQRXM = SQRXM;
    }

    public String getGTZLBH() {
        return GTZLBH;
    }

    public void setGTZLBH(String GTZLBH) {
        this.GTZLBH = GTZLBH;
    }

    public String getFYID() {
        return FYID;
    }

    public void setFYID(String FYID) {
        this.FYID = FYID;
    }

    public String getFYCODE() {
        return FYCODE;
    }

    public void setFYCODE(String FYCODE) {
        this.FYCODE = FYCODE;
    }

    public String getFWZL() {
        return FWZL;
    }

    public void setFWZL(String FWZL) {
        this.FWZL = FWZL;
    }

    public String getHTID() {
        return HTID;
    }

    public void setHTID(String HTID) {
        this.HTID = HTID;
    }

    public String getHTCODE() {
        return HTCODE;
    }

    public void setHTCODE(String HTCODE) {
        this.HTCODE = HTCODE;
    }

    public String getHZBH() {
        return HZBH;
    }

    public void setHZBH(String HZBH) {
        this.HZBH = HZBH;
    }

    public Date getPZKSSJ() {
        return PZKSSJ;
    }

    public void setPZKSSJ(Date PZKSSJ) {
        this.PZKSSJ = PZKSSJ;
    }

    public Date getPZJSSJ() {
        return PZJSSJ;
    }

    public void setPZJSSJ(Date PZJSSJ) {
        this.PZJSSJ = PZJSSJ;
    }

    public BigDecimal getYZJ() {
        return YZJ;
    }

    public void setYZJ(BigDecimal YZJ) {
        this.YZJ = YZJ;
    }

    public Integer getPZRS() {
        return PZRS;
    }

    public void setPZRS(Integer PZRS) {
        this.PZRS = PZRS;
    }

    public String getXFJGID() {
        return XFJGID;
    }

    public void setXFJGID(String XFJGID) {
        this.XFJGID = XFJGID;
    }

    public String getSQRZJHM() {
        return SQRZJHM;
    }

    public void setSQRZJHM(String SQRZJHM) {
        this.SQRZJHM = SQRZJHM;
    }

    public String getYHMC() {
        return YHMC;
    }

    public void setYHMC(String YHMC) {
        this.YHMC = YHMC;
    }

    public String getYHKH() {
        return YHKH;
    }

    public void setYHKH(String YHKH) {
        this.YHKH = YHKH;
    }

    public String getBZLX() {
        return BZLX;
    }

    public void setBZLX(String BZLX) {
        this.BZLX = BZLX;
    }

    public Short getSFHZ() {
        return SFHZ;
    }

    public void setSFHZ(Short SFHZ) {
        this.SFHZ = SFHZ;
    }

    public String getYHZJZHID() {
        return YHZJZHID;
    }

    public void setYHZJZHID(String YHZJZHID) {
        this.YHZJZHID = YHZJZHID;
    }

    public String getPZHX() {
        return PZHX;
    }

    public void setPZHX(String PZHX) {
        this.PZHX = PZHX;
    }

    public String getPZZGZH() {
        return PZZGZH;
    }

    public void setPZZGZH(String PZZGZH) {
        this.PZZGZH = PZZGZH;
    }

    public String getXZLX() {
        return XZLX;
    }

    public void setXZLX(String XZLX) {
        this.XZLX = XZLX;
    }

    public Short getSFNSBTGXZ() {
        return SFNSBTGXZ;
    }

    public void setSFNSBTGXZ(Short SFNSBTGXZ) {
        this.SFNSBTGXZ = SFNSBTGXZ;
    }

    public String getWWHTBH() {
        return WWHTBH;
    }

    public void setWWHTBH(String WWHTBH) {
        this.WWHTBH = WWHTBH;
    }

    public BigDecimal getJZMJ() {
        return JZMJ;
    }

    public void setJZMJ(BigDecimal JZMJ) {
        this.JZMJ = JZMJ;
    }

    public BigDecimal getYJ() {
        return YJ;
    }

    public void setYJ(BigDecimal YJ) {
        this.YJ = YJ;
    }

    public String getZHID() {
        return ZHID;
    }

    public void setZHID(String ZHID) {
        this.ZHID = ZHID;
    }

    public String getPZLX() {
        return PZLX;
    }

    public void setPZLX(String PZLX) {
        this.PZLX = PZLX;
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
        TpoPzxx other = (TpoPzxx) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
                && (this.getCODE() == null ? other.getCODE() == null : this.getCODE().equals(other.getCODE()))
                && (this.getSQRLXDH() == null ? other.getSQRLXDH() == null : this.getSQRLXDH().equals(other.getSQRLXDH()))
                && (this.getSQRXM() == null ? other.getSQRXM() == null : this.getSQRXM().equals(other.getSQRXM()))
                && (this.getGTZLBH() == null ? other.getGTZLBH() == null : this.getGTZLBH().equals(other.getGTZLBH()))
                && (this.getFYID() == null ? other.getFYID() == null : this.getFYID().equals(other.getFYID()))
                && (this.getFYCODE() == null ? other.getFYCODE() == null : this.getFYCODE().equals(other.getFYCODE()))
                && (this.getFWZL() == null ? other.getFWZL() == null : this.getFWZL().equals(other.getFWZL()))
                && (this.getHTID() == null ? other.getHTID() == null : this.getHTID().equals(other.getHTID()))
                && (this.getHTCODE() == null ? other.getHTCODE() == null : this.getHTCODE().equals(other.getHTCODE()))
                && (this.getHZBH() == null ? other.getHZBH() == null : this.getHZBH().equals(other.getHZBH()))
                && (this.getPZKSSJ() == null ? other.getPZKSSJ() == null : this.getPZKSSJ().equals(other.getPZKSSJ()))
                && (this.getPZJSSJ() == null ? other.getPZJSSJ() == null : this.getPZJSSJ().equals(other.getPZJSSJ()))
                && (this.getYZJ() == null ? other.getYZJ() == null : this.getYZJ().equals(other.getYZJ()))
                && (this.getPZRS() == null ? other.getPZRS() == null : this.getPZRS().equals(other.getPZRS()))
                && (this.getXFJGID() == null ? other.getXFJGID() == null : this.getXFJGID().equals(other.getXFJGID()))
                && (this.getSQRZJHM() == null ? other.getSQRZJHM() == null : this.getSQRZJHM().equals(other.getSQRZJHM()))
                && (this.getYHMC() == null ? other.getYHMC() == null : this.getYHMC().equals(other.getYHMC()))
                && (this.getYHKH() == null ? other.getYHKH() == null : this.getYHKH().equals(other.getYHKH()))
                && (this.getBZLX() == null ? other.getBZLX() == null : this.getBZLX().equals(other.getBZLX()))
                && (this.getSFHZ() == null ? other.getSFHZ() == null : this.getSFHZ().equals(other.getSFHZ()))
                && (this.getYHZJZHID() == null ? other.getYHZJZHID() == null : this.getYHZJZHID().equals(other.getYHZJZHID()))
                && (this.getPZHX() == null ? other.getPZHX() == null : this.getPZHX().equals(other.getPZHX()))
                && (this.getPZZGZH() == null ? other.getPZZGZH() == null : this.getPZZGZH().equals(other.getPZZGZH()))
                && (this.getXZLX() == null ? other.getXZLX() == null : this.getXZLX().equals(other.getXZLX()))
                && (this.getSFNSBTGXZ() == null ? other.getSFNSBTGXZ() == null : this.getSFNSBTGXZ().equals(other.getSFNSBTGXZ()))
                && (this.getWWHTBH() == null ? other.getWWHTBH() == null : this.getWWHTBH().equals(other.getWWHTBH()))
                && (this.getJZMJ() == null ? other.getJZMJ() == null : this.getJZMJ().equals(other.getJZMJ()))
                && (this.getYJ() == null ? other.getYJ() == null : this.getYJ().equals(other.getYJ()))
                && (this.getZHID() == null ? other.getZHID() == null : this.getZHID().equals(other.getZHID()))
                && (this.getPZLX() == null ? other.getPZLX() == null : this.getPZLX().equals(other.getPZLX()))
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
        result = prime * result + ((getCODE() == null) ? 0 : getCODE().hashCode());
        result = prime * result + ((getSQRLXDH() == null) ? 0 : getSQRLXDH().hashCode());
        result = prime * result + ((getSQRXM() == null) ? 0 : getSQRXM().hashCode());
        result = prime * result + ((getGTZLBH() == null) ? 0 : getGTZLBH().hashCode());
        result = prime * result + ((getFYID() == null) ? 0 : getFYID().hashCode());
        result = prime * result + ((getFYCODE() == null) ? 0 : getFYCODE().hashCode());
        result = prime * result + ((getFWZL() == null) ? 0 : getFWZL().hashCode());
        result = prime * result + ((getHTID() == null) ? 0 : getHTID().hashCode());
        result = prime * result + ((getHTCODE() == null) ? 0 : getHTCODE().hashCode());
        result = prime * result + ((getHZBH() == null) ? 0 : getHZBH().hashCode());
        result = prime * result + ((getPZKSSJ() == null) ? 0 : getPZKSSJ().hashCode());
        result = prime * result + ((getPZJSSJ() == null) ? 0 : getPZJSSJ().hashCode());
        result = prime * result + ((getYZJ() == null) ? 0 : getYZJ().hashCode());
        result = prime * result + ((getPZRS() == null) ? 0 : getPZRS().hashCode());
        result = prime * result + ((getXFJGID() == null) ? 0 : getXFJGID().hashCode());
        result = prime * result + ((getSQRZJHM() == null) ? 0 : getSQRZJHM().hashCode());
        result = prime * result + ((getYHMC() == null) ? 0 : getYHMC().hashCode());
        result = prime * result + ((getYHKH() == null) ? 0 : getYHKH().hashCode());
        result = prime * result + ((getBZLX() == null) ? 0 : getBZLX().hashCode());
        result = prime * result + ((getSFHZ() == null) ? 0 : getSFHZ().hashCode());
        result = prime * result + ((getYHZJZHID() == null) ? 0 : getYHZJZHID().hashCode());
        result = prime * result + ((getPZHX() == null) ? 0 : getPZHX().hashCode());
        result = prime * result + ((getPZZGZH() == null) ? 0 : getPZZGZH().hashCode());
        result = prime * result + ((getXZLX() == null) ? 0 : getXZLX().hashCode());
        result = prime * result + ((getSFNSBTGXZ() == null) ? 0 : getSFNSBTGXZ().hashCode());
        result = prime * result + ((getWWHTBH() == null) ? 0 : getWWHTBH().hashCode());
        result = prime * result + ((getJZMJ() == null) ? 0 : getJZMJ().hashCode());
        result = prime * result + ((getYJ() == null) ? 0 : getYJ().hashCode());
        result = prime * result + ((getZHID() == null) ? 0 : getZHID().hashCode());
        result = prime * result + ((getPZLX() == null) ? 0 : getPZLX().hashCode());
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
        sb.append(", CODE=").append(CODE);
        sb.append(", SQRLXDH=").append(SQRLXDH);
        sb.append(", SQRXM=").append(SQRXM);
        sb.append(", GTZLBH=").append(GTZLBH);
        sb.append(", FYID=").append(FYID);
        sb.append(", FYCODE=").append(FYCODE);
        sb.append(", FWZL=").append(FWZL);
        sb.append(", HTID=").append(HTID);
        sb.append(", HTCODE=").append(HTCODE);
        sb.append(", HZBH=").append(HZBH);
        sb.append(", PZKSSJ=").append(PZKSSJ);
        sb.append(", PZJSSJ=").append(PZJSSJ);
        sb.append(", YZJ=").append(YZJ);
        sb.append(", PZRS=").append(PZRS);
        sb.append(", XFJGID=").append(XFJGID);
        sb.append(", SQRZJHM=").append(SQRZJHM);
        sb.append(", YHMC=").append(YHMC);
        sb.append(", YHKH=").append(YHKH);
        sb.append(", BZLX=").append(BZLX);
        sb.append(", SFHZ=").append(SFHZ);
        sb.append(", YHZJZHID=").append(YHZJZHID);
        sb.append(", PZHX=").append(PZHX);
        sb.append(", PZZGZH=").append(PZZGZH);
        sb.append(", XZLX=").append(XZLX);
        sb.append(", SFNSBTGXZ=").append(SFNSBTGXZ);
        sb.append(", WWHTBH=").append(WWHTBH);
        sb.append(", JZMJ=").append(JZMJ);
        sb.append(", YJ=").append(YJ);
        sb.append(", ZHID=").append(ZHID);
        sb.append(", PZLX=").append(PZLX);
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
