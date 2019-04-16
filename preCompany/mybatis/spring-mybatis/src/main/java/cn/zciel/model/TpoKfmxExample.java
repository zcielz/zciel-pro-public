package cn.zciel.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TpoKfmxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public TpoKfmxExample() {
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

        public Criteria andPZCODEIsNull() {
            addCriterion("PZCODE is null");
            return (Criteria) this;
        }

        public Criteria andPZCODEIsNotNull() {
            addCriterion("PZCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPZCODEEqualTo(String value) {
            addCriterion("PZCODE =", value, "PZCODE");
            return (Criteria) this;
        }

        public Criteria andPZCODENotEqualTo(String value) {
            addCriterion("PZCODE <>", value, "PZCODE");
            return (Criteria) this;
        }

        public Criteria andPZCODEGreaterThan(String value) {
            addCriterion("PZCODE >", value, "PZCODE");
            return (Criteria) this;
        }

        public Criteria andPZCODEGreaterThanOrEqualTo(String value) {
            addCriterion("PZCODE >=", value, "PZCODE");
            return (Criteria) this;
        }

        public Criteria andPZCODELessThan(String value) {
            addCriterion("PZCODE <", value, "PZCODE");
            return (Criteria) this;
        }

        public Criteria andPZCODELessThanOrEqualTo(String value) {
            addCriterion("PZCODE <=", value, "PZCODE");
            return (Criteria) this;
        }

        public Criteria andPZCODELike(String value) {
            addCriterion("PZCODE like", value, "PZCODE");
            return (Criteria) this;
        }

        public Criteria andPZCODENotLike(String value) {
            addCriterion("PZCODE not like", value, "PZCODE");
            return (Criteria) this;
        }

        public Criteria andPZCODEIn(List<String> values) {
            addCriterion("PZCODE in", values, "PZCODE");
            return (Criteria) this;
        }

        public Criteria andPZCODENotIn(List<String> values) {
            addCriterion("PZCODE not in", values, "PZCODE");
            return (Criteria) this;
        }

        public Criteria andPZCODEBetween(String value1, String value2) {
            addCriterion("PZCODE between", value1, value2, "PZCODE");
            return (Criteria) this;
        }

        public Criteria andPZCODENotBetween(String value1, String value2) {
            addCriterion("PZCODE not between", value1, value2, "PZCODE");
            return (Criteria) this;
        }

        public Criteria andZHIDIsNull() {
            addCriterion("ZHID is null");
            return (Criteria) this;
        }

        public Criteria andZHIDIsNotNull() {
            addCriterion("ZHID is not null");
            return (Criteria) this;
        }

        public Criteria andZHIDEqualTo(String value) {
            addCriterion("ZHID =", value, "ZHID");
            return (Criteria) this;
        }

        public Criteria andZHIDNotEqualTo(String value) {
            addCriterion("ZHID <>", value, "ZHID");
            return (Criteria) this;
        }

        public Criteria andZHIDGreaterThan(String value) {
            addCriterion("ZHID >", value, "ZHID");
            return (Criteria) this;
        }

        public Criteria andZHIDGreaterThanOrEqualTo(String value) {
            addCriterion("ZHID >=", value, "ZHID");
            return (Criteria) this;
        }

        public Criteria andZHIDLessThan(String value) {
            addCriterion("ZHID <", value, "ZHID");
            return (Criteria) this;
        }

        public Criteria andZHIDLessThanOrEqualTo(String value) {
            addCriterion("ZHID <=", value, "ZHID");
            return (Criteria) this;
        }

        public Criteria andZHIDLike(String value) {
            addCriterion("ZHID like", value, "ZHID");
            return (Criteria) this;
        }

        public Criteria andZHIDNotLike(String value) {
            addCriterion("ZHID not like", value, "ZHID");
            return (Criteria) this;
        }

        public Criteria andZHIDIn(List<String> values) {
            addCriterion("ZHID in", values, "ZHID");
            return (Criteria) this;
        }

        public Criteria andZHIDNotIn(List<String> values) {
            addCriterion("ZHID not in", values, "ZHID");
            return (Criteria) this;
        }

        public Criteria andZHIDBetween(String value1, String value2) {
            addCriterion("ZHID between", value1, value2, "ZHID");
            return (Criteria) this;
        }

        public Criteria andZHIDNotBetween(String value1, String value2) {
            addCriterion("ZHID not between", value1, value2, "ZHID");
            return (Criteria) this;
        }

        public Criteria andZHCODEIsNull() {
            addCriterion("ZHCODE is null");
            return (Criteria) this;
        }

        public Criteria andZHCODEIsNotNull() {
            addCriterion("ZHCODE is not null");
            return (Criteria) this;
        }

        public Criteria andZHCODEEqualTo(String value) {
            addCriterion("ZHCODE =", value, "ZHCODE");
            return (Criteria) this;
        }

        public Criteria andZHCODENotEqualTo(String value) {
            addCriterion("ZHCODE <>", value, "ZHCODE");
            return (Criteria) this;
        }

        public Criteria andZHCODEGreaterThan(String value) {
            addCriterion("ZHCODE >", value, "ZHCODE");
            return (Criteria) this;
        }

        public Criteria andZHCODEGreaterThanOrEqualTo(String value) {
            addCriterion("ZHCODE >=", value, "ZHCODE");
            return (Criteria) this;
        }

        public Criteria andZHCODELessThan(String value) {
            addCriterion("ZHCODE <", value, "ZHCODE");
            return (Criteria) this;
        }

        public Criteria andZHCODELessThanOrEqualTo(String value) {
            addCriterion("ZHCODE <=", value, "ZHCODE");
            return (Criteria) this;
        }

        public Criteria andZHCODELike(String value) {
            addCriterion("ZHCODE like", value, "ZHCODE");
            return (Criteria) this;
        }

        public Criteria andZHCODENotLike(String value) {
            addCriterion("ZHCODE not like", value, "ZHCODE");
            return (Criteria) this;
        }

        public Criteria andZHCODEIn(List<String> values) {
            addCriterion("ZHCODE in", values, "ZHCODE");
            return (Criteria) this;
        }

        public Criteria andZHCODENotIn(List<String> values) {
            addCriterion("ZHCODE not in", values, "ZHCODE");
            return (Criteria) this;
        }

        public Criteria andZHCODEBetween(String value1, String value2) {
            addCriterion("ZHCODE between", value1, value2, "ZHCODE");
            return (Criteria) this;
        }

        public Criteria andZHCODENotBetween(String value1, String value2) {
            addCriterion("ZHCODE not between", value1, value2, "ZHCODE");
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

        public Criteria andNFIsNull() {
            addCriterion("NF is null");
            return (Criteria) this;
        }

        public Criteria andNFIsNotNull() {
            addCriterion("NF is not null");
            return (Criteria) this;
        }

        public Criteria andNFEqualTo(Integer value) {
            addCriterion("NF =", value, "NF");
            return (Criteria) this;
        }

        public Criteria andNFNotEqualTo(Integer value) {
            addCriterion("NF <>", value, "NF");
            return (Criteria) this;
        }

        public Criteria andNFGreaterThan(Integer value) {
            addCriterion("NF >", value, "NF");
            return (Criteria) this;
        }

        public Criteria andNFGreaterThanOrEqualTo(Integer value) {
            addCriterion("NF >=", value, "NF");
            return (Criteria) this;
        }

        public Criteria andNFLessThan(Integer value) {
            addCriterion("NF <", value, "NF");
            return (Criteria) this;
        }

        public Criteria andNFLessThanOrEqualTo(Integer value) {
            addCriterion("NF <=", value, "NF");
            return (Criteria) this;
        }

        public Criteria andNFIn(List<Integer> values) {
            addCriterion("NF in", values, "NF");
            return (Criteria) this;
        }

        public Criteria andNFNotIn(List<Integer> values) {
            addCriterion("NF not in", values, "NF");
            return (Criteria) this;
        }

        public Criteria andNFBetween(Integer value1, Integer value2) {
            addCriterion("NF between", value1, value2, "NF");
            return (Criteria) this;
        }

        public Criteria andNFNotBetween(Integer value1, Integer value2) {
            addCriterion("NF not between", value1, value2, "NF");
            return (Criteria) this;
        }

        public Criteria andYFIsNull() {
            addCriterion("YF is null");
            return (Criteria) this;
        }

        public Criteria andYFIsNotNull() {
            addCriterion("YF is not null");
            return (Criteria) this;
        }

        public Criteria andYFEqualTo(Integer value) {
            addCriterion("YF =", value, "YF");
            return (Criteria) this;
        }

        public Criteria andYFNotEqualTo(Integer value) {
            addCriterion("YF <>", value, "YF");
            return (Criteria) this;
        }

        public Criteria andYFGreaterThan(Integer value) {
            addCriterion("YF >", value, "YF");
            return (Criteria) this;
        }

        public Criteria andYFGreaterThanOrEqualTo(Integer value) {
            addCriterion("YF >=", value, "YF");
            return (Criteria) this;
        }

        public Criteria andYFLessThan(Integer value) {
            addCriterion("YF <", value, "YF");
            return (Criteria) this;
        }

        public Criteria andYFLessThanOrEqualTo(Integer value) {
            addCriterion("YF <=", value, "YF");
            return (Criteria) this;
        }

        public Criteria andYFIn(List<Integer> values) {
            addCriterion("YF in", values, "YF");
            return (Criteria) this;
        }

        public Criteria andYFNotIn(List<Integer> values) {
            addCriterion("YF not in", values, "YF");
            return (Criteria) this;
        }

        public Criteria andYFBetween(Integer value1, Integer value2) {
            addCriterion("YF between", value1, value2, "YF");
            return (Criteria) this;
        }

        public Criteria andYFNotBetween(Integer value1, Integer value2) {
            addCriterion("YF not between", value1, value2, "YF");
            return (Criteria) this;
        }

        public Criteria andYGZJIsNull() {
            addCriterion("YGZJ is null");
            return (Criteria) this;
        }

        public Criteria andYGZJIsNotNull() {
            addCriterion("YGZJ is not null");
            return (Criteria) this;
        }

        public Criteria andYGZJEqualTo(BigDecimal value) {
            addCriterion("YGZJ =", value, "YGZJ");
            return (Criteria) this;
        }

        public Criteria andYGZJNotEqualTo(BigDecimal value) {
            addCriterion("YGZJ <>", value, "YGZJ");
            return (Criteria) this;
        }

        public Criteria andYGZJGreaterThan(BigDecimal value) {
            addCriterion("YGZJ >", value, "YGZJ");
            return (Criteria) this;
        }

        public Criteria andYGZJGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YGZJ >=", value, "YGZJ");
            return (Criteria) this;
        }

        public Criteria andYGZJLessThan(BigDecimal value) {
            addCriterion("YGZJ <", value, "YGZJ");
            return (Criteria) this;
        }

        public Criteria andYGZJLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YGZJ <=", value, "YGZJ");
            return (Criteria) this;
        }

        public Criteria andYGZJIn(List<BigDecimal> values) {
            addCriterion("YGZJ in", values, "YGZJ");
            return (Criteria) this;
        }

        public Criteria andYGZJNotIn(List<BigDecimal> values) {
            addCriterion("YGZJ not in", values, "YGZJ");
            return (Criteria) this;
        }

        public Criteria andYGZJBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YGZJ between", value1, value2, "YGZJ");
            return (Criteria) this;
        }

        public Criteria andYGZJNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YGZJ not between", value1, value2, "YGZJ");
            return (Criteria) this;
        }

        public Criteria andSGZJIsNull() {
            addCriterion("SGZJ is null");
            return (Criteria) this;
        }

        public Criteria andSGZJIsNotNull() {
            addCriterion("SGZJ is not null");
            return (Criteria) this;
        }

        public Criteria andSGZJEqualTo(BigDecimal value) {
            addCriterion("SGZJ =", value, "SGZJ");
            return (Criteria) this;
        }

        public Criteria andSGZJNotEqualTo(BigDecimal value) {
            addCriterion("SGZJ <>", value, "SGZJ");
            return (Criteria) this;
        }

        public Criteria andSGZJGreaterThan(BigDecimal value) {
            addCriterion("SGZJ >", value, "SGZJ");
            return (Criteria) this;
        }

        public Criteria andSGZJGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SGZJ >=", value, "SGZJ");
            return (Criteria) this;
        }

        public Criteria andSGZJLessThan(BigDecimal value) {
            addCriterion("SGZJ <", value, "SGZJ");
            return (Criteria) this;
        }

        public Criteria andSGZJLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SGZJ <=", value, "SGZJ");
            return (Criteria) this;
        }

        public Criteria andSGZJIn(List<BigDecimal> values) {
            addCriterion("SGZJ in", values, "SGZJ");
            return (Criteria) this;
        }

        public Criteria andSGZJNotIn(List<BigDecimal> values) {
            addCriterion("SGZJ not in", values, "SGZJ");
            return (Criteria) this;
        }

        public Criteria andSGZJBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SGZJ between", value1, value2, "SGZJ");
            return (Criteria) this;
        }

        public Criteria andSGZJNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SGZJ not between", value1, value2, "SGZJ");
            return (Criteria) this;
        }

        public Criteria andKFZTIsNull() {
            addCriterion("KFZT is null");
            return (Criteria) this;
        }

        public Criteria andKFZTIsNotNull() {
            addCriterion("KFZT is not null");
            return (Criteria) this;
        }

        public Criteria andKFZTEqualTo(Short value) {
            addCriterion("KFZT =", value, "KFZT");
            return (Criteria) this;
        }

        public Criteria andKFZTNotEqualTo(Short value) {
            addCriterion("KFZT <>", value, "KFZT");
            return (Criteria) this;
        }

        public Criteria andKFZTGreaterThan(Short value) {
            addCriterion("KFZT >", value, "KFZT");
            return (Criteria) this;
        }

        public Criteria andKFZTGreaterThanOrEqualTo(Short value) {
            addCriterion("KFZT >=", value, "KFZT");
            return (Criteria) this;
        }

        public Criteria andKFZTLessThan(Short value) {
            addCriterion("KFZT <", value, "KFZT");
            return (Criteria) this;
        }

        public Criteria andKFZTLessThanOrEqualTo(Short value) {
            addCriterion("KFZT <=", value, "KFZT");
            return (Criteria) this;
        }

        public Criteria andKFZTIn(List<Short> values) {
            addCriterion("KFZT in", values, "KFZT");
            return (Criteria) this;
        }

        public Criteria andKFZTNotIn(List<Short> values) {
            addCriterion("KFZT not in", values, "KFZT");
            return (Criteria) this;
        }

        public Criteria andKFZTBetween(Short value1, Short value2) {
            addCriterion("KFZT between", value1, value2, "KFZT");
            return (Criteria) this;
        }

        public Criteria andKFZTNotBetween(Short value1, Short value2) {
            addCriterion("KFZT not between", value1, value2, "KFZT");
            return (Criteria) this;
        }

        public Criteria andKFSJIsNull() {
            addCriterion("KFSJ is null");
            return (Criteria) this;
        }

        public Criteria andKFSJIsNotNull() {
            addCriterion("KFSJ is not null");
            return (Criteria) this;
        }

        public Criteria andKFSJEqualTo(Date value) {
            addCriterion("KFSJ =", value, "KFSJ");
            return (Criteria) this;
        }

        public Criteria andKFSJNotEqualTo(Date value) {
            addCriterion("KFSJ <>", value, "KFSJ");
            return (Criteria) this;
        }

        public Criteria andKFSJGreaterThan(Date value) {
            addCriterion("KFSJ >", value, "KFSJ");
            return (Criteria) this;
        }

        public Criteria andKFSJGreaterThanOrEqualTo(Date value) {
            addCriterion("KFSJ >=", value, "KFSJ");
            return (Criteria) this;
        }

        public Criteria andKFSJLessThan(Date value) {
            addCriterion("KFSJ <", value, "KFSJ");
            return (Criteria) this;
        }

        public Criteria andKFSJLessThanOrEqualTo(Date value) {
            addCriterion("KFSJ <=", value, "KFSJ");
            return (Criteria) this;
        }

        public Criteria andKFSJIn(List<Date> values) {
            addCriterion("KFSJ in", values, "KFSJ");
            return (Criteria) this;
        }

        public Criteria andKFSJNotIn(List<Date> values) {
            addCriterion("KFSJ not in", values, "KFSJ");
            return (Criteria) this;
        }

        public Criteria andKFSJBetween(Date value1, Date value2) {
            addCriterion("KFSJ between", value1, value2, "KFSJ");
            return (Criteria) this;
        }

        public Criteria andKFSJNotBetween(Date value1, Date value2) {
            addCriterion("KFSJ not between", value1, value2, "KFSJ");
            return (Criteria) this;
        }

        public Criteria andZJMXIDIsNull() {
            addCriterion("ZJMXID is null");
            return (Criteria) this;
        }

        public Criteria andZJMXIDIsNotNull() {
            addCriterion("ZJMXID is not null");
            return (Criteria) this;
        }

        public Criteria andZJMXIDEqualTo(String value) {
            addCriterion("ZJMXID =", value, "ZJMXID");
            return (Criteria) this;
        }

        public Criteria andZJMXIDNotEqualTo(String value) {
            addCriterion("ZJMXID <>", value, "ZJMXID");
            return (Criteria) this;
        }

        public Criteria andZJMXIDGreaterThan(String value) {
            addCriterion("ZJMXID >", value, "ZJMXID");
            return (Criteria) this;
        }

        public Criteria andZJMXIDGreaterThanOrEqualTo(String value) {
            addCriterion("ZJMXID >=", value, "ZJMXID");
            return (Criteria) this;
        }

        public Criteria andZJMXIDLessThan(String value) {
            addCriterion("ZJMXID <", value, "ZJMXID");
            return (Criteria) this;
        }

        public Criteria andZJMXIDLessThanOrEqualTo(String value) {
            addCriterion("ZJMXID <=", value, "ZJMXID");
            return (Criteria) this;
        }

        public Criteria andZJMXIDLike(String value) {
            addCriterion("ZJMXID like", value, "ZJMXID");
            return (Criteria) this;
        }

        public Criteria andZJMXIDNotLike(String value) {
            addCriterion("ZJMXID not like", value, "ZJMXID");
            return (Criteria) this;
        }

        public Criteria andZJMXIDIn(List<String> values) {
            addCriterion("ZJMXID in", values, "ZJMXID");
            return (Criteria) this;
        }

        public Criteria andZJMXIDNotIn(List<String> values) {
            addCriterion("ZJMXID not in", values, "ZJMXID");
            return (Criteria) this;
        }

        public Criteria andZJMXIDBetween(String value1, String value2) {
            addCriterion("ZJMXID between", value1, value2, "ZJMXID");
            return (Criteria) this;
        }

        public Criteria andZJMXIDNotBetween(String value1, String value2) {
            addCriterion("ZJMXID not between", value1, value2, "ZJMXID");
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
