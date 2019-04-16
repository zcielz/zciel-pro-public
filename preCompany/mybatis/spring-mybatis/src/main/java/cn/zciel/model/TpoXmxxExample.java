package cn.zciel.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TpoXmxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public TpoXmxxExample() {
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

        public Criteria andXQMCIsNull() {
            addCriterion("XQMC is null");
            return (Criteria) this;
        }

        public Criteria andXQMCIsNotNull() {
            addCriterion("XQMC is not null");
            return (Criteria) this;
        }

        public Criteria andXQMCEqualTo(String value) {
            addCriterion("XQMC =", value, "XQMC");
            return (Criteria) this;
        }

        public Criteria andXQMCNotEqualTo(String value) {
            addCriterion("XQMC <>", value, "XQMC");
            return (Criteria) this;
        }

        public Criteria andXQMCGreaterThan(String value) {
            addCriterion("XQMC >", value, "XQMC");
            return (Criteria) this;
        }

        public Criteria andXQMCGreaterThanOrEqualTo(String value) {
            addCriterion("XQMC >=", value, "XQMC");
            return (Criteria) this;
        }

        public Criteria andXQMCLessThan(String value) {
            addCriterion("XQMC <", value, "XQMC");
            return (Criteria) this;
        }

        public Criteria andXQMCLessThanOrEqualTo(String value) {
            addCriterion("XQMC <=", value, "XQMC");
            return (Criteria) this;
        }

        public Criteria andXQMCLike(String value) {
            addCriterion("XQMC like", value, "XQMC");
            return (Criteria) this;
        }

        public Criteria andXQMCNotLike(String value) {
            addCriterion("XQMC not like", value, "XQMC");
            return (Criteria) this;
        }

        public Criteria andXQMCIn(List<String> values) {
            addCriterion("XQMC in", values, "XQMC");
            return (Criteria) this;
        }

        public Criteria andXQMCNotIn(List<String> values) {
            addCriterion("XQMC not in", values, "XQMC");
            return (Criteria) this;
        }

        public Criteria andXQMCBetween(String value1, String value2) {
            addCriterion("XQMC between", value1, value2, "XQMC");
            return (Criteria) this;
        }

        public Criteria andXQMCNotBetween(String value1, String value2) {
            addCriterion("XQMC not between", value1, value2, "XQMC");
            return (Criteria) this;
        }

        public Criteria andZLIsNull() {
            addCriterion("ZL is null");
            return (Criteria) this;
        }

        public Criteria andZLIsNotNull() {
            addCriterion("ZL is not null");
            return (Criteria) this;
        }

        public Criteria andZLEqualTo(String value) {
            addCriterion("ZL =", value, "ZL");
            return (Criteria) this;
        }

        public Criteria andZLNotEqualTo(String value) {
            addCriterion("ZL <>", value, "ZL");
            return (Criteria) this;
        }

        public Criteria andZLGreaterThan(String value) {
            addCriterion("ZL >", value, "ZL");
            return (Criteria) this;
        }

        public Criteria andZLGreaterThanOrEqualTo(String value) {
            addCriterion("ZL >=", value, "ZL");
            return (Criteria) this;
        }

        public Criteria andZLLessThan(String value) {
            addCriterion("ZL <", value, "ZL");
            return (Criteria) this;
        }

        public Criteria andZLLessThanOrEqualTo(String value) {
            addCriterion("ZL <=", value, "ZL");
            return (Criteria) this;
        }

        public Criteria andZLLike(String value) {
            addCriterion("ZL like", value, "ZL");
            return (Criteria) this;
        }

        public Criteria andZLNotLike(String value) {
            addCriterion("ZL not like", value, "ZL");
            return (Criteria) this;
        }

        public Criteria andZLIn(List<String> values) {
            addCriterion("ZL in", values, "ZL");
            return (Criteria) this;
        }

        public Criteria andZLNotIn(List<String> values) {
            addCriterion("ZL not in", values, "ZL");
            return (Criteria) this;
        }

        public Criteria andZLBetween(String value1, String value2) {
            addCriterion("ZL between", value1, value2, "ZL");
            return (Criteria) this;
        }

        public Criteria andZLNotBetween(String value1, String value2) {
            addCriterion("ZL not between", value1, value2, "ZL");
            return (Criteria) this;
        }

        public Criteria andXMBMIsNull() {
            addCriterion("XMBM is null");
            return (Criteria) this;
        }

        public Criteria andXMBMIsNotNull() {
            addCriterion("XMBM is not null");
            return (Criteria) this;
        }

        public Criteria andXMBMEqualTo(String value) {
            addCriterion("XMBM =", value, "XMBM");
            return (Criteria) this;
        }

        public Criteria andXMBMNotEqualTo(String value) {
            addCriterion("XMBM <>", value, "XMBM");
            return (Criteria) this;
        }

        public Criteria andXMBMGreaterThan(String value) {
            addCriterion("XMBM >", value, "XMBM");
            return (Criteria) this;
        }

        public Criteria andXMBMGreaterThanOrEqualTo(String value) {
            addCriterion("XMBM >=", value, "XMBM");
            return (Criteria) this;
        }

        public Criteria andXMBMLessThan(String value) {
            addCriterion("XMBM <", value, "XMBM");
            return (Criteria) this;
        }

        public Criteria andXMBMLessThanOrEqualTo(String value) {
            addCriterion("XMBM <=", value, "XMBM");
            return (Criteria) this;
        }

        public Criteria andXMBMLike(String value) {
            addCriterion("XMBM like", value, "XMBM");
            return (Criteria) this;
        }

        public Criteria andXMBMNotLike(String value) {
            addCriterion("XMBM not like", value, "XMBM");
            return (Criteria) this;
        }

        public Criteria andXMBMIn(List<String> values) {
            addCriterion("XMBM in", values, "XMBM");
            return (Criteria) this;
        }

        public Criteria andXMBMNotIn(List<String> values) {
            addCriterion("XMBM not in", values, "XMBM");
            return (Criteria) this;
        }

        public Criteria andXMBMBetween(String value1, String value2) {
            addCriterion("XMBM between", value1, value2, "XMBM");
            return (Criteria) this;
        }

        public Criteria andXMBMNotBetween(String value1, String value2) {
            addCriterion("XMBM not between", value1, value2, "XMBM");
            return (Criteria) this;
        }

        public Criteria andNDJHIDIsNull() {
            addCriterion("NDJHID is null");
            return (Criteria) this;
        }

        public Criteria andNDJHIDIsNotNull() {
            addCriterion("NDJHID is not null");
            return (Criteria) this;
        }

        public Criteria andNDJHIDEqualTo(String value) {
            addCriterion("NDJHID =", value, "NDJHID");
            return (Criteria) this;
        }

        public Criteria andNDJHIDNotEqualTo(String value) {
            addCriterion("NDJHID <>", value, "NDJHID");
            return (Criteria) this;
        }

        public Criteria andNDJHIDGreaterThan(String value) {
            addCriterion("NDJHID >", value, "NDJHID");
            return (Criteria) this;
        }

        public Criteria andNDJHIDGreaterThanOrEqualTo(String value) {
            addCriterion("NDJHID >=", value, "NDJHID");
            return (Criteria) this;
        }

        public Criteria andNDJHIDLessThan(String value) {
            addCriterion("NDJHID <", value, "NDJHID");
            return (Criteria) this;
        }

        public Criteria andNDJHIDLessThanOrEqualTo(String value) {
            addCriterion("NDJHID <=", value, "NDJHID");
            return (Criteria) this;
        }

        public Criteria andNDJHIDLike(String value) {
            addCriterion("NDJHID like", value, "NDJHID");
            return (Criteria) this;
        }

        public Criteria andNDJHIDNotLike(String value) {
            addCriterion("NDJHID not like", value, "NDJHID");
            return (Criteria) this;
        }

        public Criteria andNDJHIDIn(List<String> values) {
            addCriterion("NDJHID in", values, "NDJHID");
            return (Criteria) this;
        }

        public Criteria andNDJHIDNotIn(List<String> values) {
            addCriterion("NDJHID not in", values, "NDJHID");
            return (Criteria) this;
        }

        public Criteria andNDJHIDBetween(String value1, String value2) {
            addCriterion("NDJHID between", value1, value2, "NDJHID");
            return (Criteria) this;
        }

        public Criteria andNDJHIDNotBetween(String value1, String value2) {
            addCriterion("NDJHID not between", value1, value2, "NDJHID");
            return (Criteria) this;
        }

        public Criteria andXMMCIsNull() {
            addCriterion("XMMC is null");
            return (Criteria) this;
        }

        public Criteria andXMMCIsNotNull() {
            addCriterion("XMMC is not null");
            return (Criteria) this;
        }

        public Criteria andXMMCEqualTo(String value) {
            addCriterion("XMMC =", value, "XMMC");
            return (Criteria) this;
        }

        public Criteria andXMMCNotEqualTo(String value) {
            addCriterion("XMMC <>", value, "XMMC");
            return (Criteria) this;
        }

        public Criteria andXMMCGreaterThan(String value) {
            addCriterion("XMMC >", value, "XMMC");
            return (Criteria) this;
        }

        public Criteria andXMMCGreaterThanOrEqualTo(String value) {
            addCriterion("XMMC >=", value, "XMMC");
            return (Criteria) this;
        }

        public Criteria andXMMCLessThan(String value) {
            addCriterion("XMMC <", value, "XMMC");
            return (Criteria) this;
        }

        public Criteria andXMMCLessThanOrEqualTo(String value) {
            addCriterion("XMMC <=", value, "XMMC");
            return (Criteria) this;
        }

        public Criteria andXMMCLike(String value) {
            addCriterion("XMMC like", value, "XMMC");
            return (Criteria) this;
        }

        public Criteria andXMMCNotLike(String value) {
            addCriterion("XMMC not like", value, "XMMC");
            return (Criteria) this;
        }

        public Criteria andXMMCIn(List<String> values) {
            addCriterion("XMMC in", values, "XMMC");
            return (Criteria) this;
        }

        public Criteria andXMMCNotIn(List<String> values) {
            addCriterion("XMMC not in", values, "XMMC");
            return (Criteria) this;
        }

        public Criteria andXMMCBetween(String value1, String value2) {
            addCriterion("XMMC between", value1, value2, "XMMC");
            return (Criteria) this;
        }

        public Criteria andXMMCNotBetween(String value1, String value2) {
            addCriterion("XMMC not between", value1, value2, "XMMC");
            return (Criteria) this;
        }

        public Criteria andXMZLIsNull() {
            addCriterion("XMZL is null");
            return (Criteria) this;
        }

        public Criteria andXMZLIsNotNull() {
            addCriterion("XMZL is not null");
            return (Criteria) this;
        }

        public Criteria andXMZLEqualTo(String value) {
            addCriterion("XMZL =", value, "XMZL");
            return (Criteria) this;
        }

        public Criteria andXMZLNotEqualTo(String value) {
            addCriterion("XMZL <>", value, "XMZL");
            return (Criteria) this;
        }

        public Criteria andXMZLGreaterThan(String value) {
            addCriterion("XMZL >", value, "XMZL");
            return (Criteria) this;
        }

        public Criteria andXMZLGreaterThanOrEqualTo(String value) {
            addCriterion("XMZL >=", value, "XMZL");
            return (Criteria) this;
        }

        public Criteria andXMZLLessThan(String value) {
            addCriterion("XMZL <", value, "XMZL");
            return (Criteria) this;
        }

        public Criteria andXMZLLessThanOrEqualTo(String value) {
            addCriterion("XMZL <=", value, "XMZL");
            return (Criteria) this;
        }

        public Criteria andXMZLLike(String value) {
            addCriterion("XMZL like", value, "XMZL");
            return (Criteria) this;
        }

        public Criteria andXMZLNotLike(String value) {
            addCriterion("XMZL not like", value, "XMZL");
            return (Criteria) this;
        }

        public Criteria andXMZLIn(List<String> values) {
            addCriterion("XMZL in", values, "XMZL");
            return (Criteria) this;
        }

        public Criteria andXMZLNotIn(List<String> values) {
            addCriterion("XMZL not in", values, "XMZL");
            return (Criteria) this;
        }

        public Criteria andXMZLBetween(String value1, String value2) {
            addCriterion("XMZL between", value1, value2, "XMZL");
            return (Criteria) this;
        }

        public Criteria andXMZLNotBetween(String value1, String value2) {
            addCriterion("XMZL not between", value1, value2, "XMZL");
            return (Criteria) this;
        }

        public Criteria andJSFSIsNull() {
            addCriterion("JSFS is null");
            return (Criteria) this;
        }

        public Criteria andJSFSIsNotNull() {
            addCriterion("JSFS is not null");
            return (Criteria) this;
        }

        public Criteria andJSFSEqualTo(String value) {
            addCriterion("JSFS =", value, "JSFS");
            return (Criteria) this;
        }

        public Criteria andJSFSNotEqualTo(String value) {
            addCriterion("JSFS <>", value, "JSFS");
            return (Criteria) this;
        }

        public Criteria andJSFSGreaterThan(String value) {
            addCriterion("JSFS >", value, "JSFS");
            return (Criteria) this;
        }

        public Criteria andJSFSGreaterThanOrEqualTo(String value) {
            addCriterion("JSFS >=", value, "JSFS");
            return (Criteria) this;
        }

        public Criteria andJSFSLessThan(String value) {
            addCriterion("JSFS <", value, "JSFS");
            return (Criteria) this;
        }

        public Criteria andJSFSLessThanOrEqualTo(String value) {
            addCriterion("JSFS <=", value, "JSFS");
            return (Criteria) this;
        }

        public Criteria andJSFSLike(String value) {
            addCriterion("JSFS like", value, "JSFS");
            return (Criteria) this;
        }

        public Criteria andJSFSNotLike(String value) {
            addCriterion("JSFS not like", value, "JSFS");
            return (Criteria) this;
        }

        public Criteria andJSFSIn(List<String> values) {
            addCriterion("JSFS in", values, "JSFS");
            return (Criteria) this;
        }

        public Criteria andJSFSNotIn(List<String> values) {
            addCriterion("JSFS not in", values, "JSFS");
            return (Criteria) this;
        }

        public Criteria andJSFSBetween(String value1, String value2) {
            addCriterion("JSFS between", value1, value2, "JSFS");
            return (Criteria) this;
        }

        public Criteria andJSFSNotBetween(String value1, String value2) {
            addCriterion("JSFS not between", value1, value2, "JSFS");
            return (Criteria) this;
        }

        public Criteria andZBIsNull() {
            addCriterion("ZB is null");
            return (Criteria) this;
        }

        public Criteria andZBIsNotNull() {
            addCriterion("ZB is not null");
            return (Criteria) this;
        }

        public Criteria andZBEqualTo(String value) {
            addCriterion("ZB =", value, "ZB");
            return (Criteria) this;
        }

        public Criteria andZBNotEqualTo(String value) {
            addCriterion("ZB <>", value, "ZB");
            return (Criteria) this;
        }

        public Criteria andZBGreaterThan(String value) {
            addCriterion("ZB >", value, "ZB");
            return (Criteria) this;
        }

        public Criteria andZBGreaterThanOrEqualTo(String value) {
            addCriterion("ZB >=", value, "ZB");
            return (Criteria) this;
        }

        public Criteria andZBLessThan(String value) {
            addCriterion("ZB <", value, "ZB");
            return (Criteria) this;
        }

        public Criteria andZBLessThanOrEqualTo(String value) {
            addCriterion("ZB <=", value, "ZB");
            return (Criteria) this;
        }

        public Criteria andZBLike(String value) {
            addCriterion("ZB like", value, "ZB");
            return (Criteria) this;
        }

        public Criteria andZBNotLike(String value) {
            addCriterion("ZB not like", value, "ZB");
            return (Criteria) this;
        }

        public Criteria andZBIn(List<String> values) {
            addCriterion("ZB in", values, "ZB");
            return (Criteria) this;
        }

        public Criteria andZBNotIn(List<String> values) {
            addCriterion("ZB not in", values, "ZB");
            return (Criteria) this;
        }

        public Criteria andZBBetween(String value1, String value2) {
            addCriterion("ZB between", value1, value2, "ZB");
            return (Criteria) this;
        }

        public Criteria andZBNotBetween(String value1, String value2) {
            addCriterion("ZB not between", value1, value2, "ZB");
            return (Criteria) this;
        }

        public Criteria andJDIsNull() {
            addCriterion("JD is null");
            return (Criteria) this;
        }

        public Criteria andJDIsNotNull() {
            addCriterion("JD is not null");
            return (Criteria) this;
        }

        public Criteria andJDEqualTo(Long value) {
            addCriterion("JD =", value, "JD");
            return (Criteria) this;
        }

        public Criteria andJDNotEqualTo(Long value) {
            addCriterion("JD <>", value, "JD");
            return (Criteria) this;
        }

        public Criteria andJDGreaterThan(Long value) {
            addCriterion("JD >", value, "JD");
            return (Criteria) this;
        }

        public Criteria andJDGreaterThanOrEqualTo(Long value) {
            addCriterion("JD >=", value, "JD");
            return (Criteria) this;
        }

        public Criteria andJDLessThan(Long value) {
            addCriterion("JD <", value, "JD");
            return (Criteria) this;
        }

        public Criteria andJDLessThanOrEqualTo(Long value) {
            addCriterion("JD <=", value, "JD");
            return (Criteria) this;
        }

        public Criteria andJDIn(List<Long> values) {
            addCriterion("JD in", values, "JD");
            return (Criteria) this;
        }

        public Criteria andJDNotIn(List<Long> values) {
            addCriterion("JD not in", values, "JD");
            return (Criteria) this;
        }

        public Criteria andJDBetween(Long value1, Long value2) {
            addCriterion("JD between", value1, value2, "JD");
            return (Criteria) this;
        }

        public Criteria andJDNotBetween(Long value1, Long value2) {
            addCriterion("JD not between", value1, value2, "JD");
            return (Criteria) this;
        }

        public Criteria andWDIsNull() {
            addCriterion("WD is null");
            return (Criteria) this;
        }

        public Criteria andWDIsNotNull() {
            addCriterion("WD is not null");
            return (Criteria) this;
        }

        public Criteria andWDEqualTo(Long value) {
            addCriterion("WD =", value, "WD");
            return (Criteria) this;
        }

        public Criteria andWDNotEqualTo(Long value) {
            addCriterion("WD <>", value, "WD");
            return (Criteria) this;
        }

        public Criteria andWDGreaterThan(Long value) {
            addCriterion("WD >", value, "WD");
            return (Criteria) this;
        }

        public Criteria andWDGreaterThanOrEqualTo(Long value) {
            addCriterion("WD >=", value, "WD");
            return (Criteria) this;
        }

        public Criteria andWDLessThan(Long value) {
            addCriterion("WD <", value, "WD");
            return (Criteria) this;
        }

        public Criteria andWDLessThanOrEqualTo(Long value) {
            addCriterion("WD <=", value, "WD");
            return (Criteria) this;
        }

        public Criteria andWDIn(List<Long> values) {
            addCriterion("WD in", values, "WD");
            return (Criteria) this;
        }

        public Criteria andWDNotIn(List<Long> values) {
            addCriterion("WD not in", values, "WD");
            return (Criteria) this;
        }

        public Criteria andWDBetween(Long value1, Long value2) {
            addCriterion("WD between", value1, value2, "WD");
            return (Criteria) this;
        }

        public Criteria andWDNotBetween(Long value1, Long value2) {
            addCriterion("WD not between", value1, value2, "WD");
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

        public Criteria andTDQDFSIsNull() {
            addCriterion("TDQDFS is null");
            return (Criteria) this;
        }

        public Criteria andTDQDFSIsNotNull() {
            addCriterion("TDQDFS is not null");
            return (Criteria) this;
        }

        public Criteria andTDQDFSEqualTo(String value) {
            addCriterion("TDQDFS =", value, "TDQDFS");
            return (Criteria) this;
        }

        public Criteria andTDQDFSNotEqualTo(String value) {
            addCriterion("TDQDFS <>", value, "TDQDFS");
            return (Criteria) this;
        }

        public Criteria andTDQDFSGreaterThan(String value) {
            addCriterion("TDQDFS >", value, "TDQDFS");
            return (Criteria) this;
        }

        public Criteria andTDQDFSGreaterThanOrEqualTo(String value) {
            addCriterion("TDQDFS >=", value, "TDQDFS");
            return (Criteria) this;
        }

        public Criteria andTDQDFSLessThan(String value) {
            addCriterion("TDQDFS <", value, "TDQDFS");
            return (Criteria) this;
        }

        public Criteria andTDQDFSLessThanOrEqualTo(String value) {
            addCriterion("TDQDFS <=", value, "TDQDFS");
            return (Criteria) this;
        }

        public Criteria andTDQDFSLike(String value) {
            addCriterion("TDQDFS like", value, "TDQDFS");
            return (Criteria) this;
        }

        public Criteria andTDQDFSNotLike(String value) {
            addCriterion("TDQDFS not like", value, "TDQDFS");
            return (Criteria) this;
        }

        public Criteria andTDQDFSIn(List<String> values) {
            addCriterion("TDQDFS in", values, "TDQDFS");
            return (Criteria) this;
        }

        public Criteria andTDQDFSNotIn(List<String> values) {
            addCriterion("TDQDFS not in", values, "TDQDFS");
            return (Criteria) this;
        }

        public Criteria andTDQDFSBetween(String value1, String value2) {
            addCriterion("TDQDFS between", value1, value2, "TDQDFS");
            return (Criteria) this;
        }

        public Criteria andTDQDFSNotBetween(String value1, String value2) {
            addCriterion("TDQDFS not between", value1, value2, "TDQDFS");
            return (Criteria) this;
        }

        public Criteria andTDMJIsNull() {
            addCriterion("TDMJ is null");
            return (Criteria) this;
        }

        public Criteria andTDMJIsNotNull() {
            addCriterion("TDMJ is not null");
            return (Criteria) this;
        }

        public Criteria andTDMJEqualTo(BigDecimal value) {
            addCriterion("TDMJ =", value, "TDMJ");
            return (Criteria) this;
        }

        public Criteria andTDMJNotEqualTo(BigDecimal value) {
            addCriterion("TDMJ <>", value, "TDMJ");
            return (Criteria) this;
        }

        public Criteria andTDMJGreaterThan(BigDecimal value) {
            addCriterion("TDMJ >", value, "TDMJ");
            return (Criteria) this;
        }

        public Criteria andTDMJGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TDMJ >=", value, "TDMJ");
            return (Criteria) this;
        }

        public Criteria andTDMJLessThan(BigDecimal value) {
            addCriterion("TDMJ <", value, "TDMJ");
            return (Criteria) this;
        }

        public Criteria andTDMJLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TDMJ <=", value, "TDMJ");
            return (Criteria) this;
        }

        public Criteria andTDMJIn(List<BigDecimal> values) {
            addCriterion("TDMJ in", values, "TDMJ");
            return (Criteria) this;
        }

        public Criteria andTDMJNotIn(List<BigDecimal> values) {
            addCriterion("TDMJ not in", values, "TDMJ");
            return (Criteria) this;
        }

        public Criteria andTDMJBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TDMJ between", value1, value2, "TDMJ");
            return (Criteria) this;
        }

        public Criteria andTDMJNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TDMJ not between", value1, value2, "TDMJ");
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

        public Criteria andXMXZIsNull() {
            addCriterion("XMXZ is null");
            return (Criteria) this;
        }

        public Criteria andXMXZIsNotNull() {
            addCriterion("XMXZ is not null");
            return (Criteria) this;
        }

        public Criteria andXMXZEqualTo(String value) {
            addCriterion("XMXZ =", value, "XMXZ");
            return (Criteria) this;
        }

        public Criteria andXMXZNotEqualTo(String value) {
            addCriterion("XMXZ <>", value, "XMXZ");
            return (Criteria) this;
        }

        public Criteria andXMXZGreaterThan(String value) {
            addCriterion("XMXZ >", value, "XMXZ");
            return (Criteria) this;
        }

        public Criteria andXMXZGreaterThanOrEqualTo(String value) {
            addCriterion("XMXZ >=", value, "XMXZ");
            return (Criteria) this;
        }

        public Criteria andXMXZLessThan(String value) {
            addCriterion("XMXZ <", value, "XMXZ");
            return (Criteria) this;
        }

        public Criteria andXMXZLessThanOrEqualTo(String value) {
            addCriterion("XMXZ <=", value, "XMXZ");
            return (Criteria) this;
        }

        public Criteria andXMXZLike(String value) {
            addCriterion("XMXZ like", value, "XMXZ");
            return (Criteria) this;
        }

        public Criteria andXMXZNotLike(String value) {
            addCriterion("XMXZ not like", value, "XMXZ");
            return (Criteria) this;
        }

        public Criteria andXMXZIn(List<String> values) {
            addCriterion("XMXZ in", values, "XMXZ");
            return (Criteria) this;
        }

        public Criteria andXMXZNotIn(List<String> values) {
            addCriterion("XMXZ not in", values, "XMXZ");
            return (Criteria) this;
        }

        public Criteria andXMXZBetween(String value1, String value2) {
            addCriterion("XMXZ between", value1, value2, "XMXZ");
            return (Criteria) this;
        }

        public Criteria andXMXZNotBetween(String value1, String value2) {
            addCriterion("XMXZ not between", value1, value2, "XMXZ");
            return (Criteria) this;
        }

        public Criteria andXMKGSJIsNull() {
            addCriterion("XMKGSJ is null");
            return (Criteria) this;
        }

        public Criteria andXMKGSJIsNotNull() {
            addCriterion("XMKGSJ is not null");
            return (Criteria) this;
        }

        public Criteria andXMKGSJEqualTo(Date value) {
            addCriterion("XMKGSJ =", value, "XMKGSJ");
            return (Criteria) this;
        }

        public Criteria andXMKGSJNotEqualTo(Date value) {
            addCriterion("XMKGSJ <>", value, "XMKGSJ");
            return (Criteria) this;
        }

        public Criteria andXMKGSJGreaterThan(Date value) {
            addCriterion("XMKGSJ >", value, "XMKGSJ");
            return (Criteria) this;
        }

        public Criteria andXMKGSJGreaterThanOrEqualTo(Date value) {
            addCriterion("XMKGSJ >=", value, "XMKGSJ");
            return (Criteria) this;
        }

        public Criteria andXMKGSJLessThan(Date value) {
            addCriterion("XMKGSJ <", value, "XMKGSJ");
            return (Criteria) this;
        }

        public Criteria andXMKGSJLessThanOrEqualTo(Date value) {
            addCriterion("XMKGSJ <=", value, "XMKGSJ");
            return (Criteria) this;
        }

        public Criteria andXMKGSJIn(List<Date> values) {
            addCriterion("XMKGSJ in", values, "XMKGSJ");
            return (Criteria) this;
        }

        public Criteria andXMKGSJNotIn(List<Date> values) {
            addCriterion("XMKGSJ not in", values, "XMKGSJ");
            return (Criteria) this;
        }

        public Criteria andXMKGSJBetween(Date value1, Date value2) {
            addCriterion("XMKGSJ between", value1, value2, "XMKGSJ");
            return (Criteria) this;
        }

        public Criteria andXMKGSJNotBetween(Date value1, Date value2) {
            addCriterion("XMKGSJ not between", value1, value2, "XMKGSJ");
            return (Criteria) this;
        }

        public Criteria andXMJGSJIsNull() {
            addCriterion("XMJGSJ is null");
            return (Criteria) this;
        }

        public Criteria andXMJGSJIsNotNull() {
            addCriterion("XMJGSJ is not null");
            return (Criteria) this;
        }

        public Criteria andXMJGSJEqualTo(Date value) {
            addCriterion("XMJGSJ =", value, "XMJGSJ");
            return (Criteria) this;
        }

        public Criteria andXMJGSJNotEqualTo(Date value) {
            addCriterion("XMJGSJ <>", value, "XMJGSJ");
            return (Criteria) this;
        }

        public Criteria andXMJGSJGreaterThan(Date value) {
            addCriterion("XMJGSJ >", value, "XMJGSJ");
            return (Criteria) this;
        }

        public Criteria andXMJGSJGreaterThanOrEqualTo(Date value) {
            addCriterion("XMJGSJ >=", value, "XMJGSJ");
            return (Criteria) this;
        }

        public Criteria andXMJGSJLessThan(Date value) {
            addCriterion("XMJGSJ <", value, "XMJGSJ");
            return (Criteria) this;
        }

        public Criteria andXMJGSJLessThanOrEqualTo(Date value) {
            addCriterion("XMJGSJ <=", value, "XMJGSJ");
            return (Criteria) this;
        }

        public Criteria andXMJGSJIn(List<Date> values) {
            addCriterion("XMJGSJ in", values, "XMJGSJ");
            return (Criteria) this;
        }

        public Criteria andXMJGSJNotIn(List<Date> values) {
            addCriterion("XMJGSJ not in", values, "XMJGSJ");
            return (Criteria) this;
        }

        public Criteria andXMJGSJBetween(Date value1, Date value2) {
            addCriterion("XMJGSJ between", value1, value2, "XMJGSJ");
            return (Criteria) this;
        }

        public Criteria andXMJGSJNotBetween(Date value1, Date value2) {
            addCriterion("XMJGSJ not between", value1, value2, "XMJGSJ");
            return (Criteria) this;
        }

        public Criteria andJGJSRQIsNull() {
            addCriterion("JGJSRQ is null");
            return (Criteria) this;
        }

        public Criteria andJGJSRQIsNotNull() {
            addCriterion("JGJSRQ is not null");
            return (Criteria) this;
        }

        public Criteria andJGJSRQEqualTo(Date value) {
            addCriterion("JGJSRQ =", value, "JGJSRQ");
            return (Criteria) this;
        }

        public Criteria andJGJSRQNotEqualTo(Date value) {
            addCriterion("JGJSRQ <>", value, "JGJSRQ");
            return (Criteria) this;
        }

        public Criteria andJGJSRQGreaterThan(Date value) {
            addCriterion("JGJSRQ >", value, "JGJSRQ");
            return (Criteria) this;
        }

        public Criteria andJGJSRQGreaterThanOrEqualTo(Date value) {
            addCriterion("JGJSRQ >=", value, "JGJSRQ");
            return (Criteria) this;
        }

        public Criteria andJGJSRQLessThan(Date value) {
            addCriterion("JGJSRQ <", value, "JGJSRQ");
            return (Criteria) this;
        }

        public Criteria andJGJSRQLessThanOrEqualTo(Date value) {
            addCriterion("JGJSRQ <=", value, "JGJSRQ");
            return (Criteria) this;
        }

        public Criteria andJGJSRQIn(List<Date> values) {
            addCriterion("JGJSRQ in", values, "JGJSRQ");
            return (Criteria) this;
        }

        public Criteria andJGJSRQNotIn(List<Date> values) {
            addCriterion("JGJSRQ not in", values, "JGJSRQ");
            return (Criteria) this;
        }

        public Criteria andJGJSRQBetween(Date value1, Date value2) {
            addCriterion("JGJSRQ between", value1, value2, "JGJSRQ");
            return (Criteria) this;
        }

        public Criteria andJGJSRQNotBetween(Date value1, Date value2) {
            addCriterion("JGJSRQ not between", value1, value2, "JGJSRQ");
            return (Criteria) this;
        }

        public Criteria andYKGTJSIsNull() {
            addCriterion("YKGTJS is null");
            return (Criteria) this;
        }

        public Criteria andYKGTJSIsNotNull() {
            addCriterion("YKGTJS is not null");
            return (Criteria) this;
        }

        public Criteria andYKGTJSEqualTo(Integer value) {
            addCriterion("YKGTJS =", value, "YKGTJS");
            return (Criteria) this;
        }

        public Criteria andYKGTJSNotEqualTo(Integer value) {
            addCriterion("YKGTJS <>", value, "YKGTJS");
            return (Criteria) this;
        }

        public Criteria andYKGTJSGreaterThan(Integer value) {
            addCriterion("YKGTJS >", value, "YKGTJS");
            return (Criteria) this;
        }

        public Criteria andYKGTJSGreaterThanOrEqualTo(Integer value) {
            addCriterion("YKGTJS >=", value, "YKGTJS");
            return (Criteria) this;
        }

        public Criteria andYKGTJSLessThan(Integer value) {
            addCriterion("YKGTJS <", value, "YKGTJS");
            return (Criteria) this;
        }

        public Criteria andYKGTJSLessThanOrEqualTo(Integer value) {
            addCriterion("YKGTJS <=", value, "YKGTJS");
            return (Criteria) this;
        }

        public Criteria andYKGTJSIn(List<Integer> values) {
            addCriterion("YKGTJS in", values, "YKGTJS");
            return (Criteria) this;
        }

        public Criteria andYKGTJSNotIn(List<Integer> values) {
            addCriterion("YKGTJS not in", values, "YKGTJS");
            return (Criteria) this;
        }

        public Criteria andYKGTJSBetween(Integer value1, Integer value2) {
            addCriterion("YKGTJS between", value1, value2, "YKGTJS");
            return (Criteria) this;
        }

        public Criteria andYKGTJSNotBetween(Integer value1, Integer value2) {
            addCriterion("YKGTJS not between", value1, value2, "YKGTJS");
            return (Criteria) this;
        }

        public Criteria andZJTJSIsNull() {
            addCriterion("ZJTJS is null");
            return (Criteria) this;
        }

        public Criteria andZJTJSIsNotNull() {
            addCriterion("ZJTJS is not null");
            return (Criteria) this;
        }

        public Criteria andZJTJSEqualTo(Integer value) {
            addCriterion("ZJTJS =", value, "ZJTJS");
            return (Criteria) this;
        }

        public Criteria andZJTJSNotEqualTo(Integer value) {
            addCriterion("ZJTJS <>", value, "ZJTJS");
            return (Criteria) this;
        }

        public Criteria andZJTJSGreaterThan(Integer value) {
            addCriterion("ZJTJS >", value, "ZJTJS");
            return (Criteria) this;
        }

        public Criteria andZJTJSGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZJTJS >=", value, "ZJTJS");
            return (Criteria) this;
        }

        public Criteria andZJTJSLessThan(Integer value) {
            addCriterion("ZJTJS <", value, "ZJTJS");
            return (Criteria) this;
        }

        public Criteria andZJTJSLessThanOrEqualTo(Integer value) {
            addCriterion("ZJTJS <=", value, "ZJTJS");
            return (Criteria) this;
        }

        public Criteria andZJTJSIn(List<Integer> values) {
            addCriterion("ZJTJS in", values, "ZJTJS");
            return (Criteria) this;
        }

        public Criteria andZJTJSNotIn(List<Integer> values) {
            addCriterion("ZJTJS not in", values, "ZJTJS");
            return (Criteria) this;
        }

        public Criteria andZJTJSBetween(Integer value1, Integer value2) {
            addCriterion("ZJTJS between", value1, value2, "ZJTJS");
            return (Criteria) this;
        }

        public Criteria andZJTJSNotBetween(Integer value1, Integer value2) {
            addCriterion("ZJTJS not between", value1, value2, "ZJTJS");
            return (Criteria) this;
        }

        public Criteria andYJGTJSIsNull() {
            addCriterion("YJGTJS is null");
            return (Criteria) this;
        }

        public Criteria andYJGTJSIsNotNull() {
            addCriterion("YJGTJS is not null");
            return (Criteria) this;
        }

        public Criteria andYJGTJSEqualTo(Integer value) {
            addCriterion("YJGTJS =", value, "YJGTJS");
            return (Criteria) this;
        }

        public Criteria andYJGTJSNotEqualTo(Integer value) {
            addCriterion("YJGTJS <>", value, "YJGTJS");
            return (Criteria) this;
        }

        public Criteria andYJGTJSGreaterThan(Integer value) {
            addCriterion("YJGTJS >", value, "YJGTJS");
            return (Criteria) this;
        }

        public Criteria andYJGTJSGreaterThanOrEqualTo(Integer value) {
            addCriterion("YJGTJS >=", value, "YJGTJS");
            return (Criteria) this;
        }

        public Criteria andYJGTJSLessThan(Integer value) {
            addCriterion("YJGTJS <", value, "YJGTJS");
            return (Criteria) this;
        }

        public Criteria andYJGTJSLessThanOrEqualTo(Integer value) {
            addCriterion("YJGTJS <=", value, "YJGTJS");
            return (Criteria) this;
        }

        public Criteria andYJGTJSIn(List<Integer> values) {
            addCriterion("YJGTJS in", values, "YJGTJS");
            return (Criteria) this;
        }

        public Criteria andYJGTJSNotIn(List<Integer> values) {
            addCriterion("YJGTJS not in", values, "YJGTJS");
            return (Criteria) this;
        }

        public Criteria andYJGTJSBetween(Integer value1, Integer value2) {
            addCriterion("YJGTJS between", value1, value2, "YJGTJS");
            return (Criteria) this;
        }

        public Criteria andYJGTJSNotBetween(Integer value1, Integer value2) {
            addCriterion("YJGTJS not between", value1, value2, "YJGTJS");
            return (Criteria) this;
        }

        public Criteria andYFPTJSIsNull() {
            addCriterion("YFPTJS is null");
            return (Criteria) this;
        }

        public Criteria andYFPTJSIsNotNull() {
            addCriterion("YFPTJS is not null");
            return (Criteria) this;
        }

        public Criteria andYFPTJSEqualTo(Integer value) {
            addCriterion("YFPTJS =", value, "YFPTJS");
            return (Criteria) this;
        }

        public Criteria andYFPTJSNotEqualTo(Integer value) {
            addCriterion("YFPTJS <>", value, "YFPTJS");
            return (Criteria) this;
        }

        public Criteria andYFPTJSGreaterThan(Integer value) {
            addCriterion("YFPTJS >", value, "YFPTJS");
            return (Criteria) this;
        }

        public Criteria andYFPTJSGreaterThanOrEqualTo(Integer value) {
            addCriterion("YFPTJS >=", value, "YFPTJS");
            return (Criteria) this;
        }

        public Criteria andYFPTJSLessThan(Integer value) {
            addCriterion("YFPTJS <", value, "YFPTJS");
            return (Criteria) this;
        }

        public Criteria andYFPTJSLessThanOrEqualTo(Integer value) {
            addCriterion("YFPTJS <=", value, "YFPTJS");
            return (Criteria) this;
        }

        public Criteria andYFPTJSIn(List<Integer> values) {
            addCriterion("YFPTJS in", values, "YFPTJS");
            return (Criteria) this;
        }

        public Criteria andYFPTJSNotIn(List<Integer> values) {
            addCriterion("YFPTJS not in", values, "YFPTJS");
            return (Criteria) this;
        }

        public Criteria andYFPTJSBetween(Integer value1, Integer value2) {
            addCriterion("YFPTJS between", value1, value2, "YFPTJS");
            return (Criteria) this;
        }

        public Criteria andYFPTJSNotBetween(Integer value1, Integer value2) {
            addCriterion("YFPTJS not between", value1, value2, "YFPTJS");
            return (Criteria) this;
        }

        public Criteria andBYWHDWIsNull() {
            addCriterion("BYWHDW is null");
            return (Criteria) this;
        }

        public Criteria andBYWHDWIsNotNull() {
            addCriterion("BYWHDW is not null");
            return (Criteria) this;
        }

        public Criteria andBYWHDWEqualTo(String value) {
            addCriterion("BYWHDW =", value, "BYWHDW");
            return (Criteria) this;
        }

        public Criteria andBYWHDWNotEqualTo(String value) {
            addCriterion("BYWHDW <>", value, "BYWHDW");
            return (Criteria) this;
        }

        public Criteria andBYWHDWGreaterThan(String value) {
            addCriterion("BYWHDW >", value, "BYWHDW");
            return (Criteria) this;
        }

        public Criteria andBYWHDWGreaterThanOrEqualTo(String value) {
            addCriterion("BYWHDW >=", value, "BYWHDW");
            return (Criteria) this;
        }

        public Criteria andBYWHDWLessThan(String value) {
            addCriterion("BYWHDW <", value, "BYWHDW");
            return (Criteria) this;
        }

        public Criteria andBYWHDWLessThanOrEqualTo(String value) {
            addCriterion("BYWHDW <=", value, "BYWHDW");
            return (Criteria) this;
        }

        public Criteria andBYWHDWLike(String value) {
            addCriterion("BYWHDW like", value, "BYWHDW");
            return (Criteria) this;
        }

        public Criteria andBYWHDWNotLike(String value) {
            addCriterion("BYWHDW not like", value, "BYWHDW");
            return (Criteria) this;
        }

        public Criteria andBYWHDWIn(List<String> values) {
            addCriterion("BYWHDW in", values, "BYWHDW");
            return (Criteria) this;
        }

        public Criteria andBYWHDWNotIn(List<String> values) {
            addCriterion("BYWHDW not in", values, "BYWHDW");
            return (Criteria) this;
        }

        public Criteria andBYWHDWBetween(String value1, String value2) {
            addCriterion("BYWHDW between", value1, value2, "BYWHDW");
            return (Criteria) this;
        }

        public Criteria andBYWHDWNotBetween(String value1, String value2) {
            addCriterion("BYWHDW not between", value1, value2, "BYWHDW");
            return (Criteria) this;
        }

        public Criteria andJFSYRQIsNull() {
            addCriterion("JFSYRQ is null");
            return (Criteria) this;
        }

        public Criteria andJFSYRQIsNotNull() {
            addCriterion("JFSYRQ is not null");
            return (Criteria) this;
        }

        public Criteria andJFSYRQEqualTo(Date value) {
            addCriterion("JFSYRQ =", value, "JFSYRQ");
            return (Criteria) this;
        }

        public Criteria andJFSYRQNotEqualTo(Date value) {
            addCriterion("JFSYRQ <>", value, "JFSYRQ");
            return (Criteria) this;
        }

        public Criteria andJFSYRQGreaterThan(Date value) {
            addCriterion("JFSYRQ >", value, "JFSYRQ");
            return (Criteria) this;
        }

        public Criteria andJFSYRQGreaterThanOrEqualTo(Date value) {
            addCriterion("JFSYRQ >=", value, "JFSYRQ");
            return (Criteria) this;
        }

        public Criteria andJFSYRQLessThan(Date value) {
            addCriterion("JFSYRQ <", value, "JFSYRQ");
            return (Criteria) this;
        }

        public Criteria andJFSYRQLessThanOrEqualTo(Date value) {
            addCriterion("JFSYRQ <=", value, "JFSYRQ");
            return (Criteria) this;
        }

        public Criteria andJFSYRQIn(List<Date> values) {
            addCriterion("JFSYRQ in", values, "JFSYRQ");
            return (Criteria) this;
        }

        public Criteria andJFSYRQNotIn(List<Date> values) {
            addCriterion("JFSYRQ not in", values, "JFSYRQ");
            return (Criteria) this;
        }

        public Criteria andJFSYRQBetween(Date value1, Date value2) {
            addCriterion("JFSYRQ between", value1, value2, "JFSYRQ");
            return (Criteria) this;
        }

        public Criteria andJFSYRQNotBetween(Date value1, Date value2) {
            addCriterion("JFSYRQ not between", value1, value2, "JFSYRQ");
            return (Criteria) this;
        }

        public Criteria andZJLYIsNull() {
            addCriterion("ZJLY is null");
            return (Criteria) this;
        }

        public Criteria andZJLYIsNotNull() {
            addCriterion("ZJLY is not null");
            return (Criteria) this;
        }

        public Criteria andZJLYEqualTo(String value) {
            addCriterion("ZJLY =", value, "ZJLY");
            return (Criteria) this;
        }

        public Criteria andZJLYNotEqualTo(String value) {
            addCriterion("ZJLY <>", value, "ZJLY");
            return (Criteria) this;
        }

        public Criteria andZJLYGreaterThan(String value) {
            addCriterion("ZJLY >", value, "ZJLY");
            return (Criteria) this;
        }

        public Criteria andZJLYGreaterThanOrEqualTo(String value) {
            addCriterion("ZJLY >=", value, "ZJLY");
            return (Criteria) this;
        }

        public Criteria andZJLYLessThan(String value) {
            addCriterion("ZJLY <", value, "ZJLY");
            return (Criteria) this;
        }

        public Criteria andZJLYLessThanOrEqualTo(String value) {
            addCriterion("ZJLY <=", value, "ZJLY");
            return (Criteria) this;
        }

        public Criteria andZJLYLike(String value) {
            addCriterion("ZJLY like", value, "ZJLY");
            return (Criteria) this;
        }

        public Criteria andZJLYNotLike(String value) {
            addCriterion("ZJLY not like", value, "ZJLY");
            return (Criteria) this;
        }

        public Criteria andZJLYIn(List<String> values) {
            addCriterion("ZJLY in", values, "ZJLY");
            return (Criteria) this;
        }

        public Criteria andZJLYNotIn(List<String> values) {
            addCriterion("ZJLY not in", values, "ZJLY");
            return (Criteria) this;
        }

        public Criteria andZJLYBetween(String value1, String value2) {
            addCriterion("ZJLY between", value1, value2, "ZJLY");
            return (Criteria) this;
        }

        public Criteria andZJLYNotBetween(String value1, String value2) {
            addCriterion("ZJLY not between", value1, value2, "ZJLY");
            return (Criteria) this;
        }

        public Criteria andTDHQSJIsNull() {
            addCriterion("TDHQSJ is null");
            return (Criteria) this;
        }

        public Criteria andTDHQSJIsNotNull() {
            addCriterion("TDHQSJ is not null");
            return (Criteria) this;
        }

        public Criteria andTDHQSJEqualTo(Date value) {
            addCriterion("TDHQSJ =", value, "TDHQSJ");
            return (Criteria) this;
        }

        public Criteria andTDHQSJNotEqualTo(Date value) {
            addCriterion("TDHQSJ <>", value, "TDHQSJ");
            return (Criteria) this;
        }

        public Criteria andTDHQSJGreaterThan(Date value) {
            addCriterion("TDHQSJ >", value, "TDHQSJ");
            return (Criteria) this;
        }

        public Criteria andTDHQSJGreaterThanOrEqualTo(Date value) {
            addCriterion("TDHQSJ >=", value, "TDHQSJ");
            return (Criteria) this;
        }

        public Criteria andTDHQSJLessThan(Date value) {
            addCriterion("TDHQSJ <", value, "TDHQSJ");
            return (Criteria) this;
        }

        public Criteria andTDHQSJLessThanOrEqualTo(Date value) {
            addCriterion("TDHQSJ <=", value, "TDHQSJ");
            return (Criteria) this;
        }

        public Criteria andTDHQSJIn(List<Date> values) {
            addCriterion("TDHQSJ in", values, "TDHQSJ");
            return (Criteria) this;
        }

        public Criteria andTDHQSJNotIn(List<Date> values) {
            addCriterion("TDHQSJ not in", values, "TDHQSJ");
            return (Criteria) this;
        }

        public Criteria andTDHQSJBetween(Date value1, Date value2) {
            addCriterion("TDHQSJ between", value1, value2, "TDHQSJ");
            return (Criteria) this;
        }

        public Criteria andTDHQSJNotBetween(Date value1, Date value2) {
            addCriterion("TDHQSJ not between", value1, value2, "TDHQSJ");
            return (Criteria) this;
        }

        public Criteria andTDFYIsNull() {
            addCriterion("TDFY is null");
            return (Criteria) this;
        }

        public Criteria andTDFYIsNotNull() {
            addCriterion("TDFY is not null");
            return (Criteria) this;
        }

        public Criteria andTDFYEqualTo(BigDecimal value) {
            addCriterion("TDFY =", value, "TDFY");
            return (Criteria) this;
        }

        public Criteria andTDFYNotEqualTo(BigDecimal value) {
            addCriterion("TDFY <>", value, "TDFY");
            return (Criteria) this;
        }

        public Criteria andTDFYGreaterThan(BigDecimal value) {
            addCriterion("TDFY >", value, "TDFY");
            return (Criteria) this;
        }

        public Criteria andTDFYGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TDFY >=", value, "TDFY");
            return (Criteria) this;
        }

        public Criteria andTDFYLessThan(BigDecimal value) {
            addCriterion("TDFY <", value, "TDFY");
            return (Criteria) this;
        }

        public Criteria andTDFYLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TDFY <=", value, "TDFY");
            return (Criteria) this;
        }

        public Criteria andTDFYIn(List<BigDecimal> values) {
            addCriterion("TDFY in", values, "TDFY");
            return (Criteria) this;
        }

        public Criteria andTDFYNotIn(List<BigDecimal> values) {
            addCriterion("TDFY not in", values, "TDFY");
            return (Criteria) this;
        }

        public Criteria andTDFYBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TDFY between", value1, value2, "TDFY");
            return (Criteria) this;
        }

        public Criteria andTDFYNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TDFY not between", value1, value2, "TDFY");
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

        public Criteria andCQSYRIsNull() {
            addCriterion("CQSYR is null");
            return (Criteria) this;
        }

        public Criteria andCQSYRIsNotNull() {
            addCriterion("CQSYR is not null");
            return (Criteria) this;
        }

        public Criteria andCQSYREqualTo(String value) {
            addCriterion("CQSYR =", value, "CQSYR");
            return (Criteria) this;
        }

        public Criteria andCQSYRNotEqualTo(String value) {
            addCriterion("CQSYR <>", value, "CQSYR");
            return (Criteria) this;
        }

        public Criteria andCQSYRGreaterThan(String value) {
            addCriterion("CQSYR >", value, "CQSYR");
            return (Criteria) this;
        }

        public Criteria andCQSYRGreaterThanOrEqualTo(String value) {
            addCriterion("CQSYR >=", value, "CQSYR");
            return (Criteria) this;
        }

        public Criteria andCQSYRLessThan(String value) {
            addCriterion("CQSYR <", value, "CQSYR");
            return (Criteria) this;
        }

        public Criteria andCQSYRLessThanOrEqualTo(String value) {
            addCriterion("CQSYR <=", value, "CQSYR");
            return (Criteria) this;
        }

        public Criteria andCQSYRLike(String value) {
            addCriterion("CQSYR like", value, "CQSYR");
            return (Criteria) this;
        }

        public Criteria andCQSYRNotLike(String value) {
            addCriterion("CQSYR not like", value, "CQSYR");
            return (Criteria) this;
        }

        public Criteria andCQSYRIn(List<String> values) {
            addCriterion("CQSYR in", values, "CQSYR");
            return (Criteria) this;
        }

        public Criteria andCQSYRNotIn(List<String> values) {
            addCriterion("CQSYR not in", values, "CQSYR");
            return (Criteria) this;
        }

        public Criteria andCQSYRBetween(String value1, String value2) {
            addCriterion("CQSYR between", value1, value2, "CQSYR");
            return (Criteria) this;
        }

        public Criteria andCQSYRNotBetween(String value1, String value2) {
            addCriterion("CQSYR not between", value1, value2, "CQSYR");
            return (Criteria) this;
        }

        public Criteria andCQZBHIsNull() {
            addCriterion("CQZBH is null");
            return (Criteria) this;
        }

        public Criteria andCQZBHIsNotNull() {
            addCriterion("CQZBH is not null");
            return (Criteria) this;
        }

        public Criteria andCQZBHEqualTo(String value) {
            addCriterion("CQZBH =", value, "CQZBH");
            return (Criteria) this;
        }

        public Criteria andCQZBHNotEqualTo(String value) {
            addCriterion("CQZBH <>", value, "CQZBH");
            return (Criteria) this;
        }

        public Criteria andCQZBHGreaterThan(String value) {
            addCriterion("CQZBH >", value, "CQZBH");
            return (Criteria) this;
        }

        public Criteria andCQZBHGreaterThanOrEqualTo(String value) {
            addCriterion("CQZBH >=", value, "CQZBH");
            return (Criteria) this;
        }

        public Criteria andCQZBHLessThan(String value) {
            addCriterion("CQZBH <", value, "CQZBH");
            return (Criteria) this;
        }

        public Criteria andCQZBHLessThanOrEqualTo(String value) {
            addCriterion("CQZBH <=", value, "CQZBH");
            return (Criteria) this;
        }

        public Criteria andCQZBHLike(String value) {
            addCriterion("CQZBH like", value, "CQZBH");
            return (Criteria) this;
        }

        public Criteria andCQZBHNotLike(String value) {
            addCriterion("CQZBH not like", value, "CQZBH");
            return (Criteria) this;
        }

        public Criteria andCQZBHIn(List<String> values) {
            addCriterion("CQZBH in", values, "CQZBH");
            return (Criteria) this;
        }

        public Criteria andCQZBHNotIn(List<String> values) {
            addCriterion("CQZBH not in", values, "CQZBH");
            return (Criteria) this;
        }

        public Criteria andCQZBHBetween(String value1, String value2) {
            addCriterion("CQZBH between", value1, value2, "CQZBH");
            return (Criteria) this;
        }

        public Criteria andCQZBHNotBetween(String value1, String value2) {
            addCriterion("CQZBH not between", value1, value2, "CQZBH");
            return (Criteria) this;
        }

        public Criteria andJHLBIsNull() {
            addCriterion("JHLB is null");
            return (Criteria) this;
        }

        public Criteria andJHLBIsNotNull() {
            addCriterion("JHLB is not null");
            return (Criteria) this;
        }

        public Criteria andJHLBEqualTo(String value) {
            addCriterion("JHLB =", value, "JHLB");
            return (Criteria) this;
        }

        public Criteria andJHLBNotEqualTo(String value) {
            addCriterion("JHLB <>", value, "JHLB");
            return (Criteria) this;
        }

        public Criteria andJHLBGreaterThan(String value) {
            addCriterion("JHLB >", value, "JHLB");
            return (Criteria) this;
        }

        public Criteria andJHLBGreaterThanOrEqualTo(String value) {
            addCriterion("JHLB >=", value, "JHLB");
            return (Criteria) this;
        }

        public Criteria andJHLBLessThan(String value) {
            addCriterion("JHLB <", value, "JHLB");
            return (Criteria) this;
        }

        public Criteria andJHLBLessThanOrEqualTo(String value) {
            addCriterion("JHLB <=", value, "JHLB");
            return (Criteria) this;
        }

        public Criteria andJHLBLike(String value) {
            addCriterion("JHLB like", value, "JHLB");
            return (Criteria) this;
        }

        public Criteria andJHLBNotLike(String value) {
            addCriterion("JHLB not like", value, "JHLB");
            return (Criteria) this;
        }

        public Criteria andJHLBIn(List<String> values) {
            addCriterion("JHLB in", values, "JHLB");
            return (Criteria) this;
        }

        public Criteria andJHLBNotIn(List<String> values) {
            addCriterion("JHLB not in", values, "JHLB");
            return (Criteria) this;
        }

        public Criteria andJHLBBetween(String value1, String value2) {
            addCriterion("JHLB between", value1, value2, "JHLB");
            return (Criteria) this;
        }

        public Criteria andJHLBNotBetween(String value1, String value2) {
            addCriterion("JHLB not between", value1, value2, "JHLB");
            return (Criteria) this;
        }

        public Criteria andLRJHNDIsNull() {
            addCriterion("LRJHND is null");
            return (Criteria) this;
        }

        public Criteria andLRJHNDIsNotNull() {
            addCriterion("LRJHND is not null");
            return (Criteria) this;
        }

        public Criteria andLRJHNDEqualTo(Date value) {
            addCriterion("LRJHND =", value, "LRJHND");
            return (Criteria) this;
        }

        public Criteria andLRJHNDNotEqualTo(Date value) {
            addCriterion("LRJHND <>", value, "LRJHND");
            return (Criteria) this;
        }

        public Criteria andLRJHNDGreaterThan(Date value) {
            addCriterion("LRJHND >", value, "LRJHND");
            return (Criteria) this;
        }

        public Criteria andLRJHNDGreaterThanOrEqualTo(Date value) {
            addCriterion("LRJHND >=", value, "LRJHND");
            return (Criteria) this;
        }

        public Criteria andLRJHNDLessThan(Date value) {
            addCriterion("LRJHND <", value, "LRJHND");
            return (Criteria) this;
        }

        public Criteria andLRJHNDLessThanOrEqualTo(Date value) {
            addCriterion("LRJHND <=", value, "LRJHND");
            return (Criteria) this;
        }

        public Criteria andLRJHNDIn(List<Date> values) {
            addCriterion("LRJHND in", values, "LRJHND");
            return (Criteria) this;
        }

        public Criteria andLRJHNDNotIn(List<Date> values) {
            addCriterion("LRJHND not in", values, "LRJHND");
            return (Criteria) this;
        }

        public Criteria andLRJHNDBetween(Date value1, Date value2) {
            addCriterion("LRJHND between", value1, value2, "LRJHND");
            return (Criteria) this;
        }

        public Criteria andLRJHNDNotBetween(Date value1, Date value2) {
            addCriterion("LRJHND not between", value1, value2, "LRJHND");
            return (Criteria) this;
        }

        public Criteria andZTZIsNull() {
            addCriterion("ZTZ is null");
            return (Criteria) this;
        }

        public Criteria andZTZIsNotNull() {
            addCriterion("ZTZ is not null");
            return (Criteria) this;
        }

        public Criteria andZTZEqualTo(BigDecimal value) {
            addCriterion("ZTZ =", value, "ZTZ");
            return (Criteria) this;
        }

        public Criteria andZTZNotEqualTo(BigDecimal value) {
            addCriterion("ZTZ <>", value, "ZTZ");
            return (Criteria) this;
        }

        public Criteria andZTZGreaterThan(BigDecimal value) {
            addCriterion("ZTZ >", value, "ZTZ");
            return (Criteria) this;
        }

        public Criteria andZTZGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZTZ >=", value, "ZTZ");
            return (Criteria) this;
        }

        public Criteria andZTZLessThan(BigDecimal value) {
            addCriterion("ZTZ <", value, "ZTZ");
            return (Criteria) this;
        }

        public Criteria andZTZLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZTZ <=", value, "ZTZ");
            return (Criteria) this;
        }

        public Criteria andZTZIn(List<BigDecimal> values) {
            addCriterion("ZTZ in", values, "ZTZ");
            return (Criteria) this;
        }

        public Criteria andZTZNotIn(List<BigDecimal> values) {
            addCriterion("ZTZ not in", values, "ZTZ");
            return (Criteria) this;
        }

        public Criteria andZTZBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZTZ between", value1, value2, "ZTZ");
            return (Criteria) this;
        }

        public Criteria andZTZNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZTZ not between", value1, value2, "ZTZ");
            return (Criteria) this;
        }

        public Criteria andXMFZRIsNull() {
            addCriterion("XMFZR is null");
            return (Criteria) this;
        }

        public Criteria andXMFZRIsNotNull() {
            addCriterion("XMFZR is not null");
            return (Criteria) this;
        }

        public Criteria andXMFZREqualTo(String value) {
            addCriterion("XMFZR =", value, "XMFZR");
            return (Criteria) this;
        }

        public Criteria andXMFZRNotEqualTo(String value) {
            addCriterion("XMFZR <>", value, "XMFZR");
            return (Criteria) this;
        }

        public Criteria andXMFZRGreaterThan(String value) {
            addCriterion("XMFZR >", value, "XMFZR");
            return (Criteria) this;
        }

        public Criteria andXMFZRGreaterThanOrEqualTo(String value) {
            addCriterion("XMFZR >=", value, "XMFZR");
            return (Criteria) this;
        }

        public Criteria andXMFZRLessThan(String value) {
            addCriterion("XMFZR <", value, "XMFZR");
            return (Criteria) this;
        }

        public Criteria andXMFZRLessThanOrEqualTo(String value) {
            addCriterion("XMFZR <=", value, "XMFZR");
            return (Criteria) this;
        }

        public Criteria andXMFZRLike(String value) {
            addCriterion("XMFZR like", value, "XMFZR");
            return (Criteria) this;
        }

        public Criteria andXMFZRNotLike(String value) {
            addCriterion("XMFZR not like", value, "XMFZR");
            return (Criteria) this;
        }

        public Criteria andXMFZRIn(List<String> values) {
            addCriterion("XMFZR in", values, "XMFZR");
            return (Criteria) this;
        }

        public Criteria andXMFZRNotIn(List<String> values) {
            addCriterion("XMFZR not in", values, "XMFZR");
            return (Criteria) this;
        }

        public Criteria andXMFZRBetween(String value1, String value2) {
            addCriterion("XMFZR between", value1, value2, "XMFZR");
            return (Criteria) this;
        }

        public Criteria andXMFZRNotBetween(String value1, String value2) {
            addCriterion("XMFZR not between", value1, value2, "XMFZR");
            return (Criteria) this;
        }

        public Criteria andJSDWMCIsNull() {
            addCriterion("JSDWMC is null");
            return (Criteria) this;
        }

        public Criteria andJSDWMCIsNotNull() {
            addCriterion("JSDWMC is not null");
            return (Criteria) this;
        }

        public Criteria andJSDWMCEqualTo(String value) {
            addCriterion("JSDWMC =", value, "JSDWMC");
            return (Criteria) this;
        }

        public Criteria andJSDWMCNotEqualTo(String value) {
            addCriterion("JSDWMC <>", value, "JSDWMC");
            return (Criteria) this;
        }

        public Criteria andJSDWMCGreaterThan(String value) {
            addCriterion("JSDWMC >", value, "JSDWMC");
            return (Criteria) this;
        }

        public Criteria andJSDWMCGreaterThanOrEqualTo(String value) {
            addCriterion("JSDWMC >=", value, "JSDWMC");
            return (Criteria) this;
        }

        public Criteria andJSDWMCLessThan(String value) {
            addCriterion("JSDWMC <", value, "JSDWMC");
            return (Criteria) this;
        }

        public Criteria andJSDWMCLessThanOrEqualTo(String value) {
            addCriterion("JSDWMC <=", value, "JSDWMC");
            return (Criteria) this;
        }

        public Criteria andJSDWMCLike(String value) {
            addCriterion("JSDWMC like", value, "JSDWMC");
            return (Criteria) this;
        }

        public Criteria andJSDWMCNotLike(String value) {
            addCriterion("JSDWMC not like", value, "JSDWMC");
            return (Criteria) this;
        }

        public Criteria andJSDWMCIn(List<String> values) {
            addCriterion("JSDWMC in", values, "JSDWMC");
            return (Criteria) this;
        }

        public Criteria andJSDWMCNotIn(List<String> values) {
            addCriterion("JSDWMC not in", values, "JSDWMC");
            return (Criteria) this;
        }

        public Criteria andJSDWMCBetween(String value1, String value2) {
            addCriterion("JSDWMC between", value1, value2, "JSDWMC");
            return (Criteria) this;
        }

        public Criteria andJSDWMCNotBetween(String value1, String value2) {
            addCriterion("JSDWMC not between", value1, value2, "JSDWMC");
            return (Criteria) this;
        }

        public Criteria andJSDWZZJGDMIsNull() {
            addCriterion("JSDWZZJGDM is null");
            return (Criteria) this;
        }

        public Criteria andJSDWZZJGDMIsNotNull() {
            addCriterion("JSDWZZJGDM is not null");
            return (Criteria) this;
        }

        public Criteria andJSDWZZJGDMEqualTo(String value) {
            addCriterion("JSDWZZJGDM =", value, "JSDWZZJGDM");
            return (Criteria) this;
        }

        public Criteria andJSDWZZJGDMNotEqualTo(String value) {
            addCriterion("JSDWZZJGDM <>", value, "JSDWZZJGDM");
            return (Criteria) this;
        }

        public Criteria andJSDWZZJGDMGreaterThan(String value) {
            addCriterion("JSDWZZJGDM >", value, "JSDWZZJGDM");
            return (Criteria) this;
        }

        public Criteria andJSDWZZJGDMGreaterThanOrEqualTo(String value) {
            addCriterion("JSDWZZJGDM >=", value, "JSDWZZJGDM");
            return (Criteria) this;
        }

        public Criteria andJSDWZZJGDMLessThan(String value) {
            addCriterion("JSDWZZJGDM <", value, "JSDWZZJGDM");
            return (Criteria) this;
        }

        public Criteria andJSDWZZJGDMLessThanOrEqualTo(String value) {
            addCriterion("JSDWZZJGDM <=", value, "JSDWZZJGDM");
            return (Criteria) this;
        }

        public Criteria andJSDWZZJGDMLike(String value) {
            addCriterion("JSDWZZJGDM like", value, "JSDWZZJGDM");
            return (Criteria) this;
        }

        public Criteria andJSDWZZJGDMNotLike(String value) {
            addCriterion("JSDWZZJGDM not like", value, "JSDWZZJGDM");
            return (Criteria) this;
        }

        public Criteria andJSDWZZJGDMIn(List<String> values) {
            addCriterion("JSDWZZJGDM in", values, "JSDWZZJGDM");
            return (Criteria) this;
        }

        public Criteria andJSDWZZJGDMNotIn(List<String> values) {
            addCriterion("JSDWZZJGDM not in", values, "JSDWZZJGDM");
            return (Criteria) this;
        }

        public Criteria andJSDWZZJGDMBetween(String value1, String value2) {
            addCriterion("JSDWZZJGDM between", value1, value2, "JSDWZZJGDM");
            return (Criteria) this;
        }

        public Criteria andJSDWZZJGDMNotBetween(String value1, String value2) {
            addCriterion("JSDWZZJGDM not between", value1, value2, "JSDWZZJGDM");
            return (Criteria) this;
        }

        public Criteria andPTGJMJIsNull() {
            addCriterion("PTGJMJ is null");
            return (Criteria) this;
        }

        public Criteria andPTGJMJIsNotNull() {
            addCriterion("PTGJMJ is not null");
            return (Criteria) this;
        }

        public Criteria andPTGJMJEqualTo(BigDecimal value) {
            addCriterion("PTGJMJ =", value, "PTGJMJ");
            return (Criteria) this;
        }

        public Criteria andPTGJMJNotEqualTo(BigDecimal value) {
            addCriterion("PTGJMJ <>", value, "PTGJMJ");
            return (Criteria) this;
        }

        public Criteria andPTGJMJGreaterThan(BigDecimal value) {
            addCriterion("PTGJMJ >", value, "PTGJMJ");
            return (Criteria) this;
        }

        public Criteria andPTGJMJGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PTGJMJ >=", value, "PTGJMJ");
            return (Criteria) this;
        }

        public Criteria andPTGJMJLessThan(BigDecimal value) {
            addCriterion("PTGJMJ <", value, "PTGJMJ");
            return (Criteria) this;
        }

        public Criteria andPTGJMJLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PTGJMJ <=", value, "PTGJMJ");
            return (Criteria) this;
        }

        public Criteria andPTGJMJIn(List<BigDecimal> values) {
            addCriterion("PTGJMJ in", values, "PTGJMJ");
            return (Criteria) this;
        }

        public Criteria andPTGJMJNotIn(List<BigDecimal> values) {
            addCriterion("PTGJMJ not in", values, "PTGJMJ");
            return (Criteria) this;
        }

        public Criteria andPTGJMJBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PTGJMJ between", value1, value2, "PTGJMJ");
            return (Criteria) this;
        }

        public Criteria andPTGJMJNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PTGJMJ not between", value1, value2, "PTGJMJ");
            return (Criteria) this;
        }

        public Criteria andPTSYYFMJIsNull() {
            addCriterion("PTSYYFMJ is null");
            return (Criteria) this;
        }

        public Criteria andPTSYYFMJIsNotNull() {
            addCriterion("PTSYYFMJ is not null");
            return (Criteria) this;
        }

        public Criteria andPTSYYFMJEqualTo(BigDecimal value) {
            addCriterion("PTSYYFMJ =", value, "PTSYYFMJ");
            return (Criteria) this;
        }

        public Criteria andPTSYYFMJNotEqualTo(BigDecimal value) {
            addCriterion("PTSYYFMJ <>", value, "PTSYYFMJ");
            return (Criteria) this;
        }

        public Criteria andPTSYYFMJGreaterThan(BigDecimal value) {
            addCriterion("PTSYYFMJ >", value, "PTSYYFMJ");
            return (Criteria) this;
        }

        public Criteria andPTSYYFMJGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PTSYYFMJ >=", value, "PTSYYFMJ");
            return (Criteria) this;
        }

        public Criteria andPTSYYFMJLessThan(BigDecimal value) {
            addCriterion("PTSYYFMJ <", value, "PTSYYFMJ");
            return (Criteria) this;
        }

        public Criteria andPTSYYFMJLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PTSYYFMJ <=", value, "PTSYYFMJ");
            return (Criteria) this;
        }

        public Criteria andPTSYYFMJIn(List<BigDecimal> values) {
            addCriterion("PTSYYFMJ in", values, "PTSYYFMJ");
            return (Criteria) this;
        }

        public Criteria andPTSYYFMJNotIn(List<BigDecimal> values) {
            addCriterion("PTSYYFMJ not in", values, "PTSYYFMJ");
            return (Criteria) this;
        }

        public Criteria andPTSYYFMJBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PTSYYFMJ between", value1, value2, "PTSYYFMJ");
            return (Criteria) this;
        }

        public Criteria andPTSYYFMJNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PTSYYFMJ not between", value1, value2, "PTSYYFMJ");
            return (Criteria) this;
        }

        public Criteria andTZZTIsNull() {
            addCriterion("TZZT is null");
            return (Criteria) this;
        }

        public Criteria andTZZTIsNotNull() {
            addCriterion("TZZT is not null");
            return (Criteria) this;
        }

        public Criteria andTZZTEqualTo(String value) {
            addCriterion("TZZT =", value, "TZZT");
            return (Criteria) this;
        }

        public Criteria andTZZTNotEqualTo(String value) {
            addCriterion("TZZT <>", value, "TZZT");
            return (Criteria) this;
        }

        public Criteria andTZZTGreaterThan(String value) {
            addCriterion("TZZT >", value, "TZZT");
            return (Criteria) this;
        }

        public Criteria andTZZTGreaterThanOrEqualTo(String value) {
            addCriterion("TZZT >=", value, "TZZT");
            return (Criteria) this;
        }

        public Criteria andTZZTLessThan(String value) {
            addCriterion("TZZT <", value, "TZZT");
            return (Criteria) this;
        }

        public Criteria andTZZTLessThanOrEqualTo(String value) {
            addCriterion("TZZT <=", value, "TZZT");
            return (Criteria) this;
        }

        public Criteria andTZZTLike(String value) {
            addCriterion("TZZT like", value, "TZZT");
            return (Criteria) this;
        }

        public Criteria andTZZTNotLike(String value) {
            addCriterion("TZZT not like", value, "TZZT");
            return (Criteria) this;
        }

        public Criteria andTZZTIn(List<String> values) {
            addCriterion("TZZT in", values, "TZZT");
            return (Criteria) this;
        }

        public Criteria andTZZTNotIn(List<String> values) {
            addCriterion("TZZT not in", values, "TZZT");
            return (Criteria) this;
        }

        public Criteria andTZZTBetween(String value1, String value2) {
            addCriterion("TZZT between", value1, value2, "TZZT");
            return (Criteria) this;
        }

        public Criteria andTZZTNotBetween(String value1, String value2) {
            addCriterion("TZZT not between", value1, value2, "TZZT");
            return (Criteria) this;
        }

        public Criteria andXMLYIsNull() {
            addCriterion("XMLY is null");
            return (Criteria) this;
        }

        public Criteria andXMLYIsNotNull() {
            addCriterion("XMLY is not null");
            return (Criteria) this;
        }

        public Criteria andXMLYEqualTo(String value) {
            addCriterion("XMLY =", value, "XMLY");
            return (Criteria) this;
        }

        public Criteria andXMLYNotEqualTo(String value) {
            addCriterion("XMLY <>", value, "XMLY");
            return (Criteria) this;
        }

        public Criteria andXMLYGreaterThan(String value) {
            addCriterion("XMLY >", value, "XMLY");
            return (Criteria) this;
        }

        public Criteria andXMLYGreaterThanOrEqualTo(String value) {
            addCriterion("XMLY >=", value, "XMLY");
            return (Criteria) this;
        }

        public Criteria andXMLYLessThan(String value) {
            addCriterion("XMLY <", value, "XMLY");
            return (Criteria) this;
        }

        public Criteria andXMLYLessThanOrEqualTo(String value) {
            addCriterion("XMLY <=", value, "XMLY");
            return (Criteria) this;
        }

        public Criteria andXMLYLike(String value) {
            addCriterion("XMLY like", value, "XMLY");
            return (Criteria) this;
        }

        public Criteria andXMLYNotLike(String value) {
            addCriterion("XMLY not like", value, "XMLY");
            return (Criteria) this;
        }

        public Criteria andXMLYIn(List<String> values) {
            addCriterion("XMLY in", values, "XMLY");
            return (Criteria) this;
        }

        public Criteria andXMLYNotIn(List<String> values) {
            addCriterion("XMLY not in", values, "XMLY");
            return (Criteria) this;
        }

        public Criteria andXMLYBetween(String value1, String value2) {
            addCriterion("XMLY between", value1, value2, "XMLY");
            return (Criteria) this;
        }

        public Criteria andXMLYNotBetween(String value1, String value2) {
            addCriterion("XMLY not between", value1, value2, "XMLY");
            return (Criteria) this;
        }

        public Criteria andGHCODEIsNull() {
            addCriterion("GHCODE is null");
            return (Criteria) this;
        }

        public Criteria andGHCODEIsNotNull() {
            addCriterion("GHCODE is not null");
            return (Criteria) this;
        }

        public Criteria andGHCODEEqualTo(String value) {
            addCriterion("GHCODE =", value, "GHCODE");
            return (Criteria) this;
        }

        public Criteria andGHCODENotEqualTo(String value) {
            addCriterion("GHCODE <>", value, "GHCODE");
            return (Criteria) this;
        }

        public Criteria andGHCODEGreaterThan(String value) {
            addCriterion("GHCODE >", value, "GHCODE");
            return (Criteria) this;
        }

        public Criteria andGHCODEGreaterThanOrEqualTo(String value) {
            addCriterion("GHCODE >=", value, "GHCODE");
            return (Criteria) this;
        }

        public Criteria andGHCODELessThan(String value) {
            addCriterion("GHCODE <", value, "GHCODE");
            return (Criteria) this;
        }

        public Criteria andGHCODELessThanOrEqualTo(String value) {
            addCriterion("GHCODE <=", value, "GHCODE");
            return (Criteria) this;
        }

        public Criteria andGHCODELike(String value) {
            addCriterion("GHCODE like", value, "GHCODE");
            return (Criteria) this;
        }

        public Criteria andGHCODENotLike(String value) {
            addCriterion("GHCODE not like", value, "GHCODE");
            return (Criteria) this;
        }

        public Criteria andGHCODEIn(List<String> values) {
            addCriterion("GHCODE in", values, "GHCODE");
            return (Criteria) this;
        }

        public Criteria andGHCODENotIn(List<String> values) {
            addCriterion("GHCODE not in", values, "GHCODE");
            return (Criteria) this;
        }

        public Criteria andGHCODEBetween(String value1, String value2) {
            addCriterion("GHCODE between", value1, value2, "GHCODE");
            return (Criteria) this;
        }

        public Criteria andGHCODENotBetween(String value1, String value2) {
            addCriterion("GHCODE not between", value1, value2, "GHCODE");
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
