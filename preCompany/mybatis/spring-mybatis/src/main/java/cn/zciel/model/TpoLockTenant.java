package cn.zciel.model;

import java.io.Serializable;
import java.util.Date;

/**
 * tpo_lock_tenant
 *
 * @author
 */
public class TpoLockTenant implements Serializable {
    /**
     * 主键ID
     */
    private String ID;

    /**
     * 业务流水号
     */
    private String TRANSACTION_ID;

    /**
     * 姓名
     */
    private String REAL_NAME;

    /**
     * 手机号码
     */
    private String MOBILE;

    /**
     * 身份证
     */
    private String ID_NO;

    /**
     * 身份证DN
     */
    private String ID_DN;

    /**
     * 性别
     */
    private String GENDER;

    /**
     * 头像
     */
    private String AVATAR;

    /**
     * 状态
     */
    private String STATUS;

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
    private Date CRETE_TIME;

    /**
     * 最近更新人
     */
    private String UPDATER;

    /**
     * 最近更新时间
     */
    private Date UPDATE_TIME;

    /**
     * 备注
     */
    private String REMARK;

    /**
     * 业主编号
     */
    private String COMPANY_CODE;

    /**
     * 外部租户编号
     */
    private String OUT_MEMBER_ID;

    private static final long serialVersionUID = 1L;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTRANSACTION_ID() {
        return TRANSACTION_ID;
    }

    public void setTRANSACTION_ID(String TRANSACTION_ID) {
        this.TRANSACTION_ID = TRANSACTION_ID;
    }

    public String getREAL_NAME() {
        return REAL_NAME;
    }

    public void setREAL_NAME(String REAL_NAME) {
        this.REAL_NAME = REAL_NAME;
    }

    public String getMOBILE() {
        return MOBILE;
    }

    public void setMOBILE(String MOBILE) {
        this.MOBILE = MOBILE;
    }

    public String getID_NO() {
        return ID_NO;
    }

    public void setID_NO(String ID_NO) {
        this.ID_NO = ID_NO;
    }

    public String getID_DN() {
        return ID_DN;
    }

    public void setID_DN(String ID_DN) {
        this.ID_DN = ID_DN;
    }

    public String getGENDER() {
        return GENDER;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    public String getAVATAR() {
        return AVATAR;
    }

    public void setAVATAR(String AVATAR) {
        this.AVATAR = AVATAR;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
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

    public Date getCRETE_TIME() {
        return CRETE_TIME;
    }

    public void setCRETE_TIME(Date CRETE_TIME) {
        this.CRETE_TIME = CRETE_TIME;
    }

    public String getUPDATER() {
        return UPDATER;
    }

    public void setUPDATER(String UPDATER) {
        this.UPDATER = UPDATER;
    }

    public Date getUPDATE_TIME() {
        return UPDATE_TIME;
    }

    public void setUPDATE_TIME(Date UPDATE_TIME) {
        this.UPDATE_TIME = UPDATE_TIME;
    }

    public String getREMARK() {
        return REMARK;
    }

    public void setREMARK(String REMARK) {
        this.REMARK = REMARK;
    }

    public String getCOMPANY_CODE() {
        return COMPANY_CODE;
    }

    public void setCOMPANY_CODE(String COMPANY_CODE) {
        this.COMPANY_CODE = COMPANY_CODE;
    }

    public String getOUT_MEMBER_ID() {
        return OUT_MEMBER_ID;
    }

    public void setOUT_MEMBER_ID(String OUT_MEMBER_ID) {
        this.OUT_MEMBER_ID = OUT_MEMBER_ID;
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
        TpoLockTenant other = (TpoLockTenant) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
                && (this.getTRANSACTION_ID() == null ? other.getTRANSACTION_ID() == null : this.getTRANSACTION_ID().equals(other.getTRANSACTION_ID()))
                && (this.getREAL_NAME() == null ? other.getREAL_NAME() == null : this.getREAL_NAME().equals(other.getREAL_NAME()))
                && (this.getMOBILE() == null ? other.getMOBILE() == null : this.getMOBILE().equals(other.getMOBILE()))
                && (this.getID_NO() == null ? other.getID_NO() == null : this.getID_NO().equals(other.getID_NO()))
                && (this.getID_DN() == null ? other.getID_DN() == null : this.getID_DN().equals(other.getID_DN()))
                && (this.getGENDER() == null ? other.getGENDER() == null : this.getGENDER().equals(other.getGENDER()))
                && (this.getAVATAR() == null ? other.getAVATAR() == null : this.getAVATAR().equals(other.getAVATAR()))
                && (this.getSTATUS() == null ? other.getSTATUS() == null : this.getSTATUS().equals(other.getSTATUS()))
                && (this.getSORT_NUM() == null ? other.getSORT_NUM() == null : this.getSORT_NUM().equals(other.getSORT_NUM()))
                && (this.getDATA_VERSION() == null ? other.getDATA_VERSION() == null : this.getDATA_VERSION().equals(other.getDATA_VERSION()))
                && (this.getCREATOR() == null ? other.getCREATOR() == null : this.getCREATOR().equals(other.getCREATOR()))
                && (this.getCRETE_TIME() == null ? other.getCRETE_TIME() == null : this.getCRETE_TIME().equals(other.getCRETE_TIME()))
                && (this.getUPDATER() == null ? other.getUPDATER() == null : this.getUPDATER().equals(other.getUPDATER()))
                && (this.getUPDATE_TIME() == null ? other.getUPDATE_TIME() == null : this.getUPDATE_TIME().equals(other.getUPDATE_TIME()))
                && (this.getREMARK() == null ? other.getREMARK() == null : this.getREMARK().equals(other.getREMARK()))
                && (this.getCOMPANY_CODE() == null ? other.getCOMPANY_CODE() == null : this.getCOMPANY_CODE().equals(other.getCOMPANY_CODE()))
                && (this.getOUT_MEMBER_ID() == null ? other.getOUT_MEMBER_ID() == null : this.getOUT_MEMBER_ID().equals(other.getOUT_MEMBER_ID()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getTRANSACTION_ID() == null) ? 0 : getTRANSACTION_ID().hashCode());
        result = prime * result + ((getREAL_NAME() == null) ? 0 : getREAL_NAME().hashCode());
        result = prime * result + ((getMOBILE() == null) ? 0 : getMOBILE().hashCode());
        result = prime * result + ((getID_NO() == null) ? 0 : getID_NO().hashCode());
        result = prime * result + ((getID_DN() == null) ? 0 : getID_DN().hashCode());
        result = prime * result + ((getGENDER() == null) ? 0 : getGENDER().hashCode());
        result = prime * result + ((getAVATAR() == null) ? 0 : getAVATAR().hashCode());
        result = prime * result + ((getSTATUS() == null) ? 0 : getSTATUS().hashCode());
        result = prime * result + ((getSORT_NUM() == null) ? 0 : getSORT_NUM().hashCode());
        result = prime * result + ((getDATA_VERSION() == null) ? 0 : getDATA_VERSION().hashCode());
        result = prime * result + ((getCREATOR() == null) ? 0 : getCREATOR().hashCode());
        result = prime * result + ((getCRETE_TIME() == null) ? 0 : getCRETE_TIME().hashCode());
        result = prime * result + ((getUPDATER() == null) ? 0 : getUPDATER().hashCode());
        result = prime * result + ((getUPDATE_TIME() == null) ? 0 : getUPDATE_TIME().hashCode());
        result = prime * result + ((getREMARK() == null) ? 0 : getREMARK().hashCode());
        result = prime * result + ((getCOMPANY_CODE() == null) ? 0 : getCOMPANY_CODE().hashCode());
        result = prime * result + ((getOUT_MEMBER_ID() == null) ? 0 : getOUT_MEMBER_ID().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", TRANSACTION_ID=").append(TRANSACTION_ID);
        sb.append(", REAL_NAME=").append(REAL_NAME);
        sb.append(", MOBILE=").append(MOBILE);
        sb.append(", ID_NO=").append(ID_NO);
        sb.append(", ID_DN=").append(ID_DN);
        sb.append(", GENDER=").append(GENDER);
        sb.append(", AVATAR=").append(AVATAR);
        sb.append(", STATUS=").append(STATUS);
        sb.append(", SORT_NUM=").append(SORT_NUM);
        sb.append(", DATA_VERSION=").append(DATA_VERSION);
        sb.append(", CREATOR=").append(CREATOR);
        sb.append(", CRETE_TIME=").append(CRETE_TIME);
        sb.append(", UPDATER=").append(UPDATER);
        sb.append(", UPDATE_TIME=").append(UPDATE_TIME);
        sb.append(", REMARK=").append(REMARK);
        sb.append(", COMPANY_CODE=").append(COMPANY_CODE);
        sb.append(", OUT_MEMBER_ID=").append(OUT_MEMBER_ID);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
