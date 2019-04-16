package cn.zciel.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TpoFyztExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public TpoFyztExample() {
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

        public Criteria andPZZTIsNull() {
            addCriterion("PZZT is null");
            return (Criteria) this;
        }

        public Criteria andPZZTIsNotNull() {
            addCriterion("PZZT is not null");
            return (Criteria) this;
        }

        public Criteria andPZZTEqualTo(Short value) {
            addCriterion("PZZT =", value, "PZZT");
            return (Criteria) this;
        }

        public Criteria andPZZTNotEqualTo(Short value) {
            addCriterion("PZZT <>", value, "PZZT");
            return (Criteria) this;
        }

        public Criteria andPZZTGreaterThan(Short value) {
            addCriterion("PZZT >", value, "PZZT");
            return (Criteria) this;
        }

        public Criteria andPZZTGreaterThanOrEqualTo(Short value) {
            addCriterion("PZZT >=", value, "PZZT");
            return (Criteria) this;
        }

        public Criteria andPZZTLessThan(Short value) {
            addCriterion("PZZT <", value, "PZZT");
            return (Criteria) this;
        }

        public Criteria andPZZTLessThanOrEqualTo(Short value) {
            addCriterion("PZZT <=", value, "PZZT");
            return (Criteria) this;
        }

        public Criteria andPZZTIn(List<Short> values) {
            addCriterion("PZZT in", values, "PZZT");
            return (Criteria) this;
        }

        public Criteria andPZZTNotIn(List<Short> values) {
            addCriterion("PZZT not in", values, "PZZT");
            return (Criteria) this;
        }

        public Criteria andPZZTBetween(Short value1, Short value2) {
            addCriterion("PZZT between", value1, value2, "PZZT");
            return (Criteria) this;
        }

        public Criteria andPZZTNotBetween(Short value1, Short value2) {
            addCriterion("PZZT not between", value1, value2, "PZZT");
            return (Criteria) this;
        }

        public Criteria andZYZTIsNull() {
            addCriterion("ZYZT is null");
            return (Criteria) this;
        }

        public Criteria andZYZTIsNotNull() {
            addCriterion("ZYZT is not null");
            return (Criteria) this;
        }

        public Criteria andZYZTEqualTo(Short value) {
            addCriterion("ZYZT =", value, "ZYZT");
            return (Criteria) this;
        }

        public Criteria andZYZTNotEqualTo(Short value) {
            addCriterion("ZYZT <>", value, "ZYZT");
            return (Criteria) this;
        }

        public Criteria andZYZTGreaterThan(Short value) {
            addCriterion("ZYZT >", value, "ZYZT");
            return (Criteria) this;
        }

        public Criteria andZYZTGreaterThanOrEqualTo(Short value) {
            addCriterion("ZYZT >=", value, "ZYZT");
            return (Criteria) this;
        }

        public Criteria andZYZTLessThan(Short value) {
            addCriterion("ZYZT <", value, "ZYZT");
            return (Criteria) this;
        }

        public Criteria andZYZTLessThanOrEqualTo(Short value) {
            addCriterion("ZYZT <=", value, "ZYZT");
            return (Criteria) this;
        }

        public Criteria andZYZTIn(List<Short> values) {
            addCriterion("ZYZT in", values, "ZYZT");
            return (Criteria) this;
        }

        public Criteria andZYZTNotIn(List<Short> values) {
            addCriterion("ZYZT not in", values, "ZYZT");
            return (Criteria) this;
        }

        public Criteria andZYZTBetween(Short value1, Short value2) {
            addCriterion("ZYZT between", value1, value2, "ZYZT");
            return (Criteria) this;
        }

        public Criteria andZYZTNotBetween(Short value1, Short value2) {
            addCriterion("ZYZT not between", value1, value2, "ZYZT");
            return (Criteria) this;
        }

        public Criteria andDJZTIsNull() {
            addCriterion("DJZT is null");
            return (Criteria) this;
        }

        public Criteria andDJZTIsNotNull() {
            addCriterion("DJZT is not null");
            return (Criteria) this;
        }

        public Criteria andDJZTEqualTo(Short value) {
            addCriterion("DJZT =", value, "DJZT");
            return (Criteria) this;
        }

        public Criteria andDJZTNotEqualTo(Short value) {
            addCriterion("DJZT <>", value, "DJZT");
            return (Criteria) this;
        }

        public Criteria andDJZTGreaterThan(Short value) {
            addCriterion("DJZT >", value, "DJZT");
            return (Criteria) this;
        }

        public Criteria andDJZTGreaterThanOrEqualTo(Short value) {
            addCriterion("DJZT >=", value, "DJZT");
            return (Criteria) this;
        }

        public Criteria andDJZTLessThan(Short value) {
            addCriterion("DJZT <", value, "DJZT");
            return (Criteria) this;
        }

        public Criteria andDJZTLessThanOrEqualTo(Short value) {
            addCriterion("DJZT <=", value, "DJZT");
            return (Criteria) this;
        }

        public Criteria andDJZTIn(List<Short> values) {
            addCriterion("DJZT in", values, "DJZT");
            return (Criteria) this;
        }

        public Criteria andDJZTNotIn(List<Short> values) {
            addCriterion("DJZT not in", values, "DJZT");
            return (Criteria) this;
        }

        public Criteria andDJZTBetween(Short value1, Short value2) {
            addCriterion("DJZT between", value1, value2, "DJZT");
            return (Criteria) this;
        }

        public Criteria andDJZTNotBetween(Short value1, Short value2) {
            addCriterion("DJZT not between", value1, value2, "DJZT");
            return (Criteria) this;
        }

        public Criteria andFPZTIsNull() {
            addCriterion("FPZT is null");
            return (Criteria) this;
        }

        public Criteria andFPZTIsNotNull() {
            addCriterion("FPZT is not null");
            return (Criteria) this;
        }

        public Criteria andFPZTEqualTo(String value) {
            addCriterion("FPZT =", value, "FPZT");
            return (Criteria) this;
        }

        public Criteria andFPZTNotEqualTo(String value) {
            addCriterion("FPZT <>", value, "FPZT");
            return (Criteria) this;
        }

        public Criteria andFPZTGreaterThan(String value) {
            addCriterion("FPZT >", value, "FPZT");
            return (Criteria) this;
        }

        public Criteria andFPZTGreaterThanOrEqualTo(String value) {
            addCriterion("FPZT >=", value, "FPZT");
            return (Criteria) this;
        }

        public Criteria andFPZTLessThan(String value) {
            addCriterion("FPZT <", value, "FPZT");
            return (Criteria) this;
        }

        public Criteria andFPZTLessThanOrEqualTo(String value) {
            addCriterion("FPZT <=", value, "FPZT");
            return (Criteria) this;
        }

        public Criteria andFPZTLike(String value) {
            addCriterion("FPZT like", value, "FPZT");
            return (Criteria) this;
        }

        public Criteria andFPZTNotLike(String value) {
            addCriterion("FPZT not like", value, "FPZT");
            return (Criteria) this;
        }

        public Criteria andFPZTIn(List<String> values) {
            addCriterion("FPZT in", values, "FPZT");
            return (Criteria) this;
        }

        public Criteria andFPZTNotIn(List<String> values) {
            addCriterion("FPZT not in", values, "FPZT");
            return (Criteria) this;
        }

        public Criteria andFPZTBetween(String value1, String value2) {
            addCriterion("FPZT between", value1, value2, "FPZT");
            return (Criteria) this;
        }

        public Criteria andFPZTNotBetween(String value1, String value2) {
            addCriterion("FPZT not between", value1, value2, "FPZT");
            return (Criteria) this;
        }

        public Criteria andRKBZIsNull() {
            addCriterion("RKBZ is null");
            return (Criteria) this;
        }

        public Criteria andRKBZIsNotNull() {
            addCriterion("RKBZ is not null");
            return (Criteria) this;
        }

        public Criteria andRKBZEqualTo(Short value) {
            addCriterion("RKBZ =", value, "RKBZ");
            return (Criteria) this;
        }

        public Criteria andRKBZNotEqualTo(Short value) {
            addCriterion("RKBZ <>", value, "RKBZ");
            return (Criteria) this;
        }

        public Criteria andRKBZGreaterThan(Short value) {
            addCriterion("RKBZ >", value, "RKBZ");
            return (Criteria) this;
        }

        public Criteria andRKBZGreaterThanOrEqualTo(Short value) {
            addCriterion("RKBZ >=", value, "RKBZ");
            return (Criteria) this;
        }

        public Criteria andRKBZLessThan(Short value) {
            addCriterion("RKBZ <", value, "RKBZ");
            return (Criteria) this;
        }

        public Criteria andRKBZLessThanOrEqualTo(Short value) {
            addCriterion("RKBZ <=", value, "RKBZ");
            return (Criteria) this;
        }

        public Criteria andRKBZIn(List<Short> values) {
            addCriterion("RKBZ in", values, "RKBZ");
            return (Criteria) this;
        }

        public Criteria andRKBZNotIn(List<Short> values) {
            addCriterion("RKBZ not in", values, "RKBZ");
            return (Criteria) this;
        }

        public Criteria andRKBZBetween(Short value1, Short value2) {
            addCriterion("RKBZ between", value1, value2, "RKBZ");
            return (Criteria) this;
        }

        public Criteria andRKBZNotBetween(Short value1, Short value2) {
            addCriterion("RKBZ not between", value1, value2, "RKBZ");
            return (Criteria) this;
        }

        public Criteria andDJYYIsNull() {
            addCriterion("DJYY is null");
            return (Criteria) this;
        }

        public Criteria andDJYYIsNotNull() {
            addCriterion("DJYY is not null");
            return (Criteria) this;
        }

        public Criteria andDJYYEqualTo(String value) {
            addCriterion("DJYY =", value, "DJYY");
            return (Criteria) this;
        }

        public Criteria andDJYYNotEqualTo(String value) {
            addCriterion("DJYY <>", value, "DJYY");
            return (Criteria) this;
        }

        public Criteria andDJYYGreaterThan(String value) {
            addCriterion("DJYY >", value, "DJYY");
            return (Criteria) this;
        }

        public Criteria andDJYYGreaterThanOrEqualTo(String value) {
            addCriterion("DJYY >=", value, "DJYY");
            return (Criteria) this;
        }

        public Criteria andDJYYLessThan(String value) {
            addCriterion("DJYY <", value, "DJYY");
            return (Criteria) this;
        }

        public Criteria andDJYYLessThanOrEqualTo(String value) {
            addCriterion("DJYY <=", value, "DJYY");
            return (Criteria) this;
        }

        public Criteria andDJYYLike(String value) {
            addCriterion("DJYY like", value, "DJYY");
            return (Criteria) this;
        }

        public Criteria andDJYYNotLike(String value) {
            addCriterion("DJYY not like", value, "DJYY");
            return (Criteria) this;
        }

        public Criteria andDJYYIn(List<String> values) {
            addCriterion("DJYY in", values, "DJYY");
            return (Criteria) this;
        }

        public Criteria andDJYYNotIn(List<String> values) {
            addCriterion("DJYY not in", values, "DJYY");
            return (Criteria) this;
        }

        public Criteria andDJYYBetween(String value1, String value2) {
            addCriterion("DJYY between", value1, value2, "DJYY");
            return (Criteria) this;
        }

        public Criteria andDJYYNotBetween(String value1, String value2) {
            addCriterion("DJYY not between", value1, value2, "DJYY");
            return (Criteria) this;
        }

        public Criteria andSYZTIsNull() {
            addCriterion("SYZT is null");
            return (Criteria) this;
        }

        public Criteria andSYZTIsNotNull() {
            addCriterion("SYZT is not null");
            return (Criteria) this;
        }

        public Criteria andSYZTEqualTo(String value) {
            addCriterion("SYZT =", value, "SYZT");
            return (Criteria) this;
        }

        public Criteria andSYZTNotEqualTo(String value) {
            addCriterion("SYZT <>", value, "SYZT");
            return (Criteria) this;
        }

        public Criteria andSYZTGreaterThan(String value) {
            addCriterion("SYZT >", value, "SYZT");
            return (Criteria) this;
        }

        public Criteria andSYZTGreaterThanOrEqualTo(String value) {
            addCriterion("SYZT >=", value, "SYZT");
            return (Criteria) this;
        }

        public Criteria andSYZTLessThan(String value) {
            addCriterion("SYZT <", value, "SYZT");
            return (Criteria) this;
        }

        public Criteria andSYZTLessThanOrEqualTo(String value) {
            addCriterion("SYZT <=", value, "SYZT");
            return (Criteria) this;
        }

        public Criteria andSYZTLike(String value) {
            addCriterion("SYZT like", value, "SYZT");
            return (Criteria) this;
        }

        public Criteria andSYZTNotLike(String value) {
            addCriterion("SYZT not like", value, "SYZT");
            return (Criteria) this;
        }

        public Criteria andSYZTIn(List<String> values) {
            addCriterion("SYZT in", values, "SYZT");
            return (Criteria) this;
        }

        public Criteria andSYZTNotIn(List<String> values) {
            addCriterion("SYZT not in", values, "SYZT");
            return (Criteria) this;
        }

        public Criteria andSYZTBetween(String value1, String value2) {
            addCriterion("SYZT between", value1, value2, "SYZT");
            return (Criteria) this;
        }

        public Criteria andSYZTNotBetween(String value1, String value2) {
            addCriterion("SYZT not between", value1, value2, "SYZT");
            return (Criteria) this;
        }

        public Criteria andZJZTIsNull() {
            addCriterion("ZJZT is null");
            return (Criteria) this;
        }

        public Criteria andZJZTIsNotNull() {
            addCriterion("ZJZT is not null");
            return (Criteria) this;
        }

        public Criteria andZJZTEqualTo(String value) {
            addCriterion("ZJZT =", value, "ZJZT");
            return (Criteria) this;
        }

        public Criteria andZJZTNotEqualTo(String value) {
            addCriterion("ZJZT <>", value, "ZJZT");
            return (Criteria) this;
        }

        public Criteria andZJZTGreaterThan(String value) {
            addCriterion("ZJZT >", value, "ZJZT");
            return (Criteria) this;
        }

        public Criteria andZJZTGreaterThanOrEqualTo(String value) {
            addCriterion("ZJZT >=", value, "ZJZT");
            return (Criteria) this;
        }

        public Criteria andZJZTLessThan(String value) {
            addCriterion("ZJZT <", value, "ZJZT");
            return (Criteria) this;
        }

        public Criteria andZJZTLessThanOrEqualTo(String value) {
            addCriterion("ZJZT <=", value, "ZJZT");
            return (Criteria) this;
        }

        public Criteria andZJZTLike(String value) {
            addCriterion("ZJZT like", value, "ZJZT");
            return (Criteria) this;
        }

        public Criteria andZJZTNotLike(String value) {
            addCriterion("ZJZT not like", value, "ZJZT");
            return (Criteria) this;
        }

        public Criteria andZJZTIn(List<String> values) {
            addCriterion("ZJZT in", values, "ZJZT");
            return (Criteria) this;
        }

        public Criteria andZJZTNotIn(List<String> values) {
            addCriterion("ZJZT not in", values, "ZJZT");
            return (Criteria) this;
        }

        public Criteria andZJZTBetween(String value1, String value2) {
            addCriterion("ZJZT between", value1, value2, "ZJZT");
            return (Criteria) this;
        }

        public Criteria andZJZTNotBetween(String value1, String value2) {
            addCriterion("ZJZT not between", value1, value2, "ZJZT");
            return (Criteria) this;
        }

        public Criteria andSZCSIsNull() {
            addCriterion("SZCS is null");
            return (Criteria) this;
        }

        public Criteria andSZCSIsNotNull() {
            addCriterion("SZCS is not null");
            return (Criteria) this;
        }

        public Criteria andSZCSEqualTo(String value) {
            addCriterion("SZCS =", value, "SZCS");
            return (Criteria) this;
        }

        public Criteria andSZCSNotEqualTo(String value) {
            addCriterion("SZCS <>", value, "SZCS");
            return (Criteria) this;
        }

        public Criteria andSZCSGreaterThan(String value) {
            addCriterion("SZCS >", value, "SZCS");
            return (Criteria) this;
        }

        public Criteria andSZCSGreaterThanOrEqualTo(String value) {
            addCriterion("SZCS >=", value, "SZCS");
            return (Criteria) this;
        }

        public Criteria andSZCSLessThan(String value) {
            addCriterion("SZCS <", value, "SZCS");
            return (Criteria) this;
        }

        public Criteria andSZCSLessThanOrEqualTo(String value) {
            addCriterion("SZCS <=", value, "SZCS");
            return (Criteria) this;
        }

        public Criteria andSZCSLike(String value) {
            addCriterion("SZCS like", value, "SZCS");
            return (Criteria) this;
        }

        public Criteria andSZCSNotLike(String value) {
            addCriterion("SZCS not like", value, "SZCS");
            return (Criteria) this;
        }

        public Criteria andSZCSIn(List<String> values) {
            addCriterion("SZCS in", values, "SZCS");
            return (Criteria) this;
        }

        public Criteria andSZCSNotIn(List<String> values) {
            addCriterion("SZCS not in", values, "SZCS");
            return (Criteria) this;
        }

        public Criteria andSZCSBetween(String value1, String value2) {
            addCriterion("SZCS between", value1, value2, "SZCS");
            return (Criteria) this;
        }

        public Criteria andSZCSNotBetween(String value1, String value2) {
            addCriterion("SZCS not between", value1, value2, "SZCS");
            return (Criteria) this;
        }

        public Criteria andSZCQIsNull() {
            addCriterion("SZCQ is null");
            return (Criteria) this;
        }

        public Criteria andSZCQIsNotNull() {
            addCriterion("SZCQ is not null");
            return (Criteria) this;
        }

        public Criteria andSZCQEqualTo(String value) {
            addCriterion("SZCQ =", value, "SZCQ");
            return (Criteria) this;
        }

        public Criteria andSZCQNotEqualTo(String value) {
            addCriterion("SZCQ <>", value, "SZCQ");
            return (Criteria) this;
        }

        public Criteria andSZCQGreaterThan(String value) {
            addCriterion("SZCQ >", value, "SZCQ");
            return (Criteria) this;
        }

        public Criteria andSZCQGreaterThanOrEqualTo(String value) {
            addCriterion("SZCQ >=", value, "SZCQ");
            return (Criteria) this;
        }

        public Criteria andSZCQLessThan(String value) {
            addCriterion("SZCQ <", value, "SZCQ");
            return (Criteria) this;
        }

        public Criteria andSZCQLessThanOrEqualTo(String value) {
            addCriterion("SZCQ <=", value, "SZCQ");
            return (Criteria) this;
        }

        public Criteria andSZCQLike(String value) {
            addCriterion("SZCQ like", value, "SZCQ");
            return (Criteria) this;
        }

        public Criteria andSZCQNotLike(String value) {
            addCriterion("SZCQ not like", value, "SZCQ");
            return (Criteria) this;
        }

        public Criteria andSZCQIn(List<String> values) {
            addCriterion("SZCQ in", values, "SZCQ");
            return (Criteria) this;
        }

        public Criteria andSZCQNotIn(List<String> values) {
            addCriterion("SZCQ not in", values, "SZCQ");
            return (Criteria) this;
        }

        public Criteria andSZCQBetween(String value1, String value2) {
            addCriterion("SZCQ between", value1, value2, "SZCQ");
            return (Criteria) this;
        }

        public Criteria andSZCQNotBetween(String value1, String value2) {
            addCriterion("SZCQ not between", value1, value2, "SZCQ");
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
