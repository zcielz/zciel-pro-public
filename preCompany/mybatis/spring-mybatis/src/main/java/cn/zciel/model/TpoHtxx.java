package cn.zciel.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * tpo_htxx
 *
 * @author
 */
public class TpoHtxx implements Serializable {
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
     * 合同类型
     */
    private String HTLX;

    /**
     * 房屋坐落
     */
    private String FWZL;

    /**
     * 合同编号
     */
    private String HTBH;

    /**
     * 甲方地址
     */
    private String JF_DZ;

    /**
     * 甲方联系电话
     */
    private String JF_LXDH;

    /**
     * 甲方姓名
     */
    private String JF_XM;

    /**
     * 乙方姓名
     */
    private String YF_XM;

    /**
     * 乙方身份证号
     */
    private String YF_SFZH;

    /**
     * 乙方地址
     */
    private String YF_DZ;

    /**
     * 乙方联系电话
     */
    private String YF_LXDH;

    /**
     * 建筑面积
     */
    private BigDecimal JZMJ;

    /**
     * 期限
     */
    private Integer QX;

    /**
     * 押金
     */
    private BigDecimal YJ;

    /**
     * 租金
     */
    private BigDecimal ZJ;

    /**
     * 丙方组织机构代码
     */
    private String BF_ZZJGDM;

    /**
     * 丙方地址
     */
    private String BF_DZ;

    /**
     * 丙方联系电话
     */
    private String BF_LXDH;

    /**
     * 丙方联系人
     */
    private String BF_LXR;

    /**
     * 配租开始时间
     */
    private Date PZKSSJ;

    /**
     * 配租结束时间
     */
    private Date PZJSSJ;

    /**
     * 合同打印时间
     */
    private Date DYSJ;

    /**
     * 丙方单位名称
     */
    private String BF_DWMC;

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

    public String getHTLX() {
        return HTLX;
    }

    public void setHTLX(String HTLX) {
        this.HTLX = HTLX;
    }

    public String getFWZL() {
        return FWZL;
    }

    public void setFWZL(String FWZL) {
        this.FWZL = FWZL;
    }

    public String getHTBH() {
        return HTBH;
    }

    public void setHTBH(String HTBH) {
        this.HTBH = HTBH;
    }

    public String getJF_DZ() {
        return JF_DZ;
    }

    public void setJF_DZ(String JF_DZ) {
        this.JF_DZ = JF_DZ;
    }

    public String getJF_LXDH() {
        return JF_LXDH;
    }

    public void setJF_LXDH(String JF_LXDH) {
        this.JF_LXDH = JF_LXDH;
    }

    public String getJF_XM() {
        return JF_XM;
    }

    public void setJF_XM(String JF_XM) {
        this.JF_XM = JF_XM;
    }

    public String getYF_XM() {
        return YF_XM;
    }

    public void setYF_XM(String YF_XM) {
        this.YF_XM = YF_XM;
    }

    public String getYF_SFZH() {
        return YF_SFZH;
    }

    public void setYF_SFZH(String YF_SFZH) {
        this.YF_SFZH = YF_SFZH;
    }

    public String getYF_DZ() {
        return YF_DZ;
    }

    public void setYF_DZ(String YF_DZ) {
        this.YF_DZ = YF_DZ;
    }

    public String getYF_LXDH() {
        return YF_LXDH;
    }

    public void setYF_LXDH(String YF_LXDH) {
        this.YF_LXDH = YF_LXDH;
    }

    public BigDecimal getJZMJ() {
        return JZMJ;
    }

    public void setJZMJ(BigDecimal JZMJ) {
        this.JZMJ = JZMJ;
    }

    public Integer getQX() {
        return QX;
    }

    public void setQX(Integer QX) {
        this.QX = QX;
    }

    public BigDecimal getYJ() {
        return YJ;
    }

    public void setYJ(BigDecimal YJ) {
        this.YJ = YJ;
    }

    public BigDecimal getZJ() {
        return ZJ;
    }

    public void setZJ(BigDecimal ZJ) {
        this.ZJ = ZJ;
    }

    public String getBF_ZZJGDM() {
        return BF_ZZJGDM;
    }

    public void setBF_ZZJGDM(String BF_ZZJGDM) {
        this.BF_ZZJGDM = BF_ZZJGDM;
    }

    public String getBF_DZ() {
        return BF_DZ;
    }

    public void setBF_DZ(String BF_DZ) {
        this.BF_DZ = BF_DZ;
    }

    public String getBF_LXDH() {
        return BF_LXDH;
    }

    public void setBF_LXDH(String BF_LXDH) {
        this.BF_LXDH = BF_LXDH;
    }

    public String getBF_LXR() {
        return BF_LXR;
    }

    public void setBF_LXR(String BF_LXR) {
        this.BF_LXR = BF_LXR;
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

    public Date getDYSJ() {
        return DYSJ;
    }

    public void setDYSJ(Date DYSJ) {
        this.DYSJ = DYSJ;
    }

    public String getBF_DWMC() {
        return BF_DWMC;
    }

    public void setBF_DWMC(String BF_DWMC) {
        this.BF_DWMC = BF_DWMC;
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
        TpoHtxx other = (TpoHtxx) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
                && (this.getCODE() == null ? other.getCODE() == null : this.getCODE().equals(other.getCODE()))
                && (this.getPZID() == null ? other.getPZID() == null : this.getPZID().equals(other.getPZID()))
                && (this.getPZCODE() == null ? other.getPZCODE() == null : this.getPZCODE().equals(other.getPZCODE()))
                && (this.getHTLX() == null ? other.getHTLX() == null : this.getHTLX().equals(other.getHTLX()))
                && (this.getFWZL() == null ? other.getFWZL() == null : this.getFWZL().equals(other.getFWZL()))
                && (this.getHTBH() == null ? other.getHTBH() == null : this.getHTBH().equals(other.getHTBH()))
                && (this.getJF_DZ() == null ? other.getJF_DZ() == null : this.getJF_DZ().equals(other.getJF_DZ()))
                && (this.getJF_LXDH() == null ? other.getJF_LXDH() == null : this.getJF_LXDH().equals(other.getJF_LXDH()))
                && (this.getJF_XM() == null ? other.getJF_XM() == null : this.getJF_XM().equals(other.getJF_XM()))
                && (this.getYF_XM() == null ? other.getYF_XM() == null : this.getYF_XM().equals(other.getYF_XM()))
                && (this.getYF_SFZH() == null ? other.getYF_SFZH() == null : this.getYF_SFZH().equals(other.getYF_SFZH()))
                && (this.getYF_DZ() == null ? other.getYF_DZ() == null : this.getYF_DZ().equals(other.getYF_DZ()))
                && (this.getYF_LXDH() == null ? other.getYF_LXDH() == null : this.getYF_LXDH().equals(other.getYF_LXDH()))
                && (this.getJZMJ() == null ? other.getJZMJ() == null : this.getJZMJ().equals(other.getJZMJ()))
                && (this.getQX() == null ? other.getQX() == null : this.getQX().equals(other.getQX()))
                && (this.getYJ() == null ? other.getYJ() == null : this.getYJ().equals(other.getYJ()))
                && (this.getZJ() == null ? other.getZJ() == null : this.getZJ().equals(other.getZJ()))
                && (this.getBF_ZZJGDM() == null ? other.getBF_ZZJGDM() == null : this.getBF_ZZJGDM().equals(other.getBF_ZZJGDM()))
                && (this.getBF_DZ() == null ? other.getBF_DZ() == null : this.getBF_DZ().equals(other.getBF_DZ()))
                && (this.getBF_LXDH() == null ? other.getBF_LXDH() == null : this.getBF_LXDH().equals(other.getBF_LXDH()))
                && (this.getBF_LXR() == null ? other.getBF_LXR() == null : this.getBF_LXR().equals(other.getBF_LXR()))
                && (this.getPZKSSJ() == null ? other.getPZKSSJ() == null : this.getPZKSSJ().equals(other.getPZKSSJ()))
                && (this.getPZJSSJ() == null ? other.getPZJSSJ() == null : this.getPZJSSJ().equals(other.getPZJSSJ()))
                && (this.getDYSJ() == null ? other.getDYSJ() == null : this.getDYSJ().equals(other.getDYSJ()))
                && (this.getBF_DWMC() == null ? other.getBF_DWMC() == null : this.getBF_DWMC().equals(other.getBF_DWMC()))
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
        result = prime * result + ((getCODE() == null) ? 0 : getCODE().hashCode());
        result = prime * result + ((getPZID() == null) ? 0 : getPZID().hashCode());
        result = prime * result + ((getPZCODE() == null) ? 0 : getPZCODE().hashCode());
        result = prime * result + ((getHTLX() == null) ? 0 : getHTLX().hashCode());
        result = prime * result + ((getFWZL() == null) ? 0 : getFWZL().hashCode());
        result = prime * result + ((getHTBH() == null) ? 0 : getHTBH().hashCode());
        result = prime * result + ((getJF_DZ() == null) ? 0 : getJF_DZ().hashCode());
        result = prime * result + ((getJF_LXDH() == null) ? 0 : getJF_LXDH().hashCode());
        result = prime * result + ((getJF_XM() == null) ? 0 : getJF_XM().hashCode());
        result = prime * result + ((getYF_XM() == null) ? 0 : getYF_XM().hashCode());
        result = prime * result + ((getYF_SFZH() == null) ? 0 : getYF_SFZH().hashCode());
        result = prime * result + ((getYF_DZ() == null) ? 0 : getYF_DZ().hashCode());
        result = prime * result + ((getYF_LXDH() == null) ? 0 : getYF_LXDH().hashCode());
        result = prime * result + ((getJZMJ() == null) ? 0 : getJZMJ().hashCode());
        result = prime * result + ((getQX() == null) ? 0 : getQX().hashCode());
        result = prime * result + ((getYJ() == null) ? 0 : getYJ().hashCode());
        result = prime * result + ((getZJ() == null) ? 0 : getZJ().hashCode());
        result = prime * result + ((getBF_ZZJGDM() == null) ? 0 : getBF_ZZJGDM().hashCode());
        result = prime * result + ((getBF_DZ() == null) ? 0 : getBF_DZ().hashCode());
        result = prime * result + ((getBF_LXDH() == null) ? 0 : getBF_LXDH().hashCode());
        result = prime * result + ((getBF_LXR() == null) ? 0 : getBF_LXR().hashCode());
        result = prime * result + ((getPZKSSJ() == null) ? 0 : getPZKSSJ().hashCode());
        result = prime * result + ((getPZJSSJ() == null) ? 0 : getPZJSSJ().hashCode());
        result = prime * result + ((getDYSJ() == null) ? 0 : getDYSJ().hashCode());
        result = prime * result + ((getBF_DWMC() == null) ? 0 : getBF_DWMC().hashCode());
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
        sb.append(", CODE=").append(CODE);
        sb.append(", PZID=").append(PZID);
        sb.append(", PZCODE=").append(PZCODE);
        sb.append(", HTLX=").append(HTLX);
        sb.append(", FWZL=").append(FWZL);
        sb.append(", HTBH=").append(HTBH);
        sb.append(", JF_DZ=").append(JF_DZ);
        sb.append(", JF_LXDH=").append(JF_LXDH);
        sb.append(", JF_XM=").append(JF_XM);
        sb.append(", YF_XM=").append(YF_XM);
        sb.append(", YF_SFZH=").append(YF_SFZH);
        sb.append(", YF_DZ=").append(YF_DZ);
        sb.append(", YF_LXDH=").append(YF_LXDH);
        sb.append(", JZMJ=").append(JZMJ);
        sb.append(", QX=").append(QX);
        sb.append(", YJ=").append(YJ);
        sb.append(", ZJ=").append(ZJ);
        sb.append(", BF_ZZJGDM=").append(BF_ZZJGDM);
        sb.append(", BF_DZ=").append(BF_DZ);
        sb.append(", BF_LXDH=").append(BF_LXDH);
        sb.append(", BF_LXR=").append(BF_LXR);
        sb.append(", PZKSSJ=").append(PZKSSJ);
        sb.append(", PZJSSJ=").append(PZJSSJ);
        sb.append(", DYSJ=").append(DYSJ);
        sb.append(", BF_DWMC=").append(BF_DWMC);
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
