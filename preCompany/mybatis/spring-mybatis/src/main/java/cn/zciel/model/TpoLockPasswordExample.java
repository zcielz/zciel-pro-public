package cn.zciel.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TpoLockPasswordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public TpoLockPasswordExample() {
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

        public Criteria andPASSWORDIsNull() {
            addCriterion("`PASSWORD` is null");
            return (Criteria) this;
        }

        public Criteria andPASSWORDIsNotNull() {
            addCriterion("`PASSWORD` is not null");
            return (Criteria) this;
        }

        public Criteria andPASSWORDEqualTo(String value) {
            addCriterion("`PASSWORD` =", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotEqualTo(String value) {
            addCriterion("`PASSWORD` <>", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDGreaterThan(String value) {
            addCriterion("`PASSWORD` >", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDGreaterThanOrEqualTo(String value) {
            addCriterion("`PASSWORD` >=", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDLessThan(String value) {
            addCriterion("`PASSWORD` <", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDLessThanOrEqualTo(String value) {
            addCriterion("`PASSWORD` <=", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDLike(String value) {
            addCriterion("`PASSWORD` like", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotLike(String value) {
            addCriterion("`PASSWORD` not like", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDIn(List<String> values) {
            addCriterion("`PASSWORD` in", values, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotIn(List<String> values) {
            addCriterion("`PASSWORD` not in", values, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDBetween(String value1, String value2) {
            addCriterion("`PASSWORD` between", value1, value2, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotBetween(String value1, String value2) {
            addCriterion("`PASSWORD` not between", value1, value2, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andEXPIRE_TIMEIsNull() {
            addCriterion("EXPIRE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEXPIRE_TIMEIsNotNull() {
            addCriterion("EXPIRE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEXPIRE_TIMEEqualTo(Date value) {
            addCriterion("EXPIRE_TIME =", value, "EXPIRE_TIME");
            return (Criteria) this;
        }

        public Criteria andEXPIRE_TIMENotEqualTo(Date value) {
            addCriterion("EXPIRE_TIME <>", value, "EXPIRE_TIME");
            return (Criteria) this;
        }

        public Criteria andEXPIRE_TIMEGreaterThan(Date value) {
            addCriterion("EXPIRE_TIME >", value, "EXPIRE_TIME");
            return (Criteria) this;
        }

        public Criteria andEXPIRE_TIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("EXPIRE_TIME >=", value, "EXPIRE_TIME");
            return (Criteria) this;
        }

        public Criteria andEXPIRE_TIMELessThan(Date value) {
            addCriterion("EXPIRE_TIME <", value, "EXPIRE_TIME");
            return (Criteria) this;
        }

        public Criteria andEXPIRE_TIMELessThanOrEqualTo(Date value) {
            addCriterion("EXPIRE_TIME <=", value, "EXPIRE_TIME");
            return (Criteria) this;
        }

        public Criteria andEXPIRE_TIMEIn(List<Date> values) {
            addCriterion("EXPIRE_TIME in", values, "EXPIRE_TIME");
            return (Criteria) this;
        }

        public Criteria andEXPIRE_TIMENotIn(List<Date> values) {
            addCriterion("EXPIRE_TIME not in", values, "EXPIRE_TIME");
            return (Criteria) this;
        }

        public Criteria andEXPIRE_TIMEBetween(Date value1, Date value2) {
            addCriterion("EXPIRE_TIME between", value1, value2, "EXPIRE_TIME");
            return (Criteria) this;
        }

        public Criteria andEXPIRE_TIMENotBetween(Date value1, Date value2) {
            addCriterion("EXPIRE_TIME not between", value1, value2, "EXPIRE_TIME");
            return (Criteria) this;
        }

        public Criteria andOPEN_TIMESIsNull() {
            addCriterion("OPEN_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andOPEN_TIMESIsNotNull() {
            addCriterion("OPEN_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andOPEN_TIMESEqualTo(Integer value) {
            addCriterion("OPEN_TIMES =", value, "OPEN_TIMES");
            return (Criteria) this;
        }

        public Criteria andOPEN_TIMESNotEqualTo(Integer value) {
            addCriterion("OPEN_TIMES <>", value, "OPEN_TIMES");
            return (Criteria) this;
        }

        public Criteria andOPEN_TIMESGreaterThan(Integer value) {
            addCriterion("OPEN_TIMES >", value, "OPEN_TIMES");
            return (Criteria) this;
        }

        public Criteria andOPEN_TIMESGreaterThanOrEqualTo(Integer value) {
            addCriterion("OPEN_TIMES >=", value, "OPEN_TIMES");
            return (Criteria) this;
        }

        public Criteria andOPEN_TIMESLessThan(Integer value) {
            addCriterion("OPEN_TIMES <", value, "OPEN_TIMES");
            return (Criteria) this;
        }

        public Criteria andOPEN_TIMESLessThanOrEqualTo(Integer value) {
            addCriterion("OPEN_TIMES <=", value, "OPEN_TIMES");
            return (Criteria) this;
        }

        public Criteria andOPEN_TIMESIn(List<Integer> values) {
            addCriterion("OPEN_TIMES in", values, "OPEN_TIMES");
            return (Criteria) this;
        }

        public Criteria andOPEN_TIMESNotIn(List<Integer> values) {
            addCriterion("OPEN_TIMES not in", values, "OPEN_TIMES");
            return (Criteria) this;
        }

        public Criteria andOPEN_TIMESBetween(Integer value1, Integer value2) {
            addCriterion("OPEN_TIMES between", value1, value2, "OPEN_TIMES");
            return (Criteria) this;
        }

        public Criteria andOPEN_TIMESNotBetween(Integer value1, Integer value2) {
            addCriterion("OPEN_TIMES not between", value1, value2, "OPEN_TIMES");
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

        public Criteria andAUTH_IDIsNull() {
            addCriterion("AUTH_ID is null");
            return (Criteria) this;
        }

        public Criteria andAUTH_IDIsNotNull() {
            addCriterion("AUTH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAUTH_IDEqualTo(String value) {
            addCriterion("AUTH_ID =", value, "AUTH_ID");
            return (Criteria) this;
        }

        public Criteria andAUTH_IDNotEqualTo(String value) {
            addCriterion("AUTH_ID <>", value, "AUTH_ID");
            return (Criteria) this;
        }

        public Criteria andAUTH_IDGreaterThan(String value) {
            addCriterion("AUTH_ID >", value, "AUTH_ID");
            return (Criteria) this;
        }

        public Criteria andAUTH_IDGreaterThanOrEqualTo(String value) {
            addCriterion("AUTH_ID >=", value, "AUTH_ID");
            return (Criteria) this;
        }

        public Criteria andAUTH_IDLessThan(String value) {
            addCriterion("AUTH_ID <", value, "AUTH_ID");
            return (Criteria) this;
        }

        public Criteria andAUTH_IDLessThanOrEqualTo(String value) {
            addCriterion("AUTH_ID <=", value, "AUTH_ID");
            return (Criteria) this;
        }

        public Criteria andAUTH_IDLike(String value) {
            addCriterion("AUTH_ID like", value, "AUTH_ID");
            return (Criteria) this;
        }

        public Criteria andAUTH_IDNotLike(String value) {
            addCriterion("AUTH_ID not like", value, "AUTH_ID");
            return (Criteria) this;
        }

        public Criteria andAUTH_IDIn(List<String> values) {
            addCriterion("AUTH_ID in", values, "AUTH_ID");
            return (Criteria) this;
        }

        public Criteria andAUTH_IDNotIn(List<String> values) {
            addCriterion("AUTH_ID not in", values, "AUTH_ID");
            return (Criteria) this;
        }

        public Criteria andAUTH_IDBetween(String value1, String value2) {
            addCriterion("AUTH_ID between", value1, value2, "AUTH_ID");
            return (Criteria) this;
        }

        public Criteria andAUTH_IDNotBetween(String value1, String value2) {
            addCriterion("AUTH_ID not between", value1, value2, "AUTH_ID");
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
