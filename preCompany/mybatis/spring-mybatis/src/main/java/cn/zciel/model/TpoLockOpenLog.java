package cn.zciel.model;

import java.io.Serializable;
import java.util.Date;

/**
 * tpo_lock_open_log
 *
 * @author
 */
public class TpoLockOpenLog implements Serializable {
    /**
     * 主键ID
     */
    private String ID;

    /**
     * 业主编号
     */
    private String COMPANY_CODE;

    /**
     * 类型
     */
    private String TYPE;

    /**
     * 用户ID
     */
    private String USER_ID;

    /**
     * 钥匙ID
     */
    private String KEY_ID;

    /**
     * 锁ID
     */
    private String LOCK_ID;

    /**
     * 开锁方式
     */
    private String UNLOCK_MODE;

    /**
     * 开锁时间
     */
    private Date UNLOCK_TIME;

    /**
     * 状态
     */
    private String STATUS;

    /**
     * 上传时间
     */
    private Date UPLOAD_TIME;

    /**
     * 备注
     */
    private String REMARK;

    /**
     * 排序
     */
    private Integer SORT_NUM;

    /**
     * 版本
     */
    private Integer DATA_VERSION;

    private static final long serialVersionUID = 1L;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCOMPANY_CODE() {
        return COMPANY_CODE;
    }

    public void setCOMPANY_CODE(String COMPANY_CODE) {
        this.COMPANY_CODE = COMPANY_CODE;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public String getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getKEY_ID() {
        return KEY_ID;
    }

    public void setKEY_ID(String KEY_ID) {
        this.KEY_ID = KEY_ID;
    }

    public String getLOCK_ID() {
        return LOCK_ID;
    }

    public void setLOCK_ID(String LOCK_ID) {
        this.LOCK_ID = LOCK_ID;
    }

    public String getUNLOCK_MODE() {
        return UNLOCK_MODE;
    }

    public void setUNLOCK_MODE(String UNLOCK_MODE) {
        this.UNLOCK_MODE = UNLOCK_MODE;
    }

    public Date getUNLOCK_TIME() {
        return UNLOCK_TIME;
    }

    public void setUNLOCK_TIME(Date UNLOCK_TIME) {
        this.UNLOCK_TIME = UNLOCK_TIME;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public Date getUPLOAD_TIME() {
        return UPLOAD_TIME;
    }

    public void setUPLOAD_TIME(Date UPLOAD_TIME) {
        this.UPLOAD_TIME = UPLOAD_TIME;
    }

    public String getREMARK() {
        return REMARK;
    }

    public void setREMARK(String REMARK) {
        this.REMARK = REMARK;
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
        TpoLockOpenLog other = (TpoLockOpenLog) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
                && (this.getCOMPANY_CODE() == null ? other.getCOMPANY_CODE() == null : this.getCOMPANY_CODE().equals(other.getCOMPANY_CODE()))
                && (this.getTYPE() == null ? other.getTYPE() == null : this.getTYPE().equals(other.getTYPE()))
                && (this.getUSER_ID() == null ? other.getUSER_ID() == null : this.getUSER_ID().equals(other.getUSER_ID()))
                && (this.getKEY_ID() == null ? other.getKEY_ID() == null : this.getKEY_ID().equals(other.getKEY_ID()))
                && (this.getLOCK_ID() == null ? other.getLOCK_ID() == null : this.getLOCK_ID().equals(other.getLOCK_ID()))
                && (this.getUNLOCK_MODE() == null ? other.getUNLOCK_MODE() == null : this.getUNLOCK_MODE().equals(other.getUNLOCK_MODE()))
                && (this.getUNLOCK_TIME() == null ? other.getUNLOCK_TIME() == null : this.getUNLOCK_TIME().equals(other.getUNLOCK_TIME()))
                && (this.getSTATUS() == null ? other.getSTATUS() == null : this.getSTATUS().equals(other.getSTATUS()))
                && (this.getUPLOAD_TIME() == null ? other.getUPLOAD_TIME() == null : this.getUPLOAD_TIME().equals(other.getUPLOAD_TIME()))
                && (this.getREMARK() == null ? other.getREMARK() == null : this.getREMARK().equals(other.getREMARK()))
                && (this.getSORT_NUM() == null ? other.getSORT_NUM() == null : this.getSORT_NUM().equals(other.getSORT_NUM()))
                && (this.getDATA_VERSION() == null ? other.getDATA_VERSION() == null : this.getDATA_VERSION().equals(other.getDATA_VERSION()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getCOMPANY_CODE() == null) ? 0 : getCOMPANY_CODE().hashCode());
        result = prime * result + ((getTYPE() == null) ? 0 : getTYPE().hashCode());
        result = prime * result + ((getUSER_ID() == null) ? 0 : getUSER_ID().hashCode());
        result = prime * result + ((getKEY_ID() == null) ? 0 : getKEY_ID().hashCode());
        result = prime * result + ((getLOCK_ID() == null) ? 0 : getLOCK_ID().hashCode());
        result = prime * result + ((getUNLOCK_MODE() == null) ? 0 : getUNLOCK_MODE().hashCode());
        result = prime * result + ((getUNLOCK_TIME() == null) ? 0 : getUNLOCK_TIME().hashCode());
        result = prime * result + ((getSTATUS() == null) ? 0 : getSTATUS().hashCode());
        result = prime * result + ((getUPLOAD_TIME() == null) ? 0 : getUPLOAD_TIME().hashCode());
        result = prime * result + ((getREMARK() == null) ? 0 : getREMARK().hashCode());
        result = prime * result + ((getSORT_NUM() == null) ? 0 : getSORT_NUM().hashCode());
        result = prime * result + ((getDATA_VERSION() == null) ? 0 : getDATA_VERSION().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", COMPANY_CODE=").append(COMPANY_CODE);
        sb.append(", TYPE=").append(TYPE);
        sb.append(", USER_ID=").append(USER_ID);
        sb.append(", KEY_ID=").append(KEY_ID);
        sb.append(", LOCK_ID=").append(LOCK_ID);
        sb.append(", UNLOCK_MODE=").append(UNLOCK_MODE);
        sb.append(", UNLOCK_TIME=").append(UNLOCK_TIME);
        sb.append(", STATUS=").append(STATUS);
        sb.append(", UPLOAD_TIME=").append(UPLOAD_TIME);
        sb.append(", REMARK=").append(REMARK);
        sb.append(", SORT_NUM=").append(SORT_NUM);
        sb.append(", DATA_VERSION=").append(DATA_VERSION);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
