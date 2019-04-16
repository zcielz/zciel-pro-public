package cn.zciel.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TpoZhxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public TpoZhxxExample() {
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

        public Criteria andXMIsNull() {
            addCriterion("XM is null");
            return (Criteria) this;
        }

        public Criteria andXMIsNotNull() {
            addCriterion("XM is not null");
            return (Criteria) this;
        }

        public Criteria andXMEqualTo(String value) {
            addCriterion("XM =", value, "XM");
            return (Criteria) this;
        }

        public Criteria andXMNotEqualTo(String value) {
            addCriterion("XM <>", value, "XM");
            return (Criteria) this;
        }

        public Criteria andXMGreaterThan(String value) {
            addCriterion("XM >", value, "XM");
            return (Criteria) this;
        }

        public Criteria andXMGreaterThanOrEqualTo(String value) {
            addCriterion("XM >=", value, "XM");
            return (Criteria) this;
        }

        public Criteria andXMLessThan(String value) {
            addCriterion("XM <", value, "XM");
            return (Criteria) this;
        }

        public Criteria andXMLessThanOrEqualTo(String value) {
            addCriterion("XM <=", value, "XM");
            return (Criteria) this;
        }

        public Criteria andXMLike(String value) {
            addCriterion("XM like", value, "XM");
            return (Criteria) this;
        }

        public Criteria andXMNotLike(String value) {
            addCriterion("XM not like", value, "XM");
            return (Criteria) this;
        }

        public Criteria andXMIn(List<String> values) {
            addCriterion("XM in", values, "XM");
            return (Criteria) this;
        }

        public Criteria andXMNotIn(List<String> values) {
            addCriterion("XM not in", values, "XM");
            return (Criteria) this;
        }

        public Criteria andXMBetween(String value1, String value2) {
            addCriterion("XM between", value1, value2, "XM");
            return (Criteria) this;
        }

        public Criteria andXMNotBetween(String value1, String value2) {
            addCriterion("XM not between", value1, value2, "XM");
            return (Criteria) this;
        }

        public Criteria andXBIsNull() {
            addCriterion("XB is null");
            return (Criteria) this;
        }

        public Criteria andXBIsNotNull() {
            addCriterion("XB is not null");
            return (Criteria) this;
        }

        public Criteria andXBEqualTo(String value) {
            addCriterion("XB =", value, "XB");
            return (Criteria) this;
        }

        public Criteria andXBNotEqualTo(String value) {
            addCriterion("XB <>", value, "XB");
            return (Criteria) this;
        }

        public Criteria andXBGreaterThan(String value) {
            addCriterion("XB >", value, "XB");
            return (Criteria) this;
        }

        public Criteria andXBGreaterThanOrEqualTo(String value) {
            addCriterion("XB >=", value, "XB");
            return (Criteria) this;
        }

        public Criteria andXBLessThan(String value) {
            addCriterion("XB <", value, "XB");
            return (Criteria) this;
        }

        public Criteria andXBLessThanOrEqualTo(String value) {
            addCriterion("XB <=", value, "XB");
            return (Criteria) this;
        }

        public Criteria andXBLike(String value) {
            addCriterion("XB like", value, "XB");
            return (Criteria) this;
        }

        public Criteria andXBNotLike(String value) {
            addCriterion("XB not like", value, "XB");
            return (Criteria) this;
        }

        public Criteria andXBIn(List<String> values) {
            addCriterion("XB in", values, "XB");
            return (Criteria) this;
        }

        public Criteria andXBNotIn(List<String> values) {
            addCriterion("XB not in", values, "XB");
            return (Criteria) this;
        }

        public Criteria andXBBetween(String value1, String value2) {
            addCriterion("XB between", value1, value2, "XB");
            return (Criteria) this;
        }

        public Criteria andXBNotBetween(String value1, String value2) {
            addCriterion("XB not between", value1, value2, "XB");
            return (Criteria) this;
        }

        public Criteria andZJLBIsNull() {
            addCriterion("ZJLB is null");
            return (Criteria) this;
        }

        public Criteria andZJLBIsNotNull() {
            addCriterion("ZJLB is not null");
            return (Criteria) this;
        }

        public Criteria andZJLBEqualTo(String value) {
            addCriterion("ZJLB =", value, "ZJLB");
            return (Criteria) this;
        }

        public Criteria andZJLBNotEqualTo(String value) {
            addCriterion("ZJLB <>", value, "ZJLB");
            return (Criteria) this;
        }

        public Criteria andZJLBGreaterThan(String value) {
            addCriterion("ZJLB >", value, "ZJLB");
            return (Criteria) this;
        }

        public Criteria andZJLBGreaterThanOrEqualTo(String value) {
            addCriterion("ZJLB >=", value, "ZJLB");
            return (Criteria) this;
        }

        public Criteria andZJLBLessThan(String value) {
            addCriterion("ZJLB <", value, "ZJLB");
            return (Criteria) this;
        }

        public Criteria andZJLBLessThanOrEqualTo(String value) {
            addCriterion("ZJLB <=", value, "ZJLB");
            return (Criteria) this;
        }

        public Criteria andZJLBLike(String value) {
            addCriterion("ZJLB like", value, "ZJLB");
            return (Criteria) this;
        }

        public Criteria andZJLBNotLike(String value) {
            addCriterion("ZJLB not like", value, "ZJLB");
            return (Criteria) this;
        }

        public Criteria andZJLBIn(List<String> values) {
            addCriterion("ZJLB in", values, "ZJLB");
            return (Criteria) this;
        }

        public Criteria andZJLBNotIn(List<String> values) {
            addCriterion("ZJLB not in", values, "ZJLB");
            return (Criteria) this;
        }

        public Criteria andZJLBBetween(String value1, String value2) {
            addCriterion("ZJLB between", value1, value2, "ZJLB");
            return (Criteria) this;
        }

        public Criteria andZJLBNotBetween(String value1, String value2) {
            addCriterion("ZJLB not between", value1, value2, "ZJLB");
            return (Criteria) this;
        }

        public Criteria andZJHMIsNull() {
            addCriterion("ZJHM is null");
            return (Criteria) this;
        }

        public Criteria andZJHMIsNotNull() {
            addCriterion("ZJHM is not null");
            return (Criteria) this;
        }

        public Criteria andZJHMEqualTo(String value) {
            addCriterion("ZJHM =", value, "ZJHM");
            return (Criteria) this;
        }

        public Criteria andZJHMNotEqualTo(String value) {
            addCriterion("ZJHM <>", value, "ZJHM");
            return (Criteria) this;
        }

        public Criteria andZJHMGreaterThan(String value) {
            addCriterion("ZJHM >", value, "ZJHM");
            return (Criteria) this;
        }

        public Criteria andZJHMGreaterThanOrEqualTo(String value) {
            addCriterion("ZJHM >=", value, "ZJHM");
            return (Criteria) this;
        }

        public Criteria andZJHMLessThan(String value) {
            addCriterion("ZJHM <", value, "ZJHM");
            return (Criteria) this;
        }

        public Criteria andZJHMLessThanOrEqualTo(String value) {
            addCriterion("ZJHM <=", value, "ZJHM");
            return (Criteria) this;
        }

        public Criteria andZJHMLike(String value) {
            addCriterion("ZJHM like", value, "ZJHM");
            return (Criteria) this;
        }

        public Criteria andZJHMNotLike(String value) {
            addCriterion("ZJHM not like", value, "ZJHM");
            return (Criteria) this;
        }

        public Criteria andZJHMIn(List<String> values) {
            addCriterion("ZJHM in", values, "ZJHM");
            return (Criteria) this;
        }

        public Criteria andZJHMNotIn(List<String> values) {
            addCriterion("ZJHM not in", values, "ZJHM");
            return (Criteria) this;
        }

        public Criteria andZJHMBetween(String value1, String value2) {
            addCriterion("ZJHM between", value1, value2, "ZJHM");
            return (Criteria) this;
        }

        public Criteria andZJHMNotBetween(String value1, String value2) {
            addCriterion("ZJHM not between", value1, value2, "ZJHM");
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

        public Criteria andRYGXIsNull() {
            addCriterion("RYGX is null");
            return (Criteria) this;
        }

        public Criteria andRYGXIsNotNull() {
            addCriterion("RYGX is not null");
            return (Criteria) this;
        }

        public Criteria andRYGXEqualTo(String value) {
            addCriterion("RYGX =", value, "RYGX");
            return (Criteria) this;
        }

        public Criteria andRYGXNotEqualTo(String value) {
            addCriterion("RYGX <>", value, "RYGX");
            return (Criteria) this;
        }

        public Criteria andRYGXGreaterThan(String value) {
            addCriterion("RYGX >", value, "RYGX");
            return (Criteria) this;
        }

        public Criteria andRYGXGreaterThanOrEqualTo(String value) {
            addCriterion("RYGX >=", value, "RYGX");
            return (Criteria) this;
        }

        public Criteria andRYGXLessThan(String value) {
            addCriterion("RYGX <", value, "RYGX");
            return (Criteria) this;
        }

        public Criteria andRYGXLessThanOrEqualTo(String value) {
            addCriterion("RYGX <=", value, "RYGX");
            return (Criteria) this;
        }

        public Criteria andRYGXLike(String value) {
            addCriterion("RYGX like", value, "RYGX");
            return (Criteria) this;
        }

        public Criteria andRYGXNotLike(String value) {
            addCriterion("RYGX not like", value, "RYGX");
            return (Criteria) this;
        }

        public Criteria andRYGXIn(List<String> values) {
            addCriterion("RYGX in", values, "RYGX");
            return (Criteria) this;
        }

        public Criteria andRYGXNotIn(List<String> values) {
            addCriterion("RYGX not in", values, "RYGX");
            return (Criteria) this;
        }

        public Criteria andRYGXBetween(String value1, String value2) {
            addCriterion("RYGX between", value1, value2, "RYGX");
            return (Criteria) this;
        }

        public Criteria andRYGXNotBetween(String value1, String value2) {
            addCriterion("RYGX not between", value1, value2, "RYGX");
            return (Criteria) this;
        }

        public Criteria andCSNYIsNull() {
            addCriterion("CSNY is null");
            return (Criteria) this;
        }

        public Criteria andCSNYIsNotNull() {
            addCriterion("CSNY is not null");
            return (Criteria) this;
        }

        public Criteria andCSNYEqualTo(Date value) {
            addCriterion("CSNY =", value, "CSNY");
            return (Criteria) this;
        }

        public Criteria andCSNYNotEqualTo(Date value) {
            addCriterion("CSNY <>", value, "CSNY");
            return (Criteria) this;
        }

        public Criteria andCSNYGreaterThan(Date value) {
            addCriterion("CSNY >", value, "CSNY");
            return (Criteria) this;
        }

        public Criteria andCSNYGreaterThanOrEqualTo(Date value) {
            addCriterion("CSNY >=", value, "CSNY");
            return (Criteria) this;
        }

        public Criteria andCSNYLessThan(Date value) {
            addCriterion("CSNY <", value, "CSNY");
            return (Criteria) this;
        }

        public Criteria andCSNYLessThanOrEqualTo(Date value) {
            addCriterion("CSNY <=", value, "CSNY");
            return (Criteria) this;
        }

        public Criteria andCSNYIn(List<Date> values) {
            addCriterion("CSNY in", values, "CSNY");
            return (Criteria) this;
        }

        public Criteria andCSNYNotIn(List<Date> values) {
            addCriterion("CSNY not in", values, "CSNY");
            return (Criteria) this;
        }

        public Criteria andCSNYBetween(Date value1, Date value2) {
            addCriterion("CSNY between", value1, value2, "CSNY");
            return (Criteria) this;
        }

        public Criteria andCSNYNotBetween(Date value1, Date value2) {
            addCriterion("CSNY not between", value1, value2, "CSNY");
            return (Criteria) this;
        }

        public Criteria andSFYCNIsNull() {
            addCriterion("SFYCN is null");
            return (Criteria) this;
        }

        public Criteria andSFYCNIsNotNull() {
            addCriterion("SFYCN is not null");
            return (Criteria) this;
        }

        public Criteria andSFYCNEqualTo(Date value) {
            addCriterion("SFYCN =", value, "SFYCN");
            return (Criteria) this;
        }

        public Criteria andSFYCNNotEqualTo(Date value) {
            addCriterion("SFYCN <>", value, "SFYCN");
            return (Criteria) this;
        }

        public Criteria andSFYCNGreaterThan(Date value) {
            addCriterion("SFYCN >", value, "SFYCN");
            return (Criteria) this;
        }

        public Criteria andSFYCNGreaterThanOrEqualTo(Date value) {
            addCriterion("SFYCN >=", value, "SFYCN");
            return (Criteria) this;
        }

        public Criteria andSFYCNLessThan(Date value) {
            addCriterion("SFYCN <", value, "SFYCN");
            return (Criteria) this;
        }

        public Criteria andSFYCNLessThanOrEqualTo(Date value) {
            addCriterion("SFYCN <=", value, "SFYCN");
            return (Criteria) this;
        }

        public Criteria andSFYCNIn(List<Date> values) {
            addCriterion("SFYCN in", values, "SFYCN");
            return (Criteria) this;
        }

        public Criteria andSFYCNNotIn(List<Date> values) {
            addCriterion("SFYCN not in", values, "SFYCN");
            return (Criteria) this;
        }

        public Criteria andSFYCNBetween(Date value1, Date value2) {
            addCriterion("SFYCN between", value1, value2, "SFYCN");
            return (Criteria) this;
        }

        public Criteria andSFYCNNotBetween(Date value1, Date value2) {
            addCriterion("SFYCN not between", value1, value2, "SFYCN");
            return (Criteria) this;
        }

        public Criteria andHYZKIsNull() {
            addCriterion("HYZK is null");
            return (Criteria) this;
        }

        public Criteria andHYZKIsNotNull() {
            addCriterion("HYZK is not null");
            return (Criteria) this;
        }

        public Criteria andHYZKEqualTo(String value) {
            addCriterion("HYZK =", value, "HYZK");
            return (Criteria) this;
        }

        public Criteria andHYZKNotEqualTo(String value) {
            addCriterion("HYZK <>", value, "HYZK");
            return (Criteria) this;
        }

        public Criteria andHYZKGreaterThan(String value) {
            addCriterion("HYZK >", value, "HYZK");
            return (Criteria) this;
        }

        public Criteria andHYZKGreaterThanOrEqualTo(String value) {
            addCriterion("HYZK >=", value, "HYZK");
            return (Criteria) this;
        }

        public Criteria andHYZKLessThan(String value) {
            addCriterion("HYZK <", value, "HYZK");
            return (Criteria) this;
        }

        public Criteria andHYZKLessThanOrEqualTo(String value) {
            addCriterion("HYZK <=", value, "HYZK");
            return (Criteria) this;
        }

        public Criteria andHYZKLike(String value) {
            addCriterion("HYZK like", value, "HYZK");
            return (Criteria) this;
        }

        public Criteria andHYZKNotLike(String value) {
            addCriterion("HYZK not like", value, "HYZK");
            return (Criteria) this;
        }

        public Criteria andHYZKIn(List<String> values) {
            addCriterion("HYZK in", values, "HYZK");
            return (Criteria) this;
        }

        public Criteria andHYZKNotIn(List<String> values) {
            addCriterion("HYZK not in", values, "HYZK");
            return (Criteria) this;
        }

        public Criteria andHYZKBetween(String value1, String value2) {
            addCriterion("HYZK between", value1, value2, "HYZK");
            return (Criteria) this;
        }

        public Criteria andHYZKNotBetween(String value1, String value2) {
            addCriterion("HYZK not between", value1, value2, "HYZK");
            return (Criteria) this;
        }

        public Criteria andXLIsNull() {
            addCriterion("XL is null");
            return (Criteria) this;
        }

        public Criteria andXLIsNotNull() {
            addCriterion("XL is not null");
            return (Criteria) this;
        }

        public Criteria andXLEqualTo(String value) {
            addCriterion("XL =", value, "XL");
            return (Criteria) this;
        }

        public Criteria andXLNotEqualTo(String value) {
            addCriterion("XL <>", value, "XL");
            return (Criteria) this;
        }

        public Criteria andXLGreaterThan(String value) {
            addCriterion("XL >", value, "XL");
            return (Criteria) this;
        }

        public Criteria andXLGreaterThanOrEqualTo(String value) {
            addCriterion("XL >=", value, "XL");
            return (Criteria) this;
        }

        public Criteria andXLLessThan(String value) {
            addCriterion("XL <", value, "XL");
            return (Criteria) this;
        }

        public Criteria andXLLessThanOrEqualTo(String value) {
            addCriterion("XL <=", value, "XL");
            return (Criteria) this;
        }

        public Criteria andXLLike(String value) {
            addCriterion("XL like", value, "XL");
            return (Criteria) this;
        }

        public Criteria andXLNotLike(String value) {
            addCriterion("XL not like", value, "XL");
            return (Criteria) this;
        }

        public Criteria andXLIn(List<String> values) {
            addCriterion("XL in", values, "XL");
            return (Criteria) this;
        }

        public Criteria andXLNotIn(List<String> values) {
            addCriterion("XL not in", values, "XL");
            return (Criteria) this;
        }

        public Criteria andXLBetween(String value1, String value2) {
            addCriterion("XL between", value1, value2, "XL");
            return (Criteria) this;
        }

        public Criteria andXLNotBetween(String value1, String value2) {
            addCriterion("XL not between", value1, value2, "XL");
            return (Criteria) this;
        }

        public Criteria andHJLXIsNull() {
            addCriterion("HJLX is null");
            return (Criteria) this;
        }

        public Criteria andHJLXIsNotNull() {
            addCriterion("HJLX is not null");
            return (Criteria) this;
        }

        public Criteria andHJLXEqualTo(String value) {
            addCriterion("HJLX =", value, "HJLX");
            return (Criteria) this;
        }

        public Criteria andHJLXNotEqualTo(String value) {
            addCriterion("HJLX <>", value, "HJLX");
            return (Criteria) this;
        }

        public Criteria andHJLXGreaterThan(String value) {
            addCriterion("HJLX >", value, "HJLX");
            return (Criteria) this;
        }

        public Criteria andHJLXGreaterThanOrEqualTo(String value) {
            addCriterion("HJLX >=", value, "HJLX");
            return (Criteria) this;
        }

        public Criteria andHJLXLessThan(String value) {
            addCriterion("HJLX <", value, "HJLX");
            return (Criteria) this;
        }

        public Criteria andHJLXLessThanOrEqualTo(String value) {
            addCriterion("HJLX <=", value, "HJLX");
            return (Criteria) this;
        }

        public Criteria andHJLXLike(String value) {
            addCriterion("HJLX like", value, "HJLX");
            return (Criteria) this;
        }

        public Criteria andHJLXNotLike(String value) {
            addCriterion("HJLX not like", value, "HJLX");
            return (Criteria) this;
        }

        public Criteria andHJLXIn(List<String> values) {
            addCriterion("HJLX in", values, "HJLX");
            return (Criteria) this;
        }

        public Criteria andHJLXNotIn(List<String> values) {
            addCriterion("HJLX not in", values, "HJLX");
            return (Criteria) this;
        }

        public Criteria andHJLXBetween(String value1, String value2) {
            addCriterion("HJLX between", value1, value2, "HJLX");
            return (Criteria) this;
        }

        public Criteria andHJLXNotBetween(String value1, String value2) {
            addCriterion("HJLX not between", value1, value2, "HJLX");
            return (Criteria) this;
        }

        public Criteria andHJHMIsNull() {
            addCriterion("HJHM is null");
            return (Criteria) this;
        }

        public Criteria andHJHMIsNotNull() {
            addCriterion("HJHM is not null");
            return (Criteria) this;
        }

        public Criteria andHJHMEqualTo(String value) {
            addCriterion("HJHM =", value, "HJHM");
            return (Criteria) this;
        }

        public Criteria andHJHMNotEqualTo(String value) {
            addCriterion("HJHM <>", value, "HJHM");
            return (Criteria) this;
        }

        public Criteria andHJHMGreaterThan(String value) {
            addCriterion("HJHM >", value, "HJHM");
            return (Criteria) this;
        }

        public Criteria andHJHMGreaterThanOrEqualTo(String value) {
            addCriterion("HJHM >=", value, "HJHM");
            return (Criteria) this;
        }

        public Criteria andHJHMLessThan(String value) {
            addCriterion("HJHM <", value, "HJHM");
            return (Criteria) this;
        }

        public Criteria andHJHMLessThanOrEqualTo(String value) {
            addCriterion("HJHM <=", value, "HJHM");
            return (Criteria) this;
        }

        public Criteria andHJHMLike(String value) {
            addCriterion("HJHM like", value, "HJHM");
            return (Criteria) this;
        }

        public Criteria andHJHMNotLike(String value) {
            addCriterion("HJHM not like", value, "HJHM");
            return (Criteria) this;
        }

        public Criteria andHJHMIn(List<String> values) {
            addCriterion("HJHM in", values, "HJHM");
            return (Criteria) this;
        }

        public Criteria andHJHMNotIn(List<String> values) {
            addCriterion("HJHM not in", values, "HJHM");
            return (Criteria) this;
        }

        public Criteria andHJHMBetween(String value1, String value2) {
            addCriterion("HJHM between", value1, value2, "HJHM");
            return (Criteria) this;
        }

        public Criteria andHJHMNotBetween(String value1, String value2) {
            addCriterion("HJHM not between", value1, value2, "HJHM");
            return (Criteria) this;
        }

        public Criteria andHKSZDIsNull() {
            addCriterion("HKSZD is null");
            return (Criteria) this;
        }

        public Criteria andHKSZDIsNotNull() {
            addCriterion("HKSZD is not null");
            return (Criteria) this;
        }

        public Criteria andHKSZDEqualTo(String value) {
            addCriterion("HKSZD =", value, "HKSZD");
            return (Criteria) this;
        }

        public Criteria andHKSZDNotEqualTo(String value) {
            addCriterion("HKSZD <>", value, "HKSZD");
            return (Criteria) this;
        }

        public Criteria andHKSZDGreaterThan(String value) {
            addCriterion("HKSZD >", value, "HKSZD");
            return (Criteria) this;
        }

        public Criteria andHKSZDGreaterThanOrEqualTo(String value) {
            addCriterion("HKSZD >=", value, "HKSZD");
            return (Criteria) this;
        }

        public Criteria andHKSZDLessThan(String value) {
            addCriterion("HKSZD <", value, "HKSZD");
            return (Criteria) this;
        }

        public Criteria andHKSZDLessThanOrEqualTo(String value) {
            addCriterion("HKSZD <=", value, "HKSZD");
            return (Criteria) this;
        }

        public Criteria andHKSZDLike(String value) {
            addCriterion("HKSZD like", value, "HKSZD");
            return (Criteria) this;
        }

        public Criteria andHKSZDNotLike(String value) {
            addCriterion("HKSZD not like", value, "HKSZD");
            return (Criteria) this;
        }

        public Criteria andHKSZDIn(List<String> values) {
            addCriterion("HKSZD in", values, "HKSZD");
            return (Criteria) this;
        }

        public Criteria andHKSZDNotIn(List<String> values) {
            addCriterion("HKSZD not in", values, "HKSZD");
            return (Criteria) this;
        }

        public Criteria andHKSZDBetween(String value1, String value2) {
            addCriterion("HKSZD between", value1, value2, "HKSZD");
            return (Criteria) this;
        }

        public Criteria andHKSZDNotBetween(String value1, String value2) {
            addCriterion("HKSZD not between", value1, value2, "HKSZD");
            return (Criteria) this;
        }

        public Criteria andHKSCRHSJIsNull() {
            addCriterion("HKSCRHSJ is null");
            return (Criteria) this;
        }

        public Criteria andHKSCRHSJIsNotNull() {
            addCriterion("HKSCRHSJ is not null");
            return (Criteria) this;
        }

        public Criteria andHKSCRHSJEqualTo(Date value) {
            addCriterion("HKSCRHSJ =", value, "HKSCRHSJ");
            return (Criteria) this;
        }

        public Criteria andHKSCRHSJNotEqualTo(Date value) {
            addCriterion("HKSCRHSJ <>", value, "HKSCRHSJ");
            return (Criteria) this;
        }

        public Criteria andHKSCRHSJGreaterThan(Date value) {
            addCriterion("HKSCRHSJ >", value, "HKSCRHSJ");
            return (Criteria) this;
        }

        public Criteria andHKSCRHSJGreaterThanOrEqualTo(Date value) {
            addCriterion("HKSCRHSJ >=", value, "HKSCRHSJ");
            return (Criteria) this;
        }

        public Criteria andHKSCRHSJLessThan(Date value) {
            addCriterion("HKSCRHSJ <", value, "HKSCRHSJ");
            return (Criteria) this;
        }

        public Criteria andHKSCRHSJLessThanOrEqualTo(Date value) {
            addCriterion("HKSCRHSJ <=", value, "HKSCRHSJ");
            return (Criteria) this;
        }

        public Criteria andHKSCRHSJIn(List<Date> values) {
            addCriterion("HKSCRHSJ in", values, "HKSCRHSJ");
            return (Criteria) this;
        }

        public Criteria andHKSCRHSJNotIn(List<Date> values) {
            addCriterion("HKSCRHSJ not in", values, "HKSCRHSJ");
            return (Criteria) this;
        }

        public Criteria andHKSCRHSJBetween(Date value1, Date value2) {
            addCriterion("HKSCRHSJ between", value1, value2, "HKSCRHSJ");
            return (Criteria) this;
        }

        public Criteria andHKSCRHSJNotBetween(Date value1, Date value2) {
            addCriterion("HKSCRHSJ not between", value1, value2, "HKSCRHSJ");
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

        public Criteria andSZCQMCIsNull() {
            addCriterion("SZCQMC is null");
            return (Criteria) this;
        }

        public Criteria andSZCQMCIsNotNull() {
            addCriterion("SZCQMC is not null");
            return (Criteria) this;
        }

        public Criteria andSZCQMCEqualTo(String value) {
            addCriterion("SZCQMC =", value, "SZCQMC");
            return (Criteria) this;
        }

        public Criteria andSZCQMCNotEqualTo(String value) {
            addCriterion("SZCQMC <>", value, "SZCQMC");
            return (Criteria) this;
        }

        public Criteria andSZCQMCGreaterThan(String value) {
            addCriterion("SZCQMC >", value, "SZCQMC");
            return (Criteria) this;
        }

        public Criteria andSZCQMCGreaterThanOrEqualTo(String value) {
            addCriterion("SZCQMC >=", value, "SZCQMC");
            return (Criteria) this;
        }

        public Criteria andSZCQMCLessThan(String value) {
            addCriterion("SZCQMC <", value, "SZCQMC");
            return (Criteria) this;
        }

        public Criteria andSZCQMCLessThanOrEqualTo(String value) {
            addCriterion("SZCQMC <=", value, "SZCQMC");
            return (Criteria) this;
        }

        public Criteria andSZCQMCLike(String value) {
            addCriterion("SZCQMC like", value, "SZCQMC");
            return (Criteria) this;
        }

        public Criteria andSZCQMCNotLike(String value) {
            addCriterion("SZCQMC not like", value, "SZCQMC");
            return (Criteria) this;
        }

        public Criteria andSZCQMCIn(List<String> values) {
            addCriterion("SZCQMC in", values, "SZCQMC");
            return (Criteria) this;
        }

        public Criteria andSZCQMCNotIn(List<String> values) {
            addCriterion("SZCQMC not in", values, "SZCQMC");
            return (Criteria) this;
        }

        public Criteria andSZCQMCBetween(String value1, String value2) {
            addCriterion("SZCQMC between", value1, value2, "SZCQMC");
            return (Criteria) this;
        }

        public Criteria andSZCQMCNotBetween(String value1, String value2) {
            addCriterion("SZCQMC not between", value1, value2, "SZCQMC");
            return (Criteria) this;
        }

        public Criteria andSZJDIsNull() {
            addCriterion("SZJD is null");
            return (Criteria) this;
        }

        public Criteria andSZJDIsNotNull() {
            addCriterion("SZJD is not null");
            return (Criteria) this;
        }

        public Criteria andSZJDEqualTo(String value) {
            addCriterion("SZJD =", value, "SZJD");
            return (Criteria) this;
        }

        public Criteria andSZJDNotEqualTo(String value) {
            addCriterion("SZJD <>", value, "SZJD");
            return (Criteria) this;
        }

        public Criteria andSZJDGreaterThan(String value) {
            addCriterion("SZJD >", value, "SZJD");
            return (Criteria) this;
        }

        public Criteria andSZJDGreaterThanOrEqualTo(String value) {
            addCriterion("SZJD >=", value, "SZJD");
            return (Criteria) this;
        }

        public Criteria andSZJDLessThan(String value) {
            addCriterion("SZJD <", value, "SZJD");
            return (Criteria) this;
        }

        public Criteria andSZJDLessThanOrEqualTo(String value) {
            addCriterion("SZJD <=", value, "SZJD");
            return (Criteria) this;
        }

        public Criteria andSZJDLike(String value) {
            addCriterion("SZJD like", value, "SZJD");
            return (Criteria) this;
        }

        public Criteria andSZJDNotLike(String value) {
            addCriterion("SZJD not like", value, "SZJD");
            return (Criteria) this;
        }

        public Criteria andSZJDIn(List<String> values) {
            addCriterion("SZJD in", values, "SZJD");
            return (Criteria) this;
        }

        public Criteria andSZJDNotIn(List<String> values) {
            addCriterion("SZJD not in", values, "SZJD");
            return (Criteria) this;
        }

        public Criteria andSZJDBetween(String value1, String value2) {
            addCriterion("SZJD between", value1, value2, "SZJD");
            return (Criteria) this;
        }

        public Criteria andSZJDNotBetween(String value1, String value2) {
            addCriterion("SZJD not between", value1, value2, "SZJD");
            return (Criteria) this;
        }

        public Criteria andSZJDMCIsNull() {
            addCriterion("SZJDMC is null");
            return (Criteria) this;
        }

        public Criteria andSZJDMCIsNotNull() {
            addCriterion("SZJDMC is not null");
            return (Criteria) this;
        }

        public Criteria andSZJDMCEqualTo(String value) {
            addCriterion("SZJDMC =", value, "SZJDMC");
            return (Criteria) this;
        }

        public Criteria andSZJDMCNotEqualTo(String value) {
            addCriterion("SZJDMC <>", value, "SZJDMC");
            return (Criteria) this;
        }

        public Criteria andSZJDMCGreaterThan(String value) {
            addCriterion("SZJDMC >", value, "SZJDMC");
            return (Criteria) this;
        }

        public Criteria andSZJDMCGreaterThanOrEqualTo(String value) {
            addCriterion("SZJDMC >=", value, "SZJDMC");
            return (Criteria) this;
        }

        public Criteria andSZJDMCLessThan(String value) {
            addCriterion("SZJDMC <", value, "SZJDMC");
            return (Criteria) this;
        }

        public Criteria andSZJDMCLessThanOrEqualTo(String value) {
            addCriterion("SZJDMC <=", value, "SZJDMC");
            return (Criteria) this;
        }

        public Criteria andSZJDMCLike(String value) {
            addCriterion("SZJDMC like", value, "SZJDMC");
            return (Criteria) this;
        }

        public Criteria andSZJDMCNotLike(String value) {
            addCriterion("SZJDMC not like", value, "SZJDMC");
            return (Criteria) this;
        }

        public Criteria andSZJDMCIn(List<String> values) {
            addCriterion("SZJDMC in", values, "SZJDMC");
            return (Criteria) this;
        }

        public Criteria andSZJDMCNotIn(List<String> values) {
            addCriterion("SZJDMC not in", values, "SZJDMC");
            return (Criteria) this;
        }

        public Criteria andSZJDMCBetween(String value1, String value2) {
            addCriterion("SZJDMC between", value1, value2, "SZJDMC");
            return (Criteria) this;
        }

        public Criteria andSZJDMCNotBetween(String value1, String value2) {
            addCriterion("SZJDMC not between", value1, value2, "SZJDMC");
            return (Criteria) this;
        }

        public Criteria andSSSQIsNull() {
            addCriterion("SSSQ is null");
            return (Criteria) this;
        }

        public Criteria andSSSQIsNotNull() {
            addCriterion("SSSQ is not null");
            return (Criteria) this;
        }

        public Criteria andSSSQEqualTo(String value) {
            addCriterion("SSSQ =", value, "SSSQ");
            return (Criteria) this;
        }

        public Criteria andSSSQNotEqualTo(String value) {
            addCriterion("SSSQ <>", value, "SSSQ");
            return (Criteria) this;
        }

        public Criteria andSSSQGreaterThan(String value) {
            addCriterion("SSSQ >", value, "SSSQ");
            return (Criteria) this;
        }

        public Criteria andSSSQGreaterThanOrEqualTo(String value) {
            addCriterion("SSSQ >=", value, "SSSQ");
            return (Criteria) this;
        }

        public Criteria andSSSQLessThan(String value) {
            addCriterion("SSSQ <", value, "SSSQ");
            return (Criteria) this;
        }

        public Criteria andSSSQLessThanOrEqualTo(String value) {
            addCriterion("SSSQ <=", value, "SSSQ");
            return (Criteria) this;
        }

        public Criteria andSSSQLike(String value) {
            addCriterion("SSSQ like", value, "SSSQ");
            return (Criteria) this;
        }

        public Criteria andSSSQNotLike(String value) {
            addCriterion("SSSQ not like", value, "SSSQ");
            return (Criteria) this;
        }

        public Criteria andSSSQIn(List<String> values) {
            addCriterion("SSSQ in", values, "SSSQ");
            return (Criteria) this;
        }

        public Criteria andSSSQNotIn(List<String> values) {
            addCriterion("SSSQ not in", values, "SSSQ");
            return (Criteria) this;
        }

        public Criteria andSSSQBetween(String value1, String value2) {
            addCriterion("SSSQ between", value1, value2, "SSSQ");
            return (Criteria) this;
        }

        public Criteria andSSSQNotBetween(String value1, String value2) {
            addCriterion("SSSQ not between", value1, value2, "SSSQ");
            return (Criteria) this;
        }

        public Criteria andSSSQMCIsNull() {
            addCriterion("SSSQMC is null");
            return (Criteria) this;
        }

        public Criteria andSSSQMCIsNotNull() {
            addCriterion("SSSQMC is not null");
            return (Criteria) this;
        }

        public Criteria andSSSQMCEqualTo(String value) {
            addCriterion("SSSQMC =", value, "SSSQMC");
            return (Criteria) this;
        }

        public Criteria andSSSQMCNotEqualTo(String value) {
            addCriterion("SSSQMC <>", value, "SSSQMC");
            return (Criteria) this;
        }

        public Criteria andSSSQMCGreaterThan(String value) {
            addCriterion("SSSQMC >", value, "SSSQMC");
            return (Criteria) this;
        }

        public Criteria andSSSQMCGreaterThanOrEqualTo(String value) {
            addCriterion("SSSQMC >=", value, "SSSQMC");
            return (Criteria) this;
        }

        public Criteria andSSSQMCLessThan(String value) {
            addCriterion("SSSQMC <", value, "SSSQMC");
            return (Criteria) this;
        }

        public Criteria andSSSQMCLessThanOrEqualTo(String value) {
            addCriterion("SSSQMC <=", value, "SSSQMC");
            return (Criteria) this;
        }

        public Criteria andSSSQMCLike(String value) {
            addCriterion("SSSQMC like", value, "SSSQMC");
            return (Criteria) this;
        }

        public Criteria andSSSQMCNotLike(String value) {
            addCriterion("SSSQMC not like", value, "SSSQMC");
            return (Criteria) this;
        }

        public Criteria andSSSQMCIn(List<String> values) {
            addCriterion("SSSQMC in", values, "SSSQMC");
            return (Criteria) this;
        }

        public Criteria andSSSQMCNotIn(List<String> values) {
            addCriterion("SSSQMC not in", values, "SSSQMC");
            return (Criteria) this;
        }

        public Criteria andSSSQMCBetween(String value1, String value2) {
            addCriterion("SSSQMC between", value1, value2, "SSSQMC");
            return (Criteria) this;
        }

        public Criteria andSSSQMCNotBetween(String value1, String value2) {
            addCriterion("SSSQMC not between", value1, value2, "SSSQMC");
            return (Criteria) this;
        }

        public Criteria andZZIsNull() {
            addCriterion("ZZ is null");
            return (Criteria) this;
        }

        public Criteria andZZIsNotNull() {
            addCriterion("ZZ is not null");
            return (Criteria) this;
        }

        public Criteria andZZEqualTo(String value) {
            addCriterion("ZZ =", value, "ZZ");
            return (Criteria) this;
        }

        public Criteria andZZNotEqualTo(String value) {
            addCriterion("ZZ <>", value, "ZZ");
            return (Criteria) this;
        }

        public Criteria andZZGreaterThan(String value) {
            addCriterion("ZZ >", value, "ZZ");
            return (Criteria) this;
        }

        public Criteria andZZGreaterThanOrEqualTo(String value) {
            addCriterion("ZZ >=", value, "ZZ");
            return (Criteria) this;
        }

        public Criteria andZZLessThan(String value) {
            addCriterion("ZZ <", value, "ZZ");
            return (Criteria) this;
        }

        public Criteria andZZLessThanOrEqualTo(String value) {
            addCriterion("ZZ <=", value, "ZZ");
            return (Criteria) this;
        }

        public Criteria andZZLike(String value) {
            addCriterion("ZZ like", value, "ZZ");
            return (Criteria) this;
        }

        public Criteria andZZNotLike(String value) {
            addCriterion("ZZ not like", value, "ZZ");
            return (Criteria) this;
        }

        public Criteria andZZIn(List<String> values) {
            addCriterion("ZZ in", values, "ZZ");
            return (Criteria) this;
        }

        public Criteria andZZNotIn(List<String> values) {
            addCriterion("ZZ not in", values, "ZZ");
            return (Criteria) this;
        }

        public Criteria andZZBetween(String value1, String value2) {
            addCriterion("ZZ between", value1, value2, "ZZ");
            return (Criteria) this;
        }

        public Criteria andZZNotBetween(String value1, String value2) {
            addCriterion("ZZ not between", value1, value2, "ZZ");
            return (Criteria) this;
        }

        public Criteria andDWIDIsNull() {
            addCriterion("DWID is null");
            return (Criteria) this;
        }

        public Criteria andDWIDIsNotNull() {
            addCriterion("DWID is not null");
            return (Criteria) this;
        }

        public Criteria andDWIDEqualTo(String value) {
            addCriterion("DWID =", value, "DWID");
            return (Criteria) this;
        }

        public Criteria andDWIDNotEqualTo(String value) {
            addCriterion("DWID <>", value, "DWID");
            return (Criteria) this;
        }

        public Criteria andDWIDGreaterThan(String value) {
            addCriterion("DWID >", value, "DWID");
            return (Criteria) this;
        }

        public Criteria andDWIDGreaterThanOrEqualTo(String value) {
            addCriterion("DWID >=", value, "DWID");
            return (Criteria) this;
        }

        public Criteria andDWIDLessThan(String value) {
            addCriterion("DWID <", value, "DWID");
            return (Criteria) this;
        }

        public Criteria andDWIDLessThanOrEqualTo(String value) {
            addCriterion("DWID <=", value, "DWID");
            return (Criteria) this;
        }

        public Criteria andDWIDLike(String value) {
            addCriterion("DWID like", value, "DWID");
            return (Criteria) this;
        }

        public Criteria andDWIDNotLike(String value) {
            addCriterion("DWID not like", value, "DWID");
            return (Criteria) this;
        }

        public Criteria andDWIDIn(List<String> values) {
            addCriterion("DWID in", values, "DWID");
            return (Criteria) this;
        }

        public Criteria andDWIDNotIn(List<String> values) {
            addCriterion("DWID not in", values, "DWID");
            return (Criteria) this;
        }

        public Criteria andDWIDBetween(String value1, String value2) {
            addCriterion("DWID between", value1, value2, "DWID");
            return (Criteria) this;
        }

        public Criteria andDWIDNotBetween(String value1, String value2) {
            addCriterion("DWID not between", value1, value2, "DWID");
            return (Criteria) this;
        }

        public Criteria andDWBHIsNull() {
            addCriterion("DWBH is null");
            return (Criteria) this;
        }

        public Criteria andDWBHIsNotNull() {
            addCriterion("DWBH is not null");
            return (Criteria) this;
        }

        public Criteria andDWBHEqualTo(String value) {
            addCriterion("DWBH =", value, "DWBH");
            return (Criteria) this;
        }

        public Criteria andDWBHNotEqualTo(String value) {
            addCriterion("DWBH <>", value, "DWBH");
            return (Criteria) this;
        }

        public Criteria andDWBHGreaterThan(String value) {
            addCriterion("DWBH >", value, "DWBH");
            return (Criteria) this;
        }

        public Criteria andDWBHGreaterThanOrEqualTo(String value) {
            addCriterion("DWBH >=", value, "DWBH");
            return (Criteria) this;
        }

        public Criteria andDWBHLessThan(String value) {
            addCriterion("DWBH <", value, "DWBH");
            return (Criteria) this;
        }

        public Criteria andDWBHLessThanOrEqualTo(String value) {
            addCriterion("DWBH <=", value, "DWBH");
            return (Criteria) this;
        }

        public Criteria andDWBHLike(String value) {
            addCriterion("DWBH like", value, "DWBH");
            return (Criteria) this;
        }

        public Criteria andDWBHNotLike(String value) {
            addCriterion("DWBH not like", value, "DWBH");
            return (Criteria) this;
        }

        public Criteria andDWBHIn(List<String> values) {
            addCriterion("DWBH in", values, "DWBH");
            return (Criteria) this;
        }

        public Criteria andDWBHNotIn(List<String> values) {
            addCriterion("DWBH not in", values, "DWBH");
            return (Criteria) this;
        }

        public Criteria andDWBHBetween(String value1, String value2) {
            addCriterion("DWBH between", value1, value2, "DWBH");
            return (Criteria) this;
        }

        public Criteria andDWBHNotBetween(String value1, String value2) {
            addCriterion("DWBH not between", value1, value2, "DWBH");
            return (Criteria) this;
        }

        public Criteria andZZQKIsNull() {
            addCriterion("ZZQK is null");
            return (Criteria) this;
        }

        public Criteria andZZQKIsNotNull() {
            addCriterion("ZZQK is not null");
            return (Criteria) this;
        }

        public Criteria andZZQKEqualTo(String value) {
            addCriterion("ZZQK =", value, "ZZQK");
            return (Criteria) this;
        }

        public Criteria andZZQKNotEqualTo(String value) {
            addCriterion("ZZQK <>", value, "ZZQK");
            return (Criteria) this;
        }

        public Criteria andZZQKGreaterThan(String value) {
            addCriterion("ZZQK >", value, "ZZQK");
            return (Criteria) this;
        }

        public Criteria andZZQKGreaterThanOrEqualTo(String value) {
            addCriterion("ZZQK >=", value, "ZZQK");
            return (Criteria) this;
        }

        public Criteria andZZQKLessThan(String value) {
            addCriterion("ZZQK <", value, "ZZQK");
            return (Criteria) this;
        }

        public Criteria andZZQKLessThanOrEqualTo(String value) {
            addCriterion("ZZQK <=", value, "ZZQK");
            return (Criteria) this;
        }

        public Criteria andZZQKLike(String value) {
            addCriterion("ZZQK like", value, "ZZQK");
            return (Criteria) this;
        }

        public Criteria andZZQKNotLike(String value) {
            addCriterion("ZZQK not like", value, "ZZQK");
            return (Criteria) this;
        }

        public Criteria andZZQKIn(List<String> values) {
            addCriterion("ZZQK in", values, "ZZQK");
            return (Criteria) this;
        }

        public Criteria andZZQKNotIn(List<String> values) {
            addCriterion("ZZQK not in", values, "ZZQK");
            return (Criteria) this;
        }

        public Criteria andZZQKBetween(String value1, String value2) {
            addCriterion("ZZQK between", value1, value2, "ZZQK");
            return (Criteria) this;
        }

        public Criteria andZZQKNotBetween(String value1, String value2) {
            addCriterion("ZZQK not between", value1, value2, "ZZQK");
            return (Criteria) this;
        }

        public Criteria andZYZTIsNull() {
            addCriterion("ZYZT is null");
            return (Criteria) this;
        }

        public Criteria andZYZTIsNotNull() {
            addCriterion("ZYZT is not null");
            return (Criteria) this;
        }

        public Criteria andZYZTEqualTo(String value) {
            addCriterion("ZYZT =", value, "ZYZT");
            return (Criteria) this;
        }

        public Criteria andZYZTNotEqualTo(String value) {
            addCriterion("ZYZT <>", value, "ZYZT");
            return (Criteria) this;
        }

        public Criteria andZYZTGreaterThan(String value) {
            addCriterion("ZYZT >", value, "ZYZT");
            return (Criteria) this;
        }

        public Criteria andZYZTGreaterThanOrEqualTo(String value) {
            addCriterion("ZYZT >=", value, "ZYZT");
            return (Criteria) this;
        }

        public Criteria andZYZTLessThan(String value) {
            addCriterion("ZYZT <", value, "ZYZT");
            return (Criteria) this;
        }

        public Criteria andZYZTLessThanOrEqualTo(String value) {
            addCriterion("ZYZT <=", value, "ZYZT");
            return (Criteria) this;
        }

        public Criteria andZYZTLike(String value) {
            addCriterion("ZYZT like", value, "ZYZT");
            return (Criteria) this;
        }

        public Criteria andZYZTNotLike(String value) {
            addCriterion("ZYZT not like", value, "ZYZT");
            return (Criteria) this;
        }

        public Criteria andZYZTIn(List<String> values) {
            addCriterion("ZYZT in", values, "ZYZT");
            return (Criteria) this;
        }

        public Criteria andZYZTNotIn(List<String> values) {
            addCriterion("ZYZT not in", values, "ZYZT");
            return (Criteria) this;
        }

        public Criteria andZYZTBetween(String value1, String value2) {
            addCriterion("ZYZT between", value1, value2, "ZYZT");
            return (Criteria) this;
        }

        public Criteria andZYZTNotBetween(String value1, String value2) {
            addCriterion("ZYZT not between", value1, value2, "ZYZT");
            return (Criteria) this;
        }

        public Criteria andZWZCIsNull() {
            addCriterion("ZWZC is null");
            return (Criteria) this;
        }

        public Criteria andZWZCIsNotNull() {
            addCriterion("ZWZC is not null");
            return (Criteria) this;
        }

        public Criteria andZWZCEqualTo(String value) {
            addCriterion("ZWZC =", value, "ZWZC");
            return (Criteria) this;
        }

        public Criteria andZWZCNotEqualTo(String value) {
            addCriterion("ZWZC <>", value, "ZWZC");
            return (Criteria) this;
        }

        public Criteria andZWZCGreaterThan(String value) {
            addCriterion("ZWZC >", value, "ZWZC");
            return (Criteria) this;
        }

        public Criteria andZWZCGreaterThanOrEqualTo(String value) {
            addCriterion("ZWZC >=", value, "ZWZC");
            return (Criteria) this;
        }

        public Criteria andZWZCLessThan(String value) {
            addCriterion("ZWZC <", value, "ZWZC");
            return (Criteria) this;
        }

        public Criteria andZWZCLessThanOrEqualTo(String value) {
            addCriterion("ZWZC <=", value, "ZWZC");
            return (Criteria) this;
        }

        public Criteria andZWZCLike(String value) {
            addCriterion("ZWZC like", value, "ZWZC");
            return (Criteria) this;
        }

        public Criteria andZWZCNotLike(String value) {
            addCriterion("ZWZC not like", value, "ZWZC");
            return (Criteria) this;
        }

        public Criteria andZWZCIn(List<String> values) {
            addCriterion("ZWZC in", values, "ZWZC");
            return (Criteria) this;
        }

        public Criteria andZWZCNotIn(List<String> values) {
            addCriterion("ZWZC not in", values, "ZWZC");
            return (Criteria) this;
        }

        public Criteria andZWZCBetween(String value1, String value2) {
            addCriterion("ZWZC between", value1, value2, "ZWZC");
            return (Criteria) this;
        }

        public Criteria andZWZCNotBetween(String value1, String value2) {
            addCriterion("ZWZC not between", value1, value2, "ZWZC");
            return (Criteria) this;
        }

        public Criteria andCJGZSJIsNull() {
            addCriterion("CJGZSJ is null");
            return (Criteria) this;
        }

        public Criteria andCJGZSJIsNotNull() {
            addCriterion("CJGZSJ is not null");
            return (Criteria) this;
        }

        public Criteria andCJGZSJEqualTo(Date value) {
            addCriterion("CJGZSJ =", value, "CJGZSJ");
            return (Criteria) this;
        }

        public Criteria andCJGZSJNotEqualTo(Date value) {
            addCriterion("CJGZSJ <>", value, "CJGZSJ");
            return (Criteria) this;
        }

        public Criteria andCJGZSJGreaterThan(Date value) {
            addCriterion("CJGZSJ >", value, "CJGZSJ");
            return (Criteria) this;
        }

        public Criteria andCJGZSJGreaterThanOrEqualTo(Date value) {
            addCriterion("CJGZSJ >=", value, "CJGZSJ");
            return (Criteria) this;
        }

        public Criteria andCJGZSJLessThan(Date value) {
            addCriterion("CJGZSJ <", value, "CJGZSJ");
            return (Criteria) this;
        }

        public Criteria andCJGZSJLessThanOrEqualTo(Date value) {
            addCriterion("CJGZSJ <=", value, "CJGZSJ");
            return (Criteria) this;
        }

        public Criteria andCJGZSJIn(List<Date> values) {
            addCriterion("CJGZSJ in", values, "CJGZSJ");
            return (Criteria) this;
        }

        public Criteria andCJGZSJNotIn(List<Date> values) {
            addCriterion("CJGZSJ not in", values, "CJGZSJ");
            return (Criteria) this;
        }

        public Criteria andCJGZSJBetween(Date value1, Date value2) {
            addCriterion("CJGZSJ between", value1, value2, "CJGZSJ");
            return (Criteria) this;
        }

        public Criteria andCJGZSJNotBetween(Date value1, Date value2) {
            addCriterion("CJGZSJ not between", value1, value2, "CJGZSJ");
            return (Criteria) this;
        }

        public Criteria andGZSJIsNull() {
            addCriterion("GZSJ is null");
            return (Criteria) this;
        }

        public Criteria andGZSJIsNotNull() {
            addCriterion("GZSJ is not null");
            return (Criteria) this;
        }

        public Criteria andGZSJEqualTo(Date value) {
            addCriterion("GZSJ =", value, "GZSJ");
            return (Criteria) this;
        }

        public Criteria andGZSJNotEqualTo(Date value) {
            addCriterion("GZSJ <>", value, "GZSJ");
            return (Criteria) this;
        }

        public Criteria andGZSJGreaterThan(Date value) {
            addCriterion("GZSJ >", value, "GZSJ");
            return (Criteria) this;
        }

        public Criteria andGZSJGreaterThanOrEqualTo(Date value) {
            addCriterion("GZSJ >=", value, "GZSJ");
            return (Criteria) this;
        }

        public Criteria andGZSJLessThan(Date value) {
            addCriterion("GZSJ <", value, "GZSJ");
            return (Criteria) this;
        }

        public Criteria andGZSJLessThanOrEqualTo(Date value) {
            addCriterion("GZSJ <=", value, "GZSJ");
            return (Criteria) this;
        }

        public Criteria andGZSJIn(List<Date> values) {
            addCriterion("GZSJ in", values, "GZSJ");
            return (Criteria) this;
        }

        public Criteria andGZSJNotIn(List<Date> values) {
            addCriterion("GZSJ not in", values, "GZSJ");
            return (Criteria) this;
        }

        public Criteria andGZSJBetween(Date value1, Date value2) {
            addCriterion("GZSJ between", value1, value2, "GZSJ");
            return (Criteria) this;
        }

        public Criteria andGZSJNotBetween(Date value1, Date value2) {
            addCriterion("GZSJ not between", value1, value2, "GZSJ");
            return (Criteria) this;
        }

        public Criteria andFGGLIsNull() {
            addCriterion("FGGL is null");
            return (Criteria) this;
        }

        public Criteria andFGGLIsNotNull() {
            addCriterion("FGGL is not null");
            return (Criteria) this;
        }

        public Criteria andFGGLEqualTo(BigDecimal value) {
            addCriterion("FGGL =", value, "FGGL");
            return (Criteria) this;
        }

        public Criteria andFGGLNotEqualTo(BigDecimal value) {
            addCriterion("FGGL <>", value, "FGGL");
            return (Criteria) this;
        }

        public Criteria andFGGLGreaterThan(BigDecimal value) {
            addCriterion("FGGL >", value, "FGGL");
            return (Criteria) this;
        }

        public Criteria andFGGLGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FGGL >=", value, "FGGL");
            return (Criteria) this;
        }

        public Criteria andFGGLLessThan(BigDecimal value) {
            addCriterion("FGGL <", value, "FGGL");
            return (Criteria) this;
        }

        public Criteria andFGGLLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FGGL <=", value, "FGGL");
            return (Criteria) this;
        }

        public Criteria andFGGLIn(List<BigDecimal> values) {
            addCriterion("FGGL in", values, "FGGL");
            return (Criteria) this;
        }

        public Criteria andFGGLNotIn(List<BigDecimal> values) {
            addCriterion("FGGL not in", values, "FGGL");
            return (Criteria) this;
        }

        public Criteria andFGGLBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FGGL between", value1, value2, "FGGL");
            return (Criteria) this;
        }

        public Criteria andFGGLNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FGGL not between", value1, value2, "FGGL");
            return (Criteria) this;
        }

        public Criteria andFGJLIsNull() {
            addCriterion("FGJL is null");
            return (Criteria) this;
        }

        public Criteria andFGJLIsNotNull() {
            addCriterion("FGJL is not null");
            return (Criteria) this;
        }

        public Criteria andFGJLEqualTo(BigDecimal value) {
            addCriterion("FGJL =", value, "FGJL");
            return (Criteria) this;
        }

        public Criteria andFGJLNotEqualTo(BigDecimal value) {
            addCriterion("FGJL <>", value, "FGJL");
            return (Criteria) this;
        }

        public Criteria andFGJLGreaterThan(BigDecimal value) {
            addCriterion("FGJL >", value, "FGJL");
            return (Criteria) this;
        }

        public Criteria andFGJLGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FGJL >=", value, "FGJL");
            return (Criteria) this;
        }

        public Criteria andFGJLLessThan(BigDecimal value) {
            addCriterion("FGJL <", value, "FGJL");
            return (Criteria) this;
        }

        public Criteria andFGJLLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FGJL <=", value, "FGJL");
            return (Criteria) this;
        }

        public Criteria andFGJLIn(List<BigDecimal> values) {
            addCriterion("FGJL in", values, "FGJL");
            return (Criteria) this;
        }

        public Criteria andFGJLNotIn(List<BigDecimal> values) {
            addCriterion("FGJL not in", values, "FGJL");
            return (Criteria) this;
        }

        public Criteria andFGJLBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FGJL between", value1, value2, "FGJL");
            return (Criteria) this;
        }

        public Criteria andFGJLNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FGJL not between", value1, value2, "FGJL");
            return (Criteria) this;
        }

        public Criteria andSNDZSRIsNull() {
            addCriterion("SNDZSR is null");
            return (Criteria) this;
        }

        public Criteria andSNDZSRIsNotNull() {
            addCriterion("SNDZSR is not null");
            return (Criteria) this;
        }

        public Criteria andSNDZSREqualTo(BigDecimal value) {
            addCriterion("SNDZSR =", value, "SNDZSR");
            return (Criteria) this;
        }

        public Criteria andSNDZSRNotEqualTo(BigDecimal value) {
            addCriterion("SNDZSR <>", value, "SNDZSR");
            return (Criteria) this;
        }

        public Criteria andSNDZSRGreaterThan(BigDecimal value) {
            addCriterion("SNDZSR >", value, "SNDZSR");
            return (Criteria) this;
        }

        public Criteria andSNDZSRGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SNDZSR >=", value, "SNDZSR");
            return (Criteria) this;
        }

        public Criteria andSNDZSRLessThan(BigDecimal value) {
            addCriterion("SNDZSR <", value, "SNDZSR");
            return (Criteria) this;
        }

        public Criteria andSNDZSRLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SNDZSR <=", value, "SNDZSR");
            return (Criteria) this;
        }

        public Criteria andSNDZSRIn(List<BigDecimal> values) {
            addCriterion("SNDZSR in", values, "SNDZSR");
            return (Criteria) this;
        }

        public Criteria andSNDZSRNotIn(List<BigDecimal> values) {
            addCriterion("SNDZSR not in", values, "SNDZSR");
            return (Criteria) this;
        }

        public Criteria andSNDZSRBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SNDZSR between", value1, value2, "SNDZSR");
            return (Criteria) this;
        }

        public Criteria andSNDZSRNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SNDZSR not between", value1, value2, "SNDZSR");
            return (Criteria) this;
        }

        public Criteria andGJJZHIsNull() {
            addCriterion("GJJZH is null");
            return (Criteria) this;
        }

        public Criteria andGJJZHIsNotNull() {
            addCriterion("GJJZH is not null");
            return (Criteria) this;
        }

        public Criteria andGJJZHEqualTo(String value) {
            addCriterion("GJJZH =", value, "GJJZH");
            return (Criteria) this;
        }

        public Criteria andGJJZHNotEqualTo(String value) {
            addCriterion("GJJZH <>", value, "GJJZH");
            return (Criteria) this;
        }

        public Criteria andGJJZHGreaterThan(String value) {
            addCriterion("GJJZH >", value, "GJJZH");
            return (Criteria) this;
        }

        public Criteria andGJJZHGreaterThanOrEqualTo(String value) {
            addCriterion("GJJZH >=", value, "GJJZH");
            return (Criteria) this;
        }

        public Criteria andGJJZHLessThan(String value) {
            addCriterion("GJJZH <", value, "GJJZH");
            return (Criteria) this;
        }

        public Criteria andGJJZHLessThanOrEqualTo(String value) {
            addCriterion("GJJZH <=", value, "GJJZH");
            return (Criteria) this;
        }

        public Criteria andGJJZHLike(String value) {
            addCriterion("GJJZH like", value, "GJJZH");
            return (Criteria) this;
        }

        public Criteria andGJJZHNotLike(String value) {
            addCriterion("GJJZH not like", value, "GJJZH");
            return (Criteria) this;
        }

        public Criteria andGJJZHIn(List<String> values) {
            addCriterion("GJJZH in", values, "GJJZH");
            return (Criteria) this;
        }

        public Criteria andGJJZHNotIn(List<String> values) {
            addCriterion("GJJZH not in", values, "GJJZH");
            return (Criteria) this;
        }

        public Criteria andGJJZHBetween(String value1, String value2) {
            addCriterion("GJJZH between", value1, value2, "GJJZH");
            return (Criteria) this;
        }

        public Criteria andGJJZHNotBetween(String value1, String value2) {
            addCriterion("GJJZH not between", value1, value2, "GJJZH");
            return (Criteria) this;
        }

        public Criteria andCJZHIsNull() {
            addCriterion("CJZH is null");
            return (Criteria) this;
        }

        public Criteria andCJZHIsNotNull() {
            addCriterion("CJZH is not null");
            return (Criteria) this;
        }

        public Criteria andCJZHEqualTo(String value) {
            addCriterion("CJZH =", value, "CJZH");
            return (Criteria) this;
        }

        public Criteria andCJZHNotEqualTo(String value) {
            addCriterion("CJZH <>", value, "CJZH");
            return (Criteria) this;
        }

        public Criteria andCJZHGreaterThan(String value) {
            addCriterion("CJZH >", value, "CJZH");
            return (Criteria) this;
        }

        public Criteria andCJZHGreaterThanOrEqualTo(String value) {
            addCriterion("CJZH >=", value, "CJZH");
            return (Criteria) this;
        }

        public Criteria andCJZHLessThan(String value) {
            addCriterion("CJZH <", value, "CJZH");
            return (Criteria) this;
        }

        public Criteria andCJZHLessThanOrEqualTo(String value) {
            addCriterion("CJZH <=", value, "CJZH");
            return (Criteria) this;
        }

        public Criteria andCJZHLike(String value) {
            addCriterion("CJZH like", value, "CJZH");
            return (Criteria) this;
        }

        public Criteria andCJZHNotLike(String value) {
            addCriterion("CJZH not like", value, "CJZH");
            return (Criteria) this;
        }

        public Criteria andCJZHIn(List<String> values) {
            addCriterion("CJZH in", values, "CJZH");
            return (Criteria) this;
        }

        public Criteria andCJZHNotIn(List<String> values) {
            addCriterion("CJZH not in", values, "CJZH");
            return (Criteria) this;
        }

        public Criteria andCJZHBetween(String value1, String value2) {
            addCriterion("CJZH between", value1, value2, "CJZH");
            return (Criteria) this;
        }

        public Criteria andCJZHNotBetween(String value1, String value2) {
            addCriterion("CJZH not between", value1, value2, "CJZH");
            return (Criteria) this;
        }

        public Criteria andCJDJIsNull() {
            addCriterion("CJDJ is null");
            return (Criteria) this;
        }

        public Criteria andCJDJIsNotNull() {
            addCriterion("CJDJ is not null");
            return (Criteria) this;
        }

        public Criteria andCJDJEqualTo(String value) {
            addCriterion("CJDJ =", value, "CJDJ");
            return (Criteria) this;
        }

        public Criteria andCJDJNotEqualTo(String value) {
            addCriterion("CJDJ <>", value, "CJDJ");
            return (Criteria) this;
        }

        public Criteria andCJDJGreaterThan(String value) {
            addCriterion("CJDJ >", value, "CJDJ");
            return (Criteria) this;
        }

        public Criteria andCJDJGreaterThanOrEqualTo(String value) {
            addCriterion("CJDJ >=", value, "CJDJ");
            return (Criteria) this;
        }

        public Criteria andCJDJLessThan(String value) {
            addCriterion("CJDJ <", value, "CJDJ");
            return (Criteria) this;
        }

        public Criteria andCJDJLessThanOrEqualTo(String value) {
            addCriterion("CJDJ <=", value, "CJDJ");
            return (Criteria) this;
        }

        public Criteria andCJDJLike(String value) {
            addCriterion("CJDJ like", value, "CJDJ");
            return (Criteria) this;
        }

        public Criteria andCJDJNotLike(String value) {
            addCriterion("CJDJ not like", value, "CJDJ");
            return (Criteria) this;
        }

        public Criteria andCJDJIn(List<String> values) {
            addCriterion("CJDJ in", values, "CJDJ");
            return (Criteria) this;
        }

        public Criteria andCJDJNotIn(List<String> values) {
            addCriterion("CJDJ not in", values, "CJDJ");
            return (Criteria) this;
        }

        public Criteria andCJDJBetween(String value1, String value2) {
            addCriterion("CJDJ between", value1, value2, "CJDJ");
            return (Criteria) this;
        }

        public Criteria andCJDJNotBetween(String value1, String value2) {
            addCriterion("CJDJ not between", value1, value2, "CJDJ");
            return (Criteria) this;
        }

        public Criteria andCJLXIsNull() {
            addCriterion("CJLX is null");
            return (Criteria) this;
        }

        public Criteria andCJLXIsNotNull() {
            addCriterion("CJLX is not null");
            return (Criteria) this;
        }

        public Criteria andCJLXEqualTo(String value) {
            addCriterion("CJLX =", value, "CJLX");
            return (Criteria) this;
        }

        public Criteria andCJLXNotEqualTo(String value) {
            addCriterion("CJLX <>", value, "CJLX");
            return (Criteria) this;
        }

        public Criteria andCJLXGreaterThan(String value) {
            addCriterion("CJLX >", value, "CJLX");
            return (Criteria) this;
        }

        public Criteria andCJLXGreaterThanOrEqualTo(String value) {
            addCriterion("CJLX >=", value, "CJLX");
            return (Criteria) this;
        }

        public Criteria andCJLXLessThan(String value) {
            addCriterion("CJLX <", value, "CJLX");
            return (Criteria) this;
        }

        public Criteria andCJLXLessThanOrEqualTo(String value) {
            addCriterion("CJLX <=", value, "CJLX");
            return (Criteria) this;
        }

        public Criteria andCJLXLike(String value) {
            addCriterion("CJLX like", value, "CJLX");
            return (Criteria) this;
        }

        public Criteria andCJLXNotLike(String value) {
            addCriterion("CJLX not like", value, "CJLX");
            return (Criteria) this;
        }

        public Criteria andCJLXIn(List<String> values) {
            addCriterion("CJLX in", values, "CJLX");
            return (Criteria) this;
        }

        public Criteria andCJLXNotIn(List<String> values) {
            addCriterion("CJLX not in", values, "CJLX");
            return (Criteria) this;
        }

        public Criteria andCJLXBetween(String value1, String value2) {
            addCriterion("CJLX between", value1, value2, "CJLX");
            return (Criteria) this;
        }

        public Criteria andCJLXNotBetween(String value1, String value2) {
            addCriterion("CJLX not between", value1, value2, "CJLX");
            return (Criteria) this;
        }

        public Criteria andSFJLSIsNull() {
            addCriterion("SFJLS is null");
            return (Criteria) this;
        }

        public Criteria andSFJLSIsNotNull() {
            addCriterion("SFJLS is not null");
            return (Criteria) this;
        }

        public Criteria andSFJLSEqualTo(Short value) {
            addCriterion("SFJLS =", value, "SFJLS");
            return (Criteria) this;
        }

        public Criteria andSFJLSNotEqualTo(Short value) {
            addCriterion("SFJLS <>", value, "SFJLS");
            return (Criteria) this;
        }

        public Criteria andSFJLSGreaterThan(Short value) {
            addCriterion("SFJLS >", value, "SFJLS");
            return (Criteria) this;
        }

        public Criteria andSFJLSGreaterThanOrEqualTo(Short value) {
            addCriterion("SFJLS >=", value, "SFJLS");
            return (Criteria) this;
        }

        public Criteria andSFJLSLessThan(Short value) {
            addCriterion("SFJLS <", value, "SFJLS");
            return (Criteria) this;
        }

        public Criteria andSFJLSLessThanOrEqualTo(Short value) {
            addCriterion("SFJLS <=", value, "SFJLS");
            return (Criteria) this;
        }

        public Criteria andSFJLSIn(List<Short> values) {
            addCriterion("SFJLS in", values, "SFJLS");
            return (Criteria) this;
        }

        public Criteria andSFJLSNotIn(List<Short> values) {
            addCriterion("SFJLS not in", values, "SFJLS");
            return (Criteria) this;
        }

        public Criteria andSFJLSBetween(Short value1, Short value2) {
            addCriterion("SFJLS between", value1, value2, "SFJLS");
            return (Criteria) this;
        }

        public Criteria andSFJLSNotBetween(Short value1, Short value2) {
            addCriterion("SFJLS not between", value1, value2, "SFJLS");
            return (Criteria) this;
        }

        public Criteria andYDDHIsNull() {
            addCriterion("YDDH is null");
            return (Criteria) this;
        }

        public Criteria andYDDHIsNotNull() {
            addCriterion("YDDH is not null");
            return (Criteria) this;
        }

        public Criteria andYDDHEqualTo(String value) {
            addCriterion("YDDH =", value, "YDDH");
            return (Criteria) this;
        }

        public Criteria andYDDHNotEqualTo(String value) {
            addCriterion("YDDH <>", value, "YDDH");
            return (Criteria) this;
        }

        public Criteria andYDDHGreaterThan(String value) {
            addCriterion("YDDH >", value, "YDDH");
            return (Criteria) this;
        }

        public Criteria andYDDHGreaterThanOrEqualTo(String value) {
            addCriterion("YDDH >=", value, "YDDH");
            return (Criteria) this;
        }

        public Criteria andYDDHLessThan(String value) {
            addCriterion("YDDH <", value, "YDDH");
            return (Criteria) this;
        }

        public Criteria andYDDHLessThanOrEqualTo(String value) {
            addCriterion("YDDH <=", value, "YDDH");
            return (Criteria) this;
        }

        public Criteria andYDDHLike(String value) {
            addCriterion("YDDH like", value, "YDDH");
            return (Criteria) this;
        }

        public Criteria andYDDHNotLike(String value) {
            addCriterion("YDDH not like", value, "YDDH");
            return (Criteria) this;
        }

        public Criteria andYDDHIn(List<String> values) {
            addCriterion("YDDH in", values, "YDDH");
            return (Criteria) this;
        }

        public Criteria andYDDHNotIn(List<String> values) {
            addCriterion("YDDH not in", values, "YDDH");
            return (Criteria) this;
        }

        public Criteria andYDDHBetween(String value1, String value2) {
            addCriterion("YDDH between", value1, value2, "YDDH");
            return (Criteria) this;
        }

        public Criteria andYDDHNotBetween(String value1, String value2) {
            addCriterion("YDDH not between", value1, value2, "YDDH");
            return (Criteria) this;
        }

        public Criteria andLXDHIsNull() {
            addCriterion("LXDH is null");
            return (Criteria) this;
        }

        public Criteria andLXDHIsNotNull() {
            addCriterion("LXDH is not null");
            return (Criteria) this;
        }

        public Criteria andLXDHEqualTo(String value) {
            addCriterion("LXDH =", value, "LXDH");
            return (Criteria) this;
        }

        public Criteria andLXDHNotEqualTo(String value) {
            addCriterion("LXDH <>", value, "LXDH");
            return (Criteria) this;
        }

        public Criteria andLXDHGreaterThan(String value) {
            addCriterion("LXDH >", value, "LXDH");
            return (Criteria) this;
        }

        public Criteria andLXDHGreaterThanOrEqualTo(String value) {
            addCriterion("LXDH >=", value, "LXDH");
            return (Criteria) this;
        }

        public Criteria andLXDHLessThan(String value) {
            addCriterion("LXDH <", value, "LXDH");
            return (Criteria) this;
        }

        public Criteria andLXDHLessThanOrEqualTo(String value) {
            addCriterion("LXDH <=", value, "LXDH");
            return (Criteria) this;
        }

        public Criteria andLXDHLike(String value) {
            addCriterion("LXDH like", value, "LXDH");
            return (Criteria) this;
        }

        public Criteria andLXDHNotLike(String value) {
            addCriterion("LXDH not like", value, "LXDH");
            return (Criteria) this;
        }

        public Criteria andLXDHIn(List<String> values) {
            addCriterion("LXDH in", values, "LXDH");
            return (Criteria) this;
        }

        public Criteria andLXDHNotIn(List<String> values) {
            addCriterion("LXDH not in", values, "LXDH");
            return (Criteria) this;
        }

        public Criteria andLXDHBetween(String value1, String value2) {
            addCriterion("LXDH between", value1, value2, "LXDH");
            return (Criteria) this;
        }

        public Criteria andLXDHNotBetween(String value1, String value2) {
            addCriterion("LXDH not between", value1, value2, "LXDH");
            return (Criteria) this;
        }

        public Criteria andLXDZIsNull() {
            addCriterion("LXDZ is null");
            return (Criteria) this;
        }

        public Criteria andLXDZIsNotNull() {
            addCriterion("LXDZ is not null");
            return (Criteria) this;
        }

        public Criteria andLXDZEqualTo(String value) {
            addCriterion("LXDZ =", value, "LXDZ");
            return (Criteria) this;
        }

        public Criteria andLXDZNotEqualTo(String value) {
            addCriterion("LXDZ <>", value, "LXDZ");
            return (Criteria) this;
        }

        public Criteria andLXDZGreaterThan(String value) {
            addCriterion("LXDZ >", value, "LXDZ");
            return (Criteria) this;
        }

        public Criteria andLXDZGreaterThanOrEqualTo(String value) {
            addCriterion("LXDZ >=", value, "LXDZ");
            return (Criteria) this;
        }

        public Criteria andLXDZLessThan(String value) {
            addCriterion("LXDZ <", value, "LXDZ");
            return (Criteria) this;
        }

        public Criteria andLXDZLessThanOrEqualTo(String value) {
            addCriterion("LXDZ <=", value, "LXDZ");
            return (Criteria) this;
        }

        public Criteria andLXDZLike(String value) {
            addCriterion("LXDZ like", value, "LXDZ");
            return (Criteria) this;
        }

        public Criteria andLXDZNotLike(String value) {
            addCriterion("LXDZ not like", value, "LXDZ");
            return (Criteria) this;
        }

        public Criteria andLXDZIn(List<String> values) {
            addCriterion("LXDZ in", values, "LXDZ");
            return (Criteria) this;
        }

        public Criteria andLXDZNotIn(List<String> values) {
            addCriterion("LXDZ not in", values, "LXDZ");
            return (Criteria) this;
        }

        public Criteria andLXDZBetween(String value1, String value2) {
            addCriterion("LXDZ between", value1, value2, "LXDZ");
            return (Criteria) this;
        }

        public Criteria andLXDZNotBetween(String value1, String value2) {
            addCriterion("LXDZ not between", value1, value2, "LXDZ");
            return (Criteria) this;
        }

        public Criteria andYZBMIsNull() {
            addCriterion("YZBM is null");
            return (Criteria) this;
        }

        public Criteria andYZBMIsNotNull() {
            addCriterion("YZBM is not null");
            return (Criteria) this;
        }

        public Criteria andYZBMEqualTo(Integer value) {
            addCriterion("YZBM =", value, "YZBM");
            return (Criteria) this;
        }

        public Criteria andYZBMNotEqualTo(Integer value) {
            addCriterion("YZBM <>", value, "YZBM");
            return (Criteria) this;
        }

        public Criteria andYZBMGreaterThan(Integer value) {
            addCriterion("YZBM >", value, "YZBM");
            return (Criteria) this;
        }

        public Criteria andYZBMGreaterThanOrEqualTo(Integer value) {
            addCriterion("YZBM >=", value, "YZBM");
            return (Criteria) this;
        }

        public Criteria andYZBMLessThan(Integer value) {
            addCriterion("YZBM <", value, "YZBM");
            return (Criteria) this;
        }

        public Criteria andYZBMLessThanOrEqualTo(Integer value) {
            addCriterion("YZBM <=", value, "YZBM");
            return (Criteria) this;
        }

        public Criteria andYZBMIn(List<Integer> values) {
            addCriterion("YZBM in", values, "YZBM");
            return (Criteria) this;
        }

        public Criteria andYZBMNotIn(List<Integer> values) {
            addCriterion("YZBM not in", values, "YZBM");
            return (Criteria) this;
        }

        public Criteria andYZBMBetween(Integer value1, Integer value2) {
            addCriterion("YZBM between", value1, value2, "YZBM");
            return (Criteria) this;
        }

        public Criteria andYZBMNotBetween(Integer value1, Integer value2) {
            addCriterion("YZBM not between", value1, value2, "YZBM");
            return (Criteria) this;
        }

        public Criteria andDZYXIsNull() {
            addCriterion("DZYX is null");
            return (Criteria) this;
        }

        public Criteria andDZYXIsNotNull() {
            addCriterion("DZYX is not null");
            return (Criteria) this;
        }

        public Criteria andDZYXEqualTo(String value) {
            addCriterion("DZYX =", value, "DZYX");
            return (Criteria) this;
        }

        public Criteria andDZYXNotEqualTo(String value) {
            addCriterion("DZYX <>", value, "DZYX");
            return (Criteria) this;
        }

        public Criteria andDZYXGreaterThan(String value) {
            addCriterion("DZYX >", value, "DZYX");
            return (Criteria) this;
        }

        public Criteria andDZYXGreaterThanOrEqualTo(String value) {
            addCriterion("DZYX >=", value, "DZYX");
            return (Criteria) this;
        }

        public Criteria andDZYXLessThan(String value) {
            addCriterion("DZYX <", value, "DZYX");
            return (Criteria) this;
        }

        public Criteria andDZYXLessThanOrEqualTo(String value) {
            addCriterion("DZYX <=", value, "DZYX");
            return (Criteria) this;
        }

        public Criteria andDZYXLike(String value) {
            addCriterion("DZYX like", value, "DZYX");
            return (Criteria) this;
        }

        public Criteria andDZYXNotLike(String value) {
            addCriterion("DZYX not like", value, "DZYX");
            return (Criteria) this;
        }

        public Criteria andDZYXIn(List<String> values) {
            addCriterion("DZYX in", values, "DZYX");
            return (Criteria) this;
        }

        public Criteria andDZYXNotIn(List<String> values) {
            addCriterion("DZYX not in", values, "DZYX");
            return (Criteria) this;
        }

        public Criteria andDZYXBetween(String value1, String value2) {
            addCriterion("DZYX between", value1, value2, "DZYX");
            return (Criteria) this;
        }

        public Criteria andDZYXNotBetween(String value1, String value2) {
            addCriterion("DZYX not between", value1, value2, "DZYX");
            return (Criteria) this;
        }

        public Criteria andSFGFRIsNull() {
            addCriterion("SFGFR is null");
            return (Criteria) this;
        }

        public Criteria andSFGFRIsNotNull() {
            addCriterion("SFGFR is not null");
            return (Criteria) this;
        }

        public Criteria andSFGFREqualTo(Short value) {
            addCriterion("SFGFR =", value, "SFGFR");
            return (Criteria) this;
        }

        public Criteria andSFGFRNotEqualTo(Short value) {
            addCriterion("SFGFR <>", value, "SFGFR");
            return (Criteria) this;
        }

        public Criteria andSFGFRGreaterThan(Short value) {
            addCriterion("SFGFR >", value, "SFGFR");
            return (Criteria) this;
        }

        public Criteria andSFGFRGreaterThanOrEqualTo(Short value) {
            addCriterion("SFGFR >=", value, "SFGFR");
            return (Criteria) this;
        }

        public Criteria andSFGFRLessThan(Short value) {
            addCriterion("SFGFR <", value, "SFGFR");
            return (Criteria) this;
        }

        public Criteria andSFGFRLessThanOrEqualTo(Short value) {
            addCriterion("SFGFR <=", value, "SFGFR");
            return (Criteria) this;
        }

        public Criteria andSFGFRIn(List<Short> values) {
            addCriterion("SFGFR in", values, "SFGFR");
            return (Criteria) this;
        }

        public Criteria andSFGFRNotIn(List<Short> values) {
            addCriterion("SFGFR not in", values, "SFGFR");
            return (Criteria) this;
        }

        public Criteria andSFGFRBetween(Short value1, Short value2) {
            addCriterion("SFGFR between", value1, value2, "SFGFR");
            return (Criteria) this;
        }

        public Criteria andSFGFRNotBetween(Short value1, Short value2) {
            addCriterion("SFGFR not between", value1, value2, "SFGFR");
            return (Criteria) this;
        }

        public Criteria andHTQDSJIsNull() {
            addCriterion("HTQDSJ is null");
            return (Criteria) this;
        }

        public Criteria andHTQDSJIsNotNull() {
            addCriterion("HTQDSJ is not null");
            return (Criteria) this;
        }

        public Criteria andHTQDSJEqualTo(Date value) {
            addCriterion("HTQDSJ =", value, "HTQDSJ");
            return (Criteria) this;
        }

        public Criteria andHTQDSJNotEqualTo(Date value) {
            addCriterion("HTQDSJ <>", value, "HTQDSJ");
            return (Criteria) this;
        }

        public Criteria andHTQDSJGreaterThan(Date value) {
            addCriterion("HTQDSJ >", value, "HTQDSJ");
            return (Criteria) this;
        }

        public Criteria andHTQDSJGreaterThanOrEqualTo(Date value) {
            addCriterion("HTQDSJ >=", value, "HTQDSJ");
            return (Criteria) this;
        }

        public Criteria andHTQDSJLessThan(Date value) {
            addCriterion("HTQDSJ <", value, "HTQDSJ");
            return (Criteria) this;
        }

        public Criteria andHTQDSJLessThanOrEqualTo(Date value) {
            addCriterion("HTQDSJ <=", value, "HTQDSJ");
            return (Criteria) this;
        }

        public Criteria andHTQDSJIn(List<Date> values) {
            addCriterion("HTQDSJ in", values, "HTQDSJ");
            return (Criteria) this;
        }

        public Criteria andHTQDSJNotIn(List<Date> values) {
            addCriterion("HTQDSJ not in", values, "HTQDSJ");
            return (Criteria) this;
        }

        public Criteria andHTQDSJBetween(Date value1, Date value2) {
            addCriterion("HTQDSJ between", value1, value2, "HTQDSJ");
            return (Criteria) this;
        }

        public Criteria andHTQDSJNotBetween(Date value1, Date value2) {
            addCriterion("HTQDSJ not between", value1, value2, "HTQDSJ");
            return (Criteria) this;
        }

        public Criteria andHTQDSJZIsNull() {
            addCriterion("HTQDSJZ is null");
            return (Criteria) this;
        }

        public Criteria andHTQDSJZIsNotNull() {
            addCriterion("HTQDSJZ is not null");
            return (Criteria) this;
        }

        public Criteria andHTQDSJZEqualTo(Date value) {
            addCriterion("HTQDSJZ =", value, "HTQDSJZ");
            return (Criteria) this;
        }

        public Criteria andHTQDSJZNotEqualTo(Date value) {
            addCriterion("HTQDSJZ <>", value, "HTQDSJZ");
            return (Criteria) this;
        }

        public Criteria andHTQDSJZGreaterThan(Date value) {
            addCriterion("HTQDSJZ >", value, "HTQDSJZ");
            return (Criteria) this;
        }

        public Criteria andHTQDSJZGreaterThanOrEqualTo(Date value) {
            addCriterion("HTQDSJZ >=", value, "HTQDSJZ");
            return (Criteria) this;
        }

        public Criteria andHTQDSJZLessThan(Date value) {
            addCriterion("HTQDSJZ <", value, "HTQDSJZ");
            return (Criteria) this;
        }

        public Criteria andHTQDSJZLessThanOrEqualTo(Date value) {
            addCriterion("HTQDSJZ <=", value, "HTQDSJZ");
            return (Criteria) this;
        }

        public Criteria andHTQDSJZIn(List<Date> values) {
            addCriterion("HTQDSJZ in", values, "HTQDSJZ");
            return (Criteria) this;
        }

        public Criteria andHTQDSJZNotIn(List<Date> values) {
            addCriterion("HTQDSJZ not in", values, "HTQDSJZ");
            return (Criteria) this;
        }

        public Criteria andHTQDSJZBetween(Date value1, Date value2) {
            addCriterion("HTQDSJZ between", value1, value2, "HTQDSJZ");
            return (Criteria) this;
        }

        public Criteria andHTQDSJZNotBetween(Date value1, Date value2) {
            addCriterion("HTQDSJZ not between", value1, value2, "HTQDSJZ");
            return (Criteria) this;
        }

        public Criteria andHTQDNSIsNull() {
            addCriterion("HTQDNS is null");
            return (Criteria) this;
        }

        public Criteria andHTQDNSIsNotNull() {
            addCriterion("HTQDNS is not null");
            return (Criteria) this;
        }

        public Criteria andHTQDNSEqualTo(Integer value) {
            addCriterion("HTQDNS =", value, "HTQDNS");
            return (Criteria) this;
        }

        public Criteria andHTQDNSNotEqualTo(Integer value) {
            addCriterion("HTQDNS <>", value, "HTQDNS");
            return (Criteria) this;
        }

        public Criteria andHTQDNSGreaterThan(Integer value) {
            addCriterion("HTQDNS >", value, "HTQDNS");
            return (Criteria) this;
        }

        public Criteria andHTQDNSGreaterThanOrEqualTo(Integer value) {
            addCriterion("HTQDNS >=", value, "HTQDNS");
            return (Criteria) this;
        }

        public Criteria andHTQDNSLessThan(Integer value) {
            addCriterion("HTQDNS <", value, "HTQDNS");
            return (Criteria) this;
        }

        public Criteria andHTQDNSLessThanOrEqualTo(Integer value) {
            addCriterion("HTQDNS <=", value, "HTQDNS");
            return (Criteria) this;
        }

        public Criteria andHTQDNSIn(List<Integer> values) {
            addCriterion("HTQDNS in", values, "HTQDNS");
            return (Criteria) this;
        }

        public Criteria andHTQDNSNotIn(List<Integer> values) {
            addCriterion("HTQDNS not in", values, "HTQDNS");
            return (Criteria) this;
        }

        public Criteria andHTQDNSBetween(Integer value1, Integer value2) {
            addCriterion("HTQDNS between", value1, value2, "HTQDNS");
            return (Criteria) this;
        }

        public Criteria andHTQDNSNotBetween(Integer value1, Integer value2) {
            addCriterion("HTQDNS not between", value1, value2, "HTQDNS");
            return (Criteria) this;
        }

        public Criteria andYLBXJNSJIsNull() {
            addCriterion("YLBXJNSJ is null");
            return (Criteria) this;
        }

        public Criteria andYLBXJNSJIsNotNull() {
            addCriterion("YLBXJNSJ is not null");
            return (Criteria) this;
        }

        public Criteria andYLBXJNSJEqualTo(Date value) {
            addCriterion("YLBXJNSJ =", value, "YLBXJNSJ");
            return (Criteria) this;
        }

        public Criteria andYLBXJNSJNotEqualTo(Date value) {
            addCriterion("YLBXJNSJ <>", value, "YLBXJNSJ");
            return (Criteria) this;
        }

        public Criteria andYLBXJNSJGreaterThan(Date value) {
            addCriterion("YLBXJNSJ >", value, "YLBXJNSJ");
            return (Criteria) this;
        }

        public Criteria andYLBXJNSJGreaterThanOrEqualTo(Date value) {
            addCriterion("YLBXJNSJ >=", value, "YLBXJNSJ");
            return (Criteria) this;
        }

        public Criteria andYLBXJNSJLessThan(Date value) {
            addCriterion("YLBXJNSJ <", value, "YLBXJNSJ");
            return (Criteria) this;
        }

        public Criteria andYLBXJNSJLessThanOrEqualTo(Date value) {
            addCriterion("YLBXJNSJ <=", value, "YLBXJNSJ");
            return (Criteria) this;
        }

        public Criteria andYLBXJNSJIn(List<Date> values) {
            addCriterion("YLBXJNSJ in", values, "YLBXJNSJ");
            return (Criteria) this;
        }

        public Criteria andYLBXJNSJNotIn(List<Date> values) {
            addCriterion("YLBXJNSJ not in", values, "YLBXJNSJ");
            return (Criteria) this;
        }

        public Criteria andYLBXJNSJBetween(Date value1, Date value2) {
            addCriterion("YLBXJNSJ between", value1, value2, "YLBXJNSJ");
            return (Criteria) this;
        }

        public Criteria andYLBXJNSJNotBetween(Date value1, Date value2) {
            addCriterion("YLBXJNSJ not between", value1, value2, "YLBXJNSJ");
            return (Criteria) this;
        }

        public Criteria andYLBXJNNSIsNull() {
            addCriterion("YLBXJNNS is null");
            return (Criteria) this;
        }

        public Criteria andYLBXJNNSIsNotNull() {
            addCriterion("YLBXJNNS is not null");
            return (Criteria) this;
        }

        public Criteria andYLBXJNNSEqualTo(Integer value) {
            addCriterion("YLBXJNNS =", value, "YLBXJNNS");
            return (Criteria) this;
        }

        public Criteria andYLBXJNNSNotEqualTo(Integer value) {
            addCriterion("YLBXJNNS <>", value, "YLBXJNNS");
            return (Criteria) this;
        }

        public Criteria andYLBXJNNSGreaterThan(Integer value) {
            addCriterion("YLBXJNNS >", value, "YLBXJNNS");
            return (Criteria) this;
        }

        public Criteria andYLBXJNNSGreaterThanOrEqualTo(Integer value) {
            addCriterion("YLBXJNNS >=", value, "YLBXJNNS");
            return (Criteria) this;
        }

        public Criteria andYLBXJNNSLessThan(Integer value) {
            addCriterion("YLBXJNNS <", value, "YLBXJNNS");
            return (Criteria) this;
        }

        public Criteria andYLBXJNNSLessThanOrEqualTo(Integer value) {
            addCriterion("YLBXJNNS <=", value, "YLBXJNNS");
            return (Criteria) this;
        }

        public Criteria andYLBXJNNSIn(List<Integer> values) {
            addCriterion("YLBXJNNS in", values, "YLBXJNNS");
            return (Criteria) this;
        }

        public Criteria andYLBXJNNSNotIn(List<Integer> values) {
            addCriterion("YLBXJNNS not in", values, "YLBXJNNS");
            return (Criteria) this;
        }

        public Criteria andYLBXJNNSBetween(Integer value1, Integer value2) {
            addCriterion("YLBXJNNS between", value1, value2, "YLBXJNNS");
            return (Criteria) this;
        }

        public Criteria andYLBXJNNSNotBetween(Integer value1, Integer value2) {
            addCriterion("YLBXJNNS not between", value1, value2, "YLBXJNNS");
            return (Criteria) this;
        }

        public Criteria andZFGJJJNSJIsNull() {
            addCriterion("ZFGJJJNSJ is null");
            return (Criteria) this;
        }

        public Criteria andZFGJJJNSJIsNotNull() {
            addCriterion("ZFGJJJNSJ is not null");
            return (Criteria) this;
        }

        public Criteria andZFGJJJNSJEqualTo(Date value) {
            addCriterion("ZFGJJJNSJ =", value, "ZFGJJJNSJ");
            return (Criteria) this;
        }

        public Criteria andZFGJJJNSJNotEqualTo(Date value) {
            addCriterion("ZFGJJJNSJ <>", value, "ZFGJJJNSJ");
            return (Criteria) this;
        }

        public Criteria andZFGJJJNSJGreaterThan(Date value) {
            addCriterion("ZFGJJJNSJ >", value, "ZFGJJJNSJ");
            return (Criteria) this;
        }

        public Criteria andZFGJJJNSJGreaterThanOrEqualTo(Date value) {
            addCriterion("ZFGJJJNSJ >=", value, "ZFGJJJNSJ");
            return (Criteria) this;
        }

        public Criteria andZFGJJJNSJLessThan(Date value) {
            addCriterion("ZFGJJJNSJ <", value, "ZFGJJJNSJ");
            return (Criteria) this;
        }

        public Criteria andZFGJJJNSJLessThanOrEqualTo(Date value) {
            addCriterion("ZFGJJJNSJ <=", value, "ZFGJJJNSJ");
            return (Criteria) this;
        }

        public Criteria andZFGJJJNSJIn(List<Date> values) {
            addCriterion("ZFGJJJNSJ in", values, "ZFGJJJNSJ");
            return (Criteria) this;
        }

        public Criteria andZFGJJJNSJNotIn(List<Date> values) {
            addCriterion("ZFGJJJNSJ not in", values, "ZFGJJJNSJ");
            return (Criteria) this;
        }

        public Criteria andZFGJJJNSJBetween(Date value1, Date value2) {
            addCriterion("ZFGJJJNSJ between", value1, value2, "ZFGJJJNSJ");
            return (Criteria) this;
        }

        public Criteria andZFGJJJNSJNotBetween(Date value1, Date value2) {
            addCriterion("ZFGJJJNSJ not between", value1, value2, "ZFGJJJNSJ");
            return (Criteria) this;
        }

        public Criteria andZFGJJJNNSIsNull() {
            addCriterion("ZFGJJJNNS is null");
            return (Criteria) this;
        }

        public Criteria andZFGJJJNNSIsNotNull() {
            addCriterion("ZFGJJJNNS is not null");
            return (Criteria) this;
        }

        public Criteria andZFGJJJNNSEqualTo(Integer value) {
            addCriterion("ZFGJJJNNS =", value, "ZFGJJJNNS");
            return (Criteria) this;
        }

        public Criteria andZFGJJJNNSNotEqualTo(Integer value) {
            addCriterion("ZFGJJJNNS <>", value, "ZFGJJJNNS");
            return (Criteria) this;
        }

        public Criteria andZFGJJJNNSGreaterThan(Integer value) {
            addCriterion("ZFGJJJNNS >", value, "ZFGJJJNNS");
            return (Criteria) this;
        }

        public Criteria andZFGJJJNNSGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZFGJJJNNS >=", value, "ZFGJJJNNS");
            return (Criteria) this;
        }

        public Criteria andZFGJJJNNSLessThan(Integer value) {
            addCriterion("ZFGJJJNNS <", value, "ZFGJJJNNS");
            return (Criteria) this;
        }

        public Criteria andZFGJJJNNSLessThanOrEqualTo(Integer value) {
            addCriterion("ZFGJJJNNS <=", value, "ZFGJJJNNS");
            return (Criteria) this;
        }

        public Criteria andZFGJJJNNSIn(List<Integer> values) {
            addCriterion("ZFGJJJNNS in", values, "ZFGJJJNNS");
            return (Criteria) this;
        }

        public Criteria andZFGJJJNNSNotIn(List<Integer> values) {
            addCriterion("ZFGJJJNNS not in", values, "ZFGJJJNNS");
            return (Criteria) this;
        }

        public Criteria andZFGJJJNNSBetween(Integer value1, Integer value2) {
            addCriterion("ZFGJJJNNS between", value1, value2, "ZFGJJJNNS");
            return (Criteria) this;
        }

        public Criteria andZFGJJJNNSNotBetween(Integer value1, Integer value2) {
            addCriterion("ZFGJJJNNS not between", value1, value2, "ZFGJJJNNS");
            return (Criteria) this;
        }

        public Criteria andSWWSZMQXIsNull() {
            addCriterion("SWWSZMQX is null");
            return (Criteria) this;
        }

        public Criteria andSWWSZMQXIsNotNull() {
            addCriterion("SWWSZMQX is not null");
            return (Criteria) this;
        }

        public Criteria andSWWSZMQXEqualTo(Date value) {
            addCriterion("SWWSZMQX =", value, "SWWSZMQX");
            return (Criteria) this;
        }

        public Criteria andSWWSZMQXNotEqualTo(Date value) {
            addCriterion("SWWSZMQX <>", value, "SWWSZMQX");
            return (Criteria) this;
        }

        public Criteria andSWWSZMQXGreaterThan(Date value) {
            addCriterion("SWWSZMQX >", value, "SWWSZMQX");
            return (Criteria) this;
        }

        public Criteria andSWWSZMQXGreaterThanOrEqualTo(Date value) {
            addCriterion("SWWSZMQX >=", value, "SWWSZMQX");
            return (Criteria) this;
        }

        public Criteria andSWWSZMQXLessThan(Date value) {
            addCriterion("SWWSZMQX <", value, "SWWSZMQX");
            return (Criteria) this;
        }

        public Criteria andSWWSZMQXLessThanOrEqualTo(Date value) {
            addCriterion("SWWSZMQX <=", value, "SWWSZMQX");
            return (Criteria) this;
        }

        public Criteria andSWWSZMQXIn(List<Date> values) {
            addCriterion("SWWSZMQX in", values, "SWWSZMQX");
            return (Criteria) this;
        }

        public Criteria andSWWSZMQXNotIn(List<Date> values) {
            addCriterion("SWWSZMQX not in", values, "SWWSZMQX");
            return (Criteria) this;
        }

        public Criteria andSWWSZMQXBetween(Date value1, Date value2) {
            addCriterion("SWWSZMQX between", value1, value2, "SWWSZMQX");
            return (Criteria) this;
        }

        public Criteria andSWWSZMQXNotBetween(Date value1, Date value2) {
            addCriterion("SWWSZMQX not between", value1, value2, "SWWSZMQX");
            return (Criteria) this;
        }

        public Criteria andWSNSIsNull() {
            addCriterion("WSNS is null");
            return (Criteria) this;
        }

        public Criteria andWSNSIsNotNull() {
            addCriterion("WSNS is not null");
            return (Criteria) this;
        }

        public Criteria andWSNSEqualTo(Integer value) {
            addCriterion("WSNS =", value, "WSNS");
            return (Criteria) this;
        }

        public Criteria andWSNSNotEqualTo(Integer value) {
            addCriterion("WSNS <>", value, "WSNS");
            return (Criteria) this;
        }

        public Criteria andWSNSGreaterThan(Integer value) {
            addCriterion("WSNS >", value, "WSNS");
            return (Criteria) this;
        }

        public Criteria andWSNSGreaterThanOrEqualTo(Integer value) {
            addCriterion("WSNS >=", value, "WSNS");
            return (Criteria) this;
        }

        public Criteria andWSNSLessThan(Integer value) {
            addCriterion("WSNS <", value, "WSNS");
            return (Criteria) this;
        }

        public Criteria andWSNSLessThanOrEqualTo(Integer value) {
            addCriterion("WSNS <=", value, "WSNS");
            return (Criteria) this;
        }

        public Criteria andWSNSIn(List<Integer> values) {
            addCriterion("WSNS in", values, "WSNS");
            return (Criteria) this;
        }

        public Criteria andWSNSNotIn(List<Integer> values) {
            addCriterion("WSNS not in", values, "WSNS");
            return (Criteria) this;
        }

        public Criteria andWSNSBetween(Integer value1, Integer value2) {
            addCriterion("WSNS between", value1, value2, "WSNS");
            return (Criteria) this;
        }

        public Criteria andWSNSNotBetween(Integer value1, Integer value2) {
            addCriterion("WSNS not between", value1, value2, "WSNS");
            return (Criteria) this;
        }

        public Criteria andLSZZZHIsNull() {
            addCriterion("LSZZZH is null");
            return (Criteria) this;
        }

        public Criteria andLSZZZHIsNotNull() {
            addCriterion("LSZZZH is not null");
            return (Criteria) this;
        }

        public Criteria andLSZZZHEqualTo(String value) {
            addCriterion("LSZZZH =", value, "LSZZZH");
            return (Criteria) this;
        }

        public Criteria andLSZZZHNotEqualTo(String value) {
            addCriterion("LSZZZH <>", value, "LSZZZH");
            return (Criteria) this;
        }

        public Criteria andLSZZZHGreaterThan(String value) {
            addCriterion("LSZZZH >", value, "LSZZZH");
            return (Criteria) this;
        }

        public Criteria andLSZZZHGreaterThanOrEqualTo(String value) {
            addCriterion("LSZZZH >=", value, "LSZZZH");
            return (Criteria) this;
        }

        public Criteria andLSZZZHLessThan(String value) {
            addCriterion("LSZZZH <", value, "LSZZZH");
            return (Criteria) this;
        }

        public Criteria andLSZZZHLessThanOrEqualTo(String value) {
            addCriterion("LSZZZH <=", value, "LSZZZH");
            return (Criteria) this;
        }

        public Criteria andLSZZZHLike(String value) {
            addCriterion("LSZZZH like", value, "LSZZZH");
            return (Criteria) this;
        }

        public Criteria andLSZZZHNotLike(String value) {
            addCriterion("LSZZZH not like", value, "LSZZZH");
            return (Criteria) this;
        }

        public Criteria andLSZZZHIn(List<String> values) {
            addCriterion("LSZZZH in", values, "LSZZZH");
            return (Criteria) this;
        }

        public Criteria andLSZZZHNotIn(List<String> values) {
            addCriterion("LSZZZH not in", values, "LSZZZH");
            return (Criteria) this;
        }

        public Criteria andLSZZZHBetween(String value1, String value2) {
            addCriterion("LSZZZH between", value1, value2, "LSZZZH");
            return (Criteria) this;
        }

        public Criteria andLSZZZHNotBetween(String value1, String value2) {
            addCriterion("LSZZZH not between", value1, value2, "LSZZZH");
            return (Criteria) this;
        }

        public Criteria andZYZGIsNull() {
            addCriterion("ZYZG is null");
            return (Criteria) this;
        }

        public Criteria andZYZGIsNotNull() {
            addCriterion("ZYZG is not null");
            return (Criteria) this;
        }

        public Criteria andZYZGEqualTo(String value) {
            addCriterion("ZYZG =", value, "ZYZG");
            return (Criteria) this;
        }

        public Criteria andZYZGNotEqualTo(String value) {
            addCriterion("ZYZG <>", value, "ZYZG");
            return (Criteria) this;
        }

        public Criteria andZYZGGreaterThan(String value) {
            addCriterion("ZYZG >", value, "ZYZG");
            return (Criteria) this;
        }

        public Criteria andZYZGGreaterThanOrEqualTo(String value) {
            addCriterion("ZYZG >=", value, "ZYZG");
            return (Criteria) this;
        }

        public Criteria andZYZGLessThan(String value) {
            addCriterion("ZYZG <", value, "ZYZG");
            return (Criteria) this;
        }

        public Criteria andZYZGLessThanOrEqualTo(String value) {
            addCriterion("ZYZG <=", value, "ZYZG");
            return (Criteria) this;
        }

        public Criteria andZYZGLike(String value) {
            addCriterion("ZYZG like", value, "ZYZG");
            return (Criteria) this;
        }

        public Criteria andZYZGNotLike(String value) {
            addCriterion("ZYZG not like", value, "ZYZG");
            return (Criteria) this;
        }

        public Criteria andZYZGIn(List<String> values) {
            addCriterion("ZYZG in", values, "ZYZG");
            return (Criteria) this;
        }

        public Criteria andZYZGNotIn(List<String> values) {
            addCriterion("ZYZG not in", values, "ZYZG");
            return (Criteria) this;
        }

        public Criteria andZYZGBetween(String value1, String value2) {
            addCriterion("ZYZG between", value1, value2, "ZYZG");
            return (Criteria) this;
        }

        public Criteria andZYZGNotBetween(String value1, String value2) {
            addCriterion("ZYZG not between", value1, value2, "ZYZG");
            return (Criteria) this;
        }

        public Criteria andZCIsNull() {
            addCriterion("ZC is null");
            return (Criteria) this;
        }

        public Criteria andZCIsNotNull() {
            addCriterion("ZC is not null");
            return (Criteria) this;
        }

        public Criteria andZCEqualTo(String value) {
            addCriterion("ZC =", value, "ZC");
            return (Criteria) this;
        }

        public Criteria andZCNotEqualTo(String value) {
            addCriterion("ZC <>", value, "ZC");
            return (Criteria) this;
        }

        public Criteria andZCGreaterThan(String value) {
            addCriterion("ZC >", value, "ZC");
            return (Criteria) this;
        }

        public Criteria andZCGreaterThanOrEqualTo(String value) {
            addCriterion("ZC >=", value, "ZC");
            return (Criteria) this;
        }

        public Criteria andZCLessThan(String value) {
            addCriterion("ZC <", value, "ZC");
            return (Criteria) this;
        }

        public Criteria andZCLessThanOrEqualTo(String value) {
            addCriterion("ZC <=", value, "ZC");
            return (Criteria) this;
        }

        public Criteria andZCLike(String value) {
            addCriterion("ZC like", value, "ZC");
            return (Criteria) this;
        }

        public Criteria andZCNotLike(String value) {
            addCriterion("ZC not like", value, "ZC");
            return (Criteria) this;
        }

        public Criteria andZCIn(List<String> values) {
            addCriterion("ZC in", values, "ZC");
            return (Criteria) this;
        }

        public Criteria andZCNotIn(List<String> values) {
            addCriterion("ZC not in", values, "ZC");
            return (Criteria) this;
        }

        public Criteria andZCBetween(String value1, String value2) {
            addCriterion("ZC between", value1, value2, "ZC");
            return (Criteria) this;
        }

        public Criteria andZCNotBetween(String value1, String value2) {
            addCriterion("ZC not between", value1, value2, "ZC");
            return (Criteria) this;
        }

        public Criteria andBYSJIsNull() {
            addCriterion("BYSJ is null");
            return (Criteria) this;
        }

        public Criteria andBYSJIsNotNull() {
            addCriterion("BYSJ is not null");
            return (Criteria) this;
        }

        public Criteria andBYSJEqualTo(Date value) {
            addCriterion("BYSJ =", value, "BYSJ");
            return (Criteria) this;
        }

        public Criteria andBYSJNotEqualTo(Date value) {
            addCriterion("BYSJ <>", value, "BYSJ");
            return (Criteria) this;
        }

        public Criteria andBYSJGreaterThan(Date value) {
            addCriterion("BYSJ >", value, "BYSJ");
            return (Criteria) this;
        }

        public Criteria andBYSJGreaterThanOrEqualTo(Date value) {
            addCriterion("BYSJ >=", value, "BYSJ");
            return (Criteria) this;
        }

        public Criteria andBYSJLessThan(Date value) {
            addCriterion("BYSJ <", value, "BYSJ");
            return (Criteria) this;
        }

        public Criteria andBYSJLessThanOrEqualTo(Date value) {
            addCriterion("BYSJ <=", value, "BYSJ");
            return (Criteria) this;
        }

        public Criteria andBYSJIn(List<Date> values) {
            addCriterion("BYSJ in", values, "BYSJ");
            return (Criteria) this;
        }

        public Criteria andBYSJNotIn(List<Date> values) {
            addCriterion("BYSJ not in", values, "BYSJ");
            return (Criteria) this;
        }

        public Criteria andBYSJBetween(Date value1, Date value2) {
            addCriterion("BYSJ between", value1, value2, "BYSJ");
            return (Criteria) this;
        }

        public Criteria andBYSJNotBetween(Date value1, Date value2) {
            addCriterion("BYSJ not between", value1, value2, "BYSJ");
            return (Criteria) this;
        }

        public Criteria andLRHCFWIsNull() {
            addCriterion("LRHCFW is null");
            return (Criteria) this;
        }

        public Criteria andLRHCFWIsNotNull() {
            addCriterion("LRHCFW is not null");
            return (Criteria) this;
        }

        public Criteria andLRHCFWEqualTo(Short value) {
            addCriterion("LRHCFW =", value, "LRHCFW");
            return (Criteria) this;
        }

        public Criteria andLRHCFWNotEqualTo(Short value) {
            addCriterion("LRHCFW <>", value, "LRHCFW");
            return (Criteria) this;
        }

        public Criteria andLRHCFWGreaterThan(Short value) {
            addCriterion("LRHCFW >", value, "LRHCFW");
            return (Criteria) this;
        }

        public Criteria andLRHCFWGreaterThanOrEqualTo(Short value) {
            addCriterion("LRHCFW >=", value, "LRHCFW");
            return (Criteria) this;
        }

        public Criteria andLRHCFWLessThan(Short value) {
            addCriterion("LRHCFW <", value, "LRHCFW");
            return (Criteria) this;
        }

        public Criteria andLRHCFWLessThanOrEqualTo(Short value) {
            addCriterion("LRHCFW <=", value, "LRHCFW");
            return (Criteria) this;
        }

        public Criteria andLRHCFWIn(List<Short> values) {
            addCriterion("LRHCFW in", values, "LRHCFW");
            return (Criteria) this;
        }

        public Criteria andLRHCFWNotIn(List<Short> values) {
            addCriterion("LRHCFW not in", values, "LRHCFW");
            return (Criteria) this;
        }

        public Criteria andLRHCFWBetween(Short value1, Short value2) {
            addCriterion("LRHCFW between", value1, value2, "LRHCFW");
            return (Criteria) this;
        }

        public Criteria andLRHCFWNotBetween(Short value1, Short value2) {
            addCriterion("LRHCFW not between", value1, value2, "LRHCFW");
            return (Criteria) this;
        }

        public Criteria andSFXZGFIsNull() {
            addCriterion("SFXZGF is null");
            return (Criteria) this;
        }

        public Criteria andSFXZGFIsNotNull() {
            addCriterion("SFXZGF is not null");
            return (Criteria) this;
        }

        public Criteria andSFXZGFEqualTo(Short value) {
            addCriterion("SFXZGF =", value, "SFXZGF");
            return (Criteria) this;
        }

        public Criteria andSFXZGFNotEqualTo(Short value) {
            addCriterion("SFXZGF <>", value, "SFXZGF");
            return (Criteria) this;
        }

        public Criteria andSFXZGFGreaterThan(Short value) {
            addCriterion("SFXZGF >", value, "SFXZGF");
            return (Criteria) this;
        }

        public Criteria andSFXZGFGreaterThanOrEqualTo(Short value) {
            addCriterion("SFXZGF >=", value, "SFXZGF");
            return (Criteria) this;
        }

        public Criteria andSFXZGFLessThan(Short value) {
            addCriterion("SFXZGF <", value, "SFXZGF");
            return (Criteria) this;
        }

        public Criteria andSFXZGFLessThanOrEqualTo(Short value) {
            addCriterion("SFXZGF <=", value, "SFXZGF");
            return (Criteria) this;
        }

        public Criteria andSFXZGFIn(List<Short> values) {
            addCriterion("SFXZGF in", values, "SFXZGF");
            return (Criteria) this;
        }

        public Criteria andSFXZGFNotIn(List<Short> values) {
            addCriterion("SFXZGF not in", values, "SFXZGF");
            return (Criteria) this;
        }

        public Criteria andSFXZGFBetween(Short value1, Short value2) {
            addCriterion("SFXZGF between", value1, value2, "SFXZGF");
            return (Criteria) this;
        }

        public Criteria andSFXZGFNotBetween(Short value1, Short value2) {
            addCriterion("SFXZGF not between", value1, value2, "SFXZGF");
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

        public Criteria andSFGTSQRIsNull() {
            addCriterion("SFGTSQR is null");
            return (Criteria) this;
        }

        public Criteria andSFGTSQRIsNotNull() {
            addCriterion("SFGTSQR is not null");
            return (Criteria) this;
        }

        public Criteria andSFGTSQREqualTo(Short value) {
            addCriterion("SFGTSQR =", value, "SFGTSQR");
            return (Criteria) this;
        }

        public Criteria andSFGTSQRNotEqualTo(Short value) {
            addCriterion("SFGTSQR <>", value, "SFGTSQR");
            return (Criteria) this;
        }

        public Criteria andSFGTSQRGreaterThan(Short value) {
            addCriterion("SFGTSQR >", value, "SFGTSQR");
            return (Criteria) this;
        }

        public Criteria andSFGTSQRGreaterThanOrEqualTo(Short value) {
            addCriterion("SFGTSQR >=", value, "SFGTSQR");
            return (Criteria) this;
        }

        public Criteria andSFGTSQRLessThan(Short value) {
            addCriterion("SFGTSQR <", value, "SFGTSQR");
            return (Criteria) this;
        }

        public Criteria andSFGTSQRLessThanOrEqualTo(Short value) {
            addCriterion("SFGTSQR <=", value, "SFGTSQR");
            return (Criteria) this;
        }

        public Criteria andSFGTSQRIn(List<Short> values) {
            addCriterion("SFGTSQR in", values, "SFGTSQR");
            return (Criteria) this;
        }

        public Criteria andSFGTSQRNotIn(List<Short> values) {
            addCriterion("SFGTSQR not in", values, "SFGTSQR");
            return (Criteria) this;
        }

        public Criteria andSFGTSQRBetween(Short value1, Short value2) {
            addCriterion("SFGTSQR between", value1, value2, "SFGTSQR");
            return (Criteria) this;
        }

        public Criteria andSFGTSQRNotBetween(Short value1, Short value2) {
            addCriterion("SFGTSQR not between", value1, value2, "SFGTSQR");
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
