package cn.zciel.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TpoLockOpenLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public TpoLockOpenLogExample() {
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

        public Criteria andTYPEIsNull() {
            addCriterion("`TYPE` is null");
            return (Criteria) this;
        }

        public Criteria andTYPEIsNotNull() {
            addCriterion("`TYPE` is not null");
            return (Criteria) this;
        }

        public Criteria andTYPEEqualTo(String value) {
            addCriterion("`TYPE` =", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPENotEqualTo(String value) {
            addCriterion("`TYPE` <>", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPEGreaterThan(String value) {
            addCriterion("`TYPE` >", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPEGreaterThanOrEqualTo(String value) {
            addCriterion("`TYPE` >=", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPELessThan(String value) {
            addCriterion("`TYPE` <", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPELessThanOrEqualTo(String value) {
            addCriterion("`TYPE` <=", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPELike(String value) {
            addCriterion("`TYPE` like", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPENotLike(String value) {
            addCriterion("`TYPE` not like", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPEIn(List<String> values) {
            addCriterion("`TYPE` in", values, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPENotIn(List<String> values) {
            addCriterion("`TYPE` not in", values, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPEBetween(String value1, String value2) {
            addCriterion("`TYPE` between", value1, value2, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPENotBetween(String value1, String value2) {
            addCriterion("`TYPE` not between", value1, value2, "TYPE");
            return (Criteria) this;
        }

        public Criteria andUSER_IDIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUSER_IDIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUSER_IDEqualTo(String value) {
            addCriterion("USER_ID =", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDGreaterThan(String value) {
            addCriterion("USER_ID >", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDLessThan(String value) {
            addCriterion("USER_ID <", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDLike(String value) {
            addCriterion("USER_ID like", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDNotLike(String value) {
            addCriterion("USER_ID not like", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDIn(List<String> values) {
            addCriterion("USER_ID in", values, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andKEY_IDIsNull() {
            addCriterion("KEY_ID is null");
            return (Criteria) this;
        }

        public Criteria andKEY_IDIsNotNull() {
            addCriterion("KEY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andKEY_IDEqualTo(String value) {
            addCriterion("KEY_ID =", value, "KEY_ID");
            return (Criteria) this;
        }

        public Criteria andKEY_IDNotEqualTo(String value) {
            addCriterion("KEY_ID <>", value, "KEY_ID");
            return (Criteria) this;
        }

        public Criteria andKEY_IDGreaterThan(String value) {
            addCriterion("KEY_ID >", value, "KEY_ID");
            return (Criteria) this;
        }

        public Criteria andKEY_IDGreaterThanOrEqualTo(String value) {
            addCriterion("KEY_ID >=", value, "KEY_ID");
            return (Criteria) this;
        }

        public Criteria andKEY_IDLessThan(String value) {
            addCriterion("KEY_ID <", value, "KEY_ID");
            return (Criteria) this;
        }

        public Criteria andKEY_IDLessThanOrEqualTo(String value) {
            addCriterion("KEY_ID <=", value, "KEY_ID");
            return (Criteria) this;
        }

        public Criteria andKEY_IDLike(String value) {
            addCriterion("KEY_ID like", value, "KEY_ID");
            return (Criteria) this;
        }

        public Criteria andKEY_IDNotLike(String value) {
            addCriterion("KEY_ID not like", value, "KEY_ID");
            return (Criteria) this;
        }

        public Criteria andKEY_IDIn(List<String> values) {
            addCriterion("KEY_ID in", values, "KEY_ID");
            return (Criteria) this;
        }

        public Criteria andKEY_IDNotIn(List<String> values) {
            addCriterion("KEY_ID not in", values, "KEY_ID");
            return (Criteria) this;
        }

        public Criteria andKEY_IDBetween(String value1, String value2) {
            addCriterion("KEY_ID between", value1, value2, "KEY_ID");
            return (Criteria) this;
        }

        public Criteria andKEY_IDNotBetween(String value1, String value2) {
            addCriterion("KEY_ID not between", value1, value2, "KEY_ID");
            return (Criteria) this;
        }

        public Criteria andLOCK_IDIsNull() {
            addCriterion("LOCK_ID is null");
            return (Criteria) this;
        }

        public Criteria andLOCK_IDIsNotNull() {
            addCriterion("LOCK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLOCK_IDEqualTo(String value) {
            addCriterion("LOCK_ID =", value, "LOCK_ID");
            return (Criteria) this;
        }

        public Criteria andLOCK_IDNotEqualTo(String value) {
            addCriterion("LOCK_ID <>", value, "LOCK_ID");
            return (Criteria) this;
        }

        public Criteria andLOCK_IDGreaterThan(String value) {
            addCriterion("LOCK_ID >", value, "LOCK_ID");
            return (Criteria) this;
        }

        public Criteria andLOCK_IDGreaterThanOrEqualTo(String value) {
            addCriterion("LOCK_ID >=", value, "LOCK_ID");
            return (Criteria) this;
        }

        public Criteria andLOCK_IDLessThan(String value) {
            addCriterion("LOCK_ID <", value, "LOCK_ID");
            return (Criteria) this;
        }

        public Criteria andLOCK_IDLessThanOrEqualTo(String value) {
            addCriterion("LOCK_ID <=", value, "LOCK_ID");
            return (Criteria) this;
        }

        public Criteria andLOCK_IDLike(String value) {
            addCriterion("LOCK_ID like", value, "LOCK_ID");
            return (Criteria) this;
        }

        public Criteria andLOCK_IDNotLike(String value) {
            addCriterion("LOCK_ID not like", value, "LOCK_ID");
            return (Criteria) this;
        }

        public Criteria andLOCK_IDIn(List<String> values) {
            addCriterion("LOCK_ID in", values, "LOCK_ID");
            return (Criteria) this;
        }

        public Criteria andLOCK_IDNotIn(List<String> values) {
            addCriterion("LOCK_ID not in", values, "LOCK_ID");
            return (Criteria) this;
        }

        public Criteria andLOCK_IDBetween(String value1, String value2) {
            addCriterion("LOCK_ID between", value1, value2, "LOCK_ID");
            return (Criteria) this;
        }

        public Criteria andLOCK_IDNotBetween(String value1, String value2) {
            addCriterion("LOCK_ID not between", value1, value2, "LOCK_ID");
            return (Criteria) this;
        }

        public Criteria andUNLOCK_MODEIsNull() {
            addCriterion("UNLOCK_MODE is null");
            return (Criteria) this;
        }

        public Criteria andUNLOCK_MODEIsNotNull() {
            addCriterion("UNLOCK_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andUNLOCK_MODEEqualTo(String value) {
            addCriterion("UNLOCK_MODE =", value, "UNLOCK_MODE");
            return (Criteria) this;
        }

        public Criteria andUNLOCK_MODENotEqualTo(String value) {
            addCriterion("UNLOCK_MODE <>", value, "UNLOCK_MODE");
            return (Criteria) this;
        }

        public Criteria andUNLOCK_MODEGreaterThan(String value) {
            addCriterion("UNLOCK_MODE >", value, "UNLOCK_MODE");
            return (Criteria) this;
        }

        public Criteria andUNLOCK_MODEGreaterThanOrEqualTo(String value) {
            addCriterion("UNLOCK_MODE >=", value, "UNLOCK_MODE");
            return (Criteria) this;
        }

        public Criteria andUNLOCK_MODELessThan(String value) {
            addCriterion("UNLOCK_MODE <", value, "UNLOCK_MODE");
            return (Criteria) this;
        }

        public Criteria andUNLOCK_MODELessThanOrEqualTo(String value) {
            addCriterion("UNLOCK_MODE <=", value, "UNLOCK_MODE");
            return (Criteria) this;
        }

        public Criteria andUNLOCK_MODELike(String value) {
            addCriterion("UNLOCK_MODE like", value, "UNLOCK_MODE");
            return (Criteria) this;
        }

        public Criteria andUNLOCK_MODENotLike(String value) {
            addCriterion("UNLOCK_MODE not like", value, "UNLOCK_MODE");
            return (Criteria) this;
        }

        public Criteria andUNLOCK_MODEIn(List<String> values) {
            addCriterion("UNLOCK_MODE in", values, "UNLOCK_MODE");
            return (Criteria) this;
        }

        public Criteria andUNLOCK_MODENotIn(List<String> values) {
            addCriterion("UNLOCK_MODE not in", values, "UNLOCK_MODE");
            return (Criteria) this;
        }

        public Criteria andUNLOCK_MODEBetween(String value1, String value2) {
            addCriterion("UNLOCK_MODE between", value1, value2, "UNLOCK_MODE");
            return (Criteria) this;
        }

        public Criteria andUNLOCK_MODENotBetween(String value1, String value2) {
            addCriterion("UNLOCK_MODE not between", value1, value2, "UNLOCK_MODE");
            return (Criteria) this;
        }

        public Criteria andUNLOCK_TIMEIsNull() {
            addCriterion("UNLOCK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUNLOCK_TIMEIsNotNull() {
            addCriterion("UNLOCK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUNLOCK_TIMEEqualTo(Date value) {
            addCriterion("UNLOCK_TIME =", value, "UNLOCK_TIME");
            return (Criteria) this;
        }

        public Criteria andUNLOCK_TIMENotEqualTo(Date value) {
            addCriterion("UNLOCK_TIME <>", value, "UNLOCK_TIME");
            return (Criteria) this;
        }

        public Criteria andUNLOCK_TIMEGreaterThan(Date value) {
            addCriterion("UNLOCK_TIME >", value, "UNLOCK_TIME");
            return (Criteria) this;
        }

        public Criteria andUNLOCK_TIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("UNLOCK_TIME >=", value, "UNLOCK_TIME");
            return (Criteria) this;
        }

        public Criteria andUNLOCK_TIMELessThan(Date value) {
            addCriterion("UNLOCK_TIME <", value, "UNLOCK_TIME");
            return (Criteria) this;
        }

        public Criteria andUNLOCK_TIMELessThanOrEqualTo(Date value) {
            addCriterion("UNLOCK_TIME <=", value, "UNLOCK_TIME");
            return (Criteria) this;
        }

        public Criteria andUNLOCK_TIMEIn(List<Date> values) {
            addCriterion("UNLOCK_TIME in", values, "UNLOCK_TIME");
            return (Criteria) this;
        }

        public Criteria andUNLOCK_TIMENotIn(List<Date> values) {
            addCriterion("UNLOCK_TIME not in", values, "UNLOCK_TIME");
            return (Criteria) this;
        }

        public Criteria andUNLOCK_TIMEBetween(Date value1, Date value2) {
            addCriterion("UNLOCK_TIME between", value1, value2, "UNLOCK_TIME");
            return (Criteria) this;
        }

        public Criteria andUNLOCK_TIMENotBetween(Date value1, Date value2) {
            addCriterion("UNLOCK_TIME not between", value1, value2, "UNLOCK_TIME");
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

        public Criteria andUPLOAD_TIMEIsNull() {
            addCriterion("UPLOAD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUPLOAD_TIMEIsNotNull() {
            addCriterion("UPLOAD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUPLOAD_TIMEEqualTo(Date value) {
            addCriterion("UPLOAD_TIME =", value, "UPLOAD_TIME");
            return (Criteria) this;
        }

        public Criteria andUPLOAD_TIMENotEqualTo(Date value) {
            addCriterion("UPLOAD_TIME <>", value, "UPLOAD_TIME");
            return (Criteria) this;
        }

        public Criteria andUPLOAD_TIMEGreaterThan(Date value) {
            addCriterion("UPLOAD_TIME >", value, "UPLOAD_TIME");
            return (Criteria) this;
        }

        public Criteria andUPLOAD_TIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("UPLOAD_TIME >=", value, "UPLOAD_TIME");
            return (Criteria) this;
        }

        public Criteria andUPLOAD_TIMELessThan(Date value) {
            addCriterion("UPLOAD_TIME <", value, "UPLOAD_TIME");
            return (Criteria) this;
        }

        public Criteria andUPLOAD_TIMELessThanOrEqualTo(Date value) {
            addCriterion("UPLOAD_TIME <=", value, "UPLOAD_TIME");
            return (Criteria) this;
        }

        public Criteria andUPLOAD_TIMEIn(List<Date> values) {
            addCriterion("UPLOAD_TIME in", values, "UPLOAD_TIME");
            return (Criteria) this;
        }

        public Criteria andUPLOAD_TIMENotIn(List<Date> values) {
            addCriterion("UPLOAD_TIME not in", values, "UPLOAD_TIME");
            return (Criteria) this;
        }

        public Criteria andUPLOAD_TIMEBetween(Date value1, Date value2) {
            addCriterion("UPLOAD_TIME between", value1, value2, "UPLOAD_TIME");
            return (Criteria) this;
        }

        public Criteria andUPLOAD_TIMENotBetween(Date value1, Date value2) {
            addCriterion("UPLOAD_TIME not between", value1, value2, "UPLOAD_TIME");
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
