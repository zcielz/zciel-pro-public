package cn.zciel.model;

import java.io.Serializable;
import java.util.Date;

/**
 * tpo_lock_auth
 *
 * @author
 */
public class TpoLockAuth implements Serializable {
    /**
     * 主键ID
     */
    private String ID;

    /**
     * 业务流水号
     */
    private String TRANSACTION_ID;

    /**
     * 锁ID
     */
    private String LOCK_ID;

    /**
     * 是否支持数字密码
     */
    private String IS_PIN_CODE;

    /**
     * 是否支持IC卡
     */
    private String IS_IC_CARD;

    /**
     * 是否支持人脸
     */
    private String IS_ID_CODE;

    /**
     * 是否支持指纹
     */
    private String IS_FINGERPRINT_CODE;

    /**
     * 开始时间
     */
    private Date START_TIME;

    /**
     * 结束时间
     */
    private Date END_TIME;

    /**
     * 验证频度
     */
    private Integer FREQUENCY;

    /**
     * 验证周期
     */
    private Integer FREQUENCY_MODE;

    /**
     * 开门提醒类型
     */
    private String ALARM_TYPE;

    /**
     * 开门提醒内容
     */
    private String ALARM_CONTENT;

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
     * 最新更新人
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
     * 租户ID
     */
    private String TENANT_ID;

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

    public String getLOCK_ID() {
        return LOCK_ID;
    }

    public void setLOCK_ID(String LOCK_ID) {
        this.LOCK_ID = LOCK_ID;
    }

    public String getIS_PIN_CODE() {
        return IS_PIN_CODE;
    }

    public void setIS_PIN_CODE(String IS_PIN_CODE) {
        this.IS_PIN_CODE = IS_PIN_CODE;
    }

    public String getIS_IC_CARD() {
        return IS_IC_CARD;
    }

    public void setIS_IC_CARD(String IS_IC_CARD) {
        this.IS_IC_CARD = IS_IC_CARD;
    }

    public String getIS_ID_CODE() {
        return IS_ID_CODE;
    }

    public void setIS_ID_CODE(String IS_ID_CODE) {
        this.IS_ID_CODE = IS_ID_CODE;
    }

    public String getIS_FINGERPRINT_CODE() {
        return IS_FINGERPRINT_CODE;
    }

    public void setIS_FINGERPRINT_CODE(String IS_FINGERPRINT_CODE) {
        this.IS_FINGERPRINT_CODE = IS_FINGERPRINT_CODE;
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

    public Integer getFREQUENCY() {
        return FREQUENCY;
    }

    public void setFREQUENCY(Integer FREQUENCY) {
        this.FREQUENCY = FREQUENCY;
    }

    public Integer getFREQUENCY_MODE() {
        return FREQUENCY_MODE;
    }

    public void setFREQUENCY_MODE(Integer FREQUENCY_MODE) {
        this.FREQUENCY_MODE = FREQUENCY_MODE;
    }

    public String getALARM_TYPE() {
        return ALARM_TYPE;
    }

    public void setALARM_TYPE(String ALARM_TYPE) {
        this.ALARM_TYPE = ALARM_TYPE;
    }

    public String getALARM_CONTENT() {
        return ALARM_CONTENT;
    }

    public void setALARM_CONTENT(String ALARM_CONTENT) {
        this.ALARM_CONTENT = ALARM_CONTENT;
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
        TpoLockAuth other = (TpoLockAuth) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
                && (this.getTRANSACTION_ID() == null ? other.getTRANSACTION_ID() == null : this.getTRANSACTION_ID().equals(other.getTRANSACTION_ID()))
                && (this.getLOCK_ID() == null ? other.getLOCK_ID() == null : this.getLOCK_ID().equals(other.getLOCK_ID()))
                && (this.getIS_PIN_CODE() == null ? other.getIS_PIN_CODE() == null : this.getIS_PIN_CODE().equals(other.getIS_PIN_CODE()))
                && (this.getIS_IC_CARD() == null ? other.getIS_IC_CARD() == null : this.getIS_IC_CARD().equals(other.getIS_IC_CARD()))
                && (this.getIS_ID_CODE() == null ? other.getIS_ID_CODE() == null : this.getIS_ID_CODE().equals(other.getIS_ID_CODE()))
                && (this.getIS_FINGERPRINT_CODE() == null ? other.getIS_FINGERPRINT_CODE() == null : this.getIS_FINGERPRINT_CODE().equals(other.getIS_FINGERPRINT_CODE()))
                && (this.getSTART_TIME() == null ? other.getSTART_TIME() == null : this.getSTART_TIME().equals(other.getSTART_TIME()))
                && (this.getEND_TIME() == null ? other.getEND_TIME() == null : this.getEND_TIME().equals(other.getEND_TIME()))
                && (this.getFREQUENCY() == null ? other.getFREQUENCY() == null : this.getFREQUENCY().equals(other.getFREQUENCY()))
                && (this.getFREQUENCY_MODE() == null ? other.getFREQUENCY_MODE() == null : this.getFREQUENCY_MODE().equals(other.getFREQUENCY_MODE()))
                && (this.getALARM_TYPE() == null ? other.getALARM_TYPE() == null : this.getALARM_TYPE().equals(other.getALARM_TYPE()))
                && (this.getALARM_CONTENT() == null ? other.getALARM_CONTENT() == null : this.getALARM_CONTENT().equals(other.getALARM_CONTENT()))
                && (this.getSTATUS() == null ? other.getSTATUS() == null : this.getSTATUS().equals(other.getSTATUS()))
                && (this.getSORT_NUM() == null ? other.getSORT_NUM() == null : this.getSORT_NUM().equals(other.getSORT_NUM()))
                && (this.getDATA_VERSION() == null ? other.getDATA_VERSION() == null : this.getDATA_VERSION().equals(other.getDATA_VERSION()))
                && (this.getCREATOR() == null ? other.getCREATOR() == null : this.getCREATOR().equals(other.getCREATOR()))
                && (this.getCREATE_TIME() == null ? other.getCREATE_TIME() == null : this.getCREATE_TIME().equals(other.getCREATE_TIME()))
                && (this.getUPDATER() == null ? other.getUPDATER() == null : this.getUPDATER().equals(other.getUPDATER()))
                && (this.getUPDATE_TIME() == null ? other.getUPDATE_TIME() == null : this.getUPDATE_TIME().equals(other.getUPDATE_TIME()))
                && (this.getREMARK() == null ? other.getREMARK() == null : this.getREMARK().equals(other.getREMARK()))
                && (this.getTENANT_ID() == null ? other.getTENANT_ID() == null : this.getTENANT_ID().equals(other.getTENANT_ID()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getTRANSACTION_ID() == null) ? 0 : getTRANSACTION_ID().hashCode());
        result = prime * result + ((getLOCK_ID() == null) ? 0 : getLOCK_ID().hashCode());
        result = prime * result + ((getIS_PIN_CODE() == null) ? 0 : getIS_PIN_CODE().hashCode());
        result = prime * result + ((getIS_IC_CARD() == null) ? 0 : getIS_IC_CARD().hashCode());
        result = prime * result + ((getIS_ID_CODE() == null) ? 0 : getIS_ID_CODE().hashCode());
        result = prime * result + ((getIS_FINGERPRINT_CODE() == null) ? 0 : getIS_FINGERPRINT_CODE().hashCode());
        result = prime * result + ((getSTART_TIME() == null) ? 0 : getSTART_TIME().hashCode());
        result = prime * result + ((getEND_TIME() == null) ? 0 : getEND_TIME().hashCode());
        result = prime * result + ((getFREQUENCY() == null) ? 0 : getFREQUENCY().hashCode());
        result = prime * result + ((getFREQUENCY_MODE() == null) ? 0 : getFREQUENCY_MODE().hashCode());
        result = prime * result + ((getALARM_TYPE() == null) ? 0 : getALARM_TYPE().hashCode());
        result = prime * result + ((getALARM_CONTENT() == null) ? 0 : getALARM_CONTENT().hashCode());
        result = prime * result + ((getSTATUS() == null) ? 0 : getSTATUS().hashCode());
        result = prime * result + ((getSORT_NUM() == null) ? 0 : getSORT_NUM().hashCode());
        result = prime * result + ((getDATA_VERSION() == null) ? 0 : getDATA_VERSION().hashCode());
        result = prime * result + ((getCREATOR() == null) ? 0 : getCREATOR().hashCode());
        result = prime * result + ((getCREATE_TIME() == null) ? 0 : getCREATE_TIME().hashCode());
        result = prime * result + ((getUPDATER() == null) ? 0 : getUPDATER().hashCode());
        result = prime * result + ((getUPDATE_TIME() == null) ? 0 : getUPDATE_TIME().hashCode());
        result = prime * result + ((getREMARK() == null) ? 0 : getREMARK().hashCode());
        result = prime * result + ((getTENANT_ID() == null) ? 0 : getTENANT_ID().hashCode());
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
        sb.append(", LOCK_ID=").append(LOCK_ID);
        sb.append(", IS_PIN_CODE=").append(IS_PIN_CODE);
        sb.append(", IS_IC_CARD=").append(IS_IC_CARD);
        sb.append(", IS_ID_CODE=").append(IS_ID_CODE);
        sb.append(", IS_FINGERPRINT_CODE=").append(IS_FINGERPRINT_CODE);
        sb.append(", START_TIME=").append(START_TIME);
        sb.append(", END_TIME=").append(END_TIME);
        sb.append(", FREQUENCY=").append(FREQUENCY);
        sb.append(", FREQUENCY_MODE=").append(FREQUENCY_MODE);
        sb.append(", ALARM_TYPE=").append(ALARM_TYPE);
        sb.append(", ALARM_CONTENT=").append(ALARM_CONTENT);
        sb.append(", STATUS=").append(STATUS);
        sb.append(", SORT_NUM=").append(SORT_NUM);
        sb.append(", DATA_VERSION=").append(DATA_VERSION);
        sb.append(", CREATOR=").append(CREATOR);
        sb.append(", CREATE_TIME=").append(CREATE_TIME);
        sb.append(", UPDATER=").append(UPDATER);
        sb.append(", UPDATE_TIME=").append(UPDATE_TIME);
        sb.append(", REMARK=").append(REMARK);
        sb.append(", TENANT_ID=").append(TENANT_ID);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
