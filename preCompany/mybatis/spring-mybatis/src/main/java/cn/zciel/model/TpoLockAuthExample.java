package cn.zciel.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TpoLockAuthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public TpoLockAuthExample() {
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

        public Criteria andIS_PIN_CODEIsNull() {
            addCriterion("IS_PIN_CODE is null");
            return (Criteria) this;
        }

        public Criteria andIS_PIN_CODEIsNotNull() {
            addCriterion("IS_PIN_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andIS_PIN_CODEEqualTo(String value) {
            addCriterion("IS_PIN_CODE =", value, "IS_PIN_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_PIN_CODENotEqualTo(String value) {
            addCriterion("IS_PIN_CODE <>", value, "IS_PIN_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_PIN_CODEGreaterThan(String value) {
            addCriterion("IS_PIN_CODE >", value, "IS_PIN_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_PIN_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("IS_PIN_CODE >=", value, "IS_PIN_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_PIN_CODELessThan(String value) {
            addCriterion("IS_PIN_CODE <", value, "IS_PIN_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_PIN_CODELessThanOrEqualTo(String value) {
            addCriterion("IS_PIN_CODE <=", value, "IS_PIN_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_PIN_CODELike(String value) {
            addCriterion("IS_PIN_CODE like", value, "IS_PIN_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_PIN_CODENotLike(String value) {
            addCriterion("IS_PIN_CODE not like", value, "IS_PIN_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_PIN_CODEIn(List<String> values) {
            addCriterion("IS_PIN_CODE in", values, "IS_PIN_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_PIN_CODENotIn(List<String> values) {
            addCriterion("IS_PIN_CODE not in", values, "IS_PIN_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_PIN_CODEBetween(String value1, String value2) {
            addCriterion("IS_PIN_CODE between", value1, value2, "IS_PIN_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_PIN_CODENotBetween(String value1, String value2) {
            addCriterion("IS_PIN_CODE not between", value1, value2, "IS_PIN_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_IC_CARDIsNull() {
            addCriterion("IS_IC_CARD is null");
            return (Criteria) this;
        }

        public Criteria andIS_IC_CARDIsNotNull() {
            addCriterion("IS_IC_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andIS_IC_CARDEqualTo(String value) {
            addCriterion("IS_IC_CARD =", value, "IS_IC_CARD");
            return (Criteria) this;
        }

        public Criteria andIS_IC_CARDNotEqualTo(String value) {
            addCriterion("IS_IC_CARD <>", value, "IS_IC_CARD");
            return (Criteria) this;
        }

        public Criteria andIS_IC_CARDGreaterThan(String value) {
            addCriterion("IS_IC_CARD >", value, "IS_IC_CARD");
            return (Criteria) this;
        }

        public Criteria andIS_IC_CARDGreaterThanOrEqualTo(String value) {
            addCriterion("IS_IC_CARD >=", value, "IS_IC_CARD");
            return (Criteria) this;
        }

        public Criteria andIS_IC_CARDLessThan(String value) {
            addCriterion("IS_IC_CARD <", value, "IS_IC_CARD");
            return (Criteria) this;
        }

        public Criteria andIS_IC_CARDLessThanOrEqualTo(String value) {
            addCriterion("IS_IC_CARD <=", value, "IS_IC_CARD");
            return (Criteria) this;
        }

        public Criteria andIS_IC_CARDLike(String value) {
            addCriterion("IS_IC_CARD like", value, "IS_IC_CARD");
            return (Criteria) this;
        }

        public Criteria andIS_IC_CARDNotLike(String value) {
            addCriterion("IS_IC_CARD not like", value, "IS_IC_CARD");
            return (Criteria) this;
        }

        public Criteria andIS_IC_CARDIn(List<String> values) {
            addCriterion("IS_IC_CARD in", values, "IS_IC_CARD");
            return (Criteria) this;
        }

        public Criteria andIS_IC_CARDNotIn(List<String> values) {
            addCriterion("IS_IC_CARD not in", values, "IS_IC_CARD");
            return (Criteria) this;
        }

        public Criteria andIS_IC_CARDBetween(String value1, String value2) {
            addCriterion("IS_IC_CARD between", value1, value2, "IS_IC_CARD");
            return (Criteria) this;
        }

        public Criteria andIS_IC_CARDNotBetween(String value1, String value2) {
            addCriterion("IS_IC_CARD not between", value1, value2, "IS_IC_CARD");
            return (Criteria) this;
        }

        public Criteria andIS_ID_CODEIsNull() {
            addCriterion("IS_ID_CODE is null");
            return (Criteria) this;
        }

        public Criteria andIS_ID_CODEIsNotNull() {
            addCriterion("IS_ID_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andIS_ID_CODEEqualTo(String value) {
            addCriterion("IS_ID_CODE =", value, "IS_ID_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_ID_CODENotEqualTo(String value) {
            addCriterion("IS_ID_CODE <>", value, "IS_ID_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_ID_CODEGreaterThan(String value) {
            addCriterion("IS_ID_CODE >", value, "IS_ID_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_ID_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ID_CODE >=", value, "IS_ID_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_ID_CODELessThan(String value) {
            addCriterion("IS_ID_CODE <", value, "IS_ID_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_ID_CODELessThanOrEqualTo(String value) {
            addCriterion("IS_ID_CODE <=", value, "IS_ID_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_ID_CODELike(String value) {
            addCriterion("IS_ID_CODE like", value, "IS_ID_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_ID_CODENotLike(String value) {
            addCriterion("IS_ID_CODE not like", value, "IS_ID_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_ID_CODEIn(List<String> values) {
            addCriterion("IS_ID_CODE in", values, "IS_ID_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_ID_CODENotIn(List<String> values) {
            addCriterion("IS_ID_CODE not in", values, "IS_ID_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_ID_CODEBetween(String value1, String value2) {
            addCriterion("IS_ID_CODE between", value1, value2, "IS_ID_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_ID_CODENotBetween(String value1, String value2) {
            addCriterion("IS_ID_CODE not between", value1, value2, "IS_ID_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_FINGERPRINT_CODEIsNull() {
            addCriterion("IS_FINGERPRINT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andIS_FINGERPRINT_CODEIsNotNull() {
            addCriterion("IS_FINGERPRINT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andIS_FINGERPRINT_CODEEqualTo(String value) {
            addCriterion("IS_FINGERPRINT_CODE =", value, "IS_FINGERPRINT_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_FINGERPRINT_CODENotEqualTo(String value) {
            addCriterion("IS_FINGERPRINT_CODE <>", value, "IS_FINGERPRINT_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_FINGERPRINT_CODEGreaterThan(String value) {
            addCriterion("IS_FINGERPRINT_CODE >", value, "IS_FINGERPRINT_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_FINGERPRINT_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("IS_FINGERPRINT_CODE >=", value, "IS_FINGERPRINT_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_FINGERPRINT_CODELessThan(String value) {
            addCriterion("IS_FINGERPRINT_CODE <", value, "IS_FINGERPRINT_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_FINGERPRINT_CODELessThanOrEqualTo(String value) {
            addCriterion("IS_FINGERPRINT_CODE <=", value, "IS_FINGERPRINT_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_FINGERPRINT_CODELike(String value) {
            addCriterion("IS_FINGERPRINT_CODE like", value, "IS_FINGERPRINT_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_FINGERPRINT_CODENotLike(String value) {
            addCriterion("IS_FINGERPRINT_CODE not like", value, "IS_FINGERPRINT_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_FINGERPRINT_CODEIn(List<String> values) {
            addCriterion("IS_FINGERPRINT_CODE in", values, "IS_FINGERPRINT_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_FINGERPRINT_CODENotIn(List<String> values) {
            addCriterion("IS_FINGERPRINT_CODE not in", values, "IS_FINGERPRINT_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_FINGERPRINT_CODEBetween(String value1, String value2) {
            addCriterion("IS_FINGERPRINT_CODE between", value1, value2, "IS_FINGERPRINT_CODE");
            return (Criteria) this;
        }

        public Criteria andIS_FINGERPRINT_CODENotBetween(String value1, String value2) {
            addCriterion("IS_FINGERPRINT_CODE not between", value1, value2, "IS_FINGERPRINT_CODE");
            return (Criteria) this;
        }

        public Criteria andSTART_TIMEIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSTART_TIMEIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSTART_TIMEEqualTo(Date value) {
            addCriterion("START_TIME =", value, "START_TIME");
            return (Criteria) this;
        }

        public Criteria andSTART_TIMENotEqualTo(Date value) {
            addCriterion("START_TIME <>", value, "START_TIME");
            return (Criteria) this;
        }

        public Criteria andSTART_TIMEGreaterThan(Date value) {
            addCriterion("START_TIME >", value, "START_TIME");
            return (Criteria) this;
        }

        public Criteria andSTART_TIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("START_TIME >=", value, "START_TIME");
            return (Criteria) this;
        }

        public Criteria andSTART_TIMELessThan(Date value) {
            addCriterion("START_TIME <", value, "START_TIME");
            return (Criteria) this;
        }

        public Criteria andSTART_TIMELessThanOrEqualTo(Date value) {
            addCriterion("START_TIME <=", value, "START_TIME");
            return (Criteria) this;
        }

        public Criteria andSTART_TIMEIn(List<Date> values) {
            addCriterion("START_TIME in", values, "START_TIME");
            return (Criteria) this;
        }

        public Criteria andSTART_TIMENotIn(List<Date> values) {
            addCriterion("START_TIME not in", values, "START_TIME");
            return (Criteria) this;
        }

        public Criteria andSTART_TIMEBetween(Date value1, Date value2) {
            addCriterion("START_TIME between", value1, value2, "START_TIME");
            return (Criteria) this;
        }

        public Criteria andSTART_TIMENotBetween(Date value1, Date value2) {
            addCriterion("START_TIME not between", value1, value2, "START_TIME");
            return (Criteria) this;
        }

        public Criteria andEND_TIMEIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEND_TIMEIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEND_TIMEEqualTo(Date value) {
            addCriterion("END_TIME =", value, "END_TIME");
            return (Criteria) this;
        }

        public Criteria andEND_TIMENotEqualTo(Date value) {
            addCriterion("END_TIME <>", value, "END_TIME");
            return (Criteria) this;
        }

        public Criteria andEND_TIMEGreaterThan(Date value) {
            addCriterion("END_TIME >", value, "END_TIME");
            return (Criteria) this;
        }

        public Criteria andEND_TIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("END_TIME >=", value, "END_TIME");
            return (Criteria) this;
        }

        public Criteria andEND_TIMELessThan(Date value) {
            addCriterion("END_TIME <", value, "END_TIME");
            return (Criteria) this;
        }

        public Criteria andEND_TIMELessThanOrEqualTo(Date value) {
            addCriterion("END_TIME <=", value, "END_TIME");
            return (Criteria) this;
        }

        public Criteria andEND_TIMEIn(List<Date> values) {
            addCriterion("END_TIME in", values, "END_TIME");
            return (Criteria) this;
        }

        public Criteria andEND_TIMENotIn(List<Date> values) {
            addCriterion("END_TIME not in", values, "END_TIME");
            return (Criteria) this;
        }

        public Criteria andEND_TIMEBetween(Date value1, Date value2) {
            addCriterion("END_TIME between", value1, value2, "END_TIME");
            return (Criteria) this;
        }

        public Criteria andEND_TIMENotBetween(Date value1, Date value2) {
            addCriterion("END_TIME not between", value1, value2, "END_TIME");
            return (Criteria) this;
        }

        public Criteria andFREQUENCYIsNull() {
            addCriterion("FREQUENCY is null");
            return (Criteria) this;
        }

        public Criteria andFREQUENCYIsNotNull() {
            addCriterion("FREQUENCY is not null");
            return (Criteria) this;
        }

        public Criteria andFREQUENCYEqualTo(Integer value) {
            addCriterion("FREQUENCY =", value, "FREQUENCY");
            return (Criteria) this;
        }

        public Criteria andFREQUENCYNotEqualTo(Integer value) {
            addCriterion("FREQUENCY <>", value, "FREQUENCY");
            return (Criteria) this;
        }

        public Criteria andFREQUENCYGreaterThan(Integer value) {
            addCriterion("FREQUENCY >", value, "FREQUENCY");
            return (Criteria) this;
        }

        public Criteria andFREQUENCYGreaterThanOrEqualTo(Integer value) {
            addCriterion("FREQUENCY >=", value, "FREQUENCY");
            return (Criteria) this;
        }

        public Criteria andFREQUENCYLessThan(Integer value) {
            addCriterion("FREQUENCY <", value, "FREQUENCY");
            return (Criteria) this;
        }

        public Criteria andFREQUENCYLessThanOrEqualTo(Integer value) {
            addCriterion("FREQUENCY <=", value, "FREQUENCY");
            return (Criteria) this;
        }

        public Criteria andFREQUENCYIn(List<Integer> values) {
            addCriterion("FREQUENCY in", values, "FREQUENCY");
            return (Criteria) this;
        }

        public Criteria andFREQUENCYNotIn(List<Integer> values) {
            addCriterion("FREQUENCY not in", values, "FREQUENCY");
            return (Criteria) this;
        }

        public Criteria andFREQUENCYBetween(Integer value1, Integer value2) {
            addCriterion("FREQUENCY between", value1, value2, "FREQUENCY");
            return (Criteria) this;
        }

        public Criteria andFREQUENCYNotBetween(Integer value1, Integer value2) {
            addCriterion("FREQUENCY not between", value1, value2, "FREQUENCY");
            return (Criteria) this;
        }

        public Criteria andFREQUENCY_MODEIsNull() {
            addCriterion("FREQUENCY_MODE is null");
            return (Criteria) this;
        }

        public Criteria andFREQUENCY_MODEIsNotNull() {
            addCriterion("FREQUENCY_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andFREQUENCY_MODEEqualTo(Integer value) {
            addCriterion("FREQUENCY_MODE =", value, "FREQUENCY_MODE");
            return (Criteria) this;
        }

        public Criteria andFREQUENCY_MODENotEqualTo(Integer value) {
            addCriterion("FREQUENCY_MODE <>", value, "FREQUENCY_MODE");
            return (Criteria) this;
        }

        public Criteria andFREQUENCY_MODEGreaterThan(Integer value) {
            addCriterion("FREQUENCY_MODE >", value, "FREQUENCY_MODE");
            return (Criteria) this;
        }

        public Criteria andFREQUENCY_MODEGreaterThanOrEqualTo(Integer value) {
            addCriterion("FREQUENCY_MODE >=", value, "FREQUENCY_MODE");
            return (Criteria) this;
        }

        public Criteria andFREQUENCY_MODELessThan(Integer value) {
            addCriterion("FREQUENCY_MODE <", value, "FREQUENCY_MODE");
            return (Criteria) this;
        }

        public Criteria andFREQUENCY_MODELessThanOrEqualTo(Integer value) {
            addCriterion("FREQUENCY_MODE <=", value, "FREQUENCY_MODE");
            return (Criteria) this;
        }

        public Criteria andFREQUENCY_MODEIn(List<Integer> values) {
            addCriterion("FREQUENCY_MODE in", values, "FREQUENCY_MODE");
            return (Criteria) this;
        }

        public Criteria andFREQUENCY_MODENotIn(List<Integer> values) {
            addCriterion("FREQUENCY_MODE not in", values, "FREQUENCY_MODE");
            return (Criteria) this;
        }

        public Criteria andFREQUENCY_MODEBetween(Integer value1, Integer value2) {
            addCriterion("FREQUENCY_MODE between", value1, value2, "FREQUENCY_MODE");
            return (Criteria) this;
        }

        public Criteria andFREQUENCY_MODENotBetween(Integer value1, Integer value2) {
            addCriterion("FREQUENCY_MODE not between", value1, value2, "FREQUENCY_MODE");
            return (Criteria) this;
        }

        public Criteria andALARM_TYPEIsNull() {
            addCriterion("ALARM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andALARM_TYPEIsNotNull() {
            addCriterion("ALARM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andALARM_TYPEEqualTo(String value) {
            addCriterion("ALARM_TYPE =", value, "ALARM_TYPE");
            return (Criteria) this;
        }

        public Criteria andALARM_TYPENotEqualTo(String value) {
            addCriterion("ALARM_TYPE <>", value, "ALARM_TYPE");
            return (Criteria) this;
        }

        public Criteria andALARM_TYPEGreaterThan(String value) {
            addCriterion("ALARM_TYPE >", value, "ALARM_TYPE");
            return (Criteria) this;
        }

        public Criteria andALARM_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("ALARM_TYPE >=", value, "ALARM_TYPE");
            return (Criteria) this;
        }

        public Criteria andALARM_TYPELessThan(String value) {
            addCriterion("ALARM_TYPE <", value, "ALARM_TYPE");
            return (Criteria) this;
        }

        public Criteria andALARM_TYPELessThanOrEqualTo(String value) {
            addCriterion("ALARM_TYPE <=", value, "ALARM_TYPE");
            return (Criteria) this;
        }

        public Criteria andALARM_TYPELike(String value) {
            addCriterion("ALARM_TYPE like", value, "ALARM_TYPE");
            return (Criteria) this;
        }

        public Criteria andALARM_TYPENotLike(String value) {
            addCriterion("ALARM_TYPE not like", value, "ALARM_TYPE");
            return (Criteria) this;
        }

        public Criteria andALARM_TYPEIn(List<String> values) {
            addCriterion("ALARM_TYPE in", values, "ALARM_TYPE");
            return (Criteria) this;
        }

        public Criteria andALARM_TYPENotIn(List<String> values) {
            addCriterion("ALARM_TYPE not in", values, "ALARM_TYPE");
            return (Criteria) this;
        }

        public Criteria andALARM_TYPEBetween(String value1, String value2) {
            addCriterion("ALARM_TYPE between", value1, value2, "ALARM_TYPE");
            return (Criteria) this;
        }

        public Criteria andALARM_TYPENotBetween(String value1, String value2) {
            addCriterion("ALARM_TYPE not between", value1, value2, "ALARM_TYPE");
            return (Criteria) this;
        }

        public Criteria andALARM_CONTENTIsNull() {
            addCriterion("ALARM_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andALARM_CONTENTIsNotNull() {
            addCriterion("ALARM_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andALARM_CONTENTEqualTo(String value) {
            addCriterion("ALARM_CONTENT =", value, "ALARM_CONTENT");
            return (Criteria) this;
        }

        public Criteria andALARM_CONTENTNotEqualTo(String value) {
            addCriterion("ALARM_CONTENT <>", value, "ALARM_CONTENT");
            return (Criteria) this;
        }

        public Criteria andALARM_CONTENTGreaterThan(String value) {
            addCriterion("ALARM_CONTENT >", value, "ALARM_CONTENT");
            return (Criteria) this;
        }

        public Criteria andALARM_CONTENTGreaterThanOrEqualTo(String value) {
            addCriterion("ALARM_CONTENT >=", value, "ALARM_CONTENT");
            return (Criteria) this;
        }

        public Criteria andALARM_CONTENTLessThan(String value) {
            addCriterion("ALARM_CONTENT <", value, "ALARM_CONTENT");
            return (Criteria) this;
        }

        public Criteria andALARM_CONTENTLessThanOrEqualTo(String value) {
            addCriterion("ALARM_CONTENT <=", value, "ALARM_CONTENT");
            return (Criteria) this;
        }

        public Criteria andALARM_CONTENTLike(String value) {
            addCriterion("ALARM_CONTENT like", value, "ALARM_CONTENT");
            return (Criteria) this;
        }

        public Criteria andALARM_CONTENTNotLike(String value) {
            addCriterion("ALARM_CONTENT not like", value, "ALARM_CONTENT");
            return (Criteria) this;
        }

        public Criteria andALARM_CONTENTIn(List<String> values) {
            addCriterion("ALARM_CONTENT in", values, "ALARM_CONTENT");
            return (Criteria) this;
        }

        public Criteria andALARM_CONTENTNotIn(List<String> values) {
            addCriterion("ALARM_CONTENT not in", values, "ALARM_CONTENT");
            return (Criteria) this;
        }

        public Criteria andALARM_CONTENTBetween(String value1, String value2) {
            addCriterion("ALARM_CONTENT between", value1, value2, "ALARM_CONTENT");
            return (Criteria) this;
        }

        public Criteria andALARM_CONTENTNotBetween(String value1, String value2) {
            addCriterion("ALARM_CONTENT not between", value1, value2, "ALARM_CONTENT");
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

        public Criteria andTENANT_IDIsNull() {
            addCriterion("TENANT_ID is null");
            return (Criteria) this;
        }

        public Criteria andTENANT_IDIsNotNull() {
            addCriterion("TENANT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTENANT_IDEqualTo(String value) {
            addCriterion("TENANT_ID =", value, "TENANT_ID");
            return (Criteria) this;
        }

        public Criteria andTENANT_IDNotEqualTo(String value) {
            addCriterion("TENANT_ID <>", value, "TENANT_ID");
            return (Criteria) this;
        }

        public Criteria andTENANT_IDGreaterThan(String value) {
            addCriterion("TENANT_ID >", value, "TENANT_ID");
            return (Criteria) this;
        }

        public Criteria andTENANT_IDGreaterThanOrEqualTo(String value) {
            addCriterion("TENANT_ID >=", value, "TENANT_ID");
            return (Criteria) this;
        }

        public Criteria andTENANT_IDLessThan(String value) {
            addCriterion("TENANT_ID <", value, "TENANT_ID");
            return (Criteria) this;
        }

        public Criteria andTENANT_IDLessThanOrEqualTo(String value) {
            addCriterion("TENANT_ID <=", value, "TENANT_ID");
            return (Criteria) this;
        }

        public Criteria andTENANT_IDLike(String value) {
            addCriterion("TENANT_ID like", value, "TENANT_ID");
            return (Criteria) this;
        }

        public Criteria andTENANT_IDNotLike(String value) {
            addCriterion("TENANT_ID not like", value, "TENANT_ID");
            return (Criteria) this;
        }

        public Criteria andTENANT_IDIn(List<String> values) {
            addCriterion("TENANT_ID in", values, "TENANT_ID");
            return (Criteria) this;
        }

        public Criteria andTENANT_IDNotIn(List<String> values) {
            addCriterion("TENANT_ID not in", values, "TENANT_ID");
            return (Criteria) this;
        }

        public Criteria andTENANT_IDBetween(String value1, String value2) {
            addCriterion("TENANT_ID between", value1, value2, "TENANT_ID");
            return (Criteria) this;
        }

        public Criteria andTENANT_IDNotBetween(String value1, String value2) {
            addCriterion("TENANT_ID not between", value1, value2, "TENANT_ID");
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
