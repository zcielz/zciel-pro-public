package cn.zciel.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TpoJtfmxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public TpoJtfmxExample() {
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

        public Criteria andSQRZHIsNull() {
            addCriterion("SQRZH is null");
            return (Criteria) this;
        }

        public Criteria andSQRZHIsNotNull() {
            addCriterion("SQRZH is not null");
            return (Criteria) this;
        }

        public Criteria andSQRZHEqualTo(String value) {
            addCriterion("SQRZH =", value, "SQRZH");
            return (Criteria) this;
        }

        public Criteria andSQRZHNotEqualTo(String value) {
            addCriterion("SQRZH <>", value, "SQRZH");
            return (Criteria) this;
        }

        public Criteria andSQRZHGreaterThan(String value) {
            addCriterion("SQRZH >", value, "SQRZH");
            return (Criteria) this;
        }

        public Criteria andSQRZHGreaterThanOrEqualTo(String value) {
            addCriterion("SQRZH >=", value, "SQRZH");
            return (Criteria) this;
        }

        public Criteria andSQRZHLessThan(String value) {
            addCriterion("SQRZH <", value, "SQRZH");
            return (Criteria) this;
        }

        public Criteria andSQRZHLessThanOrEqualTo(String value) {
            addCriterion("SQRZH <=", value, "SQRZH");
            return (Criteria) this;
        }

        public Criteria andSQRZHLike(String value) {
            addCriterion("SQRZH like", value, "SQRZH");
            return (Criteria) this;
        }

        public Criteria andSQRZHNotLike(String value) {
            addCriterion("SQRZH not like", value, "SQRZH");
            return (Criteria) this;
        }

        public Criteria andSQRZHIn(List<String> values) {
            addCriterion("SQRZH in", values, "SQRZH");
            return (Criteria) this;
        }

        public Criteria andSQRZHNotIn(List<String> values) {
            addCriterion("SQRZH not in", values, "SQRZH");
            return (Criteria) this;
        }

        public Criteria andSQRZHBetween(String value1, String value2) {
            addCriterion("SQRZH between", value1, value2, "SQRZH");
            return (Criteria) this;
        }

        public Criteria andSQRZHNotBetween(String value1, String value2) {
            addCriterion("SQRZH not between", value1, value2, "SQRZH");
            return (Criteria) this;
        }

        public Criteria andJTJEIsNull() {
            addCriterion("JTJE is null");
            return (Criteria) this;
        }

        public Criteria andJTJEIsNotNull() {
            addCriterion("JTJE is not null");
            return (Criteria) this;
        }

        public Criteria andJTJEEqualTo(BigDecimal value) {
            addCriterion("JTJE =", value, "JTJE");
            return (Criteria) this;
        }

        public Criteria andJTJENotEqualTo(BigDecimal value) {
            addCriterion("JTJE <>", value, "JTJE");
            return (Criteria) this;
        }

        public Criteria andJTJEGreaterThan(BigDecimal value) {
            addCriterion("JTJE >", value, "JTJE");
            return (Criteria) this;
        }

        public Criteria andJTJEGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JTJE >=", value, "JTJE");
            return (Criteria) this;
        }

        public Criteria andJTJELessThan(BigDecimal value) {
            addCriterion("JTJE <", value, "JTJE");
            return (Criteria) this;
        }

        public Criteria andJTJELessThanOrEqualTo(BigDecimal value) {
            addCriterion("JTJE <=", value, "JTJE");
            return (Criteria) this;
        }

        public Criteria andJTJEIn(List<BigDecimal> values) {
            addCriterion("JTJE in", values, "JTJE");
            return (Criteria) this;
        }

        public Criteria andJTJENotIn(List<BigDecimal> values) {
            addCriterion("JTJE not in", values, "JTJE");
            return (Criteria) this;
        }

        public Criteria andJTJEBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JTJE between", value1, value2, "JTJE");
            return (Criteria) this;
        }

        public Criteria andJTJENotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JTJE not between", value1, value2, "JTJE");
            return (Criteria) this;
        }

        public Criteria andFPHIsNull() {
            addCriterion("FPH is null");
            return (Criteria) this;
        }

        public Criteria andFPHIsNotNull() {
            addCriterion("FPH is not null");
            return (Criteria) this;
        }

        public Criteria andFPHEqualTo(String value) {
            addCriterion("FPH =", value, "FPH");
            return (Criteria) this;
        }

        public Criteria andFPHNotEqualTo(String value) {
            addCriterion("FPH <>", value, "FPH");
            return (Criteria) this;
        }

        public Criteria andFPHGreaterThan(String value) {
            addCriterion("FPH >", value, "FPH");
            return (Criteria) this;
        }

        public Criteria andFPHGreaterThanOrEqualTo(String value) {
            addCriterion("FPH >=", value, "FPH");
            return (Criteria) this;
        }

        public Criteria andFPHLessThan(String value) {
            addCriterion("FPH <", value, "FPH");
            return (Criteria) this;
        }

        public Criteria andFPHLessThanOrEqualTo(String value) {
            addCriterion("FPH <=", value, "FPH");
            return (Criteria) this;
        }

        public Criteria andFPHLike(String value) {
            addCriterion("FPH like", value, "FPH");
            return (Criteria) this;
        }

        public Criteria andFPHNotLike(String value) {
            addCriterion("FPH not like", value, "FPH");
            return (Criteria) this;
        }

        public Criteria andFPHIn(List<String> values) {
            addCriterion("FPH in", values, "FPH");
            return (Criteria) this;
        }

        public Criteria andFPHNotIn(List<String> values) {
            addCriterion("FPH not in", values, "FPH");
            return (Criteria) this;
        }

        public Criteria andFPHBetween(String value1, String value2) {
            addCriterion("FPH between", value1, value2, "FPH");
            return (Criteria) this;
        }

        public Criteria andFPHNotBetween(String value1, String value2) {
            addCriterion("FPH not between", value1, value2, "FPH");
            return (Criteria) this;
        }

        public Criteria andJFLXIsNull() {
            addCriterion("JFLX is null");
            return (Criteria) this;
        }

        public Criteria andJFLXIsNotNull() {
            addCriterion("JFLX is not null");
            return (Criteria) this;
        }

        public Criteria andJFLXEqualTo(String value) {
            addCriterion("JFLX =", value, "JFLX");
            return (Criteria) this;
        }

        public Criteria andJFLXNotEqualTo(String value) {
            addCriterion("JFLX <>", value, "JFLX");
            return (Criteria) this;
        }

        public Criteria andJFLXGreaterThan(String value) {
            addCriterion("JFLX >", value, "JFLX");
            return (Criteria) this;
        }

        public Criteria andJFLXGreaterThanOrEqualTo(String value) {
            addCriterion("JFLX >=", value, "JFLX");
            return (Criteria) this;
        }

        public Criteria andJFLXLessThan(String value) {
            addCriterion("JFLX <", value, "JFLX");
            return (Criteria) this;
        }

        public Criteria andJFLXLessThanOrEqualTo(String value) {
            addCriterion("JFLX <=", value, "JFLX");
            return (Criteria) this;
        }

        public Criteria andJFLXLike(String value) {
            addCriterion("JFLX like", value, "JFLX");
            return (Criteria) this;
        }

        public Criteria andJFLXNotLike(String value) {
            addCriterion("JFLX not like", value, "JFLX");
            return (Criteria) this;
        }

        public Criteria andJFLXIn(List<String> values) {
            addCriterion("JFLX in", values, "JFLX");
            return (Criteria) this;
        }

        public Criteria andJFLXNotIn(List<String> values) {
            addCriterion("JFLX not in", values, "JFLX");
            return (Criteria) this;
        }

        public Criteria andJFLXBetween(String value1, String value2) {
            addCriterion("JFLX between", value1, value2, "JFLX");
            return (Criteria) this;
        }

        public Criteria andJFLXNotBetween(String value1, String value2) {
            addCriterion("JFLX not between", value1, value2, "JFLX");
            return (Criteria) this;
        }

        public Criteria andJFSJQIsNull() {
            addCriterion("JFSJQ is null");
            return (Criteria) this;
        }

        public Criteria andJFSJQIsNotNull() {
            addCriterion("JFSJQ is not null");
            return (Criteria) this;
        }

        public Criteria andJFSJQEqualTo(Date value) {
            addCriterion("JFSJQ =", value, "JFSJQ");
            return (Criteria) this;
        }

        public Criteria andJFSJQNotEqualTo(Date value) {
            addCriterion("JFSJQ <>", value, "JFSJQ");
            return (Criteria) this;
        }

        public Criteria andJFSJQGreaterThan(Date value) {
            addCriterion("JFSJQ >", value, "JFSJQ");
            return (Criteria) this;
        }

        public Criteria andJFSJQGreaterThanOrEqualTo(Date value) {
            addCriterion("JFSJQ >=", value, "JFSJQ");
            return (Criteria) this;
        }

        public Criteria andJFSJQLessThan(Date value) {
            addCriterion("JFSJQ <", value, "JFSJQ");
            return (Criteria) this;
        }

        public Criteria andJFSJQLessThanOrEqualTo(Date value) {
            addCriterion("JFSJQ <=", value, "JFSJQ");
            return (Criteria) this;
        }

        public Criteria andJFSJQIn(List<Date> values) {
            addCriterion("JFSJQ in", values, "JFSJQ");
            return (Criteria) this;
        }

        public Criteria andJFSJQNotIn(List<Date> values) {
            addCriterion("JFSJQ not in", values, "JFSJQ");
            return (Criteria) this;
        }

        public Criteria andJFSJQBetween(Date value1, Date value2) {
            addCriterion("JFSJQ between", value1, value2, "JFSJQ");
            return (Criteria) this;
        }

        public Criteria andJFSJQNotBetween(Date value1, Date value2) {
            addCriterion("JFSJQ not between", value1, value2, "JFSJQ");
            return (Criteria) this;
        }

        public Criteria andJFSJZIsNull() {
            addCriterion("JFSJZ is null");
            return (Criteria) this;
        }

        public Criteria andJFSJZIsNotNull() {
            addCriterion("JFSJZ is not null");
            return (Criteria) this;
        }

        public Criteria andJFSJZEqualTo(Date value) {
            addCriterion("JFSJZ =", value, "JFSJZ");
            return (Criteria) this;
        }

        public Criteria andJFSJZNotEqualTo(Date value) {
            addCriterion("JFSJZ <>", value, "JFSJZ");
            return (Criteria) this;
        }

        public Criteria andJFSJZGreaterThan(Date value) {
            addCriterion("JFSJZ >", value, "JFSJZ");
            return (Criteria) this;
        }

        public Criteria andJFSJZGreaterThanOrEqualTo(Date value) {
            addCriterion("JFSJZ >=", value, "JFSJZ");
            return (Criteria) this;
        }

        public Criteria andJFSJZLessThan(Date value) {
            addCriterion("JFSJZ <", value, "JFSJZ");
            return (Criteria) this;
        }

        public Criteria andJFSJZLessThanOrEqualTo(Date value) {
            addCriterion("JFSJZ <=", value, "JFSJZ");
            return (Criteria) this;
        }

        public Criteria andJFSJZIn(List<Date> values) {
            addCriterion("JFSJZ in", values, "JFSJZ");
            return (Criteria) this;
        }

        public Criteria andJFSJZNotIn(List<Date> values) {
            addCriterion("JFSJZ not in", values, "JFSJZ");
            return (Criteria) this;
        }

        public Criteria andJFSJZBetween(Date value1, Date value2) {
            addCriterion("JFSJZ between", value1, value2, "JFSJZ");
            return (Criteria) this;
        }

        public Criteria andJFSJZNotBetween(Date value1, Date value2) {
            addCriterion("JFSJZ not between", value1, value2, "JFSJZ");
            return (Criteria) this;
        }

        public Criteria andTFYYIsNull() {
            addCriterion("TFYY is null");
            return (Criteria) this;
        }

        public Criteria andTFYYIsNotNull() {
            addCriterion("TFYY is not null");
            return (Criteria) this;
        }

        public Criteria andTFYYEqualTo(String value) {
            addCriterion("TFYY =", value, "TFYY");
            return (Criteria) this;
        }

        public Criteria andTFYYNotEqualTo(String value) {
            addCriterion("TFYY <>", value, "TFYY");
            return (Criteria) this;
        }

        public Criteria andTFYYGreaterThan(String value) {
            addCriterion("TFYY >", value, "TFYY");
            return (Criteria) this;
        }

        public Criteria andTFYYGreaterThanOrEqualTo(String value) {
            addCriterion("TFYY >=", value, "TFYY");
            return (Criteria) this;
        }

        public Criteria andTFYYLessThan(String value) {
            addCriterion("TFYY <", value, "TFYY");
            return (Criteria) this;
        }

        public Criteria andTFYYLessThanOrEqualTo(String value) {
            addCriterion("TFYY <=", value, "TFYY");
            return (Criteria) this;
        }

        public Criteria andTFYYLike(String value) {
            addCriterion("TFYY like", value, "TFYY");
            return (Criteria) this;
        }

        public Criteria andTFYYNotLike(String value) {
            addCriterion("TFYY not like", value, "TFYY");
            return (Criteria) this;
        }

        public Criteria andTFYYIn(List<String> values) {
            addCriterion("TFYY in", values, "TFYY");
            return (Criteria) this;
        }

        public Criteria andTFYYNotIn(List<String> values) {
            addCriterion("TFYY not in", values, "TFYY");
            return (Criteria) this;
        }

        public Criteria andTFYYBetween(String value1, String value2) {
            addCriterion("TFYY between", value1, value2, "TFYY");
            return (Criteria) this;
        }

        public Criteria andTFYYNotBetween(String value1, String value2) {
            addCriterion("TFYY not between", value1, value2, "TFYY");
            return (Criteria) this;
        }

        public Criteria andCZQIsNull() {
            addCriterion("CZQ is null");
            return (Criteria) this;
        }

        public Criteria andCZQIsNotNull() {
            addCriterion("CZQ is not null");
            return (Criteria) this;
        }

        public Criteria andCZQEqualTo(String value) {
            addCriterion("CZQ =", value, "CZQ");
            return (Criteria) this;
        }

        public Criteria andCZQNotEqualTo(String value) {
            addCriterion("CZQ <>", value, "CZQ");
            return (Criteria) this;
        }

        public Criteria andCZQGreaterThan(String value) {
            addCriterion("CZQ >", value, "CZQ");
            return (Criteria) this;
        }

        public Criteria andCZQGreaterThanOrEqualTo(String value) {
            addCriterion("CZQ >=", value, "CZQ");
            return (Criteria) this;
        }

        public Criteria andCZQLessThan(String value) {
            addCriterion("CZQ <", value, "CZQ");
            return (Criteria) this;
        }

        public Criteria andCZQLessThanOrEqualTo(String value) {
            addCriterion("CZQ <=", value, "CZQ");
            return (Criteria) this;
        }

        public Criteria andCZQLike(String value) {
            addCriterion("CZQ like", value, "CZQ");
            return (Criteria) this;
        }

        public Criteria andCZQNotLike(String value) {
            addCriterion("CZQ not like", value, "CZQ");
            return (Criteria) this;
        }

        public Criteria andCZQIn(List<String> values) {
            addCriterion("CZQ in", values, "CZQ");
            return (Criteria) this;
        }

        public Criteria andCZQNotIn(List<String> values) {
            addCriterion("CZQ not in", values, "CZQ");
            return (Criteria) this;
        }

        public Criteria andCZQBetween(String value1, String value2) {
            addCriterion("CZQ between", value1, value2, "CZQ");
            return (Criteria) this;
        }

        public Criteria andCZQNotBetween(String value1, String value2) {
            addCriterion("CZQ not between", value1, value2, "CZQ");
            return (Criteria) this;
        }

        public Criteria andJFFSIsNull() {
            addCriterion("JFFS is null");
            return (Criteria) this;
        }

        public Criteria andJFFSIsNotNull() {
            addCriterion("JFFS is not null");
            return (Criteria) this;
        }

        public Criteria andJFFSEqualTo(String value) {
            addCriterion("JFFS =", value, "JFFS");
            return (Criteria) this;
        }

        public Criteria andJFFSNotEqualTo(String value) {
            addCriterion("JFFS <>", value, "JFFS");
            return (Criteria) this;
        }

        public Criteria andJFFSGreaterThan(String value) {
            addCriterion("JFFS >", value, "JFFS");
            return (Criteria) this;
        }

        public Criteria andJFFSGreaterThanOrEqualTo(String value) {
            addCriterion("JFFS >=", value, "JFFS");
            return (Criteria) this;
        }

        public Criteria andJFFSLessThan(String value) {
            addCriterion("JFFS <", value, "JFFS");
            return (Criteria) this;
        }

        public Criteria andJFFSLessThanOrEqualTo(String value) {
            addCriterion("JFFS <=", value, "JFFS");
            return (Criteria) this;
        }

        public Criteria andJFFSLike(String value) {
            addCriterion("JFFS like", value, "JFFS");
            return (Criteria) this;
        }

        public Criteria andJFFSNotLike(String value) {
            addCriterion("JFFS not like", value, "JFFS");
            return (Criteria) this;
        }

        public Criteria andJFFSIn(List<String> values) {
            addCriterion("JFFS in", values, "JFFS");
            return (Criteria) this;
        }

        public Criteria andJFFSNotIn(List<String> values) {
            addCriterion("JFFS not in", values, "JFFS");
            return (Criteria) this;
        }

        public Criteria andJFFSBetween(String value1, String value2) {
            addCriterion("JFFS between", value1, value2, "JFFS");
            return (Criteria) this;
        }

        public Criteria andJFFSNotBetween(String value1, String value2) {
            addCriterion("JFFS not between", value1, value2, "JFFS");
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

        public Criteria andFPDMIsNull() {
            addCriterion("FPDM is null");
            return (Criteria) this;
        }

        public Criteria andFPDMIsNotNull() {
            addCriterion("FPDM is not null");
            return (Criteria) this;
        }

        public Criteria andFPDMEqualTo(String value) {
            addCriterion("FPDM =", value, "FPDM");
            return (Criteria) this;
        }

        public Criteria andFPDMNotEqualTo(String value) {
            addCriterion("FPDM <>", value, "FPDM");
            return (Criteria) this;
        }

        public Criteria andFPDMGreaterThan(String value) {
            addCriterion("FPDM >", value, "FPDM");
            return (Criteria) this;
        }

        public Criteria andFPDMGreaterThanOrEqualTo(String value) {
            addCriterion("FPDM >=", value, "FPDM");
            return (Criteria) this;
        }

        public Criteria andFPDMLessThan(String value) {
            addCriterion("FPDM <", value, "FPDM");
            return (Criteria) this;
        }

        public Criteria andFPDMLessThanOrEqualTo(String value) {
            addCriterion("FPDM <=", value, "FPDM");
            return (Criteria) this;
        }

        public Criteria andFPDMLike(String value) {
            addCriterion("FPDM like", value, "FPDM");
            return (Criteria) this;
        }

        public Criteria andFPDMNotLike(String value) {
            addCriterion("FPDM not like", value, "FPDM");
            return (Criteria) this;
        }

        public Criteria andFPDMIn(List<String> values) {
            addCriterion("FPDM in", values, "FPDM");
            return (Criteria) this;
        }

        public Criteria andFPDMNotIn(List<String> values) {
            addCriterion("FPDM not in", values, "FPDM");
            return (Criteria) this;
        }

        public Criteria andFPDMBetween(String value1, String value2) {
            addCriterion("FPDM between", value1, value2, "FPDM");
            return (Criteria) this;
        }

        public Criteria andFPDMNotBetween(String value1, String value2) {
            addCriterion("FPDM not between", value1, value2, "FPDM");
            return (Criteria) this;
        }

        public Criteria andSJBHIsNull() {
            addCriterion("SJBH is null");
            return (Criteria) this;
        }

        public Criteria andSJBHIsNotNull() {
            addCriterion("SJBH is not null");
            return (Criteria) this;
        }

        public Criteria andSJBHEqualTo(String value) {
            addCriterion("SJBH =", value, "SJBH");
            return (Criteria) this;
        }

        public Criteria andSJBHNotEqualTo(String value) {
            addCriterion("SJBH <>", value, "SJBH");
            return (Criteria) this;
        }

        public Criteria andSJBHGreaterThan(String value) {
            addCriterion("SJBH >", value, "SJBH");
            return (Criteria) this;
        }

        public Criteria andSJBHGreaterThanOrEqualTo(String value) {
            addCriterion("SJBH >=", value, "SJBH");
            return (Criteria) this;
        }

        public Criteria andSJBHLessThan(String value) {
            addCriterion("SJBH <", value, "SJBH");
            return (Criteria) this;
        }

        public Criteria andSJBHLessThanOrEqualTo(String value) {
            addCriterion("SJBH <=", value, "SJBH");
            return (Criteria) this;
        }

        public Criteria andSJBHLike(String value) {
            addCriterion("SJBH like", value, "SJBH");
            return (Criteria) this;
        }

        public Criteria andSJBHNotLike(String value) {
            addCriterion("SJBH not like", value, "SJBH");
            return (Criteria) this;
        }

        public Criteria andSJBHIn(List<String> values) {
            addCriterion("SJBH in", values, "SJBH");
            return (Criteria) this;
        }

        public Criteria andSJBHNotIn(List<String> values) {
            addCriterion("SJBH not in", values, "SJBH");
            return (Criteria) this;
        }

        public Criteria andSJBHBetween(String value1, String value2) {
            addCriterion("SJBH between", value1, value2, "SJBH");
            return (Criteria) this;
        }

        public Criteria andSJBHNotBetween(String value1, String value2) {
            addCriterion("SJBH not between", value1, value2, "SJBH");
            return (Criteria) this;
        }

        public Criteria andSJCKIDIsNull() {
            addCriterion("SJCKID is null");
            return (Criteria) this;
        }

        public Criteria andSJCKIDIsNotNull() {
            addCriterion("SJCKID is not null");
            return (Criteria) this;
        }

        public Criteria andSJCKIDEqualTo(String value) {
            addCriterion("SJCKID =", value, "SJCKID");
            return (Criteria) this;
        }

        public Criteria andSJCKIDNotEqualTo(String value) {
            addCriterion("SJCKID <>", value, "SJCKID");
            return (Criteria) this;
        }

        public Criteria andSJCKIDGreaterThan(String value) {
            addCriterion("SJCKID >", value, "SJCKID");
            return (Criteria) this;
        }

        public Criteria andSJCKIDGreaterThanOrEqualTo(String value) {
            addCriterion("SJCKID >=", value, "SJCKID");
            return (Criteria) this;
        }

        public Criteria andSJCKIDLessThan(String value) {
            addCriterion("SJCKID <", value, "SJCKID");
            return (Criteria) this;
        }

        public Criteria andSJCKIDLessThanOrEqualTo(String value) {
            addCriterion("SJCKID <=", value, "SJCKID");
            return (Criteria) this;
        }

        public Criteria andSJCKIDLike(String value) {
            addCriterion("SJCKID like", value, "SJCKID");
            return (Criteria) this;
        }

        public Criteria andSJCKIDNotLike(String value) {
            addCriterion("SJCKID not like", value, "SJCKID");
            return (Criteria) this;
        }

        public Criteria andSJCKIDIn(List<String> values) {
            addCriterion("SJCKID in", values, "SJCKID");
            return (Criteria) this;
        }

        public Criteria andSJCKIDNotIn(List<String> values) {
            addCriterion("SJCKID not in", values, "SJCKID");
            return (Criteria) this;
        }

        public Criteria andSJCKIDBetween(String value1, String value2) {
            addCriterion("SJCKID between", value1, value2, "SJCKID");
            return (Criteria) this;
        }

        public Criteria andSJCKIDNotBetween(String value1, String value2) {
            addCriterion("SJCKID not between", value1, value2, "SJCKID");
            return (Criteria) this;
        }

        public Criteria andNSRSBHIsNull() {
            addCriterion("NSRSBH is null");
            return (Criteria) this;
        }

        public Criteria andNSRSBHIsNotNull() {
            addCriterion("NSRSBH is not null");
            return (Criteria) this;
        }

        public Criteria andNSRSBHEqualTo(String value) {
            addCriterion("NSRSBH =", value, "NSRSBH");
            return (Criteria) this;
        }

        public Criteria andNSRSBHNotEqualTo(String value) {
            addCriterion("NSRSBH <>", value, "NSRSBH");
            return (Criteria) this;
        }

        public Criteria andNSRSBHGreaterThan(String value) {
            addCriterion("NSRSBH >", value, "NSRSBH");
            return (Criteria) this;
        }

        public Criteria andNSRSBHGreaterThanOrEqualTo(String value) {
            addCriterion("NSRSBH >=", value, "NSRSBH");
            return (Criteria) this;
        }

        public Criteria andNSRSBHLessThan(String value) {
            addCriterion("NSRSBH <", value, "NSRSBH");
            return (Criteria) this;
        }

        public Criteria andNSRSBHLessThanOrEqualTo(String value) {
            addCriterion("NSRSBH <=", value, "NSRSBH");
            return (Criteria) this;
        }

        public Criteria andNSRSBHLike(String value) {
            addCriterion("NSRSBH like", value, "NSRSBH");
            return (Criteria) this;
        }

        public Criteria andNSRSBHNotLike(String value) {
            addCriterion("NSRSBH not like", value, "NSRSBH");
            return (Criteria) this;
        }

        public Criteria andNSRSBHIn(List<String> values) {
            addCriterion("NSRSBH in", values, "NSRSBH");
            return (Criteria) this;
        }

        public Criteria andNSRSBHNotIn(List<String> values) {
            addCriterion("NSRSBH not in", values, "NSRSBH");
            return (Criteria) this;
        }

        public Criteria andNSRSBHBetween(String value1, String value2) {
            addCriterion("NSRSBH between", value1, value2, "NSRSBH");
            return (Criteria) this;
        }

        public Criteria andNSRSBHNotBetween(String value1, String value2) {
            addCriterion("NSRSBH not between", value1, value2, "NSRSBH");
            return (Criteria) this;
        }

        public Criteria andJFZTIsNull() {
            addCriterion("JFZT is null");
            return (Criteria) this;
        }

        public Criteria andJFZTIsNotNull() {
            addCriterion("JFZT is not null");
            return (Criteria) this;
        }

        public Criteria andJFZTEqualTo(String value) {
            addCriterion("JFZT =", value, "JFZT");
            return (Criteria) this;
        }

        public Criteria andJFZTNotEqualTo(String value) {
            addCriterion("JFZT <>", value, "JFZT");
            return (Criteria) this;
        }

        public Criteria andJFZTGreaterThan(String value) {
            addCriterion("JFZT >", value, "JFZT");
            return (Criteria) this;
        }

        public Criteria andJFZTGreaterThanOrEqualTo(String value) {
            addCriterion("JFZT >=", value, "JFZT");
            return (Criteria) this;
        }

        public Criteria andJFZTLessThan(String value) {
            addCriterion("JFZT <", value, "JFZT");
            return (Criteria) this;
        }

        public Criteria andJFZTLessThanOrEqualTo(String value) {
            addCriterion("JFZT <=", value, "JFZT");
            return (Criteria) this;
        }

        public Criteria andJFZTLike(String value) {
            addCriterion("JFZT like", value, "JFZT");
            return (Criteria) this;
        }

        public Criteria andJFZTNotLike(String value) {
            addCriterion("JFZT not like", value, "JFZT");
            return (Criteria) this;
        }

        public Criteria andJFZTIn(List<String> values) {
            addCriterion("JFZT in", values, "JFZT");
            return (Criteria) this;
        }

        public Criteria andJFZTNotIn(List<String> values) {
            addCriterion("JFZT not in", values, "JFZT");
            return (Criteria) this;
        }

        public Criteria andJFZTBetween(String value1, String value2) {
            addCriterion("JFZT between", value1, value2, "JFZT");
            return (Criteria) this;
        }

        public Criteria andJFZTNotBetween(String value1, String value2) {
            addCriterion("JFZT not between", value1, value2, "JFZT");
            return (Criteria) this;
        }

        public Criteria andJFTJIsNull() {
            addCriterion("JFTJ is null");
            return (Criteria) this;
        }

        public Criteria andJFTJIsNotNull() {
            addCriterion("JFTJ is not null");
            return (Criteria) this;
        }

        public Criteria andJFTJEqualTo(String value) {
            addCriterion("JFTJ =", value, "JFTJ");
            return (Criteria) this;
        }

        public Criteria andJFTJNotEqualTo(String value) {
            addCriterion("JFTJ <>", value, "JFTJ");
            return (Criteria) this;
        }

        public Criteria andJFTJGreaterThan(String value) {
            addCriterion("JFTJ >", value, "JFTJ");
            return (Criteria) this;
        }

        public Criteria andJFTJGreaterThanOrEqualTo(String value) {
            addCriterion("JFTJ >=", value, "JFTJ");
            return (Criteria) this;
        }

        public Criteria andJFTJLessThan(String value) {
            addCriterion("JFTJ <", value, "JFTJ");
            return (Criteria) this;
        }

        public Criteria andJFTJLessThanOrEqualTo(String value) {
            addCriterion("JFTJ <=", value, "JFTJ");
            return (Criteria) this;
        }

        public Criteria andJFTJLike(String value) {
            addCriterion("JFTJ like", value, "JFTJ");
            return (Criteria) this;
        }

        public Criteria andJFTJNotLike(String value) {
            addCriterion("JFTJ not like", value, "JFTJ");
            return (Criteria) this;
        }

        public Criteria andJFTJIn(List<String> values) {
            addCriterion("JFTJ in", values, "JFTJ");
            return (Criteria) this;
        }

        public Criteria andJFTJNotIn(List<String> values) {
            addCriterion("JFTJ not in", values, "JFTJ");
            return (Criteria) this;
        }

        public Criteria andJFTJBetween(String value1, String value2) {
            addCriterion("JFTJ between", value1, value2, "JFTJ");
            return (Criteria) this;
        }

        public Criteria andJFTJNotBetween(String value1, String value2) {
            addCriterion("JFTJ not between", value1, value2, "JFTJ");
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
