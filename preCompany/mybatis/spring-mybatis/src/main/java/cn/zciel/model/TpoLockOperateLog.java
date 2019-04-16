package cn.zciel.model;

import java.io.Serializable;
import java.util.Date;

/**
 * tpo_lock_operate_log
 *
 * @author
 */
public class TpoLockOperateLog implements Serializable {
    /**
     * 主键ID
     */
    private String ID;

    /**
     * 类别
     */
    private String TYPE;

    /**
     * 描述
     */
    private String DESCRIPTION;

    /**
     * 操作人
     */
    private String OPERATOR;

    /**
     * 操作时间
     */
    private Date OPERATE_TIME;

    /**
     * 备注
     */
    private String REMARK;

    /**
     * 租户ID
     */
    private String TENANT_ID;

    /**
     * 锁ID
     */
    private String LOCK_ID;

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

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public String getOPERATOR() {
        return OPERATOR;
    }

    public void setOPERATOR(String OPERATOR) {
        this.OPERATOR = OPERATOR;
    }

    public Date getOPERATE_TIME() {
        return OPERATE_TIME;
    }

    public void setOPERATE_TIME(Date OPERATE_TIME) {
        this.OPERATE_TIME = OPERATE_TIME;
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

    public String getLOCK_ID() {
        return LOCK_ID;
    }

    public void setLOCK_ID(String LOCK_ID) {
        this.LOCK_ID = LOCK_ID;
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
        TpoLockOperateLog other = (TpoLockOperateLog) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
                && (this.getTYPE() == null ? other.getTYPE() == null : this.getTYPE().equals(other.getTYPE()))
                && (this.getDESCRIPTION() == null ? other.getDESCRIPTION() == null : this.getDESCRIPTION().equals(other.getDESCRIPTION()))
                && (this.getOPERATOR() == null ? other.getOPERATOR() == null : this.getOPERATOR().equals(other.getOPERATOR()))
                && (this.getOPERATE_TIME() == null ? other.getOPERATE_TIME() == null : this.getOPERATE_TIME().equals(other.getOPERATE_TIME()))
                && (this.getREMARK() == null ? other.getREMARK() == null : this.getREMARK().equals(other.getREMARK()))
                && (this.getTENANT_ID() == null ? other.getTENANT_ID() == null : this.getTENANT_ID().equals(other.getTENANT_ID()))
                && (this.getLOCK_ID() == null ? other.getLOCK_ID() == null : this.getLOCK_ID().equals(other.getLOCK_ID()))
                && (this.getSORT_NUM() == null ? other.getSORT_NUM() == null : this.getSORT_NUM().equals(other.getSORT_NUM()))
                && (this.getDATA_VERSION() == null ? other.getDATA_VERSION() == null : this.getDATA_VERSION().equals(other.getDATA_VERSION()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getTYPE() == null) ? 0 : getTYPE().hashCode());
        result = prime * result + ((getDESCRIPTION() == null) ? 0 : getDESCRIPTION().hashCode());
        result = prime * result + ((getOPERATOR() == null) ? 0 : getOPERATOR().hashCode());
        result = prime * result + ((getOPERATE_TIME() == null) ? 0 : getOPERATE_TIME().hashCode());
        result = prime * result + ((getREMARK() == null) ? 0 : getREMARK().hashCode());
        result = prime * result + ((getTENANT_ID() == null) ? 0 : getTENANT_ID().hashCode());
        result = prime * result + ((getLOCK_ID() == null) ? 0 : getLOCK_ID().hashCode());
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
        sb.append(", TYPE=").append(TYPE);
        sb.append(", DESCRIPTION=").append(DESCRIPTION);
        sb.append(", OPERATOR=").append(OPERATOR);
        sb.append(", OPERATE_TIME=").append(OPERATE_TIME);
        sb.append(", REMARK=").append(REMARK);
        sb.append(", TENANT_ID=").append(TENANT_ID);
        sb.append(", LOCK_ID=").append(LOCK_ID);
        sb.append(", SORT_NUM=").append(SORT_NUM);
        sb.append(", DATA_VERSION=").append(DATA_VERSION);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
