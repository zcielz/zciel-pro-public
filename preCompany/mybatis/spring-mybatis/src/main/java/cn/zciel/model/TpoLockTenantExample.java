package cn.zciel.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TpoLockTenantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public TpoLockTenantExample() {
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

        public Criteria andREAL_NAMEIsNull() {
            addCriterion("REAL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andREAL_NAMEIsNotNull() {
            addCriterion("REAL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andREAL_NAMEEqualTo(String value) {
            addCriterion("REAL_NAME =", value, "REAL_NAME");
            return (Criteria) this;
        }

        public Criteria andREAL_NAMENotEqualTo(String value) {
            addCriterion("REAL_NAME <>", value, "REAL_NAME");
            return (Criteria) this;
        }

        public Criteria andREAL_NAMEGreaterThan(String value) {
            addCriterion("REAL_NAME >", value, "REAL_NAME");
            return (Criteria) this;
        }

        public Criteria andREAL_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("REAL_NAME >=", value, "REAL_NAME");
            return (Criteria) this;
        }

        public Criteria andREAL_NAMELessThan(String value) {
            addCriterion("REAL_NAME <", value, "REAL_NAME");
            return (Criteria) this;
        }

        public Criteria andREAL_NAMELessThanOrEqualTo(String value) {
            addCriterion("REAL_NAME <=", value, "REAL_NAME");
            return (Criteria) this;
        }

        public Criteria andREAL_NAMELike(String value) {
            addCriterion("REAL_NAME like", value, "REAL_NAME");
            return (Criteria) this;
        }

        public Criteria andREAL_NAMENotLike(String value) {
            addCriterion("REAL_NAME not like", value, "REAL_NAME");
            return (Criteria) this;
        }

        public Criteria andREAL_NAMEIn(List<String> values) {
            addCriterion("REAL_NAME in", values, "REAL_NAME");
            return (Criteria) this;
        }

        public Criteria andREAL_NAMENotIn(List<String> values) {
            addCriterion("REAL_NAME not in", values, "REAL_NAME");
            return (Criteria) this;
        }

        public Criteria andREAL_NAMEBetween(String value1, String value2) {
            addCriterion("REAL_NAME between", value1, value2, "REAL_NAME");
            return (Criteria) this;
        }

        public Criteria andREAL_NAMENotBetween(String value1, String value2) {
            addCriterion("REAL_NAME not between", value1, value2, "REAL_NAME");
            return (Criteria) this;
        }

        public Criteria andMOBILEIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMOBILEIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMOBILEEqualTo(String value) {
            addCriterion("MOBILE =", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILENotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILEGreaterThan(String value) {
            addCriterion("MOBILE >", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILEGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILELessThan(String value) {
            addCriterion("MOBILE <", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILELessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILELike(String value) {
            addCriterion("MOBILE like", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILENotLike(String value) {
            addCriterion("MOBILE not like", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILEIn(List<String> values) {
            addCriterion("MOBILE in", values, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILENotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILEBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILENotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andID_NOIsNull() {
            addCriterion("ID_NO is null");
            return (Criteria) this;
        }

        public Criteria andID_NOIsNotNull() {
            addCriterion("ID_NO is not null");
            return (Criteria) this;
        }

        public Criteria andID_NOEqualTo(String value) {
            addCriterion("ID_NO =", value, "ID_NO");
            return (Criteria) this;
        }

        public Criteria andID_NONotEqualTo(String value) {
            addCriterion("ID_NO <>", value, "ID_NO");
            return (Criteria) this;
        }

        public Criteria andID_NOGreaterThan(String value) {
            addCriterion("ID_NO >", value, "ID_NO");
            return (Criteria) this;
        }

        public Criteria andID_NOGreaterThanOrEqualTo(String value) {
            addCriterion("ID_NO >=", value, "ID_NO");
            return (Criteria) this;
        }

        public Criteria andID_NOLessThan(String value) {
            addCriterion("ID_NO <", value, "ID_NO");
            return (Criteria) this;
        }

        public Criteria andID_NOLessThanOrEqualTo(String value) {
            addCriterion("ID_NO <=", value, "ID_NO");
            return (Criteria) this;
        }

        public Criteria andID_NOLike(String value) {
            addCriterion("ID_NO like", value, "ID_NO");
            return (Criteria) this;
        }

        public Criteria andID_NONotLike(String value) {
            addCriterion("ID_NO not like", value, "ID_NO");
            return (Criteria) this;
        }

        public Criteria andID_NOIn(List<String> values) {
            addCriterion("ID_NO in", values, "ID_NO");
            return (Criteria) this;
        }

        public Criteria andID_NONotIn(List<String> values) {
            addCriterion("ID_NO not in", values, "ID_NO");
            return (Criteria) this;
        }

        public Criteria andID_NOBetween(String value1, String value2) {
            addCriterion("ID_NO between", value1, value2, "ID_NO");
            return (Criteria) this;
        }

        public Criteria andID_NONotBetween(String value1, String value2) {
            addCriterion("ID_NO not between", value1, value2, "ID_NO");
            return (Criteria) this;
        }

        public Criteria andID_DNIsNull() {
            addCriterion("ID_DN is null");
            return (Criteria) this;
        }

        public Criteria andID_DNIsNotNull() {
            addCriterion("ID_DN is not null");
            return (Criteria) this;
        }

        public Criteria andID_DNEqualTo(String value) {
            addCriterion("ID_DN =", value, "ID_DN");
            return (Criteria) this;
        }

        public Criteria andID_DNNotEqualTo(String value) {
            addCriterion("ID_DN <>", value, "ID_DN");
            return (Criteria) this;
        }

        public Criteria andID_DNGreaterThan(String value) {
            addCriterion("ID_DN >", value, "ID_DN");
            return (Criteria) this;
        }

        public Criteria andID_DNGreaterThanOrEqualTo(String value) {
            addCriterion("ID_DN >=", value, "ID_DN");
            return (Criteria) this;
        }

        public Criteria andID_DNLessThan(String value) {
            addCriterion("ID_DN <", value, "ID_DN");
            return (Criteria) this;
        }

        public Criteria andID_DNLessThanOrEqualTo(String value) {
            addCriterion("ID_DN <=", value, "ID_DN");
            return (Criteria) this;
        }

        public Criteria andID_DNLike(String value) {
            addCriterion("ID_DN like", value, "ID_DN");
            return (Criteria) this;
        }

        public Criteria andID_DNNotLike(String value) {
            addCriterion("ID_DN not like", value, "ID_DN");
            return (Criteria) this;
        }

        public Criteria andID_DNIn(List<String> values) {
            addCriterion("ID_DN in", values, "ID_DN");
            return (Criteria) this;
        }

        public Criteria andID_DNNotIn(List<String> values) {
            addCriterion("ID_DN not in", values, "ID_DN");
            return (Criteria) this;
        }

        public Criteria andID_DNBetween(String value1, String value2) {
            addCriterion("ID_DN between", value1, value2, "ID_DN");
            return (Criteria) this;
        }

        public Criteria andID_DNNotBetween(String value1, String value2) {
            addCriterion("ID_DN not between", value1, value2, "ID_DN");
            return (Criteria) this;
        }

        public Criteria andGENDERIsNull() {
            addCriterion("GENDER is null");
            return (Criteria) this;
        }

        public Criteria andGENDERIsNotNull() {
            addCriterion("GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andGENDEREqualTo(String value) {
            addCriterion("GENDER =", value, "GENDER");
            return (Criteria) this;
        }

        public Criteria andGENDERNotEqualTo(String value) {
            addCriterion("GENDER <>", value, "GENDER");
            return (Criteria) this;
        }

        public Criteria andGENDERGreaterThan(String value) {
            addCriterion("GENDER >", value, "GENDER");
            return (Criteria) this;
        }

        public Criteria andGENDERGreaterThanOrEqualTo(String value) {
            addCriterion("GENDER >=", value, "GENDER");
            return (Criteria) this;
        }

        public Criteria andGENDERLessThan(String value) {
            addCriterion("GENDER <", value, "GENDER");
            return (Criteria) this;
        }

        public Criteria andGENDERLessThanOrEqualTo(String value) {
            addCriterion("GENDER <=", value, "GENDER");
            return (Criteria) this;
        }

        public Criteria andGENDERLike(String value) {
            addCriterion("GENDER like", value, "GENDER");
            return (Criteria) this;
        }

        public Criteria andGENDERNotLike(String value) {
            addCriterion("GENDER not like", value, "GENDER");
            return (Criteria) this;
        }

        public Criteria andGENDERIn(List<String> values) {
            addCriterion("GENDER in", values, "GENDER");
            return (Criteria) this;
        }

        public Criteria andGENDERNotIn(List<String> values) {
            addCriterion("GENDER not in", values, "GENDER");
            return (Criteria) this;
        }

        public Criteria andGENDERBetween(String value1, String value2) {
            addCriterion("GENDER between", value1, value2, "GENDER");
            return (Criteria) this;
        }

        public Criteria andGENDERNotBetween(String value1, String value2) {
            addCriterion("GENDER not between", value1, value2, "GENDER");
            return (Criteria) this;
        }

        public Criteria andAVATARIsNull() {
            addCriterion("AVATAR is null");
            return (Criteria) this;
        }

        public Criteria andAVATARIsNotNull() {
            addCriterion("AVATAR is not null");
            return (Criteria) this;
        }

        public Criteria andAVATAREqualTo(String value) {
            addCriterion("AVATAR =", value, "AVATAR");
            return (Criteria) this;
        }

        public Criteria andAVATARNotEqualTo(String value) {
            addCriterion("AVATAR <>", value, "AVATAR");
            return (Criteria) this;
        }

        public Criteria andAVATARGreaterThan(String value) {
            addCriterion("AVATAR >", value, "AVATAR");
            return (Criteria) this;
        }

        public Criteria andAVATARGreaterThanOrEqualTo(String value) {
            addCriterion("AVATAR >=", value, "AVATAR");
            return (Criteria) this;
        }

        public Criteria andAVATARLessThan(String value) {
            addCriterion("AVATAR <", value, "AVATAR");
            return (Criteria) this;
        }

        public Criteria andAVATARLessThanOrEqualTo(String value) {
            addCriterion("AVATAR <=", value, "AVATAR");
            return (Criteria) this;
        }

        public Criteria andAVATARLike(String value) {
            addCriterion("AVATAR like", value, "AVATAR");
            return (Criteria) this;
        }

        public Criteria andAVATARNotLike(String value) {
            addCriterion("AVATAR not like", value, "AVATAR");
            return (Criteria) this;
        }

        public Criteria andAVATARIn(List<String> values) {
            addCriterion("AVATAR in", values, "AVATAR");
            return (Criteria) this;
        }

        public Criteria andAVATARNotIn(List<String> values) {
            addCriterion("AVATAR not in", values, "AVATAR");
            return (Criteria) this;
        }

        public Criteria andAVATARBetween(String value1, String value2) {
            addCriterion("AVATAR between", value1, value2, "AVATAR");
            return (Criteria) this;
        }

        public Criteria andAVATARNotBetween(String value1, String value2) {
            addCriterion("AVATAR not between", value1, value2, "AVATAR");
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

        public Criteria andCRETE_TIMEIsNull() {
            addCriterion("CRETE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCRETE_TIMEIsNotNull() {
            addCriterion("CRETE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCRETE_TIMEEqualTo(Date value) {
            addCriterion("CRETE_TIME =", value, "CRETE_TIME");
            return (Criteria) this;
        }

        public Criteria andCRETE_TIMENotEqualTo(Date value) {
            addCriterion("CRETE_TIME <>", value, "CRETE_TIME");
            return (Criteria) this;
        }

        public Criteria andCRETE_TIMEGreaterThan(Date value) {
            addCriterion("CRETE_TIME >", value, "CRETE_TIME");
            return (Criteria) this;
        }

        public Criteria andCRETE_TIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("CRETE_TIME >=", value, "CRETE_TIME");
            return (Criteria) this;
        }

        public Criteria andCRETE_TIMELessThan(Date value) {
            addCriterion("CRETE_TIME <", value, "CRETE_TIME");
            return (Criteria) this;
        }

        public Criteria andCRETE_TIMELessThanOrEqualTo(Date value) {
            addCriterion("CRETE_TIME <=", value, "CRETE_TIME");
            return (Criteria) this;
        }

        public Criteria andCRETE_TIMEIn(List<Date> values) {
            addCriterion("CRETE_TIME in", values, "CRETE_TIME");
            return (Criteria) this;
        }

        public Criteria andCRETE_TIMENotIn(List<Date> values) {
            addCriterion("CRETE_TIME not in", values, "CRETE_TIME");
            return (Criteria) this;
        }

        public Criteria andCRETE_TIMEBetween(Date value1, Date value2) {
            addCriterion("CRETE_TIME between", value1, value2, "CRETE_TIME");
            return (Criteria) this;
        }

        public Criteria andCRETE_TIMENotBetween(Date value1, Date value2) {
            addCriterion("CRETE_TIME not between", value1, value2, "CRETE_TIME");
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

        public Criteria andOUT_MEMBER_IDIsNull() {
            addCriterion("OUT_MEMBER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOUT_MEMBER_IDIsNotNull() {
            addCriterion("OUT_MEMBER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOUT_MEMBER_IDEqualTo(String value) {
            addCriterion("OUT_MEMBER_ID =", value, "OUT_MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andOUT_MEMBER_IDNotEqualTo(String value) {
            addCriterion("OUT_MEMBER_ID <>", value, "OUT_MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andOUT_MEMBER_IDGreaterThan(String value) {
            addCriterion("OUT_MEMBER_ID >", value, "OUT_MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andOUT_MEMBER_IDGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_MEMBER_ID >=", value, "OUT_MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andOUT_MEMBER_IDLessThan(String value) {
            addCriterion("OUT_MEMBER_ID <", value, "OUT_MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andOUT_MEMBER_IDLessThanOrEqualTo(String value) {
            addCriterion("OUT_MEMBER_ID <=", value, "OUT_MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andOUT_MEMBER_IDLike(String value) {
            addCriterion("OUT_MEMBER_ID like", value, "OUT_MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andOUT_MEMBER_IDNotLike(String value) {
            addCriterion("OUT_MEMBER_ID not like", value, "OUT_MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andOUT_MEMBER_IDIn(List<String> values) {
            addCriterion("OUT_MEMBER_ID in", values, "OUT_MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andOUT_MEMBER_IDNotIn(List<String> values) {
            addCriterion("OUT_MEMBER_ID not in", values, "OUT_MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andOUT_MEMBER_IDBetween(String value1, String value2) {
            addCriterion("OUT_MEMBER_ID between", value1, value2, "OUT_MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andOUT_MEMBER_IDNotBetween(String value1, String value2) {
            addCriterion("OUT_MEMBER_ID not between", value1, value2, "OUT_MEMBER_ID");
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
