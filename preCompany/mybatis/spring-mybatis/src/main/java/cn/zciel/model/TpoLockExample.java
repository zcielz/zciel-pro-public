package cn.zciel.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TpoLockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public TpoLockExample() {
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

        public Criteria andCOMPANY_CODEIsNull() {
            addCriterion("COMPANY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCOMPANY_CODEIsNotNull() {
            addCriterion("COMPANY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCOMPANY_CODEEqualTo(String value) {
            addCriterion("COMPANY_CODE =", value, "COMPANY_CODE");
            return (Criteria) this;
        }

        public Criteria andCOMPANY_CODENotEqualTo(String value) {
            addCriterion("COMPANY_CODE <>", value, "COMPANY_CODE");
            return (Criteria) this;
        }

        public Criteria andCOMPANY_CODEGreaterThan(String value) {
            addCriterion("COMPANY_CODE >", value, "COMPANY_CODE");
            return (Criteria) this;
        }

        public Criteria andCOMPANY_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_CODE >=", value, "COMPANY_CODE");
            return (Criteria) this;
        }

        public Criteria andCOMPANY_CODELessThan(String value) {
            addCriterion("COMPANY_CODE <", value, "COMPANY_CODE");
            return (Criteria) this;
        }

        public Criteria andCOMPANY_CODELessThanOrEqualTo(String value) {
            addCriterion("COMPANY_CODE <=", value, "COMPANY_CODE");
            return (Criteria) this;
        }

        public Criteria andCOMPANY_CODELike(String value) {
            addCriterion("COMPANY_CODE like", value, "COMPANY_CODE");
            return (Criteria) this;
        }

        public Criteria andCOMPANY_CODENotLike(String value) {
            addCriterion("COMPANY_CODE not like", value, "COMPANY_CODE");
            return (Criteria) this;
        }

        public Criteria andCOMPANY_CODEIn(List<String> values) {
            addCriterion("COMPANY_CODE in", values, "COMPANY_CODE");
            return (Criteria) this;
        }

        public Criteria andCOMPANY_CODENotIn(List<String> values) {
            addCriterion("COMPANY_CODE not in", values, "COMPANY_CODE");
            return (Criteria) this;
        }

        public Criteria andCOMPANY_CODEBetween(String value1, String value2) {
            addCriterion("COMPANY_CODE between", value1, value2, "COMPANY_CODE");
            return (Criteria) this;
        }

        public Criteria andCOMPANY_CODENotBetween(String value1, String value2) {
            addCriterion("COMPANY_CODE not between", value1, value2, "COMPANY_CODE");
            return (Criteria) this;
        }

        public Criteria andTRANSACTION_IDIsNull() {
            addCriterion("TRANSACTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andTRANSACTION_IDIsNotNull() {
            addCriterion("TRANSACTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTRANSACTION_IDEqualTo(String value) {
            addCriterion("TRANSACTION_ID =", value, "TRANSACTION_ID");
            return (Criteria) this;
        }

        public Criteria andTRANSACTION_IDNotEqualTo(String value) {
            addCriterion("TRANSACTION_ID <>", value, "TRANSACTION_ID");
            return (Criteria) this;
        }

        public Criteria andTRANSACTION_IDGreaterThan(String value) {
            addCriterion("TRANSACTION_ID >", value, "TRANSACTION_ID");
            return (Criteria) this;
        }

        public Criteria andTRANSACTION_IDGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSACTION_ID >=", value, "TRANSACTION_ID");
            return (Criteria) this;
        }

        public Criteria andTRANSACTION_IDLessThan(String value) {
            addCriterion("TRANSACTION_ID <", value, "TRANSACTION_ID");
            return (Criteria) this;
        }

        public Criteria andTRANSACTION_IDLessThanOrEqualTo(String value) {
            addCriterion("TRANSACTION_ID <=", value, "TRANSACTION_ID");
            return (Criteria) this;
        }

        public Criteria andTRANSACTION_IDLike(String value) {
            addCriterion("TRANSACTION_ID like", value, "TRANSACTION_ID");
            return (Criteria) this;
        }

        public Criteria andTRANSACTION_IDNotLike(String value) {
            addCriterion("TRANSACTION_ID not like", value, "TRANSACTION_ID");
            return (Criteria) this;
        }

        public Criteria andTRANSACTION_IDIn(List<String> values) {
            addCriterion("TRANSACTION_ID in", values, "TRANSACTION_ID");
            return (Criteria) this;
        }

        public Criteria andTRANSACTION_IDNotIn(List<String> values) {
            addCriterion("TRANSACTION_ID not in", values, "TRANSACTION_ID");
            return (Criteria) this;
        }

        public Criteria andTRANSACTION_IDBetween(String value1, String value2) {
            addCriterion("TRANSACTION_ID between", value1, value2, "TRANSACTION_ID");
            return (Criteria) this;
        }

        public Criteria andTRANSACTION_IDNotBetween(String value1, String value2) {
            addCriterion("TRANSACTION_ID not between", value1, value2, "TRANSACTION_ID");
            return (Criteria) this;
        }

        public Criteria andLOCK_CODEIsNull() {
            addCriterion("LOCK_CODE is null");
            return (Criteria) this;
        }

        public Criteria andLOCK_CODEIsNotNull() {
            addCriterion("LOCK_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andLOCK_CODEEqualTo(String value) {
            addCriterion("LOCK_CODE =", value, "LOCK_CODE");
            return (Criteria) this;
        }

        public Criteria andLOCK_CODENotEqualTo(String value) {
            addCriterion("LOCK_CODE <>", value, "LOCK_CODE");
            return (Criteria) this;
        }

        public Criteria andLOCK_CODEGreaterThan(String value) {
            addCriterion("LOCK_CODE >", value, "LOCK_CODE");
            return (Criteria) this;
        }

        public Criteria andLOCK_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("LOCK_CODE >=", value, "LOCK_CODE");
            return (Criteria) this;
        }

        public Criteria andLOCK_CODELessThan(String value) {
            addCriterion("LOCK_CODE <", value, "LOCK_CODE");
            return (Criteria) this;
        }

        public Criteria andLOCK_CODELessThanOrEqualTo(String value) {
            addCriterion("LOCK_CODE <=", value, "LOCK_CODE");
            return (Criteria) this;
        }

        public Criteria andLOCK_CODELike(String value) {
            addCriterion("LOCK_CODE like", value, "LOCK_CODE");
            return (Criteria) this;
        }

        public Criteria andLOCK_CODENotLike(String value) {
            addCriterion("LOCK_CODE not like", value, "LOCK_CODE");
            return (Criteria) this;
        }

        public Criteria andLOCK_CODEIn(List<String> values) {
            addCriterion("LOCK_CODE in", values, "LOCK_CODE");
            return (Criteria) this;
        }

        public Criteria andLOCK_CODENotIn(List<String> values) {
            addCriterion("LOCK_CODE not in", values, "LOCK_CODE");
            return (Criteria) this;
        }

        public Criteria andLOCK_CODEBetween(String value1, String value2) {
            addCriterion("LOCK_CODE between", value1, value2, "LOCK_CODE");
            return (Criteria) this;
        }

        public Criteria andLOCK_CODENotBetween(String value1, String value2) {
            addCriterion("LOCK_CODE not between", value1, value2, "LOCK_CODE");
            return (Criteria) this;
        }

        public Criteria andLOCK_NOIsNull() {
            addCriterion("LOCK_NO is null");
            return (Criteria) this;
        }

        public Criteria andLOCK_NOIsNotNull() {
            addCriterion("LOCK_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLOCK_NOEqualTo(String value) {
            addCriterion("LOCK_NO =", value, "LOCK_NO");
            return (Criteria) this;
        }

        public Criteria andLOCK_NONotEqualTo(String value) {
            addCriterion("LOCK_NO <>", value, "LOCK_NO");
            return (Criteria) this;
        }

        public Criteria andLOCK_NOGreaterThan(String value) {
            addCriterion("LOCK_NO >", value, "LOCK_NO");
            return (Criteria) this;
        }

        public Criteria andLOCK_NOGreaterThanOrEqualTo(String value) {
            addCriterion("LOCK_NO >=", value, "LOCK_NO");
            return (Criteria) this;
        }

        public Criteria andLOCK_NOLessThan(String value) {
            addCriterion("LOCK_NO <", value, "LOCK_NO");
            return (Criteria) this;
        }

        public Criteria andLOCK_NOLessThanOrEqualTo(String value) {
            addCriterion("LOCK_NO <=", value, "LOCK_NO");
            return (Criteria) this;
        }

        public Criteria andLOCK_NOLike(String value) {
            addCriterion("LOCK_NO like", value, "LOCK_NO");
            return (Criteria) this;
        }

        public Criteria andLOCK_NONotLike(String value) {
            addCriterion("LOCK_NO not like", value, "LOCK_NO");
            return (Criteria) this;
        }

        public Criteria andLOCK_NOIn(List<String> values) {
            addCriterion("LOCK_NO in", values, "LOCK_NO");
            return (Criteria) this;
        }

        public Criteria andLOCK_NONotIn(List<String> values) {
            addCriterion("LOCK_NO not in", values, "LOCK_NO");
            return (Criteria) this;
        }

        public Criteria andLOCK_NOBetween(String value1, String value2) {
            addCriterion("LOCK_NO between", value1, value2, "LOCK_NO");
            return (Criteria) this;
        }

        public Criteria andLOCK_NONotBetween(String value1, String value2) {
            addCriterion("LOCK_NO not between", value1, value2, "LOCK_NO");
            return (Criteria) this;
        }

        public Criteria andSHORT_NAMEIsNull() {
            addCriterion("SHORT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSHORT_NAMEIsNotNull() {
            addCriterion("SHORT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSHORT_NAMEEqualTo(String value) {
            addCriterion("SHORT_NAME =", value, "SHORT_NAME");
            return (Criteria) this;
        }

        public Criteria andSHORT_NAMENotEqualTo(String value) {
            addCriterion("SHORT_NAME <>", value, "SHORT_NAME");
            return (Criteria) this;
        }

        public Criteria andSHORT_NAMEGreaterThan(String value) {
            addCriterion("SHORT_NAME >", value, "SHORT_NAME");
            return (Criteria) this;
        }

        public Criteria andSHORT_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("SHORT_NAME >=", value, "SHORT_NAME");
            return (Criteria) this;
        }

        public Criteria andSHORT_NAMELessThan(String value) {
            addCriterion("SHORT_NAME <", value, "SHORT_NAME");
            return (Criteria) this;
        }

        public Criteria andSHORT_NAMELessThanOrEqualTo(String value) {
            addCriterion("SHORT_NAME <=", value, "SHORT_NAME");
            return (Criteria) this;
        }

        public Criteria andSHORT_NAMELike(String value) {
            addCriterion("SHORT_NAME like", value, "SHORT_NAME");
            return (Criteria) this;
        }

        public Criteria andSHORT_NAMENotLike(String value) {
            addCriterion("SHORT_NAME not like", value, "SHORT_NAME");
            return (Criteria) this;
        }

        public Criteria andSHORT_NAMEIn(List<String> values) {
            addCriterion("SHORT_NAME in", values, "SHORT_NAME");
            return (Criteria) this;
        }

        public Criteria andSHORT_NAMENotIn(List<String> values) {
            addCriterion("SHORT_NAME not in", values, "SHORT_NAME");
            return (Criteria) this;
        }

        public Criteria andSHORT_NAMEBetween(String value1, String value2) {
            addCriterion("SHORT_NAME between", value1, value2, "SHORT_NAME");
            return (Criteria) this;
        }

        public Criteria andSHORT_NAMENotBetween(String value1, String value2) {
            addCriterion("SHORT_NAME not between", value1, value2, "SHORT_NAME");
            return (Criteria) this;
        }

        public Criteria andDOOR_NOIsNull() {
            addCriterion("DOOR_NO is null");
            return (Criteria) this;
        }

        public Criteria andDOOR_NOIsNotNull() {
            addCriterion("DOOR_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDOOR_NOEqualTo(String value) {
            addCriterion("DOOR_NO =", value, "DOOR_NO");
            return (Criteria) this;
        }

        public Criteria andDOOR_NONotEqualTo(String value) {
            addCriterion("DOOR_NO <>", value, "DOOR_NO");
            return (Criteria) this;
        }

        public Criteria andDOOR_NOGreaterThan(String value) {
            addCriterion("DOOR_NO >", value, "DOOR_NO");
            return (Criteria) this;
        }

        public Criteria andDOOR_NOGreaterThanOrEqualTo(String value) {
            addCriterion("DOOR_NO >=", value, "DOOR_NO");
            return (Criteria) this;
        }

        public Criteria andDOOR_NOLessThan(String value) {
            addCriterion("DOOR_NO <", value, "DOOR_NO");
            return (Criteria) this;
        }

        public Criteria andDOOR_NOLessThanOrEqualTo(String value) {
            addCriterion("DOOR_NO <=", value, "DOOR_NO");
            return (Criteria) this;
        }

        public Criteria andDOOR_NOLike(String value) {
            addCriterion("DOOR_NO like", value, "DOOR_NO");
            return (Criteria) this;
        }

        public Criteria andDOOR_NONotLike(String value) {
            addCriterion("DOOR_NO not like", value, "DOOR_NO");
            return (Criteria) this;
        }

        public Criteria andDOOR_NOIn(List<String> values) {
            addCriterion("DOOR_NO in", values, "DOOR_NO");
            return (Criteria) this;
        }

        public Criteria andDOOR_NONotIn(List<String> values) {
            addCriterion("DOOR_NO not in", values, "DOOR_NO");
            return (Criteria) this;
        }

        public Criteria andDOOR_NOBetween(String value1, String value2) {
            addCriterion("DOOR_NO between", value1, value2, "DOOR_NO");
            return (Criteria) this;
        }

        public Criteria andDOOR_NONotBetween(String value1, String value2) {
            addCriterion("DOOR_NO not between", value1, value2, "DOOR_NO");
            return (Criteria) this;
        }

        public Criteria andDISTRICTIsNull() {
            addCriterion("DISTRICT is null");
            return (Criteria) this;
        }

        public Criteria andDISTRICTIsNotNull() {
            addCriterion("DISTRICT is not null");
            return (Criteria) this;
        }

        public Criteria andDISTRICTEqualTo(String value) {
            addCriterion("DISTRICT =", value, "DISTRICT");
            return (Criteria) this;
        }

        public Criteria andDISTRICTNotEqualTo(String value) {
            addCriterion("DISTRICT <>", value, "DISTRICT");
            return (Criteria) this;
        }

        public Criteria andDISTRICTGreaterThan(String value) {
            addCriterion("DISTRICT >", value, "DISTRICT");
            return (Criteria) this;
        }

        public Criteria andDISTRICTGreaterThanOrEqualTo(String value) {
            addCriterion("DISTRICT >=", value, "DISTRICT");
            return (Criteria) this;
        }

        public Criteria andDISTRICTLessThan(String value) {
            addCriterion("DISTRICT <", value, "DISTRICT");
            return (Criteria) this;
        }

        public Criteria andDISTRICTLessThanOrEqualTo(String value) {
            addCriterion("DISTRICT <=", value, "DISTRICT");
            return (Criteria) this;
        }

        public Criteria andDISTRICTLike(String value) {
            addCriterion("DISTRICT like", value, "DISTRICT");
            return (Criteria) this;
        }

        public Criteria andDISTRICTNotLike(String value) {
            addCriterion("DISTRICT not like", value, "DISTRICT");
            return (Criteria) this;
        }

        public Criteria andDISTRICTIn(List<String> values) {
            addCriterion("DISTRICT in", values, "DISTRICT");
            return (Criteria) this;
        }

        public Criteria andDISTRICTNotIn(List<String> values) {
            addCriterion("DISTRICT not in", values, "DISTRICT");
            return (Criteria) this;
        }

        public Criteria andDISTRICTBetween(String value1, String value2) {
            addCriterion("DISTRICT between", value1, value2, "DISTRICT");
            return (Criteria) this;
        }

        public Criteria andDISTRICTNotBetween(String value1, String value2) {
            addCriterion("DISTRICT not between", value1, value2, "DISTRICT");
            return (Criteria) this;
        }

        public Criteria andCITYIsNull() {
            addCriterion("CITY is null");
            return (Criteria) this;
        }

        public Criteria andCITYIsNotNull() {
            addCriterion("CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCITYEqualTo(String value) {
            addCriterion("CITY =", value, "CITY");
            return (Criteria) this;
        }

        public Criteria andCITYNotEqualTo(String value) {
            addCriterion("CITY <>", value, "CITY");
            return (Criteria) this;
        }

        public Criteria andCITYGreaterThan(String value) {
            addCriterion("CITY >", value, "CITY");
            return (Criteria) this;
        }

        public Criteria andCITYGreaterThanOrEqualTo(String value) {
            addCriterion("CITY >=", value, "CITY");
            return (Criteria) this;
        }

        public Criteria andCITYLessThan(String value) {
            addCriterion("CITY <", value, "CITY");
            return (Criteria) this;
        }

        public Criteria andCITYLessThanOrEqualTo(String value) {
            addCriterion("CITY <=", value, "CITY");
            return (Criteria) this;
        }

        public Criteria andCITYLike(String value) {
            addCriterion("CITY like", value, "CITY");
            return (Criteria) this;
        }

        public Criteria andCITYNotLike(String value) {
            addCriterion("CITY not like", value, "CITY");
            return (Criteria) this;
        }

        public Criteria andCITYIn(List<String> values) {
            addCriterion("CITY in", values, "CITY");
            return (Criteria) this;
        }

        public Criteria andCITYNotIn(List<String> values) {
            addCriterion("CITY not in", values, "CITY");
            return (Criteria) this;
        }

        public Criteria andCITYBetween(String value1, String value2) {
            addCriterion("CITY between", value1, value2, "CITY");
            return (Criteria) this;
        }

        public Criteria andCITYNotBetween(String value1, String value2) {
            addCriterion("CITY not between", value1, value2, "CITY");
            return (Criteria) this;
        }

        public Criteria andLNGIsNull() {
            addCriterion("LNG is null");
            return (Criteria) this;
        }

        public Criteria andLNGIsNotNull() {
            addCriterion("LNG is not null");
            return (Criteria) this;
        }

        public Criteria andLNGEqualTo(BigDecimal value) {
            addCriterion("LNG =", value, "LNG");
            return (Criteria) this;
        }

        public Criteria andLNGNotEqualTo(BigDecimal value) {
            addCriterion("LNG <>", value, "LNG");
            return (Criteria) this;
        }

        public Criteria andLNGGreaterThan(BigDecimal value) {
            addCriterion("LNG >", value, "LNG");
            return (Criteria) this;
        }

        public Criteria andLNGGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LNG >=", value, "LNG");
            return (Criteria) this;
        }

        public Criteria andLNGLessThan(BigDecimal value) {
            addCriterion("LNG <", value, "LNG");
            return (Criteria) this;
        }

        public Criteria andLNGLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LNG <=", value, "LNG");
            return (Criteria) this;
        }

        public Criteria andLNGIn(List<BigDecimal> values) {
            addCriterion("LNG in", values, "LNG");
            return (Criteria) this;
        }

        public Criteria andLNGNotIn(List<BigDecimal> values) {
            addCriterion("LNG not in", values, "LNG");
            return (Criteria) this;
        }

        public Criteria andLNGBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LNG between", value1, value2, "LNG");
            return (Criteria) this;
        }

        public Criteria andLNGNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LNG not between", value1, value2, "LNG");
            return (Criteria) this;
        }

        public Criteria andLATIsNull() {
            addCriterion("LAT is null");
            return (Criteria) this;
        }

        public Criteria andLATIsNotNull() {
            addCriterion("LAT is not null");
            return (Criteria) this;
        }

        public Criteria andLATEqualTo(BigDecimal value) {
            addCriterion("LAT =", value, "LAT");
            return (Criteria) this;
        }

        public Criteria andLATNotEqualTo(BigDecimal value) {
            addCriterion("LAT <>", value, "LAT");
            return (Criteria) this;
        }

        public Criteria andLATGreaterThan(BigDecimal value) {
            addCriterion("LAT >", value, "LAT");
            return (Criteria) this;
        }

        public Criteria andLATGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LAT >=", value, "LAT");
            return (Criteria) this;
        }

        public Criteria andLATLessThan(BigDecimal value) {
            addCriterion("LAT <", value, "LAT");
            return (Criteria) this;
        }

        public Criteria andLATLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LAT <=", value, "LAT");
            return (Criteria) this;
        }

        public Criteria andLATIn(List<BigDecimal> values) {
            addCriterion("LAT in", values, "LAT");
            return (Criteria) this;
        }

        public Criteria andLATNotIn(List<BigDecimal> values) {
            addCriterion("LAT not in", values, "LAT");
            return (Criteria) this;
        }

        public Criteria andLATBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAT between", value1, value2, "LAT");
            return (Criteria) this;
        }

        public Criteria andLATNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAT not between", value1, value2, "LAT");
            return (Criteria) this;
        }

        public Criteria andINSTALLER_NAMEIsNull() {
            addCriterion("INSTALLER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andINSTALLER_NAMEIsNotNull() {
            addCriterion("INSTALLER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andINSTALLER_NAMEEqualTo(String value) {
            addCriterion("INSTALLER_NAME =", value, "INSTALLER_NAME");
            return (Criteria) this;
        }

        public Criteria andINSTALLER_NAMENotEqualTo(String value) {
            addCriterion("INSTALLER_NAME <>", value, "INSTALLER_NAME");
            return (Criteria) this;
        }

        public Criteria andINSTALLER_NAMEGreaterThan(String value) {
            addCriterion("INSTALLER_NAME >", value, "INSTALLER_NAME");
            return (Criteria) this;
        }

        public Criteria andINSTALLER_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("INSTALLER_NAME >=", value, "INSTALLER_NAME");
            return (Criteria) this;
        }

        public Criteria andINSTALLER_NAMELessThan(String value) {
            addCriterion("INSTALLER_NAME <", value, "INSTALLER_NAME");
            return (Criteria) this;
        }

        public Criteria andINSTALLER_NAMELessThanOrEqualTo(String value) {
            addCriterion("INSTALLER_NAME <=", value, "INSTALLER_NAME");
            return (Criteria) this;
        }

        public Criteria andINSTALLER_NAMELike(String value) {
            addCriterion("INSTALLER_NAME like", value, "INSTALLER_NAME");
            return (Criteria) this;
        }

        public Criteria andINSTALLER_NAMENotLike(String value) {
            addCriterion("INSTALLER_NAME not like", value, "INSTALLER_NAME");
            return (Criteria) this;
        }

        public Criteria andINSTALLER_NAMEIn(List<String> values) {
            addCriterion("INSTALLER_NAME in", values, "INSTALLER_NAME");
            return (Criteria) this;
        }

        public Criteria andINSTALLER_NAMENotIn(List<String> values) {
            addCriterion("INSTALLER_NAME not in", values, "INSTALLER_NAME");
            return (Criteria) this;
        }

        public Criteria andINSTALLER_NAMEBetween(String value1, String value2) {
            addCriterion("INSTALLER_NAME between", value1, value2, "INSTALLER_NAME");
            return (Criteria) this;
        }

        public Criteria andINSTALLER_NAMENotBetween(String value1, String value2) {
            addCriterion("INSTALLER_NAME not between", value1, value2, "INSTALLER_NAME");
            return (Criteria) this;
        }

        public Criteria andINSTALL_TIMEIsNull() {
            addCriterion("INSTALL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andINSTALL_TIMEIsNotNull() {
            addCriterion("INSTALL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andINSTALL_TIMEEqualTo(Date value) {
            addCriterion("INSTALL_TIME =", value, "INSTALL_TIME");
            return (Criteria) this;
        }

        public Criteria andINSTALL_TIMENotEqualTo(Date value) {
            addCriterion("INSTALL_TIME <>", value, "INSTALL_TIME");
            return (Criteria) this;
        }

        public Criteria andINSTALL_TIMEGreaterThan(Date value) {
            addCriterion("INSTALL_TIME >", value, "INSTALL_TIME");
            return (Criteria) this;
        }

        public Criteria andINSTALL_TIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("INSTALL_TIME >=", value, "INSTALL_TIME");
            return (Criteria) this;
        }

        public Criteria andINSTALL_TIMELessThan(Date value) {
            addCriterion("INSTALL_TIME <", value, "INSTALL_TIME");
            return (Criteria) this;
        }

        public Criteria andINSTALL_TIMELessThanOrEqualTo(Date value) {
            addCriterion("INSTALL_TIME <=", value, "INSTALL_TIME");
            return (Criteria) this;
        }

        public Criteria andINSTALL_TIMEIn(List<Date> values) {
            addCriterion("INSTALL_TIME in", values, "INSTALL_TIME");
            return (Criteria) this;
        }

        public Criteria andINSTALL_TIMENotIn(List<Date> values) {
            addCriterion("INSTALL_TIME not in", values, "INSTALL_TIME");
            return (Criteria) this;
        }

        public Criteria andINSTALL_TIMEBetween(Date value1, Date value2) {
            addCriterion("INSTALL_TIME between", value1, value2, "INSTALL_TIME");
            return (Criteria) this;
        }

        public Criteria andINSTALL_TIMENotBetween(Date value1, Date value2) {
            addCriterion("INSTALL_TIME not between", value1, value2, "INSTALL_TIME");
            return (Criteria) this;
        }

        public Criteria andFACTORYIsNull() {
            addCriterion("FACTORY is null");
            return (Criteria) this;
        }

        public Criteria andFACTORYIsNotNull() {
            addCriterion("FACTORY is not null");
            return (Criteria) this;
        }

        public Criteria andFACTORYEqualTo(String value) {
            addCriterion("FACTORY =", value, "FACTORY");
            return (Criteria) this;
        }

        public Criteria andFACTORYNotEqualTo(String value) {
            addCriterion("FACTORY <>", value, "FACTORY");
            return (Criteria) this;
        }

        public Criteria andFACTORYGreaterThan(String value) {
            addCriterion("FACTORY >", value, "FACTORY");
            return (Criteria) this;
        }

        public Criteria andFACTORYGreaterThanOrEqualTo(String value) {
            addCriterion("FACTORY >=", value, "FACTORY");
            return (Criteria) this;
        }

        public Criteria andFACTORYLessThan(String value) {
            addCriterion("FACTORY <", value, "FACTORY");
            return (Criteria) this;
        }

        public Criteria andFACTORYLessThanOrEqualTo(String value) {
            addCriterion("FACTORY <=", value, "FACTORY");
            return (Criteria) this;
        }

        public Criteria andFACTORYLike(String value) {
            addCriterion("FACTORY like", value, "FACTORY");
            return (Criteria) this;
        }

        public Criteria andFACTORYNotLike(String value) {
            addCriterion("FACTORY not like", value, "FACTORY");
            return (Criteria) this;
        }

        public Criteria andFACTORYIn(List<String> values) {
            addCriterion("FACTORY in", values, "FACTORY");
            return (Criteria) this;
        }

        public Criteria andFACTORYNotIn(List<String> values) {
            addCriterion("FACTORY not in", values, "FACTORY");
            return (Criteria) this;
        }

        public Criteria andFACTORYBetween(String value1, String value2) {
            addCriterion("FACTORY between", value1, value2, "FACTORY");
            return (Criteria) this;
        }

        public Criteria andFACTORYNotBetween(String value1, String value2) {
            addCriterion("FACTORY not between", value1, value2, "FACTORY");
            return (Criteria) this;
        }

        public Criteria andVERSIONIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVERSIONIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVERSIONEqualTo(String value) {
            addCriterion("VERSION =", value, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONNotEqualTo(String value) {
            addCriterion("VERSION <>", value, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONGreaterThan(String value) {
            addCriterion("VERSION >", value, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONGreaterThanOrEqualTo(String value) {
            addCriterion("VERSION >=", value, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONLessThan(String value) {
            addCriterion("VERSION <", value, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONLessThanOrEqualTo(String value) {
            addCriterion("VERSION <=", value, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONLike(String value) {
            addCriterion("VERSION like", value, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONNotLike(String value) {
            addCriterion("VERSION not like", value, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONIn(List<String> values) {
            addCriterion("VERSION in", values, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONNotIn(List<String> values) {
            addCriterion("VERSION not in", values, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONBetween(String value1, String value2) {
            addCriterion("VERSION between", value1, value2, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONNotBetween(String value1, String value2) {
            addCriterion("VERSION not between", value1, value2, "VERSION");
            return (Criteria) this;
        }

        public Criteria andOPERATORIsNull() {
            addCriterion("`OPERATOR` is null");
            return (Criteria) this;
        }

        public Criteria andOPERATORIsNotNull() {
            addCriterion("`OPERATOR` is not null");
            return (Criteria) this;
        }

        public Criteria andOPERATOREqualTo(String value) {
            addCriterion("`OPERATOR` =", value, "OPERATOR");
            return (Criteria) this;
        }

        public Criteria andOPERATORNotEqualTo(String value) {
            addCriterion("`OPERATOR` <>", value, "OPERATOR");
            return (Criteria) this;
        }

        public Criteria andOPERATORGreaterThan(String value) {
            addCriterion("`OPERATOR` >", value, "OPERATOR");
            return (Criteria) this;
        }

        public Criteria andOPERATORGreaterThanOrEqualTo(String value) {
            addCriterion("`OPERATOR` >=", value, "OPERATOR");
            return (Criteria) this;
        }

        public Criteria andOPERATORLessThan(String value) {
            addCriterion("`OPERATOR` <", value, "OPERATOR");
            return (Criteria) this;
        }

        public Criteria andOPERATORLessThanOrEqualTo(String value) {
            addCriterion("`OPERATOR` <=", value, "OPERATOR");
            return (Criteria) this;
        }

        public Criteria andOPERATORLike(String value) {
            addCriterion("`OPERATOR` like", value, "OPERATOR");
            return (Criteria) this;
        }

        public Criteria andOPERATORNotLike(String value) {
            addCriterion("`OPERATOR` not like", value, "OPERATOR");
            return (Criteria) this;
        }

        public Criteria andOPERATORIn(List<String> values) {
            addCriterion("`OPERATOR` in", values, "OPERATOR");
            return (Criteria) this;
        }

        public Criteria andOPERATORNotIn(List<String> values) {
            addCriterion("`OPERATOR` not in", values, "OPERATOR");
            return (Criteria) this;
        }

        public Criteria andOPERATORBetween(String value1, String value2) {
            addCriterion("`OPERATOR` between", value1, value2, "OPERATOR");
            return (Criteria) this;
        }

        public Criteria andOPERATORNotBetween(String value1, String value2) {
            addCriterion("`OPERATOR` not between", value1, value2, "OPERATOR");
            return (Criteria) this;
        }

        public Criteria andPOSTAL_TYPEIsNull() {
            addCriterion("POSTAL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPOSTAL_TYPEIsNotNull() {
            addCriterion("POSTAL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPOSTAL_TYPEEqualTo(String value) {
            addCriterion("POSTAL_TYPE =", value, "POSTAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andPOSTAL_TYPENotEqualTo(String value) {
            addCriterion("POSTAL_TYPE <>", value, "POSTAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andPOSTAL_TYPEGreaterThan(String value) {
            addCriterion("POSTAL_TYPE >", value, "POSTAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andPOSTAL_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("POSTAL_TYPE >=", value, "POSTAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andPOSTAL_TYPELessThan(String value) {
            addCriterion("POSTAL_TYPE <", value, "POSTAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andPOSTAL_TYPELessThanOrEqualTo(String value) {
            addCriterion("POSTAL_TYPE <=", value, "POSTAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andPOSTAL_TYPELike(String value) {
            addCriterion("POSTAL_TYPE like", value, "POSTAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andPOSTAL_TYPENotLike(String value) {
            addCriterion("POSTAL_TYPE not like", value, "POSTAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andPOSTAL_TYPEIn(List<String> values) {
            addCriterion("POSTAL_TYPE in", values, "POSTAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andPOSTAL_TYPENotIn(List<String> values) {
            addCriterion("POSTAL_TYPE not in", values, "POSTAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andPOSTAL_TYPEBetween(String value1, String value2) {
            addCriterion("POSTAL_TYPE between", value1, value2, "POSTAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andPOSTAL_TYPENotBetween(String value1, String value2) {
            addCriterion("POSTAL_TYPE not between", value1, value2, "POSTAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andMODEL_NUMBERIsNull() {
            addCriterion("MODEL_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andMODEL_NUMBERIsNotNull() {
            addCriterion("MODEL_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andMODEL_NUMBEREqualTo(String value) {
            addCriterion("MODEL_NUMBER =", value, "MODEL_NUMBER");
            return (Criteria) this;
        }

        public Criteria andMODEL_NUMBERNotEqualTo(String value) {
            addCriterion("MODEL_NUMBER <>", value, "MODEL_NUMBER");
            return (Criteria) this;
        }

        public Criteria andMODEL_NUMBERGreaterThan(String value) {
            addCriterion("MODEL_NUMBER >", value, "MODEL_NUMBER");
            return (Criteria) this;
        }

        public Criteria andMODEL_NUMBERGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL_NUMBER >=", value, "MODEL_NUMBER");
            return (Criteria) this;
        }

        public Criteria andMODEL_NUMBERLessThan(String value) {
            addCriterion("MODEL_NUMBER <", value, "MODEL_NUMBER");
            return (Criteria) this;
        }

        public Criteria andMODEL_NUMBERLessThanOrEqualTo(String value) {
            addCriterion("MODEL_NUMBER <=", value, "MODEL_NUMBER");
            return (Criteria) this;
        }

        public Criteria andMODEL_NUMBERLike(String value) {
            addCriterion("MODEL_NUMBER like", value, "MODEL_NUMBER");
            return (Criteria) this;
        }

        public Criteria andMODEL_NUMBERNotLike(String value) {
            addCriterion("MODEL_NUMBER not like", value, "MODEL_NUMBER");
            return (Criteria) this;
        }

        public Criteria andMODEL_NUMBERIn(List<String> values) {
            addCriterion("MODEL_NUMBER in", values, "MODEL_NUMBER");
            return (Criteria) this;
        }

        public Criteria andMODEL_NUMBERNotIn(List<String> values) {
            addCriterion("MODEL_NUMBER not in", values, "MODEL_NUMBER");
            return (Criteria) this;
        }

        public Criteria andMODEL_NUMBERBetween(String value1, String value2) {
            addCriterion("MODEL_NUMBER between", value1, value2, "MODEL_NUMBER");
            return (Criteria) this;
        }

        public Criteria andMODEL_NUMBERNotBetween(String value1, String value2) {
            addCriterion("MODEL_NUMBER not between", value1, value2, "MODEL_NUMBER");
            return (Criteria) this;
        }

        public Criteria andMACIsNull() {
            addCriterion("MAC is null");
            return (Criteria) this;
        }

        public Criteria andMACIsNotNull() {
            addCriterion("MAC is not null");
            return (Criteria) this;
        }

        public Criteria andMACEqualTo(String value) {
            addCriterion("MAC =", value, "MAC");
            return (Criteria) this;
        }

        public Criteria andMACNotEqualTo(String value) {
            addCriterion("MAC <>", value, "MAC");
            return (Criteria) this;
        }

        public Criteria andMACGreaterThan(String value) {
            addCriterion("MAC >", value, "MAC");
            return (Criteria) this;
        }

        public Criteria andMACGreaterThanOrEqualTo(String value) {
            addCriterion("MAC >=", value, "MAC");
            return (Criteria) this;
        }

        public Criteria andMACLessThan(String value) {
            addCriterion("MAC <", value, "MAC");
            return (Criteria) this;
        }

        public Criteria andMACLessThanOrEqualTo(String value) {
            addCriterion("MAC <=", value, "MAC");
            return (Criteria) this;
        }

        public Criteria andMACLike(String value) {
            addCriterion("MAC like", value, "MAC");
            return (Criteria) this;
        }

        public Criteria andMACNotLike(String value) {
            addCriterion("MAC not like", value, "MAC");
            return (Criteria) this;
        }

        public Criteria andMACIn(List<String> values) {
            addCriterion("MAC in", values, "MAC");
            return (Criteria) this;
        }

        public Criteria andMACNotIn(List<String> values) {
            addCriterion("MAC not in", values, "MAC");
            return (Criteria) this;
        }

        public Criteria andMACBetween(String value1, String value2) {
            addCriterion("MAC between", value1, value2, "MAC");
            return (Criteria) this;
        }

        public Criteria andMACNotBetween(String value1, String value2) {
            addCriterion("MAC not between", value1, value2, "MAC");
            return (Criteria) this;
        }

        public Criteria andSECRET_KEYIsNull() {
            addCriterion("SECRET_KEY is null");
            return (Criteria) this;
        }

        public Criteria andSECRET_KEYIsNotNull() {
            addCriterion("SECRET_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andSECRET_KEYEqualTo(String value) {
            addCriterion("SECRET_KEY =", value, "SECRET_KEY");
            return (Criteria) this;
        }

        public Criteria andSECRET_KEYNotEqualTo(String value) {
            addCriterion("SECRET_KEY <>", value, "SECRET_KEY");
            return (Criteria) this;
        }

        public Criteria andSECRET_KEYGreaterThan(String value) {
            addCriterion("SECRET_KEY >", value, "SECRET_KEY");
            return (Criteria) this;
        }

        public Criteria andSECRET_KEYGreaterThanOrEqualTo(String value) {
            addCriterion("SECRET_KEY >=", value, "SECRET_KEY");
            return (Criteria) this;
        }

        public Criteria andSECRET_KEYLessThan(String value) {
            addCriterion("SECRET_KEY <", value, "SECRET_KEY");
            return (Criteria) this;
        }

        public Criteria andSECRET_KEYLessThanOrEqualTo(String value) {
            addCriterion("SECRET_KEY <=", value, "SECRET_KEY");
            return (Criteria) this;
        }

        public Criteria andSECRET_KEYLike(String value) {
            addCriterion("SECRET_KEY like", value, "SECRET_KEY");
            return (Criteria) this;
        }

        public Criteria andSECRET_KEYNotLike(String value) {
            addCriterion("SECRET_KEY not like", value, "SECRET_KEY");
            return (Criteria) this;
        }

        public Criteria andSECRET_KEYIn(List<String> values) {
            addCriterion("SECRET_KEY in", values, "SECRET_KEY");
            return (Criteria) this;
        }

        public Criteria andSECRET_KEYNotIn(List<String> values) {
            addCriterion("SECRET_KEY not in", values, "SECRET_KEY");
            return (Criteria) this;
        }

        public Criteria andSECRET_KEYBetween(String value1, String value2) {
            addCriterion("SECRET_KEY between", value1, value2, "SECRET_KEY");
            return (Criteria) this;
        }

        public Criteria andSECRET_KEYNotBetween(String value1, String value2) {
            addCriterion("SECRET_KEY not between", value1, value2, "SECRET_KEY");
            return (Criteria) this;
        }

        public Criteria andSERVER_IPIsNull() {
            addCriterion("SERVER_IP is null");
            return (Criteria) this;
        }

        public Criteria andSERVER_IPIsNotNull() {
            addCriterion("SERVER_IP is not null");
            return (Criteria) this;
        }

        public Criteria andSERVER_IPEqualTo(String value) {
            addCriterion("SERVER_IP =", value, "SERVER_IP");
            return (Criteria) this;
        }

        public Criteria andSERVER_IPNotEqualTo(String value) {
            addCriterion("SERVER_IP <>", value, "SERVER_IP");
            return (Criteria) this;
        }

        public Criteria andSERVER_IPGreaterThan(String value) {
            addCriterion("SERVER_IP >", value, "SERVER_IP");
            return (Criteria) this;
        }

        public Criteria andSERVER_IPGreaterThanOrEqualTo(String value) {
            addCriterion("SERVER_IP >=", value, "SERVER_IP");
            return (Criteria) this;
        }

        public Criteria andSERVER_IPLessThan(String value) {
            addCriterion("SERVER_IP <", value, "SERVER_IP");
            return (Criteria) this;
        }

        public Criteria andSERVER_IPLessThanOrEqualTo(String value) {
            addCriterion("SERVER_IP <=", value, "SERVER_IP");
            return (Criteria) this;
        }

        public Criteria andSERVER_IPLike(String value) {
            addCriterion("SERVER_IP like", value, "SERVER_IP");
            return (Criteria) this;
        }

        public Criteria andSERVER_IPNotLike(String value) {
            addCriterion("SERVER_IP not like", value, "SERVER_IP");
            return (Criteria) this;
        }

        public Criteria andSERVER_IPIn(List<String> values) {
            addCriterion("SERVER_IP in", values, "SERVER_IP");
            return (Criteria) this;
        }

        public Criteria andSERVER_IPNotIn(List<String> values) {
            addCriterion("SERVER_IP not in", values, "SERVER_IP");
            return (Criteria) this;
        }

        public Criteria andSERVER_IPBetween(String value1, String value2) {
            addCriterion("SERVER_IP between", value1, value2, "SERVER_IP");
            return (Criteria) this;
        }

        public Criteria andSERVER_IPNotBetween(String value1, String value2) {
            addCriterion("SERVER_IP not between", value1, value2, "SERVER_IP");
            return (Criteria) this;
        }

        public Criteria andPORTIsNull() {
            addCriterion("PORT is null");
            return (Criteria) this;
        }

        public Criteria andPORTIsNotNull() {
            addCriterion("PORT is not null");
            return (Criteria) this;
        }

        public Criteria andPORTEqualTo(String value) {
            addCriterion("PORT =", value, "PORT");
            return (Criteria) this;
        }

        public Criteria andPORTNotEqualTo(String value) {
            addCriterion("PORT <>", value, "PORT");
            return (Criteria) this;
        }

        public Criteria andPORTGreaterThan(String value) {
            addCriterion("PORT >", value, "PORT");
            return (Criteria) this;
        }

        public Criteria andPORTGreaterThanOrEqualTo(String value) {
            addCriterion("PORT >=", value, "PORT");
            return (Criteria) this;
        }

        public Criteria andPORTLessThan(String value) {
            addCriterion("PORT <", value, "PORT");
            return (Criteria) this;
        }

        public Criteria andPORTLessThanOrEqualTo(String value) {
            addCriterion("PORT <=", value, "PORT");
            return (Criteria) this;
        }

        public Criteria andPORTLike(String value) {
            addCriterion("PORT like", value, "PORT");
            return (Criteria) this;
        }

        public Criteria andPORTNotLike(String value) {
            addCriterion("PORT not like", value, "PORT");
            return (Criteria) this;
        }

        public Criteria andPORTIn(List<String> values) {
            addCriterion("PORT in", values, "PORT");
            return (Criteria) this;
        }

        public Criteria andPORTNotIn(List<String> values) {
            addCriterion("PORT not in", values, "PORT");
            return (Criteria) this;
        }

        public Criteria andPORTBetween(String value1, String value2) {
            addCriterion("PORT between", value1, value2, "PORT");
            return (Criteria) this;
        }

        public Criteria andPORTNotBetween(String value1, String value2) {
            addCriterion("PORT not between", value1, value2, "PORT");
            return (Criteria) this;
        }

        public Criteria andIS_ICIsNull() {
            addCriterion("IS_IC is null");
            return (Criteria) this;
        }

        public Criteria andIS_ICIsNotNull() {
            addCriterion("IS_IC is not null");
            return (Criteria) this;
        }

        public Criteria andIS_ICEqualTo(Boolean value) {
            addCriterion("IS_IC =", value, "IS_IC");
            return (Criteria) this;
        }

        public Criteria andIS_ICNotEqualTo(Boolean value) {
            addCriterion("IS_IC <>", value, "IS_IC");
            return (Criteria) this;
        }

        public Criteria andIS_ICGreaterThan(Boolean value) {
            addCriterion("IS_IC >", value, "IS_IC");
            return (Criteria) this;
        }

        public Criteria andIS_ICGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_IC >=", value, "IS_IC");
            return (Criteria) this;
        }

        public Criteria andIS_ICLessThan(Boolean value) {
            addCriterion("IS_IC <", value, "IS_IC");
            return (Criteria) this;
        }

        public Criteria andIS_ICLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_IC <=", value, "IS_IC");
            return (Criteria) this;
        }

        public Criteria andIS_ICIn(List<Boolean> values) {
            addCriterion("IS_IC in", values, "IS_IC");
            return (Criteria) this;
        }

        public Criteria andIS_ICNotIn(List<Boolean> values) {
            addCriterion("IS_IC not in", values, "IS_IC");
            return (Criteria) this;
        }

        public Criteria andIS_ICBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_IC between", value1, value2, "IS_IC");
            return (Criteria) this;
        }

        public Criteria andIS_ICNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_IC not between", value1, value2, "IS_IC");
            return (Criteria) this;
        }

        public Criteria andIS_PINIsNull() {
            addCriterion("IS_PIN is null");
            return (Criteria) this;
        }

        public Criteria andIS_PINIsNotNull() {
            addCriterion("IS_PIN is not null");
            return (Criteria) this;
        }

        public Criteria andIS_PINEqualTo(Boolean value) {
            addCriterion("IS_PIN =", value, "IS_PIN");
            return (Criteria) this;
        }

        public Criteria andIS_PINNotEqualTo(Boolean value) {
            addCriterion("IS_PIN <>", value, "IS_PIN");
            return (Criteria) this;
        }

        public Criteria andIS_PINGreaterThan(Boolean value) {
            addCriterion("IS_PIN >", value, "IS_PIN");
            return (Criteria) this;
        }

        public Criteria andIS_PINGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_PIN >=", value, "IS_PIN");
            return (Criteria) this;
        }

        public Criteria andIS_PINLessThan(Boolean value) {
            addCriterion("IS_PIN <", value, "IS_PIN");
            return (Criteria) this;
        }

        public Criteria andIS_PINLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_PIN <=", value, "IS_PIN");
            return (Criteria) this;
        }

        public Criteria andIS_PINIn(List<Boolean> values) {
            addCriterion("IS_PIN in", values, "IS_PIN");
            return (Criteria) this;
        }

        public Criteria andIS_PINNotIn(List<Boolean> values) {
            addCriterion("IS_PIN not in", values, "IS_PIN");
            return (Criteria) this;
        }

        public Criteria andIS_PINBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_PIN between", value1, value2, "IS_PIN");
            return (Criteria) this;
        }

        public Criteria andIS_PINNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_PIN not between", value1, value2, "IS_PIN");
            return (Criteria) this;
        }

        public Criteria andIS_FINGERPRINTIsNull() {
            addCriterion("IS_FINGERPRINT is null");
            return (Criteria) this;
        }

        public Criteria andIS_FINGERPRINTIsNotNull() {
            addCriterion("IS_FINGERPRINT is not null");
            return (Criteria) this;
        }

        public Criteria andIS_FINGERPRINTEqualTo(Boolean value) {
            addCriterion("IS_FINGERPRINT =", value, "IS_FINGERPRINT");
            return (Criteria) this;
        }

        public Criteria andIS_FINGERPRINTNotEqualTo(Boolean value) {
            addCriterion("IS_FINGERPRINT <>", value, "IS_FINGERPRINT");
            return (Criteria) this;
        }

        public Criteria andIS_FINGERPRINTGreaterThan(Boolean value) {
            addCriterion("IS_FINGERPRINT >", value, "IS_FINGERPRINT");
            return (Criteria) this;
        }

        public Criteria andIS_FINGERPRINTGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_FINGERPRINT >=", value, "IS_FINGERPRINT");
            return (Criteria) this;
        }

        public Criteria andIS_FINGERPRINTLessThan(Boolean value) {
            addCriterion("IS_FINGERPRINT <", value, "IS_FINGERPRINT");
            return (Criteria) this;
        }

        public Criteria andIS_FINGERPRINTLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_FINGERPRINT <=", value, "IS_FINGERPRINT");
            return (Criteria) this;
        }

        public Criteria andIS_FINGERPRINTIn(List<Boolean> values) {
            addCriterion("IS_FINGERPRINT in", values, "IS_FINGERPRINT");
            return (Criteria) this;
        }

        public Criteria andIS_FINGERPRINTNotIn(List<Boolean> values) {
            addCriterion("IS_FINGERPRINT not in", values, "IS_FINGERPRINT");
            return (Criteria) this;
        }

        public Criteria andIS_FINGERPRINTBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_FINGERPRINT between", value1, value2, "IS_FINGERPRINT");
            return (Criteria) this;
        }

        public Criteria andIS_FINGERPRINTNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_FINGERPRINT not between", value1, value2, "IS_FINGERPRINT");
            return (Criteria) this;
        }

        public Criteria andIS_FACEIsNull() {
            addCriterion("IS_FACE is null");
            return (Criteria) this;
        }

        public Criteria andIS_FACEIsNotNull() {
            addCriterion("IS_FACE is not null");
            return (Criteria) this;
        }

        public Criteria andIS_FACEEqualTo(Boolean value) {
            addCriterion("IS_FACE =", value, "IS_FACE");
            return (Criteria) this;
        }

        public Criteria andIS_FACENotEqualTo(Boolean value) {
            addCriterion("IS_FACE <>", value, "IS_FACE");
            return (Criteria) this;
        }

        public Criteria andIS_FACEGreaterThan(Boolean value) {
            addCriterion("IS_FACE >", value, "IS_FACE");
            return (Criteria) this;
        }

        public Criteria andIS_FACEGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_FACE >=", value, "IS_FACE");
            return (Criteria) this;
        }

        public Criteria andIS_FACELessThan(Boolean value) {
            addCriterion("IS_FACE <", value, "IS_FACE");
            return (Criteria) this;
        }

        public Criteria andIS_FACELessThanOrEqualTo(Boolean value) {
            addCriterion("IS_FACE <=", value, "IS_FACE");
            return (Criteria) this;
        }

        public Criteria andIS_FACEIn(List<Boolean> values) {
            addCriterion("IS_FACE in", values, "IS_FACE");
            return (Criteria) this;
        }

        public Criteria andIS_FACENotIn(List<Boolean> values) {
            addCriterion("IS_FACE not in", values, "IS_FACE");
            return (Criteria) this;
        }

        public Criteria andIS_FACEBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_FACE between", value1, value2, "IS_FACE");
            return (Criteria) this;
        }

        public Criteria andIS_FACENotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_FACE not between", value1, value2, "IS_FACE");
            return (Criteria) this;
        }

        public Criteria andMAX_TIMESIsNull() {
            addCriterion("MAX_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andMAX_TIMESIsNotNull() {
            addCriterion("MAX_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andMAX_TIMESEqualTo(Integer value) {
            addCriterion("MAX_TIMES =", value, "MAX_TIMES");
            return (Criteria) this;
        }

        public Criteria andMAX_TIMESNotEqualTo(Integer value) {
            addCriterion("MAX_TIMES <>", value, "MAX_TIMES");
            return (Criteria) this;
        }

        public Criteria andMAX_TIMESGreaterThan(Integer value) {
            addCriterion("MAX_TIMES >", value, "MAX_TIMES");
            return (Criteria) this;
        }

        public Criteria andMAX_TIMESGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAX_TIMES >=", value, "MAX_TIMES");
            return (Criteria) this;
        }

        public Criteria andMAX_TIMESLessThan(Integer value) {
            addCriterion("MAX_TIMES <", value, "MAX_TIMES");
            return (Criteria) this;
        }

        public Criteria andMAX_TIMESLessThanOrEqualTo(Integer value) {
            addCriterion("MAX_TIMES <=", value, "MAX_TIMES");
            return (Criteria) this;
        }

        public Criteria andMAX_TIMESIn(List<Integer> values) {
            addCriterion("MAX_TIMES in", values, "MAX_TIMES");
            return (Criteria) this;
        }

        public Criteria andMAX_TIMESNotIn(List<Integer> values) {
            addCriterion("MAX_TIMES not in", values, "MAX_TIMES");
            return (Criteria) this;
        }

        public Criteria andMAX_TIMESBetween(Integer value1, Integer value2) {
            addCriterion("MAX_TIMES between", value1, value2, "MAX_TIMES");
            return (Criteria) this;
        }

        public Criteria andMAX_TIMESNotBetween(Integer value1, Integer value2) {
            addCriterion("MAX_TIMES not between", value1, value2, "MAX_TIMES");
            return (Criteria) this;
        }

        public Criteria andREMAIN_TIMESIsNull() {
            addCriterion("REMAIN_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andREMAIN_TIMESIsNotNull() {
            addCriterion("REMAIN_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andREMAIN_TIMESEqualTo(Integer value) {
            addCriterion("REMAIN_TIMES =", value, "REMAIN_TIMES");
            return (Criteria) this;
        }

        public Criteria andREMAIN_TIMESNotEqualTo(Integer value) {
            addCriterion("REMAIN_TIMES <>", value, "REMAIN_TIMES");
            return (Criteria) this;
        }

        public Criteria andREMAIN_TIMESGreaterThan(Integer value) {
            addCriterion("REMAIN_TIMES >", value, "REMAIN_TIMES");
            return (Criteria) this;
        }

        public Criteria andREMAIN_TIMESGreaterThanOrEqualTo(Integer value) {
            addCriterion("REMAIN_TIMES >=", value, "REMAIN_TIMES");
            return (Criteria) this;
        }

        public Criteria andREMAIN_TIMESLessThan(Integer value) {
            addCriterion("REMAIN_TIMES <", value, "REMAIN_TIMES");
            return (Criteria) this;
        }

        public Criteria andREMAIN_TIMESLessThanOrEqualTo(Integer value) {
            addCriterion("REMAIN_TIMES <=", value, "REMAIN_TIMES");
            return (Criteria) this;
        }

        public Criteria andREMAIN_TIMESIn(List<Integer> values) {
            addCriterion("REMAIN_TIMES in", values, "REMAIN_TIMES");
            return (Criteria) this;
        }

        public Criteria andREMAIN_TIMESNotIn(List<Integer> values) {
            addCriterion("REMAIN_TIMES not in", values, "REMAIN_TIMES");
            return (Criteria) this;
        }

        public Criteria andREMAIN_TIMESBetween(Integer value1, Integer value2) {
            addCriterion("REMAIN_TIMES between", value1, value2, "REMAIN_TIMES");
            return (Criteria) this;
        }

        public Criteria andREMAIN_TIMESNotBetween(Integer value1, Integer value2) {
            addCriterion("REMAIN_TIMES not between", value1, value2, "REMAIN_TIMES");
            return (Criteria) this;
        }

        public Criteria andNOW_TIMESIsNull() {
            addCriterion("NOW_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andNOW_TIMESIsNotNull() {
            addCriterion("NOW_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andNOW_TIMESEqualTo(Integer value) {
            addCriterion("NOW_TIMES =", value, "NOW_TIMES");
            return (Criteria) this;
        }

        public Criteria andNOW_TIMESNotEqualTo(Integer value) {
            addCriterion("NOW_TIMES <>", value, "NOW_TIMES");
            return (Criteria) this;
        }

        public Criteria andNOW_TIMESGreaterThan(Integer value) {
            addCriterion("NOW_TIMES >", value, "NOW_TIMES");
            return (Criteria) this;
        }

        public Criteria andNOW_TIMESGreaterThanOrEqualTo(Integer value) {
            addCriterion("NOW_TIMES >=", value, "NOW_TIMES");
            return (Criteria) this;
        }

        public Criteria andNOW_TIMESLessThan(Integer value) {
            addCriterion("NOW_TIMES <", value, "NOW_TIMES");
            return (Criteria) this;
        }

        public Criteria andNOW_TIMESLessThanOrEqualTo(Integer value) {
            addCriterion("NOW_TIMES <=", value, "NOW_TIMES");
            return (Criteria) this;
        }

        public Criteria andNOW_TIMESIn(List<Integer> values) {
            addCriterion("NOW_TIMES in", values, "NOW_TIMES");
            return (Criteria) this;
        }

        public Criteria andNOW_TIMESNotIn(List<Integer> values) {
            addCriterion("NOW_TIMES not in", values, "NOW_TIMES");
            return (Criteria) this;
        }

        public Criteria andNOW_TIMESBetween(Integer value1, Integer value2) {
            addCriterion("NOW_TIMES between", value1, value2, "NOW_TIMES");
            return (Criteria) this;
        }

        public Criteria andNOW_TIMESNotBetween(Integer value1, Integer value2) {
            addCriterion("NOW_TIMES not between", value1, value2, "NOW_TIMES");
            return (Criteria) this;
        }

        public Criteria andLAST_OPEN_TIMEIsNull() {
            addCriterion("LAST_OPEN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLAST_OPEN_TIMEIsNotNull() {
            addCriterion("LAST_OPEN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLAST_OPEN_TIMEEqualTo(Date value) {
            addCriterion("LAST_OPEN_TIME =", value, "LAST_OPEN_TIME");
            return (Criteria) this;
        }

        public Criteria andLAST_OPEN_TIMENotEqualTo(Date value) {
            addCriterion("LAST_OPEN_TIME <>", value, "LAST_OPEN_TIME");
            return (Criteria) this;
        }

        public Criteria andLAST_OPEN_TIMEGreaterThan(Date value) {
            addCriterion("LAST_OPEN_TIME >", value, "LAST_OPEN_TIME");
            return (Criteria) this;
        }

        public Criteria andLAST_OPEN_TIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_OPEN_TIME >=", value, "LAST_OPEN_TIME");
            return (Criteria) this;
        }

        public Criteria andLAST_OPEN_TIMELessThan(Date value) {
            addCriterion("LAST_OPEN_TIME <", value, "LAST_OPEN_TIME");
            return (Criteria) this;
        }

        public Criteria andLAST_OPEN_TIMELessThanOrEqualTo(Date value) {
            addCriterion("LAST_OPEN_TIME <=", value, "LAST_OPEN_TIME");
            return (Criteria) this;
        }

        public Criteria andLAST_OPEN_TIMEIn(List<Date> values) {
            addCriterion("LAST_OPEN_TIME in", values, "LAST_OPEN_TIME");
            return (Criteria) this;
        }

        public Criteria andLAST_OPEN_TIMENotIn(List<Date> values) {
            addCriterion("LAST_OPEN_TIME not in", values, "LAST_OPEN_TIME");
            return (Criteria) this;
        }

        public Criteria andLAST_OPEN_TIMEBetween(Date value1, Date value2) {
            addCriterion("LAST_OPEN_TIME between", value1, value2, "LAST_OPEN_TIME");
            return (Criteria) this;
        }

        public Criteria andLAST_OPEN_TIMENotBetween(Date value1, Date value2) {
            addCriterion("LAST_OPEN_TIME not between", value1, value2, "LAST_OPEN_TIME");
            return (Criteria) this;
        }

        public Criteria andAUTH_USER_NUMIsNull() {
            addCriterion("AUTH_USER_NUM is null");
            return (Criteria) this;
        }

        public Criteria andAUTH_USER_NUMIsNotNull() {
            addCriterion("AUTH_USER_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andAUTH_USER_NUMEqualTo(Integer value) {
            addCriterion("AUTH_USER_NUM =", value, "AUTH_USER_NUM");
            return (Criteria) this;
        }

        public Criteria andAUTH_USER_NUMNotEqualTo(Integer value) {
            addCriterion("AUTH_USER_NUM <>", value, "AUTH_USER_NUM");
            return (Criteria) this;
        }

        public Criteria andAUTH_USER_NUMGreaterThan(Integer value) {
            addCriterion("AUTH_USER_NUM >", value, "AUTH_USER_NUM");
            return (Criteria) this;
        }

        public Criteria andAUTH_USER_NUMGreaterThanOrEqualTo(Integer value) {
            addCriterion("AUTH_USER_NUM >=", value, "AUTH_USER_NUM");
            return (Criteria) this;
        }

        public Criteria andAUTH_USER_NUMLessThan(Integer value) {
            addCriterion("AUTH_USER_NUM <", value, "AUTH_USER_NUM");
            return (Criteria) this;
        }

        public Criteria andAUTH_USER_NUMLessThanOrEqualTo(Integer value) {
            addCriterion("AUTH_USER_NUM <=", value, "AUTH_USER_NUM");
            return (Criteria) this;
        }

        public Criteria andAUTH_USER_NUMIn(List<Integer> values) {
            addCriterion("AUTH_USER_NUM in", values, "AUTH_USER_NUM");
            return (Criteria) this;
        }

        public Criteria andAUTH_USER_NUMNotIn(List<Integer> values) {
            addCriterion("AUTH_USER_NUM not in", values, "AUTH_USER_NUM");
            return (Criteria) this;
        }

        public Criteria andAUTH_USER_NUMBetween(Integer value1, Integer value2) {
            addCriterion("AUTH_USER_NUM between", value1, value2, "AUTH_USER_NUM");
            return (Criteria) this;
        }

        public Criteria andAUTH_USER_NUMNotBetween(Integer value1, Integer value2) {
            addCriterion("AUTH_USER_NUM not between", value1, value2, "AUTH_USER_NUM");
            return (Criteria) this;
        }

        public Criteria andLAST_AUTH_TIMEIsNull() {
            addCriterion("LAST_AUTH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLAST_AUTH_TIMEIsNotNull() {
            addCriterion("LAST_AUTH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLAST_AUTH_TIMEEqualTo(Date value) {
            addCriterion("LAST_AUTH_TIME =", value, "LAST_AUTH_TIME");
            return (Criteria) this;
        }

        public Criteria andLAST_AUTH_TIMENotEqualTo(Date value) {
            addCriterion("LAST_AUTH_TIME <>", value, "LAST_AUTH_TIME");
            return (Criteria) this;
        }

        public Criteria andLAST_AUTH_TIMEGreaterThan(Date value) {
            addCriterion("LAST_AUTH_TIME >", value, "LAST_AUTH_TIME");
            return (Criteria) this;
        }

        public Criteria andLAST_AUTH_TIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_AUTH_TIME >=", value, "LAST_AUTH_TIME");
            return (Criteria) this;
        }

        public Criteria andLAST_AUTH_TIMELessThan(Date value) {
            addCriterion("LAST_AUTH_TIME <", value, "LAST_AUTH_TIME");
            return (Criteria) this;
        }

        public Criteria andLAST_AUTH_TIMELessThanOrEqualTo(Date value) {
            addCriterion("LAST_AUTH_TIME <=", value, "LAST_AUTH_TIME");
            return (Criteria) this;
        }

        public Criteria andLAST_AUTH_TIMEIn(List<Date> values) {
            addCriterion("LAST_AUTH_TIME in", values, "LAST_AUTH_TIME");
            return (Criteria) this;
        }

        public Criteria andLAST_AUTH_TIMENotIn(List<Date> values) {
            addCriterion("LAST_AUTH_TIME not in", values, "LAST_AUTH_TIME");
            return (Criteria) this;
        }

        public Criteria andLAST_AUTH_TIMEBetween(Date value1, Date value2) {
            addCriterion("LAST_AUTH_TIME between", value1, value2, "LAST_AUTH_TIME");
            return (Criteria) this;
        }

        public Criteria andLAST_AUTH_TIMENotBetween(Date value1, Date value2) {
            addCriterion("LAST_AUTH_TIME not between", value1, value2, "LAST_AUTH_TIME");
            return (Criteria) this;
        }

        public Criteria andSPECIAL_PWDIsNull() {
            addCriterion("SPECIAL_PWD is null");
            return (Criteria) this;
        }

        public Criteria andSPECIAL_PWDIsNotNull() {
            addCriterion("SPECIAL_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andSPECIAL_PWDEqualTo(String value) {
            addCriterion("SPECIAL_PWD =", value, "SPECIAL_PWD");
            return (Criteria) this;
        }

        public Criteria andSPECIAL_PWDNotEqualTo(String value) {
            addCriterion("SPECIAL_PWD <>", value, "SPECIAL_PWD");
            return (Criteria) this;
        }

        public Criteria andSPECIAL_PWDGreaterThan(String value) {
            addCriterion("SPECIAL_PWD >", value, "SPECIAL_PWD");
            return (Criteria) this;
        }

        public Criteria andSPECIAL_PWDGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIAL_PWD >=", value, "SPECIAL_PWD");
            return (Criteria) this;
        }

        public Criteria andSPECIAL_PWDLessThan(String value) {
            addCriterion("SPECIAL_PWD <", value, "SPECIAL_PWD");
            return (Criteria) this;
        }

        public Criteria andSPECIAL_PWDLessThanOrEqualTo(String value) {
            addCriterion("SPECIAL_PWD <=", value, "SPECIAL_PWD");
            return (Criteria) this;
        }

        public Criteria andSPECIAL_PWDLike(String value) {
            addCriterion("SPECIAL_PWD like", value, "SPECIAL_PWD");
            return (Criteria) this;
        }

        public Criteria andSPECIAL_PWDNotLike(String value) {
            addCriterion("SPECIAL_PWD not like", value, "SPECIAL_PWD");
            return (Criteria) this;
        }

        public Criteria andSPECIAL_PWDIn(List<String> values) {
            addCriterion("SPECIAL_PWD in", values, "SPECIAL_PWD");
            return (Criteria) this;
        }

        public Criteria andSPECIAL_PWDNotIn(List<String> values) {
            addCriterion("SPECIAL_PWD not in", values, "SPECIAL_PWD");
            return (Criteria) this;
        }

        public Criteria andSPECIAL_PWDBetween(String value1, String value2) {
            addCriterion("SPECIAL_PWD between", value1, value2, "SPECIAL_PWD");
            return (Criteria) this;
        }

        public Criteria andSPECIAL_PWDNotBetween(String value1, String value2) {
            addCriterion("SPECIAL_PWD not between", value1, value2, "SPECIAL_PWD");
            return (Criteria) this;
        }

        public Criteria andSTATUSIsNull() {
            addCriterion("`STATUS` is null");
            return (Criteria) this;
        }

        public Criteria andSTATUSIsNotNull() {
            addCriterion("`STATUS` is not null");
            return (Criteria) this;
        }

        public Criteria andSTATUSEqualTo(String value) {
            addCriterion("`STATUS` =", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotEqualTo(String value) {
            addCriterion("`STATUS` <>", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSGreaterThan(String value) {
            addCriterion("`STATUS` >", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSGreaterThanOrEqualTo(String value) {
            addCriterion("`STATUS` >=", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSLessThan(String value) {
            addCriterion("`STATUS` <", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSLessThanOrEqualTo(String value) {
            addCriterion("`STATUS` <=", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSLike(String value) {
            addCriterion("`STATUS` like", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotLike(String value) {
            addCriterion("`STATUS` not like", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSIn(List<String> values) {
            addCriterion("`STATUS` in", values, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotIn(List<String> values) {
            addCriterion("`STATUS` not in", values, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSBetween(String value1, String value2) {
            addCriterion("`STATUS` between", value1, value2, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotBetween(String value1, String value2) {
            addCriterion("`STATUS` not between", value1, value2, "STATUS");
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

        public Criteria andUPDATERIsNull() {
            addCriterion("UPDATER is null");
            return (Criteria) this;
        }

        public Criteria andUPDATERIsNotNull() {
            addCriterion("UPDATER is not null");
            return (Criteria) this;
        }

        public Criteria andUPDATEREqualTo(String value) {
            addCriterion("UPDATER =", value, "UPDATER");
            return (Criteria) this;
        }

        public Criteria andUPDATERNotEqualTo(String value) {
            addCriterion("UPDATER <>", value, "UPDATER");
            return (Criteria) this;
        }

        public Criteria andUPDATERGreaterThan(String value) {
            addCriterion("UPDATER >", value, "UPDATER");
            return (Criteria) this;
        }

        public Criteria andUPDATERGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATER >=", value, "UPDATER");
            return (Criteria) this;
        }

        public Criteria andUPDATERLessThan(String value) {
            addCriterion("UPDATER <", value, "UPDATER");
            return (Criteria) this;
        }

        public Criteria andUPDATERLessThanOrEqualTo(String value) {
            addCriterion("UPDATER <=", value, "UPDATER");
            return (Criteria) this;
        }

        public Criteria andUPDATERLike(String value) {
            addCriterion("UPDATER like", value, "UPDATER");
            return (Criteria) this;
        }

        public Criteria andUPDATERNotLike(String value) {
            addCriterion("UPDATER not like", value, "UPDATER");
            return (Criteria) this;
        }

        public Criteria andUPDATERIn(List<String> values) {
            addCriterion("UPDATER in", values, "UPDATER");
            return (Criteria) this;
        }

        public Criteria andUPDATERNotIn(List<String> values) {
            addCriterion("UPDATER not in", values, "UPDATER");
            return (Criteria) this;
        }

        public Criteria andUPDATERBetween(String value1, String value2) {
            addCriterion("UPDATER between", value1, value2, "UPDATER");
            return (Criteria) this;
        }

        public Criteria andUPDATERNotBetween(String value1, String value2) {
            addCriterion("UPDATER not between", value1, value2, "UPDATER");
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

        public Criteria andREMARKIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andREMARKIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andREMARKEqualTo(String value) {
            addCriterion("REMARK =", value, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKGreaterThan(String value) {
            addCriterion("REMARK >", value, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKLessThan(String value) {
            addCriterion("REMARK <", value, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKLike(String value) {
            addCriterion("REMARK like", value, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKNotLike(String value) {
            addCriterion("REMARK not like", value, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKIn(List<String> values) {
            addCriterion("REMARK in", values, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "REMARK");
            return (Criteria) this;
        }

        public Criteria andPRE_DETECTION_TIMEIsNull() {
            addCriterion("PRE_DETECTION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPRE_DETECTION_TIMEIsNotNull() {
            addCriterion("PRE_DETECTION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPRE_DETECTION_TIMEEqualTo(Date value) {
            addCriterion("PRE_DETECTION_TIME =", value, "PRE_DETECTION_TIME");
            return (Criteria) this;
        }

        public Criteria andPRE_DETECTION_TIMENotEqualTo(Date value) {
            addCriterion("PRE_DETECTION_TIME <>", value, "PRE_DETECTION_TIME");
            return (Criteria) this;
        }

        public Criteria andPRE_DETECTION_TIMEGreaterThan(Date value) {
            addCriterion("PRE_DETECTION_TIME >", value, "PRE_DETECTION_TIME");
            return (Criteria) this;
        }

        public Criteria andPRE_DETECTION_TIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("PRE_DETECTION_TIME >=", value, "PRE_DETECTION_TIME");
            return (Criteria) this;
        }

        public Criteria andPRE_DETECTION_TIMELessThan(Date value) {
            addCriterion("PRE_DETECTION_TIME <", value, "PRE_DETECTION_TIME");
            return (Criteria) this;
        }

        public Criteria andPRE_DETECTION_TIMELessThanOrEqualTo(Date value) {
            addCriterion("PRE_DETECTION_TIME <=", value, "PRE_DETECTION_TIME");
            return (Criteria) this;
        }

        public Criteria andPRE_DETECTION_TIMEIn(List<Date> values) {
            addCriterion("PRE_DETECTION_TIME in", values, "PRE_DETECTION_TIME");
            return (Criteria) this;
        }

        public Criteria andPRE_DETECTION_TIMENotIn(List<Date> values) {
            addCriterion("PRE_DETECTION_TIME not in", values, "PRE_DETECTION_TIME");
            return (Criteria) this;
        }

        public Criteria andPRE_DETECTION_TIMEBetween(Date value1, Date value2) {
            addCriterion("PRE_DETECTION_TIME between", value1, value2, "PRE_DETECTION_TIME");
            return (Criteria) this;
        }

        public Criteria andPRE_DETECTION_TIMENotBetween(Date value1, Date value2) {
            addCriterion("PRE_DETECTION_TIME not between", value1, value2, "PRE_DETECTION_TIME");
            return (Criteria) this;
        }

        public Criteria andNEXT_DETECTION_TIMEIsNull() {
            addCriterion("NEXT_DETECTION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andNEXT_DETECTION_TIMEIsNotNull() {
            addCriterion("NEXT_DETECTION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andNEXT_DETECTION_TIMEEqualTo(Date value) {
            addCriterion("NEXT_DETECTION_TIME =", value, "NEXT_DETECTION_TIME");
            return (Criteria) this;
        }

        public Criteria andNEXT_DETECTION_TIMENotEqualTo(Date value) {
            addCriterion("NEXT_DETECTION_TIME <>", value, "NEXT_DETECTION_TIME");
            return (Criteria) this;
        }

        public Criteria andNEXT_DETECTION_TIMEGreaterThan(Date value) {
            addCriterion("NEXT_DETECTION_TIME >", value, "NEXT_DETECTION_TIME");
            return (Criteria) this;
        }

        public Criteria andNEXT_DETECTION_TIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("NEXT_DETECTION_TIME >=", value, "NEXT_DETECTION_TIME");
            return (Criteria) this;
        }

        public Criteria andNEXT_DETECTION_TIMELessThan(Date value) {
            addCriterion("NEXT_DETECTION_TIME <", value, "NEXT_DETECTION_TIME");
            return (Criteria) this;
        }

        public Criteria andNEXT_DETECTION_TIMELessThanOrEqualTo(Date value) {
            addCriterion("NEXT_DETECTION_TIME <=", value, "NEXT_DETECTION_TIME");
            return (Criteria) this;
        }

        public Criteria andNEXT_DETECTION_TIMEIn(List<Date> values) {
            addCriterion("NEXT_DETECTION_TIME in", values, "NEXT_DETECTION_TIME");
            return (Criteria) this;
        }

        public Criteria andNEXT_DETECTION_TIMENotIn(List<Date> values) {
            addCriterion("NEXT_DETECTION_TIME not in", values, "NEXT_DETECTION_TIME");
            return (Criteria) this;
        }

        public Criteria andNEXT_DETECTION_TIMEBetween(Date value1, Date value2) {
            addCriterion("NEXT_DETECTION_TIME between", value1, value2, "NEXT_DETECTION_TIME");
            return (Criteria) this;
        }

        public Criteria andNEXT_DETECTION_TIMENotBetween(Date value1, Date value2) {
            addCriterion("NEXT_DETECTION_TIME not between", value1, value2, "NEXT_DETECTION_TIME");
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
