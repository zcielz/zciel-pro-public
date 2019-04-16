package cn.zciel.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TpoYhzjzhExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public TpoYhzjzhExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    public void setForUpdate(Boolean forUpdate) {
        this.forUpdate = forUpdate;
    }

    public Boolean getForUpdate() {
        return forUpdate;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIDIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIDIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIDEqualTo(String value) {
            addCriterion("ID =", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotEqualTo(String value) {
            addCriterion("ID <>", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThan(String value) {
            addCriterion("ID >", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThan(String value) {
            addCriterion("ID <", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLike(String value) {
            addCriterion("ID like", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotLike(String value) {
            addCriterion("ID not like", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDIn(List<String> values) {
            addCriterion("ID in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotIn(List<String> values) {
            addCriterion("ID not in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andCODEIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCODEIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCODEEqualTo(String value) {
            addCriterion("CODE =", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODENotEqualTo(String value) {
            addCriterion("CODE <>", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODEGreaterThan(String value) {
            addCriterion("CODE >", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODEGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODELessThan(String value) {
            addCriterion("CODE <", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODELessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODELike(String value) {
            addCriterion("CODE like", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODENotLike(String value) {
            addCriterion("CODE not like", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODEIn(List<String> values) {
            addCriterion("CODE in", values, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODENotIn(List<String> values) {
            addCriterion("CODE not in", values, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODEBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODENotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "CODE");
            return (Criteria) this;
        }

        public Criteria andPZIDIsNull() {
            addCriterion("PZID is null");
            return (Criteria) this;
        }

        public Criteria andPZIDIsNotNull() {
            addCriterion("PZID is not null");
            return (Criteria) this;
        }

        public Criteria andPZIDEqualTo(String value) {
            addCriterion("PZID =", value, "PZID");
            return (Criteria) this;
        }

        public Criteria andPZIDNotEqualTo(String value) {
            addCriterion("PZID <>", value, "PZID");
            return (Criteria) this;
        }

        public Criteria andPZIDGreaterThan(String value) {
            addCriterion("PZID >", value, "PZID");
            return (Criteria) this;
        }

        public Criteria andPZIDGreaterThanOrEqualTo(String value) {
            addCriterion("PZID >=", value, "PZID");
            return (Criteria) this;
        }

        public Criteria andPZIDLessThan(String value) {
            addCriterion("PZID <", value, "PZID");
            return (Criteria) this;
        }

        public Criteria andPZIDLessThanOrEqualTo(String value) {
            addCriterion("PZID <=", value, "PZID");
            return (Criteria) this;
        }

        public Criteria andPZIDLike(String value) {
            addCriterion("PZID like", value, "PZID");
            return (Criteria) this;
        }

        public Criteria andPZIDNotLike(String value) {
            addCriterion("PZID not like", value, "PZID");
            return (Criteria) this;
        }

        public Criteria andPZIDIn(List<String> values) {
            addCriterion("PZID in", values, "PZID");
            return (Criteria) this;
        }

        public Criteria andPZIDNotIn(List<String> values) {
            addCriterion("PZID not in", values, "PZID");
            return (Criteria) this;
        }

        public Criteria andPZIDBetween(String value1, String value2) {
            addCriterion("PZID between", value1, value2, "PZID");
            return (Criteria) this;
        }

        public Criteria andPZIDNotBetween(String value1, String value2) {
            addCriterion("PZID not between", value1, value2, "PZID");
            return (Criteria) this;
        }

        public Criteria andSQRIDIsNull() {
            addCriterion("SQRID is null");
            return (Criteria) this;
        }

        public Criteria andSQRIDIsNotNull() {
            addCriterion("SQRID is not null");
            return (Criteria) this;
        }

        public Criteria andSQRIDEqualTo(String value) {
            addCriterion("SQRID =", value, "SQRID");
            return (Criteria) this;
        }

        public Criteria andSQRIDNotEqualTo(String value) {
            addCriterion("SQRID <>", value, "SQRID");
            return (Criteria) this;
        }

        public Criteria andSQRIDGreaterThan(String value) {
            addCriterion("SQRID >", value, "SQRID");
            return (Criteria) this;
        }

        public Criteria andSQRIDGreaterThanOrEqualTo(String value) {
            addCriterion("SQRID >=", value, "SQRID");
            return (Criteria) this;
        }

        public Criteria andSQRIDLessThan(String value) {
            addCriterion("SQRID <", value, "SQRID");
            return (Criteria) this;
        }

        public Criteria andSQRIDLessThanOrEqualTo(String value) {
            addCriterion("SQRID <=", value, "SQRID");
            return (Criteria) this;
        }

        public Criteria andSQRIDLike(String value) {
            addCriterion("SQRID like", value, "SQRID");
            return (Criteria) this;
        }

        public Criteria andSQRIDNotLike(String value) {
            addCriterion("SQRID not like", value, "SQRID");
            return (Criteria) this;
        }

        public Criteria andSQRIDIn(List<String> values) {
            addCriterion("SQRID in", values, "SQRID");
            return (Criteria) this;
        }

        public Criteria andSQRIDNotIn(List<String> values) {
            addCriterion("SQRID not in", values, "SQRID");
            return (Criteria) this;
        }

        public Criteria andSQRIDBetween(String value1, String value2) {
            addCriterion("SQRID between", value1, value2, "SQRID");
            return (Criteria) this;
        }

        public Criteria andSQRIDNotBetween(String value1, String value2) {
            addCriterion("SQRID not between", value1, value2, "SQRID");
            return (Criteria) this;
        }

        public Criteria andSQRCODEIsNull() {
            addCriterion("SQRCODE is null");
            return (Criteria) this;
        }

        public Criteria andSQRCODEIsNotNull() {
            addCriterion("SQRCODE is not null");
            return (Criteria) this;
        }

        public Criteria andSQRCODEEqualTo(String value) {
            addCriterion("SQRCODE =", value, "SQRCODE");
            return (Criteria) this;
        }

        public Criteria andSQRCODENotEqualTo(String value) {
            addCriterion("SQRCODE <>", value, "SQRCODE");
            return (Criteria) this;
        }

        public Criteria andSQRCODEGreaterThan(String value) {
            addCriterion("SQRCODE >", value, "SQRCODE");
            return (Criteria) this;
        }

        public Criteria andSQRCODEGreaterThanOrEqualTo(String value) {
            addCriterion("SQRCODE >=", value, "SQRCODE");
            return (Criteria) this;
        }

        public Criteria andSQRCODELessThan(String value) {
            addCriterion("SQRCODE <", value, "SQRCODE");
            return (Criteria) this;
        }

        public Criteria andSQRCODELessThanOrEqualTo(String value) {
            addCriterion("SQRCODE <=", value, "SQRCODE");
            return (Criteria) this;
        }

        public Criteria andSQRCODELike(String value) {
            addCriterion("SQRCODE like", value, "SQRCODE");
            return (Criteria) this;
        }

        public Criteria andSQRCODENotLike(String value) {
            addCriterion("SQRCODE not like", value, "SQRCODE");
            return (Criteria) this;
        }

        public Criteria andSQRCODEIn(List<String> values) {
            addCriterion("SQRCODE in", values, "SQRCODE");
            return (Criteria) this;
        }

        public Criteria andSQRCODENotIn(List<String> values) {
            addCriterion("SQRCODE not in", values, "SQRCODE");
            return (Criteria) this;
        }

        public Criteria andSQRCODEBetween(String value1, String value2) {
            addCriterion("SQRCODE between", value1, value2, "SQRCODE");
            return (Criteria) this;
        }

        public Criteria andSQRCODENotBetween(String value1, String value2) {
            addCriterion("SQRCODE not between", value1, value2, "SQRCODE");
            return (Criteria) this;
        }

        public Criteria andWYPSIsNull() {
            addCriterion("WYPS is null");
            return (Criteria) this;
        }

        public Criteria andWYPSIsNotNull() {
            addCriterion("WYPS is not null");
            return (Criteria) this;
        }

        public Criteria andWYPSEqualTo(String value) {
            addCriterion("WYPS =", value, "WYPS");
            return (Criteria) this;
        }

        public Criteria andWYPSNotEqualTo(String value) {
            addCriterion("WYPS <>", value, "WYPS");
            return (Criteria) this;
        }

        public Criteria andWYPSGreaterThan(String value) {
            addCriterion("WYPS >", value, "WYPS");
            return (Criteria) this;
        }

        public Criteria andWYPSGreaterThanOrEqualTo(String value) {
            addCriterion("WYPS >=", value, "WYPS");
            return (Criteria) this;
        }

        public Criteria andWYPSLessThan(String value) {
            addCriterion("WYPS <", value, "WYPS");
            return (Criteria) this;
        }

        public Criteria andWYPSLessThanOrEqualTo(String value) {
            addCriterion("WYPS <=", value, "WYPS");
            return (Criteria) this;
        }

        public Criteria andWYPSLike(String value) {
            addCriterion("WYPS like", value, "WYPS");
            return (Criteria) this;
        }

        public Criteria andWYPSNotLike(String value) {
            addCriterion("WYPS not like", value, "WYPS");
            return (Criteria) this;
        }

        public Criteria andWYPSIn(List<String> values) {
            addCriterion("WYPS in", values, "WYPS");
            return (Criteria) this;
        }

        public Criteria andWYPSNotIn(List<String> values) {
            addCriterion("WYPS not in", values, "WYPS");
            return (Criteria) this;
        }

        public Criteria andWYPSBetween(String value1, String value2) {
            addCriterion("WYPS between", value1, value2, "WYPS");
            return (Criteria) this;
        }

        public Criteria andWYPSNotBetween(String value1, String value2) {
            addCriterion("WYPS not between", value1, value2, "WYPS");
            return (Criteria) this;
        }

        public Criteria andYEIsNull() {
            addCriterion("YE is null");
            return (Criteria) this;
        }

        public Criteria andYEIsNotNull() {
            addCriterion("YE is not null");
            return (Criteria) this;
        }

        public Criteria andYEEqualTo(BigDecimal value) {
            addCriterion("YE =", value, "YE");
            return (Criteria) this;
        }

        public Criteria andYENotEqualTo(BigDecimal value) {
            addCriterion("YE <>", value, "YE");
            return (Criteria) this;
        }

        public Criteria andYEGreaterThan(BigDecimal value) {
            addCriterion("YE >", value, "YE");
            return (Criteria) this;
        }

        public Criteria andYEGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YE >=", value, "YE");
            return (Criteria) this;
        }

        public Criteria andYELessThan(BigDecimal value) {
            addCriterion("YE <", value, "YE");
            return (Criteria) this;
        }

        public Criteria andYELessThanOrEqualTo(BigDecimal value) {
            addCriterion("YE <=", value, "YE");
            return (Criteria) this;
        }

        public Criteria andYEIn(List<BigDecimal> values) {
            addCriterion("YE in", values, "YE");
            return (Criteria) this;
        }

        public Criteria andYENotIn(List<BigDecimal> values) {
            addCriterion("YE not in", values, "YE");
            return (Criteria) this;
        }

        public Criteria andYEBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YE between", value1, value2, "YE");
            return (Criteria) this;
        }

        public Criteria andYENotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YE not between", value1, value2, "YE");
            return (Criteria) this;
        }

        public Criteria andYJIsNull() {
            addCriterion("YJ is null");
            return (Criteria) this;
        }

        public Criteria andYJIsNotNull() {
            addCriterion("YJ is not null");
            return (Criteria) this;
        }

        public Criteria andYJEqualTo(BigDecimal value) {
            addCriterion("YJ =", value, "YJ");
            return (Criteria) this;
        }

        public Criteria andYJNotEqualTo(BigDecimal value) {
            addCriterion("YJ <>", value, "YJ");
            return (Criteria) this;
        }

        public Criteria andYJGreaterThan(BigDecimal value) {
            addCriterion("YJ >", value, "YJ");
            return (Criteria) this;
        }

        public Criteria andYJGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YJ >=", value, "YJ");
            return (Criteria) this;
        }

        public Criteria andYJLessThan(BigDecimal value) {
            addCriterion("YJ <", value, "YJ");
            return (Criteria) this;
        }

        public Criteria andYJLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YJ <=", value, "YJ");
            return (Criteria) this;
        }

        public Criteria andYJIn(List<BigDecimal> values) {
            addCriterion("YJ in", values, "YJ");
            return (Criteria) this;
        }

        public Criteria andYJNotIn(List<BigDecimal> values) {
            addCriterion("YJ not in", values, "YJ");
            return (Criteria) this;
        }

        public Criteria andYJBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YJ between", value1, value2, "YJ");
            return (Criteria) this;
        }

        public Criteria andYJNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YJ not between", value1, value2, "YJ");
            return (Criteria) this;
        }

        public Criteria andYHZHIsNull() {
            addCriterion("YHZH is null");
            return (Criteria) this;
        }

        public Criteria andYHZHIsNotNull() {
            addCriterion("YHZH is not null");
            return (Criteria) this;
        }

        public Criteria andYHZHEqualTo(String value) {
            addCriterion("YHZH =", value, "YHZH");
            return (Criteria) this;
        }

        public Criteria andYHZHNotEqualTo(String value) {
            addCriterion("YHZH <>", value, "YHZH");
            return (Criteria) this;
        }

        public Criteria andYHZHGreaterThan(String value) {
            addCriterion("YHZH >", value, "YHZH");
            return (Criteria) this;
        }

        public Criteria andYHZHGreaterThanOrEqualTo(String value) {
            addCriterion("YHZH >=", value, "YHZH");
            return (Criteria) this;
        }

        public Criteria andYHZHLessThan(String value) {
            addCriterion("YHZH <", value, "YHZH");
            return (Criteria) this;
        }

        public Criteria andYHZHLessThanOrEqualTo(String value) {
            addCriterion("YHZH <=", value, "YHZH");
            return (Criteria) this;
        }

        public Criteria andYHZHLike(String value) {
            addCriterion("YHZH like", value, "YHZH");
            return (Criteria) this;
        }

        public Criteria andYHZHNotLike(String value) {
            addCriterion("YHZH not like", value, "YHZH");
            return (Criteria) this;
        }

        public Criteria andYHZHIn(List<String> values) {
            addCriterion("YHZH in", values, "YHZH");
            return (Criteria) this;
        }

        public Criteria andYHZHNotIn(List<String> values) {
            addCriterion("YHZH not in", values, "YHZH");
            return (Criteria) this;
        }

        public Criteria andYHZHBetween(String value1, String value2) {
            addCriterion("YHZH between", value1, value2, "YHZH");
            return (Criteria) this;
        }

        public Criteria andYHZHNotBetween(String value1, String value2) {
            addCriterion("YHZH not between", value1, value2, "YHZH");
            return (Criteria) this;
        }

        public Criteria andXMIsNull() {
            addCriterion("XM is null");
            return (Criteria) this;
        }

        public Criteria andXMIsNotNull() {
            addCriterion("XM is not null");
            return (Criteria) this;
        }

        public Criteria andXMEqualTo(String value) {
            addCriterion("XM =", value, "XM");
            return (Criteria) this;
        }

        public Criteria andXMNotEqualTo(String value) {
            addCriterion("XM <>", value, "XM");
            return (Criteria) this;
        }

        public Criteria andXMGreaterThan(String value) {
            addCriterion("XM >", value, "XM");
            return (Criteria) this;
        }

        public Criteria andXMGreaterThanOrEqualTo(String value) {
            addCriterion("XM >=", value, "XM");
            return (Criteria) this;
        }

        public Criteria andXMLessThan(String value) {
            addCriterion("XM <", value, "XM");
            return (Criteria) this;
        }

        public Criteria andXMLessThanOrEqualTo(String value) {
            addCriterion("XM <=", value, "XM");
            return (Criteria) this;
        }

        public Criteria andXMLike(String value) {
            addCriterion("XM like", value, "XM");
            return (Criteria) this;
        }

        public Criteria andXMNotLike(String value) {
            addCriterion("XM not like", value, "XM");
            return (Criteria) this;
        }

        public Criteria andXMIn(List<String> values) {
            addCriterion("XM in", values, "XM");
            return (Criteria) this;
        }

        public Criteria andXMNotIn(List<String> values) {
            addCriterion("XM not in", values, "XM");
            return (Criteria) this;
        }

        public Criteria andXMBetween(String value1, String value2) {
            addCriterion("XM between", value1, value2, "XM");
            return (Criteria) this;
        }

        public Criteria andXMNotBetween(String value1, String value2) {
            addCriterion("XM not between", value1, value2, "XM");
            return (Criteria) this;
        }

        public Criteria andSFZIsNull() {
            addCriterion("SFZ is null");
            return (Criteria) this;
        }

        public Criteria andSFZIsNotNull() {
            addCriterion("SFZ is not null");
            return (Criteria) this;
        }

        public Criteria andSFZEqualTo(String value) {
            addCriterion("SFZ =", value, "SFZ");
            return (Criteria) this;
        }

        public Criteria andSFZNotEqualTo(String value) {
            addCriterion("SFZ <>", value, "SFZ");
            return (Criteria) this;
        }

        public Criteria andSFZGreaterThan(String value) {
            addCriterion("SFZ >", value, "SFZ");
            return (Criteria) this;
        }

        public Criteria andSFZGreaterThanOrEqualTo(String value) {
            addCriterion("SFZ >=", value, "SFZ");
            return (Criteria) this;
        }

        public Criteria andSFZLessThan(String value) {
            addCriterion("SFZ <", value, "SFZ");
            return (Criteria) this;
        }

        public Criteria andSFZLessThanOrEqualTo(String value) {
            addCriterion("SFZ <=", value, "SFZ");
            return (Criteria) this;
        }

        public Criteria andSFZLike(String value) {
            addCriterion("SFZ like", value, "SFZ");
            return (Criteria) this;
        }

        public Criteria andSFZNotLike(String value) {
            addCriterion("SFZ not like", value, "SFZ");
            return (Criteria) this;
        }

        public Criteria andSFZIn(List<String> values) {
            addCriterion("SFZ in", values, "SFZ");
            return (Criteria) this;
        }

        public Criteria andSFZNotIn(List<String> values) {
            addCriterion("SFZ not in", values, "SFZ");
            return (Criteria) this;
        }

        public Criteria andSFZBetween(String value1, String value2) {
            addCriterion("SFZ between", value1, value2, "SFZ");
            return (Criteria) this;
        }

        public Criteria andSFZNotBetween(String value1, String value2) {
            addCriterion("SFZ not between", value1, value2, "SFZ");
            return (Criteria) this;
        }

        public Criteria andZJZHIsNull() {
            addCriterion("ZJZH is null");
            return (Criteria) this;
        }

        public Criteria andZJZHIsNotNull() {
            addCriterion("ZJZH is not null");
            return (Criteria) this;
        }

        public Criteria andZJZHEqualTo(String value) {
            addCriterion("ZJZH =", value, "ZJZH");
            return (Criteria) this;
        }

        public Criteria andZJZHNotEqualTo(String value) {
            addCriterion("ZJZH <>", value, "ZJZH");
            return (Criteria) this;
        }

        public Criteria andZJZHGreaterThan(String value) {
            addCriterion("ZJZH >", value, "ZJZH");
            return (Criteria) this;
        }

        public Criteria andZJZHGreaterThanOrEqualTo(String value) {
            addCriterion("ZJZH >=", value, "ZJZH");
            return (Criteria) this;
        }

        public Criteria andZJZHLessThan(String value) {
            addCriterion("ZJZH <", value, "ZJZH");
            return (Criteria) this;
        }

        public Criteria andZJZHLessThanOrEqualTo(String value) {
            addCriterion("ZJZH <=", value, "ZJZH");
            return (Criteria) this;
        }

        public Criteria andZJZHLike(String value) {
            addCriterion("ZJZH like", value, "ZJZH");
            return (Criteria) this;
        }

        public Criteria andZJZHNotLike(String value) {
            addCriterion("ZJZH not like", value, "ZJZH");
            return (Criteria) this;
        }

        public Criteria andZJZHIn(List<String> values) {
            addCriterion("ZJZH in", values, "ZJZH");
            return (Criteria) this;
        }

        public Criteria andZJZHNotIn(List<String> values) {
            addCriterion("ZJZH not in", values, "ZJZH");
            return (Criteria) this;
        }

        public Criteria andZJZHBetween(String value1, String value2) {
            addCriterion("ZJZH between", value1, value2, "ZJZH");
            return (Criteria) this;
        }

        public Criteria andZJZHNotBetween(String value1, String value2) {
            addCriterion("ZJZH not between", value1, value2, "ZJZH");
            return (Criteria) this;
        }

        public Criteria andQZJEIsNull() {
            addCriterion("QZJE is null");
            return (Criteria) this;
        }

        public Criteria andQZJEIsNotNull() {
            addCriterion("QZJE is not null");
            return (Criteria) this;
        }

        public Criteria andQZJEEqualTo(BigDecimal value) {
            addCriterion("QZJE =", value, "QZJE");
            return (Criteria) this;
        }

        public Criteria andQZJENotEqualTo(BigDecimal value) {
            addCriterion("QZJE <>", value, "QZJE");
            return (Criteria) this;
        }

        public Criteria andQZJEGreaterThan(BigDecimal value) {
            addCriterion("QZJE >", value, "QZJE");
            return (Criteria) this;
        }

        public Criteria andQZJEGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QZJE >=", value, "QZJE");
            return (Criteria) this;
        }

        public Criteria andQZJELessThan(BigDecimal value) {
            addCriterion("QZJE <", value, "QZJE");
            return (Criteria) this;
        }

        public Criteria andQZJELessThanOrEqualTo(BigDecimal value) {
            addCriterion("QZJE <=", value, "QZJE");
            return (Criteria) this;
        }

        public Criteria andQZJEIn(List<BigDecimal> values) {
            addCriterion("QZJE in", values, "QZJE");
            return (Criteria) this;
        }

        public Criteria andQZJENotIn(List<BigDecimal> values) {
            addCriterion("QZJE not in", values, "QZJE");
            return (Criteria) this;
        }

        public Criteria andQZJEBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QZJE between", value1, value2, "QZJE");
            return (Criteria) this;
        }

        public Criteria andQZJENotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QZJE not between", value1, value2, "QZJE");
            return (Criteria) this;
        }

        public Criteria andZLHXMIsNull() {
            addCriterion("ZLHXM is null");
            return (Criteria) this;
        }

        public Criteria andZLHXMIsNotNull() {
            addCriterion("ZLHXM is not null");
            return (Criteria) this;
        }

        public Criteria andZLHXMEqualTo(String value) {
            addCriterion("ZLHXM =", value, "ZLHXM");
            return (Criteria) this;
        }

        public Criteria andZLHXMNotEqualTo(String value) {
            addCriterion("ZLHXM <>", value, "ZLHXM");
            return (Criteria) this;
        }

        public Criteria andZLHXMGreaterThan(String value) {
            addCriterion("ZLHXM >", value, "ZLHXM");
            return (Criteria) this;
        }

        public Criteria andZLHXMGreaterThanOrEqualTo(String value) {
            addCriterion("ZLHXM >=", value, "ZLHXM");
            return (Criteria) this;
        }

        public Criteria andZLHXMLessThan(String value) {
            addCriterion("ZLHXM <", value, "ZLHXM");
            return (Criteria) this;
        }

        public Criteria andZLHXMLessThanOrEqualTo(String value) {
            addCriterion("ZLHXM <=", value, "ZLHXM");
            return (Criteria) this;
        }

        public Criteria andZLHXMLike(String value) {
            addCriterion("ZLHXM like", value, "ZLHXM");
            return (Criteria) this;
        }

        public Criteria andZLHXMNotLike(String value) {
            addCriterion("ZLHXM not like", value, "ZLHXM");
            return (Criteria) this;
        }

        public Criteria andZLHXMIn(List<String> values) {
            addCriterion("ZLHXM in", values, "ZLHXM");
            return (Criteria) this;
        }

        public Criteria andZLHXMNotIn(List<String> values) {
            addCriterion("ZLHXM not in", values, "ZLHXM");
            return (Criteria) this;
        }

        public Criteria andZLHXMBetween(String value1, String value2) {
            addCriterion("ZLHXM between", value1, value2, "ZLHXM");
            return (Criteria) this;
        }

        public Criteria andZLHXMNotBetween(String value1, String value2) {
            addCriterion("ZLHXM not between", value1, value2, "ZLHXM");
            return (Criteria) this;
        }

        public Criteria andZLHZJHIsNull() {
            addCriterion("ZLHZJH is null");
            return (Criteria) this;
        }

        public Criteria andZLHZJHIsNotNull() {
            addCriterion("ZLHZJH is not null");
            return (Criteria) this;
        }

        public Criteria andZLHZJHEqualTo(String value) {
            addCriterion("ZLHZJH =", value, "ZLHZJH");
            return (Criteria) this;
        }

        public Criteria andZLHZJHNotEqualTo(String value) {
            addCriterion("ZLHZJH <>", value, "ZLHZJH");
            return (Criteria) this;
        }

        public Criteria andZLHZJHGreaterThan(String value) {
            addCriterion("ZLHZJH >", value, "ZLHZJH");
            return (Criteria) this;
        }

        public Criteria andZLHZJHGreaterThanOrEqualTo(String value) {
            addCriterion("ZLHZJH >=", value, "ZLHZJH");
            return (Criteria) this;
        }

        public Criteria andZLHZJHLessThan(String value) {
            addCriterion("ZLHZJH <", value, "ZLHZJH");
            return (Criteria) this;
        }

        public Criteria andZLHZJHLessThanOrEqualTo(String value) {
            addCriterion("ZLHZJH <=", value, "ZLHZJH");
            return (Criteria) this;
        }

        public Criteria andZLHZJHLike(String value) {
            addCriterion("ZLHZJH like", value, "ZLHZJH");
            return (Criteria) this;
        }

        public Criteria andZLHZJHNotLike(String value) {
            addCriterion("ZLHZJH not like", value, "ZLHZJH");
            return (Criteria) this;
        }

        public Criteria andZLHZJHIn(List<String> values) {
            addCriterion("ZLHZJH in", values, "ZLHZJH");
            return (Criteria) this;
        }

        public Criteria andZLHZJHNotIn(List<String> values) {
            addCriterion("ZLHZJH not in", values, "ZLHZJH");
            return (Criteria) this;
        }

        public Criteria andZLHZJHBetween(String value1, String value2) {
            addCriterion("ZLHZJH between", value1, value2, "ZLHZJH");
            return (Criteria) this;
        }

        public Criteria andZLHZJHNotBetween(String value1, String value2) {
            addCriterion("ZLHZJH not between", value1, value2, "ZLHZJH");
            return (Criteria) this;
        }

        public Criteria andZJLBIsNull() {
            addCriterion("ZJLB is null");
            return (Criteria) this;
        }

        public Criteria andZJLBIsNotNull() {
            addCriterion("ZJLB is not null");
            return (Criteria) this;
        }

        public Criteria andZJLBEqualTo(String value) {
            addCriterion("ZJLB =", value, "ZJLB");
            return (Criteria) this;
        }

        public Criteria andZJLBNotEqualTo(String value) {
            addCriterion("ZJLB <>", value, "ZJLB");
            return (Criteria) this;
        }

        public Criteria andZJLBGreaterThan(String value) {
            addCriterion("ZJLB >", value, "ZJLB");
            return (Criteria) this;
        }

        public Criteria andZJLBGreaterThanOrEqualTo(String value) {
            addCriterion("ZJLB >=", value, "ZJLB");
            return (Criteria) this;
        }

        public Criteria andZJLBLessThan(String value) {
            addCriterion("ZJLB <", value, "ZJLB");
            return (Criteria) this;
        }

        public Criteria andZJLBLessThanOrEqualTo(String value) {
            addCriterion("ZJLB <=", value, "ZJLB");
            return (Criteria) this;
        }

        public Criteria andZJLBLike(String value) {
            addCriterion("ZJLB like", value, "ZJLB");
            return (Criteria) this;
        }

        public Criteria andZJLBNotLike(String value) {
            addCriterion("ZJLB not like", value, "ZJLB");
            return (Criteria) this;
        }

        public Criteria andZJLBIn(List<String> values) {
            addCriterion("ZJLB in", values, "ZJLB");
            return (Criteria) this;
        }

        public Criteria andZJLBNotIn(List<String> values) {
            addCriterion("ZJLB not in", values, "ZJLB");
            return (Criteria) this;
        }

        public Criteria andZJLBBetween(String value1, String value2) {
            addCriterion("ZJLB between", value1, value2, "ZJLB");
            return (Criteria) this;
        }

        public Criteria andZJLBNotBetween(String value1, String value2) {
            addCriterion("ZJLB not between", value1, value2, "ZJLB");
            return (Criteria) this;
        }

        public Criteria andZHZTIsNull() {
            addCriterion("ZHZT is null");
            return (Criteria) this;
        }

        public Criteria andZHZTIsNotNull() {
            addCriterion("ZHZT is not null");
            return (Criteria) this;
        }

        public Criteria andZHZTEqualTo(String value) {
            addCriterion("ZHZT =", value, "ZHZT");
            return (Criteria) this;
        }

        public Criteria andZHZTNotEqualTo(String value) {
            addCriterion("ZHZT <>", value, "ZHZT");
            return (Criteria) this;
        }

        public Criteria andZHZTGreaterThan(String value) {
            addCriterion("ZHZT >", value, "ZHZT");
            return (Criteria) this;
        }

        public Criteria andZHZTGreaterThanOrEqualTo(String value) {
            addCriterion("ZHZT >=", value, "ZHZT");
            return (Criteria) this;
        }

        public Criteria andZHZTLessThan(String value) {
            addCriterion("ZHZT <", value, "ZHZT");
            return (Criteria) this;
        }

        public Criteria andZHZTLessThanOrEqualTo(String value) {
            addCriterion("ZHZT <=", value, "ZHZT");
            return (Criteria) this;
        }

        public Criteria andZHZTLike(String value) {
            addCriterion("ZHZT like", value, "ZHZT");
            return (Criteria) this;
        }

        public Criteria andZHZTNotLike(String value) {
            addCriterion("ZHZT not like", value, "ZHZT");
            return (Criteria) this;
        }

        public Criteria andZHZTIn(List<String> values) {
            addCriterion("ZHZT in", values, "ZHZT");
            return (Criteria) this;
        }

        public Criteria andZHZTNotIn(List<String> values) {
            addCriterion("ZHZT not in", values, "ZHZT");
            return (Criteria) this;
        }

        public Criteria andZHZTBetween(String value1, String value2) {
            addCriterion("ZHZT between", value1, value2, "ZHZT");
            return (Criteria) this;
        }

        public Criteria andZHZTNotBetween(String value1, String value2) {
            addCriterion("ZHZT not between", value1, value2, "ZHZT");
            return (Criteria) this;
        }

        public Criteria andYHMCIsNull() {
            addCriterion("YHMC is null");
            return (Criteria) this;
        }

        public Criteria andYHMCIsNotNull() {
            addCriterion("YHMC is not null");
            return (Criteria) this;
        }

        public Criteria andYHMCEqualTo(String value) {
            addCriterion("YHMC =", value, "YHMC");
            return (Criteria) this;
        }

        public Criteria andYHMCNotEqualTo(String value) {
            addCriterion("YHMC <>", value, "YHMC");
            return (Criteria) this;
        }

        public Criteria andYHMCGreaterThan(String value) {
            addCriterion("YHMC >", value, "YHMC");
            return (Criteria) this;
        }

        public Criteria andYHMCGreaterThanOrEqualTo(String value) {
            addCriterion("YHMC >=", value, "YHMC");
            return (Criteria) this;
        }

        public Criteria andYHMCLessThan(String value) {
            addCriterion("YHMC <", value, "YHMC");
            return (Criteria) this;
        }

        public Criteria andYHMCLessThanOrEqualTo(String value) {
            addCriterion("YHMC <=", value, "YHMC");
            return (Criteria) this;
        }

        public Criteria andYHMCLike(String value) {
            addCriterion("YHMC like", value, "YHMC");
            return (Criteria) this;
        }

        public Criteria andYHMCNotLike(String value) {
            addCriterion("YHMC not like", value, "YHMC");
            return (Criteria) this;
        }

        public Criteria andYHMCIn(List<String> values) {
            addCriterion("YHMC in", values, "YHMC");
            return (Criteria) this;
        }

        public Criteria andYHMCNotIn(List<String> values) {
            addCriterion("YHMC not in", values, "YHMC");
            return (Criteria) this;
        }

        public Criteria andYHMCBetween(String value1, String value2) {
            addCriterion("YHMC between", value1, value2, "YHMC");
            return (Criteria) this;
        }

        public Criteria andYHMCNotBetween(String value1, String value2) {
            addCriterion("YHMC not between", value1, value2, "YHMC");
            return (Criteria) this;
        }

        public Criteria andYJYJIsNull() {
            addCriterion("YJYJ is null");
            return (Criteria) this;
        }

        public Criteria andYJYJIsNotNull() {
            addCriterion("YJYJ is not null");
            return (Criteria) this;
        }

        public Criteria andYJYJEqualTo(BigDecimal value) {
            addCriterion("YJYJ =", value, "YJYJ");
            return (Criteria) this;
        }

        public Criteria andYJYJNotEqualTo(BigDecimal value) {
            addCriterion("YJYJ <>", value, "YJYJ");
            return (Criteria) this;
        }

        public Criteria andYJYJGreaterThan(BigDecimal value) {
            addCriterion("YJYJ >", value, "YJYJ");
            return (Criteria) this;
        }

        public Criteria andYJYJGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YJYJ >=", value, "YJYJ");
            return (Criteria) this;
        }

        public Criteria andYJYJLessThan(BigDecimal value) {
            addCriterion("YJYJ <", value, "YJYJ");
            return (Criteria) this;
        }

        public Criteria andYJYJLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YJYJ <=", value, "YJYJ");
            return (Criteria) this;
        }

        public Criteria andYJYJIn(List<BigDecimal> values) {
            addCriterion("YJYJ in", values, "YJYJ");
            return (Criteria) this;
        }

        public Criteria andYJYJNotIn(List<BigDecimal> values) {
            addCriterion("YJYJ not in", values, "YJYJ");
            return (Criteria) this;
        }

        public Criteria andYJYJBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YJYJ between", value1, value2, "YJYJ");
            return (Criteria) this;
        }

        public Criteria andYJYJNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YJYJ not between", value1, value2, "YJYJ");
            return (Criteria) this;
        }

        public Criteria andWTHIsNull() {
            addCriterion("WTH is null");
            return (Criteria) this;
        }

        public Criteria andWTHIsNotNull() {
            addCriterion("WTH is not null");
            return (Criteria) this;
        }

        public Criteria andWTHEqualTo(String value) {
            addCriterion("WTH =", value, "WTH");
            return (Criteria) this;
        }

        public Criteria andWTHNotEqualTo(String value) {
            addCriterion("WTH <>", value, "WTH");
            return (Criteria) this;
        }

        public Criteria andWTHGreaterThan(String value) {
            addCriterion("WTH >", value, "WTH");
            return (Criteria) this;
        }

        public Criteria andWTHGreaterThanOrEqualTo(String value) {
            addCriterion("WTH >=", value, "WTH");
            return (Criteria) this;
        }

        public Criteria andWTHLessThan(String value) {
            addCriterion("WTH <", value, "WTH");
            return (Criteria) this;
        }

        public Criteria andWTHLessThanOrEqualTo(String value) {
            addCriterion("WTH <=", value, "WTH");
            return (Criteria) this;
        }

        public Criteria andWTHLike(String value) {
            addCriterion("WTH like", value, "WTH");
            return (Criteria) this;
        }

        public Criteria andWTHNotLike(String value) {
            addCriterion("WTH not like", value, "WTH");
            return (Criteria) this;
        }

        public Criteria andWTHIn(List<String> values) {
            addCriterion("WTH in", values, "WTH");
            return (Criteria) this;
        }

        public Criteria andWTHNotIn(List<String> values) {
            addCriterion("WTH not in", values, "WTH");
            return (Criteria) this;
        }

        public Criteria andWTHBetween(String value1, String value2) {
            addCriterion("WTH between", value1, value2, "WTH");
            return (Criteria) this;
        }

        public Criteria andWTHNotBetween(String value1, String value2) {
            addCriterion("WTH not between", value1, value2, "WTH");
            return (Criteria) this;
        }

        public Criteria andSFDKZJIsNull() {
            addCriterion("SFDKZJ is null");
            return (Criteria) this;
        }

        public Criteria andSFDKZJIsNotNull() {
            addCriterion("SFDKZJ is not null");
            return (Criteria) this;
        }

        public Criteria andSFDKZJEqualTo(Short value) {
            addCriterion("SFDKZJ =", value, "SFDKZJ");
            return (Criteria) this;
        }

        public Criteria andSFDKZJNotEqualTo(Short value) {
            addCriterion("SFDKZJ <>", value, "SFDKZJ");
            return (Criteria) this;
        }

        public Criteria andSFDKZJGreaterThan(Short value) {
            addCriterion("SFDKZJ >", value, "SFDKZJ");
            return (Criteria) this;
        }

        public Criteria andSFDKZJGreaterThanOrEqualTo(Short value) {
            addCriterion("SFDKZJ >=", value, "SFDKZJ");
            return (Criteria) this;
        }

        public Criteria andSFDKZJLessThan(Short value) {
            addCriterion("SFDKZJ <", value, "SFDKZJ");
            return (Criteria) this;
        }

        public Criteria andSFDKZJLessThanOrEqualTo(Short value) {
            addCriterion("SFDKZJ <=", value, "SFDKZJ");
            return (Criteria) this;
        }

        public Criteria andSFDKZJIn(List<Short> values) {
            addCriterion("SFDKZJ in", values, "SFDKZJ");
            return (Criteria) this;
        }

        public Criteria andSFDKZJNotIn(List<Short> values) {
            addCriterion("SFDKZJ not in", values, "SFDKZJ");
            return (Criteria) this;
        }

        public Criteria andSFDKZJBetween(Short value1, Short value2) {
            addCriterion("SFDKZJ between", value1, value2, "SFDKZJ");
            return (Criteria) this;
        }

        public Criteria andSFDKZJNotBetween(Short value1, Short value2) {
            addCriterion("SFDKZJ not between", value1, value2, "SFDKZJ");
            return (Criteria) this;
        }

        public Criteria andSORT_NUMIsNull() {
            addCriterion("SORT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSORT_NUMIsNotNull() {
            addCriterion("SORT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSORT_NUMEqualTo(Integer value) {
            addCriterion("SORT_NUM =", value, "SORT_NUM");
            return (Criteria) this;
        }

        public Criteria andSORT_NUMNotEqualTo(Integer value) {
            addCriterion("SORT_NUM <>", value, "SORT_NUM");
            return (Criteria) this;
        }

        public Criteria andSORT_NUMGreaterThan(Integer value) {
            addCriterion("SORT_NUM >", value, "SORT_NUM");
            return (Criteria) this;
        }

        public Criteria andSORT_NUMGreaterThanOrEqualTo(Integer value) {
            addCriterion("SORT_NUM >=", value, "SORT_NUM");
            return (Criteria) this;
        }

        public Criteria andSORT_NUMLessThan(Integer value) {
            addCriterion("SORT_NUM <", value, "SORT_NUM");
            return (Criteria) this;
        }

        public Criteria andSORT_NUMLessThanOrEqualTo(Integer value) {
            addCriterion("SORT_NUM <=", value, "SORT_NUM");
            return (Criteria) this;
        }

        public Criteria andSORT_NUMIn(List<Integer> values) {
            addCriterion("SORT_NUM in", values, "SORT_NUM");
            return (Criteria) this;
        }

        public Criteria andSORT_NUMNotIn(List<Integer> values) {
            addCriterion("SORT_NUM not in", values, "SORT_NUM");
            return (Criteria) this;
        }

        public Criteria andSORT_NUMBetween(Integer value1, Integer value2) {
            addCriterion("SORT_NUM between", value1, value2, "SORT_NUM");
            return (Criteria) this;
        }

        public Criteria andSORT_NUMNotBetween(Integer value1, Integer value2) {
            addCriterion("SORT_NUM not between", value1, value2, "SORT_NUM");
            return (Criteria) this;
        }

        public Criteria andDATA_VERSIONIsNull() {
            addCriterion("DATA_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andDATA_VERSIONIsNotNull() {
            addCriterion("DATA_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andDATA_VERSIONEqualTo(Integer value) {
            addCriterion("DATA_VERSION =", value, "DATA_VERSION");
            return (Criteria) this;
        }

        public Criteria andDATA_VERSIONNotEqualTo(Integer value) {
            addCriterion("DATA_VERSION <>", value, "DATA_VERSION");
            return (Criteria) this;
        }

        public Criteria andDATA_VERSIONGreaterThan(Integer value) {
            addCriterion("DATA_VERSION >", value, "DATA_VERSION");
            return (Criteria) this;
        }

        public Criteria andDATA_VERSIONGreaterThanOrEqualTo(Integer value) {
            addCriterion("DATA_VERSION >=", value, "DATA_VERSION");
            return (Criteria) this;
        }

        public Criteria andDATA_VERSIONLessThan(Integer value) {
            addCriterion("DATA_VERSION <", value, "DATA_VERSION");
            return (Criteria) this;
        }

        public Criteria andDATA_VERSIONLessThanOrEqualTo(Integer value) {
            addCriterion("DATA_VERSION <=", value, "DATA_VERSION");
            return (Criteria) this;
        }

        public Criteria andDATA_VERSIONIn(List<Integer> values) {
            addCriterion("DATA_VERSION in", values, "DATA_VERSION");
            return (Criteria) this;
        }

        public Criteria andDATA_VERSIONNotIn(List<Integer> values) {
            addCriterion("DATA_VERSION not in", values, "DATA_VERSION");
            return (Criteria) this;
        }

        public Criteria andDATA_VERSIONBetween(Integer value1, Integer value2) {
            addCriterion("DATA_VERSION between", value1, value2, "DATA_VERSION");
            return (Criteria) this;
        }

        public Criteria andDATA_VERSIONNotBetween(Integer value1, Integer value2) {
            addCriterion("DATA_VERSION not between", value1, value2, "DATA_VERSION");
            return (Criteria) this;
        }

        public Criteria andCREATORIsNull() {
            addCriterion("CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCREATORIsNotNull() {
            addCriterion("CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCREATOREqualTo(String value) {
            addCriterion("CREATOR =", value, "CREATOR");
            return (Criteria) this;
        }

        public Criteria andCREATORNotEqualTo(String value) {
            addCriterion("CREATOR <>", value, "CREATOR");
            return (Criteria) this;
        }

        public Criteria andCREATORGreaterThan(String value) {
            addCriterion("CREATOR >", value, "CREATOR");
            return (Criteria) this;
        }

        public Criteria andCREATORGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR >=", value, "CREATOR");
            return (Criteria) this;
        }

        public Criteria andCREATORLessThan(String value) {
            addCriterion("CREATOR <", value, "CREATOR");
            return (Criteria) this;
        }

        public Criteria andCREATORLessThanOrEqualTo(String value) {
            addCriterion("CREATOR <=", value, "CREATOR");
            return (Criteria) this;
        }

        public Criteria andCREATORLike(String value) {
            addCriterion("CREATOR like", value, "CREATOR");
            return (Criteria) this;
        }

        public Criteria andCREATORNotLike(String value) {
            addCriterion("CREATOR not like", value, "CREATOR");
            return (Criteria) this;
        }

        public Criteria andCREATORIn(List<String> values) {
            addCriterion("CREATOR in", values, "CREATOR");
            return (Criteria) this;
        }

        public Criteria andCREATORNotIn(List<String> values) {
            addCriterion("CREATOR not in", values, "CREATOR");
            return (Criteria) this;
        }

        public Criteria andCREATORBetween(String value1, String value2) {
            addCriterion("CREATOR between", value1, value2, "CREATOR");
            return (Criteria) this;
        }

        public Criteria andCREATORNotBetween(String value1, String value2) {
            addCriterion("CREATOR not between", value1, value2, "CREATOR");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMEIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMEIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMEEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMENotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMEGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMELessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMELessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMEIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMENotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMEBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMENotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andZXSJIsNull() {
            addCriterion("ZXSJ is null");
            return (Criteria) this;
        }

        public Criteria andZXSJIsNotNull() {
            addCriterion("ZXSJ is not null");
            return (Criteria) this;
        }

        public Criteria andZXSJEqualTo(Date value) {
            addCriterion("ZXSJ =", value, "ZXSJ");
            return (Criteria) this;
        }

        public Criteria andZXSJNotEqualTo(Date value) {
            addCriterion("ZXSJ <>", value, "ZXSJ");
            return (Criteria) this;
        }

        public Criteria andZXSJGreaterThan(Date value) {
            addCriterion("ZXSJ >", value, "ZXSJ");
            return (Criteria) this;
        }

        public Criteria andZXSJGreaterThanOrEqualTo(Date value) {
            addCriterion("ZXSJ >=", value, "ZXSJ");
            return (Criteria) this;
        }

        public Criteria andZXSJLessThan(Date value) {
            addCriterion("ZXSJ <", value, "ZXSJ");
            return (Criteria) this;
        }

        public Criteria andZXSJLessThanOrEqualTo(Date value) {
            addCriterion("ZXSJ <=", value, "ZXSJ");
            return (Criteria) this;
        }

        public Criteria andZXSJIn(List<Date> values) {
            addCriterion("ZXSJ in", values, "ZXSJ");
            return (Criteria) this;
        }

        public Criteria andZXSJNotIn(List<Date> values) {
            addCriterion("ZXSJ not in", values, "ZXSJ");
            return (Criteria) this;
        }

        public Criteria andZXSJBetween(Date value1, Date value2) {
            addCriterion("ZXSJ between", value1, value2, "ZXSJ");
            return (Criteria) this;
        }

        public Criteria andZXSJNotBetween(Date value1, Date value2) {
            addCriterion("ZXSJ not between", value1, value2, "ZXSJ");
            return (Criteria) this;
        }

        public Criteria andUPDATORIsNull() {
            addCriterion("UPDATOR is null");
            return (Criteria) this;
        }

        public Criteria andUPDATORIsNotNull() {
            addCriterion("UPDATOR is not null");
            return (Criteria) this;
        }

        public Criteria andUPDATOREqualTo(String value) {
            addCriterion("UPDATOR =", value, "UPDATOR");
            return (Criteria) this;
        }

        public Criteria andUPDATORNotEqualTo(String value) {
            addCriterion("UPDATOR <>", value, "UPDATOR");
            return (Criteria) this;
        }

        public Criteria andUPDATORGreaterThan(String value) {
            addCriterion("UPDATOR >", value, "UPDATOR");
            return (Criteria) this;
        }

        public Criteria andUPDATORGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATOR >=", value, "UPDATOR");
            return (Criteria) this;
        }

        public Criteria andUPDATORLessThan(String value) {
            addCriterion("UPDATOR <", value, "UPDATOR");
            return (Criteria) this;
        }

        public Criteria andUPDATORLessThanOrEqualTo(String value) {
            addCriterion("UPDATOR <=", value, "UPDATOR");
            return (Criteria) this;
        }

        public Criteria andUPDATORLike(String value) {
            addCriterion("UPDATOR like", value, "UPDATOR");
            return (Criteria) this;
        }

        public Criteria andUPDATORNotLike(String value) {
            addCriterion("UPDATOR not like", value, "UPDATOR");
            return (Criteria) this;
        }

        public Criteria andUPDATORIn(List<String> values) {
            addCriterion("UPDATOR in", values, "UPDATOR");
            return (Criteria) this;
        }

        public Criteria andUPDATORNotIn(List<String> values) {
            addCriterion("UPDATOR not in", values, "UPDATOR");
            return (Criteria) this;
        }

        public Criteria andUPDATORBetween(String value1, String value2) {
            addCriterion("UPDATOR between", value1, value2, "UPDATOR");
            return (Criteria) this;
        }

        public Criteria andUPDATORNotBetween(String value1, String value2) {
            addCriterion("UPDATOR not between", value1, value2, "UPDATOR");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMEIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMEIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMEEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMENotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMEGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMELessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMELessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMEIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMENotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMEBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMENotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andYXBZIsNull() {
            addCriterion("YXBZ is null");
            return (Criteria) this;
        }

        public Criteria andYXBZIsNotNull() {
            addCriterion("YXBZ is not null");
            return (Criteria) this;
        }

        public Criteria andYXBZEqualTo(Short value) {
            addCriterion("YXBZ =", value, "YXBZ");
            return (Criteria) this;
        }

        public Criteria andYXBZNotEqualTo(Short value) {
            addCriterion("YXBZ <>", value, "YXBZ");
            return (Criteria) this;
        }

        public Criteria andYXBZGreaterThan(Short value) {
            addCriterion("YXBZ >", value, "YXBZ");
            return (Criteria) this;
        }

        public Criteria andYXBZGreaterThanOrEqualTo(Short value) {
            addCriterion("YXBZ >=", value, "YXBZ");
            return (Criteria) this;
        }

        public Criteria andYXBZLessThan(Short value) {
            addCriterion("YXBZ <", value, "YXBZ");
            return (Criteria) this;
        }

        public Criteria andYXBZLessThanOrEqualTo(Short value) {
            addCriterion("YXBZ <=", value, "YXBZ");
            return (Criteria) this;
        }

        public Criteria andYXBZIn(List<Short> values) {
            addCriterion("YXBZ in", values, "YXBZ");
            return (Criteria) this;
        }

        public Criteria andYXBZNotIn(List<Short> values) {
            addCriterion("YXBZ not in", values, "YXBZ");
            return (Criteria) this;
        }

        public Criteria andYXBZBetween(Short value1, Short value2) {
            addCriterion("YXBZ between", value1, value2, "YXBZ");
            return (Criteria) this;
        }

        public Criteria andYXBZNotBetween(Short value1, Short value2) {
            addCriterion("YXBZ not between", value1, value2, "YXBZ");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSIsNull() {
            addCriterion("COMMENTS is null");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSIsNotNull() {
            addCriterion("COMMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSEqualTo(String value) {
            addCriterion("COMMENTS =", value, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSNotEqualTo(String value) {
            addCriterion("COMMENTS <>", value, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSGreaterThan(String value) {
            addCriterion("COMMENTS >", value, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTS >=", value, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSLessThan(String value) {
            addCriterion("COMMENTS <", value, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSLessThanOrEqualTo(String value) {
            addCriterion("COMMENTS <=", value, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSLike(String value) {
            addCriterion("COMMENTS like", value, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSNotLike(String value) {
            addCriterion("COMMENTS not like", value, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSIn(List<String> values) {
            addCriterion("COMMENTS in", values, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSNotIn(List<String> values) {
            addCriterion("COMMENTS not in", values, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSBetween(String value1, String value2) {
            addCriterion("COMMENTS between", value1, value2, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSNotBetween(String value1, String value2) {
            addCriterion("COMMENTS not between", value1, value2, "COMMENTS");
            return (Criteria) this;
        }
    }

    /**
     *
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
