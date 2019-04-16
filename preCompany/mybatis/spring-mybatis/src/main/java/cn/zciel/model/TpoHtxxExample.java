package cn.zciel.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TpoHtxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public TpoHtxxExample() {
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

        public Criteria andPZIDIsNull() {
            addCriterion("PZID is null");
            return (Criteria) this;
        }

        public Criteria andPZIDIsNotNull() {
            addCriterion("PZID is not null");
            return (Criteria) this;
        }

        public Criteria andPZIDEqualTo(String value) {
            addCriterion("PZID =", value, "PZID");
            return (Criteria) this;
        }

        public Criteria andPZIDNotEqualTo(String value) {
            addCriterion("PZID <>", value, "PZID");
            return (Criteria) this;
        }

        public Criteria andPZIDGreaterThan(String value) {
            addCriterion("PZID >", value, "PZID");
            return (Criteria) this;
        }

        public Criteria andPZIDGreaterThanOrEqualTo(String value) {
            addCriterion("PZID >=", value, "PZID");
            return (Criteria) this;
        }

        public Criteria andPZIDLessThan(String value) {
            addCriterion("PZID <", value, "PZID");
            return (Criteria) this;
        }

        public Criteria andPZIDLessThanOrEqualTo(String value) {
            addCriterion("PZID <=", value, "PZID");
            return (Criteria) this;
        }

        public Criteria andPZIDLike(String value) {
            addCriterion("PZID like", value, "PZID");
            return (Criteria) this;
        }

        public Criteria andPZIDNotLike(String value) {
            addCriterion("PZID not like", value, "PZID");
            return (Criteria) this;
        }

        public Criteria andPZIDIn(List<String> values) {
            addCriterion("PZID in", values, "PZID");
            return (Criteria) this;
        }

        public Criteria andPZIDNotIn(List<String> values) {
            addCriterion("PZID not in", values, "PZID");
            return (Criteria) this;
        }

        public Criteria andPZIDBetween(String value1, String value2) {
            addCriterion("PZID between", value1, value2, "PZID");
            return (Criteria) this;
        }

        public Criteria andPZIDNotBetween(String value1, String value2) {
            addCriterion("PZID not between", value1, value2, "PZID");
            return (Criteria) this;
        }

        public Criteria andPZCODEIsNull() {
            addCriterion("PZCODE is null");
            return (Criteria) this;
        }

        public Criteria andPZCODEIsNotNull() {
            addCriterion("PZCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPZCODEEqualTo(String value) {
            addCriterion("PZCODE =", value, "PZCODE");
            return (Criteria) this;
        }

        public Criteria andPZCODENotEqualTo(String value) {
            addCriterion("PZCODE <>", value, "PZCODE");
            return (Criteria) this;
        }

        public Criteria andPZCODEGreaterThan(String value) {
            addCriterion("PZCODE >", value, "PZCODE");
            return (Criteria) this;
        }

        public Criteria andPZCODEGreaterThanOrEqualTo(String value) {
            addCriterion("PZCODE >=", value, "PZCODE");
            return (Criteria) this;
        }

        public Criteria andPZCODELessThan(String value) {
            addCriterion("PZCODE <", value, "PZCODE");
            return (Criteria) this;
        }

        public Criteria andPZCODELessThanOrEqualTo(String value) {
            addCriterion("PZCODE <=", value, "PZCODE");
            return (Criteria) this;
        }

        public Criteria andPZCODELike(String value) {
            addCriterion("PZCODE like", value, "PZCODE");
            return (Criteria) this;
        }

        public Criteria andPZCODENotLike(String value) {
            addCriterion("PZCODE not like", value, "PZCODE");
            return (Criteria) this;
        }

        public Criteria andPZCODEIn(List<String> values) {
            addCriterion("PZCODE in", values, "PZCODE");
            return (Criteria) this;
        }

        public Criteria andPZCODENotIn(List<String> values) {
            addCriterion("PZCODE not in", values, "PZCODE");
            return (Criteria) this;
        }

        public Criteria andPZCODEBetween(String value1, String value2) {
            addCriterion("PZCODE between", value1, value2, "PZCODE");
            return (Criteria) this;
        }

        public Criteria andPZCODENotBetween(String value1, String value2) {
            addCriterion("PZCODE not between", value1, value2, "PZCODE");
            return (Criteria) this;
        }

        public Criteria andHTLXIsNull() {
            addCriterion("HTLX is null");
            return (Criteria) this;
        }

        public Criteria andHTLXIsNotNull() {
            addCriterion("HTLX is not null");
            return (Criteria) this;
        }

        public Criteria andHTLXEqualTo(String value) {
            addCriterion("HTLX =", value, "HTLX");
            return (Criteria) this;
        }

        public Criteria andHTLXNotEqualTo(String value) {
            addCriterion("HTLX <>", value, "HTLX");
            return (Criteria) this;
        }

        public Criteria andHTLXGreaterThan(String value) {
            addCriterion("HTLX >", value, "HTLX");
            return (Criteria) this;
        }

        public Criteria andHTLXGreaterThanOrEqualTo(String value) {
            addCriterion("HTLX >=", value, "HTLX");
            return (Criteria) this;
        }

        public Criteria andHTLXLessThan(String value) {
            addCriterion("HTLX <", value, "HTLX");
            return (Criteria) this;
        }

        public Criteria andHTLXLessThanOrEqualTo(String value) {
            addCriterion("HTLX <=", value, "HTLX");
            return (Criteria) this;
        }

        public Criteria andHTLXLike(String value) {
            addCriterion("HTLX like", value, "HTLX");
            return (Criteria) this;
        }

        public Criteria andHTLXNotLike(String value) {
            addCriterion("HTLX not like", value, "HTLX");
            return (Criteria) this;
        }

        public Criteria andHTLXIn(List<String> values) {
            addCriterion("HTLX in", values, "HTLX");
            return (Criteria) this;
        }

        public Criteria andHTLXNotIn(List<String> values) {
            addCriterion("HTLX not in", values, "HTLX");
            return (Criteria) this;
        }

        public Criteria andHTLXBetween(String value1, String value2) {
            addCriterion("HTLX between", value1, value2, "HTLX");
            return (Criteria) this;
        }

        public Criteria andHTLXNotBetween(String value1, String value2) {
            addCriterion("HTLX not between", value1, value2, "HTLX");
            return (Criteria) this;
        }

        public Criteria andFWZLIsNull() {
            addCriterion("FWZL is null");
            return (Criteria) this;
        }

        public Criteria andFWZLIsNotNull() {
            addCriterion("FWZL is not null");
            return (Criteria) this;
        }

        public Criteria andFWZLEqualTo(String value) {
            addCriterion("FWZL =", value, "FWZL");
            return (Criteria) this;
        }

        public Criteria andFWZLNotEqualTo(String value) {
            addCriterion("FWZL <>", value, "FWZL");
            return (Criteria) this;
        }

        public Criteria andFWZLGreaterThan(String value) {
            addCriterion("FWZL >", value, "FWZL");
            return (Criteria) this;
        }

        public Criteria andFWZLGreaterThanOrEqualTo(String value) {
            addCriterion("FWZL >=", value, "FWZL");
            return (Criteria) this;
        }

        public Criteria andFWZLLessThan(String value) {
            addCriterion("FWZL <", value, "FWZL");
            return (Criteria) this;
        }

        public Criteria andFWZLLessThanOrEqualTo(String value) {
            addCriterion("FWZL <=", value, "FWZL");
            return (Criteria) this;
        }

        public Criteria andFWZLLike(String value) {
            addCriterion("FWZL like", value, "FWZL");
            return (Criteria) this;
        }

        public Criteria andFWZLNotLike(String value) {
            addCriterion("FWZL not like", value, "FWZL");
            return (Criteria) this;
        }

        public Criteria andFWZLIn(List<String> values) {
            addCriterion("FWZL in", values, "FWZL");
            return (Criteria) this;
        }

        public Criteria andFWZLNotIn(List<String> values) {
            addCriterion("FWZL not in", values, "FWZL");
            return (Criteria) this;
        }

        public Criteria andFWZLBetween(String value1, String value2) {
            addCriterion("FWZL between", value1, value2, "FWZL");
            return (Criteria) this;
        }

        public Criteria andFWZLNotBetween(String value1, String value2) {
            addCriterion("FWZL not between", value1, value2, "FWZL");
            return (Criteria) this;
        }

        public Criteria andHTBHIsNull() {
            addCriterion("HTBH is null");
            return (Criteria) this;
        }

        public Criteria andHTBHIsNotNull() {
            addCriterion("HTBH is not null");
            return (Criteria) this;
        }

        public Criteria andHTBHEqualTo(String value) {
            addCriterion("HTBH =", value, "HTBH");
            return (Criteria) this;
        }

        public Criteria andHTBHNotEqualTo(String value) {
            addCriterion("HTBH <>", value, "HTBH");
            return (Criteria) this;
        }

        public Criteria andHTBHGreaterThan(String value) {
            addCriterion("HTBH >", value, "HTBH");
            return (Criteria) this;
        }

        public Criteria andHTBHGreaterThanOrEqualTo(String value) {
            addCriterion("HTBH >=", value, "HTBH");
            return (Criteria) this;
        }

        public Criteria andHTBHLessThan(String value) {
            addCriterion("HTBH <", value, "HTBH");
            return (Criteria) this;
        }

        public Criteria andHTBHLessThanOrEqualTo(String value) {
            addCriterion("HTBH <=", value, "HTBH");
            return (Criteria) this;
        }

        public Criteria andHTBHLike(String value) {
            addCriterion("HTBH like", value, "HTBH");
            return (Criteria) this;
        }

        public Criteria andHTBHNotLike(String value) {
            addCriterion("HTBH not like", value, "HTBH");
            return (Criteria) this;
        }

        public Criteria andHTBHIn(List<String> values) {
            addCriterion("HTBH in", values, "HTBH");
            return (Criteria) this;
        }

        public Criteria andHTBHNotIn(List<String> values) {
            addCriterion("HTBH not in", values, "HTBH");
            return (Criteria) this;
        }

        public Criteria andHTBHBetween(String value1, String value2) {
            addCriterion("HTBH between", value1, value2, "HTBH");
            return (Criteria) this;
        }

        public Criteria andHTBHNotBetween(String value1, String value2) {
            addCriterion("HTBH not between", value1, value2, "HTBH");
            return (Criteria) this;
        }

        public Criteria andJF_DZIsNull() {
            addCriterion("JF_DZ is null");
            return (Criteria) this;
        }

        public Criteria andJF_DZIsNotNull() {
            addCriterion("JF_DZ is not null");
            return (Criteria) this;
        }

        public Criteria andJF_DZEqualTo(String value) {
            addCriterion("JF_DZ =", value, "JF_DZ");
            return (Criteria) this;
        }

        public Criteria andJF_DZNotEqualTo(String value) {
            addCriterion("JF_DZ <>", value, "JF_DZ");
            return (Criteria) this;
        }

        public Criteria andJF_DZGreaterThan(String value) {
            addCriterion("JF_DZ >", value, "JF_DZ");
            return (Criteria) this;
        }

        public Criteria andJF_DZGreaterThanOrEqualTo(String value) {
            addCriterion("JF_DZ >=", value, "JF_DZ");
            return (Criteria) this;
        }

        public Criteria andJF_DZLessThan(String value) {
            addCriterion("JF_DZ <", value, "JF_DZ");
            return (Criteria) this;
        }

        public Criteria andJF_DZLessThanOrEqualTo(String value) {
            addCriterion("JF_DZ <=", value, "JF_DZ");
            return (Criteria) this;
        }

        public Criteria andJF_DZLike(String value) {
            addCriterion("JF_DZ like", value, "JF_DZ");
            return (Criteria) this;
        }

        public Criteria andJF_DZNotLike(String value) {
            addCriterion("JF_DZ not like", value, "JF_DZ");
            return (Criteria) this;
        }

        public Criteria andJF_DZIn(List<String> values) {
            addCriterion("JF_DZ in", values, "JF_DZ");
            return (Criteria) this;
        }

        public Criteria andJF_DZNotIn(List<String> values) {
            addCriterion("JF_DZ not in", values, "JF_DZ");
            return (Criteria) this;
        }

        public Criteria andJF_DZBetween(String value1, String value2) {
            addCriterion("JF_DZ between", value1, value2, "JF_DZ");
            return (Criteria) this;
        }

        public Criteria andJF_DZNotBetween(String value1, String value2) {
            addCriterion("JF_DZ not between", value1, value2, "JF_DZ");
            return (Criteria) this;
        }

        public Criteria andJF_LXDHIsNull() {
            addCriterion("JF_LXDH is null");
            return (Criteria) this;
        }

        public Criteria andJF_LXDHIsNotNull() {
            addCriterion("JF_LXDH is not null");
            return (Criteria) this;
        }

        public Criteria andJF_LXDHEqualTo(String value) {
            addCriterion("JF_LXDH =", value, "JF_LXDH");
            return (Criteria) this;
        }

        public Criteria andJF_LXDHNotEqualTo(String value) {
            addCriterion("JF_LXDH <>", value, "JF_LXDH");
            return (Criteria) this;
        }

        public Criteria andJF_LXDHGreaterThan(String value) {
            addCriterion("JF_LXDH >", value, "JF_LXDH");
            return (Criteria) this;
        }

        public Criteria andJF_LXDHGreaterThanOrEqualTo(String value) {
            addCriterion("JF_LXDH >=", value, "JF_LXDH");
            return (Criteria) this;
        }

        public Criteria andJF_LXDHLessThan(String value) {
            addCriterion("JF_LXDH <", value, "JF_LXDH");
            return (Criteria) this;
        }

        public Criteria andJF_LXDHLessThanOrEqualTo(String value) {
            addCriterion("JF_LXDH <=", value, "JF_LXDH");
            return (Criteria) this;
        }

        public Criteria andJF_LXDHLike(String value) {
            addCriterion("JF_LXDH like", value, "JF_LXDH");
            return (Criteria) this;
        }

        public Criteria andJF_LXDHNotLike(String value) {
            addCriterion("JF_LXDH not like", value, "JF_LXDH");
            return (Criteria) this;
        }

        public Criteria andJF_LXDHIn(List<String> values) {
            addCriterion("JF_LXDH in", values, "JF_LXDH");
            return (Criteria) this;
        }

        public Criteria andJF_LXDHNotIn(List<String> values) {
            addCriterion("JF_LXDH not in", values, "JF_LXDH");
            return (Criteria) this;
        }

        public Criteria andJF_LXDHBetween(String value1, String value2) {
            addCriterion("JF_LXDH between", value1, value2, "JF_LXDH");
            return (Criteria) this;
        }

        public Criteria andJF_LXDHNotBetween(String value1, String value2) {
            addCriterion("JF_LXDH not between", value1, value2, "JF_LXDH");
            return (Criteria) this;
        }

        public Criteria andJF_XMIsNull() {
            addCriterion("JF_XM is null");
            return (Criteria) this;
        }

        public Criteria andJF_XMIsNotNull() {
            addCriterion("JF_XM is not null");
            return (Criteria) this;
        }

        public Criteria andJF_XMEqualTo(String value) {
            addCriterion("JF_XM =", value, "JF_XM");
            return (Criteria) this;
        }

        public Criteria andJF_XMNotEqualTo(String value) {
            addCriterion("JF_XM <>", value, "JF_XM");
            return (Criteria) this;
        }

        public Criteria andJF_XMGreaterThan(String value) {
            addCriterion("JF_XM >", value, "JF_XM");
            return (Criteria) this;
        }

        public Criteria andJF_XMGreaterThanOrEqualTo(String value) {
            addCriterion("JF_XM >=", value, "JF_XM");
            return (Criteria) this;
        }

        public Criteria andJF_XMLessThan(String value) {
            addCriterion("JF_XM <", value, "JF_XM");
            return (Criteria) this;
        }

        public Criteria andJF_XMLessThanOrEqualTo(String value) {
            addCriterion("JF_XM <=", value, "JF_XM");
            return (Criteria) this;
        }

        public Criteria andJF_XMLike(String value) {
            addCriterion("JF_XM like", value, "JF_XM");
            return (Criteria) this;
        }

        public Criteria andJF_XMNotLike(String value) {
            addCriterion("JF_XM not like", value, "JF_XM");
            return (Criteria) this;
        }

        public Criteria andJF_XMIn(List<String> values) {
            addCriterion("JF_XM in", values, "JF_XM");
            return (Criteria) this;
        }

        public Criteria andJF_XMNotIn(List<String> values) {
            addCriterion("JF_XM not in", values, "JF_XM");
            return (Criteria) this;
        }

        public Criteria andJF_XMBetween(String value1, String value2) {
            addCriterion("JF_XM between", value1, value2, "JF_XM");
            return (Criteria) this;
        }

        public Criteria andJF_XMNotBetween(String value1, String value2) {
            addCriterion("JF_XM not between", value1, value2, "JF_XM");
            return (Criteria) this;
        }

        public Criteria andYF_XMIsNull() {
            addCriterion("YF_XM is null");
            return (Criteria) this;
        }

        public Criteria andYF_XMIsNotNull() {
            addCriterion("YF_XM is not null");
            return (Criteria) this;
        }

        public Criteria andYF_XMEqualTo(String value) {
            addCriterion("YF_XM =", value, "YF_XM");
            return (Criteria) this;
        }

        public Criteria andYF_XMNotEqualTo(String value) {
            addCriterion("YF_XM <>", value, "YF_XM");
            return (Criteria) this;
        }

        public Criteria andYF_XMGreaterThan(String value) {
            addCriterion("YF_XM >", value, "YF_XM");
            return (Criteria) this;
        }

        public Criteria andYF_XMGreaterThanOrEqualTo(String value) {
            addCriterion("YF_XM >=", value, "YF_XM");
            return (Criteria) this;
        }

        public Criteria andYF_XMLessThan(String value) {
            addCriterion("YF_XM <", value, "YF_XM");
            return (Criteria) this;
        }

        public Criteria andYF_XMLessThanOrEqualTo(String value) {
            addCriterion("YF_XM <=", value, "YF_XM");
            return (Criteria) this;
        }

        public Criteria andYF_XMLike(String value) {
            addCriterion("YF_XM like", value, "YF_XM");
            return (Criteria) this;
        }

        public Criteria andYF_XMNotLike(String value) {
            addCriterion("YF_XM not like", value, "YF_XM");
            return (Criteria) this;
        }

        public Criteria andYF_XMIn(List<String> values) {
            addCriterion("YF_XM in", values, "YF_XM");
            return (Criteria) this;
        }

        public Criteria andYF_XMNotIn(List<String> values) {
            addCriterion("YF_XM not in", values, "YF_XM");
            return (Criteria) this;
        }

        public Criteria andYF_XMBetween(String value1, String value2) {
            addCriterion("YF_XM between", value1, value2, "YF_XM");
            return (Criteria) this;
        }

        public Criteria andYF_XMNotBetween(String value1, String value2) {
            addCriterion("YF_XM not between", value1, value2, "YF_XM");
            return (Criteria) this;
        }

        public Criteria andYF_SFZHIsNull() {
            addCriterion("YF_SFZH is null");
            return (Criteria) this;
        }

        public Criteria andYF_SFZHIsNotNull() {
            addCriterion("YF_SFZH is not null");
            return (Criteria) this;
        }

        public Criteria andYF_SFZHEqualTo(String value) {
            addCriterion("YF_SFZH =", value, "YF_SFZH");
            return (Criteria) this;
        }

        public Criteria andYF_SFZHNotEqualTo(String value) {
            addCriterion("YF_SFZH <>", value, "YF_SFZH");
            return (Criteria) this;
        }

        public Criteria andYF_SFZHGreaterThan(String value) {
            addCriterion("YF_SFZH >", value, "YF_SFZH");
            return (Criteria) this;
        }

        public Criteria andYF_SFZHGreaterThanOrEqualTo(String value) {
            addCriterion("YF_SFZH >=", value, "YF_SFZH");
            return (Criteria) this;
        }

        public Criteria andYF_SFZHLessThan(String value) {
            addCriterion("YF_SFZH <", value, "YF_SFZH");
            return (Criteria) this;
        }

        public Criteria andYF_SFZHLessThanOrEqualTo(String value) {
            addCriterion("YF_SFZH <=", value, "YF_SFZH");
            return (Criteria) this;
        }

        public Criteria andYF_SFZHLike(String value) {
            addCriterion("YF_SFZH like", value, "YF_SFZH");
            return (Criteria) this;
        }

        public Criteria andYF_SFZHNotLike(String value) {
            addCriterion("YF_SFZH not like", value, "YF_SFZH");
            return (Criteria) this;
        }

        public Criteria andYF_SFZHIn(List<String> values) {
            addCriterion("YF_SFZH in", values, "YF_SFZH");
            return (Criteria) this;
        }

        public Criteria andYF_SFZHNotIn(List<String> values) {
            addCriterion("YF_SFZH not in", values, "YF_SFZH");
            return (Criteria) this;
        }

        public Criteria andYF_SFZHBetween(String value1, String value2) {
            addCriterion("YF_SFZH between", value1, value2, "YF_SFZH");
            return (Criteria) this;
        }

        public Criteria andYF_SFZHNotBetween(String value1, String value2) {
            addCriterion("YF_SFZH not between", value1, value2, "YF_SFZH");
            return (Criteria) this;
        }

        public Criteria andYF_DZIsNull() {
            addCriterion("YF_DZ is null");
            return (Criteria) this;
        }

        public Criteria andYF_DZIsNotNull() {
            addCriterion("YF_DZ is not null");
            return (Criteria) this;
        }

        public Criteria andYF_DZEqualTo(String value) {
            addCriterion("YF_DZ =", value, "YF_DZ");
            return (Criteria) this;
        }

        public Criteria andYF_DZNotEqualTo(String value) {
            addCriterion("YF_DZ <>", value, "YF_DZ");
            return (Criteria) this;
        }

        public Criteria andYF_DZGreaterThan(String value) {
            addCriterion("YF_DZ >", value, "YF_DZ");
            return (Criteria) this;
        }

        public Criteria andYF_DZGreaterThanOrEqualTo(String value) {
            addCriterion("YF_DZ >=", value, "YF_DZ");
            return (Criteria) this;
        }

        public Criteria andYF_DZLessThan(String value) {
            addCriterion("YF_DZ <", value, "YF_DZ");
            return (Criteria) this;
        }

        public Criteria andYF_DZLessThanOrEqualTo(String value) {
            addCriterion("YF_DZ <=", value, "YF_DZ");
            return (Criteria) this;
        }

        public Criteria andYF_DZLike(String value) {
            addCriterion("YF_DZ like", value, "YF_DZ");
            return (Criteria) this;
        }

        public Criteria andYF_DZNotLike(String value) {
            addCriterion("YF_DZ not like", value, "YF_DZ");
            return (Criteria) this;
        }

        public Criteria andYF_DZIn(List<String> values) {
            addCriterion("YF_DZ in", values, "YF_DZ");
            return (Criteria) this;
        }

        public Criteria andYF_DZNotIn(List<String> values) {
            addCriterion("YF_DZ not in", values, "YF_DZ");
            return (Criteria) this;
        }

        public Criteria andYF_DZBetween(String value1, String value2) {
            addCriterion("YF_DZ between", value1, value2, "YF_DZ");
            return (Criteria) this;
        }

        public Criteria andYF_DZNotBetween(String value1, String value2) {
            addCriterion("YF_DZ not between", value1, value2, "YF_DZ");
            return (Criteria) this;
        }

        public Criteria andYF_LXDHIsNull() {
            addCriterion("YF_LXDH is null");
            return (Criteria) this;
        }

        public Criteria andYF_LXDHIsNotNull() {
            addCriterion("YF_LXDH is not null");
            return (Criteria) this;
        }

        public Criteria andYF_LXDHEqualTo(String value) {
            addCriterion("YF_LXDH =", value, "YF_LXDH");
            return (Criteria) this;
        }

        public Criteria andYF_LXDHNotEqualTo(String value) {
            addCriterion("YF_LXDH <>", value, "YF_LXDH");
            return (Criteria) this;
        }

        public Criteria andYF_LXDHGreaterThan(String value) {
            addCriterion("YF_LXDH >", value, "YF_LXDH");
            return (Criteria) this;
        }

        public Criteria andYF_LXDHGreaterThanOrEqualTo(String value) {
            addCriterion("YF_LXDH >=", value, "YF_LXDH");
            return (Criteria) this;
        }

        public Criteria andYF_LXDHLessThan(String value) {
            addCriterion("YF_LXDH <", value, "YF_LXDH");
            return (Criteria) this;
        }

        public Criteria andYF_LXDHLessThanOrEqualTo(String value) {
            addCriterion("YF_LXDH <=", value, "YF_LXDH");
            return (Criteria) this;
        }

        public Criteria andYF_LXDHLike(String value) {
            addCriterion("YF_LXDH like", value, "YF_LXDH");
            return (Criteria) this;
        }

        public Criteria andYF_LXDHNotLike(String value) {
            addCriterion("YF_LXDH not like", value, "YF_LXDH");
            return (Criteria) this;
        }

        public Criteria andYF_LXDHIn(List<String> values) {
            addCriterion("YF_LXDH in", values, "YF_LXDH");
            return (Criteria) this;
        }

        public Criteria andYF_LXDHNotIn(List<String> values) {
            addCriterion("YF_LXDH not in", values, "YF_LXDH");
            return (Criteria) this;
        }

        public Criteria andYF_LXDHBetween(String value1, String value2) {
            addCriterion("YF_LXDH between", value1, value2, "YF_LXDH");
            return (Criteria) this;
        }

        public Criteria andYF_LXDHNotBetween(String value1, String value2) {
            addCriterion("YF_LXDH not between", value1, value2, "YF_LXDH");
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

        public Criteria andQXIsNull() {
            addCriterion("QX is null");
            return (Criteria) this;
        }

        public Criteria andQXIsNotNull() {
            addCriterion("QX is not null");
            return (Criteria) this;
        }

        public Criteria andQXEqualTo(Integer value) {
            addCriterion("QX =", value, "QX");
            return (Criteria) this;
        }

        public Criteria andQXNotEqualTo(Integer value) {
            addCriterion("QX <>", value, "QX");
            return (Criteria) this;
        }

        public Criteria andQXGreaterThan(Integer value) {
            addCriterion("QX >", value, "QX");
            return (Criteria) this;
        }

        public Criteria andQXGreaterThanOrEqualTo(Integer value) {
            addCriterion("QX >=", value, "QX");
            return (Criteria) this;
        }

        public Criteria andQXLessThan(Integer value) {
            addCriterion("QX <", value, "QX");
            return (Criteria) this;
        }

        public Criteria andQXLessThanOrEqualTo(Integer value) {
            addCriterion("QX <=", value, "QX");
            return (Criteria) this;
        }

        public Criteria andQXIn(List<Integer> values) {
            addCriterion("QX in", values, "QX");
            return (Criteria) this;
        }

        public Criteria andQXNotIn(List<Integer> values) {
            addCriterion("QX not in", values, "QX");
            return (Criteria) this;
        }

        public Criteria andQXBetween(Integer value1, Integer value2) {
            addCriterion("QX between", value1, value2, "QX");
            return (Criteria) this;
        }

        public Criteria andQXNotBetween(Integer value1, Integer value2) {
            addCriterion("QX not between", value1, value2, "QX");
            return (Criteria) this;
        }

        public Criteria andYJIsNull() {
            addCriterion("YJ is null");
            return (Criteria) this;
        }

        public Criteria andYJIsNotNull() {
            addCriterion("YJ is not null");
            return (Criteria) this;
        }

        public Criteria andYJEqualTo(BigDecimal value) {
            addCriterion("YJ =", value, "YJ");
            return (Criteria) this;
        }

        public Criteria andYJNotEqualTo(BigDecimal value) {
            addCriterion("YJ <>", value, "YJ");
            return (Criteria) this;
        }

        public Criteria andYJGreaterThan(BigDecimal value) {
            addCriterion("YJ >", value, "YJ");
            return (Criteria) this;
        }

        public Criteria andYJGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YJ >=", value, "YJ");
            return (Criteria) this;
        }

        public Criteria andYJLessThan(BigDecimal value) {
            addCriterion("YJ <", value, "YJ");
            return (Criteria) this;
        }

        public Criteria andYJLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YJ <=", value, "YJ");
            return (Criteria) this;
        }

        public Criteria andYJIn(List<BigDecimal> values) {
            addCriterion("YJ in", values, "YJ");
            return (Criteria) this;
        }

        public Criteria andYJNotIn(List<BigDecimal> values) {
            addCriterion("YJ not in", values, "YJ");
            return (Criteria) this;
        }

        public Criteria andYJBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YJ between", value1, value2, "YJ");
            return (Criteria) this;
        }

        public Criteria andYJNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YJ not between", value1, value2, "YJ");
            return (Criteria) this;
        }

        public Criteria andZJIsNull() {
            addCriterion("ZJ is null");
            return (Criteria) this;
        }

        public Criteria andZJIsNotNull() {
            addCriterion("ZJ is not null");
            return (Criteria) this;
        }

        public Criteria andZJEqualTo(BigDecimal value) {
            addCriterion("ZJ =", value, "ZJ");
            return (Criteria) this;
        }

        public Criteria andZJNotEqualTo(BigDecimal value) {
            addCriterion("ZJ <>", value, "ZJ");
            return (Criteria) this;
        }

        public Criteria andZJGreaterThan(BigDecimal value) {
            addCriterion("ZJ >", value, "ZJ");
            return (Criteria) this;
        }

        public Criteria andZJGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZJ >=", value, "ZJ");
            return (Criteria) this;
        }

        public Criteria andZJLessThan(BigDecimal value) {
            addCriterion("ZJ <", value, "ZJ");
            return (Criteria) this;
        }

        public Criteria andZJLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZJ <=", value, "ZJ");
            return (Criteria) this;
        }

        public Criteria andZJIn(List<BigDecimal> values) {
            addCriterion("ZJ in", values, "ZJ");
            return (Criteria) this;
        }

        public Criteria andZJNotIn(List<BigDecimal> values) {
            addCriterion("ZJ not in", values, "ZJ");
            return (Criteria) this;
        }

        public Criteria andZJBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZJ between", value1, value2, "ZJ");
            return (Criteria) this;
        }

        public Criteria andZJNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZJ not between", value1, value2, "ZJ");
            return (Criteria) this;
        }

        public Criteria andBF_ZZJGDMIsNull() {
            addCriterion("BF_ZZJGDM is null");
            return (Criteria) this;
        }

        public Criteria andBF_ZZJGDMIsNotNull() {
            addCriterion("BF_ZZJGDM is not null");
            return (Criteria) this;
        }

        public Criteria andBF_ZZJGDMEqualTo(String value) {
            addCriterion("BF_ZZJGDM =", value, "BF_ZZJGDM");
            return (Criteria) this;
        }

        public Criteria andBF_ZZJGDMNotEqualTo(String value) {
            addCriterion("BF_ZZJGDM <>", value, "BF_ZZJGDM");
            return (Criteria) this;
        }

        public Criteria andBF_ZZJGDMGreaterThan(String value) {
            addCriterion("BF_ZZJGDM >", value, "BF_ZZJGDM");
            return (Criteria) this;
        }

        public Criteria andBF_ZZJGDMGreaterThanOrEqualTo(String value) {
            addCriterion("BF_ZZJGDM >=", value, "BF_ZZJGDM");
            return (Criteria) this;
        }

        public Criteria andBF_ZZJGDMLessThan(String value) {
            addCriterion("BF_ZZJGDM <", value, "BF_ZZJGDM");
            return (Criteria) this;
        }

        public Criteria andBF_ZZJGDMLessThanOrEqualTo(String value) {
            addCriterion("BF_ZZJGDM <=", value, "BF_ZZJGDM");
            return (Criteria) this;
        }

        public Criteria andBF_ZZJGDMLike(String value) {
            addCriterion("BF_ZZJGDM like", value, "BF_ZZJGDM");
            return (Criteria) this;
        }

        public Criteria andBF_ZZJGDMNotLike(String value) {
            addCriterion("BF_ZZJGDM not like", value, "BF_ZZJGDM");
            return (Criteria) this;
        }

        public Criteria andBF_ZZJGDMIn(List<String> values) {
            addCriterion("BF_ZZJGDM in", values, "BF_ZZJGDM");
            return (Criteria) this;
        }

        public Criteria andBF_ZZJGDMNotIn(List<String> values) {
            addCriterion("BF_ZZJGDM not in", values, "BF_ZZJGDM");
            return (Criteria) this;
        }

        public Criteria andBF_ZZJGDMBetween(String value1, String value2) {
            addCriterion("BF_ZZJGDM between", value1, value2, "BF_ZZJGDM");
            return (Criteria) this;
        }

        public Criteria andBF_ZZJGDMNotBetween(String value1, String value2) {
            addCriterion("BF_ZZJGDM not between", value1, value2, "BF_ZZJGDM");
            return (Criteria) this;
        }

        public Criteria andBF_DZIsNull() {
            addCriterion("BF_DZ is null");
            return (Criteria) this;
        }

        public Criteria andBF_DZIsNotNull() {
            addCriterion("BF_DZ is not null");
            return (Criteria) this;
        }

        public Criteria andBF_DZEqualTo(String value) {
            addCriterion("BF_DZ =", value, "BF_DZ");
            return (Criteria) this;
        }

        public Criteria andBF_DZNotEqualTo(String value) {
            addCriterion("BF_DZ <>", value, "BF_DZ");
            return (Criteria) this;
        }

        public Criteria andBF_DZGreaterThan(String value) {
            addCriterion("BF_DZ >", value, "BF_DZ");
            return (Criteria) this;
        }

        public Criteria andBF_DZGreaterThanOrEqualTo(String value) {
            addCriterion("BF_DZ >=", value, "BF_DZ");
            return (Criteria) this;
        }

        public Criteria andBF_DZLessThan(String value) {
            addCriterion("BF_DZ <", value, "BF_DZ");
            return (Criteria) this;
        }

        public Criteria andBF_DZLessThanOrEqualTo(String value) {
            addCriterion("BF_DZ <=", value, "BF_DZ");
            return (Criteria) this;
        }

        public Criteria andBF_DZLike(String value) {
            addCriterion("BF_DZ like", value, "BF_DZ");
            return (Criteria) this;
        }

        public Criteria andBF_DZNotLike(String value) {
            addCriterion("BF_DZ not like", value, "BF_DZ");
            return (Criteria) this;
        }

        public Criteria andBF_DZIn(List<String> values) {
            addCriterion("BF_DZ in", values, "BF_DZ");
            return (Criteria) this;
        }

        public Criteria andBF_DZNotIn(List<String> values) {
            addCriterion("BF_DZ not in", values, "BF_DZ");
            return (Criteria) this;
        }

        public Criteria andBF_DZBetween(String value1, String value2) {
            addCriterion("BF_DZ between", value1, value2, "BF_DZ");
            return (Criteria) this;
        }

        public Criteria andBF_DZNotBetween(String value1, String value2) {
            addCriterion("BF_DZ not between", value1, value2, "BF_DZ");
            return (Criteria) this;
        }

        public Criteria andBF_LXDHIsNull() {
            addCriterion("BF_LXDH is null");
            return (Criteria) this;
        }

        public Criteria andBF_LXDHIsNotNull() {
            addCriterion("BF_LXDH is not null");
            return (Criteria) this;
        }

        public Criteria andBF_LXDHEqualTo(String value) {
            addCriterion("BF_LXDH =", value, "BF_LXDH");
            return (Criteria) this;
        }

        public Criteria andBF_LXDHNotEqualTo(String value) {
            addCriterion("BF_LXDH <>", value, "BF_LXDH");
            return (Criteria) this;
        }

        public Criteria andBF_LXDHGreaterThan(String value) {
            addCriterion("BF_LXDH >", value, "BF_LXDH");
            return (Criteria) this;
        }

        public Criteria andBF_LXDHGreaterThanOrEqualTo(String value) {
            addCriterion("BF_LXDH >=", value, "BF_LXDH");
            return (Criteria) this;
        }

        public Criteria andBF_LXDHLessThan(String value) {
            addCriterion("BF_LXDH <", value, "BF_LXDH");
            return (Criteria) this;
        }

        public Criteria andBF_LXDHLessThanOrEqualTo(String value) {
            addCriterion("BF_LXDH <=", value, "BF_LXDH");
            return (Criteria) this;
        }

        public Criteria andBF_LXDHLike(String value) {
            addCriterion("BF_LXDH like", value, "BF_LXDH");
            return (Criteria) this;
        }

        public Criteria andBF_LXDHNotLike(String value) {
            addCriterion("BF_LXDH not like", value, "BF_LXDH");
            return (Criteria) this;
        }

        public Criteria andBF_LXDHIn(List<String> values) {
            addCriterion("BF_LXDH in", values, "BF_LXDH");
            return (Criteria) this;
        }

        public Criteria andBF_LXDHNotIn(List<String> values) {
            addCriterion("BF_LXDH not in", values, "BF_LXDH");
            return (Criteria) this;
        }

        public Criteria andBF_LXDHBetween(String value1, String value2) {
            addCriterion("BF_LXDH between", value1, value2, "BF_LXDH");
            return (Criteria) this;
        }

        public Criteria andBF_LXDHNotBetween(String value1, String value2) {
            addCriterion("BF_LXDH not between", value1, value2, "BF_LXDH");
            return (Criteria) this;
        }

        public Criteria andBF_LXRIsNull() {
            addCriterion("BF_LXR is null");
            return (Criteria) this;
        }

        public Criteria andBF_LXRIsNotNull() {
            addCriterion("BF_LXR is not null");
            return (Criteria) this;
        }

        public Criteria andBF_LXREqualTo(String value) {
            addCriterion("BF_LXR =", value, "BF_LXR");
            return (Criteria) this;
        }

        public Criteria andBF_LXRNotEqualTo(String value) {
            addCriterion("BF_LXR <>", value, "BF_LXR");
            return (Criteria) this;
        }

        public Criteria andBF_LXRGreaterThan(String value) {
            addCriterion("BF_LXR >", value, "BF_LXR");
            return (Criteria) this;
        }

        public Criteria andBF_LXRGreaterThanOrEqualTo(String value) {
            addCriterion("BF_LXR >=", value, "BF_LXR");
            return (Criteria) this;
        }

        public Criteria andBF_LXRLessThan(String value) {
            addCriterion("BF_LXR <", value, "BF_LXR");
            return (Criteria) this;
        }

        public Criteria andBF_LXRLessThanOrEqualTo(String value) {
            addCriterion("BF_LXR <=", value, "BF_LXR");
            return (Criteria) this;
        }

        public Criteria andBF_LXRLike(String value) {
            addCriterion("BF_LXR like", value, "BF_LXR");
            return (Criteria) this;
        }

        public Criteria andBF_LXRNotLike(String value) {
            addCriterion("BF_LXR not like", value, "BF_LXR");
            return (Criteria) this;
        }

        public Criteria andBF_LXRIn(List<String> values) {
            addCriterion("BF_LXR in", values, "BF_LXR");
            return (Criteria) this;
        }

        public Criteria andBF_LXRNotIn(List<String> values) {
            addCriterion("BF_LXR not in", values, "BF_LXR");
            return (Criteria) this;
        }

        public Criteria andBF_LXRBetween(String value1, String value2) {
            addCriterion("BF_LXR between", value1, value2, "BF_LXR");
            return (Criteria) this;
        }

        public Criteria andBF_LXRNotBetween(String value1, String value2) {
            addCriterion("BF_LXR not between", value1, value2, "BF_LXR");
            return (Criteria) this;
        }

        public Criteria andPZKSSJIsNull() {
            addCriterion("PZKSSJ is null");
            return (Criteria) this;
        }

        public Criteria andPZKSSJIsNotNull() {
            addCriterion("PZKSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andPZKSSJEqualTo(Date value) {
            addCriterion("PZKSSJ =", value, "PZKSSJ");
            return (Criteria) this;
        }

        public Criteria andPZKSSJNotEqualTo(Date value) {
            addCriterion("PZKSSJ <>", value, "PZKSSJ");
            return (Criteria) this;
        }

        public Criteria andPZKSSJGreaterThan(Date value) {
            addCriterion("PZKSSJ >", value, "PZKSSJ");
            return (Criteria) this;
        }

        public Criteria andPZKSSJGreaterThanOrEqualTo(Date value) {
            addCriterion("PZKSSJ >=", value, "PZKSSJ");
            return (Criteria) this;
        }

        public Criteria andPZKSSJLessThan(Date value) {
            addCriterion("PZKSSJ <", value, "PZKSSJ");
            return (Criteria) this;
        }

        public Criteria andPZKSSJLessThanOrEqualTo(Date value) {
            addCriterion("PZKSSJ <=", value, "PZKSSJ");
            return (Criteria) this;
        }

        public Criteria andPZKSSJIn(List<Date> values) {
            addCriterion("PZKSSJ in", values, "PZKSSJ");
            return (Criteria) this;
        }

        public Criteria andPZKSSJNotIn(List<Date> values) {
            addCriterion("PZKSSJ not in", values, "PZKSSJ");
            return (Criteria) this;
        }

        public Criteria andPZKSSJBetween(Date value1, Date value2) {
            addCriterion("PZKSSJ between", value1, value2, "PZKSSJ");
            return (Criteria) this;
        }

        public Criteria andPZKSSJNotBetween(Date value1, Date value2) {
            addCriterion("PZKSSJ not between", value1, value2, "PZKSSJ");
            return (Criteria) this;
        }

        public Criteria andPZJSSJIsNull() {
            addCriterion("PZJSSJ is null");
            return (Criteria) this;
        }

        public Criteria andPZJSSJIsNotNull() {
            addCriterion("PZJSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andPZJSSJEqualTo(Date value) {
            addCriterion("PZJSSJ =", value, "PZJSSJ");
            return (Criteria) this;
        }

        public Criteria andPZJSSJNotEqualTo(Date value) {
            addCriterion("PZJSSJ <>", value, "PZJSSJ");
            return (Criteria) this;
        }

        public Criteria andPZJSSJGreaterThan(Date value) {
            addCriterion("PZJSSJ >", value, "PZJSSJ");
            return (Criteria) this;
        }

        public Criteria andPZJSSJGreaterThanOrEqualTo(Date value) {
            addCriterion("PZJSSJ >=", value, "PZJSSJ");
            return (Criteria) this;
        }

        public Criteria andPZJSSJLessThan(Date value) {
            addCriterion("PZJSSJ <", value, "PZJSSJ");
            return (Criteria) this;
        }

        public Criteria andPZJSSJLessThanOrEqualTo(Date value) {
            addCriterion("PZJSSJ <=", value, "PZJSSJ");
            return (Criteria) this;
        }

        public Criteria andPZJSSJIn(List<Date> values) {
            addCriterion("PZJSSJ in", values, "PZJSSJ");
            return (Criteria) this;
        }

        public Criteria andPZJSSJNotIn(List<Date> values) {
            addCriterion("PZJSSJ not in", values, "PZJSSJ");
            return (Criteria) this;
        }

        public Criteria andPZJSSJBetween(Date value1, Date value2) {
            addCriterion("PZJSSJ between", value1, value2, "PZJSSJ");
            return (Criteria) this;
        }

        public Criteria andPZJSSJNotBetween(Date value1, Date value2) {
            addCriterion("PZJSSJ not between", value1, value2, "PZJSSJ");
            return (Criteria) this;
        }

        public Criteria andDYSJIsNull() {
            addCriterion("DYSJ is null");
            return (Criteria) this;
        }

        public Criteria andDYSJIsNotNull() {
            addCriterion("DYSJ is not null");
            return (Criteria) this;
        }

        public Criteria andDYSJEqualTo(Date value) {
            addCriterion("DYSJ =", value, "DYSJ");
            return (Criteria) this;
        }

        public Criteria andDYSJNotEqualTo(Date value) {
            addCriterion("DYSJ <>", value, "DYSJ");
            return (Criteria) this;
        }

        public Criteria andDYSJGreaterThan(Date value) {
            addCriterion("DYSJ >", value, "DYSJ");
            return (Criteria) this;
        }

        public Criteria andDYSJGreaterThanOrEqualTo(Date value) {
            addCriterion("DYSJ >=", value, "DYSJ");
            return (Criteria) this;
        }

        public Criteria andDYSJLessThan(Date value) {
            addCriterion("DYSJ <", value, "DYSJ");
            return (Criteria) this;
        }

        public Criteria andDYSJLessThanOrEqualTo(Date value) {
            addCriterion("DYSJ <=", value, "DYSJ");
            return (Criteria) this;
        }

        public Criteria andDYSJIn(List<Date> values) {
            addCriterion("DYSJ in", values, "DYSJ");
            return (Criteria) this;
        }

        public Criteria andDYSJNotIn(List<Date> values) {
            addCriterion("DYSJ not in", values, "DYSJ");
            return (Criteria) this;
        }

        public Criteria andDYSJBetween(Date value1, Date value2) {
            addCriterion("DYSJ between", value1, value2, "DYSJ");
            return (Criteria) this;
        }

        public Criteria andDYSJNotBetween(Date value1, Date value2) {
            addCriterion("DYSJ not between", value1, value2, "DYSJ");
            return (Criteria) this;
        }

        public Criteria andBF_DWMCIsNull() {
            addCriterion("BF_DWMC is null");
            return (Criteria) this;
        }

        public Criteria andBF_DWMCIsNotNull() {
            addCriterion("BF_DWMC is not null");
            return (Criteria) this;
        }

        public Criteria andBF_DWMCEqualTo(String value) {
            addCriterion("BF_DWMC =", value, "BF_DWMC");
            return (Criteria) this;
        }

        public Criteria andBF_DWMCNotEqualTo(String value) {
            addCriterion("BF_DWMC <>", value, "BF_DWMC");
            return (Criteria) this;
        }

        public Criteria andBF_DWMCGreaterThan(String value) {
            addCriterion("BF_DWMC >", value, "BF_DWMC");
            return (Criteria) this;
        }

        public Criteria andBF_DWMCGreaterThanOrEqualTo(String value) {
            addCriterion("BF_DWMC >=", value, "BF_DWMC");
            return (Criteria) this;
        }

        public Criteria andBF_DWMCLessThan(String value) {
            addCriterion("BF_DWMC <", value, "BF_DWMC");
            return (Criteria) this;
        }

        public Criteria andBF_DWMCLessThanOrEqualTo(String value) {
            addCriterion("BF_DWMC <=", value, "BF_DWMC");
            return (Criteria) this;
        }

        public Criteria andBF_DWMCLike(String value) {
            addCriterion("BF_DWMC like", value, "BF_DWMC");
            return (Criteria) this;
        }

        public Criteria andBF_DWMCNotLike(String value) {
            addCriterion("BF_DWMC not like", value, "BF_DWMC");
            return (Criteria) this;
        }

        public Criteria andBF_DWMCIn(List<String> values) {
            addCriterion("BF_DWMC in", values, "BF_DWMC");
            return (Criteria) this;
        }

        public Criteria andBF_DWMCNotIn(List<String> values) {
            addCriterion("BF_DWMC not in", values, "BF_DWMC");
            return (Criteria) this;
        }

        public Criteria andBF_DWMCBetween(String value1, String value2) {
            addCriterion("BF_DWMC between", value1, value2, "BF_DWMC");
            return (Criteria) this;
        }

        public Criteria andBF_DWMCNotBetween(String value1, String value2) {
            addCriterion("BF_DWMC not between", value1, value2, "BF_DWMC");
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
