package cn.zciel.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * tpo_zhxx
 *
 * @author
 */
public class TpoZhxx implements Serializable {
    /**
     * 主键ID
     */
    private String ID;

    /**
     * CODE
     */
    private String CODE;

    /**
     * 姓名
     */
    private String XM;

    /**
     * 性别
     */
    private String XB;

    /**
     * 证件类别
     */
    private String ZJLB;

    /**
     * 身份证
     */
    private String ZJHM;

    /**
     * 共同租赁标识（相当于家庭code,标识合租人集合）
     */
    private String GTZLBH;

    /**
     * 人员关系
     */
    private String RYGX;

    /**
     * 出生日期
     */
    private Date CSNY;

    /**
     * 是否已成年
     */
    private Date SFYCN;

    /**
     * 婚姻状况
     */
    private String HYZK;

    /**
     * 学历
     */
    private String XL;

    /**
     * 户籍类型
     */
    private String HJLX;

    /**
     * 户籍号码
     */
    private String HJHM;

    /**
     * 户口所在地
     */
    private String HKSZD;

    /**
     * 户口首次入杭时间
     */
    private Date HKSCRHSJ;

    /**
     * 所在城区
     */
    private String SZCQ;

    /**
     * 所在城区名称
     */
    private String SZCQMC;

    /**
     * 所在街道
     */
    private String SZJD;

    /**
     * 所在街道名称
     */
    private String SZJDMC;

    /**
     * 所属社区
     */
    private String SSSQ;

    /**
     * 所属社区名称
     */
    private String SSSQMC;

    /**
     * 住址
     */
    private String ZZ;

    /**
     * 工作单位ID
     */
    private String DWID;

    /**
     * 工作单位编号
     */
    private String DWBH;

    /**
     * 在职情况
     */
    private String ZZQK;

    /**
     * 职业状态
     */
    private String ZYZT;

    /**
     * 职务职称
     */
    private String ZWZC;

    /**
     * 参加工作时间
     */
    private Date CJGZSJ;

    /**
     * 供职时间
     */
    private Date GZSJ;

    /**
     * 房改工龄
     */
    private BigDecimal FGGL;

    /**
     * 房改教龄
     */
    private BigDecimal FGJL;

    /**
     * 上年度总收入
     */
    private BigDecimal SNDZSR;

    /**
     * 公积金账号
     */
    private String GJJZH;

    /**
     * 残疾证号
     */
    private String CJZH;

    /**
     * 残疾等级
     */
    private String CJDJ;

    /**
     * 残疾类型
     */
    private String CJLX;

    /**
     * 是否军烈属
     */
    private Short SFJLS;

    /**
     * 移动电话
     */
    private String YDDH;

    /**
     * 联系电话
     */
    private String LXDH;

    /**
     * 联系地址
     */
    private String LXDZ;

    /**
     * 邮政编码
     */
    private Integer YZBM;

    /**
     * 电子邮箱
     */
    private String DZYX;

    /**
     * 是否购房人
     */
    private Short SFGFR;

    /**
     * 就业合同签订时间始
     */
    private Date HTQDSJ;

    /**
     * 就业合同签订时间止
     */
    private Date HTQDSJZ;

    /**
     * 就业合同签订年数
     */
    private Integer HTQDNS;

    /**
     * 养老保险交纳时间
     */
    private Date YLBXJNSJ;

    /**
     * 养老保险交纳年数
     */
    private Integer YLBXJNNS;

    /**
     * 住房公积金交纳时间
     */
    private Date ZFGJJJNSJ;

    /**
     * 住房公积金交纳年数
     */
    private Integer ZFGJJJNNS;

    /**
     * 税务完税证明期限
     */
    private Date SWWSZMQX;

    /**
     * 完税年数
     */
    private Integer WSNS;

    /**
     * 临时暂住证号
     */
    private String LSZZZH;

    /**
     * 职业资格
     */
    private String ZYZG;

    /**
     * 职称
     */
    private String ZC;

    /**
     * 毕业时间
     */
    private Date BYSJ;

    /**
     * 是否列入核查范围
     */
    private Short LRHCFW;

    /**
     * 是否限制购房
     */
    private Short SFXZGF;

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
     * 终止时间
     */
    private Date ZZSJ;

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

    /**
     * 是否共同申请人
     */
    private Short SFGTSQR;

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

    public String getXM() {
        return XM;
    }

    public void setXM(String XM) {
        this.XM = XM;
    }

    public String getXB() {
        return XB;
    }

    public void setXB(String XB) {
        this.XB = XB;
    }

    public String getZJLB() {
        return ZJLB;
    }

    public void setZJLB(String ZJLB) {
        this.ZJLB = ZJLB;
    }

    public String getZJHM() {
        return ZJHM;
    }

    public void setZJHM(String ZJHM) {
        this.ZJHM = ZJHM;
    }

    public String getGTZLBH() {
        return GTZLBH;
    }

    public void setGTZLBH(String GTZLBH) {
        this.GTZLBH = GTZLBH;
    }

    public String getRYGX() {
        return RYGX;
    }

    public void setRYGX(String RYGX) {
        this.RYGX = RYGX;
    }

    public Date getCSNY() {
        return CSNY;
    }

    public void setCSNY(Date CSNY) {
        this.CSNY = CSNY;
    }

    public Date getSFYCN() {
        return SFYCN;
    }

    public void setSFYCN(Date SFYCN) {
        this.SFYCN = SFYCN;
    }

    public String getHYZK() {
        return HYZK;
    }

    public void setHYZK(String HYZK) {
        this.HYZK = HYZK;
    }

    public String getXL() {
        return XL;
    }

    public void setXL(String XL) {
        this.XL = XL;
    }

    public String getHJLX() {
        return HJLX;
    }

    public void setHJLX(String HJLX) {
        this.HJLX = HJLX;
    }

    public String getHJHM() {
        return HJHM;
    }

    public void setHJHM(String HJHM) {
        this.HJHM = HJHM;
    }

    public String getHKSZD() {
        return HKSZD;
    }

    public void setHKSZD(String HKSZD) {
        this.HKSZD = HKSZD;
    }

    public Date getHKSCRHSJ() {
        return HKSCRHSJ;
    }

    public void setHKSCRHSJ(Date HKSCRHSJ) {
        this.HKSCRHSJ = HKSCRHSJ;
    }

    public String getSZCQ() {
        return SZCQ;
    }

    public void setSZCQ(String SZCQ) {
        this.SZCQ = SZCQ;
    }

    public String getSZCQMC() {
        return SZCQMC;
    }

    public void setSZCQMC(String SZCQMC) {
        this.SZCQMC = SZCQMC;
    }

    public String getSZJD() {
        return SZJD;
    }

    public void setSZJD(String SZJD) {
        this.SZJD = SZJD;
    }

    public String getSZJDMC() {
        return SZJDMC;
    }

    public void setSZJDMC(String SZJDMC) {
        this.SZJDMC = SZJDMC;
    }

    public String getSSSQ() {
        return SSSQ;
    }

    public void setSSSQ(String SSSQ) {
        this.SSSQ = SSSQ;
    }

    public String getSSSQMC() {
        return SSSQMC;
    }

    public void setSSSQMC(String SSSQMC) {
        this.SSSQMC = SSSQMC;
    }

    public String getZZ() {
        return ZZ;
    }

    public void setZZ(String ZZ) {
        this.ZZ = ZZ;
    }

    public String getDWID() {
        return DWID;
    }

    public void setDWID(String DWID) {
        this.DWID = DWID;
    }

    public String getDWBH() {
        return DWBH;
    }

    public void setDWBH(String DWBH) {
        this.DWBH = DWBH;
    }

    public String getZZQK() {
        return ZZQK;
    }

    public void setZZQK(String ZZQK) {
        this.ZZQK = ZZQK;
    }

    public String getZYZT() {
        return ZYZT;
    }

    public void setZYZT(String ZYZT) {
        this.ZYZT = ZYZT;
    }

    public String getZWZC() {
        return ZWZC;
    }

    public void setZWZC(String ZWZC) {
        this.ZWZC = ZWZC;
    }

    public Date getCJGZSJ() {
        return CJGZSJ;
    }

    public void setCJGZSJ(Date CJGZSJ) {
        this.CJGZSJ = CJGZSJ;
    }

    public Date getGZSJ() {
        return GZSJ;
    }

    public void setGZSJ(Date GZSJ) {
        this.GZSJ = GZSJ;
    }

    public BigDecimal getFGGL() {
        return FGGL;
    }

    public void setFGGL(BigDecimal FGGL) {
        this.FGGL = FGGL;
    }

    public BigDecimal getFGJL() {
        return FGJL;
    }

    public void setFGJL(BigDecimal FGJL) {
        this.FGJL = FGJL;
    }

    public BigDecimal getSNDZSR() {
        return SNDZSR;
    }

    public void setSNDZSR(BigDecimal SNDZSR) {
        this.SNDZSR = SNDZSR;
    }

    public String getGJJZH() {
        return GJJZH;
    }

    public void setGJJZH(String GJJZH) {
        this.GJJZH = GJJZH;
    }

    public String getCJZH() {
        return CJZH;
    }

    public void setCJZH(String CJZH) {
        this.CJZH = CJZH;
    }

    public String getCJDJ() {
        return CJDJ;
    }

    public void setCJDJ(String CJDJ) {
        this.CJDJ = CJDJ;
    }

    public String getCJLX() {
        return CJLX;
    }

    public void setCJLX(String CJLX) {
        this.CJLX = CJLX;
    }

    public Short getSFJLS() {
        return SFJLS;
    }

    public void setSFJLS(Short SFJLS) {
        this.SFJLS = SFJLS;
    }

    public String getYDDH() {
        return YDDH;
    }

    public void setYDDH(String YDDH) {
        this.YDDH = YDDH;
    }

    public String getLXDH() {
        return LXDH;
    }

    public void setLXDH(String LXDH) {
        this.LXDH = LXDH;
    }

    public String getLXDZ() {
        return LXDZ;
    }

    public void setLXDZ(String LXDZ) {
        this.LXDZ = LXDZ;
    }

    public Integer getYZBM() {
        return YZBM;
    }

    public void setYZBM(Integer YZBM) {
        this.YZBM = YZBM;
    }

    public String getDZYX() {
        return DZYX;
    }

    public void setDZYX(String DZYX) {
        this.DZYX = DZYX;
    }

    public Short getSFGFR() {
        return SFGFR;
    }

    public void setSFGFR(Short SFGFR) {
        this.SFGFR = SFGFR;
    }

    public Date getHTQDSJ() {
        return HTQDSJ;
    }

    public void setHTQDSJ(Date HTQDSJ) {
        this.HTQDSJ = HTQDSJ;
    }

    public Date getHTQDSJZ() {
        return HTQDSJZ;
    }

    public void setHTQDSJZ(Date HTQDSJZ) {
        this.HTQDSJZ = HTQDSJZ;
    }

    public Integer getHTQDNS() {
        return HTQDNS;
    }

    public void setHTQDNS(Integer HTQDNS) {
        this.HTQDNS = HTQDNS;
    }

    public Date getYLBXJNSJ() {
        return YLBXJNSJ;
    }

    public void setYLBXJNSJ(Date YLBXJNSJ) {
        this.YLBXJNSJ = YLBXJNSJ;
    }

    public Integer getYLBXJNNS() {
        return YLBXJNNS;
    }

    public void setYLBXJNNS(Integer YLBXJNNS) {
        this.YLBXJNNS = YLBXJNNS;
    }

    public Date getZFGJJJNSJ() {
        return ZFGJJJNSJ;
    }

    public void setZFGJJJNSJ(Date ZFGJJJNSJ) {
        this.ZFGJJJNSJ = ZFGJJJNSJ;
    }

    public Integer getZFGJJJNNS() {
        return ZFGJJJNNS;
    }

    public void setZFGJJJNNS(Integer ZFGJJJNNS) {
        this.ZFGJJJNNS = ZFGJJJNNS;
    }

    public Date getSWWSZMQX() {
        return SWWSZMQX;
    }

    public void setSWWSZMQX(Date SWWSZMQX) {
        this.SWWSZMQX = SWWSZMQX;
    }

    public Integer getWSNS() {
        return WSNS;
    }

    public void setWSNS(Integer WSNS) {
        this.WSNS = WSNS;
    }

    public String getLSZZZH() {
        return LSZZZH;
    }

    public void setLSZZZH(String LSZZZH) {
        this.LSZZZH = LSZZZH;
    }

    public String getZYZG() {
        return ZYZG;
    }

    public void setZYZG(String ZYZG) {
        this.ZYZG = ZYZG;
    }

    public String getZC() {
        return ZC;
    }

    public void setZC(String ZC) {
        this.ZC = ZC;
    }

    public Date getBYSJ() {
        return BYSJ;
    }

    public void setBYSJ(Date BYSJ) {
        this.BYSJ = BYSJ;
    }

    public Short getLRHCFW() {
        return LRHCFW;
    }

    public void setLRHCFW(Short LRHCFW) {
        this.LRHCFW = LRHCFW;
    }

    public Short getSFXZGF() {
        return SFXZGF;
    }

    public void setSFXZGF(Short SFXZGF) {
        this.SFXZGF = SFXZGF;
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

    public Date getZZSJ() {
        return ZZSJ;
    }

    public void setZZSJ(Date ZZSJ) {
        this.ZZSJ = ZZSJ;
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

    public Short getSFGTSQR() {
        return SFGTSQR;
    }

    public void setSFGTSQR(Short SFGTSQR) {
        this.SFGTSQR = SFGTSQR;
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
        TpoZhxx other = (TpoZhxx) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
                && (this.getCODE() == null ? other.getCODE() == null : this.getCODE().equals(other.getCODE()))
                && (this.getXM() == null ? other.getXM() == null : this.getXM().equals(other.getXM()))
                && (this.getXB() == null ? other.getXB() == null : this.getXB().equals(other.getXB()))
                && (this.getZJLB() == null ? other.getZJLB() == null : this.getZJLB().equals(other.getZJLB()))
                && (this.getZJHM() == null ? other.getZJHM() == null : this.getZJHM().equals(other.getZJHM()))
                && (this.getGTZLBH() == null ? other.getGTZLBH() == null : this.getGTZLBH().equals(other.getGTZLBH()))
                && (this.getRYGX() == null ? other.getRYGX() == null : this.getRYGX().equals(other.getRYGX()))
                && (this.getCSNY() == null ? other.getCSNY() == null : this.getCSNY().equals(other.getCSNY()))
                && (this.getSFYCN() == null ? other.getSFYCN() == null : this.getSFYCN().equals(other.getSFYCN()))
                && (this.getHYZK() == null ? other.getHYZK() == null : this.getHYZK().equals(other.getHYZK()))
                && (this.getXL() == null ? other.getXL() == null : this.getXL().equals(other.getXL()))
                && (this.getHJLX() == null ? other.getHJLX() == null : this.getHJLX().equals(other.getHJLX()))
                && (this.getHJHM() == null ? other.getHJHM() == null : this.getHJHM().equals(other.getHJHM()))
                && (this.getHKSZD() == null ? other.getHKSZD() == null : this.getHKSZD().equals(other.getHKSZD()))
                && (this.getHKSCRHSJ() == null ? other.getHKSCRHSJ() == null : this.getHKSCRHSJ().equals(other.getHKSCRHSJ()))
                && (this.getSZCQ() == null ? other.getSZCQ() == null : this.getSZCQ().equals(other.getSZCQ()))
                && (this.getSZCQMC() == null ? other.getSZCQMC() == null : this.getSZCQMC().equals(other.getSZCQMC()))
                && (this.getSZJD() == null ? other.getSZJD() == null : this.getSZJD().equals(other.getSZJD()))
                && (this.getSZJDMC() == null ? other.getSZJDMC() == null : this.getSZJDMC().equals(other.getSZJDMC()))
                && (this.getSSSQ() == null ? other.getSSSQ() == null : this.getSSSQ().equals(other.getSSSQ()))
                && (this.getSSSQMC() == null ? other.getSSSQMC() == null : this.getSSSQMC().equals(other.getSSSQMC()))
                && (this.getZZ() == null ? other.getZZ() == null : this.getZZ().equals(other.getZZ()))
                && (this.getDWID() == null ? other.getDWID() == null : this.getDWID().equals(other.getDWID()))
                && (this.getDWBH() == null ? other.getDWBH() == null : this.getDWBH().equals(other.getDWBH()))
                && (this.getZZQK() == null ? other.getZZQK() == null : this.getZZQK().equals(other.getZZQK()))
                && (this.getZYZT() == null ? other.getZYZT() == null : this.getZYZT().equals(other.getZYZT()))
                && (this.getZWZC() == null ? other.getZWZC() == null : this.getZWZC().equals(other.getZWZC()))
                && (this.getCJGZSJ() == null ? other.getCJGZSJ() == null : this.getCJGZSJ().equals(other.getCJGZSJ()))
                && (this.getGZSJ() == null ? other.getGZSJ() == null : this.getGZSJ().equals(other.getGZSJ()))
                && (this.getFGGL() == null ? other.getFGGL() == null : this.getFGGL().equals(other.getFGGL()))
                && (this.getFGJL() == null ? other.getFGJL() == null : this.getFGJL().equals(other.getFGJL()))
                && (this.getSNDZSR() == null ? other.getSNDZSR() == null : this.getSNDZSR().equals(other.getSNDZSR()))
                && (this.getGJJZH() == null ? other.getGJJZH() == null : this.getGJJZH().equals(other.getGJJZH()))
                && (this.getCJZH() == null ? other.getCJZH() == null : this.getCJZH().equals(other.getCJZH()))
                && (this.getCJDJ() == null ? other.getCJDJ() == null : this.getCJDJ().equals(other.getCJDJ()))
                && (this.getCJLX() == null ? other.getCJLX() == null : this.getCJLX().equals(other.getCJLX()))
                && (this.getSFJLS() == null ? other.getSFJLS() == null : this.getSFJLS().equals(other.getSFJLS()))
                && (this.getYDDH() == null ? other.getYDDH() == null : this.getYDDH().equals(other.getYDDH()))
                && (this.getLXDH() == null ? other.getLXDH() == null : this.getLXDH().equals(other.getLXDH()))
                && (this.getLXDZ() == null ? other.getLXDZ() == null : this.getLXDZ().equals(other.getLXDZ()))
                && (this.getYZBM() == null ? other.getYZBM() == null : this.getYZBM().equals(other.getYZBM()))
                && (this.getDZYX() == null ? other.getDZYX() == null : this.getDZYX().equals(other.getDZYX()))
                && (this.getSFGFR() == null ? other.getSFGFR() == null : this.getSFGFR().equals(other.getSFGFR()))
                && (this.getHTQDSJ() == null ? other.getHTQDSJ() == null : this.getHTQDSJ().equals(other.getHTQDSJ()))
                && (this.getHTQDSJZ() == null ? other.getHTQDSJZ() == null : this.getHTQDSJZ().equals(other.getHTQDSJZ()))
                && (this.getHTQDNS() == null ? other.getHTQDNS() == null : this.getHTQDNS().equals(other.getHTQDNS()))
                && (this.getYLBXJNSJ() == null ? other.getYLBXJNSJ() == null : this.getYLBXJNSJ().equals(other.getYLBXJNSJ()))
                && (this.getYLBXJNNS() == null ? other.getYLBXJNNS() == null : this.getYLBXJNNS().equals(other.getYLBXJNNS()))
                && (this.getZFGJJJNSJ() == null ? other.getZFGJJJNSJ() == null : this.getZFGJJJNSJ().equals(other.getZFGJJJNSJ()))
                && (this.getZFGJJJNNS() == null ? other.getZFGJJJNNS() == null : this.getZFGJJJNNS().equals(other.getZFGJJJNNS()))
                && (this.getSWWSZMQX() == null ? other.getSWWSZMQX() == null : this.getSWWSZMQX().equals(other.getSWWSZMQX()))
                && (this.getWSNS() == null ? other.getWSNS() == null : this.getWSNS().equals(other.getWSNS()))
                && (this.getLSZZZH() == null ? other.getLSZZZH() == null : this.getLSZZZH().equals(other.getLSZZZH()))
                && (this.getZYZG() == null ? other.getZYZG() == null : this.getZYZG().equals(other.getZYZG()))
                && (this.getZC() == null ? other.getZC() == null : this.getZC().equals(other.getZC()))
                && (this.getBYSJ() == null ? other.getBYSJ() == null : this.getBYSJ().equals(other.getBYSJ()))
                && (this.getLRHCFW() == null ? other.getLRHCFW() == null : this.getLRHCFW().equals(other.getLRHCFW()))
                && (this.getSFXZGF() == null ? other.getSFXZGF() == null : this.getSFXZGF().equals(other.getSFXZGF()))
                && (this.getSORT_NUM() == null ? other.getSORT_NUM() == null : this.getSORT_NUM().equals(other.getSORT_NUM()))
                && (this.getDATA_VERSION() == null ? other.getDATA_VERSION() == null : this.getDATA_VERSION().equals(other.getDATA_VERSION()))
                && (this.getCREATOR() == null ? other.getCREATOR() == null : this.getCREATOR().equals(other.getCREATOR()))
                && (this.getCREATE_TIME() == null ? other.getCREATE_TIME() == null : this.getCREATE_TIME().equals(other.getCREATE_TIME()))
                && (this.getZZSJ() == null ? other.getZZSJ() == null : this.getZZSJ().equals(other.getZZSJ()))
                && (this.getUPDATOR() == null ? other.getUPDATOR() == null : this.getUPDATOR().equals(other.getUPDATOR()))
                && (this.getUPDATE_TIME() == null ? other.getUPDATE_TIME() == null : this.getUPDATE_TIME().equals(other.getUPDATE_TIME()))
                && (this.getYXBZ() == null ? other.getYXBZ() == null : this.getYXBZ().equals(other.getYXBZ()))
                && (this.getCOMMENTS() == null ? other.getCOMMENTS() == null : this.getCOMMENTS().equals(other.getCOMMENTS()))
                && (this.getSFGTSQR() == null ? other.getSFGTSQR() == null : this.getSFGTSQR().equals(other.getSFGTSQR()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getCODE() == null) ? 0 : getCODE().hashCode());
        result = prime * result + ((getXM() == null) ? 0 : getXM().hashCode());
        result = prime * result + ((getXB() == null) ? 0 : getXB().hashCode());
        result = prime * result + ((getZJLB() == null) ? 0 : getZJLB().hashCode());
        result = prime * result + ((getZJHM() == null) ? 0 : getZJHM().hashCode());
        result = prime * result + ((getGTZLBH() == null) ? 0 : getGTZLBH().hashCode());
        result = prime * result + ((getRYGX() == null) ? 0 : getRYGX().hashCode());
        result = prime * result + ((getCSNY() == null) ? 0 : getCSNY().hashCode());
        result = prime * result + ((getSFYCN() == null) ? 0 : getSFYCN().hashCode());
        result = prime * result + ((getHYZK() == null) ? 0 : getHYZK().hashCode());
        result = prime * result + ((getXL() == null) ? 0 : getXL().hashCode());
        result = prime * result + ((getHJLX() == null) ? 0 : getHJLX().hashCode());
        result = prime * result + ((getHJHM() == null) ? 0 : getHJHM().hashCode());
        result = prime * result + ((getHKSZD() == null) ? 0 : getHKSZD().hashCode());
        result = prime * result + ((getHKSCRHSJ() == null) ? 0 : getHKSCRHSJ().hashCode());
        result = prime * result + ((getSZCQ() == null) ? 0 : getSZCQ().hashCode());
        result = prime * result + ((getSZCQMC() == null) ? 0 : getSZCQMC().hashCode());
        result = prime * result + ((getSZJD() == null) ? 0 : getSZJD().hashCode());
        result = prime * result + ((getSZJDMC() == null) ? 0 : getSZJDMC().hashCode());
        result = prime * result + ((getSSSQ() == null) ? 0 : getSSSQ().hashCode());
        result = prime * result + ((getSSSQMC() == null) ? 0 : getSSSQMC().hashCode());
        result = prime * result + ((getZZ() == null) ? 0 : getZZ().hashCode());
        result = prime * result + ((getDWID() == null) ? 0 : getDWID().hashCode());
        result = prime * result + ((getDWBH() == null) ? 0 : getDWBH().hashCode());
        result = prime * result + ((getZZQK() == null) ? 0 : getZZQK().hashCode());
        result = prime * result + ((getZYZT() == null) ? 0 : getZYZT().hashCode());
        result = prime * result + ((getZWZC() == null) ? 0 : getZWZC().hashCode());
        result = prime * result + ((getCJGZSJ() == null) ? 0 : getCJGZSJ().hashCode());
        result = prime * result + ((getGZSJ() == null) ? 0 : getGZSJ().hashCode());
        result = prime * result + ((getFGGL() == null) ? 0 : getFGGL().hashCode());
        result = prime * result + ((getFGJL() == null) ? 0 : getFGJL().hashCode());
        result = prime * result + ((getSNDZSR() == null) ? 0 : getSNDZSR().hashCode());
        result = prime * result + ((getGJJZH() == null) ? 0 : getGJJZH().hashCode());
        result = prime * result + ((getCJZH() == null) ? 0 : getCJZH().hashCode());
        result = prime * result + ((getCJDJ() == null) ? 0 : getCJDJ().hashCode());
        result = prime * result + ((getCJLX() == null) ? 0 : getCJLX().hashCode());
        result = prime * result + ((getSFJLS() == null) ? 0 : getSFJLS().hashCode());
        result = prime * result + ((getYDDH() == null) ? 0 : getYDDH().hashCode());
        result = prime * result + ((getLXDH() == null) ? 0 : getLXDH().hashCode());
        result = prime * result + ((getLXDZ() == null) ? 0 : getLXDZ().hashCode());
        result = prime * result + ((getYZBM() == null) ? 0 : getYZBM().hashCode());
        result = prime * result + ((getDZYX() == null) ? 0 : getDZYX().hashCode());
        result = prime * result + ((getSFGFR() == null) ? 0 : getSFGFR().hashCode());
        result = prime * result + ((getHTQDSJ() == null) ? 0 : getHTQDSJ().hashCode());
        result = prime * result + ((getHTQDSJZ() == null) ? 0 : getHTQDSJZ().hashCode());
        result = prime * result + ((getHTQDNS() == null) ? 0 : getHTQDNS().hashCode());
        result = prime * result + ((getYLBXJNSJ() == null) ? 0 : getYLBXJNSJ().hashCode());
        result = prime * result + ((getYLBXJNNS() == null) ? 0 : getYLBXJNNS().hashCode());
        result = prime * result + ((getZFGJJJNSJ() == null) ? 0 : getZFGJJJNSJ().hashCode());
        result = prime * result + ((getZFGJJJNNS() == null) ? 0 : getZFGJJJNNS().hashCode());
        result = prime * result + ((getSWWSZMQX() == null) ? 0 : getSWWSZMQX().hashCode());
        result = prime * result + ((getWSNS() == null) ? 0 : getWSNS().hashCode());
        result = prime * result + ((getLSZZZH() == null) ? 0 : getLSZZZH().hashCode());
        result = prime * result + ((getZYZG() == null) ? 0 : getZYZG().hashCode());
        result = prime * result + ((getZC() == null) ? 0 : getZC().hashCode());
        result = prime * result + ((getBYSJ() == null) ? 0 : getBYSJ().hashCode());
        result = prime * result + ((getLRHCFW() == null) ? 0 : getLRHCFW().hashCode());
        result = prime * result + ((getSFXZGF() == null) ? 0 : getSFXZGF().hashCode());
        result = prime * result + ((getSORT_NUM() == null) ? 0 : getSORT_NUM().hashCode());
        result = prime * result + ((getDATA_VERSION() == null) ? 0 : getDATA_VERSION().hashCode());
        result = prime * result + ((getCREATOR() == null) ? 0 : getCREATOR().hashCode());
        result = prime * result + ((getCREATE_TIME() == null) ? 0 : getCREATE_TIME().hashCode());
        result = prime * result + ((getZZSJ() == null) ? 0 : getZZSJ().hashCode());
        result = prime * result + ((getUPDATOR() == null) ? 0 : getUPDATOR().hashCode());
        result = prime * result + ((getUPDATE_TIME() == null) ? 0 : getUPDATE_TIME().hashCode());
        result = prime * result + ((getYXBZ() == null) ? 0 : getYXBZ().hashCode());
        result = prime * result + ((getCOMMENTS() == null) ? 0 : getCOMMENTS().hashCode());
        result = prime * result + ((getSFGTSQR() == null) ? 0 : getSFGTSQR().hashCode());
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
        sb.append(", XM=").append(XM);
        sb.append(", XB=").append(XB);
        sb.append(", ZJLB=").append(ZJLB);
        sb.append(", ZJHM=").append(ZJHM);
        sb.append(", GTZLBH=").append(GTZLBH);
        sb.append(", RYGX=").append(RYGX);
        sb.append(", CSNY=").append(CSNY);
        sb.append(", SFYCN=").append(SFYCN);
        sb.append(", HYZK=").append(HYZK);
        sb.append(", XL=").append(XL);
        sb.append(", HJLX=").append(HJLX);
        sb.append(", HJHM=").append(HJHM);
        sb.append(", HKSZD=").append(HKSZD);
        sb.append(", HKSCRHSJ=").append(HKSCRHSJ);
        sb.append(", SZCQ=").append(SZCQ);
        sb.append(", SZCQMC=").append(SZCQMC);
        sb.append(", SZJD=").append(SZJD);
        sb.append(", SZJDMC=").append(SZJDMC);
        sb.append(", SSSQ=").append(SSSQ);
        sb.append(", SSSQMC=").append(SSSQMC);
        sb.append(", ZZ=").append(ZZ);
        sb.append(", DWID=").append(DWID);
        sb.append(", DWBH=").append(DWBH);
        sb.append(", ZZQK=").append(ZZQK);
        sb.append(", ZYZT=").append(ZYZT);
        sb.append(", ZWZC=").append(ZWZC);
        sb.append(", CJGZSJ=").append(CJGZSJ);
        sb.append(", GZSJ=").append(GZSJ);
        sb.append(", FGGL=").append(FGGL);
        sb.append(", FGJL=").append(FGJL);
        sb.append(", SNDZSR=").append(SNDZSR);
        sb.append(", GJJZH=").append(GJJZH);
        sb.append(", CJZH=").append(CJZH);
        sb.append(", CJDJ=").append(CJDJ);
        sb.append(", CJLX=").append(CJLX);
        sb.append(", SFJLS=").append(SFJLS);
        sb.append(", YDDH=").append(YDDH);
        sb.append(", LXDH=").append(LXDH);
        sb.append(", LXDZ=").append(LXDZ);
        sb.append(", YZBM=").append(YZBM);
        sb.append(", DZYX=").append(DZYX);
        sb.append(", SFGFR=").append(SFGFR);
        sb.append(", HTQDSJ=").append(HTQDSJ);
        sb.append(", HTQDSJZ=").append(HTQDSJZ);
        sb.append(", HTQDNS=").append(HTQDNS);
        sb.append(", YLBXJNSJ=").append(YLBXJNSJ);
        sb.append(", YLBXJNNS=").append(YLBXJNNS);
        sb.append(", ZFGJJJNSJ=").append(ZFGJJJNSJ);
        sb.append(", ZFGJJJNNS=").append(ZFGJJJNNS);
        sb.append(", SWWSZMQX=").append(SWWSZMQX);
        sb.append(", WSNS=").append(WSNS);
        sb.append(", LSZZZH=").append(LSZZZH);
        sb.append(", ZYZG=").append(ZYZG);
        sb.append(", ZC=").append(ZC);
        sb.append(", BYSJ=").append(BYSJ);
        sb.append(", LRHCFW=").append(LRHCFW);
        sb.append(", SFXZGF=").append(SFXZGF);
        sb.append(", SORT_NUM=").append(SORT_NUM);
        sb.append(", DATA_VERSION=").append(DATA_VERSION);
        sb.append(", CREATOR=").append(CREATOR);
        sb.append(", CREATE_TIME=").append(CREATE_TIME);
        sb.append(", ZZSJ=").append(ZZSJ);
        sb.append(", UPDATOR=").append(UPDATOR);
        sb.append(", UPDATE_TIME=").append(UPDATE_TIME);
        sb.append(", YXBZ=").append(YXBZ);
        sb.append(", COMMENTS=").append(COMMENTS);
        sb.append(", SFGTSQR=").append(SFGTSQR);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
