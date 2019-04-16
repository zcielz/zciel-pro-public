package cn.zciel.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * tpo_yhzjzh
 *
 * @author
 */
public class TpoYhzjzh implements Serializable {
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
     * 申请人ID
     */
    private String SQRID;

    /**
     * 申请人CODE
     */
    private String SQRCODE;

    /**
     * 唯一标识（账号）
     */
    private String WYPS;

    /**
     * 余额
     */
    private BigDecimal YE;

    /**
     * 押金
     */
    private BigDecimal YJ;

    /**
     * 银行账号
     */
    private String YHZH;

    /**
     * 姓名
     */
    private String XM;

    /**
     * 身份证
     */
    private String SFZ;

    /**
     * 资金账号
     */
    private String ZJZH;

    /**
     * 欠租金额
     */
    private BigDecimal QZJE;

    /**
     * 租赁户姓名
     */
    private String ZLHXM;

    /**
     * 租赁户证件号
     */
    private String ZLHZJH;

    /**
     * 证件类别
     */
    private String ZJLB;

    /**
     * 账号状态
     */
    private String ZHZT;

    /**
     * 银行名称
     */
    private String YHMC;

    /**
     * 应缴押金
     */
    private BigDecimal YJYJ;

    /**
     * 委托号
     */
    private String WTH;

    /**
     * 是否代扣租金
     */
    private Short SFDKZJ;

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
     * 注销时间
     */
    private Date ZXSJ;

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

    public String getSQRID() {
        return SQRID;
    }

    public void setSQRID(String SQRID) {
        this.SQRID = SQRID;
    }

    public String getSQRCODE() {
        return SQRCODE;
    }

    public void setSQRCODE(String SQRCODE) {
        this.SQRCODE = SQRCODE;
    }

    public String getWYPS() {
        return WYPS;
    }

    public void setWYPS(String WYPS) {
        this.WYPS = WYPS;
    }

    public BigDecimal getYE() {
        return YE;
    }

    public void setYE(BigDecimal YE) {
        this.YE = YE;
    }

    public BigDecimal getYJ() {
        return YJ;
    }

    public void setYJ(BigDecimal YJ) {
        this.YJ = YJ;
    }

    public String getYHZH() {
        return YHZH;
    }

    public void setYHZH(String YHZH) {
        this.YHZH = YHZH;
    }

    public String getXM() {
        return XM;
    }

    public void setXM(String XM) {
        this.XM = XM;
    }

    public String getSFZ() {
        return SFZ;
    }

    public void setSFZ(String SFZ) {
        this.SFZ = SFZ;
    }

    public String getZJZH() {
        return ZJZH;
    }

    public void setZJZH(String ZJZH) {
        this.ZJZH = ZJZH;
    }

    public BigDecimal getQZJE() {
        return QZJE;
    }

    public void setQZJE(BigDecimal QZJE) {
        this.QZJE = QZJE;
    }

    public String getZLHXM() {
        return ZLHXM;
    }

    public void setZLHXM(String ZLHXM) {
        this.ZLHXM = ZLHXM;
    }

    public String getZLHZJH() {
        return ZLHZJH;
    }

    public void setZLHZJH(String ZLHZJH) {
        this.ZLHZJH = ZLHZJH;
    }

    public String getZJLB() {
        return ZJLB;
    }

    public void setZJLB(String ZJLB) {
        this.ZJLB = ZJLB;
    }

    public String getZHZT() {
        return ZHZT;
    }

    public void setZHZT(String ZHZT) {
        this.ZHZT = ZHZT;
    }

    public String getYHMC() {
        return YHMC;
    }

    public void setYHMC(String YHMC) {
        this.YHMC = YHMC;
    }

    public BigDecimal getYJYJ() {
        return YJYJ;
    }

    public void setYJYJ(BigDecimal YJYJ) {
        this.YJYJ = YJYJ;
    }

    public String getWTH() {
        return WTH;
    }

    public void setWTH(String WTH) {
        this.WTH = WTH;
    }

    public Short getSFDKZJ() {
        return SFDKZJ;
    }

    public void setSFDKZJ(Short SFDKZJ) {
        this.SFDKZJ = SFDKZJ;
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

    public Date getZXSJ() {
        return ZXSJ;
    }

    public void setZXSJ(Date ZXSJ) {
        this.ZXSJ = ZXSJ;
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
        TpoYhzjzh other = (TpoYhzjzh) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
                && (this.getCODE() == null ? other.getCODE() == null : this.getCODE().equals(other.getCODE()))
                && (this.getPZID() == null ? other.getPZID() == null : this.getPZID().equals(other.getPZID()))
                && (this.getSQRID() == null ? other.getSQRID() == null : this.getSQRID().equals(other.getSQRID()))
                && (this.getSQRCODE() == null ? other.getSQRCODE() == null : this.getSQRCODE().equals(other.getSQRCODE()))
                && (this.getWYPS() == null ? other.getWYPS() == null : this.getWYPS().equals(other.getWYPS()))
                && (this.getYE() == null ? other.getYE() == null : this.getYE().equals(other.getYE()))
                && (this.getYJ() == null ? other.getYJ() == null : this.getYJ().equals(other.getYJ()))
                && (this.getYHZH() == null ? other.getYHZH() == null : this.getYHZH().equals(other.getYHZH()))
                && (this.getXM() == null ? other.getXM() == null : this.getXM().equals(other.getXM()))
                && (this.getSFZ() == null ? other.getSFZ() == null : this.getSFZ().equals(other.getSFZ()))
                && (this.getZJZH() == null ? other.getZJZH() == null : this.getZJZH().equals(other.getZJZH()))
                && (this.getQZJE() == null ? other.getQZJE() == null : this.getQZJE().equals(other.getQZJE()))
                && (this.getZLHXM() == null ? other.getZLHXM() == null : this.getZLHXM().equals(other.getZLHXM()))
                && (this.getZLHZJH() == null ? other.getZLHZJH() == null : this.getZLHZJH().equals(other.getZLHZJH()))
                && (this.getZJLB() == null ? other.getZJLB() == null : this.getZJLB().equals(other.getZJLB()))
                && (this.getZHZT() == null ? other.getZHZT() == null : this.getZHZT().equals(other.getZHZT()))
                && (this.getYHMC() == null ? other.getYHMC() == null : this.getYHMC().equals(other.getYHMC()))
                && (this.getYJYJ() == null ? other.getYJYJ() == null : this.getYJYJ().equals(other.getYJYJ()))
                && (this.getWTH() == null ? other.getWTH() == null : this.getWTH().equals(other.getWTH()))
                && (this.getSFDKZJ() == null ? other.getSFDKZJ() == null : this.getSFDKZJ().equals(other.getSFDKZJ()))
                && (this.getSORT_NUM() == null ? other.getSORT_NUM() == null : this.getSORT_NUM().equals(other.getSORT_NUM()))
                && (this.getDATA_VERSION() == null ? other.getDATA_VERSION() == null : this.getDATA_VERSION().equals(other.getDATA_VERSION()))
                && (this.getCREATOR() == null ? other.getCREATOR() == null : this.getCREATOR().equals(other.getCREATOR()))
                && (this.getCREATE_TIME() == null ? other.getCREATE_TIME() == null : this.getCREATE_TIME().equals(other.getCREATE_TIME()))
                && (this.getZXSJ() == null ? other.getZXSJ() == null : this.getZXSJ().equals(other.getZXSJ()))
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
        result = prime * result + ((getSQRID() == null) ? 0 : getSQRID().hashCode());
        result = prime * result + ((getSQRCODE() == null) ? 0 : getSQRCODE().hashCode());
        result = prime * result + ((getWYPS() == null) ? 0 : getWYPS().hashCode());
        result = prime * result + ((getYE() == null) ? 0 : getYE().hashCode());
        result = prime * result + ((getYJ() == null) ? 0 : getYJ().hashCode());
        result = prime * result + ((getYHZH() == null) ? 0 : getYHZH().hashCode());
        result = prime * result + ((getXM() == null) ? 0 : getXM().hashCode());
        result = prime * result + ((getSFZ() == null) ? 0 : getSFZ().hashCode());
        result = prime * result + ((getZJZH() == null) ? 0 : getZJZH().hashCode());
        result = prime * result + ((getQZJE() == null) ? 0 : getQZJE().hashCode());
        result = prime * result + ((getZLHXM() == null) ? 0 : getZLHXM().hashCode());
        result = prime * result + ((getZLHZJH() == null) ? 0 : getZLHZJH().hashCode());
        result = prime * result + ((getZJLB() == null) ? 0 : getZJLB().hashCode());
        result = prime * result + ((getZHZT() == null) ? 0 : getZHZT().hashCode());
        result = prime * result + ((getYHMC() == null) ? 0 : getYHMC().hashCode());
        result = prime * result + ((getYJYJ() == null) ? 0 : getYJYJ().hashCode());
        result = prime * result + ((getWTH() == null) ? 0 : getWTH().hashCode());
        result = prime * result + ((getSFDKZJ() == null) ? 0 : getSFDKZJ().hashCode());
        result = prime * result + ((getSORT_NUM() == null) ? 0 : getSORT_NUM().hashCode());
        result = prime * result + ((getDATA_VERSION() == null) ? 0 : getDATA_VERSION().hashCode());
        result = prime * result + ((getCREATOR() == null) ? 0 : getCREATOR().hashCode());
        result = prime * result + ((getCREATE_TIME() == null) ? 0 : getCREATE_TIME().hashCode());
        result = prime * result + ((getZXSJ() == null) ? 0 : getZXSJ().hashCode());
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
        sb.append(", SQRID=").append(SQRID);
        sb.append(", SQRCODE=").append(SQRCODE);
        sb.append(", WYPS=").append(WYPS);
        sb.append(", YE=").append(YE);
        sb.append(", YJ=").append(YJ);
        sb.append(", YHZH=").append(YHZH);
        sb.append(", XM=").append(XM);
        sb.append(", SFZ=").append(SFZ);
        sb.append(", ZJZH=").append(ZJZH);
        sb.append(", QZJE=").append(QZJE);
        sb.append(", ZLHXM=").append(ZLHXM);
        sb.append(", ZLHZJH=").append(ZLHZJH);
        sb.append(", ZJLB=").append(ZJLB);
        sb.append(", ZHZT=").append(ZHZT);
        sb.append(", YHMC=").append(YHMC);
        sb.append(", YJYJ=").append(YJYJ);
        sb.append(", WTH=").append(WTH);
        sb.append(", SFDKZJ=").append(SFDKZJ);
        sb.append(", SORT_NUM=").append(SORT_NUM);
        sb.append(", DATA_VERSION=").append(DATA_VERSION);
        sb.append(", CREATOR=").append(CREATOR);
        sb.append(", CREATE_TIME=").append(CREATE_TIME);
        sb.append(", ZXSJ=").append(ZXSJ);
        sb.append(", UPDATOR=").append(UPDATOR);
        sb.append(", UPDATE_TIME=").append(UPDATE_TIME);
        sb.append(", YXBZ=").append(YXBZ);
        sb.append(", COMMENTS=").append(COMMENTS);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
