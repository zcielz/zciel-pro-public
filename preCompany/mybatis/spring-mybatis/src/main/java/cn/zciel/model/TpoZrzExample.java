package cn.zciel.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TpoZrzExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public TpoZrzExample() {
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

        public Criteria andSGZHIsNull() {
            addCriterion("SGZH is null");
            return (Criteria) this;
        }

        public Criteria andSGZHIsNotNull() {
            addCriterion("SGZH is not null");
            return (Criteria) this;
        }

        public Criteria andSGZHEqualTo(String value) {
            addCriterion("SGZH =", value, "SGZH");
            return (Criteria) this;
        }

        public Criteria andSGZHNotEqualTo(String value) {
            addCriterion("SGZH <>", value, "SGZH");
            return (Criteria) this;
        }

        public Criteria andSGZHGreaterThan(String value) {
            addCriterion("SGZH >", value, "SGZH");
            return (Criteria) this;
        }

        public Criteria andSGZHGreaterThanOrEqualTo(String value) {
            addCriterion("SGZH >=", value, "SGZH");
            return (Criteria) this;
        }

        public Criteria andSGZHLessThan(String value) {
            addCriterion("SGZH <", value, "SGZH");
            return (Criteria) this;
        }

        public Criteria andSGZHLessThanOrEqualTo(String value) {
            addCriterion("SGZH <=", value, "SGZH");
            return (Criteria) this;
        }

        public Criteria andSGZHLike(String value) {
            addCriterion("SGZH like", value, "SGZH");
            return (Criteria) this;
        }

        public Criteria andSGZHNotLike(String value) {
            addCriterion("SGZH not like", value, "SGZH");
            return (Criteria) this;
        }

        public Criteria andSGZHIn(List<String> values) {
            addCriterion("SGZH in", values, "SGZH");
            return (Criteria) this;
        }

        public Criteria andSGZHNotIn(List<String> values) {
            addCriterion("SGZH not in", values, "SGZH");
            return (Criteria) this;
        }

        public Criteria andSGZHBetween(String value1, String value2) {
            addCriterion("SGZH between", value1, value2, "SGZH");
            return (Criteria) this;
        }

        public Criteria andSGZHNotBetween(String value1, String value2) {
            addCriterion("SGZH not between", value1, value2, "SGZH");
            return (Criteria) this;
        }

        public Criteria andCHLXIsNull() {
            addCriterion("CHLX is null");
            return (Criteria) this;
        }

        public Criteria andCHLXIsNotNull() {
            addCriterion("CHLX is not null");
            return (Criteria) this;
        }

        public Criteria andCHLXEqualTo(String value) {
            addCriterion("CHLX =", value, "CHLX");
            return (Criteria) this;
        }

        public Criteria andCHLXNotEqualTo(String value) {
            addCriterion("CHLX <>", value, "CHLX");
            return (Criteria) this;
        }

        public Criteria andCHLXGreaterThan(String value) {
            addCriterion("CHLX >", value, "CHLX");
            return (Criteria) this;
        }

        public Criteria andCHLXGreaterThanOrEqualTo(String value) {
            addCriterion("CHLX >=", value, "CHLX");
            return (Criteria) this;
        }

        public Criteria andCHLXLessThan(String value) {
            addCriterion("CHLX <", value, "CHLX");
            return (Criteria) this;
        }

        public Criteria andCHLXLessThanOrEqualTo(String value) {
            addCriterion("CHLX <=", value, "CHLX");
            return (Criteria) this;
        }

        public Criteria andCHLXLike(String value) {
            addCriterion("CHLX like", value, "CHLX");
            return (Criteria) this;
        }

        public Criteria andCHLXNotLike(String value) {
            addCriterion("CHLX not like", value, "CHLX");
            return (Criteria) this;
        }

        public Criteria andCHLXIn(List<String> values) {
            addCriterion("CHLX in", values, "CHLX");
            return (Criteria) this;
        }

        public Criteria andCHLXNotIn(List<String> values) {
            addCriterion("CHLX not in", values, "CHLX");
            return (Criteria) this;
        }

        public Criteria andCHLXBetween(String value1, String value2) {
            addCriterion("CHLX between", value1, value2, "CHLX");
            return (Criteria) this;
        }

        public Criteria andCHLXNotBetween(String value1, String value2) {
            addCriterion("CHLX not between", value1, value2, "CHLX");
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

        public Criteria andZRZZLIsNull() {
            addCriterion("ZRZZL is null");
            return (Criteria) this;
        }

        public Criteria andZRZZLIsNotNull() {
            addCriterion("ZRZZL is not null");
            return (Criteria) this;
        }

        public Criteria andZRZZLEqualTo(String value) {
            addCriterion("ZRZZL =", value, "ZRZZL");
            return (Criteria) this;
        }

        public Criteria andZRZZLNotEqualTo(String value) {
            addCriterion("ZRZZL <>", value, "ZRZZL");
            return (Criteria) this;
        }

        public Criteria andZRZZLGreaterThan(String value) {
            addCriterion("ZRZZL >", value, "ZRZZL");
            return (Criteria) this;
        }

        public Criteria andZRZZLGreaterThanOrEqualTo(String value) {
            addCriterion("ZRZZL >=", value, "ZRZZL");
            return (Criteria) this;
        }

        public Criteria andZRZZLLessThan(String value) {
            addCriterion("ZRZZL <", value, "ZRZZL");
            return (Criteria) this;
        }

        public Criteria andZRZZLLessThanOrEqualTo(String value) {
            addCriterion("ZRZZL <=", value, "ZRZZL");
            return (Criteria) this;
        }

        public Criteria andZRZZLLike(String value) {
            addCriterion("ZRZZL like", value, "ZRZZL");
            return (Criteria) this;
        }

        public Criteria andZRZZLNotLike(String value) {
            addCriterion("ZRZZL not like", value, "ZRZZL");
            return (Criteria) this;
        }

        public Criteria andZRZZLIn(List<String> values) {
            addCriterion("ZRZZL in", values, "ZRZZL");
            return (Criteria) this;
        }

        public Criteria andZRZZLNotIn(List<String> values) {
            addCriterion("ZRZZL not in", values, "ZRZZL");
            return (Criteria) this;
        }

        public Criteria andZRZZLBetween(String value1, String value2) {
            addCriterion("ZRZZL between", value1, value2, "ZRZZL");
            return (Criteria) this;
        }

        public Criteria andZRZZLNotBetween(String value1, String value2) {
            addCriterion("ZRZZL not between", value1, value2, "ZRZZL");
            return (Criteria) this;
        }

        public Criteria andZMCIsNull() {
            addCriterion("ZMC is null");
            return (Criteria) this;
        }

        public Criteria andZMCIsNotNull() {
            addCriterion("ZMC is not null");
            return (Criteria) this;
        }

        public Criteria andZMCEqualTo(String value) {
            addCriterion("ZMC =", value, "ZMC");
            return (Criteria) this;
        }

        public Criteria andZMCNotEqualTo(String value) {
            addCriterion("ZMC <>", value, "ZMC");
            return (Criteria) this;
        }

        public Criteria andZMCGreaterThan(String value) {
            addCriterion("ZMC >", value, "ZMC");
            return (Criteria) this;
        }

        public Criteria andZMCGreaterThanOrEqualTo(String value) {
            addCriterion("ZMC >=", value, "ZMC");
            return (Criteria) this;
        }

        public Criteria andZMCLessThan(String value) {
            addCriterion("ZMC <", value, "ZMC");
            return (Criteria) this;
        }

        public Criteria andZMCLessThanOrEqualTo(String value) {
            addCriterion("ZMC <=", value, "ZMC");
            return (Criteria) this;
        }

        public Criteria andZMCLike(String value) {
            addCriterion("ZMC like", value, "ZMC");
            return (Criteria) this;
        }

        public Criteria andZMCNotLike(String value) {
            addCriterion("ZMC not like", value, "ZMC");
            return (Criteria) this;
        }

        public Criteria andZMCIn(List<String> values) {
            addCriterion("ZMC in", values, "ZMC");
            return (Criteria) this;
        }

        public Criteria andZMCNotIn(List<String> values) {
            addCriterion("ZMC not in", values, "ZMC");
            return (Criteria) this;
        }

        public Criteria andZMCBetween(String value1, String value2) {
            addCriterion("ZMC between", value1, value2, "ZMC");
            return (Criteria) this;
        }

        public Criteria andZMCNotBetween(String value1, String value2) {
            addCriterion("ZMC not between", value1, value2, "ZMC");
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

        public Criteria andZCSEqualTo(String value) {
            addCriterion("ZCS =", value, "ZCS");
            return (Criteria) this;
        }

        public Criteria andZCSNotEqualTo(String value) {
            addCriterion("ZCS <>", value, "ZCS");
            return (Criteria) this;
        }

        public Criteria andZCSGreaterThan(String value) {
            addCriterion("ZCS >", value, "ZCS");
            return (Criteria) this;
        }

        public Criteria andZCSGreaterThanOrEqualTo(String value) {
            addCriterion("ZCS >=", value, "ZCS");
            return (Criteria) this;
        }

        public Criteria andZCSLessThan(String value) {
            addCriterion("ZCS <", value, "ZCS");
            return (Criteria) this;
        }

        public Criteria andZCSLessThanOrEqualTo(String value) {
            addCriterion("ZCS <=", value, "ZCS");
            return (Criteria) this;
        }

        public Criteria andZCSLike(String value) {
            addCriterion("ZCS like", value, "ZCS");
            return (Criteria) this;
        }

        public Criteria andZCSNotLike(String value) {
            addCriterion("ZCS not like", value, "ZCS");
            return (Criteria) this;
        }

        public Criteria andZCSIn(List<String> values) {
            addCriterion("ZCS in", values, "ZCS");
            return (Criteria) this;
        }

        public Criteria andZCSNotIn(List<String> values) {
            addCriterion("ZCS not in", values, "ZCS");
            return (Criteria) this;
        }

        public Criteria andZCSBetween(String value1, String value2) {
            addCriterion("ZCS between", value1, value2, "ZCS");
            return (Criteria) this;
        }

        public Criteria andZCSNotBetween(String value1, String value2) {
            addCriterion("ZCS not between", value1, value2, "ZCS");
            return (Criteria) this;
        }

        public Criteria andJZNFIsNull() {
            addCriterion("JZNF is null");
            return (Criteria) this;
        }

        public Criteria andJZNFIsNotNull() {
            addCriterion("JZNF is not null");
            return (Criteria) this;
        }

        public Criteria andJZNFEqualTo(Date value) {
            addCriterion("JZNF =", value, "JZNF");
            return (Criteria) this;
        }

        public Criteria andJZNFNotEqualTo(Date value) {
            addCriterion("JZNF <>", value, "JZNF");
            return (Criteria) this;
        }

        public Criteria andJZNFGreaterThan(Date value) {
            addCriterion("JZNF >", value, "JZNF");
            return (Criteria) this;
        }

        public Criteria andJZNFGreaterThanOrEqualTo(Date value) {
            addCriterion("JZNF >=", value, "JZNF");
            return (Criteria) this;
        }

        public Criteria andJZNFLessThan(Date value) {
            addCriterion("JZNF <", value, "JZNF");
            return (Criteria) this;
        }

        public Criteria andJZNFLessThanOrEqualTo(Date value) {
            addCriterion("JZNF <=", value, "JZNF");
            return (Criteria) this;
        }

        public Criteria andJZNFIn(List<Date> values) {
            addCriterion("JZNF in", values, "JZNF");
            return (Criteria) this;
        }

        public Criteria andJZNFNotIn(List<Date> values) {
            addCriterion("JZNF not in", values, "JZNF");
            return (Criteria) this;
        }

        public Criteria andJZNFBetween(Date value1, Date value2) {
            addCriterion("JZNF between", value1, value2, "JZNF");
            return (Criteria) this;
        }

        public Criteria andJZNFNotBetween(Date value1, Date value2) {
            addCriterion("JZNF not between", value1, value2, "JZNF");
            return (Criteria) this;
        }

        public Criteria andZTSIsNull() {
            addCriterion("ZTS is null");
            return (Criteria) this;
        }

        public Criteria andZTSIsNotNull() {
            addCriterion("ZTS is not null");
            return (Criteria) this;
        }

        public Criteria andZTSEqualTo(Integer value) {
            addCriterion("ZTS =", value, "ZTS");
            return (Criteria) this;
        }

        public Criteria andZTSNotEqualTo(Integer value) {
            addCriterion("ZTS <>", value, "ZTS");
            return (Criteria) this;
        }

        public Criteria andZTSGreaterThan(Integer value) {
            addCriterion("ZTS >", value, "ZTS");
            return (Criteria) this;
        }

        public Criteria andZTSGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZTS >=", value, "ZTS");
            return (Criteria) this;
        }

        public Criteria andZTSLessThan(Integer value) {
            addCriterion("ZTS <", value, "ZTS");
            return (Criteria) this;
        }

        public Criteria andZTSLessThanOrEqualTo(Integer value) {
            addCriterion("ZTS <=", value, "ZTS");
            return (Criteria) this;
        }

        public Criteria andZTSIn(List<Integer> values) {
            addCriterion("ZTS in", values, "ZTS");
            return (Criteria) this;
        }

        public Criteria andZTSNotIn(List<Integer> values) {
            addCriterion("ZTS not in", values, "ZTS");
            return (Criteria) this;
        }

        public Criteria andZTSBetween(Integer value1, Integer value2) {
            addCriterion("ZTS between", value1, value2, "ZTS");
            return (Criteria) this;
        }

        public Criteria andZTSNotBetween(Integer value1, Integer value2) {
            addCriterion("ZTS not between", value1, value2, "ZTS");
            return (Criteria) this;
        }

        public Criteria andDSCSIsNull() {
            addCriterion("DSCS is null");
            return (Criteria) this;
        }

        public Criteria andDSCSIsNotNull() {
            addCriterion("DSCS is not null");
            return (Criteria) this;
        }

        public Criteria andDSCSEqualTo(Integer value) {
            addCriterion("DSCS =", value, "DSCS");
            return (Criteria) this;
        }

        public Criteria andDSCSNotEqualTo(Integer value) {
            addCriterion("DSCS <>", value, "DSCS");
            return (Criteria) this;
        }

        public Criteria andDSCSGreaterThan(Integer value) {
            addCriterion("DSCS >", value, "DSCS");
            return (Criteria) this;
        }

        public Criteria andDSCSGreaterThanOrEqualTo(Integer value) {
            addCriterion("DSCS >=", value, "DSCS");
            return (Criteria) this;
        }

        public Criteria andDSCSLessThan(Integer value) {
            addCriterion("DSCS <", value, "DSCS");
            return (Criteria) this;
        }

        public Criteria andDSCSLessThanOrEqualTo(Integer value) {
            addCriterion("DSCS <=", value, "DSCS");
            return (Criteria) this;
        }

        public Criteria andDSCSIn(List<Integer> values) {
            addCriterion("DSCS in", values, "DSCS");
            return (Criteria) this;
        }

        public Criteria andDSCSNotIn(List<Integer> values) {
            addCriterion("DSCS not in", values, "DSCS");
            return (Criteria) this;
        }

        public Criteria andDSCSBetween(Integer value1, Integer value2) {
            addCriterion("DSCS between", value1, value2, "DSCS");
            return (Criteria) this;
        }

        public Criteria andDSCSNotBetween(Integer value1, Integer value2) {
            addCriterion("DSCS not between", value1, value2, "DSCS");
            return (Criteria) this;
        }

        public Criteria andDXCSIsNull() {
            addCriterion("DXCS is null");
            return (Criteria) this;
        }

        public Criteria andDXCSIsNotNull() {
            addCriterion("DXCS is not null");
            return (Criteria) this;
        }

        public Criteria andDXCSEqualTo(Integer value) {
            addCriterion("DXCS =", value, "DXCS");
            return (Criteria) this;
        }

        public Criteria andDXCSNotEqualTo(Integer value) {
            addCriterion("DXCS <>", value, "DXCS");
            return (Criteria) this;
        }

        public Criteria andDXCSGreaterThan(Integer value) {
            addCriterion("DXCS >", value, "DXCS");
            return (Criteria) this;
        }

        public Criteria andDXCSGreaterThanOrEqualTo(Integer value) {
            addCriterion("DXCS >=", value, "DXCS");
            return (Criteria) this;
        }

        public Criteria andDXCSLessThan(Integer value) {
            addCriterion("DXCS <", value, "DXCS");
            return (Criteria) this;
        }

        public Criteria andDXCSLessThanOrEqualTo(Integer value) {
            addCriterion("DXCS <=", value, "DXCS");
            return (Criteria) this;
        }

        public Criteria andDXCSIn(List<Integer> values) {
            addCriterion("DXCS in", values, "DXCS");
            return (Criteria) this;
        }

        public Criteria andDXCSNotIn(List<Integer> values) {
            addCriterion("DXCS not in", values, "DXCS");
            return (Criteria) this;
        }

        public Criteria andDXCSBetween(Integer value1, Integer value2) {
            addCriterion("DXCS between", value1, value2, "DXCS");
            return (Criteria) this;
        }

        public Criteria andDXCSNotBetween(Integer value1, Integer value2) {
            addCriterion("DXCS not between", value1, value2, "DXCS");
            return (Criteria) this;
        }

        public Criteria andZJZMJIsNull() {
            addCriterion("ZJZMJ is null");
            return (Criteria) this;
        }

        public Criteria andZJZMJIsNotNull() {
            addCriterion("ZJZMJ is not null");
            return (Criteria) this;
        }

        public Criteria andZJZMJEqualTo(BigDecimal value) {
            addCriterion("ZJZMJ =", value, "ZJZMJ");
            return (Criteria) this;
        }

        public Criteria andZJZMJNotEqualTo(BigDecimal value) {
            addCriterion("ZJZMJ <>", value, "ZJZMJ");
            return (Criteria) this;
        }

        public Criteria andZJZMJGreaterThan(BigDecimal value) {
            addCriterion("ZJZMJ >", value, "ZJZMJ");
            return (Criteria) this;
        }

        public Criteria andZJZMJGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZJZMJ >=", value, "ZJZMJ");
            return (Criteria) this;
        }

        public Criteria andZJZMJLessThan(BigDecimal value) {
            addCriterion("ZJZMJ <", value, "ZJZMJ");
            return (Criteria) this;
        }

        public Criteria andZJZMJLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZJZMJ <=", value, "ZJZMJ");
            return (Criteria) this;
        }

        public Criteria andZJZMJIn(List<BigDecimal> values) {
            addCriterion("ZJZMJ in", values, "ZJZMJ");
            return (Criteria) this;
        }

        public Criteria andZJZMJNotIn(List<BigDecimal> values) {
            addCriterion("ZJZMJ not in", values, "ZJZMJ");
            return (Criteria) this;
        }

        public Criteria andZJZMJBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZJZMJ between", value1, value2, "ZJZMJ");
            return (Criteria) this;
        }

        public Criteria andZJZMJNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZJZMJ not between", value1, value2, "ZJZMJ");
            return (Criteria) this;
        }

        public Criteria andZDMJIsNull() {
            addCriterion("ZDMJ is null");
            return (Criteria) this;
        }

        public Criteria andZDMJIsNotNull() {
            addCriterion("ZDMJ is not null");
            return (Criteria) this;
        }

        public Criteria andZDMJEqualTo(BigDecimal value) {
            addCriterion("ZDMJ =", value, "ZDMJ");
            return (Criteria) this;
        }

        public Criteria andZDMJNotEqualTo(BigDecimal value) {
            addCriterion("ZDMJ <>", value, "ZDMJ");
            return (Criteria) this;
        }

        public Criteria andZDMJGreaterThan(BigDecimal value) {
            addCriterion("ZDMJ >", value, "ZDMJ");
            return (Criteria) this;
        }

        public Criteria andZDMJGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZDMJ >=", value, "ZDMJ");
            return (Criteria) this;
        }

        public Criteria andZDMJLessThan(BigDecimal value) {
            addCriterion("ZDMJ <", value, "ZDMJ");
            return (Criteria) this;
        }

        public Criteria andZDMJLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZDMJ <=", value, "ZDMJ");
            return (Criteria) this;
        }

        public Criteria andZDMJIn(List<BigDecimal> values) {
            addCriterion("ZDMJ in", values, "ZDMJ");
            return (Criteria) this;
        }

        public Criteria andZDMJNotIn(List<BigDecimal> values) {
            addCriterion("ZDMJ not in", values, "ZDMJ");
            return (Criteria) this;
        }

        public Criteria andZDMJBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZDMJ between", value1, value2, "ZDMJ");
            return (Criteria) this;
        }

        public Criteria andZDMJNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZDMJ not between", value1, value2, "ZDMJ");
            return (Criteria) this;
        }

        public Criteria andDSMJIsNull() {
            addCriterion("DSMJ is null");
            return (Criteria) this;
        }

        public Criteria andDSMJIsNotNull() {
            addCriterion("DSMJ is not null");
            return (Criteria) this;
        }

        public Criteria andDSMJEqualTo(BigDecimal value) {
            addCriterion("DSMJ =", value, "DSMJ");
            return (Criteria) this;
        }

        public Criteria andDSMJNotEqualTo(BigDecimal value) {
            addCriterion("DSMJ <>", value, "DSMJ");
            return (Criteria) this;
        }

        public Criteria andDSMJGreaterThan(BigDecimal value) {
            addCriterion("DSMJ >", value, "DSMJ");
            return (Criteria) this;
        }

        public Criteria andDSMJGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DSMJ >=", value, "DSMJ");
            return (Criteria) this;
        }

        public Criteria andDSMJLessThan(BigDecimal value) {
            addCriterion("DSMJ <", value, "DSMJ");
            return (Criteria) this;
        }

        public Criteria andDSMJLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DSMJ <=", value, "DSMJ");
            return (Criteria) this;
        }

        public Criteria andDSMJIn(List<BigDecimal> values) {
            addCriterion("DSMJ in", values, "DSMJ");
            return (Criteria) this;
        }

        public Criteria andDSMJNotIn(List<BigDecimal> values) {
            addCriterion("DSMJ not in", values, "DSMJ");
            return (Criteria) this;
        }

        public Criteria andDSMJBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DSMJ between", value1, value2, "DSMJ");
            return (Criteria) this;
        }

        public Criteria andDSMJNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DSMJ not between", value1, value2, "DSMJ");
            return (Criteria) this;
        }

        public Criteria andDXMJIsNull() {
            addCriterion("DXMJ is null");
            return (Criteria) this;
        }

        public Criteria andDXMJIsNotNull() {
            addCriterion("DXMJ is not null");
            return (Criteria) this;
        }

        public Criteria andDXMJEqualTo(BigDecimal value) {
            addCriterion("DXMJ =", value, "DXMJ");
            return (Criteria) this;
        }

        public Criteria andDXMJNotEqualTo(BigDecimal value) {
            addCriterion("DXMJ <>", value, "DXMJ");
            return (Criteria) this;
        }

        public Criteria andDXMJGreaterThan(BigDecimal value) {
            addCriterion("DXMJ >", value, "DXMJ");
            return (Criteria) this;
        }

        public Criteria andDXMJGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DXMJ >=", value, "DXMJ");
            return (Criteria) this;
        }

        public Criteria andDXMJLessThan(BigDecimal value) {
            addCriterion("DXMJ <", value, "DXMJ");
            return (Criteria) this;
        }

        public Criteria andDXMJLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DXMJ <=", value, "DXMJ");
            return (Criteria) this;
        }

        public Criteria andDXMJIn(List<BigDecimal> values) {
            addCriterion("DXMJ in", values, "DXMJ");
            return (Criteria) this;
        }

        public Criteria andDXMJNotIn(List<BigDecimal> values) {
            addCriterion("DXMJ not in", values, "DXMJ");
            return (Criteria) this;
        }

        public Criteria andDXMJBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DXMJ between", value1, value2, "DXMJ");
            return (Criteria) this;
        }

        public Criteria andDXMJNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DXMJ not between", value1, value2, "DXMJ");
            return (Criteria) this;
        }

        public Criteria andQTMJIsNull() {
            addCriterion("QTMJ is null");
            return (Criteria) this;
        }

        public Criteria andQTMJIsNotNull() {
            addCriterion("QTMJ is not null");
            return (Criteria) this;
        }

        public Criteria andQTMJEqualTo(BigDecimal value) {
            addCriterion("QTMJ =", value, "QTMJ");
            return (Criteria) this;
        }

        public Criteria andQTMJNotEqualTo(BigDecimal value) {
            addCriterion("QTMJ <>", value, "QTMJ");
            return (Criteria) this;
        }

        public Criteria andQTMJGreaterThan(BigDecimal value) {
            addCriterion("QTMJ >", value, "QTMJ");
            return (Criteria) this;
        }

        public Criteria andQTMJGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTMJ >=", value, "QTMJ");
            return (Criteria) this;
        }

        public Criteria andQTMJLessThan(BigDecimal value) {
            addCriterion("QTMJ <", value, "QTMJ");
            return (Criteria) this;
        }

        public Criteria andQTMJLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTMJ <=", value, "QTMJ");
            return (Criteria) this;
        }

        public Criteria andQTMJIn(List<BigDecimal> values) {
            addCriterion("QTMJ in", values, "QTMJ");
            return (Criteria) this;
        }

        public Criteria andQTMJNotIn(List<BigDecimal> values) {
            addCriterion("QTMJ not in", values, "QTMJ");
            return (Criteria) this;
        }

        public Criteria andQTMJBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTMJ between", value1, value2, "QTMJ");
            return (Criteria) this;
        }

        public Criteria andQTMJNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTMJ not between", value1, value2, "QTMJ");
            return (Criteria) this;
        }

        public Criteria andJZJGIsNull() {
            addCriterion("JZJG is null");
            return (Criteria) this;
        }

        public Criteria andJZJGIsNotNull() {
            addCriterion("JZJG is not null");
            return (Criteria) this;
        }

        public Criteria andJZJGEqualTo(String value) {
            addCriterion("JZJG =", value, "JZJG");
            return (Criteria) this;
        }

        public Criteria andJZJGNotEqualTo(String value) {
            addCriterion("JZJG <>", value, "JZJG");
            return (Criteria) this;
        }

        public Criteria andJZJGGreaterThan(String value) {
            addCriterion("JZJG >", value, "JZJG");
            return (Criteria) this;
        }

        public Criteria andJZJGGreaterThanOrEqualTo(String value) {
            addCriterion("JZJG >=", value, "JZJG");
            return (Criteria) this;
        }

        public Criteria andJZJGLessThan(String value) {
            addCriterion("JZJG <", value, "JZJG");
            return (Criteria) this;
        }

        public Criteria andJZJGLessThanOrEqualTo(String value) {
            addCriterion("JZJG <=", value, "JZJG");
            return (Criteria) this;
        }

        public Criteria andJZJGLike(String value) {
            addCriterion("JZJG like", value, "JZJG");
            return (Criteria) this;
        }

        public Criteria andJZJGNotLike(String value) {
            addCriterion("JZJG not like", value, "JZJG");
            return (Criteria) this;
        }

        public Criteria andJZJGIn(List<String> values) {
            addCriterion("JZJG in", values, "JZJG");
            return (Criteria) this;
        }

        public Criteria andJZJGNotIn(List<String> values) {
            addCriterion("JZJG not in", values, "JZJG");
            return (Criteria) this;
        }

        public Criteria andJZJGBetween(String value1, String value2) {
            addCriterion("JZJG between", value1, value2, "JZJG");
            return (Criteria) this;
        }

        public Criteria andJZJGNotBetween(String value1, String value2) {
            addCriterion("JZJG not between", value1, value2, "JZJG");
            return (Criteria) this;
        }

        public Criteria andJGRQIsNull() {
            addCriterion("JGRQ is null");
            return (Criteria) this;
        }

        public Criteria andJGRQIsNotNull() {
            addCriterion("JGRQ is not null");
            return (Criteria) this;
        }

        public Criteria andJGRQEqualTo(Date value) {
            addCriterion("JGRQ =", value, "JGRQ");
            return (Criteria) this;
        }

        public Criteria andJGRQNotEqualTo(Date value) {
            addCriterion("JGRQ <>", value, "JGRQ");
            return (Criteria) this;
        }

        public Criteria andJGRQGreaterThan(Date value) {
            addCriterion("JGRQ >", value, "JGRQ");
            return (Criteria) this;
        }

        public Criteria andJGRQGreaterThanOrEqualTo(Date value) {
            addCriterion("JGRQ >=", value, "JGRQ");
            return (Criteria) this;
        }

        public Criteria andJGRQLessThan(Date value) {
            addCriterion("JGRQ <", value, "JGRQ");
            return (Criteria) this;
        }

        public Criteria andJGRQLessThanOrEqualTo(Date value) {
            addCriterion("JGRQ <=", value, "JGRQ");
            return (Criteria) this;
        }

        public Criteria andJGRQIn(List<Date> values) {
            addCriterion("JGRQ in", values, "JGRQ");
            return (Criteria) this;
        }

        public Criteria andJGRQNotIn(List<Date> values) {
            addCriterion("JGRQ not in", values, "JGRQ");
            return (Criteria) this;
        }

        public Criteria andJGRQBetween(Date value1, Date value2) {
            addCriterion("JGRQ between", value1, value2, "JGRQ");
            return (Criteria) this;
        }

        public Criteria andJGRQNotBetween(Date value1, Date value2) {
            addCriterion("JGRQ not between", value1, value2, "JGRQ");
            return (Criteria) this;
        }

        public Criteria andZBZJDIsNull() {
            addCriterion("ZBZJD is null");
            return (Criteria) this;
        }

        public Criteria andZBZJDIsNotNull() {
            addCriterion("ZBZJD is not null");
            return (Criteria) this;
        }

        public Criteria andZBZJDEqualTo(Integer value) {
            addCriterion("ZBZJD =", value, "ZBZJD");
            return (Criteria) this;
        }

        public Criteria andZBZJDNotEqualTo(Integer value) {
            addCriterion("ZBZJD <>", value, "ZBZJD");
            return (Criteria) this;
        }

        public Criteria andZBZJDGreaterThan(Integer value) {
            addCriterion("ZBZJD >", value, "ZBZJD");
            return (Criteria) this;
        }

        public Criteria andZBZJDGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZBZJD >=", value, "ZBZJD");
            return (Criteria) this;
        }

        public Criteria andZBZJDLessThan(Integer value) {
            addCriterion("ZBZJD <", value, "ZBZJD");
            return (Criteria) this;
        }

        public Criteria andZBZJDLessThanOrEqualTo(Integer value) {
            addCriterion("ZBZJD <=", value, "ZBZJD");
            return (Criteria) this;
        }

        public Criteria andZBZJDIn(List<Integer> values) {
            addCriterion("ZBZJD in", values, "ZBZJD");
            return (Criteria) this;
        }

        public Criteria andZBZJDNotIn(List<Integer> values) {
            addCriterion("ZBZJD not in", values, "ZBZJD");
            return (Criteria) this;
        }

        public Criteria andZBZJDBetween(Integer value1, Integer value2) {
            addCriterion("ZBZJD between", value1, value2, "ZBZJD");
            return (Criteria) this;
        }

        public Criteria andZBZJDNotBetween(Integer value1, Integer value2) {
            addCriterion("ZBZJD not between", value1, value2, "ZBZJD");
            return (Criteria) this;
        }

        public Criteria andCHDWMCIsNull() {
            addCriterion("CHDWMC is null");
            return (Criteria) this;
        }

        public Criteria andCHDWMCIsNotNull() {
            addCriterion("CHDWMC is not null");
            return (Criteria) this;
        }

        public Criteria andCHDWMCEqualTo(String value) {
            addCriterion("CHDWMC =", value, "CHDWMC");
            return (Criteria) this;
        }

        public Criteria andCHDWMCNotEqualTo(String value) {
            addCriterion("CHDWMC <>", value, "CHDWMC");
            return (Criteria) this;
        }

        public Criteria andCHDWMCGreaterThan(String value) {
            addCriterion("CHDWMC >", value, "CHDWMC");
            return (Criteria) this;
        }

        public Criteria andCHDWMCGreaterThanOrEqualTo(String value) {
            addCriterion("CHDWMC >=", value, "CHDWMC");
            return (Criteria) this;
        }

        public Criteria andCHDWMCLessThan(String value) {
            addCriterion("CHDWMC <", value, "CHDWMC");
            return (Criteria) this;
        }

        public Criteria andCHDWMCLessThanOrEqualTo(String value) {
            addCriterion("CHDWMC <=", value, "CHDWMC");
            return (Criteria) this;
        }

        public Criteria andCHDWMCLike(String value) {
            addCriterion("CHDWMC like", value, "CHDWMC");
            return (Criteria) this;
        }

        public Criteria andCHDWMCNotLike(String value) {
            addCriterion("CHDWMC not like", value, "CHDWMC");
            return (Criteria) this;
        }

        public Criteria andCHDWMCIn(List<String> values) {
            addCriterion("CHDWMC in", values, "CHDWMC");
            return (Criteria) this;
        }

        public Criteria andCHDWMCNotIn(List<String> values) {
            addCriterion("CHDWMC not in", values, "CHDWMC");
            return (Criteria) this;
        }

        public Criteria andCHDWMCBetween(String value1, String value2) {
            addCriterion("CHDWMC between", value1, value2, "CHDWMC");
            return (Criteria) this;
        }

        public Criteria andCHDWMCNotBetween(String value1, String value2) {
            addCriterion("CHDWMC not between", value1, value2, "CHDWMC");
            return (Criteria) this;
        }

        public Criteria andZTYBHIsNull() {
            addCriterion("ZTYBH is null");
            return (Criteria) this;
        }

        public Criteria andZTYBHIsNotNull() {
            addCriterion("ZTYBH is not null");
            return (Criteria) this;
        }

        public Criteria andZTYBHEqualTo(String value) {
            addCriterion("ZTYBH =", value, "ZTYBH");
            return (Criteria) this;
        }

        public Criteria andZTYBHNotEqualTo(String value) {
            addCriterion("ZTYBH <>", value, "ZTYBH");
            return (Criteria) this;
        }

        public Criteria andZTYBHGreaterThan(String value) {
            addCriterion("ZTYBH >", value, "ZTYBH");
            return (Criteria) this;
        }

        public Criteria andZTYBHGreaterThanOrEqualTo(String value) {
            addCriterion("ZTYBH >=", value, "ZTYBH");
            return (Criteria) this;
        }

        public Criteria andZTYBHLessThan(String value) {
            addCriterion("ZTYBH <", value, "ZTYBH");
            return (Criteria) this;
        }

        public Criteria andZTYBHLessThanOrEqualTo(String value) {
            addCriterion("ZTYBH <=", value, "ZTYBH");
            return (Criteria) this;
        }

        public Criteria andZTYBHLike(String value) {
            addCriterion("ZTYBH like", value, "ZTYBH");
            return (Criteria) this;
        }

        public Criteria andZTYBHNotLike(String value) {
            addCriterion("ZTYBH not like", value, "ZTYBH");
            return (Criteria) this;
        }

        public Criteria andZTYBHIn(List<String> values) {
            addCriterion("ZTYBH in", values, "ZTYBH");
            return (Criteria) this;
        }

        public Criteria andZTYBHNotIn(List<String> values) {
            addCriterion("ZTYBH not in", values, "ZTYBH");
            return (Criteria) this;
        }

        public Criteria andZTYBHBetween(String value1, String value2) {
            addCriterion("ZTYBH between", value1, value2, "ZTYBH");
            return (Criteria) this;
        }

        public Criteria andZTYBHNotBetween(String value1, String value2) {
            addCriterion("ZTYBH not between", value1, value2, "ZTYBH");
            return (Criteria) this;
        }

        public Criteria andKFQYCODEIsNull() {
            addCriterion("KFQYCODE is null");
            return (Criteria) this;
        }

        public Criteria andKFQYCODEIsNotNull() {
            addCriterion("KFQYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andKFQYCODEEqualTo(String value) {
            addCriterion("KFQYCODE =", value, "KFQYCODE");
            return (Criteria) this;
        }

        public Criteria andKFQYCODENotEqualTo(String value) {
            addCriterion("KFQYCODE <>", value, "KFQYCODE");
            return (Criteria) this;
        }

        public Criteria andKFQYCODEGreaterThan(String value) {
            addCriterion("KFQYCODE >", value, "KFQYCODE");
            return (Criteria) this;
        }

        public Criteria andKFQYCODEGreaterThanOrEqualTo(String value) {
            addCriterion("KFQYCODE >=", value, "KFQYCODE");
            return (Criteria) this;
        }

        public Criteria andKFQYCODELessThan(String value) {
            addCriterion("KFQYCODE <", value, "KFQYCODE");
            return (Criteria) this;
        }

        public Criteria andKFQYCODELessThanOrEqualTo(String value) {
            addCriterion("KFQYCODE <=", value, "KFQYCODE");
            return (Criteria) this;
        }

        public Criteria andKFQYCODELike(String value) {
            addCriterion("KFQYCODE like", value, "KFQYCODE");
            return (Criteria) this;
        }

        public Criteria andKFQYCODENotLike(String value) {
            addCriterion("KFQYCODE not like", value, "KFQYCODE");
            return (Criteria) this;
        }

        public Criteria andKFQYCODEIn(List<String> values) {
            addCriterion("KFQYCODE in", values, "KFQYCODE");
            return (Criteria) this;
        }

        public Criteria andKFQYCODENotIn(List<String> values) {
            addCriterion("KFQYCODE not in", values, "KFQYCODE");
            return (Criteria) this;
        }

        public Criteria andKFQYCODEBetween(String value1, String value2) {
            addCriterion("KFQYCODE between", value1, value2, "KFQYCODE");
            return (Criteria) this;
        }

        public Criteria andKFQYCODENotBetween(String value1, String value2) {
            addCriterion("KFQYCODE not between", value1, value2, "KFQYCODE");
            return (Criteria) this;
        }

        public Criteria andEQJIsNull() {
            addCriterion("EQJ is null");
            return (Criteria) this;
        }

        public Criteria andEQJIsNotNull() {
            addCriterion("EQJ is not null");
            return (Criteria) this;
        }

        public Criteria andEQJEqualTo(String value) {
            addCriterion("EQJ =", value, "EQJ");
            return (Criteria) this;
        }

        public Criteria andEQJNotEqualTo(String value) {
            addCriterion("EQJ <>", value, "EQJ");
            return (Criteria) this;
        }

        public Criteria andEQJGreaterThan(String value) {
            addCriterion("EQJ >", value, "EQJ");
            return (Criteria) this;
        }

        public Criteria andEQJGreaterThanOrEqualTo(String value) {
            addCriterion("EQJ >=", value, "EQJ");
            return (Criteria) this;
        }

        public Criteria andEQJLessThan(String value) {
            addCriterion("EQJ <", value, "EQJ");
            return (Criteria) this;
        }

        public Criteria andEQJLessThanOrEqualTo(String value) {
            addCriterion("EQJ <=", value, "EQJ");
            return (Criteria) this;
        }

        public Criteria andEQJLike(String value) {
            addCriterion("EQJ like", value, "EQJ");
            return (Criteria) this;
        }

        public Criteria andEQJNotLike(String value) {
            addCriterion("EQJ not like", value, "EQJ");
            return (Criteria) this;
        }

        public Criteria andEQJIn(List<String> values) {
            addCriterion("EQJ in", values, "EQJ");
            return (Criteria) this;
        }

        public Criteria andEQJNotIn(List<String> values) {
            addCriterion("EQJ not in", values, "EQJ");
            return (Criteria) this;
        }

        public Criteria andEQJBetween(String value1, String value2) {
            addCriterion("EQJ between", value1, value2, "EQJ");
            return (Criteria) this;
        }

        public Criteria andEQJNotBetween(String value1, String value2) {
            addCriterion("EQJ not between", value1, value2, "EQJ");
            return (Criteria) this;
        }

        public Criteria andSQJIsNull() {
            addCriterion("SQJ is null");
            return (Criteria) this;
        }

        public Criteria andSQJIsNotNull() {
            addCriterion("SQJ is not null");
            return (Criteria) this;
        }

        public Criteria andSQJEqualTo(String value) {
            addCriterion("SQJ =", value, "SQJ");
            return (Criteria) this;
        }

        public Criteria andSQJNotEqualTo(String value) {
            addCriterion("SQJ <>", value, "SQJ");
            return (Criteria) this;
        }

        public Criteria andSQJGreaterThan(String value) {
            addCriterion("SQJ >", value, "SQJ");
            return (Criteria) this;
        }

        public Criteria andSQJGreaterThanOrEqualTo(String value) {
            addCriterion("SQJ >=", value, "SQJ");
            return (Criteria) this;
        }

        public Criteria andSQJLessThan(String value) {
            addCriterion("SQJ <", value, "SQJ");
            return (Criteria) this;
        }

        public Criteria andSQJLessThanOrEqualTo(String value) {
            addCriterion("SQJ <=", value, "SQJ");
            return (Criteria) this;
        }

        public Criteria andSQJLike(String value) {
            addCriterion("SQJ like", value, "SQJ");
            return (Criteria) this;
        }

        public Criteria andSQJNotLike(String value) {
            addCriterion("SQJ not like", value, "SQJ");
            return (Criteria) this;
        }

        public Criteria andSQJIn(List<String> values) {
            addCriterion("SQJ in", values, "SQJ");
            return (Criteria) this;
        }

        public Criteria andSQJNotIn(List<String> values) {
            addCriterion("SQJ not in", values, "SQJ");
            return (Criteria) this;
        }

        public Criteria andSQJBetween(String value1, String value2) {
            addCriterion("SQJ between", value1, value2, "SQJ");
            return (Criteria) this;
        }

        public Criteria andSQJNotBetween(String value1, String value2) {
            addCriterion("SQJ not between", value1, value2, "SQJ");
            return (Criteria) this;
        }

        public Criteria andWQJIsNull() {
            addCriterion("WQJ is null");
            return (Criteria) this;
        }

        public Criteria andWQJIsNotNull() {
            addCriterion("WQJ is not null");
            return (Criteria) this;
        }

        public Criteria andWQJEqualTo(String value) {
            addCriterion("WQJ =", value, "WQJ");
            return (Criteria) this;
        }

        public Criteria andWQJNotEqualTo(String value) {
            addCriterion("WQJ <>", value, "WQJ");
            return (Criteria) this;
        }

        public Criteria andWQJGreaterThan(String value) {
            addCriterion("WQJ >", value, "WQJ");
            return (Criteria) this;
        }

        public Criteria andWQJGreaterThanOrEqualTo(String value) {
            addCriterion("WQJ >=", value, "WQJ");
            return (Criteria) this;
        }

        public Criteria andWQJLessThan(String value) {
            addCriterion("WQJ <", value, "WQJ");
            return (Criteria) this;
        }

        public Criteria andWQJLessThanOrEqualTo(String value) {
            addCriterion("WQJ <=", value, "WQJ");
            return (Criteria) this;
        }

        public Criteria andWQJLike(String value) {
            addCriterion("WQJ like", value, "WQJ");
            return (Criteria) this;
        }

        public Criteria andWQJNotLike(String value) {
            addCriterion("WQJ not like", value, "WQJ");
            return (Criteria) this;
        }

        public Criteria andWQJIn(List<String> values) {
            addCriterion("WQJ in", values, "WQJ");
            return (Criteria) this;
        }

        public Criteria andWQJNotIn(List<String> values) {
            addCriterion("WQJ not in", values, "WQJ");
            return (Criteria) this;
        }

        public Criteria andWQJBetween(String value1, String value2) {
            addCriterion("WQJ between", value1, value2, "WQJ");
            return (Criteria) this;
        }

        public Criteria andWQJNotBetween(String value1, String value2) {
            addCriterion("WQJ not between", value1, value2, "WQJ");
            return (Criteria) this;
        }

        public Criteria andNQJIsNull() {
            addCriterion("NQJ is null");
            return (Criteria) this;
        }

        public Criteria andNQJIsNotNull() {
            addCriterion("NQJ is not null");
            return (Criteria) this;
        }

        public Criteria andNQJEqualTo(String value) {
            addCriterion("NQJ =", value, "NQJ");
            return (Criteria) this;
        }

        public Criteria andNQJNotEqualTo(String value) {
            addCriterion("NQJ <>", value, "NQJ");
            return (Criteria) this;
        }

        public Criteria andNQJGreaterThan(String value) {
            addCriterion("NQJ >", value, "NQJ");
            return (Criteria) this;
        }

        public Criteria andNQJGreaterThanOrEqualTo(String value) {
            addCriterion("NQJ >=", value, "NQJ");
            return (Criteria) this;
        }

        public Criteria andNQJLessThan(String value) {
            addCriterion("NQJ <", value, "NQJ");
            return (Criteria) this;
        }

        public Criteria andNQJLessThanOrEqualTo(String value) {
            addCriterion("NQJ <=", value, "NQJ");
            return (Criteria) this;
        }

        public Criteria andNQJLike(String value) {
            addCriterion("NQJ like", value, "NQJ");
            return (Criteria) this;
        }

        public Criteria andNQJNotLike(String value) {
            addCriterion("NQJ not like", value, "NQJ");
            return (Criteria) this;
        }

        public Criteria andNQJIn(List<String> values) {
            addCriterion("NQJ in", values, "NQJ");
            return (Criteria) this;
        }

        public Criteria andNQJNotIn(List<String> values) {
            addCriterion("NQJ not in", values, "NQJ");
            return (Criteria) this;
        }

        public Criteria andNQJBetween(String value1, String value2) {
            addCriterion("NQJ between", value1, value2, "NQJ");
            return (Criteria) this;
        }

        public Criteria andNQJNotBetween(String value1, String value2) {
            addCriterion("NQJ not between", value1, value2, "NQJ");
            return (Criteria) this;
        }

        public Criteria andGISZBIsNull() {
            addCriterion("GISZB is null");
            return (Criteria) this;
        }

        public Criteria andGISZBIsNotNull() {
            addCriterion("GISZB is not null");
            return (Criteria) this;
        }

        public Criteria andGISZBEqualTo(String value) {
            addCriterion("GISZB =", value, "GISZB");
            return (Criteria) this;
        }

        public Criteria andGISZBNotEqualTo(String value) {
            addCriterion("GISZB <>", value, "GISZB");
            return (Criteria) this;
        }

        public Criteria andGISZBGreaterThan(String value) {
            addCriterion("GISZB >", value, "GISZB");
            return (Criteria) this;
        }

        public Criteria andGISZBGreaterThanOrEqualTo(String value) {
            addCriterion("GISZB >=", value, "GISZB");
            return (Criteria) this;
        }

        public Criteria andGISZBLessThan(String value) {
            addCriterion("GISZB <", value, "GISZB");
            return (Criteria) this;
        }

        public Criteria andGISZBLessThanOrEqualTo(String value) {
            addCriterion("GISZB <=", value, "GISZB");
            return (Criteria) this;
        }

        public Criteria andGISZBLike(String value) {
            addCriterion("GISZB like", value, "GISZB");
            return (Criteria) this;
        }

        public Criteria andGISZBNotLike(String value) {
            addCriterion("GISZB not like", value, "GISZB");
            return (Criteria) this;
        }

        public Criteria andGISZBIn(List<String> values) {
            addCriterion("GISZB in", values, "GISZB");
            return (Criteria) this;
        }

        public Criteria andGISZBNotIn(List<String> values) {
            addCriterion("GISZB not in", values, "GISZB");
            return (Criteria) this;
        }

        public Criteria andGISZBBetween(String value1, String value2) {
            addCriterion("GISZB between", value1, value2, "GISZB");
            return (Criteria) this;
        }

        public Criteria andGISZBNotBetween(String value1, String value2) {
            addCriterion("GISZB not between", value1, value2, "GISZB");
            return (Criteria) this;
        }

        public Criteria andZRZXLHIsNull() {
            addCriterion("ZRZXLH is null");
            return (Criteria) this;
        }

        public Criteria andZRZXLHIsNotNull() {
            addCriterion("ZRZXLH is not null");
            return (Criteria) this;
        }

        public Criteria andZRZXLHEqualTo(String value) {
            addCriterion("ZRZXLH =", value, "ZRZXLH");
            return (Criteria) this;
        }

        public Criteria andZRZXLHNotEqualTo(String value) {
            addCriterion("ZRZXLH <>", value, "ZRZXLH");
            return (Criteria) this;
        }

        public Criteria andZRZXLHGreaterThan(String value) {
            addCriterion("ZRZXLH >", value, "ZRZXLH");
            return (Criteria) this;
        }

        public Criteria andZRZXLHGreaterThanOrEqualTo(String value) {
            addCriterion("ZRZXLH >=", value, "ZRZXLH");
            return (Criteria) this;
        }

        public Criteria andZRZXLHLessThan(String value) {
            addCriterion("ZRZXLH <", value, "ZRZXLH");
            return (Criteria) this;
        }

        public Criteria andZRZXLHLessThanOrEqualTo(String value) {
            addCriterion("ZRZXLH <=", value, "ZRZXLH");
            return (Criteria) this;
        }

        public Criteria andZRZXLHLike(String value) {
            addCriterion("ZRZXLH like", value, "ZRZXLH");
            return (Criteria) this;
        }

        public Criteria andZRZXLHNotLike(String value) {
            addCriterion("ZRZXLH not like", value, "ZRZXLH");
            return (Criteria) this;
        }

        public Criteria andZRZXLHIn(List<String> values) {
            addCriterion("ZRZXLH in", values, "ZRZXLH");
            return (Criteria) this;
        }

        public Criteria andZRZXLHNotIn(List<String> values) {
            addCriterion("ZRZXLH not in", values, "ZRZXLH");
            return (Criteria) this;
        }

        public Criteria andZRZXLHBetween(String value1, String value2) {
            addCriterion("ZRZXLH between", value1, value2, "ZRZXLH");
            return (Criteria) this;
        }

        public Criteria andZRZXLHNotBetween(String value1, String value2) {
            addCriterion("ZRZXLH not between", value1, value2, "ZRZXLH");
            return (Criteria) this;
        }

        public Criteria andZIDIsNull() {
            addCriterion("ZID is null");
            return (Criteria) this;
        }

        public Criteria andZIDIsNotNull() {
            addCriterion("ZID is not null");
            return (Criteria) this;
        }

        public Criteria andZIDEqualTo(String value) {
            addCriterion("ZID =", value, "ZID");
            return (Criteria) this;
        }

        public Criteria andZIDNotEqualTo(String value) {
            addCriterion("ZID <>", value, "ZID");
            return (Criteria) this;
        }

        public Criteria andZIDGreaterThan(String value) {
            addCriterion("ZID >", value, "ZID");
            return (Criteria) this;
        }

        public Criteria andZIDGreaterThanOrEqualTo(String value) {
            addCriterion("ZID >=", value, "ZID");
            return (Criteria) this;
        }

        public Criteria andZIDLessThan(String value) {
            addCriterion("ZID <", value, "ZID");
            return (Criteria) this;
        }

        public Criteria andZIDLessThanOrEqualTo(String value) {
            addCriterion("ZID <=", value, "ZID");
            return (Criteria) this;
        }

        public Criteria andZIDLike(String value) {
            addCriterion("ZID like", value, "ZID");
            return (Criteria) this;
        }

        public Criteria andZIDNotLike(String value) {
            addCriterion("ZID not like", value, "ZID");
            return (Criteria) this;
        }

        public Criteria andZIDIn(List<String> values) {
            addCriterion("ZID in", values, "ZID");
            return (Criteria) this;
        }

        public Criteria andZIDNotIn(List<String> values) {
            addCriterion("ZID not in", values, "ZID");
            return (Criteria) this;
        }

        public Criteria andZIDBetween(String value1, String value2) {
            addCriterion("ZID between", value1, value2, "ZID");
            return (Criteria) this;
        }

        public Criteria andZIDNotBetween(String value1, String value2) {
            addCriterion("ZID not between", value1, value2, "ZID");
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
