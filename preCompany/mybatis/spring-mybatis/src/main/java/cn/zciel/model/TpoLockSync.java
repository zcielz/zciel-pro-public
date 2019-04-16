package cn.zciel.model;

import java.io.Serializable;
import java.util.Date;

/**
 * tpo_lock_sync
 *
 * @author
 */
public class TpoLockSync implements Serializable {
    /**
     * 主键ID
     */
    private String ID;

    /**
     * 业主编号
     */
    private String COMPANY_CODE;

    /**
     * 电量
     */
    private Integer VOLUMN;

    /**
     * 信号
     */
    private Integer SINGAL_NO;

    /**
     * 在离线状态
     */
    private String STATUS;

    /**
     * 最近更新时间
     */
    private Date LAST_UPDATE_TIME;

    /**
     * 下次同步时间
     */
    private Date NEXT_SYNC_TIME;

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

    public Integer getVOLUMN() {
        return VOLUMN;
    }

    public void setVOLUMN(Integer VOLUMN) {
        this.VOLUMN = VOLUMN;
    }

    public Integer getSINGAL_NO() {
        return SINGAL_NO;
    }

    public void setSINGAL_NO(Integer SINGAL_NO) {
        this.SINGAL_NO = SINGAL_NO;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public Date getLAST_UPDATE_TIME() {
        return LAST_UPDATE_TIME;
    }

    public void setLAST_UPDATE_TIME(Date LAST_UPDATE_TIME) {
        this.LAST_UPDATE_TIME = LAST_UPDATE_TIME;
    }

    public Date getNEXT_SYNC_TIME() {
        return NEXT_SYNC_TIME;
    }

    public void setNEXT_SYNC_TIME(Date NEXT_SYNC_TIME) {
        this.NEXT_SYNC_TIME = NEXT_SYNC_TIME;
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
        TpoLockSync other = (TpoLockSync) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
                && (this.getCOMPANY_CODE() == null ? other.getCOMPANY_CODE() == null : this.getCOMPANY_CODE().equals(other.getCOMPANY_CODE()))
                && (this.getVOLUMN() == null ? other.getVOLUMN() == null : this.getVOLUMN().equals(other.getVOLUMN()))
                && (this.getSINGAL_NO() == null ? other.getSINGAL_NO() == null : this.getSINGAL_NO().equals(other.getSINGAL_NO()))
                && (this.getSTATUS() == null ? other.getSTATUS() == null : this.getSTATUS().equals(other.getSTATUS()))
                && (this.getLAST_UPDATE_TIME() == null ? other.getLAST_UPDATE_TIME() == null : this.getLAST_UPDATE_TIME().equals(other.getLAST_UPDATE_TIME()))
                && (this.getNEXT_SYNC_TIME() == null ? other.getNEXT_SYNC_TIME() == null : this.getNEXT_SYNC_TIME().equals(other.getNEXT_SYNC_TIME()))
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
        result = prime * result + ((getVOLUMN() == null) ? 0 : getVOLUMN().hashCode());
        result = prime * result + ((getSINGAL_NO() == null) ? 0 : getSINGAL_NO().hashCode());
        result = prime * result + ((getSTATUS() == null) ? 0 : getSTATUS().hashCode());
        result = prime * result + ((getLAST_UPDATE_TIME() == null) ? 0 : getLAST_UPDATE_TIME().hashCode());
        result = prime * result + ((getNEXT_SYNC_TIME() == null) ? 0 : getNEXT_SYNC_TIME().hashCode());
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
        sb.append(", VOLUMN=").append(VOLUMN);
        sb.append(", SINGAL_NO=").append(SINGAL_NO);
        sb.append(", STATUS=").append(STATUS);
        sb.append(", LAST_UPDATE_TIME=").append(LAST_UPDATE_TIME);
        sb.append(", NEXT_SYNC_TIME=").append(NEXT_SYNC_TIME);
        sb.append(", REMARK=").append(REMARK);
        sb.append(", SORT_NUM=").append(SORT_NUM);
        sb.append(", DATA_VERSION=").append(DATA_VERSION);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
