package cn.zciel.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TpoZjmxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public TpoZjmxExample() {
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

        public Criteria andZJGZIDIsNull() {
            addCriterion("ZJGZID is null");
            return (Criteria) this;
        }

        public Criteria andZJGZIDIsNotNull() {
            addCriterion("ZJGZID is not null");
            return (Criteria) this;
        }

        public Criteria andZJGZIDEqualTo(String value) {
            addCriterion("ZJGZID =", value, "ZJGZID");
            return (Criteria) this;
        }

        public Criteria andZJGZIDNotEqualTo(String value) {
            addCriterion("ZJGZID <>", value, "ZJGZID");
            return (Criteria) this;
        }

        public Criteria andZJGZIDGreaterThan(String value) {
            addCriterion("ZJGZID >", value, "ZJGZID");
            return (Criteria) this;
        }

        public Criteria andZJGZIDGreaterThanOrEqualTo(String value) {
            addCriterion("ZJGZID >=", value, "ZJGZID");
            return (Criteria) this;
        }

        public Criteria andZJGZIDLessThan(String value) {
            addCriterion("ZJGZID <", value, "ZJGZID");
            return (Criteria) this;
        }

        public Criteria andZJGZIDLessThanOrEqualTo(String value) {
            addCriterion("ZJGZID <=", value, "ZJGZID");
            return (Criteria) this;
        }

        public Criteria andZJGZIDLike(String value) {
            addCriterion("ZJGZID like", value, "ZJGZID");
            return (Criteria) this;
        }

        public Criteria andZJGZIDNotLike(String value) {
            addCriterion("ZJGZID not like", value, "ZJGZID");
            return (Criteria) this;
        }

        public Criteria andZJGZIDIn(List<String> values) {
            addCriterion("ZJGZID in", values, "ZJGZID");
            return (Criteria) this;
        }

        public Criteria andZJGZIDNotIn(List<String> values) {
            addCriterion("ZJGZID not in", values, "ZJGZID");
            return (Criteria) this;
        }

        public Criteria andZJGZIDBetween(String value1, String value2) {
            addCriterion("ZJGZID between", value1, value2, "ZJGZID");
            return (Criteria) this;
        }

        public Criteria andZJGZIDNotBetween(String value1, String value2) {
            addCriterion("ZJGZID not between", value1, value2, "ZJGZID");
            return (Criteria) this;
        }

        public Criteria andZJGZCODEIsNull() {
            addCriterion("ZJGZCODE is null");
            return (Criteria) this;
        }

        public Criteria andZJGZCODEIsNotNull() {
            addCriterion("ZJGZCODE is not null");
            return (Criteria) this;
        }

        public Criteria andZJGZCODEEqualTo(String value) {
            addCriterion("ZJGZCODE =", value, "ZJGZCODE");
            return (Criteria) this;
        }

        public Criteria andZJGZCODENotEqualTo(String value) {
            addCriterion("ZJGZCODE <>", value, "ZJGZCODE");
            return (Criteria) this;
        }

        public Criteria andZJGZCODEGreaterThan(String value) {
            addCriterion("ZJGZCODE >", value, "ZJGZCODE");
            return (Criteria) this;
        }

        public Criteria andZJGZCODEGreaterThanOrEqualTo(String value) {
            addCriterion("ZJGZCODE >=", value, "ZJGZCODE");
            return (Criteria) this;
        }

        public Criteria andZJGZCODELessThan(String value) {
            addCriterion("ZJGZCODE <", value, "ZJGZCODE");
            return (Criteria) this;
        }

        public Criteria andZJGZCODELessThanOrEqualTo(String value) {
            addCriterion("ZJGZCODE <=", value, "ZJGZCODE");
            return (Criteria) this;
        }

        public Criteria andZJGZCODELike(String value) {
            addCriterion("ZJGZCODE like", value, "ZJGZCODE");
            return (Criteria) this;
        }

        public Criteria andZJGZCODENotLike(String value) {
            addCriterion("ZJGZCODE not like", value, "ZJGZCODE");
            return (Criteria) this;
        }

        public Criteria andZJGZCODEIn(List<String> values) {
            addCriterion("ZJGZCODE in", values, "ZJGZCODE");
            return (Criteria) this;
        }

        public Criteria andZJGZCODENotIn(List<String> values) {
            addCriterion("ZJGZCODE not in", values, "ZJGZCODE");
            return (Criteria) this;
        }

        public Criteria andZJGZCODEBetween(String value1, String value2) {
            addCriterion("ZJGZCODE between", value1, value2, "ZJGZCODE");
            return (Criteria) this;
        }

        public Criteria andZJGZCODENotBetween(String value1, String value2) {
            addCriterion("ZJGZCODE not between", value1, value2, "ZJGZCODE");
            return (Criteria) this;
        }

        public Criteria andCZRIsNull() {
            addCriterion("CZR is null");
            return (Criteria) this;
        }

        public Criteria andCZRIsNotNull() {
            addCriterion("CZR is not null");
            return (Criteria) this;
        }

        public Criteria andCZREqualTo(String value) {
            addCriterion("CZR =", value, "CZR");
            return (Criteria) this;
        }

        public Criteria andCZRNotEqualTo(String value) {
            addCriterion("CZR <>", value, "CZR");
            return (Criteria) this;
        }

        public Criteria andCZRGreaterThan(String value) {
            addCriterion("CZR >", value, "CZR");
            return (Criteria) this;
        }

        public Criteria andCZRGreaterThanOrEqualTo(String value) {
            addCriterion("CZR >=", value, "CZR");
            return (Criteria) this;
        }

        public Criteria andCZRLessThan(String value) {
            addCriterion("CZR <", value, "CZR");
            return (Criteria) this;
        }

        public Criteria andCZRLessThanOrEqualTo(String value) {
            addCriterion("CZR <=", value, "CZR");
            return (Criteria) this;
        }

        public Criteria andCZRLike(String value) {
            addCriterion("CZR like", value, "CZR");
            return (Criteria) this;
        }

        public Criteria andCZRNotLike(String value) {
            addCriterion("CZR not like", value, "CZR");
            return (Criteria) this;
        }

        public Criteria andCZRIn(List<String> values) {
            addCriterion("CZR in", values, "CZR");
            return (Criteria) this;
        }

        public Criteria andCZRNotIn(List<String> values) {
            addCriterion("CZR not in", values, "CZR");
            return (Criteria) this;
        }

        public Criteria andCZRBetween(String value1, String value2) {
            addCriterion("CZR between", value1, value2, "CZR");
            return (Criteria) this;
        }

        public Criteria andCZRNotBetween(String value1, String value2) {
            addCriterion("CZR not between", value1, value2, "CZR");
            return (Criteria) this;
        }

        public Criteria andYZJIsNull() {
            addCriterion("YZJ is null");
            return (Criteria) this;
        }

        public Criteria andYZJIsNotNull() {
            addCriterion("YZJ is not null");
            return (Criteria) this;
        }

        public Criteria andYZJEqualTo(BigDecimal value) {
            addCriterion("YZJ =", value, "YZJ");
            return (Criteria) this;
        }

        public Criteria andYZJNotEqualTo(BigDecimal value) {
            addCriterion("YZJ <>", value, "YZJ");
            return (Criteria) this;
        }

        public Criteria andYZJGreaterThan(BigDecimal value) {
            addCriterion("YZJ >", value, "YZJ");
            return (Criteria) this;
        }

        public Criteria andYZJGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YZJ >=", value, "YZJ");
            return (Criteria) this;
        }

        public Criteria andYZJLessThan(BigDecimal value) {
            addCriterion("YZJ <", value, "YZJ");
            return (Criteria) this;
        }

        public Criteria andYZJLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YZJ <=", value, "YZJ");
            return (Criteria) this;
        }

        public Criteria andYZJIn(List<BigDecimal> values) {
            addCriterion("YZJ in", values, "YZJ");
            return (Criteria) this;
        }

        public Criteria andYZJNotIn(List<BigDecimal> values) {
            addCriterion("YZJ not in", values, "YZJ");
            return (Criteria) this;
        }

        public Criteria andYZJBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YZJ between", value1, value2, "YZJ");
            return (Criteria) this;
        }

        public Criteria andYZJNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YZJ not between", value1, value2, "YZJ");
            return (Criteria) this;
        }

        public Criteria andFWZLIsNull() {
            addCriterion("FWZL is null");
            return (Criteria) this;
        }

        public Criteria andFWZLIsNotNull() {
            addCriterion("FWZL is not null");
            return (Criteria) this;
        }

        public Criteria andFWZLEqualTo(String value) {
            addCriterion("FWZL =", value, "FWZL");
            return (Criteria) this;
        }

        public Criteria andFWZLNotEqualTo(String value) {
            addCriterion("FWZL <>", value, "FWZL");
            return (Criteria) this;
        }

        public Criteria andFWZLGreaterThan(String value) {
            addCriterion("FWZL >", value, "FWZL");
            return (Criteria) this;
        }

        public Criteria andFWZLGreaterThanOrEqualTo(String value) {
            addCriterion("FWZL >=", value, "FWZL");
            return (Criteria) this;
        }

        public Criteria andFWZLLessThan(String value) {
            addCriterion("FWZL <", value, "FWZL");
            return (Criteria) this;
        }

        public Criteria andFWZLLessThanOrEqualTo(String value) {
            addCriterion("FWZL <=", value, "FWZL");
            return (Criteria) this;
        }

        public Criteria andFWZLLike(String value) {
            addCriterion("FWZL like", value, "FWZL");
            return (Criteria) this;
        }

        public Criteria andFWZLNotLike(String value) {
            addCriterion("FWZL not like", value, "FWZL");
            return (Criteria) this;
        }

        public Criteria andFWZLIn(List<String> values) {
            addCriterion("FWZL in", values, "FWZL");
            return (Criteria) this;
        }

        public Criteria andFWZLNotIn(List<String> values) {
            addCriterion("FWZL not in", values, "FWZL");
            return (Criteria) this;
        }

        public Criteria andFWZLBetween(String value1, String value2) {
            addCriterion("FWZL between", value1, value2, "FWZL");
            return (Criteria) this;
        }

        public Criteria andFWZLNotBetween(String value1, String value2) {
            addCriterion("FWZL not between", value1, value2, "FWZL");
            return (Criteria) this;
        }

        public Criteria andSXSJIsNull() {
            addCriterion("SXSJ is null");
            return (Criteria) this;
        }

        public Criteria andSXSJIsNotNull() {
            addCriterion("SXSJ is not null");
            return (Criteria) this;
        }

        public Criteria andSXSJEqualTo(Date value) {
            addCriterion("SXSJ =", value, "SXSJ");
            return (Criteria) this;
        }

        public Criteria andSXSJNotEqualTo(Date value) {
            addCriterion("SXSJ <>", value, "SXSJ");
            return (Criteria) this;
        }

        public Criteria andSXSJGreaterThan(Date value) {
            addCriterion("SXSJ >", value, "SXSJ");
            return (Criteria) this;
        }

        public Criteria andSXSJGreaterThanOrEqualTo(Date value) {
            addCriterion("SXSJ >=", value, "SXSJ");
            return (Criteria) this;
        }

        public Criteria andSXSJLessThan(Date value) {
            addCriterion("SXSJ <", value, "SXSJ");
            return (Criteria) this;
        }

        public Criteria andSXSJLessThanOrEqualTo(Date value) {
            addCriterion("SXSJ <=", value, "SXSJ");
            return (Criteria) this;
        }

        public Criteria andSXSJIn(List<Date> values) {
            addCriterion("SXSJ in", values, "SXSJ");
            return (Criteria) this;
        }

        public Criteria andSXSJNotIn(List<Date> values) {
            addCriterion("SXSJ not in", values, "SXSJ");
            return (Criteria) this;
        }

        public Criteria andSXSJBetween(Date value1, Date value2) {
            addCriterion("SXSJ between", value1, value2, "SXSJ");
            return (Criteria) this;
        }

        public Criteria andSXSJNotBetween(Date value1, Date value2) {
            addCriterion("SXSJ not between", value1, value2, "SXSJ");
            return (Criteria) this;
        }

        public Criteria andJSSJIsNull() {
            addCriterion("JSSJ is null");
            return (Criteria) this;
        }

        public Criteria andJSSJIsNotNull() {
            addCriterion("JSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andJSSJEqualTo(Date value) {
            addCriterion("JSSJ =", value, "JSSJ");
            return (Criteria) this;
        }

        public Criteria andJSSJNotEqualTo(Date value) {
            addCriterion("JSSJ <>", value, "JSSJ");
            return (Criteria) this;
        }

        public Criteria andJSSJGreaterThan(Date value) {
            addCriterion("JSSJ >", value, "JSSJ");
            return (Criteria) this;
        }

        public Criteria andJSSJGreaterThanOrEqualTo(Date value) {
            addCriterion("JSSJ >=", value, "JSSJ");
            return (Criteria) this;
        }

        public Criteria andJSSJLessThan(Date value) {
            addCriterion("JSSJ <", value, "JSSJ");
            return (Criteria) this;
        }

        public Criteria andJSSJLessThanOrEqualTo(Date value) {
            addCriterion("JSSJ <=", value, "JSSJ");
            return (Criteria) this;
        }

        public Criteria andJSSJIn(List<Date> values) {
            addCriterion("JSSJ in", values, "JSSJ");
            return (Criteria) this;
        }

        public Criteria andJSSJNotIn(List<Date> values) {
            addCriterion("JSSJ not in", values, "JSSJ");
            return (Criteria) this;
        }

        public Criteria andJSSJBetween(Date value1, Date value2) {
            addCriterion("JSSJ between", value1, value2, "JSSJ");
            return (Criteria) this;
        }

        public Criteria andJSSJNotBetween(Date value1, Date value2) {
            addCriterion("JSSJ not between", value1, value2, "JSSJ");
            return (Criteria) this;
        }

        public Criteria andJZMJIsNull() {
            addCriterion("JZMJ is null");
            return (Criteria) this;
        }

        public Criteria andJZMJIsNotNull() {
            addCriterion("JZMJ is not null");
            return (Criteria) this;
        }

        public Criteria andJZMJEqualTo(BigDecimal value) {
            addCriterion("JZMJ =", value, "JZMJ");
            return (Criteria) this;
        }

        public Criteria andJZMJNotEqualTo(BigDecimal value) {
            addCriterion("JZMJ <>", value, "JZMJ");
            return (Criteria) this;
        }

        public Criteria andJZMJGreaterThan(BigDecimal value) {
            addCriterion("JZMJ >", value, "JZMJ");
            return (Criteria) this;
        }

        public Criteria andJZMJGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JZMJ >=", value, "JZMJ");
            return (Criteria) this;
        }

        public Criteria andJZMJLessThan(BigDecimal value) {
            addCriterion("JZMJ <", value, "JZMJ");
            return (Criteria) this;
        }

        public Criteria andJZMJLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JZMJ <=", value, "JZMJ");
            return (Criteria) this;
        }

        public Criteria andJZMJIn(List<BigDecimal> values) {
            addCriterion("JZMJ in", values, "JZMJ");
            return (Criteria) this;
        }

        public Criteria andJZMJNotIn(List<BigDecimal> values) {
            addCriterion("JZMJ not in", values, "JZMJ");
            return (Criteria) this;
        }

        public Criteria andJZMJBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JZMJ between", value1, value2, "JZMJ");
            return (Criteria) this;
        }

        public Criteria andJZMJNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JZMJ not between", value1, value2, "JZMJ");
            return (Criteria) this;
        }

        public Criteria andJMYZJIsNull() {
            addCriterion("JMYZJ is null");
            return (Criteria) this;
        }

        public Criteria andJMYZJIsNotNull() {
            addCriterion("JMYZJ is not null");
            return (Criteria) this;
        }

        public Criteria andJMYZJEqualTo(BigDecimal value) {
            addCriterion("JMYZJ =", value, "JMYZJ");
            return (Criteria) this;
        }

        public Criteria andJMYZJNotEqualTo(BigDecimal value) {
            addCriterion("JMYZJ <>", value, "JMYZJ");
            return (Criteria) this;
        }

        public Criteria andJMYZJGreaterThan(BigDecimal value) {
            addCriterion("JMYZJ >", value, "JMYZJ");
            return (Criteria) this;
        }

        public Criteria andJMYZJGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JMYZJ >=", value, "JMYZJ");
            return (Criteria) this;
        }

        public Criteria andJMYZJLessThan(BigDecimal value) {
            addCriterion("JMYZJ <", value, "JMYZJ");
            return (Criteria) this;
        }

        public Criteria andJMYZJLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JMYZJ <=", value, "JMYZJ");
            return (Criteria) this;
        }

        public Criteria andJMYZJIn(List<BigDecimal> values) {
            addCriterion("JMYZJ in", values, "JMYZJ");
            return (Criteria) this;
        }

        public Criteria andJMYZJNotIn(List<BigDecimal> values) {
            addCriterion("JMYZJ not in", values, "JMYZJ");
            return (Criteria) this;
        }

        public Criteria andJMYZJBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JMYZJ between", value1, value2, "JMYZJ");
            return (Criteria) this;
        }

        public Criteria andJMYZJNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JMYZJ not between", value1, value2, "JMYZJ");
            return (Criteria) this;
        }

        public Criteria andJMKSRQIsNull() {
            addCriterion("JMKSRQ is null");
            return (Criteria) this;
        }

        public Criteria andJMKSRQIsNotNull() {
            addCriterion("JMKSRQ is not null");
            return (Criteria) this;
        }

        public Criteria andJMKSRQEqualTo(Date value) {
            addCriterion("JMKSRQ =", value, "JMKSRQ");
            return (Criteria) this;
        }

        public Criteria andJMKSRQNotEqualTo(Date value) {
            addCriterion("JMKSRQ <>", value, "JMKSRQ");
            return (Criteria) this;
        }

        public Criteria andJMKSRQGreaterThan(Date value) {
            addCriterion("JMKSRQ >", value, "JMKSRQ");
            return (Criteria) this;
        }

        public Criteria andJMKSRQGreaterThanOrEqualTo(Date value) {
            addCriterion("JMKSRQ >=", value, "JMKSRQ");
            return (Criteria) this;
        }

        public Criteria andJMKSRQLessThan(Date value) {
            addCriterion("JMKSRQ <", value, "JMKSRQ");
            return (Criteria) this;
        }

        public Criteria andJMKSRQLessThanOrEqualTo(Date value) {
            addCriterion("JMKSRQ <=", value, "JMKSRQ");
            return (Criteria) this;
        }

        public Criteria andJMKSRQIn(List<Date> values) {
            addCriterion("JMKSRQ in", values, "JMKSRQ");
            return (Criteria) this;
        }

        public Criteria andJMKSRQNotIn(List<Date> values) {
            addCriterion("JMKSRQ not in", values, "JMKSRQ");
            return (Criteria) this;
        }

        public Criteria andJMKSRQBetween(Date value1, Date value2) {
            addCriterion("JMKSRQ between", value1, value2, "JMKSRQ");
            return (Criteria) this;
        }

        public Criteria andJMKSRQNotBetween(Date value1, Date value2) {
            addCriterion("JMKSRQ not between", value1, value2, "JMKSRQ");
            return (Criteria) this;
        }

        public Criteria andJMJSRQIsNull() {
            addCriterion("JMJSRQ is null");
            return (Criteria) this;
        }

        public Criteria andJMJSRQIsNotNull() {
            addCriterion("JMJSRQ is not null");
            return (Criteria) this;
        }

        public Criteria andJMJSRQEqualTo(Date value) {
            addCriterion("JMJSRQ =", value, "JMJSRQ");
            return (Criteria) this;
        }

        public Criteria andJMJSRQNotEqualTo(Date value) {
            addCriterion("JMJSRQ <>", value, "JMJSRQ");
            return (Criteria) this;
        }

        public Criteria andJMJSRQGreaterThan(Date value) {
            addCriterion("JMJSRQ >", value, "JMJSRQ");
            return (Criteria) this;
        }

        public Criteria andJMJSRQGreaterThanOrEqualTo(Date value) {
            addCriterion("JMJSRQ >=", value, "JMJSRQ");
            return (Criteria) this;
        }

        public Criteria andJMJSRQLessThan(Date value) {
            addCriterion("JMJSRQ <", value, "JMJSRQ");
            return (Criteria) this;
        }

        public Criteria andJMJSRQLessThanOrEqualTo(Date value) {
            addCriterion("JMJSRQ <=", value, "JMJSRQ");
            return (Criteria) this;
        }

        public Criteria andJMJSRQIn(List<Date> values) {
            addCriterion("JMJSRQ in", values, "JMJSRQ");
            return (Criteria) this;
        }

        public Criteria andJMJSRQNotIn(List<Date> values) {
            addCriterion("JMJSRQ not in", values, "JMJSRQ");
            return (Criteria) this;
        }

        public Criteria andJMJSRQBetween(Date value1, Date value2) {
            addCriterion("JMJSRQ between", value1, value2, "JMJSRQ");
            return (Criteria) this;
        }

        public Criteria andJMJSRQNotBetween(Date value1, Date value2) {
            addCriterion("JMJSRQ not between", value1, value2, "JMJSRQ");
            return (Criteria) this;
        }

        public Criteria andKNZHIsNull() {
            addCriterion("KNZH is null");
            return (Criteria) this;
        }

        public Criteria andKNZHIsNotNull() {
            addCriterion("KNZH is not null");
            return (Criteria) this;
        }

        public Criteria andKNZHEqualTo(String value) {
            addCriterion("KNZH =", value, "KNZH");
            return (Criteria) this;
        }

        public Criteria andKNZHNotEqualTo(String value) {
            addCriterion("KNZH <>", value, "KNZH");
            return (Criteria) this;
        }

        public Criteria andKNZHGreaterThan(String value) {
            addCriterion("KNZH >", value, "KNZH");
            return (Criteria) this;
        }

        public Criteria andKNZHGreaterThanOrEqualTo(String value) {
            addCriterion("KNZH >=", value, "KNZH");
            return (Criteria) this;
        }

        public Criteria andKNZHLessThan(String value) {
            addCriterion("KNZH <", value, "KNZH");
            return (Criteria) this;
        }

        public Criteria andKNZHLessThanOrEqualTo(String value) {
            addCriterion("KNZH <=", value, "KNZH");
            return (Criteria) this;
        }

        public Criteria andKNZHLike(String value) {
            addCriterion("KNZH like", value, "KNZH");
            return (Criteria) this;
        }

        public Criteria andKNZHNotLike(String value) {
            addCriterion("KNZH not like", value, "KNZH");
            return (Criteria) this;
        }

        public Criteria andKNZHIn(List<String> values) {
            addCriterion("KNZH in", values, "KNZH");
            return (Criteria) this;
        }

        public Criteria andKNZHNotIn(List<String> values) {
            addCriterion("KNZH not in", values, "KNZH");
            return (Criteria) this;
        }

        public Criteria andKNZHBetween(String value1, String value2) {
            addCriterion("KNZH between", value1, value2, "KNZH");
            return (Criteria) this;
        }

        public Criteria andKNZHNotBetween(String value1, String value2) {
            addCriterion("KNZH not between", value1, value2, "KNZH");
            return (Criteria) this;
        }

        public Criteria andBZLXIsNull() {
            addCriterion("BZLX is null");
            return (Criteria) this;
        }

        public Criteria andBZLXIsNotNull() {
            addCriterion("BZLX is not null");
            return (Criteria) this;
        }

        public Criteria andBZLXEqualTo(String value) {
            addCriterion("BZLX =", value, "BZLX");
            return (Criteria) this;
        }

        public Criteria andBZLXNotEqualTo(String value) {
            addCriterion("BZLX <>", value, "BZLX");
            return (Criteria) this;
        }

        public Criteria andBZLXGreaterThan(String value) {
            addCriterion("BZLX >", value, "BZLX");
            return (Criteria) this;
        }

        public Criteria andBZLXGreaterThanOrEqualTo(String value) {
            addCriterion("BZLX >=", value, "BZLX");
            return (Criteria) this;
        }

        public Criteria andBZLXLessThan(String value) {
            addCriterion("BZLX <", value, "BZLX");
            return (Criteria) this;
        }

        public Criteria andBZLXLessThanOrEqualTo(String value) {
            addCriterion("BZLX <=", value, "BZLX");
            return (Criteria) this;
        }

        public Criteria andBZLXLike(String value) {
            addCriterion("BZLX like", value, "BZLX");
            return (Criteria) this;
        }

        public Criteria andBZLXNotLike(String value) {
            addCriterion("BZLX not like", value, "BZLX");
            return (Criteria) this;
        }

        public Criteria andBZLXIn(List<String> values) {
            addCriterion("BZLX in", values, "BZLX");
            return (Criteria) this;
        }

        public Criteria andBZLXNotIn(List<String> values) {
            addCriterion("BZLX not in", values, "BZLX");
            return (Criteria) this;
        }

        public Criteria andBZLXBetween(String value1, String value2) {
            addCriterion("BZLX between", value1, value2, "BZLX");
            return (Criteria) this;
        }

        public Criteria andBZLXNotBetween(String value1, String value2) {
            addCriterion("BZLX not between", value1, value2, "BZLX");
            return (Criteria) this;
        }

        public Criteria andKNZLXIsNull() {
            addCriterion("KNZLX is null");
            return (Criteria) this;
        }

        public Criteria andKNZLXIsNotNull() {
            addCriterion("KNZLX is not null");
            return (Criteria) this;
        }

        public Criteria andKNZLXEqualTo(String value) {
            addCriterion("KNZLX =", value, "KNZLX");
            return (Criteria) this;
        }

        public Criteria andKNZLXNotEqualTo(String value) {
            addCriterion("KNZLX <>", value, "KNZLX");
            return (Criteria) this;
        }

        public Criteria andKNZLXGreaterThan(String value) {
            addCriterion("KNZLX >", value, "KNZLX");
            return (Criteria) this;
        }

        public Criteria andKNZLXGreaterThanOrEqualTo(String value) {
            addCriterion("KNZLX >=", value, "KNZLX");
            return (Criteria) this;
        }

        public Criteria andKNZLXLessThan(String value) {
            addCriterion("KNZLX <", value, "KNZLX");
            return (Criteria) this;
        }

        public Criteria andKNZLXLessThanOrEqualTo(String value) {
            addCriterion("KNZLX <=", value, "KNZLX");
            return (Criteria) this;
        }

        public Criteria andKNZLXLike(String value) {
            addCriterion("KNZLX like", value, "KNZLX");
            return (Criteria) this;
        }

        public Criteria andKNZLXNotLike(String value) {
            addCriterion("KNZLX not like", value, "KNZLX");
            return (Criteria) this;
        }

        public Criteria andKNZLXIn(List<String> values) {
            addCriterion("KNZLX in", values, "KNZLX");
            return (Criteria) this;
        }

        public Criteria andKNZLXNotIn(List<String> values) {
            addCriterion("KNZLX not in", values, "KNZLX");
            return (Criteria) this;
        }

        public Criteria andKNZLXBetween(String value1, String value2) {
            addCriterion("KNZLX between", value1, value2, "KNZLX");
            return (Criteria) this;
        }

        public Criteria andKNZLXNotBetween(String value1, String value2) {
            addCriterion("KNZLX not between", value1, value2, "KNZLX");
            return (Criteria) this;
        }

        public Criteria andGDQBZYZJIsNull() {
            addCriterion("GDQBZYZJ is null");
            return (Criteria) this;
        }

        public Criteria andGDQBZYZJIsNotNull() {
            addCriterion("GDQBZYZJ is not null");
            return (Criteria) this;
        }

        public Criteria andGDQBZYZJEqualTo(BigDecimal value) {
            addCriterion("GDQBZYZJ =", value, "GDQBZYZJ");
            return (Criteria) this;
        }

        public Criteria andGDQBZYZJNotEqualTo(BigDecimal value) {
            addCriterion("GDQBZYZJ <>", value, "GDQBZYZJ");
            return (Criteria) this;
        }

        public Criteria andGDQBZYZJGreaterThan(BigDecimal value) {
            addCriterion("GDQBZYZJ >", value, "GDQBZYZJ");
            return (Criteria) this;
        }

        public Criteria andGDQBZYZJGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GDQBZYZJ >=", value, "GDQBZYZJ");
            return (Criteria) this;
        }

        public Criteria andGDQBZYZJLessThan(BigDecimal value) {
            addCriterion("GDQBZYZJ <", value, "GDQBZYZJ");
            return (Criteria) this;
        }

        public Criteria andGDQBZYZJLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GDQBZYZJ <=", value, "GDQBZYZJ");
            return (Criteria) this;
        }

        public Criteria andGDQBZYZJIn(List<BigDecimal> values) {
            addCriterion("GDQBZYZJ in", values, "GDQBZYZJ");
            return (Criteria) this;
        }

        public Criteria andGDQBZYZJNotIn(List<BigDecimal> values) {
            addCriterion("GDQBZYZJ not in", values, "GDQBZYZJ");
            return (Criteria) this;
        }

        public Criteria andGDQBZYZJBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GDQBZYZJ between", value1, value2, "GDQBZYZJ");
            return (Criteria) this;
        }

        public Criteria andGDQBZYZJNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GDQBZYZJ not between", value1, value2, "GDQBZYZJ");
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
