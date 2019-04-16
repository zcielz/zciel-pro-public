package cn.zciel.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TpoPzxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public TpoPzxxExample() {
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

        public Criteria andSQRLXDHIsNull() {
            addCriterion("SQRLXDH is null");
            return (Criteria) this;
        }

        public Criteria andSQRLXDHIsNotNull() {
            addCriterion("SQRLXDH is not null");
            return (Criteria) this;
        }

        public Criteria andSQRLXDHEqualTo(String value) {
            addCriterion("SQRLXDH =", value, "SQRLXDH");
            return (Criteria) this;
        }

        public Criteria andSQRLXDHNotEqualTo(String value) {
            addCriterion("SQRLXDH <>", value, "SQRLXDH");
            return (Criteria) this;
        }

        public Criteria andSQRLXDHGreaterThan(String value) {
            addCriterion("SQRLXDH >", value, "SQRLXDH");
            return (Criteria) this;
        }

        public Criteria andSQRLXDHGreaterThanOrEqualTo(String value) {
            addCriterion("SQRLXDH >=", value, "SQRLXDH");
            return (Criteria) this;
        }

        public Criteria andSQRLXDHLessThan(String value) {
            addCriterion("SQRLXDH <", value, "SQRLXDH");
            return (Criteria) this;
        }

        public Criteria andSQRLXDHLessThanOrEqualTo(String value) {
            addCriterion("SQRLXDH <=", value, "SQRLXDH");
            return (Criteria) this;
        }

        public Criteria andSQRLXDHLike(String value) {
            addCriterion("SQRLXDH like", value, "SQRLXDH");
            return (Criteria) this;
        }

        public Criteria andSQRLXDHNotLike(String value) {
            addCriterion("SQRLXDH not like", value, "SQRLXDH");
            return (Criteria) this;
        }

        public Criteria andSQRLXDHIn(List<String> values) {
            addCriterion("SQRLXDH in", values, "SQRLXDH");
            return (Criteria) this;
        }

        public Criteria andSQRLXDHNotIn(List<String> values) {
            addCriterion("SQRLXDH not in", values, "SQRLXDH");
            return (Criteria) this;
        }

        public Criteria andSQRLXDHBetween(String value1, String value2) {
            addCriterion("SQRLXDH between", value1, value2, "SQRLXDH");
            return (Criteria) this;
        }

        public Criteria andSQRLXDHNotBetween(String value1, String value2) {
            addCriterion("SQRLXDH not between", value1, value2, "SQRLXDH");
            return (Criteria) this;
        }

        public Criteria andSQRXMIsNull() {
            addCriterion("SQRXM is null");
            return (Criteria) this;
        }

        public Criteria andSQRXMIsNotNull() {
            addCriterion("SQRXM is not null");
            return (Criteria) this;
        }

        public Criteria andSQRXMEqualTo(String value) {
            addCriterion("SQRXM =", value, "SQRXM");
            return (Criteria) this;
        }

        public Criteria andSQRXMNotEqualTo(String value) {
            addCriterion("SQRXM <>", value, "SQRXM");
            return (Criteria) this;
        }

        public Criteria andSQRXMGreaterThan(String value) {
            addCriterion("SQRXM >", value, "SQRXM");
            return (Criteria) this;
        }

        public Criteria andSQRXMGreaterThanOrEqualTo(String value) {
            addCriterion("SQRXM >=", value, "SQRXM");
            return (Criteria) this;
        }

        public Criteria andSQRXMLessThan(String value) {
            addCriterion("SQRXM <", value, "SQRXM");
            return (Criteria) this;
        }

        public Criteria andSQRXMLessThanOrEqualTo(String value) {
            addCriterion("SQRXM <=", value, "SQRXM");
            return (Criteria) this;
        }

        public Criteria andSQRXMLike(String value) {
            addCriterion("SQRXM like", value, "SQRXM");
            return (Criteria) this;
        }

        public Criteria andSQRXMNotLike(String value) {
            addCriterion("SQRXM not like", value, "SQRXM");
            return (Criteria) this;
        }

        public Criteria andSQRXMIn(List<String> values) {
            addCriterion("SQRXM in", values, "SQRXM");
            return (Criteria) this;
        }

        public Criteria andSQRXMNotIn(List<String> values) {
            addCriterion("SQRXM not in", values, "SQRXM");
            return (Criteria) this;
        }

        public Criteria andSQRXMBetween(String value1, String value2) {
            addCriterion("SQRXM between", value1, value2, "SQRXM");
            return (Criteria) this;
        }

        public Criteria andSQRXMNotBetween(String value1, String value2) {
            addCriterion("SQRXM not between", value1, value2, "SQRXM");
            return (Criteria) this;
        }

        public Criteria andGTZLBHIsNull() {
            addCriterion("GTZLBH is null");
            return (Criteria) this;
        }

        public Criteria andGTZLBHIsNotNull() {
            addCriterion("GTZLBH is not null");
            return (Criteria) this;
        }

        public Criteria andGTZLBHEqualTo(String value) {
            addCriterion("GTZLBH =", value, "GTZLBH");
            return (Criteria) this;
        }

        public Criteria andGTZLBHNotEqualTo(String value) {
            addCriterion("GTZLBH <>", value, "GTZLBH");
            return (Criteria) this;
        }

        public Criteria andGTZLBHGreaterThan(String value) {
            addCriterion("GTZLBH >", value, "GTZLBH");
            return (Criteria) this;
        }

        public Criteria andGTZLBHGreaterThanOrEqualTo(String value) {
            addCriterion("GTZLBH >=", value, "GTZLBH");
            return (Criteria) this;
        }

        public Criteria andGTZLBHLessThan(String value) {
            addCriterion("GTZLBH <", value, "GTZLBH");
            return (Criteria) this;
        }

        public Criteria andGTZLBHLessThanOrEqualTo(String value) {
            addCriterion("GTZLBH <=", value, "GTZLBH");
            return (Criteria) this;
        }

        public Criteria andGTZLBHLike(String value) {
            addCriterion("GTZLBH like", value, "GTZLBH");
            return (Criteria) this;
        }

        public Criteria andGTZLBHNotLike(String value) {
            addCriterion("GTZLBH not like", value, "GTZLBH");
            return (Criteria) this;
        }

        public Criteria andGTZLBHIn(List<String> values) {
            addCriterion("GTZLBH in", values, "GTZLBH");
            return (Criteria) this;
        }

        public Criteria andGTZLBHNotIn(List<String> values) {
            addCriterion("GTZLBH not in", values, "GTZLBH");
            return (Criteria) this;
        }

        public Criteria andGTZLBHBetween(String value1, String value2) {
            addCriterion("GTZLBH between", value1, value2, "GTZLBH");
            return (Criteria) this;
        }

        public Criteria andGTZLBHNotBetween(String value1, String value2) {
            addCriterion("GTZLBH not between", value1, value2, "GTZLBH");
            return (Criteria) this;
        }

        public Criteria andFYIDIsNull() {
            addCriterion("FYID is null");
            return (Criteria) this;
        }

        public Criteria andFYIDIsNotNull() {
            addCriterion("FYID is not null");
            return (Criteria) this;
        }

        public Criteria andFYIDEqualTo(String value) {
            addCriterion("FYID =", value, "FYID");
            return (Criteria) this;
        }

        public Criteria andFYIDNotEqualTo(String value) {
            addCriterion("FYID <>", value, "FYID");
            return (Criteria) this;
        }

        public Criteria andFYIDGreaterThan(String value) {
            addCriterion("FYID >", value, "FYID");
            return (Criteria) this;
        }

        public Criteria andFYIDGreaterThanOrEqualTo(String value) {
            addCriterion("FYID >=", value, "FYID");
            return (Criteria) this;
        }

        public Criteria andFYIDLessThan(String value) {
            addCriterion("FYID <", value, "FYID");
            return (Criteria) this;
        }

        public Criteria andFYIDLessThanOrEqualTo(String value) {
            addCriterion("FYID <=", value, "FYID");
            return (Criteria) this;
        }

        public Criteria andFYIDLike(String value) {
            addCriterion("FYID like", value, "FYID");
            return (Criteria) this;
        }

        public Criteria andFYIDNotLike(String value) {
            addCriterion("FYID not like", value, "FYID");
            return (Criteria) this;
        }

        public Criteria andFYIDIn(List<String> values) {
            addCriterion("FYID in", values, "FYID");
            return (Criteria) this;
        }

        public Criteria andFYIDNotIn(List<String> values) {
            addCriterion("FYID not in", values, "FYID");
            return (Criteria) this;
        }

        public Criteria andFYIDBetween(String value1, String value2) {
            addCriterion("FYID between", value1, value2, "FYID");
            return (Criteria) this;
        }

        public Criteria andFYIDNotBetween(String value1, String value2) {
            addCriterion("FYID not between", value1, value2, "FYID");
            return (Criteria) this;
        }

        public Criteria andFYCODEIsNull() {
            addCriterion("FYCODE is null");
            return (Criteria) this;
        }

        public Criteria andFYCODEIsNotNull() {
            addCriterion("FYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andFYCODEEqualTo(String value) {
            addCriterion("FYCODE =", value, "FYCODE");
            return (Criteria) this;
        }

        public Criteria andFYCODENotEqualTo(String value) {
            addCriterion("FYCODE <>", value, "FYCODE");
            return (Criteria) this;
        }

        public Criteria andFYCODEGreaterThan(String value) {
            addCriterion("FYCODE >", value, "FYCODE");
            return (Criteria) this;
        }

        public Criteria andFYCODEGreaterThanOrEqualTo(String value) {
            addCriterion("FYCODE >=", value, "FYCODE");
            return (Criteria) this;
        }

        public Criteria andFYCODELessThan(String value) {
            addCriterion("FYCODE <", value, "FYCODE");
            return (Criteria) this;
        }

        public Criteria andFYCODELessThanOrEqualTo(String value) {
            addCriterion("FYCODE <=", value, "FYCODE");
            return (Criteria) this;
        }

        public Criteria andFYCODELike(String value) {
            addCriterion("FYCODE like", value, "FYCODE");
            return (Criteria) this;
        }

        public Criteria andFYCODENotLike(String value) {
            addCriterion("FYCODE not like", value, "FYCODE");
            return (Criteria) this;
        }

        public Criteria andFYCODEIn(List<String> values) {
            addCriterion("FYCODE in", values, "FYCODE");
            return (Criteria) this;
        }

        public Criteria andFYCODENotIn(List<String> values) {
            addCriterion("FYCODE not in", values, "FYCODE");
            return (Criteria) this;
        }

        public Criteria andFYCODEBetween(String value1, String value2) {
            addCriterion("FYCODE between", value1, value2, "FYCODE");
            return (Criteria) this;
        }

        public Criteria andFYCODENotBetween(String value1, String value2) {
            addCriterion("FYCODE not between", value1, value2, "FYCODE");
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

        public Criteria andHTIDIsNull() {
            addCriterion("HTID is null");
            return (Criteria) this;
        }

        public Criteria andHTIDIsNotNull() {
            addCriterion("HTID is not null");
            return (Criteria) this;
        }

        public Criteria andHTIDEqualTo(String value) {
            addCriterion("HTID =", value, "HTID");
            return (Criteria) this;
        }

        public Criteria andHTIDNotEqualTo(String value) {
            addCriterion("HTID <>", value, "HTID");
            return (Criteria) this;
        }

        public Criteria andHTIDGreaterThan(String value) {
            addCriterion("HTID >", value, "HTID");
            return (Criteria) this;
        }

        public Criteria andHTIDGreaterThanOrEqualTo(String value) {
            addCriterion("HTID >=", value, "HTID");
            return (Criteria) this;
        }

        public Criteria andHTIDLessThan(String value) {
            addCriterion("HTID <", value, "HTID");
            return (Criteria) this;
        }

        public Criteria andHTIDLessThanOrEqualTo(String value) {
            addCriterion("HTID <=", value, "HTID");
            return (Criteria) this;
        }

        public Criteria andHTIDLike(String value) {
            addCriterion("HTID like", value, "HTID");
            return (Criteria) this;
        }

        public Criteria andHTIDNotLike(String value) {
            addCriterion("HTID not like", value, "HTID");
            return (Criteria) this;
        }

        public Criteria andHTIDIn(List<String> values) {
            addCriterion("HTID in", values, "HTID");
            return (Criteria) this;
        }

        public Criteria andHTIDNotIn(List<String> values) {
            addCriterion("HTID not in", values, "HTID");
            return (Criteria) this;
        }

        public Criteria andHTIDBetween(String value1, String value2) {
            addCriterion("HTID between", value1, value2, "HTID");
            return (Criteria) this;
        }

        public Criteria andHTIDNotBetween(String value1, String value2) {
            addCriterion("HTID not between", value1, value2, "HTID");
            return (Criteria) this;
        }

        public Criteria andHTCODEIsNull() {
            addCriterion("HTCODE is null");
            return (Criteria) this;
        }

        public Criteria andHTCODEIsNotNull() {
            addCriterion("HTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andHTCODEEqualTo(String value) {
            addCriterion("HTCODE =", value, "HTCODE");
            return (Criteria) this;
        }

        public Criteria andHTCODENotEqualTo(String value) {
            addCriterion("HTCODE <>", value, "HTCODE");
            return (Criteria) this;
        }

        public Criteria andHTCODEGreaterThan(String value) {
            addCriterion("HTCODE >", value, "HTCODE");
            return (Criteria) this;
        }

        public Criteria andHTCODEGreaterThanOrEqualTo(String value) {
            addCriterion("HTCODE >=", value, "HTCODE");
            return (Criteria) this;
        }

        public Criteria andHTCODELessThan(String value) {
            addCriterion("HTCODE <", value, "HTCODE");
            return (Criteria) this;
        }

        public Criteria andHTCODELessThanOrEqualTo(String value) {
            addCriterion("HTCODE <=", value, "HTCODE");
            return (Criteria) this;
        }

        public Criteria andHTCODELike(String value) {
            addCriterion("HTCODE like", value, "HTCODE");
            return (Criteria) this;
        }

        public Criteria andHTCODENotLike(String value) {
            addCriterion("HTCODE not like", value, "HTCODE");
            return (Criteria) this;
        }

        public Criteria andHTCODEIn(List<String> values) {
            addCriterion("HTCODE in", values, "HTCODE");
            return (Criteria) this;
        }

        public Criteria andHTCODENotIn(List<String> values) {
            addCriterion("HTCODE not in", values, "HTCODE");
            return (Criteria) this;
        }

        public Criteria andHTCODEBetween(String value1, String value2) {
            addCriterion("HTCODE between", value1, value2, "HTCODE");
            return (Criteria) this;
        }

        public Criteria andHTCODENotBetween(String value1, String value2) {
            addCriterion("HTCODE not between", value1, value2, "HTCODE");
            return (Criteria) this;
        }

        public Criteria andHZBHIsNull() {
            addCriterion("HZBH is null");
            return (Criteria) this;
        }

        public Criteria andHZBHIsNotNull() {
            addCriterion("HZBH is not null");
            return (Criteria) this;
        }

        public Criteria andHZBHEqualTo(String value) {
            addCriterion("HZBH =", value, "HZBH");
            return (Criteria) this;
        }

        public Criteria andHZBHNotEqualTo(String value) {
            addCriterion("HZBH <>", value, "HZBH");
            return (Criteria) this;
        }

        public Criteria andHZBHGreaterThan(String value) {
            addCriterion("HZBH >", value, "HZBH");
            return (Criteria) this;
        }

        public Criteria andHZBHGreaterThanOrEqualTo(String value) {
            addCriterion("HZBH >=", value, "HZBH");
            return (Criteria) this;
        }

        public Criteria andHZBHLessThan(String value) {
            addCriterion("HZBH <", value, "HZBH");
            return (Criteria) this;
        }

        public Criteria andHZBHLessThanOrEqualTo(String value) {
            addCriterion("HZBH <=", value, "HZBH");
            return (Criteria) this;
        }

        public Criteria andHZBHLike(String value) {
            addCriterion("HZBH like", value, "HZBH");
            return (Criteria) this;
        }

        public Criteria andHZBHNotLike(String value) {
            addCriterion("HZBH not like", value, "HZBH");
            return (Criteria) this;
        }

        public Criteria andHZBHIn(List<String> values) {
            addCriterion("HZBH in", values, "HZBH");
            return (Criteria) this;
        }

        public Criteria andHZBHNotIn(List<String> values) {
            addCriterion("HZBH not in", values, "HZBH");
            return (Criteria) this;
        }

        public Criteria andHZBHBetween(String value1, String value2) {
            addCriterion("HZBH between", value1, value2, "HZBH");
            return (Criteria) this;
        }

        public Criteria andHZBHNotBetween(String value1, String value2) {
            addCriterion("HZBH not between", value1, value2, "HZBH");
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

        public Criteria andYZJIsNull() {
            addCriterion("YZJ is null");
            return (Criteria) this;
        }

        public Criteria andYZJIsNotNull() {
            addCriterion("YZJ is not null");
            return (Criteria) this;
        }

        public Criteria andYZJEqualTo(BigDecimal value) {
            addCriterion("YZJ =", value, "YZJ");
            return (Criteria) this;
        }

        public Criteria andYZJNotEqualTo(BigDecimal value) {
            addCriterion("YZJ <>", value, "YZJ");
            return (Criteria) this;
        }

        public Criteria andYZJGreaterThan(BigDecimal value) {
            addCriterion("YZJ >", value, "YZJ");
            return (Criteria) this;
        }

        public Criteria andYZJGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YZJ >=", value, "YZJ");
            return (Criteria) this;
        }

        public Criteria andYZJLessThan(BigDecimal value) {
            addCriterion("YZJ <", value, "YZJ");
            return (Criteria) this;
        }

        public Criteria andYZJLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YZJ <=", value, "YZJ");
            return (Criteria) this;
        }

        public Criteria andYZJIn(List<BigDecimal> values) {
            addCriterion("YZJ in", values, "YZJ");
            return (Criteria) this;
        }

        public Criteria andYZJNotIn(List<BigDecimal> values) {
            addCriterion("YZJ not in", values, "YZJ");
            return (Criteria) this;
        }

        public Criteria andYZJBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YZJ between", value1, value2, "YZJ");
            return (Criteria) this;
        }

        public Criteria andYZJNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YZJ not between", value1, value2, "YZJ");
            return (Criteria) this;
        }

        public Criteria andPZRSIsNull() {
            addCriterion("PZRS is null");
            return (Criteria) this;
        }

        public Criteria andPZRSIsNotNull() {
            addCriterion("PZRS is not null");
            return (Criteria) this;
        }

        public Criteria andPZRSEqualTo(Integer value) {
            addCriterion("PZRS =", value, "PZRS");
            return (Criteria) this;
        }

        public Criteria andPZRSNotEqualTo(Integer value) {
            addCriterion("PZRS <>", value, "PZRS");
            return (Criteria) this;
        }

        public Criteria andPZRSGreaterThan(Integer value) {
            addCriterion("PZRS >", value, "PZRS");
            return (Criteria) this;
        }

        public Criteria andPZRSGreaterThanOrEqualTo(Integer value) {
            addCriterion("PZRS >=", value, "PZRS");
            return (Criteria) this;
        }

        public Criteria andPZRSLessThan(Integer value) {
            addCriterion("PZRS <", value, "PZRS");
            return (Criteria) this;
        }

        public Criteria andPZRSLessThanOrEqualTo(Integer value) {
            addCriterion("PZRS <=", value, "PZRS");
            return (Criteria) this;
        }

        public Criteria andPZRSIn(List<Integer> values) {
            addCriterion("PZRS in", values, "PZRS");
            return (Criteria) this;
        }

        public Criteria andPZRSNotIn(List<Integer> values) {
            addCriterion("PZRS not in", values, "PZRS");
            return (Criteria) this;
        }

        public Criteria andPZRSBetween(Integer value1, Integer value2) {
            addCriterion("PZRS between", value1, value2, "PZRS");
            return (Criteria) this;
        }

        public Criteria andPZRSNotBetween(Integer value1, Integer value2) {
            addCriterion("PZRS not between", value1, value2, "PZRS");
            return (Criteria) this;
        }

        public Criteria andXFJGIDIsNull() {
            addCriterion("XFJGID is null");
            return (Criteria) this;
        }

        public Criteria andXFJGIDIsNotNull() {
            addCriterion("XFJGID is not null");
            return (Criteria) this;
        }

        public Criteria andXFJGIDEqualTo(String value) {
            addCriterion("XFJGID =", value, "XFJGID");
            return (Criteria) this;
        }

        public Criteria andXFJGIDNotEqualTo(String value) {
            addCriterion("XFJGID <>", value, "XFJGID");
            return (Criteria) this;
        }

        public Criteria andXFJGIDGreaterThan(String value) {
            addCriterion("XFJGID >", value, "XFJGID");
            return (Criteria) this;
        }

        public Criteria andXFJGIDGreaterThanOrEqualTo(String value) {
            addCriterion("XFJGID >=", value, "XFJGID");
            return (Criteria) this;
        }

        public Criteria andXFJGIDLessThan(String value) {
            addCriterion("XFJGID <", value, "XFJGID");
            return (Criteria) this;
        }

        public Criteria andXFJGIDLessThanOrEqualTo(String value) {
            addCriterion("XFJGID <=", value, "XFJGID");
            return (Criteria) this;
        }

        public Criteria andXFJGIDLike(String value) {
            addCriterion("XFJGID like", value, "XFJGID");
            return (Criteria) this;
        }

        public Criteria andXFJGIDNotLike(String value) {
            addCriterion("XFJGID not like", value, "XFJGID");
            return (Criteria) this;
        }

        public Criteria andXFJGIDIn(List<String> values) {
            addCriterion("XFJGID in", values, "XFJGID");
            return (Criteria) this;
        }

        public Criteria andXFJGIDNotIn(List<String> values) {
            addCriterion("XFJGID not in", values, "XFJGID");
            return (Criteria) this;
        }

        public Criteria andXFJGIDBetween(String value1, String value2) {
            addCriterion("XFJGID between", value1, value2, "XFJGID");
            return (Criteria) this;
        }

        public Criteria andXFJGIDNotBetween(String value1, String value2) {
            addCriterion("XFJGID not between", value1, value2, "XFJGID");
            return (Criteria) this;
        }

        public Criteria andSQRZJHMIsNull() {
            addCriterion("SQRZJHM is null");
            return (Criteria) this;
        }

        public Criteria andSQRZJHMIsNotNull() {
            addCriterion("SQRZJHM is not null");
            return (Criteria) this;
        }

        public Criteria andSQRZJHMEqualTo(String value) {
            addCriterion("SQRZJHM =", value, "SQRZJHM");
            return (Criteria) this;
        }

        public Criteria andSQRZJHMNotEqualTo(String value) {
            addCriterion("SQRZJHM <>", value, "SQRZJHM");
            return (Criteria) this;
        }

        public Criteria andSQRZJHMGreaterThan(String value) {
            addCriterion("SQRZJHM >", value, "SQRZJHM");
            return (Criteria) this;
        }

        public Criteria andSQRZJHMGreaterThanOrEqualTo(String value) {
            addCriterion("SQRZJHM >=", value, "SQRZJHM");
            return (Criteria) this;
        }

        public Criteria andSQRZJHMLessThan(String value) {
            addCriterion("SQRZJHM <", value, "SQRZJHM");
            return (Criteria) this;
        }

        public Criteria andSQRZJHMLessThanOrEqualTo(String value) {
            addCriterion("SQRZJHM <=", value, "SQRZJHM");
            return (Criteria) this;
        }

        public Criteria andSQRZJHMLike(String value) {
            addCriterion("SQRZJHM like", value, "SQRZJHM");
            return (Criteria) this;
        }

        public Criteria andSQRZJHMNotLike(String value) {
            addCriterion("SQRZJHM not like", value, "SQRZJHM");
            return (Criteria) this;
        }

        public Criteria andSQRZJHMIn(List<String> values) {
            addCriterion("SQRZJHM in", values, "SQRZJHM");
            return (Criteria) this;
        }

        public Criteria andSQRZJHMNotIn(List<String> values) {
            addCriterion("SQRZJHM not in", values, "SQRZJHM");
            return (Criteria) this;
        }

        public Criteria andSQRZJHMBetween(String value1, String value2) {
            addCriterion("SQRZJHM between", value1, value2, "SQRZJHM");
            return (Criteria) this;
        }

        public Criteria andSQRZJHMNotBetween(String value1, String value2) {
            addCriterion("SQRZJHM not between", value1, value2, "SQRZJHM");
            return (Criteria) this;
        }

        public Criteria andYHMCIsNull() {
            addCriterion("YHMC is null");
            return (Criteria) this;
        }

        public Criteria andYHMCIsNotNull() {
            addCriterion("YHMC is not null");
            return (Criteria) this;
        }

        public Criteria andYHMCEqualTo(String value) {
            addCriterion("YHMC =", value, "YHMC");
            return (Criteria) this;
        }

        public Criteria andYHMCNotEqualTo(String value) {
            addCriterion("YHMC <>", value, "YHMC");
            return (Criteria) this;
        }

        public Criteria andYHMCGreaterThan(String value) {
            addCriterion("YHMC >", value, "YHMC");
            return (Criteria) this;
        }

        public Criteria andYHMCGreaterThanOrEqualTo(String value) {
            addCriterion("YHMC >=", value, "YHMC");
            return (Criteria) this;
        }

        public Criteria andYHMCLessThan(String value) {
            addCriterion("YHMC <", value, "YHMC");
            return (Criteria) this;
        }

        public Criteria andYHMCLessThanOrEqualTo(String value) {
            addCriterion("YHMC <=", value, "YHMC");
            return (Criteria) this;
        }

        public Criteria andYHMCLike(String value) {
            addCriterion("YHMC like", value, "YHMC");
            return (Criteria) this;
        }

        public Criteria andYHMCNotLike(String value) {
            addCriterion("YHMC not like", value, "YHMC");
            return (Criteria) this;
        }

        public Criteria andYHMCIn(List<String> values) {
            addCriterion("YHMC in", values, "YHMC");
            return (Criteria) this;
        }

        public Criteria andYHMCNotIn(List<String> values) {
            addCriterion("YHMC not in", values, "YHMC");
            return (Criteria) this;
        }

        public Criteria andYHMCBetween(String value1, String value2) {
            addCriterion("YHMC between", value1, value2, "YHMC");
            return (Criteria) this;
        }

        public Criteria andYHMCNotBetween(String value1, String value2) {
            addCriterion("YHMC not between", value1, value2, "YHMC");
            return (Criteria) this;
        }

        public Criteria andYHKHIsNull() {
            addCriterion("YHKH is null");
            return (Criteria) this;
        }

        public Criteria andYHKHIsNotNull() {
            addCriterion("YHKH is not null");
            return (Criteria) this;
        }

        public Criteria andYHKHEqualTo(String value) {
            addCriterion("YHKH =", value, "YHKH");
            return (Criteria) this;
        }

        public Criteria andYHKHNotEqualTo(String value) {
            addCriterion("YHKH <>", value, "YHKH");
            return (Criteria) this;
        }

        public Criteria andYHKHGreaterThan(String value) {
            addCriterion("YHKH >", value, "YHKH");
            return (Criteria) this;
        }

        public Criteria andYHKHGreaterThanOrEqualTo(String value) {
            addCriterion("YHKH >=", value, "YHKH");
            return (Criteria) this;
        }

        public Criteria andYHKHLessThan(String value) {
            addCriterion("YHKH <", value, "YHKH");
            return (Criteria) this;
        }

        public Criteria andYHKHLessThanOrEqualTo(String value) {
            addCriterion("YHKH <=", value, "YHKH");
            return (Criteria) this;
        }

        public Criteria andYHKHLike(String value) {
            addCriterion("YHKH like", value, "YHKH");
            return (Criteria) this;
        }

        public Criteria andYHKHNotLike(String value) {
            addCriterion("YHKH not like", value, "YHKH");
            return (Criteria) this;
        }

        public Criteria andYHKHIn(List<String> values) {
            addCriterion("YHKH in", values, "YHKH");
            return (Criteria) this;
        }

        public Criteria andYHKHNotIn(List<String> values) {
            addCriterion("YHKH not in", values, "YHKH");
            return (Criteria) this;
        }

        public Criteria andYHKHBetween(String value1, String value2) {
            addCriterion("YHKH between", value1, value2, "YHKH");
            return (Criteria) this;
        }

        public Criteria andYHKHNotBetween(String value1, String value2) {
            addCriterion("YHKH not between", value1, value2, "YHKH");
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

        public Criteria andSFHZIsNull() {
            addCriterion("SFHZ is null");
            return (Criteria) this;
        }

        public Criteria andSFHZIsNotNull() {
            addCriterion("SFHZ is not null");
            return (Criteria) this;
        }

        public Criteria andSFHZEqualTo(Short value) {
            addCriterion("SFHZ =", value, "SFHZ");
            return (Criteria) this;
        }

        public Criteria andSFHZNotEqualTo(Short value) {
            addCriterion("SFHZ <>", value, "SFHZ");
            return (Criteria) this;
        }

        public Criteria andSFHZGreaterThan(Short value) {
            addCriterion("SFHZ >", value, "SFHZ");
            return (Criteria) this;
        }

        public Criteria andSFHZGreaterThanOrEqualTo(Short value) {
            addCriterion("SFHZ >=", value, "SFHZ");
            return (Criteria) this;
        }

        public Criteria andSFHZLessThan(Short value) {
            addCriterion("SFHZ <", value, "SFHZ");
            return (Criteria) this;
        }

        public Criteria andSFHZLessThanOrEqualTo(Short value) {
            addCriterion("SFHZ <=", value, "SFHZ");
            return (Criteria) this;
        }

        public Criteria andSFHZIn(List<Short> values) {
            addCriterion("SFHZ in", values, "SFHZ");
            return (Criteria) this;
        }

        public Criteria andSFHZNotIn(List<Short> values) {
            addCriterion("SFHZ not in", values, "SFHZ");
            return (Criteria) this;
        }

        public Criteria andSFHZBetween(Short value1, Short value2) {
            addCriterion("SFHZ between", value1, value2, "SFHZ");
            return (Criteria) this;
        }

        public Criteria andSFHZNotBetween(Short value1, Short value2) {
            addCriterion("SFHZ not between", value1, value2, "SFHZ");
            return (Criteria) this;
        }

        public Criteria andYHZJZHIDIsNull() {
            addCriterion("YHZJZHID is null");
            return (Criteria) this;
        }

        public Criteria andYHZJZHIDIsNotNull() {
            addCriterion("YHZJZHID is not null");
            return (Criteria) this;
        }

        public Criteria andYHZJZHIDEqualTo(String value) {
            addCriterion("YHZJZHID =", value, "YHZJZHID");
            return (Criteria) this;
        }

        public Criteria andYHZJZHIDNotEqualTo(String value) {
            addCriterion("YHZJZHID <>", value, "YHZJZHID");
            return (Criteria) this;
        }

        public Criteria andYHZJZHIDGreaterThan(String value) {
            addCriterion("YHZJZHID >", value, "YHZJZHID");
            return (Criteria) this;
        }

        public Criteria andYHZJZHIDGreaterThanOrEqualTo(String value) {
            addCriterion("YHZJZHID >=", value, "YHZJZHID");
            return (Criteria) this;
        }

        public Criteria andYHZJZHIDLessThan(String value) {
            addCriterion("YHZJZHID <", value, "YHZJZHID");
            return (Criteria) this;
        }

        public Criteria andYHZJZHIDLessThanOrEqualTo(String value) {
            addCriterion("YHZJZHID <=", value, "YHZJZHID");
            return (Criteria) this;
        }

        public Criteria andYHZJZHIDLike(String value) {
            addCriterion("YHZJZHID like", value, "YHZJZHID");
            return (Criteria) this;
        }

        public Criteria andYHZJZHIDNotLike(String value) {
            addCriterion("YHZJZHID not like", value, "YHZJZHID");
            return (Criteria) this;
        }

        public Criteria andYHZJZHIDIn(List<String> values) {
            addCriterion("YHZJZHID in", values, "YHZJZHID");
            return (Criteria) this;
        }

        public Criteria andYHZJZHIDNotIn(List<String> values) {
            addCriterion("YHZJZHID not in", values, "YHZJZHID");
            return (Criteria) this;
        }

        public Criteria andYHZJZHIDBetween(String value1, String value2) {
            addCriterion("YHZJZHID between", value1, value2, "YHZJZHID");
            return (Criteria) this;
        }

        public Criteria andYHZJZHIDNotBetween(String value1, String value2) {
            addCriterion("YHZJZHID not between", value1, value2, "YHZJZHID");
            return (Criteria) this;
        }

        public Criteria andPZHXIsNull() {
            addCriterion("PZHX is null");
            return (Criteria) this;
        }

        public Criteria andPZHXIsNotNull() {
            addCriterion("PZHX is not null");
            return (Criteria) this;
        }

        public Criteria andPZHXEqualTo(String value) {
            addCriterion("PZHX =", value, "PZHX");
            return (Criteria) this;
        }

        public Criteria andPZHXNotEqualTo(String value) {
            addCriterion("PZHX <>", value, "PZHX");
            return (Criteria) this;
        }

        public Criteria andPZHXGreaterThan(String value) {
            addCriterion("PZHX >", value, "PZHX");
            return (Criteria) this;
        }

        public Criteria andPZHXGreaterThanOrEqualTo(String value) {
            addCriterion("PZHX >=", value, "PZHX");
            return (Criteria) this;
        }

        public Criteria andPZHXLessThan(String value) {
            addCriterion("PZHX <", value, "PZHX");
            return (Criteria) this;
        }

        public Criteria andPZHXLessThanOrEqualTo(String value) {
            addCriterion("PZHX <=", value, "PZHX");
            return (Criteria) this;
        }

        public Criteria andPZHXLike(String value) {
            addCriterion("PZHX like", value, "PZHX");
            return (Criteria) this;
        }

        public Criteria andPZHXNotLike(String value) {
            addCriterion("PZHX not like", value, "PZHX");
            return (Criteria) this;
        }

        public Criteria andPZHXIn(List<String> values) {
            addCriterion("PZHX in", values, "PZHX");
            return (Criteria) this;
        }

        public Criteria andPZHXNotIn(List<String> values) {
            addCriterion("PZHX not in", values, "PZHX");
            return (Criteria) this;
        }

        public Criteria andPZHXBetween(String value1, String value2) {
            addCriterion("PZHX between", value1, value2, "PZHX");
            return (Criteria) this;
        }

        public Criteria andPZHXNotBetween(String value1, String value2) {
            addCriterion("PZHX not between", value1, value2, "PZHX");
            return (Criteria) this;
        }

        public Criteria andPZZGZHIsNull() {
            addCriterion("PZZGZH is null");
            return (Criteria) this;
        }

        public Criteria andPZZGZHIsNotNull() {
            addCriterion("PZZGZH is not null");
            return (Criteria) this;
        }

        public Criteria andPZZGZHEqualTo(String value) {
            addCriterion("PZZGZH =", value, "PZZGZH");
            return (Criteria) this;
        }

        public Criteria andPZZGZHNotEqualTo(String value) {
            addCriterion("PZZGZH <>", value, "PZZGZH");
            return (Criteria) this;
        }

        public Criteria andPZZGZHGreaterThan(String value) {
            addCriterion("PZZGZH >", value, "PZZGZH");
            return (Criteria) this;
        }

        public Criteria andPZZGZHGreaterThanOrEqualTo(String value) {
            addCriterion("PZZGZH >=", value, "PZZGZH");
            return (Criteria) this;
        }

        public Criteria andPZZGZHLessThan(String value) {
            addCriterion("PZZGZH <", value, "PZZGZH");
            return (Criteria) this;
        }

        public Criteria andPZZGZHLessThanOrEqualTo(String value) {
            addCriterion("PZZGZH <=", value, "PZZGZH");
            return (Criteria) this;
        }

        public Criteria andPZZGZHLike(String value) {
            addCriterion("PZZGZH like", value, "PZZGZH");
            return (Criteria) this;
        }

        public Criteria andPZZGZHNotLike(String value) {
            addCriterion("PZZGZH not like", value, "PZZGZH");
            return (Criteria) this;
        }

        public Criteria andPZZGZHIn(List<String> values) {
            addCriterion("PZZGZH in", values, "PZZGZH");
            return (Criteria) this;
        }

        public Criteria andPZZGZHNotIn(List<String> values) {
            addCriterion("PZZGZH not in", values, "PZZGZH");
            return (Criteria) this;
        }

        public Criteria andPZZGZHBetween(String value1, String value2) {
            addCriterion("PZZGZH between", value1, value2, "PZZGZH");
            return (Criteria) this;
        }

        public Criteria andPZZGZHNotBetween(String value1, String value2) {
            addCriterion("PZZGZH not between", value1, value2, "PZZGZH");
            return (Criteria) this;
        }

        public Criteria andXZLXIsNull() {
            addCriterion("XZLX is null");
            return (Criteria) this;
        }

        public Criteria andXZLXIsNotNull() {
            addCriterion("XZLX is not null");
            return (Criteria) this;
        }

        public Criteria andXZLXEqualTo(String value) {
            addCriterion("XZLX =", value, "XZLX");
            return (Criteria) this;
        }

        public Criteria andXZLXNotEqualTo(String value) {
            addCriterion("XZLX <>", value, "XZLX");
            return (Criteria) this;
        }

        public Criteria andXZLXGreaterThan(String value) {
            addCriterion("XZLX >", value, "XZLX");
            return (Criteria) this;
        }

        public Criteria andXZLXGreaterThanOrEqualTo(String value) {
            addCriterion("XZLX >=", value, "XZLX");
            return (Criteria) this;
        }

        public Criteria andXZLXLessThan(String value) {
            addCriterion("XZLX <", value, "XZLX");
            return (Criteria) this;
        }

        public Criteria andXZLXLessThanOrEqualTo(String value) {
            addCriterion("XZLX <=", value, "XZLX");
            return (Criteria) this;
        }

        public Criteria andXZLXLike(String value) {
            addCriterion("XZLX like", value, "XZLX");
            return (Criteria) this;
        }

        public Criteria andXZLXNotLike(String value) {
            addCriterion("XZLX not like", value, "XZLX");
            return (Criteria) this;
        }

        public Criteria andXZLXIn(List<String> values) {
            addCriterion("XZLX in", values, "XZLX");
            return (Criteria) this;
        }

        public Criteria andXZLXNotIn(List<String> values) {
            addCriterion("XZLX not in", values, "XZLX");
            return (Criteria) this;
        }

        public Criteria andXZLXBetween(String value1, String value2) {
            addCriterion("XZLX between", value1, value2, "XZLX");
            return (Criteria) this;
        }

        public Criteria andXZLXNotBetween(String value1, String value2) {
            addCriterion("XZLX not between", value1, value2, "XZLX");
            return (Criteria) this;
        }

        public Criteria andSFNSBTGXZIsNull() {
            addCriterion("SFNSBTGXZ is null");
            return (Criteria) this;
        }

        public Criteria andSFNSBTGXZIsNotNull() {
            addCriterion("SFNSBTGXZ is not null");
            return (Criteria) this;
        }

        public Criteria andSFNSBTGXZEqualTo(Short value) {
            addCriterion("SFNSBTGXZ =", value, "SFNSBTGXZ");
            return (Criteria) this;
        }

        public Criteria andSFNSBTGXZNotEqualTo(Short value) {
            addCriterion("SFNSBTGXZ <>", value, "SFNSBTGXZ");
            return (Criteria) this;
        }

        public Criteria andSFNSBTGXZGreaterThan(Short value) {
            addCriterion("SFNSBTGXZ >", value, "SFNSBTGXZ");
            return (Criteria) this;
        }

        public Criteria andSFNSBTGXZGreaterThanOrEqualTo(Short value) {
            addCriterion("SFNSBTGXZ >=", value, "SFNSBTGXZ");
            return (Criteria) this;
        }

        public Criteria andSFNSBTGXZLessThan(Short value) {
            addCriterion("SFNSBTGXZ <", value, "SFNSBTGXZ");
            return (Criteria) this;
        }

        public Criteria andSFNSBTGXZLessThanOrEqualTo(Short value) {
            addCriterion("SFNSBTGXZ <=", value, "SFNSBTGXZ");
            return (Criteria) this;
        }

        public Criteria andSFNSBTGXZIn(List<Short> values) {
            addCriterion("SFNSBTGXZ in", values, "SFNSBTGXZ");
            return (Criteria) this;
        }

        public Criteria andSFNSBTGXZNotIn(List<Short> values) {
            addCriterion("SFNSBTGXZ not in", values, "SFNSBTGXZ");
            return (Criteria) this;
        }

        public Criteria andSFNSBTGXZBetween(Short value1, Short value2) {
            addCriterion("SFNSBTGXZ between", value1, value2, "SFNSBTGXZ");
            return (Criteria) this;
        }

        public Criteria andSFNSBTGXZNotBetween(Short value1, Short value2) {
            addCriterion("SFNSBTGXZ not between", value1, value2, "SFNSBTGXZ");
            return (Criteria) this;
        }

        public Criteria andWWHTBHIsNull() {
            addCriterion("WWHTBH is null");
            return (Criteria) this;
        }

        public Criteria andWWHTBHIsNotNull() {
            addCriterion("WWHTBH is not null");
            return (Criteria) this;
        }

        public Criteria andWWHTBHEqualTo(String value) {
            addCriterion("WWHTBH =", value, "WWHTBH");
            return (Criteria) this;
        }

        public Criteria andWWHTBHNotEqualTo(String value) {
            addCriterion("WWHTBH <>", value, "WWHTBH");
            return (Criteria) this;
        }

        public Criteria andWWHTBHGreaterThan(String value) {
            addCriterion("WWHTBH >", value, "WWHTBH");
            return (Criteria) this;
        }

        public Criteria andWWHTBHGreaterThanOrEqualTo(String value) {
            addCriterion("WWHTBH >=", value, "WWHTBH");
            return (Criteria) this;
        }

        public Criteria andWWHTBHLessThan(String value) {
            addCriterion("WWHTBH <", value, "WWHTBH");
            return (Criteria) this;
        }

        public Criteria andWWHTBHLessThanOrEqualTo(String value) {
            addCriterion("WWHTBH <=", value, "WWHTBH");
            return (Criteria) this;
        }

        public Criteria andWWHTBHLike(String value) {
            addCriterion("WWHTBH like", value, "WWHTBH");
            return (Criteria) this;
        }

        public Criteria andWWHTBHNotLike(String value) {
            addCriterion("WWHTBH not like", value, "WWHTBH");
            return (Criteria) this;
        }

        public Criteria andWWHTBHIn(List<String> values) {
            addCriterion("WWHTBH in", values, "WWHTBH");
            return (Criteria) this;
        }

        public Criteria andWWHTBHNotIn(List<String> values) {
            addCriterion("WWHTBH not in", values, "WWHTBH");
            return (Criteria) this;
        }

        public Criteria andWWHTBHBetween(String value1, String value2) {
            addCriterion("WWHTBH between", value1, value2, "WWHTBH");
            return (Criteria) this;
        }

        public Criteria andWWHTBHNotBetween(String value1, String value2) {
            addCriterion("WWHTBH not between", value1, value2, "WWHTBH");
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

        public Criteria andZHIDIsNull() {
            addCriterion("ZHID is null");
            return (Criteria) this;
        }

        public Criteria andZHIDIsNotNull() {
            addCriterion("ZHID is not null");
            return (Criteria) this;
        }

        public Criteria andZHIDEqualTo(String value) {
            addCriterion("ZHID =", value, "ZHID");
            return (Criteria) this;
        }

        public Criteria andZHIDNotEqualTo(String value) {
            addCriterion("ZHID <>", value, "ZHID");
            return (Criteria) this;
        }

        public Criteria andZHIDGreaterThan(String value) {
            addCriterion("ZHID >", value, "ZHID");
            return (Criteria) this;
        }

        public Criteria andZHIDGreaterThanOrEqualTo(String value) {
            addCriterion("ZHID >=", value, "ZHID");
            return (Criteria) this;
        }

        public Criteria andZHIDLessThan(String value) {
            addCriterion("ZHID <", value, "ZHID");
            return (Criteria) this;
        }

        public Criteria andZHIDLessThanOrEqualTo(String value) {
            addCriterion("ZHID <=", value, "ZHID");
            return (Criteria) this;
        }

        public Criteria andZHIDLike(String value) {
            addCriterion("ZHID like", value, "ZHID");
            return (Criteria) this;
        }

        public Criteria andZHIDNotLike(String value) {
            addCriterion("ZHID not like", value, "ZHID");
            return (Criteria) this;
        }

        public Criteria andZHIDIn(List<String> values) {
            addCriterion("ZHID in", values, "ZHID");
            return (Criteria) this;
        }

        public Criteria andZHIDNotIn(List<String> values) {
            addCriterion("ZHID not in", values, "ZHID");
            return (Criteria) this;
        }

        public Criteria andZHIDBetween(String value1, String value2) {
            addCriterion("ZHID between", value1, value2, "ZHID");
            return (Criteria) this;
        }

        public Criteria andZHIDNotBetween(String value1, String value2) {
            addCriterion("ZHID not between", value1, value2, "ZHID");
            return (Criteria) this;
        }

        public Criteria andPZLXIsNull() {
            addCriterion("PZLX is null");
            return (Criteria) this;
        }

        public Criteria andPZLXIsNotNull() {
            addCriterion("PZLX is not null");
            return (Criteria) this;
        }

        public Criteria andPZLXEqualTo(String value) {
            addCriterion("PZLX =", value, "PZLX");
            return (Criteria) this;
        }

        public Criteria andPZLXNotEqualTo(String value) {
            addCriterion("PZLX <>", value, "PZLX");
            return (Criteria) this;
        }

        public Criteria andPZLXGreaterThan(String value) {
            addCriterion("PZLX >", value, "PZLX");
            return (Criteria) this;
        }

        public Criteria andPZLXGreaterThanOrEqualTo(String value) {
            addCriterion("PZLX >=", value, "PZLX");
            return (Criteria) this;
        }

        public Criteria andPZLXLessThan(String value) {
            addCriterion("PZLX <", value, "PZLX");
            return (Criteria) this;
        }

        public Criteria andPZLXLessThanOrEqualTo(String value) {
            addCriterion("PZLX <=", value, "PZLX");
            return (Criteria) this;
        }

        public Criteria andPZLXLike(String value) {
            addCriterion("PZLX like", value, "PZLX");
            return (Criteria) this;
        }

        public Criteria andPZLXNotLike(String value) {
            addCriterion("PZLX not like", value, "PZLX");
            return (Criteria) this;
        }

        public Criteria andPZLXIn(List<String> values) {
            addCriterion("PZLX in", values, "PZLX");
            return (Criteria) this;
        }

        public Criteria andPZLXNotIn(List<String> values) {
            addCriterion("PZLX not in", values, "PZLX");
            return (Criteria) this;
        }

        public Criteria andPZLXBetween(String value1, String value2) {
            addCriterion("PZLX between", value1, value2, "PZLX");
            return (Criteria) this;
        }

        public Criteria andPZLXNotBetween(String value1, String value2) {
            addCriterion("PZLX not between", value1, value2, "PZLX");
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

        public Criteria andZZSJIsNull() {
            addCriterion("ZZSJ is null");
            return (Criteria) this;
        }

        public Criteria andZZSJIsNotNull() {
            addCriterion("ZZSJ is not null");
            return (Criteria) this;
        }

        public Criteria andZZSJEqualTo(Date value) {
            addCriterion("ZZSJ =", value, "ZZSJ");
            return (Criteria) this;
        }

        public Criteria andZZSJNotEqualTo(Date value) {
            addCriterion("ZZSJ <>", value, "ZZSJ");
            return (Criteria) this;
        }

        public Criteria andZZSJGreaterThan(Date value) {
            addCriterion("ZZSJ >", value, "ZZSJ");
            return (Criteria) this;
        }

        public Criteria andZZSJGreaterThanOrEqualTo(Date value) {
            addCriterion("ZZSJ >=", value, "ZZSJ");
            return (Criteria) this;
        }

        public Criteria andZZSJLessThan(Date value) {
            addCriterion("ZZSJ <", value, "ZZSJ");
            return (Criteria) this;
        }

        public Criteria andZZSJLessThanOrEqualTo(Date value) {
            addCriterion("ZZSJ <=", value, "ZZSJ");
            return (Criteria) this;
        }

        public Criteria andZZSJIn(List<Date> values) {
            addCriterion("ZZSJ in", values, "ZZSJ");
            return (Criteria) this;
        }

        public Criteria andZZSJNotIn(List<Date> values) {
            addCriterion("ZZSJ not in", values, "ZZSJ");
            return (Criteria) this;
        }

        public Criteria andZZSJBetween(Date value1, Date value2) {
            addCriterion("ZZSJ between", value1, value2, "ZZSJ");
            return (Criteria) this;
        }

        public Criteria andZZSJNotBetween(Date value1, Date value2) {
            addCriterion("ZZSJ not between", value1, value2, "ZZSJ");
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
