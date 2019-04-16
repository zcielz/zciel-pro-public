package cn.zciel.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TpoLockSyncHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public TpoLockSyncHistoryExample() {
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

        public Criteria andVOLUMNIsNull() {
            addCriterion("VOLUMN is null");
            return (Criteria) this;
        }

        public Criteria andVOLUMNIsNotNull() {
            addCriterion("VOLUMN is not null");
            return (Criteria) this;
        }

        public Criteria andVOLUMNEqualTo(Integer value) {
            addCriterion("VOLUMN =", value, "VOLUMN");
            return (Criteria) this;
        }

        public Criteria andVOLUMNNotEqualTo(Integer value) {
            addCriterion("VOLUMN <>", value, "VOLUMN");
            return (Criteria) this;
        }

        public Criteria andVOLUMNGreaterThan(Integer value) {
            addCriterion("VOLUMN >", value, "VOLUMN");
            return (Criteria) this;
        }

        public Criteria andVOLUMNGreaterThanOrEqualTo(Integer value) {
            addCriterion("VOLUMN >=", value, "VOLUMN");
            return (Criteria) this;
        }

        public Criteria andVOLUMNLessThan(Integer value) {
            addCriterion("VOLUMN <", value, "VOLUMN");
            return (Criteria) this;
        }

        public Criteria andVOLUMNLessThanOrEqualTo(Integer value) {
            addCriterion("VOLUMN <=", value, "VOLUMN");
            return (Criteria) this;
        }

        public Criteria andVOLUMNIn(List<Integer> values) {
            addCriterion("VOLUMN in", values, "VOLUMN");
            return (Criteria) this;
        }

        public Criteria andVOLUMNNotIn(List<Integer> values) {
            addCriterion("VOLUMN not in", values, "VOLUMN");
            return (Criteria) this;
        }

        public Criteria andVOLUMNBetween(Integer value1, Integer value2) {
            addCriterion("VOLUMN between", value1, value2, "VOLUMN");
            return (Criteria) this;
        }

        public Criteria andVOLUMNNotBetween(Integer value1, Integer value2) {
            addCriterion("VOLUMN not between", value1, value2, "VOLUMN");
            return (Criteria) this;
        }

        public Criteria andSINGAL_NOIsNull() {
            addCriterion("SINGAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andSINGAL_NOIsNotNull() {
            addCriterion("SINGAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSINGAL_NOEqualTo(Integer value) {
            addCriterion("SINGAL_NO =", value, "SINGAL_NO");
            return (Criteria) this;
        }

        public Criteria andSINGAL_NONotEqualTo(Integer value) {
            addCriterion("SINGAL_NO <>", value, "SINGAL_NO");
            return (Criteria) this;
        }

        public Criteria andSINGAL_NOGreaterThan(Integer value) {
            addCriterion("SINGAL_NO >", value, "SINGAL_NO");
            return (Criteria) this;
        }

        public Criteria andSINGAL_NOGreaterThanOrEqualTo(Integer value) {
            addCriterion("SINGAL_NO >=", value, "SINGAL_NO");
            return (Criteria) this;
        }

        public Criteria andSINGAL_NOLessThan(Integer value) {
            addCriterion("SINGAL_NO <", value, "SINGAL_NO");
            return (Criteria) this;
        }

        public Criteria andSINGAL_NOLessThanOrEqualTo(Integer value) {
            addCriterion("SINGAL_NO <=", value, "SINGAL_NO");
            return (Criteria) this;
        }

        public Criteria andSINGAL_NOIn(List<Integer> values) {
            addCriterion("SINGAL_NO in", values, "SINGAL_NO");
            return (Criteria) this;
        }

        public Criteria andSINGAL_NONotIn(List<Integer> values) {
            addCriterion("SINGAL_NO not in", values, "SINGAL_NO");
            return (Criteria) this;
        }

        public Criteria andSINGAL_NOBetween(Integer value1, Integer value2) {
            addCriterion("SINGAL_NO between", value1, value2, "SINGAL_NO");
            return (Criteria) this;
        }

        public Criteria andSINGAL_NONotBetween(Integer value1, Integer value2) {
            addCriterion("SINGAL_NO not between", value1, value2, "SINGAL_NO");
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

        public Criteria andSYNC_TIMEIsNull() {
            addCriterion("SYNC_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSYNC_TIMEIsNotNull() {
            addCriterion("SYNC_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSYNC_TIMEEqualTo(Date value) {
            addCriterion("SYNC_TIME =", value, "SYNC_TIME");
            return (Criteria) this;
        }

        public Criteria andSYNC_TIMENotEqualTo(Date value) {
            addCriterion("SYNC_TIME <>", value, "SYNC_TIME");
            return (Criteria) this;
        }

        public Criteria andSYNC_TIMEGreaterThan(Date value) {
            addCriterion("SYNC_TIME >", value, "SYNC_TIME");
            return (Criteria) this;
        }

        public Criteria andSYNC_TIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("SYNC_TIME >=", value, "SYNC_TIME");
            return (Criteria) this;
        }

        public Criteria andSYNC_TIMELessThan(Date value) {
            addCriterion("SYNC_TIME <", value, "SYNC_TIME");
            return (Criteria) this;
        }

        public Criteria andSYNC_TIMELessThanOrEqualTo(Date value) {
            addCriterion("SYNC_TIME <=", value, "SYNC_TIME");
            return (Criteria) this;
        }

        public Criteria andSYNC_TIMEIn(List<Date> values) {
            addCriterion("SYNC_TIME in", values, "SYNC_TIME");
            return (Criteria) this;
        }

        public Criteria andSYNC_TIMENotIn(List<Date> values) {
            addCriterion("SYNC_TIME not in", values, "SYNC_TIME");
            return (Criteria) this;
        }

        public Criteria andSYNC_TIMEBetween(Date value1, Date value2) {
            addCriterion("SYNC_TIME between", value1, value2, "SYNC_TIME");
            return (Criteria) this;
        }

        public Criteria andSYNC_TIMENotBetween(Date value1, Date value2) {
            addCriterion("SYNC_TIME not between", value1, value2, "SYNC_TIME");
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
