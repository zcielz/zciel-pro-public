package cn.zciel.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TpgGzffyxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public TpgGzffyxxExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(Long value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(Long value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(Long value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(Long value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(Long value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<Long> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<Long> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(Long value1, Long value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(Long value1, Long value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andFwcodeIsNull() {
            addCriterion("fwcode is null");
            return (Criteria) this;
        }

        public Criteria andFwcodeIsNotNull() {
            addCriterion("fwcode is not null");
            return (Criteria) this;
        }

        public Criteria andFwcodeEqualTo(Long value) {
            addCriterion("fwcode =", value, "fwcode");
            return (Criteria) this;
        }

        public Criteria andFwcodeNotEqualTo(Long value) {
            addCriterion("fwcode <>", value, "fwcode");
            return (Criteria) this;
        }

        public Criteria andFwcodeGreaterThan(Long value) {
            addCriterion("fwcode >", value, "fwcode");
            return (Criteria) this;
        }

        public Criteria andFwcodeGreaterThanOrEqualTo(Long value) {
            addCriterion("fwcode >=", value, "fwcode");
            return (Criteria) this;
        }

        public Criteria andFwcodeLessThan(Long value) {
            addCriterion("fwcode <", value, "fwcode");
            return (Criteria) this;
        }

        public Criteria andFwcodeLessThanOrEqualTo(Long value) {
            addCriterion("fwcode <=", value, "fwcode");
            return (Criteria) this;
        }

        public Criteria andFwcodeIn(List<Long> values) {
            addCriterion("fwcode in", values, "fwcode");
            return (Criteria) this;
        }

        public Criteria andFwcodeNotIn(List<Long> values) {
            addCriterion("fwcode not in", values, "fwcode");
            return (Criteria) this;
        }

        public Criteria andFwcodeBetween(Long value1, Long value2) {
            addCriterion("fwcode between", value1, value2, "fwcode");
            return (Criteria) this;
        }

        public Criteria andFwcodeNotBetween(Long value1, Long value2) {
            addCriterion("fwcode not between", value1, value2, "fwcode");
            return (Criteria) this;
        }

        public Criteria andFwidIsNull() {
            addCriterion("fwid is null");
            return (Criteria) this;
        }

        public Criteria andFwidIsNotNull() {
            addCriterion("fwid is not null");
            return (Criteria) this;
        }

        public Criteria andFwidEqualTo(Long value) {
            addCriterion("fwid =", value, "fwid");
            return (Criteria) this;
        }

        public Criteria andFwidNotEqualTo(Long value) {
            addCriterion("fwid <>", value, "fwid");
            return (Criteria) this;
        }

        public Criteria andFwidGreaterThan(Long value) {
            addCriterion("fwid >", value, "fwid");
            return (Criteria) this;
        }

        public Criteria andFwidGreaterThanOrEqualTo(Long value) {
            addCriterion("fwid >=", value, "fwid");
            return (Criteria) this;
        }

        public Criteria andFwidLessThan(Long value) {
            addCriterion("fwid <", value, "fwid");
            return (Criteria) this;
        }

        public Criteria andFwidLessThanOrEqualTo(Long value) {
            addCriterion("fwid <=", value, "fwid");
            return (Criteria) this;
        }

        public Criteria andFwidIn(List<Long> values) {
            addCriterion("fwid in", values, "fwid");
            return (Criteria) this;
        }

        public Criteria andFwidNotIn(List<Long> values) {
            addCriterion("fwid not in", values, "fwid");
            return (Criteria) this;
        }

        public Criteria andFwidBetween(Long value1, Long value2) {
            addCriterion("fwid between", value1, value2, "fwid");
            return (Criteria) this;
        }

        public Criteria andFwidNotBetween(Long value1, Long value2) {
            addCriterion("fwid not between", value1, value2, "fwid");
            return (Criteria) this;
        }

        public Criteria andZrzidIsNull() {
            addCriterion("zrzid is null");
            return (Criteria) this;
        }

        public Criteria andZrzidIsNotNull() {
            addCriterion("zrzid is not null");
            return (Criteria) this;
        }

        public Criteria andZrzidEqualTo(Long value) {
            addCriterion("zrzid =", value, "zrzid");
            return (Criteria) this;
        }

        public Criteria andZrzidNotEqualTo(Long value) {
            addCriterion("zrzid <>", value, "zrzid");
            return (Criteria) this;
        }

        public Criteria andZrzidGreaterThan(Long value) {
            addCriterion("zrzid >", value, "zrzid");
            return (Criteria) this;
        }

        public Criteria andZrzidGreaterThanOrEqualTo(Long value) {
            addCriterion("zrzid >=", value, "zrzid");
            return (Criteria) this;
        }

        public Criteria andZrzidLessThan(Long value) {
            addCriterion("zrzid <", value, "zrzid");
            return (Criteria) this;
        }

        public Criteria andZrzidLessThanOrEqualTo(Long value) {
            addCriterion("zrzid <=", value, "zrzid");
            return (Criteria) this;
        }

        public Criteria andZrzidIn(List<Long> values) {
            addCriterion("zrzid in", values, "zrzid");
            return (Criteria) this;
        }

        public Criteria andZrzidNotIn(List<Long> values) {
            addCriterion("zrzid not in", values, "zrzid");
            return (Criteria) this;
        }

        public Criteria andZrzidBetween(Long value1, Long value2) {
            addCriterion("zrzid between", value1, value2, "zrzid");
            return (Criteria) this;
        }

        public Criteria andZrzidNotBetween(Long value1, Long value2) {
            addCriterion("zrzid not between", value1, value2, "zrzid");
            return (Criteria) this;
        }

        public Criteria andZrzcodeIsNull() {
            addCriterion("zrzcode is null");
            return (Criteria) this;
        }

        public Criteria andZrzcodeIsNotNull() {
            addCriterion("zrzcode is not null");
            return (Criteria) this;
        }

        public Criteria andZrzcodeEqualTo(Long value) {
            addCriterion("zrzcode =", value, "zrzcode");
            return (Criteria) this;
        }

        public Criteria andZrzcodeNotEqualTo(Long value) {
            addCriterion("zrzcode <>", value, "zrzcode");
            return (Criteria) this;
        }

        public Criteria andZrzcodeGreaterThan(Long value) {
            addCriterion("zrzcode >", value, "zrzcode");
            return (Criteria) this;
        }

        public Criteria andZrzcodeGreaterThanOrEqualTo(Long value) {
            addCriterion("zrzcode >=", value, "zrzcode");
            return (Criteria) this;
        }

        public Criteria andZrzcodeLessThan(Long value) {
            addCriterion("zrzcode <", value, "zrzcode");
            return (Criteria) this;
        }

        public Criteria andZrzcodeLessThanOrEqualTo(Long value) {
            addCriterion("zrzcode <=", value, "zrzcode");
            return (Criteria) this;
        }

        public Criteria andZrzcodeIn(List<Long> values) {
            addCriterion("zrzcode in", values, "zrzcode");
            return (Criteria) this;
        }

        public Criteria andZrzcodeNotIn(List<Long> values) {
            addCriterion("zrzcode not in", values, "zrzcode");
            return (Criteria) this;
        }

        public Criteria andZrzcodeBetween(Long value1, Long value2) {
            addCriterion("zrzcode between", value1, value2, "zrzcode");
            return (Criteria) this;
        }

        public Criteria andZrzcodeNotBetween(Long value1, Long value2) {
            addCriterion("zrzcode not between", value1, value2, "zrzcode");
            return (Criteria) this;
        }

        public Criteria andFwzlIsNull() {
            addCriterion("fwzl is null");
            return (Criteria) this;
        }

        public Criteria andFwzlIsNotNull() {
            addCriterion("fwzl is not null");
            return (Criteria) this;
        }

        public Criteria andFwzlEqualTo(String value) {
            addCriterion("fwzl =", value, "fwzl");
            return (Criteria) this;
        }

        public Criteria andFwzlNotEqualTo(String value) {
            addCriterion("fwzl <>", value, "fwzl");
            return (Criteria) this;
        }

        public Criteria andFwzlGreaterThan(String value) {
            addCriterion("fwzl >", value, "fwzl");
            return (Criteria) this;
        }

        public Criteria andFwzlGreaterThanOrEqualTo(String value) {
            addCriterion("fwzl >=", value, "fwzl");
            return (Criteria) this;
        }

        public Criteria andFwzlLessThan(String value) {
            addCriterion("fwzl <", value, "fwzl");
            return (Criteria) this;
        }

        public Criteria andFwzlLessThanOrEqualTo(String value) {
            addCriterion("fwzl <=", value, "fwzl");
            return (Criteria) this;
        }

        public Criteria andFwzlLike(String value) {
            addCriterion("fwzl like", value, "fwzl");
            return (Criteria) this;
        }

        public Criteria andFwzlNotLike(String value) {
            addCriterion("fwzl not like", value, "fwzl");
            return (Criteria) this;
        }

        public Criteria andFwzlIn(List<String> values) {
            addCriterion("fwzl in", values, "fwzl");
            return (Criteria) this;
        }

        public Criteria andFwzlNotIn(List<String> values) {
            addCriterion("fwzl not in", values, "fwzl");
            return (Criteria) this;
        }

        public Criteria andFwzlBetween(String value1, String value2) {
            addCriterion("fwzl between", value1, value2, "fwzl");
            return (Criteria) this;
        }

        public Criteria andFwzlNotBetween(String value1, String value2) {
            addCriterion("fwzl not between", value1, value2, "fwzl");
            return (Criteria) this;
        }

        public Criteria andFwxzIsNull() {
            addCriterion("fwxz is null");
            return (Criteria) this;
        }

        public Criteria andFwxzIsNotNull() {
            addCriterion("fwxz is not null");
            return (Criteria) this;
        }

        public Criteria andFwxzEqualTo(Integer value) {
            addCriterion("fwxz =", value, "fwxz");
            return (Criteria) this;
        }

        public Criteria andFwxzNotEqualTo(Integer value) {
            addCriterion("fwxz <>", value, "fwxz");
            return (Criteria) this;
        }

        public Criteria andFwxzGreaterThan(Integer value) {
            addCriterion("fwxz >", value, "fwxz");
            return (Criteria) this;
        }

        public Criteria andFwxzGreaterThanOrEqualTo(Integer value) {
            addCriterion("fwxz >=", value, "fwxz");
            return (Criteria) this;
        }

        public Criteria andFwxzLessThan(Integer value) {
            addCriterion("fwxz <", value, "fwxz");
            return (Criteria) this;
        }

        public Criteria andFwxzLessThanOrEqualTo(Integer value) {
            addCriterion("fwxz <=", value, "fwxz");
            return (Criteria) this;
        }

        public Criteria andFwxzIn(List<Integer> values) {
            addCriterion("fwxz in", values, "fwxz");
            return (Criteria) this;
        }

        public Criteria andFwxzNotIn(List<Integer> values) {
            addCriterion("fwxz not in", values, "fwxz");
            return (Criteria) this;
        }

        public Criteria andFwxzBetween(Integer value1, Integer value2) {
            addCriterion("fwxz between", value1, value2, "fwxz");
            return (Criteria) this;
        }

        public Criteria andFwxzNotBetween(Integer value1, Integer value2) {
            addCriterion("fwxz not between", value1, value2, "fwxz");
            return (Criteria) this;
        }

        public Criteria andTddjIsNull() {
            addCriterion("tddj is null");
            return (Criteria) this;
        }

        public Criteria andTddjIsNotNull() {
            addCriterion("tddj is not null");
            return (Criteria) this;
        }

        public Criteria andTddjEqualTo(Integer value) {
            addCriterion("tddj =", value, "tddj");
            return (Criteria) this;
        }

        public Criteria andTddjNotEqualTo(Integer value) {
            addCriterion("tddj <>", value, "tddj");
            return (Criteria) this;
        }

        public Criteria andTddjGreaterThan(Integer value) {
            addCriterion("tddj >", value, "tddj");
            return (Criteria) this;
        }

        public Criteria andTddjGreaterThanOrEqualTo(Integer value) {
            addCriterion("tddj >=", value, "tddj");
            return (Criteria) this;
        }

        public Criteria andTddjLessThan(Integer value) {
            addCriterion("tddj <", value, "tddj");
            return (Criteria) this;
        }

        public Criteria andTddjLessThanOrEqualTo(Integer value) {
            addCriterion("tddj <=", value, "tddj");
            return (Criteria) this;
        }

        public Criteria andTddjIn(List<Integer> values) {
            addCriterion("tddj in", values, "tddj");
            return (Criteria) this;
        }

        public Criteria andTddjNotIn(List<Integer> values) {
            addCriterion("tddj not in", values, "tddj");
            return (Criteria) this;
        }

        public Criteria andTddjBetween(Integer value1, Integer value2) {
            addCriterion("tddj between", value1, value2, "tddj");
            return (Criteria) this;
        }

        public Criteria andTddjNotBetween(Integer value1, Integer value2) {
            addCriterion("tddj not between", value1, value2, "tddj");
            return (Criteria) this;
        }

        public Criteria andDhIsNull() {
            addCriterion("dh is null");
            return (Criteria) this;
        }

        public Criteria andDhIsNotNull() {
            addCriterion("dh is not null");
            return (Criteria) this;
        }

        public Criteria andDhEqualTo(String value) {
            addCriterion("dh =", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotEqualTo(String value) {
            addCriterion("dh <>", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhGreaterThan(String value) {
            addCriterion("dh >", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhGreaterThanOrEqualTo(String value) {
            addCriterion("dh >=", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhLessThan(String value) {
            addCriterion("dh <", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhLessThanOrEqualTo(String value) {
            addCriterion("dh <=", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhLike(String value) {
            addCriterion("dh like", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotLike(String value) {
            addCriterion("dh not like", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhIn(List<String> values) {
            addCriterion("dh in", values, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotIn(List<String> values) {
            addCriterion("dh not in", values, "dh");
            return (Criteria) this;
        }

        public Criteria andDhBetween(String value1, String value2) {
            addCriterion("dh between", value1, value2, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotBetween(String value1, String value2) {
            addCriterion("dh not between", value1, value2, "dh");
            return (Criteria) this;
        }

        public Criteria andCqzhIsNull() {
            addCriterion("cqzh is null");
            return (Criteria) this;
        }

        public Criteria andCqzhIsNotNull() {
            addCriterion("cqzh is not null");
            return (Criteria) this;
        }

        public Criteria andCqzhEqualTo(String value) {
            addCriterion("cqzh =", value, "cqzh");
            return (Criteria) this;
        }

        public Criteria andCqzhNotEqualTo(String value) {
            addCriterion("cqzh <>", value, "cqzh");
            return (Criteria) this;
        }

        public Criteria andCqzhGreaterThan(String value) {
            addCriterion("cqzh >", value, "cqzh");
            return (Criteria) this;
        }

        public Criteria andCqzhGreaterThanOrEqualTo(String value) {
            addCriterion("cqzh >=", value, "cqzh");
            return (Criteria) this;
        }

        public Criteria andCqzhLessThan(String value) {
            addCriterion("cqzh <", value, "cqzh");
            return (Criteria) this;
        }

        public Criteria andCqzhLessThanOrEqualTo(String value) {
            addCriterion("cqzh <=", value, "cqzh");
            return (Criteria) this;
        }

        public Criteria andCqzhLike(String value) {
            addCriterion("cqzh like", value, "cqzh");
            return (Criteria) this;
        }

        public Criteria andCqzhNotLike(String value) {
            addCriterion("cqzh not like", value, "cqzh");
            return (Criteria) this;
        }

        public Criteria andCqzhIn(List<String> values) {
            addCriterion("cqzh in", values, "cqzh");
            return (Criteria) this;
        }

        public Criteria andCqzhNotIn(List<String> values) {
            addCriterion("cqzh not in", values, "cqzh");
            return (Criteria) this;
        }

        public Criteria andCqzhBetween(String value1, String value2) {
            addCriterion("cqzh between", value1, value2, "cqzh");
            return (Criteria) this;
        }

        public Criteria andCqzhNotBetween(String value1, String value2) {
            addCriterion("cqzh not between", value1, value2, "cqzh");
            return (Criteria) this;
        }

        public Criteria andCqdwIsNull() {
            addCriterion("cqdw is null");
            return (Criteria) this;
        }

        public Criteria andCqdwIsNotNull() {
            addCriterion("cqdw is not null");
            return (Criteria) this;
        }

        public Criteria andCqdwEqualTo(Long value) {
            addCriterion("cqdw =", value, "cqdw");
            return (Criteria) this;
        }

        public Criteria andCqdwNotEqualTo(Long value) {
            addCriterion("cqdw <>", value, "cqdw");
            return (Criteria) this;
        }

        public Criteria andCqdwGreaterThan(Long value) {
            addCriterion("cqdw >", value, "cqdw");
            return (Criteria) this;
        }

        public Criteria andCqdwGreaterThanOrEqualTo(Long value) {
            addCriterion("cqdw >=", value, "cqdw");
            return (Criteria) this;
        }

        public Criteria andCqdwLessThan(Long value) {
            addCriterion("cqdw <", value, "cqdw");
            return (Criteria) this;
        }

        public Criteria andCqdwLessThanOrEqualTo(Long value) {
            addCriterion("cqdw <=", value, "cqdw");
            return (Criteria) this;
        }

        public Criteria andCqdwIn(List<Long> values) {
            addCriterion("cqdw in", values, "cqdw");
            return (Criteria) this;
        }

        public Criteria andCqdwNotIn(List<Long> values) {
            addCriterion("cqdw not in", values, "cqdw");
            return (Criteria) this;
        }

        public Criteria andCqdwBetween(Long value1, Long value2) {
            addCriterion("cqdw between", value1, value2, "cqdw");
            return (Criteria) this;
        }

        public Criteria andCqdwNotBetween(Long value1, Long value2) {
            addCriterion("cqdw not between", value1, value2, "cqdw");
            return (Criteria) this;
        }

        public Criteria andSfctIsNull() {
            addCriterion("sfct is null");
            return (Criteria) this;
        }

        public Criteria andSfctIsNotNull() {
            addCriterion("sfct is not null");
            return (Criteria) this;
        }

        public Criteria andSfctEqualTo(Short value) {
            addCriterion("sfct =", value, "sfct");
            return (Criteria) this;
        }

        public Criteria andSfctNotEqualTo(Short value) {
            addCriterion("sfct <>", value, "sfct");
            return (Criteria) this;
        }

        public Criteria andSfctGreaterThan(Short value) {
            addCriterion("sfct >", value, "sfct");
            return (Criteria) this;
        }

        public Criteria andSfctGreaterThanOrEqualTo(Short value) {
            addCriterion("sfct >=", value, "sfct");
            return (Criteria) this;
        }

        public Criteria andSfctLessThan(Short value) {
            addCriterion("sfct <", value, "sfct");
            return (Criteria) this;
        }

        public Criteria andSfctLessThanOrEqualTo(Short value) {
            addCriterion("sfct <=", value, "sfct");
            return (Criteria) this;
        }

        public Criteria andSfctIn(List<Short> values) {
            addCriterion("sfct in", values, "sfct");
            return (Criteria) this;
        }

        public Criteria andSfctNotIn(List<Short> values) {
            addCriterion("sfct not in", values, "sfct");
            return (Criteria) this;
        }

        public Criteria andSfctBetween(Short value1, Short value2) {
            addCriterion("sfct between", value1, value2, "sfct");
            return (Criteria) this;
        }

        public Criteria andSfctNotBetween(Short value1, Short value2) {
            addCriterion("sfct not between", value1, value2, "sfct");
            return (Criteria) this;
        }

        public Criteria andZcsIsNull() {
            addCriterion("zcs is null");
            return (Criteria) this;
        }

        public Criteria andZcsIsNotNull() {
            addCriterion("zcs is not null");
            return (Criteria) this;
        }

        public Criteria andZcsEqualTo(Short value) {
            addCriterion("zcs =", value, "zcs");
            return (Criteria) this;
        }

        public Criteria andZcsNotEqualTo(Short value) {
            addCriterion("zcs <>", value, "zcs");
            return (Criteria) this;
        }

        public Criteria andZcsGreaterThan(Short value) {
            addCriterion("zcs >", value, "zcs");
            return (Criteria) this;
        }

        public Criteria andZcsGreaterThanOrEqualTo(Short value) {
            addCriterion("zcs >=", value, "zcs");
            return (Criteria) this;
        }

        public Criteria andZcsLessThan(Short value) {
            addCriterion("zcs <", value, "zcs");
            return (Criteria) this;
        }

        public Criteria andZcsLessThanOrEqualTo(Short value) {
            addCriterion("zcs <=", value, "zcs");
            return (Criteria) this;
        }

        public Criteria andZcsIn(List<Short> values) {
            addCriterion("zcs in", values, "zcs");
            return (Criteria) this;
        }

        public Criteria andZcsNotIn(List<Short> values) {
            addCriterion("zcs not in", values, "zcs");
            return (Criteria) this;
        }

        public Criteria andZcsBetween(Short value1, Short value2) {
            addCriterion("zcs between", value1, value2, "zcs");
            return (Criteria) this;
        }

        public Criteria andZcsNotBetween(Short value1, Short value2) {
            addCriterion("zcs not between", value1, value2, "zcs");
            return (Criteria) this;
        }

        public Criteria andSzcsIsNull() {
            addCriterion("szcs is null");
            return (Criteria) this;
        }

        public Criteria andSzcsIsNotNull() {
            addCriterion("szcs is not null");
            return (Criteria) this;
        }

        public Criteria andSzcsEqualTo(String value) {
            addCriterion("szcs =", value, "szcs");
            return (Criteria) this;
        }

        public Criteria andSzcsNotEqualTo(String value) {
            addCriterion("szcs <>", value, "szcs");
            return (Criteria) this;
        }

        public Criteria andSzcsGreaterThan(String value) {
            addCriterion("szcs >", value, "szcs");
            return (Criteria) this;
        }

        public Criteria andSzcsGreaterThanOrEqualTo(String value) {
            addCriterion("szcs >=", value, "szcs");
            return (Criteria) this;
        }

        public Criteria andSzcsLessThan(String value) {
            addCriterion("szcs <", value, "szcs");
            return (Criteria) this;
        }

        public Criteria andSzcsLessThanOrEqualTo(String value) {
            addCriterion("szcs <=", value, "szcs");
            return (Criteria) this;
        }

        public Criteria andSzcsLike(String value) {
            addCriterion("szcs like", value, "szcs");
            return (Criteria) this;
        }

        public Criteria andSzcsNotLike(String value) {
            addCriterion("szcs not like", value, "szcs");
            return (Criteria) this;
        }

        public Criteria andSzcsIn(List<String> values) {
            addCriterion("szcs in", values, "szcs");
            return (Criteria) this;
        }

        public Criteria andSzcsNotIn(List<String> values) {
            addCriterion("szcs not in", values, "szcs");
            return (Criteria) this;
        }

        public Criteria andSzcsBetween(String value1, String value2) {
            addCriterion("szcs between", value1, value2, "szcs");
            return (Criteria) this;
        }

        public Criteria andSzcsNotBetween(String value1, String value2) {
            addCriterion("szcs not between", value1, value2, "szcs");
            return (Criteria) this;
        }

        public Criteria andFwjgIsNull() {
            addCriterion("fwjg is null");
            return (Criteria) this;
        }

        public Criteria andFwjgIsNotNull() {
            addCriterion("fwjg is not null");
            return (Criteria) this;
        }

        public Criteria andFwjgEqualTo(Integer value) {
            addCriterion("fwjg =", value, "fwjg");
            return (Criteria) this;
        }

        public Criteria andFwjgNotEqualTo(Integer value) {
            addCriterion("fwjg <>", value, "fwjg");
            return (Criteria) this;
        }

        public Criteria andFwjgGreaterThan(Integer value) {
            addCriterion("fwjg >", value, "fwjg");
            return (Criteria) this;
        }

        public Criteria andFwjgGreaterThanOrEqualTo(Integer value) {
            addCriterion("fwjg >=", value, "fwjg");
            return (Criteria) this;
        }

        public Criteria andFwjgLessThan(Integer value) {
            addCriterion("fwjg <", value, "fwjg");
            return (Criteria) this;
        }

        public Criteria andFwjgLessThanOrEqualTo(Integer value) {
            addCriterion("fwjg <=", value, "fwjg");
            return (Criteria) this;
        }

        public Criteria andFwjgIn(List<Integer> values) {
            addCriterion("fwjg in", values, "fwjg");
            return (Criteria) this;
        }

        public Criteria andFwjgNotIn(List<Integer> values) {
            addCriterion("fwjg not in", values, "fwjg");
            return (Criteria) this;
        }

        public Criteria andFwjgBetween(Integer value1, Integer value2) {
            addCriterion("fwjg between", value1, value2, "fwjg");
            return (Criteria) this;
        }

        public Criteria andFwjgNotBetween(Integer value1, Integer value2) {
            addCriterion("fwjg not between", value1, value2, "fwjg");
            return (Criteria) this;
        }

        public Criteria andJzmjIsNull() {
            addCriterion("jzmj is null");
            return (Criteria) this;
        }

        public Criteria andJzmjIsNotNull() {
            addCriterion("jzmj is not null");
            return (Criteria) this;
        }

        public Criteria andJzmjEqualTo(BigDecimal value) {
            addCriterion("jzmj =", value, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjNotEqualTo(BigDecimal value) {
            addCriterion("jzmj <>", value, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjGreaterThan(BigDecimal value) {
            addCriterion("jzmj >", value, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("jzmj >=", value, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjLessThan(BigDecimal value) {
            addCriterion("jzmj <", value, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("jzmj <=", value, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjIn(List<BigDecimal> values) {
            addCriterion("jzmj in", values, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjNotIn(List<BigDecimal> values) {
            addCriterion("jzmj not in", values, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("jzmj between", value1, value2, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("jzmj not between", value1, value2, "jzmj");
            return (Criteria) this;
        }

        public Criteria andTnggmjIsNull() {
            addCriterion("tnggmj is null");
            return (Criteria) this;
        }

        public Criteria andTnggmjIsNotNull() {
            addCriterion("tnggmj is not null");
            return (Criteria) this;
        }

        public Criteria andTnggmjEqualTo(BigDecimal value) {
            addCriterion("tnggmj =", value, "tnggmj");
            return (Criteria) this;
        }

        public Criteria andTnggmjNotEqualTo(BigDecimal value) {
            addCriterion("tnggmj <>", value, "tnggmj");
            return (Criteria) this;
        }

        public Criteria andTnggmjGreaterThan(BigDecimal value) {
            addCriterion("tnggmj >", value, "tnggmj");
            return (Criteria) this;
        }

        public Criteria andTnggmjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tnggmj >=", value, "tnggmj");
            return (Criteria) this;
        }

        public Criteria andTnggmjLessThan(BigDecimal value) {
            addCriterion("tnggmj <", value, "tnggmj");
            return (Criteria) this;
        }

        public Criteria andTnggmjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tnggmj <=", value, "tnggmj");
            return (Criteria) this;
        }

        public Criteria andTnggmjIn(List<BigDecimal> values) {
            addCriterion("tnggmj in", values, "tnggmj");
            return (Criteria) this;
        }

        public Criteria andTnggmjNotIn(List<BigDecimal> values) {
            addCriterion("tnggmj not in", values, "tnggmj");
            return (Criteria) this;
        }

        public Criteria andTnggmjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tnggmj between", value1, value2, "tnggmj");
            return (Criteria) this;
        }

        public Criteria andTnggmjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tnggmj not between", value1, value2, "tnggmj");
            return (Criteria) this;
        }

        public Criteria andFtggmjIsNull() {
            addCriterion("ftggmj is null");
            return (Criteria) this;
        }

        public Criteria andFtggmjIsNotNull() {
            addCriterion("ftggmj is not null");
            return (Criteria) this;
        }

        public Criteria andFtggmjEqualTo(BigDecimal value) {
            addCriterion("ftggmj =", value, "ftggmj");
            return (Criteria) this;
        }

        public Criteria andFtggmjNotEqualTo(BigDecimal value) {
            addCriterion("ftggmj <>", value, "ftggmj");
            return (Criteria) this;
        }

        public Criteria andFtggmjGreaterThan(BigDecimal value) {
            addCriterion("ftggmj >", value, "ftggmj");
            return (Criteria) this;
        }

        public Criteria andFtggmjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ftggmj >=", value, "ftggmj");
            return (Criteria) this;
        }

        public Criteria andFtggmjLessThan(BigDecimal value) {
            addCriterion("ftggmj <", value, "ftggmj");
            return (Criteria) this;
        }

        public Criteria andFtggmjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ftggmj <=", value, "ftggmj");
            return (Criteria) this;
        }

        public Criteria andFtggmjIn(List<BigDecimal> values) {
            addCriterion("ftggmj in", values, "ftggmj");
            return (Criteria) this;
        }

        public Criteria andFtggmjNotIn(List<BigDecimal> values) {
            addCriterion("ftggmj not in", values, "ftggmj");
            return (Criteria) this;
        }

        public Criteria andFtggmjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ftggmj between", value1, value2, "ftggmj");
            return (Criteria) this;
        }

        public Criteria andFtggmjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ftggmj not between", value1, value2, "ftggmj");
            return (Criteria) this;
        }

        public Criteria andSymjIsNull() {
            addCriterion("symj is null");
            return (Criteria) this;
        }

        public Criteria andSymjIsNotNull() {
            addCriterion("symj is not null");
            return (Criteria) this;
        }

        public Criteria andSymjEqualTo(BigDecimal value) {
            addCriterion("symj =", value, "symj");
            return (Criteria) this;
        }

        public Criteria andSymjNotEqualTo(BigDecimal value) {
            addCriterion("symj <>", value, "symj");
            return (Criteria) this;
        }

        public Criteria andSymjGreaterThan(BigDecimal value) {
            addCriterion("symj >", value, "symj");
            return (Criteria) this;
        }

        public Criteria andSymjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("symj >=", value, "symj");
            return (Criteria) this;
        }

        public Criteria andSymjLessThan(BigDecimal value) {
            addCriterion("symj <", value, "symj");
            return (Criteria) this;
        }

        public Criteria andSymjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("symj <=", value, "symj");
            return (Criteria) this;
        }

        public Criteria andSymjIn(List<BigDecimal> values) {
            addCriterion("symj in", values, "symj");
            return (Criteria) this;
        }

        public Criteria andSymjNotIn(List<BigDecimal> values) {
            addCriterion("symj not in", values, "symj");
            return (Criteria) this;
        }

        public Criteria andSymjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("symj between", value1, value2, "symj");
            return (Criteria) this;
        }

        public Criteria andSymjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("symj not between", value1, value2, "symj");
            return (Criteria) this;
        }

        public Criteria andSsmxIsNull() {
            addCriterion("ssmx is null");
            return (Criteria) this;
        }

        public Criteria andSsmxIsNotNull() {
            addCriterion("ssmx is not null");
            return (Criteria) this;
        }

        public Criteria andSsmxEqualTo(String value) {
            addCriterion("ssmx =", value, "ssmx");
            return (Criteria) this;
        }

        public Criteria andSsmxNotEqualTo(String value) {
            addCriterion("ssmx <>", value, "ssmx");
            return (Criteria) this;
        }

        public Criteria andSsmxGreaterThan(String value) {
            addCriterion("ssmx >", value, "ssmx");
            return (Criteria) this;
        }

        public Criteria andSsmxGreaterThanOrEqualTo(String value) {
            addCriterion("ssmx >=", value, "ssmx");
            return (Criteria) this;
        }

        public Criteria andSsmxLessThan(String value) {
            addCriterion("ssmx <", value, "ssmx");
            return (Criteria) this;
        }

        public Criteria andSsmxLessThanOrEqualTo(String value) {
            addCriterion("ssmx <=", value, "ssmx");
            return (Criteria) this;
        }

        public Criteria andSsmxLike(String value) {
            addCriterion("ssmx like", value, "ssmx");
            return (Criteria) this;
        }

        public Criteria andSsmxNotLike(String value) {
            addCriterion("ssmx not like", value, "ssmx");
            return (Criteria) this;
        }

        public Criteria andSsmxIn(List<String> values) {
            addCriterion("ssmx in", values, "ssmx");
            return (Criteria) this;
        }

        public Criteria andSsmxNotIn(List<String> values) {
            addCriterion("ssmx not in", values, "ssmx");
            return (Criteria) this;
        }

        public Criteria andSsmxBetween(String value1, String value2) {
            addCriterion("ssmx between", value1, value2, "ssmx");
            return (Criteria) this;
        }

        public Criteria andSsmxNotBetween(String value1, String value2) {
            addCriterion("ssmx not between", value1, value2, "ssmx");
            return (Criteria) this;
        }

        public Criteria andJgsjIsNull() {
            addCriterion("jgsj is null");
            return (Criteria) this;
        }

        public Criteria andJgsjIsNotNull() {
            addCriterion("jgsj is not null");
            return (Criteria) this;
        }

        public Criteria andJgsjEqualTo(Date value) {
            addCriterionForJDBCDate("jgsj =", value, "jgsj");
            return (Criteria) this;
        }

        public Criteria andJgsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("jgsj <>", value, "jgsj");
            return (Criteria) this;
        }

        public Criteria andJgsjGreaterThan(Date value) {
            addCriterionForJDBCDate("jgsj >", value, "jgsj");
            return (Criteria) this;
        }

        public Criteria andJgsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jgsj >=", value, "jgsj");
            return (Criteria) this;
        }

        public Criteria andJgsjLessThan(Date value) {
            addCriterionForJDBCDate("jgsj <", value, "jgsj");
            return (Criteria) this;
        }

        public Criteria andJgsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jgsj <=", value, "jgsj");
            return (Criteria) this;
        }

        public Criteria andJgsjIn(List<Date> values) {
            addCriterionForJDBCDate("jgsj in", values, "jgsj");
            return (Criteria) this;
        }

        public Criteria andJgsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("jgsj not in", values, "jgsj");
            return (Criteria) this;
        }

        public Criteria andJgsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jgsj between", value1, value2, "jgsj");
            return (Criteria) this;
        }

        public Criteria andJgsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jgsj not between", value1, value2, "jgsj");
            return (Criteria) this;
        }

        public Criteria andJssjIsNull() {
            addCriterion("jssj is null");
            return (Criteria) this;
        }

        public Criteria andJssjIsNotNull() {
            addCriterion("jssj is not null");
            return (Criteria) this;
        }

        public Criteria andJssjEqualTo(Date value) {
            addCriterionForJDBCDate("jssj =", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjNotEqualTo(Date value) {
            addCriterionForJDBCDate("jssj <>", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjGreaterThan(Date value) {
            addCriterionForJDBCDate("jssj >", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jssj >=", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjLessThan(Date value) {
            addCriterionForJDBCDate("jssj <", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jssj <=", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjIn(List<Date> values) {
            addCriterionForJDBCDate("jssj in", values, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjNotIn(List<Date> values) {
            addCriterionForJDBCDate("jssj not in", values, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jssj between", value1, value2, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jssj not between", value1, value2, "jssj");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("bz is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("bz is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("bz =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("bz <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("bz >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("bz >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("bz <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("bz <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("bz like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("bz not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("bz in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("bz not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("bz between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("bz not between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andSfkyIsNull() {
            addCriterion("sfky is null");
            return (Criteria) this;
        }

        public Criteria andSfkyIsNotNull() {
            addCriterion("sfky is not null");
            return (Criteria) this;
        }

        public Criteria andSfkyEqualTo(Short value) {
            addCriterion("sfky =", value, "sfky");
            return (Criteria) this;
        }

        public Criteria andSfkyNotEqualTo(Short value) {
            addCriterion("sfky <>", value, "sfky");
            return (Criteria) this;
        }

        public Criteria andSfkyGreaterThan(Short value) {
            addCriterion("sfky >", value, "sfky");
            return (Criteria) this;
        }

        public Criteria andSfkyGreaterThanOrEqualTo(Short value) {
            addCriterion("sfky >=", value, "sfky");
            return (Criteria) this;
        }

        public Criteria andSfkyLessThan(Short value) {
            addCriterion("sfky <", value, "sfky");
            return (Criteria) this;
        }

        public Criteria andSfkyLessThanOrEqualTo(Short value) {
            addCriterion("sfky <=", value, "sfky");
            return (Criteria) this;
        }

        public Criteria andSfkyIn(List<Short> values) {
            addCriterion("sfky in", values, "sfky");
            return (Criteria) this;
        }

        public Criteria andSfkyNotIn(List<Short> values) {
            addCriterion("sfky not in", values, "sfky");
            return (Criteria) this;
        }

        public Criteria andSfkyBetween(Short value1, Short value2) {
            addCriterion("sfky between", value1, value2, "sfky");
            return (Criteria) this;
        }

        public Criteria andSfkyNotBetween(Short value1, Short value2) {
            addCriterion("sfky not between", value1, value2, "sfky");
            return (Criteria) this;
        }

        public Criteria andSfyyIsNull() {
            addCriterion("sfyy is null");
            return (Criteria) this;
        }

        public Criteria andSfyyIsNotNull() {
            addCriterion("sfyy is not null");
            return (Criteria) this;
        }

        public Criteria andSfyyEqualTo(Short value) {
            addCriterion("sfyy =", value, "sfyy");
            return (Criteria) this;
        }

        public Criteria andSfyyNotEqualTo(Short value) {
            addCriterion("sfyy <>", value, "sfyy");
            return (Criteria) this;
        }

        public Criteria andSfyyGreaterThan(Short value) {
            addCriterion("sfyy >", value, "sfyy");
            return (Criteria) this;
        }

        public Criteria andSfyyGreaterThanOrEqualTo(Short value) {
            addCriterion("sfyy >=", value, "sfyy");
            return (Criteria) this;
        }

        public Criteria andSfyyLessThan(Short value) {
            addCriterion("sfyy <", value, "sfyy");
            return (Criteria) this;
        }

        public Criteria andSfyyLessThanOrEqualTo(Short value) {
            addCriterion("sfyy <=", value, "sfyy");
            return (Criteria) this;
        }

        public Criteria andSfyyIn(List<Short> values) {
            addCriterion("sfyy in", values, "sfyy");
            return (Criteria) this;
        }

        public Criteria andSfyyNotIn(List<Short> values) {
            addCriterion("sfyy not in", values, "sfyy");
            return (Criteria) this;
        }

        public Criteria andSfyyBetween(Short value1, Short value2) {
            addCriterion("sfyy between", value1, value2, "sfyy");
            return (Criteria) this;
        }

        public Criteria andSfyyNotBetween(Short value1, Short value2) {
            addCriterion("sfyy not between", value1, value2, "sfyy");
            return (Criteria) this;
        }

        public Criteria andGfczsjIsNull() {
            addCriterion("gfczsj is null");
            return (Criteria) this;
        }

        public Criteria andGfczsjIsNotNull() {
            addCriterion("gfczsj is not null");
            return (Criteria) this;
        }

        public Criteria andGfczsjEqualTo(Date value) {
            addCriterionForJDBCDate("gfczsj =", value, "gfczsj");
            return (Criteria) this;
        }

        public Criteria andGfczsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("gfczsj <>", value, "gfczsj");
            return (Criteria) this;
        }

        public Criteria andGfczsjGreaterThan(Date value) {
            addCriterionForJDBCDate("gfczsj >", value, "gfczsj");
            return (Criteria) this;
        }

        public Criteria andGfczsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gfczsj >=", value, "gfczsj");
            return (Criteria) this;
        }

        public Criteria andGfczsjLessThan(Date value) {
            addCriterionForJDBCDate("gfczsj <", value, "gfczsj");
            return (Criteria) this;
        }

        public Criteria andGfczsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gfczsj <=", value, "gfczsj");
            return (Criteria) this;
        }

        public Criteria andGfczsjIn(List<Date> values) {
            addCriterionForJDBCDate("gfczsj in", values, "gfczsj");
            return (Criteria) this;
        }

        public Criteria andGfczsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("gfczsj not in", values, "gfczsj");
            return (Criteria) this;
        }

        public Criteria andGfczsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gfczsj between", value1, value2, "gfczsj");
            return (Criteria) this;
        }

        public Criteria andGfczsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gfczsj not between", value1, value2, "gfczsj");
            return (Criteria) this;
        }

        public Criteria andKpzzhsIsNull() {
            addCriterion("kpzzhs is null");
            return (Criteria) this;
        }

        public Criteria andKpzzhsIsNotNull() {
            addCriterion("kpzzhs is not null");
            return (Criteria) this;
        }

        public Criteria andKpzzhsEqualTo(Short value) {
            addCriterion("kpzzhs =", value, "kpzzhs");
            return (Criteria) this;
        }

        public Criteria andKpzzhsNotEqualTo(Short value) {
            addCriterion("kpzzhs <>", value, "kpzzhs");
            return (Criteria) this;
        }

        public Criteria andKpzzhsGreaterThan(Short value) {
            addCriterion("kpzzhs >", value, "kpzzhs");
            return (Criteria) this;
        }

        public Criteria andKpzzhsGreaterThanOrEqualTo(Short value) {
            addCriterion("kpzzhs >=", value, "kpzzhs");
            return (Criteria) this;
        }

        public Criteria andKpzzhsLessThan(Short value) {
            addCriterion("kpzzhs <", value, "kpzzhs");
            return (Criteria) this;
        }

        public Criteria andKpzzhsLessThanOrEqualTo(Short value) {
            addCriterion("kpzzhs <=", value, "kpzzhs");
            return (Criteria) this;
        }

        public Criteria andKpzzhsIn(List<Short> values) {
            addCriterion("kpzzhs in", values, "kpzzhs");
            return (Criteria) this;
        }

        public Criteria andKpzzhsNotIn(List<Short> values) {
            addCriterion("kpzzhs not in", values, "kpzzhs");
            return (Criteria) this;
        }

        public Criteria andKpzzhsBetween(Short value1, Short value2) {
            addCriterion("kpzzhs between", value1, value2, "kpzzhs");
            return (Criteria) this;
        }

        public Criteria andKpzzhsNotBetween(Short value1, Short value2) {
            addCriterion("kpzzhs not between", value1, value2, "kpzzhs");
            return (Criteria) this;
        }

        public Criteria andYpzhsIsNull() {
            addCriterion("ypzhs is null");
            return (Criteria) this;
        }

        public Criteria andYpzhsIsNotNull() {
            addCriterion("ypzhs is not null");
            return (Criteria) this;
        }

        public Criteria andYpzhsEqualTo(Short value) {
            addCriterion("ypzhs =", value, "ypzhs");
            return (Criteria) this;
        }

        public Criteria andYpzhsNotEqualTo(Short value) {
            addCriterion("ypzhs <>", value, "ypzhs");
            return (Criteria) this;
        }

        public Criteria andYpzhsGreaterThan(Short value) {
            addCriterion("ypzhs >", value, "ypzhs");
            return (Criteria) this;
        }

        public Criteria andYpzhsGreaterThanOrEqualTo(Short value) {
            addCriterion("ypzhs >=", value, "ypzhs");
            return (Criteria) this;
        }

        public Criteria andYpzhsLessThan(Short value) {
            addCriterion("ypzhs <", value, "ypzhs");
            return (Criteria) this;
        }

        public Criteria andYpzhsLessThanOrEqualTo(Short value) {
            addCriterion("ypzhs <=", value, "ypzhs");
            return (Criteria) this;
        }

        public Criteria andYpzhsIn(List<Short> values) {
            addCriterion("ypzhs in", values, "ypzhs");
            return (Criteria) this;
        }

        public Criteria andYpzhsNotIn(List<Short> values) {
            addCriterion("ypzhs not in", values, "ypzhs");
            return (Criteria) this;
        }

        public Criteria andYpzhsBetween(Short value1, Short value2) {
            addCriterion("ypzhs between", value1, value2, "ypzhs");
            return (Criteria) this;
        }

        public Criteria andYpzhsNotBetween(Short value1, Short value2) {
            addCriterion("ypzhs not between", value1, value2, "ypzhs");
            return (Criteria) this;
        }

        public Criteria andShengyumjIsNull() {
            addCriterion("shengyumj is null");
            return (Criteria) this;
        }

        public Criteria andShengyumjIsNotNull() {
            addCriterion("shengyumj is not null");
            return (Criteria) this;
        }

        public Criteria andShengyumjEqualTo(BigDecimal value) {
            addCriterion("shengyumj =", value, "shengyumj");
            return (Criteria) this;
        }

        public Criteria andShengyumjNotEqualTo(BigDecimal value) {
            addCriterion("shengyumj <>", value, "shengyumj");
            return (Criteria) this;
        }

        public Criteria andShengyumjGreaterThan(BigDecimal value) {
            addCriterion("shengyumj >", value, "shengyumj");
            return (Criteria) this;
        }

        public Criteria andShengyumjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shengyumj >=", value, "shengyumj");
            return (Criteria) this;
        }

        public Criteria andShengyumjLessThan(BigDecimal value) {
            addCriterion("shengyumj <", value, "shengyumj");
            return (Criteria) this;
        }

        public Criteria andShengyumjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shengyumj <=", value, "shengyumj");
            return (Criteria) this;
        }

        public Criteria andShengyumjIn(List<BigDecimal> values) {
            addCriterion("shengyumj in", values, "shengyumj");
            return (Criteria) this;
        }

        public Criteria andShengyumjNotIn(List<BigDecimal> values) {
            addCriterion("shengyumj not in", values, "shengyumj");
            return (Criteria) this;
        }

        public Criteria andShengyumjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shengyumj between", value1, value2, "shengyumj");
            return (Criteria) this;
        }

        public Criteria andShengyumjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shengyumj not between", value1, value2, "shengyumj");
            return (Criteria) this;
        }

        public Criteria andLsbzIsNull() {
            addCriterion("lsbz is null");
            return (Criteria) this;
        }

        public Criteria andLsbzIsNotNull() {
            addCriterion("lsbz is not null");
            return (Criteria) this;
        }

        public Criteria andLsbzEqualTo(Integer value) {
            addCriterion("lsbz =", value, "lsbz");
            return (Criteria) this;
        }

        public Criteria andLsbzNotEqualTo(Integer value) {
            addCriterion("lsbz <>", value, "lsbz");
            return (Criteria) this;
        }

        public Criteria andLsbzGreaterThan(Integer value) {
            addCriterion("lsbz >", value, "lsbz");
            return (Criteria) this;
        }

        public Criteria andLsbzGreaterThanOrEqualTo(Integer value) {
            addCriterion("lsbz >=", value, "lsbz");
            return (Criteria) this;
        }

        public Criteria andLsbzLessThan(Integer value) {
            addCriterion("lsbz <", value, "lsbz");
            return (Criteria) this;
        }

        public Criteria andLsbzLessThanOrEqualTo(Integer value) {
            addCriterion("lsbz <=", value, "lsbz");
            return (Criteria) this;
        }

        public Criteria andLsbzIn(List<Integer> values) {
            addCriterion("lsbz in", values, "lsbz");
            return (Criteria) this;
        }

        public Criteria andLsbzNotIn(List<Integer> values) {
            addCriterion("lsbz not in", values, "lsbz");
            return (Criteria) this;
        }

        public Criteria andLsbzBetween(Integer value1, Integer value2) {
            addCriterion("lsbz between", value1, value2, "lsbz");
            return (Criteria) this;
        }

        public Criteria andLsbzNotBetween(Integer value1, Integer value2) {
            addCriterion("lsbz not between", value1, value2, "lsbz");
            return (Criteria) this;
        }

        public Criteria andCjsjIsNull() {
            addCriterion("cjsj is null");
            return (Criteria) this;
        }

        public Criteria andCjsjIsNotNull() {
            addCriterion("cjsj is not null");
            return (Criteria) this;
        }

        public Criteria andCjsjEqualTo(Date value) {
            addCriterionForJDBCDate("cjsj =", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("cjsj <>", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThan(Date value) {
            addCriterionForJDBCDate("cjsj >", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cjsj >=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThan(Date value) {
            addCriterionForJDBCDate("cjsj <", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cjsj <=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjIn(List<Date> values) {
            addCriterionForJDBCDate("cjsj in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("cjsj not in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cjsj between", value1, value2, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cjsj not between", value1, value2, "cjsj");
            return (Criteria) this;
        }

        public Criteria andZzsjIsNull() {
            addCriterion("zzsj is null");
            return (Criteria) this;
        }

        public Criteria andZzsjIsNotNull() {
            addCriterion("zzsj is not null");
            return (Criteria) this;
        }

        public Criteria andZzsjEqualTo(Date value) {
            addCriterionForJDBCDate("zzsj =", value, "zzsj");
            return (Criteria) this;
        }

        public Criteria andZzsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("zzsj <>", value, "zzsj");
            return (Criteria) this;
        }

        public Criteria andZzsjGreaterThan(Date value) {
            addCriterionForJDBCDate("zzsj >", value, "zzsj");
            return (Criteria) this;
        }

        public Criteria andZzsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zzsj >=", value, "zzsj");
            return (Criteria) this;
        }

        public Criteria andZzsjLessThan(Date value) {
            addCriterionForJDBCDate("zzsj <", value, "zzsj");
            return (Criteria) this;
        }

        public Criteria andZzsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zzsj <=", value, "zzsj");
            return (Criteria) this;
        }

        public Criteria andZzsjIn(List<Date> values) {
            addCriterionForJDBCDate("zzsj in", values, "zzsj");
            return (Criteria) this;
        }

        public Criteria andZzsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("zzsj not in", values, "zzsj");
            return (Criteria) this;
        }

        public Criteria andZzsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zzsj between", value1, value2, "zzsj");
            return (Criteria) this;
        }

        public Criteria andZzsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zzsj not between", value1, value2, "zzsj");
            return (Criteria) this;
        }

        public Criteria andFhIsNull() {
            addCriterion("fh is null");
            return (Criteria) this;
        }

        public Criteria andFhIsNotNull() {
            addCriterion("fh is not null");
            return (Criteria) this;
        }

        public Criteria andFhEqualTo(String value) {
            addCriterion("fh =", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhNotEqualTo(String value) {
            addCriterion("fh <>", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhGreaterThan(String value) {
            addCriterion("fh >", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhGreaterThanOrEqualTo(String value) {
            addCriterion("fh >=", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhLessThan(String value) {
            addCriterion("fh <", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhLessThanOrEqualTo(String value) {
            addCriterion("fh <=", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhLike(String value) {
            addCriterion("fh like", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhNotLike(String value) {
            addCriterion("fh not like", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhIn(List<String> values) {
            addCriterion("fh in", values, "fh");
            return (Criteria) this;
        }

        public Criteria andFhNotIn(List<String> values) {
            addCriterion("fh not in", values, "fh");
            return (Criteria) this;
        }

        public Criteria andFhBetween(String value1, String value2) {
            addCriterion("fh between", value1, value2, "fh");
            return (Criteria) this;
        }

        public Criteria andFhNotBetween(String value1, String value2) {
            addCriterion("fh not between", value1, value2, "fh");
            return (Criteria) this;
        }

        public Criteria andYwslidIsNull() {
            addCriterion("ywslid is null");
            return (Criteria) this;
        }

        public Criteria andYwslidIsNotNull() {
            addCriterion("ywslid is not null");
            return (Criteria) this;
        }

        public Criteria andYwslidEqualTo(Long value) {
            addCriterion("ywslid =", value, "ywslid");
            return (Criteria) this;
        }

        public Criteria andYwslidNotEqualTo(Long value) {
            addCriterion("ywslid <>", value, "ywslid");
            return (Criteria) this;
        }

        public Criteria andYwslidGreaterThan(Long value) {
            addCriterion("ywslid >", value, "ywslid");
            return (Criteria) this;
        }

        public Criteria andYwslidGreaterThanOrEqualTo(Long value) {
            addCriterion("ywslid >=", value, "ywslid");
            return (Criteria) this;
        }

        public Criteria andYwslidLessThan(Long value) {
            addCriterion("ywslid <", value, "ywslid");
            return (Criteria) this;
        }

        public Criteria andYwslidLessThanOrEqualTo(Long value) {
            addCriterion("ywslid <=", value, "ywslid");
            return (Criteria) this;
        }

        public Criteria andYwslidIn(List<Long> values) {
            addCriterion("ywslid in", values, "ywslid");
            return (Criteria) this;
        }

        public Criteria andYwslidNotIn(List<Long> values) {
            addCriterion("ywslid not in", values, "ywslid");
            return (Criteria) this;
        }

        public Criteria andYwslidBetween(Long value1, Long value2) {
            addCriterion("ywslid between", value1, value2, "ywslid");
            return (Criteria) this;
        }

        public Criteria andYwslidNotBetween(Long value1, Long value2) {
            addCriterion("ywslid not between", value1, value2, "ywslid");
            return (Criteria) this;
        }

        public Criteria andDyhIsNull() {
            addCriterion("dyh is null");
            return (Criteria) this;
        }

        public Criteria andDyhIsNotNull() {
            addCriterion("dyh is not null");
            return (Criteria) this;
        }

        public Criteria andDyhEqualTo(String value) {
            addCriterion("dyh =", value, "dyh");
            return (Criteria) this;
        }

        public Criteria andDyhNotEqualTo(String value) {
            addCriterion("dyh <>", value, "dyh");
            return (Criteria) this;
        }

        public Criteria andDyhGreaterThan(String value) {
            addCriterion("dyh >", value, "dyh");
            return (Criteria) this;
        }

        public Criteria andDyhGreaterThanOrEqualTo(String value) {
            addCriterion("dyh >=", value, "dyh");
            return (Criteria) this;
        }

        public Criteria andDyhLessThan(String value) {
            addCriterion("dyh <", value, "dyh");
            return (Criteria) this;
        }

        public Criteria andDyhLessThanOrEqualTo(String value) {
            addCriterion("dyh <=", value, "dyh");
            return (Criteria) this;
        }

        public Criteria andDyhLike(String value) {
            addCriterion("dyh like", value, "dyh");
            return (Criteria) this;
        }

        public Criteria andDyhNotLike(String value) {
            addCriterion("dyh not like", value, "dyh");
            return (Criteria) this;
        }

        public Criteria andDyhIn(List<String> values) {
            addCriterion("dyh in", values, "dyh");
            return (Criteria) this;
        }

        public Criteria andDyhNotIn(List<String> values) {
            addCriterion("dyh not in", values, "dyh");
            return (Criteria) this;
        }

        public Criteria andDyhBetween(String value1, String value2) {
            addCriterion("dyh between", value1, value2, "dyh");
            return (Criteria) this;
        }

        public Criteria andDyhNotBetween(String value1, String value2) {
            addCriterion("dyh not between", value1, value2, "dyh");
            return (Criteria) this;
        }

        public Criteria andFwdahIsNull() {
            addCriterion("fwdah is null");
            return (Criteria) this;
        }

        public Criteria andFwdahIsNotNull() {
            addCriterion("fwdah is not null");
            return (Criteria) this;
        }

        public Criteria andFwdahEqualTo(Long value) {
            addCriterion("fwdah =", value, "fwdah");
            return (Criteria) this;
        }

        public Criteria andFwdahNotEqualTo(Long value) {
            addCriterion("fwdah <>", value, "fwdah");
            return (Criteria) this;
        }

        public Criteria andFwdahGreaterThan(Long value) {
            addCriterion("fwdah >", value, "fwdah");
            return (Criteria) this;
        }

        public Criteria andFwdahGreaterThanOrEqualTo(Long value) {
            addCriterion("fwdah >=", value, "fwdah");
            return (Criteria) this;
        }

        public Criteria andFwdahLessThan(Long value) {
            addCriterion("fwdah <", value, "fwdah");
            return (Criteria) this;
        }

        public Criteria andFwdahLessThanOrEqualTo(Long value) {
            addCriterion("fwdah <=", value, "fwdah");
            return (Criteria) this;
        }

        public Criteria andFwdahIn(List<Long> values) {
            addCriterion("fwdah in", values, "fwdah");
            return (Criteria) this;
        }

        public Criteria andFwdahNotIn(List<Long> values) {
            addCriterion("fwdah not in", values, "fwdah");
            return (Criteria) this;
        }

        public Criteria andFwdahBetween(Long value1, Long value2) {
            addCriterion("fwdah between", value1, value2, "fwdah");
            return (Criteria) this;
        }

        public Criteria andFwdahNotBetween(Long value1, Long value2) {
            addCriterion("fwdah not between", value1, value2, "fwdah");
            return (Criteria) this;
        }

        public Criteria andJbrIsNull() {
            addCriterion("jbr is null");
            return (Criteria) this;
        }

        public Criteria andJbrIsNotNull() {
            addCriterion("jbr is not null");
            return (Criteria) this;
        }

        public Criteria andJbrEqualTo(String value) {
            addCriterion("jbr =", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrNotEqualTo(String value) {
            addCriterion("jbr <>", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrGreaterThan(String value) {
            addCriterion("jbr >", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrGreaterThanOrEqualTo(String value) {
            addCriterion("jbr >=", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrLessThan(String value) {
            addCriterion("jbr <", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrLessThanOrEqualTo(String value) {
            addCriterion("jbr <=", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrLike(String value) {
            addCriterion("jbr like", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrNotLike(String value) {
            addCriterion("jbr not like", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrIn(List<String> values) {
            addCriterion("jbr in", values, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrNotIn(List<String> values) {
            addCriterion("jbr not in", values, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrBetween(String value1, String value2) {
            addCriterion("jbr between", value1, value2, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrNotBetween(String value1, String value2) {
            addCriterion("jbr not between", value1, value2, "jbr");
            return (Criteria) this;
        }

        public Criteria andSzcqIsNull() {
            addCriterion("szcq is null");
            return (Criteria) this;
        }

        public Criteria andSzcqIsNotNull() {
            addCriterion("szcq is not null");
            return (Criteria) this;
        }

        public Criteria andSzcqEqualTo(Integer value) {
            addCriterion("szcq =", value, "szcq");
            return (Criteria) this;
        }

        public Criteria andSzcqNotEqualTo(Integer value) {
            addCriterion("szcq <>", value, "szcq");
            return (Criteria) this;
        }

        public Criteria andSzcqGreaterThan(Integer value) {
            addCriterion("szcq >", value, "szcq");
            return (Criteria) this;
        }

        public Criteria andSzcqGreaterThanOrEqualTo(Integer value) {
            addCriterion("szcq >=", value, "szcq");
            return (Criteria) this;
        }

        public Criteria andSzcqLessThan(Integer value) {
            addCriterion("szcq <", value, "szcq");
            return (Criteria) this;
        }

        public Criteria andSzcqLessThanOrEqualTo(Integer value) {
            addCriterion("szcq <=", value, "szcq");
            return (Criteria) this;
        }

        public Criteria andSzcqIn(List<Integer> values) {
            addCriterion("szcq in", values, "szcq");
            return (Criteria) this;
        }

        public Criteria andSzcqNotIn(List<Integer> values) {
            addCriterion("szcq not in", values, "szcq");
            return (Criteria) this;
        }

        public Criteria andSzcqBetween(Integer value1, Integer value2) {
            addCriterion("szcq between", value1, value2, "szcq");
            return (Criteria) this;
        }

        public Criteria andSzcqNotBetween(Integer value1, Integer value2) {
            addCriterion("szcq not between", value1, value2, "szcq");
            return (Criteria) this;
        }

        public Criteria andZhIsNull() {
            addCriterion("zh is null");
            return (Criteria) this;
        }

        public Criteria andZhIsNotNull() {
            addCriterion("zh is not null");
            return (Criteria) this;
        }

        public Criteria andZhEqualTo(Long value) {
            addCriterion("zh =", value, "zh");
            return (Criteria) this;
        }

        public Criteria andZhNotEqualTo(Long value) {
            addCriterion("zh <>", value, "zh");
            return (Criteria) this;
        }

        public Criteria andZhGreaterThan(Long value) {
            addCriterion("zh >", value, "zh");
            return (Criteria) this;
        }

        public Criteria andZhGreaterThanOrEqualTo(Long value) {
            addCriterion("zh >=", value, "zh");
            return (Criteria) this;
        }

        public Criteria andZhLessThan(Long value) {
            addCriterion("zh <", value, "zh");
            return (Criteria) this;
        }

        public Criteria andZhLessThanOrEqualTo(Long value) {
            addCriterion("zh <=", value, "zh");
            return (Criteria) this;
        }

        public Criteria andZhIn(List<Long> values) {
            addCriterion("zh in", values, "zh");
            return (Criteria) this;
        }

        public Criteria andZhNotIn(List<Long> values) {
            addCriterion("zh not in", values, "zh");
            return (Criteria) this;
        }

        public Criteria andZhBetween(Long value1, Long value2) {
            addCriterion("zh between", value1, value2, "zh");
            return (Criteria) this;
        }

        public Criteria andZhNotBetween(Long value1, Long value2) {
            addCriterion("zh not between", value1, value2, "zh");
            return (Criteria) this;
        }

        public Criteria andFwlxIsNull() {
            addCriterion("fwlx is null");
            return (Criteria) this;
        }

        public Criteria andFwlxIsNotNull() {
            addCriterion("fwlx is not null");
            return (Criteria) this;
        }

        public Criteria andFwlxEqualTo(Long value) {
            addCriterion("fwlx =", value, "fwlx");
            return (Criteria) this;
        }

        public Criteria andFwlxNotEqualTo(Long value) {
            addCriterion("fwlx <>", value, "fwlx");
            return (Criteria) this;
        }

        public Criteria andFwlxGreaterThan(Long value) {
            addCriterion("fwlx >", value, "fwlx");
            return (Criteria) this;
        }

        public Criteria andFwlxGreaterThanOrEqualTo(Long value) {
            addCriterion("fwlx >=", value, "fwlx");
            return (Criteria) this;
        }

        public Criteria andFwlxLessThan(Long value) {
            addCriterion("fwlx <", value, "fwlx");
            return (Criteria) this;
        }

        public Criteria andFwlxLessThanOrEqualTo(Long value) {
            addCriterion("fwlx <=", value, "fwlx");
            return (Criteria) this;
        }

        public Criteria andFwlxIn(List<Long> values) {
            addCriterion("fwlx in", values, "fwlx");
            return (Criteria) this;
        }

        public Criteria andFwlxNotIn(List<Long> values) {
            addCriterion("fwlx not in", values, "fwlx");
            return (Criteria) this;
        }

        public Criteria andFwlxBetween(Long value1, Long value2) {
            addCriterion("fwlx between", value1, value2, "fwlx");
            return (Criteria) this;
        }

        public Criteria andFwlxNotBetween(Long value1, Long value2) {
            addCriterion("fwlx not between", value1, value2, "fwlx");
            return (Criteria) this;
        }

        public Criteria andFwsyztIsNull() {
            addCriterion("fwsyzt is null");
            return (Criteria) this;
        }

        public Criteria andFwsyztIsNotNull() {
            addCriterion("fwsyzt is not null");
            return (Criteria) this;
        }

        public Criteria andFwsyztEqualTo(Long value) {
            addCriterion("fwsyzt =", value, "fwsyzt");
            return (Criteria) this;
        }

        public Criteria andFwsyztNotEqualTo(Long value) {
            addCriterion("fwsyzt <>", value, "fwsyzt");
            return (Criteria) this;
        }

        public Criteria andFwsyztGreaterThan(Long value) {
            addCriterion("fwsyzt >", value, "fwsyzt");
            return (Criteria) this;
        }

        public Criteria andFwsyztGreaterThanOrEqualTo(Long value) {
            addCriterion("fwsyzt >=", value, "fwsyzt");
            return (Criteria) this;
        }

        public Criteria andFwsyztLessThan(Long value) {
            addCriterion("fwsyzt <", value, "fwsyzt");
            return (Criteria) this;
        }

        public Criteria andFwsyztLessThanOrEqualTo(Long value) {
            addCriterion("fwsyzt <=", value, "fwsyzt");
            return (Criteria) this;
        }

        public Criteria andFwsyztIn(List<Long> values) {
            addCriterion("fwsyzt in", values, "fwsyzt");
            return (Criteria) this;
        }

        public Criteria andFwsyztNotIn(List<Long> values) {
            addCriterion("fwsyzt not in", values, "fwsyzt");
            return (Criteria) this;
        }

        public Criteria andFwsyztBetween(Long value1, Long value2) {
            addCriterion("fwsyzt between", value1, value2, "fwsyzt");
            return (Criteria) this;
        }

        public Criteria andFwsyztNotBetween(Long value1, Long value2) {
            addCriterion("fwsyzt not between", value1, value2, "fwsyzt");
            return (Criteria) this;
        }

        public Criteria andXqmcIsNull() {
            addCriterion("xqmc is null");
            return (Criteria) this;
        }

        public Criteria andXqmcIsNotNull() {
            addCriterion("xqmc is not null");
            return (Criteria) this;
        }

        public Criteria andXqmcEqualTo(String value) {
            addCriterion("xqmc =", value, "xqmc");
            return (Criteria) this;
        }

        public Criteria andXqmcNotEqualTo(String value) {
            addCriterion("xqmc <>", value, "xqmc");
            return (Criteria) this;
        }

        public Criteria andXqmcGreaterThan(String value) {
            addCriterion("xqmc >", value, "xqmc");
            return (Criteria) this;
        }

        public Criteria andXqmcGreaterThanOrEqualTo(String value) {
            addCriterion("xqmc >=", value, "xqmc");
            return (Criteria) this;
        }

        public Criteria andXqmcLessThan(String value) {
            addCriterion("xqmc <", value, "xqmc");
            return (Criteria) this;
        }

        public Criteria andXqmcLessThanOrEqualTo(String value) {
            addCriterion("xqmc <=", value, "xqmc");
            return (Criteria) this;
        }

        public Criteria andXqmcLike(String value) {
            addCriterion("xqmc like", value, "xqmc");
            return (Criteria) this;
        }

        public Criteria andXqmcNotLike(String value) {
            addCriterion("xqmc not like", value, "xqmc");
            return (Criteria) this;
        }

        public Criteria andXqmcIn(List<String> values) {
            addCriterion("xqmc in", values, "xqmc");
            return (Criteria) this;
        }

        public Criteria andXqmcNotIn(List<String> values) {
            addCriterion("xqmc not in", values, "xqmc");
            return (Criteria) this;
        }

        public Criteria andXqmcBetween(String value1, String value2) {
            addCriterion("xqmc between", value1, value2, "xqmc");
            return (Criteria) this;
        }

        public Criteria andXqmcNotBetween(String value1, String value2) {
            addCriterion("xqmc not between", value1, value2, "xqmc");
            return (Criteria) this;
        }

        public Criteria andZnhxmIsNull() {
            addCriterion("znhxm is null");
            return (Criteria) this;
        }

        public Criteria andZnhxmIsNotNull() {
            addCriterion("znhxm is not null");
            return (Criteria) this;
        }

        public Criteria andZnhxmEqualTo(Short value) {
            addCriterion("znhxm =", value, "znhxm");
            return (Criteria) this;
        }

        public Criteria andZnhxmNotEqualTo(Short value) {
            addCriterion("znhxm <>", value, "znhxm");
            return (Criteria) this;
        }

        public Criteria andZnhxmGreaterThan(Short value) {
            addCriterion("znhxm >", value, "znhxm");
            return (Criteria) this;
        }

        public Criteria andZnhxmGreaterThanOrEqualTo(Short value) {
            addCriterion("znhxm >=", value, "znhxm");
            return (Criteria) this;
        }

        public Criteria andZnhxmLessThan(Short value) {
            addCriterion("znhxm <", value, "znhxm");
            return (Criteria) this;
        }

        public Criteria andZnhxmLessThanOrEqualTo(Short value) {
            addCriterion("znhxm <=", value, "znhxm");
            return (Criteria) this;
        }

        public Criteria andZnhxmIn(List<Short> values) {
            addCriterion("znhxm in", values, "znhxm");
            return (Criteria) this;
        }

        public Criteria andZnhxmNotIn(List<Short> values) {
            addCriterion("znhxm not in", values, "znhxm");
            return (Criteria) this;
        }

        public Criteria andZnhxmBetween(Short value1, Short value2) {
            addCriterion("znhxm between", value1, value2, "znhxm");
            return (Criteria) this;
        }

        public Criteria andZnhxmNotBetween(Short value1, Short value2) {
            addCriterion("znhxm not between", value1, value2, "znhxm");
            return (Criteria) this;
        }

        public Criteria andHfqkIsNull() {
            addCriterion("hfqk is null");
            return (Criteria) this;
        }

        public Criteria andHfqkIsNotNull() {
            addCriterion("hfqk is not null");
            return (Criteria) this;
        }

        public Criteria andHfqkEqualTo(Integer value) {
            addCriterion("hfqk =", value, "hfqk");
            return (Criteria) this;
        }

        public Criteria andHfqkNotEqualTo(Integer value) {
            addCriterion("hfqk <>", value, "hfqk");
            return (Criteria) this;
        }

        public Criteria andHfqkGreaterThan(Integer value) {
            addCriterion("hfqk >", value, "hfqk");
            return (Criteria) this;
        }

        public Criteria andHfqkGreaterThanOrEqualTo(Integer value) {
            addCriterion("hfqk >=", value, "hfqk");
            return (Criteria) this;
        }

        public Criteria andHfqkLessThan(Integer value) {
            addCriterion("hfqk <", value, "hfqk");
            return (Criteria) this;
        }

        public Criteria andHfqkLessThanOrEqualTo(Integer value) {
            addCriterion("hfqk <=", value, "hfqk");
            return (Criteria) this;
        }

        public Criteria andHfqkIn(List<Integer> values) {
            addCriterion("hfqk in", values, "hfqk");
            return (Criteria) this;
        }

        public Criteria andHfqkNotIn(List<Integer> values) {
            addCriterion("hfqk not in", values, "hfqk");
            return (Criteria) this;
        }

        public Criteria andHfqkBetween(Integer value1, Integer value2) {
            addCriterion("hfqk between", value1, value2, "hfqk");
            return (Criteria) this;
        }

        public Criteria andHfqkNotBetween(Integer value1, Integer value2) {
            addCriterion("hfqk not between", value1, value2, "hfqk");
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
