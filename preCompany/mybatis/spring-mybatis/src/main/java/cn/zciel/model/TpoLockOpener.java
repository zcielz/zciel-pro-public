package cn.zciel.model;

import java.io.Serializable;
import java.util.Date;

/**
 * tpo_lock_opener
 *
 * @author
 */
public class TpoLockOpener implements Serializable {
    /**
     * 主键ID
     */
    private String ID;

    /**
     * 业务流水号
     */
    private String TRANSACTION_ID;

    /**
     * 类型(1=ic卡 2=身份证件 3=指纹  4=人脸)
     */
    private String TYPE;

    /**
     * 内码
     */
    private String IN_CODE;

    /**
     * 外码
     */
    private String OUT_CODE;

    /**
     * 人物特征
     */
    private String CHARACTER_CODE;

    /**
     * 开始时间
     */
    private Date START_TIME;

    /**
     * 结束时间
     */
    private Date END_TIME;

    /**
     * 状态（0 未使用 ，1  正常 ，2  挂失 ，3  注销）
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
     * 更新人
     */
    private String UPDATER;

    /**
     * 更新时间
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

    private String AUTH_ID;

    private String LOCK_ID;

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

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public String getIN_CODE() {
        return IN_CODE;
    }

    public void setIN_CODE(String IN_CODE) {
        this.IN_CODE = IN_CODE;
    }

    public String getOUT_CODE() {
        return OUT_CODE;
    }

    public void setOUT_CODE(String OUT_CODE) {
        this.OUT_CODE = OUT_CODE;
    }

    public String getCHARACTER_CODE() {
        return CHARACTER_CODE;
    }

    public void setCHARACTER_CODE(String CHARACTER_CODE) {
        this.CHARACTER_CODE = CHARACTER_CODE;
    }

    public Date getSTART_TIME() {
        return START_TIME;
    }

    public void setSTART_TIME(Date START_TIME) {
        this.START_TIME = START_TIME;
    }

    public Date getEND_TIME() {
        return END_TIME;
    }

    public void setEND_TIME(Date END_TIME) {
        this.END_TIME = END_TIME;
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
        TpoLockOpener other = (TpoLockOpener) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
                && (this.getTRANSACTION_ID() == null ? other.getTRANSACTION_ID() == null : this.getTRANSACTION_ID().equals(other.getTRANSACTION_ID()))
                && (this.getTYPE() == null ? other.getTYPE() == null : this.getTYPE().equals(other.getTYPE()))
                && (this.getIN_CODE() == null ? other.getIN_CODE() == null : this.getIN_CODE().equals(other.getIN_CODE()))
                && (this.getOUT_CODE() == null ? other.getOUT_CODE() == null : this.getOUT_CODE().equals(other.getOUT_CODE()))
                && (this.getCHARACTER_CODE() == null ? other.getCHARACTER_CODE() == null : this.getCHARACTER_CODE().equals(other.getCHARACTER_CODE()))
                && (this.getSTART_TIME() == null ? other.getSTART_TIME() == null : this.getSTART_TIME().equals(other.getSTART_TIME()))
                && (this.getEND_TIME() == null ? other.getEND_TIME() == null : this.getEND_TIME().equals(other.getEND_TIME()))
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
        result = prime * result + ((getTRANSACTION_ID() == null) ? 0 : getTRANSACTION_ID().hashCode());
        result = prime * result + ((getTYPE() == null) ? 0 : getTYPE().hashCode());
        result = prime * result + ((getIN_CODE() == null) ? 0 : getIN_CODE().hashCode());
        result = prime * result + ((getOUT_CODE() == null) ? 0 : getOUT_CODE().hashCode());
        result = prime * result + ((getCHARACTER_CODE() == null) ? 0 : getCHARACTER_CODE().hashCode());
        result = prime * result + ((getSTART_TIME() == null) ? 0 : getSTART_TIME().hashCode());
        result = prime * result + ((getEND_TIME() == null) ? 0 : getEND_TIME().hashCode());
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
        sb.append(", TRANSACTION_ID=").append(TRANSACTION_ID);
        sb.append(", TYPE=").append(TYPE);
        sb.append(", IN_CODE=").append(IN_CODE);
        sb.append(", OUT_CODE=").append(OUT_CODE);
        sb.append(", CHARACTER_CODE=").append(CHARACTER_CODE);
        sb.append(", START_TIME=").append(START_TIME);
        sb.append(", END_TIME=").append(END_TIME);
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
