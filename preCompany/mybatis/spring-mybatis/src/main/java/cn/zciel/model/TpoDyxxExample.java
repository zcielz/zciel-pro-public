package cn.zciel.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TpoDyxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public TpoDyxxExample() {
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

        public Criteria andXMIDIsNull() {
            addCriterion("XMID is null");
            return (Criteria) this;
        }

        public Criteria andXMIDIsNotNull() {
            addCriterion("XMID is not null");
            return (Criteria) this;
        }

        public Criteria andXMIDEqualTo(String value) {
            addCriterion("XMID =", value, "XMID");
            return (Criteria) this;
        }

        public Criteria andXMIDNotEqualTo(String value) {
            addCriterion("XMID <>", value, "XMID");
            return (Criteria) this;
        }

        public Criteria andXMIDGreaterThan(String value) {
            addCriterion("XMID >", value, "XMID");
            return (Criteria) this;
        }

        public Criteria andXMIDGreaterThanOrEqualTo(String value) {
            addCriterion("XMID >=", value, "XMID");
            return (Criteria) this;
        }

        public Criteria andXMIDLessThan(String value) {
            addCriterion("XMID <", value, "XMID");
            return (Criteria) this;
        }

        public Criteria andXMIDLessThanOrEqualTo(String value) {
            addCriterion("XMID <=", value, "XMID");
            return (Criteria) this;
        }

        public Criteria andXMIDLike(String value) {
            addCriterion("XMID like", value, "XMID");
            return (Criteria) this;
        }

        public Criteria andXMIDNotLike(String value) {
            addCriterion("XMID not like", value, "XMID");
            return (Criteria) this;
        }

        public Criteria andXMIDIn(List<String> values) {
            addCriterion("XMID in", values, "XMID");
            return (Criteria) this;
        }

        public Criteria andXMIDNotIn(List<String> values) {
            addCriterion("XMID not in", values, "XMID");
            return (Criteria) this;
        }

        public Criteria andXMIDBetween(String value1, String value2) {
            addCriterion("XMID between", value1, value2, "XMID");
            return (Criteria) this;
        }

        public Criteria andXMIDNotBetween(String value1, String value2) {
            addCriterion("XMID not between", value1, value2, "XMID");
            return (Criteria) this;
        }

        public Criteria andXMCODEIsNull() {
            addCriterion("XMCODE is null");
            return (Criteria) this;
        }

        public Criteria andXMCODEIsNotNull() {
            addCriterion("XMCODE is not null");
            return (Criteria) this;
        }

        public Criteria andXMCODEEqualTo(String value) {
            addCriterion("XMCODE =", value, "XMCODE");
            return (Criteria) this;
        }

        public Criteria andXMCODENotEqualTo(String value) {
            addCriterion("XMCODE <>", value, "XMCODE");
            return (Criteria) this;
        }

        public Criteria andXMCODEGreaterThan(String value) {
            addCriterion("XMCODE >", value, "XMCODE");
            return (Criteria) this;
        }

        public Criteria andXMCODEGreaterThanOrEqualTo(String value) {
            addCriterion("XMCODE >=", value, "XMCODE");
            return (Criteria) this;
        }

        public Criteria andXMCODELessThan(String value) {
            addCriterion("XMCODE <", value, "XMCODE");
            return (Criteria) this;
        }

        public Criteria andXMCODELessThanOrEqualTo(String value) {
            addCriterion("XMCODE <=", value, "XMCODE");
            return (Criteria) this;
        }

        public Criteria andXMCODELike(String value) {
            addCriterion("XMCODE like", value, "XMCODE");
            return (Criteria) this;
        }

        public Criteria andXMCODENotLike(String value) {
            addCriterion("XMCODE not like", value, "XMCODE");
            return (Criteria) this;
        }

        public Criteria andXMCODEIn(List<String> values) {
            addCriterion("XMCODE in", values, "XMCODE");
            return (Criteria) this;
        }

        public Criteria andXMCODENotIn(List<String> values) {
            addCriterion("XMCODE not in", values, "XMCODE");
            return (Criteria) this;
        }

        public Criteria andXMCODEBetween(String value1, String value2) {
            addCriterion("XMCODE between", value1, value2, "XMCODE");
            return (Criteria) this;
        }

        public Criteria andXMCODENotBetween(String value1, String value2) {
            addCriterion("XMCODE not between", value1, value2, "XMCODE");
            return (Criteria) this;
        }

        public Criteria andZRZIDIsNull() {
            addCriterion("ZRZID is null");
            return (Criteria) this;
        }

        public Criteria andZRZIDIsNotNull() {
            addCriterion("ZRZID is not null");
            return (Criteria) this;
        }

        public Criteria andZRZIDEqualTo(String value) {
            addCriterion("ZRZID =", value, "ZRZID");
            return (Criteria) this;
        }

        public Criteria andZRZIDNotEqualTo(String value) {
            addCriterion("ZRZID <>", value, "ZRZID");
            return (Criteria) this;
        }

        public Criteria andZRZIDGreaterThan(String value) {
            addCriterion("ZRZID >", value, "ZRZID");
            return (Criteria) this;
        }

        public Criteria andZRZIDGreaterThanOrEqualTo(String value) {
            addCriterion("ZRZID >=", value, "ZRZID");
            return (Criteria) this;
        }

        public Criteria andZRZIDLessThan(String value) {
            addCriterion("ZRZID <", value, "ZRZID");
            return (Criteria) this;
        }

        public Criteria andZRZIDLessThanOrEqualTo(String value) {
            addCriterion("ZRZID <=", value, "ZRZID");
            return (Criteria) this;
        }

        public Criteria andZRZIDLike(String value) {
            addCriterion("ZRZID like", value, "ZRZID");
            return (Criteria) this;
        }

        public Criteria andZRZIDNotLike(String value) {
            addCriterion("ZRZID not like", value, "ZRZID");
            return (Criteria) this;
        }

        public Criteria andZRZIDIn(List<String> values) {
            addCriterion("ZRZID in", values, "ZRZID");
            return (Criteria) this;
        }

        public Criteria andZRZIDNotIn(List<String> values) {
            addCriterion("ZRZID not in", values, "ZRZID");
            return (Criteria) this;
        }

        public Criteria andZRZIDBetween(String value1, String value2) {
            addCriterion("ZRZID between", value1, value2, "ZRZID");
            return (Criteria) this;
        }

        public Criteria andZRZIDNotBetween(String value1, String value2) {
            addCriterion("ZRZID not between", value1, value2, "ZRZID");
            return (Criteria) this;
        }

        public Criteria andZRZCODEIsNull() {
            addCriterion("ZRZCODE is null");
            return (Criteria) this;
        }

        public Criteria andZRZCODEIsNotNull() {
            addCriterion("ZRZCODE is not null");
            return (Criteria) this;
        }

        public Criteria andZRZCODEEqualTo(String value) {
            addCriterion("ZRZCODE =", value, "ZRZCODE");
            return (Criteria) this;
        }

        public Criteria andZRZCODENotEqualTo(String value) {
            addCriterion("ZRZCODE <>", value, "ZRZCODE");
            return (Criteria) this;
        }

        public Criteria andZRZCODEGreaterThan(String value) {
            addCriterion("ZRZCODE >", value, "ZRZCODE");
            return (Criteria) this;
        }

        public Criteria andZRZCODEGreaterThanOrEqualTo(String value) {
            addCriterion("ZRZCODE >=", value, "ZRZCODE");
            return (Criteria) this;
        }

        public Criteria andZRZCODELessThan(String value) {
            addCriterion("ZRZCODE <", value, "ZRZCODE");
            return (Criteria) this;
        }

        public Criteria andZRZCODELessThanOrEqualTo(String value) {
            addCriterion("ZRZCODE <=", value, "ZRZCODE");
            return (Criteria) this;
        }

        public Criteria andZRZCODELike(String value) {
            addCriterion("ZRZCODE like", value, "ZRZCODE");
            return (Criteria) this;
        }

        public Criteria andZRZCODENotLike(String value) {
            addCriterion("ZRZCODE not like", value, "ZRZCODE");
            return (Criteria) this;
        }

        public Criteria andZRZCODEIn(List<String> values) {
            addCriterion("ZRZCODE in", values, "ZRZCODE");
            return (Criteria) this;
        }

        public Criteria andZRZCODENotIn(List<String> values) {
            addCriterion("ZRZCODE not in", values, "ZRZCODE");
            return (Criteria) this;
        }

        public Criteria andZRZCODEBetween(String value1, String value2) {
            addCriterion("ZRZCODE between", value1, value2, "ZRZCODE");
            return (Criteria) this;
        }

        public Criteria andZRZCODENotBetween(String value1, String value2) {
            addCriterion("ZRZCODE not between", value1, value2, "ZRZCODE");
            return (Criteria) this;
        }

        public Criteria andZRZHIsNull() {
            addCriterion("ZRZH is null");
            return (Criteria) this;
        }

        public Criteria andZRZHIsNotNull() {
            addCriterion("ZRZH is not null");
            return (Criteria) this;
        }

        public Criteria andZRZHEqualTo(String value) {
            addCriterion("ZRZH =", value, "ZRZH");
            return (Criteria) this;
        }

        public Criteria andZRZHNotEqualTo(String value) {
            addCriterion("ZRZH <>", value, "ZRZH");
            return (Criteria) this;
        }

        public Criteria andZRZHGreaterThan(String value) {
            addCriterion("ZRZH >", value, "ZRZH");
            return (Criteria) this;
        }

        public Criteria andZRZHGreaterThanOrEqualTo(String value) {
            addCriterion("ZRZH >=", value, "ZRZH");
            return (Criteria) this;
        }

        public Criteria andZRZHLessThan(String value) {
            addCriterion("ZRZH <", value, "ZRZH");
            return (Criteria) this;
        }

        public Criteria andZRZHLessThanOrEqualTo(String value) {
            addCriterion("ZRZH <=", value, "ZRZH");
            return (Criteria) this;
        }

        public Criteria andZRZHLike(String value) {
            addCriterion("ZRZH like", value, "ZRZH");
            return (Criteria) this;
        }

        public Criteria andZRZHNotLike(String value) {
            addCriterion("ZRZH not like", value, "ZRZH");
            return (Criteria) this;
        }

        public Criteria andZRZHIn(List<String> values) {
            addCriterion("ZRZH in", values, "ZRZH");
            return (Criteria) this;
        }

        public Criteria andZRZHNotIn(List<String> values) {
            addCriterion("ZRZH not in", values, "ZRZH");
            return (Criteria) this;
        }

        public Criteria andZRZHBetween(String value1, String value2) {
            addCriterion("ZRZH between", value1, value2, "ZRZH");
            return (Criteria) this;
        }

        public Criteria andZRZHNotBetween(String value1, String value2) {
            addCriterion("ZRZH not between", value1, value2, "ZRZH");
            return (Criteria) this;
        }

        public Criteria andDYHIsNull() {
            addCriterion("DYH is null");
            return (Criteria) this;
        }

        public Criteria andDYHIsNotNull() {
            addCriterion("DYH is not null");
            return (Criteria) this;
        }

        public Criteria andDYHEqualTo(String value) {
            addCriterion("DYH =", value, "DYH");
            return (Criteria) this;
        }

        public Criteria andDYHNotEqualTo(String value) {
            addCriterion("DYH <>", value, "DYH");
            return (Criteria) this;
        }

        public Criteria andDYHGreaterThan(String value) {
            addCriterion("DYH >", value, "DYH");
            return (Criteria) this;
        }

        public Criteria andDYHGreaterThanOrEqualTo(String value) {
            addCriterion("DYH >=", value, "DYH");
            return (Criteria) this;
        }

        public Criteria andDYHLessThan(String value) {
            addCriterion("DYH <", value, "DYH");
            return (Criteria) this;
        }

        public Criteria andDYHLessThanOrEqualTo(String value) {
            addCriterion("DYH <=", value, "DYH");
            return (Criteria) this;
        }

        public Criteria andDYHLike(String value) {
            addCriterion("DYH like", value, "DYH");
            return (Criteria) this;
        }

        public Criteria andDYHNotLike(String value) {
            addCriterion("DYH not like", value, "DYH");
            return (Criteria) this;
        }

        public Criteria andDYHIn(List<String> values) {
            addCriterion("DYH in", values, "DYH");
            return (Criteria) this;
        }

        public Criteria andDYHNotIn(List<String> values) {
            addCriterion("DYH not in", values, "DYH");
            return (Criteria) this;
        }

        public Criteria andDYHBetween(String value1, String value2) {
            addCriterion("DYH between", value1, value2, "DYH");
            return (Criteria) this;
        }

        public Criteria andDYHNotBetween(String value1, String value2) {
            addCriterion("DYH not between", value1, value2, "DYH");
            return (Criteria) this;
        }

        public Criteria andDYMCIsNull() {
            addCriterion("DYMC is null");
            return (Criteria) this;
        }

        public Criteria andDYMCIsNotNull() {
            addCriterion("DYMC is not null");
            return (Criteria) this;
        }

        public Criteria andDYMCEqualTo(String value) {
            addCriterion("DYMC =", value, "DYMC");
            return (Criteria) this;
        }

        public Criteria andDYMCNotEqualTo(String value) {
            addCriterion("DYMC <>", value, "DYMC");
            return (Criteria) this;
        }

        public Criteria andDYMCGreaterThan(String value) {
            addCriterion("DYMC >", value, "DYMC");
            return (Criteria) this;
        }

        public Criteria andDYMCGreaterThanOrEqualTo(String value) {
            addCriterion("DYMC >=", value, "DYMC");
            return (Criteria) this;
        }

        public Criteria andDYMCLessThan(String value) {
            addCriterion("DYMC <", value, "DYMC");
            return (Criteria) this;
        }

        public Criteria andDYMCLessThanOrEqualTo(String value) {
            addCriterion("DYMC <=", value, "DYMC");
            return (Criteria) this;
        }

        public Criteria andDYMCLike(String value) {
            addCriterion("DYMC like", value, "DYMC");
            return (Criteria) this;
        }

        public Criteria andDYMCNotLike(String value) {
            addCriterion("DYMC not like", value, "DYMC");
            return (Criteria) this;
        }

        public Criteria andDYMCIn(List<String> values) {
            addCriterion("DYMC in", values, "DYMC");
            return (Criteria) this;
        }

        public Criteria andDYMCNotIn(List<String> values) {
            addCriterion("DYMC not in", values, "DYMC");
            return (Criteria) this;
        }

        public Criteria andDYMCBetween(String value1, String value2) {
            addCriterion("DYMC between", value1, value2, "DYMC");
            return (Criteria) this;
        }

        public Criteria andDYMCNotBetween(String value1, String value2) {
            addCriterion("DYMC not between", value1, value2, "DYMC");
            return (Criteria) this;
        }

        public Criteria andZCSIsNull() {
            addCriterion("ZCS is null");
            return (Criteria) this;
        }

        public Criteria andZCSIsNotNull() {
            addCriterion("ZCS is not null");
            return (Criteria) this;
        }

        public Criteria andZCSEqualTo(Integer value) {
            addCriterion("ZCS =", value, "ZCS");
            return (Criteria) this;
        }

        public Criteria andZCSNotEqualTo(Integer value) {
            addCriterion("ZCS <>", value, "ZCS");
            return (Criteria) this;
        }

        public Criteria andZCSGreaterThan(Integer value) {
            addCriterion("ZCS >", value, "ZCS");
            return (Criteria) this;
        }

        public Criteria andZCSGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZCS >=", value, "ZCS");
            return (Criteria) this;
        }

        public Criteria andZCSLessThan(Integer value) {
            addCriterion("ZCS <", value, "ZCS");
            return (Criteria) this;
        }

        public Criteria andZCSLessThanOrEqualTo(Integer value) {
            addCriterion("ZCS <=", value, "ZCS");
            return (Criteria) this;
        }

        public Criteria andZCSIn(List<Integer> values) {
            addCriterion("ZCS in", values, "ZCS");
            return (Criteria) this;
        }

        public Criteria andZCSNotIn(List<Integer> values) {
            addCriterion("ZCS not in", values, "ZCS");
            return (Criteria) this;
        }

        public Criteria andZCSBetween(Integer value1, Integer value2) {
            addCriterion("ZCS between", value1, value2, "ZCS");
            return (Criteria) this;
        }

        public Criteria andZCSNotBetween(Integer value1, Integer value2) {
            addCriterion("ZCS not between", value1, value2, "ZCS");
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
