package cn.zciel.model;

import java.io.Serializable;
import java.util.Date;

/**
 * tpo_lock_password
 *
 * @author
 */
public class TpoLockPassword implements Serializable {
    /**
     * 主键ID
     */
    private String ID;

    /**
     * 密码类型(1=固定密码，2=临时密码)
     */
    private String TYPE;

    /**
     * 密码
     */
    private String PASSWORD;

    /**
     * 密码有效日期
     */
    private Date EXPIRE_TIME;

    /**
     * 开锁次数
     */
    private Integer OPEN_TIMES;

    /**
     * 剩余开锁次数
     */
    private Integer REMAIN_TIMES;

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
    private Date CREATE_TIME;

    /**
     * 最新修改人
     */
    private String UPDATER;

    /**
     * 最近修改时间
     */
    private Date UPDATE_TIME;

    /**
     * 备注
     */
    private String REMARK;

    /**
     * 租户ID
     */
    private String TENANT_ID;

    /**
     * 授权ID
     */
    private String AUTH_ID;

    /**
     * 锁ID
     */
    private String LOCK_ID;

    private static final long serialVersionUID = 1L;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public Date getEXPIRE_TIME() {
        return EXPIRE_TIME;
    }

    public void setEXPIRE_TIME(Date EXPIRE_TIME) {
        this.EXPIRE_TIME = EXPIRE_TIME;
    }

    public Integer getOPEN_TIMES() {
        return OPEN_TIMES;
    }

    public void setOPEN_TIMES(Integer OPEN_TIMES) {
        this.OPEN_TIMES = OPEN_TIMES;
    }

    public Integer getREMAIN_TIMES() {
        return REMAIN_TIMES;
    }

    public void setREMAIN_TIMES(Integer REMAIN_TIMES) {
        this.REMAIN_TIMES = REMAIN_TIMES;
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

    public Date getCREATE_TIME() {
        return CREATE_TIME;
    }

    public void setCREATE_TIME(Date CREATE_TIME) {
        this.CREATE_TIME = CREATE_TIME;
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

    public String getTENANT_ID() {
        return TENANT_ID;
    }

    public void setTENANT_ID(String TENANT_ID) {
        this.TENANT_ID = TENANT_ID;
    }

    public String getAUTH_ID() {
        return AUTH_ID;
    }

    public void setAUTH_ID(String AUTH_ID) {
        this.AUTH_ID = AUTH_ID;
    }

    public String getLOCK_ID() {
        return LOCK_ID;
    }

    public void setLOCK_ID(String LOCK_ID) {
        this.LOCK_ID = LOCK_ID;
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
        TpoLockPassword other = (TpoLockPassword) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
                && (this.getTYPE() == null ? other.getTYPE() == null : this.getTYPE().equals(other.getTYPE()))
                && (this.getPASSWORD() == null ? other.getPASSWORD() == null : this.getPASSWORD().equals(other.getPASSWORD()))
                && (this.getEXPIRE_TIME() == null ? other.getEXPIRE_TIME() == null : this.getEXPIRE_TIME().equals(other.getEXPIRE_TIME()))
                && (this.getOPEN_TIMES() == null ? other.getOPEN_TIMES() == null : this.getOPEN_TIMES().equals(other.getOPEN_TIMES()))
                && (this.getREMAIN_TIMES() == null ? other.getREMAIN_TIMES() == null : this.getREMAIN_TIMES().equals(other.getREMAIN_TIMES()))
                && (this.getSTATUS() == null ? other.getSTATUS() == null : this.getSTATUS().equals(other.getSTATUS()))
                && (this.getSORT_NUM() == null ? other.getSORT_NUM() == null : this.getSORT_NUM().equals(other.getSORT_NUM()))
                && (this.getDATA_VERSION() == null ? other.getDATA_VERSION() == null : this.getDATA_VERSION().equals(other.getDATA_VERSION()))
                && (this.getCREATOR() == null ? other.getCREATOR() == null : this.getCREATOR().equals(other.getCREATOR()))
                && (this.getCREATE_TIME() == null ? other.getCREATE_TIME() == null : this.getCREATE_TIME().equals(other.getCREATE_TIME()))
                && (this.getUPDATER() == null ? other.getUPDATER() == null : this.getUPDATER().equals(other.getUPDATER()))
                && (this.getUPDATE_TIME() == null ? other.getUPDATE_TIME() == null : this.getUPDATE_TIME().equals(other.getUPDATE_TIME()))
                && (this.getREMARK() == null ? other.getREMARK() == null : this.getREMARK().equals(other.getREMARK()))
                && (this.getTENANT_ID() == null ? other.getTENANT_ID() == null : this.getTENANT_ID().equals(other.getTENANT_ID()))
                && (this.getAUTH_ID() == null ? other.getAUTH_ID() == null : this.getAUTH_ID().equals(other.getAUTH_ID()))
                && (this.getLOCK_ID() == null ? other.getLOCK_ID() == null : this.getLOCK_ID().equals(other.getLOCK_ID()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getTYPE() == null) ? 0 : getTYPE().hashCode());
        result = prime * result + ((getPASSWORD() == null) ? 0 : getPASSWORD().hashCode());
        result = prime * result + ((getEXPIRE_TIME() == null) ? 0 : getEXPIRE_TIME().hashCode());
        result = prime * result + ((getOPEN_TIMES() == null) ? 0 : getOPEN_TIMES().hashCode());
        result = prime * result + ((getREMAIN_TIMES() == null) ? 0 : getREMAIN_TIMES().hashCode());
        result = prime * result + ((getSTATUS() == null) ? 0 : getSTATUS().hashCode());
        result = prime * result + ((getSORT_NUM() == null) ? 0 : getSORT_NUM().hashCode());
        result = prime * result + ((getDATA_VERSION() == null) ? 0 : getDATA_VERSION().hashCode());
        result = prime * result + ((getCREATOR() == null) ? 0 : getCREATOR().hashCode());
        result = prime * result + ((getCREATE_TIME() == null) ? 0 : getCREATE_TIME().hashCode());
        result = prime * result + ((getUPDATER() == null) ? 0 : getUPDATER().hashCode());
        result = prime * result + ((getUPDATE_TIME() == null) ? 0 : getUPDATE_TIME().hashCode());
        result = prime * result + ((getREMARK() == null) ? 0 : getREMARK().hashCode());
        result = prime * result + ((getTENANT_ID() == null) ? 0 : getTENANT_ID().hashCode());
        result = prime * result + ((getAUTH_ID() == null) ? 0 : getAUTH_ID().hashCode());
        result = prime * result + ((getLOCK_ID() == null) ? 0 : getLOCK_ID().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", TYPE=").append(TYPE);
        sb.append(", PASSWORD=").append(PASSWORD);
        sb.append(", EXPIRE_TIME=").append(EXPIRE_TIME);
        sb.append(", OPEN_TIMES=").append(OPEN_TIMES);
        sb.append(", REMAIN_TIMES=").append(REMAIN_TIMES);
        sb.append(", STATUS=").append(STATUS);
        sb.append(", SORT_NUM=").append(SORT_NUM);
        sb.append(", DATA_VERSION=").append(DATA_VERSION);
        sb.append(", CREATOR=").append(CREATOR);
        sb.append(", CREATE_TIME=").append(CREATE_TIME);
        sb.append(", UPDATER=").append(UPDATER);
        sb.append(", UPDATE_TIME=").append(UPDATE_TIME);
        sb.append(", REMARK=").append(REMARK);
        sb.append(", TENANT_ID=").append(TENANT_ID);
        sb.append(", AUTH_ID=").append(AUTH_ID);
        sb.append(", LOCK_ID=").append(LOCK_ID);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
