package cn.zciel.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * tpo_lock
 *
 * @author
 */
public class TpoLock implements Serializable {
    /**
     * 主键ID
     */
    private String ID;

    /**
     * 业主编号
     */
    private String COMPANY_CODE;

    /**
     * 业务流水号
     */
    private String TRANSACTION_ID;

    /**
     * 锁编号
     */
    private String LOCK_CODE;

    /**
     * 锁编码
     */
    private String LOCK_NO;

    /**
     * 锁名称
     */
    private String SHORT_NAME;

    /**
     * 门牌号
     */
    private String DOOR_NO;

    /**
     * 小区名
     */
    private String DISTRICT;

    /**
     * 城市
     */
    private String CITY;

    /**
     * 经度
     */
    private BigDecimal LNG;

    /**
     * 纬度
     */
    private BigDecimal LAT;

    /**
     * 安装人名称
     */
    private String INSTALLER_NAME;

    /**
     * 安装时间
     */
    private Date INSTALL_TIME;

    /**
     * 生产厂家
     */
    private String FACTORY;

    /**
     * 版本号
     */
    private String VERSION;

    /**
     * 锁运营商
     */
    private String OPERATOR;

    /**
     * 通讯方式
     */
    private String POSTAL_TYPE;

    /**
     * 型号
     */
    private String MODEL_NUMBER;

    /**
     * MAC地址
     */
    private String MAC;

    /**
     * 锁具密钥
     */
    private String SECRET_KEY;

    /**
     * 服务器IP
     */
    private String SERVER_IP;

    /**
     * 服务器端口
     */
    private String PORT;

    /**
     * 是否支持IC卡
     */
    private Boolean IS_IC;

    /**
     * 是否支持数字密码
     */
    private Boolean IS_PIN;

    /**
     * 是否支持指纹
     */
    private Boolean IS_FINGERPRINT;

    /**
     * 是否支持人脸
     */
    private Boolean IS_FACE;

    /**
     * 最大开锁次数
     */
    private Integer MAX_TIMES;

    /**
     * 剩余开锁次数
     */
    private Integer REMAIN_TIMES;

    /**
     * 累计开锁次数
     */
    private Integer NOW_TIMES;

    /**
     * 最近开门时间
     */
    private Date LAST_OPEN_TIME;

    /**
     * 当前授权人数
     */
    private Integer AUTH_USER_NUM;

    /**
     * 最近授权时间
     */
    private Date LAST_AUTH_TIME;

    /**
     * 特点场合的密码
     */
    private String SPECIAL_PWD;

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
     * 最近修改人
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

    private Date PRE_DETECTION_TIME;

    private Date NEXT_DETECTION_TIME;

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

    public String getTRANSACTION_ID() {
        return TRANSACTION_ID;
    }

    public void setTRANSACTION_ID(String TRANSACTION_ID) {
        this.TRANSACTION_ID = TRANSACTION_ID;
    }

    public String getLOCK_CODE() {
        return LOCK_CODE;
    }

    public void setLOCK_CODE(String LOCK_CODE) {
        this.LOCK_CODE = LOCK_CODE;
    }

    public String getLOCK_NO() {
        return LOCK_NO;
    }

    public void setLOCK_NO(String LOCK_NO) {
        this.LOCK_NO = LOCK_NO;
    }

    public String getSHORT_NAME() {
        return SHORT_NAME;
    }

    public void setSHORT_NAME(String SHORT_NAME) {
        this.SHORT_NAME = SHORT_NAME;
    }

    public String getDOOR_NO() {
        return DOOR_NO;
    }

    public void setDOOR_NO(String DOOR_NO) {
        this.DOOR_NO = DOOR_NO;
    }

    public String getDISTRICT() {
        return DISTRICT;
    }

    public void setDISTRICT(String DISTRICT) {
        this.DISTRICT = DISTRICT;
    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    public BigDecimal getLNG() {
        return LNG;
    }

    public void setLNG(BigDecimal LNG) {
        this.LNG = LNG;
    }

    public BigDecimal getLAT() {
        return LAT;
    }

    public void setLAT(BigDecimal LAT) {
        this.LAT = LAT;
    }

    public String getINSTALLER_NAME() {
        return INSTALLER_NAME;
    }

    public void setINSTALLER_NAME(String INSTALLER_NAME) {
        this.INSTALLER_NAME = INSTALLER_NAME;
    }

    public Date getINSTALL_TIME() {
        return INSTALL_TIME;
    }

    public void setINSTALL_TIME(Date INSTALL_TIME) {
        this.INSTALL_TIME = INSTALL_TIME;
    }

    public String getFACTORY() {
        return FACTORY;
    }

    public void setFACTORY(String FACTORY) {
        this.FACTORY = FACTORY;
    }

    public String getVERSION() {
        return VERSION;
    }

    public void setVERSION(String VERSION) {
        this.VERSION = VERSION;
    }

    public String getOPERATOR() {
        return OPERATOR;
    }

    public void setOPERATOR(String OPERATOR) {
        this.OPERATOR = OPERATOR;
    }

    public String getPOSTAL_TYPE() {
        return POSTAL_TYPE;
    }

    public void setPOSTAL_TYPE(String POSTAL_TYPE) {
        this.POSTAL_TYPE = POSTAL_TYPE;
    }

    public String getMODEL_NUMBER() {
        return MODEL_NUMBER;
    }

    public void setMODEL_NUMBER(String MODEL_NUMBER) {
        this.MODEL_NUMBER = MODEL_NUMBER;
    }

    public String getMAC() {
        return MAC;
    }

    public void setMAC(String MAC) {
        this.MAC = MAC;
    }

    public String getSECRET_KEY() {
        return SECRET_KEY;
    }

    public void setSECRET_KEY(String SECRET_KEY) {
        this.SECRET_KEY = SECRET_KEY;
    }

    public String getSERVER_IP() {
        return SERVER_IP;
    }

    public void setSERVER_IP(String SERVER_IP) {
        this.SERVER_IP = SERVER_IP;
    }

    public String getPORT() {
        return PORT;
    }

    public void setPORT(String PORT) {
        this.PORT = PORT;
    }

    public Boolean getIS_IC() {
        return IS_IC;
    }

    public void setIS_IC(Boolean IS_IC) {
        this.IS_IC = IS_IC;
    }

    public Boolean getIS_PIN() {
        return IS_PIN;
    }

    public void setIS_PIN(Boolean IS_PIN) {
        this.IS_PIN = IS_PIN;
    }

    public Boolean getIS_FINGERPRINT() {
        return IS_FINGERPRINT;
    }

    public void setIS_FINGERPRINT(Boolean IS_FINGERPRINT) {
        this.IS_FINGERPRINT = IS_FINGERPRINT;
    }

    public Boolean getIS_FACE() {
        return IS_FACE;
    }

    public void setIS_FACE(Boolean IS_FACE) {
        this.IS_FACE = IS_FACE;
    }

    public Integer getMAX_TIMES() {
        return MAX_TIMES;
    }

    public void setMAX_TIMES(Integer MAX_TIMES) {
        this.MAX_TIMES = MAX_TIMES;
    }

    public Integer getREMAIN_TIMES() {
        return REMAIN_TIMES;
    }

    public void setREMAIN_TIMES(Integer REMAIN_TIMES) {
        this.REMAIN_TIMES = REMAIN_TIMES;
    }

    public Integer getNOW_TIMES() {
        return NOW_TIMES;
    }

    public void setNOW_TIMES(Integer NOW_TIMES) {
        this.NOW_TIMES = NOW_TIMES;
    }

    public Date getLAST_OPEN_TIME() {
        return LAST_OPEN_TIME;
    }

    public void setLAST_OPEN_TIME(Date LAST_OPEN_TIME) {
        this.LAST_OPEN_TIME = LAST_OPEN_TIME;
    }

    public Integer getAUTH_USER_NUM() {
        return AUTH_USER_NUM;
    }

    public void setAUTH_USER_NUM(Integer AUTH_USER_NUM) {
        this.AUTH_USER_NUM = AUTH_USER_NUM;
    }

    public Date getLAST_AUTH_TIME() {
        return LAST_AUTH_TIME;
    }

    public void setLAST_AUTH_TIME(Date LAST_AUTH_TIME) {
        this.LAST_AUTH_TIME = LAST_AUTH_TIME;
    }

    public String getSPECIAL_PWD() {
        return SPECIAL_PWD;
    }

    public void setSPECIAL_PWD(String SPECIAL_PWD) {
        this.SPECIAL_PWD = SPECIAL_PWD;
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

    public Date getPRE_DETECTION_TIME() {
        return PRE_DETECTION_TIME;
    }

    public void setPRE_DETECTION_TIME(Date PRE_DETECTION_TIME) {
        this.PRE_DETECTION_TIME = PRE_DETECTION_TIME;
    }

    public Date getNEXT_DETECTION_TIME() {
        return NEXT_DETECTION_TIME;
    }

    public void setNEXT_DETECTION_TIME(Date NEXT_DETECTION_TIME) {
        this.NEXT_DETECTION_TIME = NEXT_DETECTION_TIME;
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
        TpoLock other = (TpoLock) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
                && (this.getCOMPANY_CODE() == null ? other.getCOMPANY_CODE() == null : this.getCOMPANY_CODE().equals(other.getCOMPANY_CODE()))
                && (this.getTRANSACTION_ID() == null ? other.getTRANSACTION_ID() == null : this.getTRANSACTION_ID().equals(other.getTRANSACTION_ID()))
                && (this.getLOCK_CODE() == null ? other.getLOCK_CODE() == null : this.getLOCK_CODE().equals(other.getLOCK_CODE()))
                && (this.getLOCK_NO() == null ? other.getLOCK_NO() == null : this.getLOCK_NO().equals(other.getLOCK_NO()))
                && (this.getSHORT_NAME() == null ? other.getSHORT_NAME() == null : this.getSHORT_NAME().equals(other.getSHORT_NAME()))
                && (this.getDOOR_NO() == null ? other.getDOOR_NO() == null : this.getDOOR_NO().equals(other.getDOOR_NO()))
                && (this.getDISTRICT() == null ? other.getDISTRICT() == null : this.getDISTRICT().equals(other.getDISTRICT()))
                && (this.getCITY() == null ? other.getCITY() == null : this.getCITY().equals(other.getCITY()))
                && (this.getLNG() == null ? other.getLNG() == null : this.getLNG().equals(other.getLNG()))
                && (this.getLAT() == null ? other.getLAT() == null : this.getLAT().equals(other.getLAT()))
                && (this.getINSTALLER_NAME() == null ? other.getINSTALLER_NAME() == null : this.getINSTALLER_NAME().equals(other.getINSTALLER_NAME()))
                && (this.getINSTALL_TIME() == null ? other.getINSTALL_TIME() == null : this.getINSTALL_TIME().equals(other.getINSTALL_TIME()))
                && (this.getFACTORY() == null ? other.getFACTORY() == null : this.getFACTORY().equals(other.getFACTORY()))
                && (this.getVERSION() == null ? other.getVERSION() == null : this.getVERSION().equals(other.getVERSION()))
                && (this.getOPERATOR() == null ? other.getOPERATOR() == null : this.getOPERATOR().equals(other.getOPERATOR()))
                && (this.getPOSTAL_TYPE() == null ? other.getPOSTAL_TYPE() == null : this.getPOSTAL_TYPE().equals(other.getPOSTAL_TYPE()))
                && (this.getMODEL_NUMBER() == null ? other.getMODEL_NUMBER() == null : this.getMODEL_NUMBER().equals(other.getMODEL_NUMBER()))
                && (this.getMAC() == null ? other.getMAC() == null : this.getMAC().equals(other.getMAC()))
                && (this.getSECRET_KEY() == null ? other.getSECRET_KEY() == null : this.getSECRET_KEY().equals(other.getSECRET_KEY()))
                && (this.getSERVER_IP() == null ? other.getSERVER_IP() == null : this.getSERVER_IP().equals(other.getSERVER_IP()))
                && (this.getPORT() == null ? other.getPORT() == null : this.getPORT().equals(other.getPORT()))
                && (this.getIS_IC() == null ? other.getIS_IC() == null : this.getIS_IC().equals(other.getIS_IC()))
                && (this.getIS_PIN() == null ? other.getIS_PIN() == null : this.getIS_PIN().equals(other.getIS_PIN()))
                && (this.getIS_FINGERPRINT() == null ? other.getIS_FINGERPRINT() == null : this.getIS_FINGERPRINT().equals(other.getIS_FINGERPRINT()))
                && (this.getIS_FACE() == null ? other.getIS_FACE() == null : this.getIS_FACE().equals(other.getIS_FACE()))
                && (this.getMAX_TIMES() == null ? other.getMAX_TIMES() == null : this.getMAX_TIMES().equals(other.getMAX_TIMES()))
                && (this.getREMAIN_TIMES() == null ? other.getREMAIN_TIMES() == null : this.getREMAIN_TIMES().equals(other.getREMAIN_TIMES()))
                && (this.getNOW_TIMES() == null ? other.getNOW_TIMES() == null : this.getNOW_TIMES().equals(other.getNOW_TIMES()))
                && (this.getLAST_OPEN_TIME() == null ? other.getLAST_OPEN_TIME() == null : this.getLAST_OPEN_TIME().equals(other.getLAST_OPEN_TIME()))
                && (this.getAUTH_USER_NUM() == null ? other.getAUTH_USER_NUM() == null : this.getAUTH_USER_NUM().equals(other.getAUTH_USER_NUM()))
                && (this.getLAST_AUTH_TIME() == null ? other.getLAST_AUTH_TIME() == null : this.getLAST_AUTH_TIME().equals(other.getLAST_AUTH_TIME()))
                && (this.getSPECIAL_PWD() == null ? other.getSPECIAL_PWD() == null : this.getSPECIAL_PWD().equals(other.getSPECIAL_PWD()))
                && (this.getSTATUS() == null ? other.getSTATUS() == null : this.getSTATUS().equals(other.getSTATUS()))
                && (this.getSORT_NUM() == null ? other.getSORT_NUM() == null : this.getSORT_NUM().equals(other.getSORT_NUM()))
                && (this.getDATA_VERSION() == null ? other.getDATA_VERSION() == null : this.getDATA_VERSION().equals(other.getDATA_VERSION()))
                && (this.getCREATOR() == null ? other.getCREATOR() == null : this.getCREATOR().equals(other.getCREATOR()))
                && (this.getCREATE_TIME() == null ? other.getCREATE_TIME() == null : this.getCREATE_TIME().equals(other.getCREATE_TIME()))
                && (this.getUPDATER() == null ? other.getUPDATER() == null : this.getUPDATER().equals(other.getUPDATER()))
                && (this.getUPDATE_TIME() == null ? other.getUPDATE_TIME() == null : this.getUPDATE_TIME().equals(other.getUPDATE_TIME()))
                && (this.getREMARK() == null ? other.getREMARK() == null : this.getREMARK().equals(other.getREMARK()))
                && (this.getPRE_DETECTION_TIME() == null ? other.getPRE_DETECTION_TIME() == null : this.getPRE_DETECTION_TIME().equals(other.getPRE_DETECTION_TIME()))
                && (this.getNEXT_DETECTION_TIME() == null ? other.getNEXT_DETECTION_TIME() == null : this.getNEXT_DETECTION_TIME().equals(other.getNEXT_DETECTION_TIME()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getCOMPANY_CODE() == null) ? 0 : getCOMPANY_CODE().hashCode());
        result = prime * result + ((getTRANSACTION_ID() == null) ? 0 : getTRANSACTION_ID().hashCode());
        result = prime * result + ((getLOCK_CODE() == null) ? 0 : getLOCK_CODE().hashCode());
        result = prime * result + ((getLOCK_NO() == null) ? 0 : getLOCK_NO().hashCode());
        result = prime * result + ((getSHORT_NAME() == null) ? 0 : getSHORT_NAME().hashCode());
        result = prime * result + ((getDOOR_NO() == null) ? 0 : getDOOR_NO().hashCode());
        result = prime * result + ((getDISTRICT() == null) ? 0 : getDISTRICT().hashCode());
        result = prime * result + ((getCITY() == null) ? 0 : getCITY().hashCode());
        result = prime * result + ((getLNG() == null) ? 0 : getLNG().hashCode());
        result = prime * result + ((getLAT() == null) ? 0 : getLAT().hashCode());
        result = prime * result + ((getINSTALLER_NAME() == null) ? 0 : getINSTALLER_NAME().hashCode());
        result = prime * result + ((getINSTALL_TIME() == null) ? 0 : getINSTALL_TIME().hashCode());
        result = prime * result + ((getFACTORY() == null) ? 0 : getFACTORY().hashCode());
        result = prime * result + ((getVERSION() == null) ? 0 : getVERSION().hashCode());
        result = prime * result + ((getOPERATOR() == null) ? 0 : getOPERATOR().hashCode());
        result = prime * result + ((getPOSTAL_TYPE() == null) ? 0 : getPOSTAL_TYPE().hashCode());
        result = prime * result + ((getMODEL_NUMBER() == null) ? 0 : getMODEL_NUMBER().hashCode());
        result = prime * result + ((getMAC() == null) ? 0 : getMAC().hashCode());
        result = prime * result + ((getSECRET_KEY() == null) ? 0 : getSECRET_KEY().hashCode());
        result = prime * result + ((getSERVER_IP() == null) ? 0 : getSERVER_IP().hashCode());
        result = prime * result + ((getPORT() == null) ? 0 : getPORT().hashCode());
        result = prime * result + ((getIS_IC() == null) ? 0 : getIS_IC().hashCode());
        result = prime * result + ((getIS_PIN() == null) ? 0 : getIS_PIN().hashCode());
        result = prime * result + ((getIS_FINGERPRINT() == null) ? 0 : getIS_FINGERPRINT().hashCode());
        result = prime * result + ((getIS_FACE() == null) ? 0 : getIS_FACE().hashCode());
        result = prime * result + ((getMAX_TIMES() == null) ? 0 : getMAX_TIMES().hashCode());
        result = prime * result + ((getREMAIN_TIMES() == null) ? 0 : getREMAIN_TIMES().hashCode());
        result = prime * result + ((getNOW_TIMES() == null) ? 0 : getNOW_TIMES().hashCode());
        result = prime * result + ((getLAST_OPEN_TIME() == null) ? 0 : getLAST_OPEN_TIME().hashCode());
        result = prime * result + ((getAUTH_USER_NUM() == null) ? 0 : getAUTH_USER_NUM().hashCode());
        result = prime * result + ((getLAST_AUTH_TIME() == null) ? 0 : getLAST_AUTH_TIME().hashCode());
        result = prime * result + ((getSPECIAL_PWD() == null) ? 0 : getSPECIAL_PWD().hashCode());
        result = prime * result + ((getSTATUS() == null) ? 0 : getSTATUS().hashCode());
        result = prime * result + ((getSORT_NUM() == null) ? 0 : getSORT_NUM().hashCode());
        result = prime * result + ((getDATA_VERSION() == null) ? 0 : getDATA_VERSION().hashCode());
        result = prime * result + ((getCREATOR() == null) ? 0 : getCREATOR().hashCode());
        result = prime * result + ((getCREATE_TIME() == null) ? 0 : getCREATE_TIME().hashCode());
        result = prime * result + ((getUPDATER() == null) ? 0 : getUPDATER().hashCode());
        result = prime * result + ((getUPDATE_TIME() == null) ? 0 : getUPDATE_TIME().hashCode());
        result = prime * result + ((getREMARK() == null) ? 0 : getREMARK().hashCode());
        result = prime * result + ((getPRE_DETECTION_TIME() == null) ? 0 : getPRE_DETECTION_TIME().hashCode());
        result = prime * result + ((getNEXT_DETECTION_TIME() == null) ? 0 : getNEXT_DETECTION_TIME().hashCode());
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
        sb.append(", TRANSACTION_ID=").append(TRANSACTION_ID);
        sb.append(", LOCK_CODE=").append(LOCK_CODE);
        sb.append(", LOCK_NO=").append(LOCK_NO);
        sb.append(", SHORT_NAME=").append(SHORT_NAME);
        sb.append(", DOOR_NO=").append(DOOR_NO);
        sb.append(", DISTRICT=").append(DISTRICT);
        sb.append(", CITY=").append(CITY);
        sb.append(", LNG=").append(LNG);
        sb.append(", LAT=").append(LAT);
        sb.append(", INSTALLER_NAME=").append(INSTALLER_NAME);
        sb.append(", INSTALL_TIME=").append(INSTALL_TIME);
        sb.append(", FACTORY=").append(FACTORY);
        sb.append(", VERSION=").append(VERSION);
        sb.append(", OPERATOR=").append(OPERATOR);
        sb.append(", POSTAL_TYPE=").append(POSTAL_TYPE);
        sb.append(", MODEL_NUMBER=").append(MODEL_NUMBER);
        sb.append(", MAC=").append(MAC);
        sb.append(", SECRET_KEY=").append(SECRET_KEY);
        sb.append(", SERVER_IP=").append(SERVER_IP);
        sb.append(", PORT=").append(PORT);
        sb.append(", IS_IC=").append(IS_IC);
        sb.append(", IS_PIN=").append(IS_PIN);
        sb.append(", IS_FINGERPRINT=").append(IS_FINGERPRINT);
        sb.append(", IS_FACE=").append(IS_FACE);
        sb.append(", MAX_TIMES=").append(MAX_TIMES);
        sb.append(", REMAIN_TIMES=").append(REMAIN_TIMES);
        sb.append(", NOW_TIMES=").append(NOW_TIMES);
        sb.append(", LAST_OPEN_TIME=").append(LAST_OPEN_TIME);
        sb.append(", AUTH_USER_NUM=").append(AUTH_USER_NUM);
        sb.append(", LAST_AUTH_TIME=").append(LAST_AUTH_TIME);
        sb.append(", SPECIAL_PWD=").append(SPECIAL_PWD);
        sb.append(", STATUS=").append(STATUS);
        sb.append(", SORT_NUM=").append(SORT_NUM);
        sb.append(", DATA_VERSION=").append(DATA_VERSION);
        sb.append(", CREATOR=").append(CREATOR);
        sb.append(", CREATE_TIME=").append(CREATE_TIME);
        sb.append(", UPDATER=").append(UPDATER);
        sb.append(", UPDATE_TIME=").append(UPDATE_TIME);
        sb.append(", REMARK=").append(REMARK);
        sb.append(", PRE_DETECTION_TIME=").append(PRE_DETECTION_TIME);
        sb.append(", NEXT_DETECTION_TIME=").append(NEXT_DETECTION_TIME);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
