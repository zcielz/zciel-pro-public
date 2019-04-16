package cn.zciel.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TpoLockOperateLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public TpoLockOperateLogExample() {
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

        public Criteria andDESCRIPTIONIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONLike(String value) {
            addCriterion("DESCRIPTION like", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "DESCRIPTION");
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

        public Criteria andOPERATE_TIMEIsNull() {
            addCriterion("OPERATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOPERATE_TIMEIsNotNull() {
            addCriterion("OPERATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOPERATE_TIMEEqualTo(Date value) {
            addCriterion("OPERATE_TIME =", value, "OPERATE_TIME");
            return (Criteria) this;
        }

        public Criteria andOPERATE_TIMENotEqualTo(Date value) {
            addCriterion("OPERATE_TIME <>", value, "OPERATE_TIME");
            return (Criteria) this;
        }

        public Criteria andOPERATE_TIMEGreaterThan(Date value) {
            addCriterion("OPERATE_TIME >", value, "OPERATE_TIME");
            return (Criteria) this;
        }

        public Criteria andOPERATE_TIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("OPERATE_TIME >=", value, "OPERATE_TIME");
            return (Criteria) this;
        }

        public Criteria andOPERATE_TIMELessThan(Date value) {
            addCriterion("OPERATE_TIME <", value, "OPERATE_TIME");
            return (Criteria) this;
        }

        public Criteria andOPERATE_TIMELessThanOrEqualTo(Date value) {
            addCriterion("OPERATE_TIME <=", value, "OPERATE_TIME");
            return (Criteria) this;
        }

        public Criteria andOPERATE_TIMEIn(List<Date> values) {
            addCriterion("OPERATE_TIME in", values, "OPERATE_TIME");
            return (Criteria) this;
        }

        public Criteria andOPERATE_TIMENotIn(List<Date> values) {
            addCriterion("OPERATE_TIME not in", values, "OPERATE_TIME");
            return (Criteria) this;
        }

        public Criteria andOPERATE_TIMEBetween(Date value1, Date value2) {
            addCriterion("OPERATE_TIME between", value1, value2, "OPERATE_TIME");
            return (Criteria) this;
        }

        public Criteria andOPERATE_TIMENotBetween(Date value1, Date value2) {
            addCriterion("OPERATE_TIME not between", value1, value2, "OPERATE_TIME");
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
