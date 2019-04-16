package cn.zciel.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TpoFyxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public TpoFyxxExample() {
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

        public Criteria andFIDIsNull() {
            addCriterion("FID is null");
            return (Criteria) this;
        }

        public Criteria andFIDIsNotNull() {
            addCriterion("FID is not null");
            return (Criteria) this;
        }

        public Criteria andFIDEqualTo(String value) {
            addCriterion("FID =", value, "FID");
            return (Criteria) this;
        }

        public Criteria andFIDNotEqualTo(String value) {
            addCriterion("FID <>", value, "FID");
            return (Criteria) this;
        }

        public Criteria andFIDGreaterThan(String value) {
            addCriterion("FID >", value, "FID");
            return (Criteria) this;
        }

        public Criteria andFIDGreaterThanOrEqualTo(String value) {
            addCriterion("FID >=", value, "FID");
            return (Criteria) this;
        }

        public Criteria andFIDLessThan(String value) {
            addCriterion("FID <", value, "FID");
            return (Criteria) this;
        }

        public Criteria andFIDLessThanOrEqualTo(String value) {
            addCriterion("FID <=", value, "FID");
            return (Criteria) this;
        }

        public Criteria andFIDLike(String value) {
            addCriterion("FID like", value, "FID");
            return (Criteria) this;
        }

        public Criteria andFIDNotLike(String value) {
            addCriterion("FID not like", value, "FID");
            return (Criteria) this;
        }

        public Criteria andFIDIn(List<String> values) {
            addCriterion("FID in", values, "FID");
            return (Criteria) this;
        }

        public Criteria andFIDNotIn(List<String> values) {
            addCriterion("FID not in", values, "FID");
            return (Criteria) this;
        }

        public Criteria andFIDBetween(String value1, String value2) {
            addCriterion("FID between", value1, value2, "FID");
            return (Criteria) this;
        }

        public Criteria andFIDNotBetween(String value1, String value2) {
            addCriterion("FID not between", value1, value2, "FID");
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

        public Criteria andFWIDIsNull() {
            addCriterion("FWID is null");
            return (Criteria) this;
        }

        public Criteria andFWIDIsNotNull() {
            addCriterion("FWID is not null");
            return (Criteria) this;
        }

        public Criteria andFWIDEqualTo(String value) {
            addCriterion("FWID =", value, "FWID");
            return (Criteria) this;
        }

        public Criteria andFWIDNotEqualTo(String value) {
            addCriterion("FWID <>", value, "FWID");
            return (Criteria) this;
        }

        public Criteria andFWIDGreaterThan(String value) {
            addCriterion("FWID >", value, "FWID");
            return (Criteria) this;
        }

        public Criteria andFWIDGreaterThanOrEqualTo(String value) {
            addCriterion("FWID >=", value, "FWID");
            return (Criteria) this;
        }

        public Criteria andFWIDLessThan(String value) {
            addCriterion("FWID <", value, "FWID");
            return (Criteria) this;
        }

        public Criteria andFWIDLessThanOrEqualTo(String value) {
            addCriterion("FWID <=", value, "FWID");
            return (Criteria) this;
        }

        public Criteria andFWIDLike(String value) {
            addCriterion("FWID like", value, "FWID");
            return (Criteria) this;
        }

        public Criteria andFWIDNotLike(String value) {
            addCriterion("FWID not like", value, "FWID");
            return (Criteria) this;
        }

        public Criteria andFWIDIn(List<String> values) {
            addCriterion("FWID in", values, "FWID");
            return (Criteria) this;
        }

        public Criteria andFWIDNotIn(List<String> values) {
            addCriterion("FWID not in", values, "FWID");
            return (Criteria) this;
        }

        public Criteria andFWIDBetween(String value1, String value2) {
            addCriterion("FWID between", value1, value2, "FWID");
            return (Criteria) this;
        }

        public Criteria andFWIDNotBetween(String value1, String value2) {
            addCriterion("FWID not between", value1, value2, "FWID");
            return (Criteria) this;
        }

        public Criteria andFWCODEIsNull() {
            addCriterion("FWCODE is null");
            return (Criteria) this;
        }

        public Criteria andFWCODEIsNotNull() {
            addCriterion("FWCODE is not null");
            return (Criteria) this;
        }

        public Criteria andFWCODEEqualTo(String value) {
            addCriterion("FWCODE =", value, "FWCODE");
            return (Criteria) this;
        }

        public Criteria andFWCODENotEqualTo(String value) {
            addCriterion("FWCODE <>", value, "FWCODE");
            return (Criteria) this;
        }

        public Criteria andFWCODEGreaterThan(String value) {
            addCriterion("FWCODE >", value, "FWCODE");
            return (Criteria) this;
        }

        public Criteria andFWCODEGreaterThanOrEqualTo(String value) {
            addCriterion("FWCODE >=", value, "FWCODE");
            return (Criteria) this;
        }

        public Criteria andFWCODELessThan(String value) {
            addCriterion("FWCODE <", value, "FWCODE");
            return (Criteria) this;
        }

        public Criteria andFWCODELessThanOrEqualTo(String value) {
            addCriterion("FWCODE <=", value, "FWCODE");
            return (Criteria) this;
        }

        public Criteria andFWCODELike(String value) {
            addCriterion("FWCODE like", value, "FWCODE");
            return (Criteria) this;
        }

        public Criteria andFWCODENotLike(String value) {
            addCriterion("FWCODE not like", value, "FWCODE");
            return (Criteria) this;
        }

        public Criteria andFWCODEIn(List<String> values) {
            addCriterion("FWCODE in", values, "FWCODE");
            return (Criteria) this;
        }

        public Criteria andFWCODENotIn(List<String> values) {
            addCriterion("FWCODE not in", values, "FWCODE");
            return (Criteria) this;
        }

        public Criteria andFWCODEBetween(String value1, String value2) {
            addCriterion("FWCODE between", value1, value2, "FWCODE");
            return (Criteria) this;
        }

        public Criteria andFWCODENotBetween(String value1, String value2) {
            addCriterion("FWCODE not between", value1, value2, "FWCODE");
            return (Criteria) this;
        }

        public Criteria andBDCDYDMIsNull() {
            addCriterion("BDCDYDM is null");
            return (Criteria) this;
        }

        public Criteria andBDCDYDMIsNotNull() {
            addCriterion("BDCDYDM is not null");
            return (Criteria) this;
        }

        public Criteria andBDCDYDMEqualTo(String value) {
            addCriterion("BDCDYDM =", value, "BDCDYDM");
            return (Criteria) this;
        }

        public Criteria andBDCDYDMNotEqualTo(String value) {
            addCriterion("BDCDYDM <>", value, "BDCDYDM");
            return (Criteria) this;
        }

        public Criteria andBDCDYDMGreaterThan(String value) {
            addCriterion("BDCDYDM >", value, "BDCDYDM");
            return (Criteria) this;
        }

        public Criteria andBDCDYDMGreaterThanOrEqualTo(String value) {
            addCriterion("BDCDYDM >=", value, "BDCDYDM");
            return (Criteria) this;
        }

        public Criteria andBDCDYDMLessThan(String value) {
            addCriterion("BDCDYDM <", value, "BDCDYDM");
            return (Criteria) this;
        }

        public Criteria andBDCDYDMLessThanOrEqualTo(String value) {
            addCriterion("BDCDYDM <=", value, "BDCDYDM");
            return (Criteria) this;
        }

        public Criteria andBDCDYDMLike(String value) {
            addCriterion("BDCDYDM like", value, "BDCDYDM");
            return (Criteria) this;
        }

        public Criteria andBDCDYDMNotLike(String value) {
            addCriterion("BDCDYDM not like", value, "BDCDYDM");
            return (Criteria) this;
        }

        public Criteria andBDCDYDMIn(List<String> values) {
            addCriterion("BDCDYDM in", values, "BDCDYDM");
            return (Criteria) this;
        }

        public Criteria andBDCDYDMNotIn(List<String> values) {
            addCriterion("BDCDYDM not in", values, "BDCDYDM");
            return (Criteria) this;
        }

        public Criteria andBDCDYDMBetween(String value1, String value2) {
            addCriterion("BDCDYDM between", value1, value2, "BDCDYDM");
            return (Criteria) this;
        }

        public Criteria andBDCDYDMNotBetween(String value1, String value2) {
            addCriterion("BDCDYDM not between", value1, value2, "BDCDYDM");
            return (Criteria) this;
        }

        public Criteria andYZDZIsNull() {
            addCriterion("YZDZ is null");
            return (Criteria) this;
        }

        public Criteria andYZDZIsNotNull() {
            addCriterion("YZDZ is not null");
            return (Criteria) this;
        }

        public Criteria andYZDZEqualTo(String value) {
            addCriterion("YZDZ =", value, "YZDZ");
            return (Criteria) this;
        }

        public Criteria andYZDZNotEqualTo(String value) {
            addCriterion("YZDZ <>", value, "YZDZ");
            return (Criteria) this;
        }

        public Criteria andYZDZGreaterThan(String value) {
            addCriterion("YZDZ >", value, "YZDZ");
            return (Criteria) this;
        }

        public Criteria andYZDZGreaterThanOrEqualTo(String value) {
            addCriterion("YZDZ >=", value, "YZDZ");
            return (Criteria) this;
        }

        public Criteria andYZDZLessThan(String value) {
            addCriterion("YZDZ <", value, "YZDZ");
            return (Criteria) this;
        }

        public Criteria andYZDZLessThanOrEqualTo(String value) {
            addCriterion("YZDZ <=", value, "YZDZ");
            return (Criteria) this;
        }

        public Criteria andYZDZLike(String value) {
            addCriterion("YZDZ like", value, "YZDZ");
            return (Criteria) this;
        }

        public Criteria andYZDZNotLike(String value) {
            addCriterion("YZDZ not like", value, "YZDZ");
            return (Criteria) this;
        }

        public Criteria andYZDZIn(List<String> values) {
            addCriterion("YZDZ in", values, "YZDZ");
            return (Criteria) this;
        }

        public Criteria andYZDZNotIn(List<String> values) {
            addCriterion("YZDZ not in", values, "YZDZ");
            return (Criteria) this;
        }

        public Criteria andYZDZBetween(String value1, String value2) {
            addCriterion("YZDZ between", value1, value2, "YZDZ");
            return (Criteria) this;
        }

        public Criteria andYZDZNotBetween(String value1, String value2) {
            addCriterion("YZDZ not between", value1, value2, "YZDZ");
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

        public Criteria andFWXZIsNull() {
            addCriterion("FWXZ is null");
            return (Criteria) this;
        }

        public Criteria andFWXZIsNotNull() {
            addCriterion("FWXZ is not null");
            return (Criteria) this;
        }

        public Criteria andFWXZEqualTo(String value) {
            addCriterion("FWXZ =", value, "FWXZ");
            return (Criteria) this;
        }

        public Criteria andFWXZNotEqualTo(String value) {
            addCriterion("FWXZ <>", value, "FWXZ");
            return (Criteria) this;
        }

        public Criteria andFWXZGreaterThan(String value) {
            addCriterion("FWXZ >", value, "FWXZ");
            return (Criteria) this;
        }

        public Criteria andFWXZGreaterThanOrEqualTo(String value) {
            addCriterion("FWXZ >=", value, "FWXZ");
            return (Criteria) this;
        }

        public Criteria andFWXZLessThan(String value) {
            addCriterion("FWXZ <", value, "FWXZ");
            return (Criteria) this;
        }

        public Criteria andFWXZLessThanOrEqualTo(String value) {
            addCriterion("FWXZ <=", value, "FWXZ");
            return (Criteria) this;
        }

        public Criteria andFWXZLike(String value) {
            addCriterion("FWXZ like", value, "FWXZ");
            return (Criteria) this;
        }

        public Criteria andFWXZNotLike(String value) {
            addCriterion("FWXZ not like", value, "FWXZ");
            return (Criteria) this;
        }

        public Criteria andFWXZIn(List<String> values) {
            addCriterion("FWXZ in", values, "FWXZ");
            return (Criteria) this;
        }

        public Criteria andFWXZNotIn(List<String> values) {
            addCriterion("FWXZ not in", values, "FWXZ");
            return (Criteria) this;
        }

        public Criteria andFWXZBetween(String value1, String value2) {
            addCriterion("FWXZ between", value1, value2, "FWXZ");
            return (Criteria) this;
        }

        public Criteria andFWXZNotBetween(String value1, String value2) {
            addCriterion("FWXZ not between", value1, value2, "FWXZ");
            return (Criteria) this;
        }

        public Criteria andTDDJIsNull() {
            addCriterion("TDDJ is null");
            return (Criteria) this;
        }

        public Criteria andTDDJIsNotNull() {
            addCriterion("TDDJ is not null");
            return (Criteria) this;
        }

        public Criteria andTDDJEqualTo(String value) {
            addCriterion("TDDJ =", value, "TDDJ");
            return (Criteria) this;
        }

        public Criteria andTDDJNotEqualTo(String value) {
            addCriterion("TDDJ <>", value, "TDDJ");
            return (Criteria) this;
        }

        public Criteria andTDDJGreaterThan(String value) {
            addCriterion("TDDJ >", value, "TDDJ");
            return (Criteria) this;
        }

        public Criteria andTDDJGreaterThanOrEqualTo(String value) {
            addCriterion("TDDJ >=", value, "TDDJ");
            return (Criteria) this;
        }

        public Criteria andTDDJLessThan(String value) {
            addCriterion("TDDJ <", value, "TDDJ");
            return (Criteria) this;
        }

        public Criteria andTDDJLessThanOrEqualTo(String value) {
            addCriterion("TDDJ <=", value, "TDDJ");
            return (Criteria) this;
        }

        public Criteria andTDDJLike(String value) {
            addCriterion("TDDJ like", value, "TDDJ");
            return (Criteria) this;
        }

        public Criteria andTDDJNotLike(String value) {
            addCriterion("TDDJ not like", value, "TDDJ");
            return (Criteria) this;
        }

        public Criteria andTDDJIn(List<String> values) {
            addCriterion("TDDJ in", values, "TDDJ");
            return (Criteria) this;
        }

        public Criteria andTDDJNotIn(List<String> values) {
            addCriterion("TDDJ not in", values, "TDDJ");
            return (Criteria) this;
        }

        public Criteria andTDDJBetween(String value1, String value2) {
            addCriterion("TDDJ between", value1, value2, "TDDJ");
            return (Criteria) this;
        }

        public Criteria andTDDJNotBetween(String value1, String value2) {
            addCriterion("TDDJ not between", value1, value2, "TDDJ");
            return (Criteria) this;
        }

        public Criteria andCQZHIsNull() {
            addCriterion("CQZH is null");
            return (Criteria) this;
        }

        public Criteria andCQZHIsNotNull() {
            addCriterion("CQZH is not null");
            return (Criteria) this;
        }

        public Criteria andCQZHEqualTo(String value) {
            addCriterion("CQZH =", value, "CQZH");
            return (Criteria) this;
        }

        public Criteria andCQZHNotEqualTo(String value) {
            addCriterion("CQZH <>", value, "CQZH");
            return (Criteria) this;
        }

        public Criteria andCQZHGreaterThan(String value) {
            addCriterion("CQZH >", value, "CQZH");
            return (Criteria) this;
        }

        public Criteria andCQZHGreaterThanOrEqualTo(String value) {
            addCriterion("CQZH >=", value, "CQZH");
            return (Criteria) this;
        }

        public Criteria andCQZHLessThan(String value) {
            addCriterion("CQZH <", value, "CQZH");
            return (Criteria) this;
        }

        public Criteria andCQZHLessThanOrEqualTo(String value) {
            addCriterion("CQZH <=", value, "CQZH");
            return (Criteria) this;
        }

        public Criteria andCQZHLike(String value) {
            addCriterion("CQZH like", value, "CQZH");
            return (Criteria) this;
        }

        public Criteria andCQZHNotLike(String value) {
            addCriterion("CQZH not like", value, "CQZH");
            return (Criteria) this;
        }

        public Criteria andCQZHIn(List<String> values) {
            addCriterion("CQZH in", values, "CQZH");
            return (Criteria) this;
        }

        public Criteria andCQZHNotIn(List<String> values) {
            addCriterion("CQZH not in", values, "CQZH");
            return (Criteria) this;
        }

        public Criteria andCQZHBetween(String value1, String value2) {
            addCriterion("CQZH between", value1, value2, "CQZH");
            return (Criteria) this;
        }

        public Criteria andCQZHNotBetween(String value1, String value2) {
            addCriterion("CQZH not between", value1, value2, "CQZH");
            return (Criteria) this;
        }

        public Criteria andCQDWIsNull() {
            addCriterion("CQDW is null");
            return (Criteria) this;
        }

        public Criteria andCQDWIsNotNull() {
            addCriterion("CQDW is not null");
            return (Criteria) this;
        }

        public Criteria andCQDWEqualTo(String value) {
            addCriterion("CQDW =", value, "CQDW");
            return (Criteria) this;
        }

        public Criteria andCQDWNotEqualTo(String value) {
            addCriterion("CQDW <>", value, "CQDW");
            return (Criteria) this;
        }

        public Criteria andCQDWGreaterThan(String value) {
            addCriterion("CQDW >", value, "CQDW");
            return (Criteria) this;
        }

        public Criteria andCQDWGreaterThanOrEqualTo(String value) {
            addCriterion("CQDW >=", value, "CQDW");
            return (Criteria) this;
        }

        public Criteria andCQDWLessThan(String value) {
            addCriterion("CQDW <", value, "CQDW");
            return (Criteria) this;
        }

        public Criteria andCQDWLessThanOrEqualTo(String value) {
            addCriterion("CQDW <=", value, "CQDW");
            return (Criteria) this;
        }

        public Criteria andCQDWLike(String value) {
            addCriterion("CQDW like", value, "CQDW");
            return (Criteria) this;
        }

        public Criteria andCQDWNotLike(String value) {
            addCriterion("CQDW not like", value, "CQDW");
            return (Criteria) this;
        }

        public Criteria andCQDWIn(List<String> values) {
            addCriterion("CQDW in", values, "CQDW");
            return (Criteria) this;
        }

        public Criteria andCQDWNotIn(List<String> values) {
            addCriterion("CQDW not in", values, "CQDW");
            return (Criteria) this;
        }

        public Criteria andCQDWBetween(String value1, String value2) {
            addCriterion("CQDW between", value1, value2, "CQDW");
            return (Criteria) this;
        }

        public Criteria andCQDWNotBetween(String value1, String value2) {
            addCriterion("CQDW not between", value1, value2, "CQDW");
            return (Criteria) this;
        }

        public Criteria andHXIsNull() {
            addCriterion("HX is null");
            return (Criteria) this;
        }

        public Criteria andHXIsNotNull() {
            addCriterion("HX is not null");
            return (Criteria) this;
        }

        public Criteria andHXEqualTo(String value) {
            addCriterion("HX =", value, "HX");
            return (Criteria) this;
        }

        public Criteria andHXNotEqualTo(String value) {
            addCriterion("HX <>", value, "HX");
            return (Criteria) this;
        }

        public Criteria andHXGreaterThan(String value) {
            addCriterion("HX >", value, "HX");
            return (Criteria) this;
        }

        public Criteria andHXGreaterThanOrEqualTo(String value) {
            addCriterion("HX >=", value, "HX");
            return (Criteria) this;
        }

        public Criteria andHXLessThan(String value) {
            addCriterion("HX <", value, "HX");
            return (Criteria) this;
        }

        public Criteria andHXLessThanOrEqualTo(String value) {
            addCriterion("HX <=", value, "HX");
            return (Criteria) this;
        }

        public Criteria andHXLike(String value) {
            addCriterion("HX like", value, "HX");
            return (Criteria) this;
        }

        public Criteria andHXNotLike(String value) {
            addCriterion("HX not like", value, "HX");
            return (Criteria) this;
        }

        public Criteria andHXIn(List<String> values) {
            addCriterion("HX in", values, "HX");
            return (Criteria) this;
        }

        public Criteria andHXNotIn(List<String> values) {
            addCriterion("HX not in", values, "HX");
            return (Criteria) this;
        }

        public Criteria andHXBetween(String value1, String value2) {
            addCriterion("HX between", value1, value2, "HX");
            return (Criteria) this;
        }

        public Criteria andHXNotBetween(String value1, String value2) {
            addCriterion("HX not between", value1, value2, "HX");
            return (Criteria) this;
        }

        public Criteria andFPFSIsNull() {
            addCriterion("FPFS is null");
            return (Criteria) this;
        }

        public Criteria andFPFSIsNotNull() {
            addCriterion("FPFS is not null");
            return (Criteria) this;
        }

        public Criteria andFPFSEqualTo(String value) {
            addCriterion("FPFS =", value, "FPFS");
            return (Criteria) this;
        }

        public Criteria andFPFSNotEqualTo(String value) {
            addCriterion("FPFS <>", value, "FPFS");
            return (Criteria) this;
        }

        public Criteria andFPFSGreaterThan(String value) {
            addCriterion("FPFS >", value, "FPFS");
            return (Criteria) this;
        }

        public Criteria andFPFSGreaterThanOrEqualTo(String value) {
            addCriterion("FPFS >=", value, "FPFS");
            return (Criteria) this;
        }

        public Criteria andFPFSLessThan(String value) {
            addCriterion("FPFS <", value, "FPFS");
            return (Criteria) this;
        }

        public Criteria andFPFSLessThanOrEqualTo(String value) {
            addCriterion("FPFS <=", value, "FPFS");
            return (Criteria) this;
        }

        public Criteria andFPFSLike(String value) {
            addCriterion("FPFS like", value, "FPFS");
            return (Criteria) this;
        }

        public Criteria andFPFSNotLike(String value) {
            addCriterion("FPFS not like", value, "FPFS");
            return (Criteria) this;
        }

        public Criteria andFPFSIn(List<String> values) {
            addCriterion("FPFS in", values, "FPFS");
            return (Criteria) this;
        }

        public Criteria andFPFSNotIn(List<String> values) {
            addCriterion("FPFS not in", values, "FPFS");
            return (Criteria) this;
        }

        public Criteria andFPFSBetween(String value1, String value2) {
            addCriterion("FPFS between", value1, value2, "FPFS");
            return (Criteria) this;
        }

        public Criteria andFPFSNotBetween(String value1, String value2) {
            addCriterion("FPFS not between", value1, value2, "FPFS");
            return (Criteria) this;
        }

        public Criteria andFWFPZTIsNull() {
            addCriterion("FWFPZT is null");
            return (Criteria) this;
        }

        public Criteria andFWFPZTIsNotNull() {
            addCriterion("FWFPZT is not null");
            return (Criteria) this;
        }

        public Criteria andFWFPZTEqualTo(String value) {
            addCriterion("FWFPZT =", value, "FWFPZT");
            return (Criteria) this;
        }

        public Criteria andFWFPZTNotEqualTo(String value) {
            addCriterion("FWFPZT <>", value, "FWFPZT");
            return (Criteria) this;
        }

        public Criteria andFWFPZTGreaterThan(String value) {
            addCriterion("FWFPZT >", value, "FWFPZT");
            return (Criteria) this;
        }

        public Criteria andFWFPZTGreaterThanOrEqualTo(String value) {
            addCriterion("FWFPZT >=", value, "FWFPZT");
            return (Criteria) this;
        }

        public Criteria andFWFPZTLessThan(String value) {
            addCriterion("FWFPZT <", value, "FWFPZT");
            return (Criteria) this;
        }

        public Criteria andFWFPZTLessThanOrEqualTo(String value) {
            addCriterion("FWFPZT <=", value, "FWFPZT");
            return (Criteria) this;
        }

        public Criteria andFWFPZTLike(String value) {
            addCriterion("FWFPZT like", value, "FWFPZT");
            return (Criteria) this;
        }

        public Criteria andFWFPZTNotLike(String value) {
            addCriterion("FWFPZT not like", value, "FWFPZT");
            return (Criteria) this;
        }

        public Criteria andFWFPZTIn(List<String> values) {
            addCriterion("FWFPZT in", values, "FWFPZT");
            return (Criteria) this;
        }

        public Criteria andFWFPZTNotIn(List<String> values) {
            addCriterion("FWFPZT not in", values, "FWFPZT");
            return (Criteria) this;
        }

        public Criteria andFWFPZTBetween(String value1, String value2) {
            addCriterion("FWFPZT between", value1, value2, "FWFPZT");
            return (Criteria) this;
        }

        public Criteria andFWFPZTNotBetween(String value1, String value2) {
            addCriterion("FWFPZT not between", value1, value2, "FWFPZT");
            return (Criteria) this;
        }

        public Criteria andSCPZSJIsNull() {
            addCriterion("SCPZSJ is null");
            return (Criteria) this;
        }

        public Criteria andSCPZSJIsNotNull() {
            addCriterion("SCPZSJ is not null");
            return (Criteria) this;
        }

        public Criteria andSCPZSJEqualTo(Date value) {
            addCriterion("SCPZSJ =", value, "SCPZSJ");
            return (Criteria) this;
        }

        public Criteria andSCPZSJNotEqualTo(Date value) {
            addCriterion("SCPZSJ <>", value, "SCPZSJ");
            return (Criteria) this;
        }

        public Criteria andSCPZSJGreaterThan(Date value) {
            addCriterion("SCPZSJ >", value, "SCPZSJ");
            return (Criteria) this;
        }

        public Criteria andSCPZSJGreaterThanOrEqualTo(Date value) {
            addCriterion("SCPZSJ >=", value, "SCPZSJ");
            return (Criteria) this;
        }

        public Criteria andSCPZSJLessThan(Date value) {
            addCriterion("SCPZSJ <", value, "SCPZSJ");
            return (Criteria) this;
        }

        public Criteria andSCPZSJLessThanOrEqualTo(Date value) {
            addCriterion("SCPZSJ <=", value, "SCPZSJ");
            return (Criteria) this;
        }

        public Criteria andSCPZSJIn(List<Date> values) {
            addCriterion("SCPZSJ in", values, "SCPZSJ");
            return (Criteria) this;
        }

        public Criteria andSCPZSJNotIn(List<Date> values) {
            addCriterion("SCPZSJ not in", values, "SCPZSJ");
            return (Criteria) this;
        }

        public Criteria andSCPZSJBetween(Date value1, Date value2) {
            addCriterion("SCPZSJ between", value1, value2, "SCPZSJ");
            return (Criteria) this;
        }

        public Criteria andSCPZSJNotBetween(Date value1, Date value2) {
            addCriterion("SCPZSJ not between", value1, value2, "SCPZSJ");
            return (Criteria) this;
        }

        public Criteria andCCPZSJIsNull() {
            addCriterion("CCPZSJ is null");
            return (Criteria) this;
        }

        public Criteria andCCPZSJIsNotNull() {
            addCriterion("CCPZSJ is not null");
            return (Criteria) this;
        }

        public Criteria andCCPZSJEqualTo(Date value) {
            addCriterion("CCPZSJ =", value, "CCPZSJ");
            return (Criteria) this;
        }

        public Criteria andCCPZSJNotEqualTo(Date value) {
            addCriterion("CCPZSJ <>", value, "CCPZSJ");
            return (Criteria) this;
        }

        public Criteria andCCPZSJGreaterThan(Date value) {
            addCriterion("CCPZSJ >", value, "CCPZSJ");
            return (Criteria) this;
        }

        public Criteria andCCPZSJGreaterThanOrEqualTo(Date value) {
            addCriterion("CCPZSJ >=", value, "CCPZSJ");
            return (Criteria) this;
        }

        public Criteria andCCPZSJLessThan(Date value) {
            addCriterion("CCPZSJ <", value, "CCPZSJ");
            return (Criteria) this;
        }

        public Criteria andCCPZSJLessThanOrEqualTo(Date value) {
            addCriterion("CCPZSJ <=", value, "CCPZSJ");
            return (Criteria) this;
        }

        public Criteria andCCPZSJIn(List<Date> values) {
            addCriterion("CCPZSJ in", values, "CCPZSJ");
            return (Criteria) this;
        }

        public Criteria andCCPZSJNotIn(List<Date> values) {
            addCriterion("CCPZSJ not in", values, "CCPZSJ");
            return (Criteria) this;
        }

        public Criteria andCCPZSJBetween(Date value1, Date value2) {
            addCriterion("CCPZSJ between", value1, value2, "CCPZSJ");
            return (Criteria) this;
        }

        public Criteria andCCPZSJNotBetween(Date value1, Date value2) {
            addCriterion("CCPZSJ not between", value1, value2, "CCPZSJ");
            return (Criteria) this;
        }

        public Criteria andLJSYSJIsNull() {
            addCriterion("LJSYSJ is null");
            return (Criteria) this;
        }

        public Criteria andLJSYSJIsNotNull() {
            addCriterion("LJSYSJ is not null");
            return (Criteria) this;
        }

        public Criteria andLJSYSJEqualTo(Short value) {
            addCriterion("LJSYSJ =", value, "LJSYSJ");
            return (Criteria) this;
        }

        public Criteria andLJSYSJNotEqualTo(Short value) {
            addCriterion("LJSYSJ <>", value, "LJSYSJ");
            return (Criteria) this;
        }

        public Criteria andLJSYSJGreaterThan(Short value) {
            addCriterion("LJSYSJ >", value, "LJSYSJ");
            return (Criteria) this;
        }

        public Criteria andLJSYSJGreaterThanOrEqualTo(Short value) {
            addCriterion("LJSYSJ >=", value, "LJSYSJ");
            return (Criteria) this;
        }

        public Criteria andLJSYSJLessThan(Short value) {
            addCriterion("LJSYSJ <", value, "LJSYSJ");
            return (Criteria) this;
        }

        public Criteria andLJSYSJLessThanOrEqualTo(Short value) {
            addCriterion("LJSYSJ <=", value, "LJSYSJ");
            return (Criteria) this;
        }

        public Criteria andLJSYSJIn(List<Short> values) {
            addCriterion("LJSYSJ in", values, "LJSYSJ");
            return (Criteria) this;
        }

        public Criteria andLJSYSJNotIn(List<Short> values) {
            addCriterion("LJSYSJ not in", values, "LJSYSJ");
            return (Criteria) this;
        }

        public Criteria andLJSYSJBetween(Short value1, Short value2) {
            addCriterion("LJSYSJ between", value1, value2, "LJSYSJ");
            return (Criteria) this;
        }

        public Criteria andLJSYSJNotBetween(Short value1, Short value2) {
            addCriterion("LJSYSJ not between", value1, value2, "LJSYSJ");
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

        public Criteria andFWJGIsNull() {
            addCriterion("FWJG is null");
            return (Criteria) this;
        }

        public Criteria andFWJGIsNotNull() {
            addCriterion("FWJG is not null");
            return (Criteria) this;
        }

        public Criteria andFWJGEqualTo(String value) {
            addCriterion("FWJG =", value, "FWJG");
            return (Criteria) this;
        }

        public Criteria andFWJGNotEqualTo(String value) {
            addCriterion("FWJG <>", value, "FWJG");
            return (Criteria) this;
        }

        public Criteria andFWJGGreaterThan(String value) {
            addCriterion("FWJG >", value, "FWJG");
            return (Criteria) this;
        }

        public Criteria andFWJGGreaterThanOrEqualTo(String value) {
            addCriterion("FWJG >=", value, "FWJG");
            return (Criteria) this;
        }

        public Criteria andFWJGLessThan(String value) {
            addCriterion("FWJG <", value, "FWJG");
            return (Criteria) this;
        }

        public Criteria andFWJGLessThanOrEqualTo(String value) {
            addCriterion("FWJG <=", value, "FWJG");
            return (Criteria) this;
        }

        public Criteria andFWJGLike(String value) {
            addCriterion("FWJG like", value, "FWJG");
            return (Criteria) this;
        }

        public Criteria andFWJGNotLike(String value) {
            addCriterion("FWJG not like", value, "FWJG");
            return (Criteria) this;
        }

        public Criteria andFWJGIn(List<String> values) {
            addCriterion("FWJG in", values, "FWJG");
            return (Criteria) this;
        }

        public Criteria andFWJGNotIn(List<String> values) {
            addCriterion("FWJG not in", values, "FWJG");
            return (Criteria) this;
        }

        public Criteria andFWJGBetween(String value1, String value2) {
            addCriterion("FWJG between", value1, value2, "FWJG");
            return (Criteria) this;
        }

        public Criteria andFWJGNotBetween(String value1, String value2) {
            addCriterion("FWJG not between", value1, value2, "FWJG");
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

        public Criteria andJZMJEqualTo(Integer value) {
            addCriterion("JZMJ =", value, "JZMJ");
            return (Criteria) this;
        }

        public Criteria andJZMJNotEqualTo(Integer value) {
            addCriterion("JZMJ <>", value, "JZMJ");
            return (Criteria) this;
        }

        public Criteria andJZMJGreaterThan(Integer value) {
            addCriterion("JZMJ >", value, "JZMJ");
            return (Criteria) this;
        }

        public Criteria andJZMJGreaterThanOrEqualTo(Integer value) {
            addCriterion("JZMJ >=", value, "JZMJ");
            return (Criteria) this;
        }

        public Criteria andJZMJLessThan(Integer value) {
            addCriterion("JZMJ <", value, "JZMJ");
            return (Criteria) this;
        }

        public Criteria andJZMJLessThanOrEqualTo(Integer value) {
            addCriterion("JZMJ <=", value, "JZMJ");
            return (Criteria) this;
        }

        public Criteria andJZMJIn(List<Integer> values) {
            addCriterion("JZMJ in", values, "JZMJ");
            return (Criteria) this;
        }

        public Criteria andJZMJNotIn(List<Integer> values) {
            addCriterion("JZMJ not in", values, "JZMJ");
            return (Criteria) this;
        }

        public Criteria andJZMJBetween(Integer value1, Integer value2) {
            addCriterion("JZMJ between", value1, value2, "JZMJ");
            return (Criteria) this;
        }

        public Criteria andJZMJNotBetween(Integer value1, Integer value2) {
            addCriterion("JZMJ not between", value1, value2, "JZMJ");
            return (Criteria) this;
        }

        public Criteria andTNJZMJIsNull() {
            addCriterion("TNJZMJ is null");
            return (Criteria) this;
        }

        public Criteria andTNJZMJIsNotNull() {
            addCriterion("TNJZMJ is not null");
            return (Criteria) this;
        }

        public Criteria andTNJZMJEqualTo(Integer value) {
            addCriterion("TNJZMJ =", value, "TNJZMJ");
            return (Criteria) this;
        }

        public Criteria andTNJZMJNotEqualTo(Integer value) {
            addCriterion("TNJZMJ <>", value, "TNJZMJ");
            return (Criteria) this;
        }

        public Criteria andTNJZMJGreaterThan(Integer value) {
            addCriterion("TNJZMJ >", value, "TNJZMJ");
            return (Criteria) this;
        }

        public Criteria andTNJZMJGreaterThanOrEqualTo(Integer value) {
            addCriterion("TNJZMJ >=", value, "TNJZMJ");
            return (Criteria) this;
        }

        public Criteria andTNJZMJLessThan(Integer value) {
            addCriterion("TNJZMJ <", value, "TNJZMJ");
            return (Criteria) this;
        }

        public Criteria andTNJZMJLessThanOrEqualTo(Integer value) {
            addCriterion("TNJZMJ <=", value, "TNJZMJ");
            return (Criteria) this;
        }

        public Criteria andTNJZMJIn(List<Integer> values) {
            addCriterion("TNJZMJ in", values, "TNJZMJ");
            return (Criteria) this;
        }

        public Criteria andTNJZMJNotIn(List<Integer> values) {
            addCriterion("TNJZMJ not in", values, "TNJZMJ");
            return (Criteria) this;
        }

        public Criteria andTNJZMJBetween(Integer value1, Integer value2) {
            addCriterion("TNJZMJ between", value1, value2, "TNJZMJ");
            return (Criteria) this;
        }

        public Criteria andTNJZMJNotBetween(Integer value1, Integer value2) {
            addCriterion("TNJZMJ not between", value1, value2, "TNJZMJ");
            return (Criteria) this;
        }

        public Criteria andFTGGMJIsNull() {
            addCriterion("FTGGMJ is null");
            return (Criteria) this;
        }

        public Criteria andFTGGMJIsNotNull() {
            addCriterion("FTGGMJ is not null");
            return (Criteria) this;
        }

        public Criteria andFTGGMJEqualTo(Integer value) {
            addCriterion("FTGGMJ =", value, "FTGGMJ");
            return (Criteria) this;
        }

        public Criteria andFTGGMJNotEqualTo(Integer value) {
            addCriterion("FTGGMJ <>", value, "FTGGMJ");
            return (Criteria) this;
        }

        public Criteria andFTGGMJGreaterThan(Integer value) {
            addCriterion("FTGGMJ >", value, "FTGGMJ");
            return (Criteria) this;
        }

        public Criteria andFTGGMJGreaterThanOrEqualTo(Integer value) {
            addCriterion("FTGGMJ >=", value, "FTGGMJ");
            return (Criteria) this;
        }

        public Criteria andFTGGMJLessThan(Integer value) {
            addCriterion("FTGGMJ <", value, "FTGGMJ");
            return (Criteria) this;
        }

        public Criteria andFTGGMJLessThanOrEqualTo(Integer value) {
            addCriterion("FTGGMJ <=", value, "FTGGMJ");
            return (Criteria) this;
        }

        public Criteria andFTGGMJIn(List<Integer> values) {
            addCriterion("FTGGMJ in", values, "FTGGMJ");
            return (Criteria) this;
        }

        public Criteria andFTGGMJNotIn(List<Integer> values) {
            addCriterion("FTGGMJ not in", values, "FTGGMJ");
            return (Criteria) this;
        }

        public Criteria andFTGGMJBetween(Integer value1, Integer value2) {
            addCriterion("FTGGMJ between", value1, value2, "FTGGMJ");
            return (Criteria) this;
        }

        public Criteria andFTGGMJNotBetween(Integer value1, Integer value2) {
            addCriterion("FTGGMJ not between", value1, value2, "FTGGMJ");
            return (Criteria) this;
        }

        public Criteria andSYMJIsNull() {
            addCriterion("SYMJ is null");
            return (Criteria) this;
        }

        public Criteria andSYMJIsNotNull() {
            addCriterion("SYMJ is not null");
            return (Criteria) this;
        }

        public Criteria andSYMJEqualTo(Integer value) {
            addCriterion("SYMJ =", value, "SYMJ");
            return (Criteria) this;
        }

        public Criteria andSYMJNotEqualTo(Integer value) {
            addCriterion("SYMJ <>", value, "SYMJ");
            return (Criteria) this;
        }

        public Criteria andSYMJGreaterThan(Integer value) {
            addCriterion("SYMJ >", value, "SYMJ");
            return (Criteria) this;
        }

        public Criteria andSYMJGreaterThanOrEqualTo(Integer value) {
            addCriterion("SYMJ >=", value, "SYMJ");
            return (Criteria) this;
        }

        public Criteria andSYMJLessThan(Integer value) {
            addCriterion("SYMJ <", value, "SYMJ");
            return (Criteria) this;
        }

        public Criteria andSYMJLessThanOrEqualTo(Integer value) {
            addCriterion("SYMJ <=", value, "SYMJ");
            return (Criteria) this;
        }

        public Criteria andSYMJIn(List<Integer> values) {
            addCriterion("SYMJ in", values, "SYMJ");
            return (Criteria) this;
        }

        public Criteria andSYMJNotIn(List<Integer> values) {
            addCriterion("SYMJ not in", values, "SYMJ");
            return (Criteria) this;
        }

        public Criteria andSYMJBetween(Integer value1, Integer value2) {
            addCriterion("SYMJ between", value1, value2, "SYMJ");
            return (Criteria) this;
        }

        public Criteria andSYMJNotBetween(Integer value1, Integer value2) {
            addCriterion("SYMJ not between", value1, value2, "SYMJ");
            return (Criteria) this;
        }

        public Criteria andJGSJIsNull() {
            addCriterion("JGSJ is null");
            return (Criteria) this;
        }

        public Criteria andJGSJIsNotNull() {
            addCriterion("JGSJ is not null");
            return (Criteria) this;
        }

        public Criteria andJGSJEqualTo(Date value) {
            addCriterion("JGSJ =", value, "JGSJ");
            return (Criteria) this;
        }

        public Criteria andJGSJNotEqualTo(Date value) {
            addCriterion("JGSJ <>", value, "JGSJ");
            return (Criteria) this;
        }

        public Criteria andJGSJGreaterThan(Date value) {
            addCriterion("JGSJ >", value, "JGSJ");
            return (Criteria) this;
        }

        public Criteria andJGSJGreaterThanOrEqualTo(Date value) {
            addCriterion("JGSJ >=", value, "JGSJ");
            return (Criteria) this;
        }

        public Criteria andJGSJLessThan(Date value) {
            addCriterion("JGSJ <", value, "JGSJ");
            return (Criteria) this;
        }

        public Criteria andJGSJLessThanOrEqualTo(Date value) {
            addCriterion("JGSJ <=", value, "JGSJ");
            return (Criteria) this;
        }

        public Criteria andJGSJIn(List<Date> values) {
            addCriterion("JGSJ in", values, "JGSJ");
            return (Criteria) this;
        }

        public Criteria andJGSJNotIn(List<Date> values) {
            addCriterion("JGSJ not in", values, "JGSJ");
            return (Criteria) this;
        }

        public Criteria andJGSJBetween(Date value1, Date value2) {
            addCriterion("JGSJ between", value1, value2, "JGSJ");
            return (Criteria) this;
        }

        public Criteria andJGSJNotBetween(Date value1, Date value2) {
            addCriterion("JGSJ not between", value1, value2, "JGSJ");
            return (Criteria) this;
        }

        public Criteria andJSSJIsNull() {
            addCriterion("JSSJ is null");
            return (Criteria) this;
        }

        public Criteria andJSSJIsNotNull() {
            addCriterion("JSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andJSSJEqualTo(Date value) {
            addCriterion("JSSJ =", value, "JSSJ");
            return (Criteria) this;
        }

        public Criteria andJSSJNotEqualTo(Date value) {
            addCriterion("JSSJ <>", value, "JSSJ");
            return (Criteria) this;
        }

        public Criteria andJSSJGreaterThan(Date value) {
            addCriterion("JSSJ >", value, "JSSJ");
            return (Criteria) this;
        }

        public Criteria andJSSJGreaterThanOrEqualTo(Date value) {
            addCriterion("JSSJ >=", value, "JSSJ");
            return (Criteria) this;
        }

        public Criteria andJSSJLessThan(Date value) {
            addCriterion("JSSJ <", value, "JSSJ");
            return (Criteria) this;
        }

        public Criteria andJSSJLessThanOrEqualTo(Date value) {
            addCriterion("JSSJ <=", value, "JSSJ");
            return (Criteria) this;
        }

        public Criteria andJSSJIn(List<Date> values) {
            addCriterion("JSSJ in", values, "JSSJ");
            return (Criteria) this;
        }

        public Criteria andJSSJNotIn(List<Date> values) {
            addCriterion("JSSJ not in", values, "JSSJ");
            return (Criteria) this;
        }

        public Criteria andJSSJBetween(Date value1, Date value2) {
            addCriterion("JSSJ between", value1, value2, "JSSJ");
            return (Criteria) this;
        }

        public Criteria andJSSJNotBetween(Date value1, Date value2) {
            addCriterion("JSSJ not between", value1, value2, "JSSJ");
            return (Criteria) this;
        }

        public Criteria andKPZZHSIsNull() {
            addCriterion("KPZZHS is null");
            return (Criteria) this;
        }

        public Criteria andKPZZHSIsNotNull() {
            addCriterion("KPZZHS is not null");
            return (Criteria) this;
        }

        public Criteria andKPZZHSEqualTo(Integer value) {
            addCriterion("KPZZHS =", value, "KPZZHS");
            return (Criteria) this;
        }

        public Criteria andKPZZHSNotEqualTo(Integer value) {
            addCriterion("KPZZHS <>", value, "KPZZHS");
            return (Criteria) this;
        }

        public Criteria andKPZZHSGreaterThan(Integer value) {
            addCriterion("KPZZHS >", value, "KPZZHS");
            return (Criteria) this;
        }

        public Criteria andKPZZHSGreaterThanOrEqualTo(Integer value) {
            addCriterion("KPZZHS >=", value, "KPZZHS");
            return (Criteria) this;
        }

        public Criteria andKPZZHSLessThan(Integer value) {
            addCriterion("KPZZHS <", value, "KPZZHS");
            return (Criteria) this;
        }

        public Criteria andKPZZHSLessThanOrEqualTo(Integer value) {
            addCriterion("KPZZHS <=", value, "KPZZHS");
            return (Criteria) this;
        }

        public Criteria andKPZZHSIn(List<Integer> values) {
            addCriterion("KPZZHS in", values, "KPZZHS");
            return (Criteria) this;
        }

        public Criteria andKPZZHSNotIn(List<Integer> values) {
            addCriterion("KPZZHS not in", values, "KPZZHS");
            return (Criteria) this;
        }

        public Criteria andKPZZHSBetween(Integer value1, Integer value2) {
            addCriterion("KPZZHS between", value1, value2, "KPZZHS");
            return (Criteria) this;
        }

        public Criteria andKPZZHSNotBetween(Integer value1, Integer value2) {
            addCriterion("KPZZHS not between", value1, value2, "KPZZHS");
            return (Criteria) this;
        }

        public Criteria andYPZHSIsNull() {
            addCriterion("YPZHS is null");
            return (Criteria) this;
        }

        public Criteria andYPZHSIsNotNull() {
            addCriterion("YPZHS is not null");
            return (Criteria) this;
        }

        public Criteria andYPZHSEqualTo(Integer value) {
            addCriterion("YPZHS =", value, "YPZHS");
            return (Criteria) this;
        }

        public Criteria andYPZHSNotEqualTo(Integer value) {
            addCriterion("YPZHS <>", value, "YPZHS");
            return (Criteria) this;
        }

        public Criteria andYPZHSGreaterThan(Integer value) {
            addCriterion("YPZHS >", value, "YPZHS");
            return (Criteria) this;
        }

        public Criteria andYPZHSGreaterThanOrEqualTo(Integer value) {
            addCriterion("YPZHS >=", value, "YPZHS");
            return (Criteria) this;
        }

        public Criteria andYPZHSLessThan(Integer value) {
            addCriterion("YPZHS <", value, "YPZHS");
            return (Criteria) this;
        }

        public Criteria andYPZHSLessThanOrEqualTo(Integer value) {
            addCriterion("YPZHS <=", value, "YPZHS");
            return (Criteria) this;
        }

        public Criteria andYPZHSIn(List<Integer> values) {
            addCriterion("YPZHS in", values, "YPZHS");
            return (Criteria) this;
        }

        public Criteria andYPZHSNotIn(List<Integer> values) {
            addCriterion("YPZHS not in", values, "YPZHS");
            return (Criteria) this;
        }

        public Criteria andYPZHSBetween(Integer value1, Integer value2) {
            addCriterion("YPZHS between", value1, value2, "YPZHS");
            return (Criteria) this;
        }

        public Criteria andYPZHSNotBetween(Integer value1, Integer value2) {
            addCriterion("YPZHS not between", value1, value2, "YPZHS");
            return (Criteria) this;
        }

        public Criteria andFHIsNull() {
            addCriterion("FH is null");
            return (Criteria) this;
        }

        public Criteria andFHIsNotNull() {
            addCriterion("FH is not null");
            return (Criteria) this;
        }

        public Criteria andFHEqualTo(String value) {
            addCriterion("FH =", value, "FH");
            return (Criteria) this;
        }

        public Criteria andFHNotEqualTo(String value) {
            addCriterion("FH <>", value, "FH");
            return (Criteria) this;
        }

        public Criteria andFHGreaterThan(String value) {
            addCriterion("FH >", value, "FH");
            return (Criteria) this;
        }

        public Criteria andFHGreaterThanOrEqualTo(String value) {
            addCriterion("FH >=", value, "FH");
            return (Criteria) this;
        }

        public Criteria andFHLessThan(String value) {
            addCriterion("FH <", value, "FH");
            return (Criteria) this;
        }

        public Criteria andFHLessThanOrEqualTo(String value) {
            addCriterion("FH <=", value, "FH");
            return (Criteria) this;
        }

        public Criteria andFHLike(String value) {
            addCriterion("FH like", value, "FH");
            return (Criteria) this;
        }

        public Criteria andFHNotLike(String value) {
            addCriterion("FH not like", value, "FH");
            return (Criteria) this;
        }

        public Criteria andFHIn(List<String> values) {
            addCriterion("FH in", values, "FH");
            return (Criteria) this;
        }

        public Criteria andFHNotIn(List<String> values) {
            addCriterion("FH not in", values, "FH");
            return (Criteria) this;
        }

        public Criteria andFHBetween(String value1, String value2) {
            addCriterion("FH between", value1, value2, "FH");
            return (Criteria) this;
        }

        public Criteria andFHNotBetween(String value1, String value2) {
            addCriterion("FH not between", value1, value2, "FH");
            return (Criteria) this;
        }

        public Criteria andDYIDIsNull() {
            addCriterion("DYID is null");
            return (Criteria) this;
        }

        public Criteria andDYIDIsNotNull() {
            addCriterion("DYID is not null");
            return (Criteria) this;
        }

        public Criteria andDYIDEqualTo(String value) {
            addCriterion("DYID =", value, "DYID");
            return (Criteria) this;
        }

        public Criteria andDYIDNotEqualTo(String value) {
            addCriterion("DYID <>", value, "DYID");
            return (Criteria) this;
        }

        public Criteria andDYIDGreaterThan(String value) {
            addCriterion("DYID >", value, "DYID");
            return (Criteria) this;
        }

        public Criteria andDYIDGreaterThanOrEqualTo(String value) {
            addCriterion("DYID >=", value, "DYID");
            return (Criteria) this;
        }

        public Criteria andDYIDLessThan(String value) {
            addCriterion("DYID <", value, "DYID");
            return (Criteria) this;
        }

        public Criteria andDYIDLessThanOrEqualTo(String value) {
            addCriterion("DYID <=", value, "DYID");
            return (Criteria) this;
        }

        public Criteria andDYIDLike(String value) {
            addCriterion("DYID like", value, "DYID");
            return (Criteria) this;
        }

        public Criteria andDYIDNotLike(String value) {
            addCriterion("DYID not like", value, "DYID");
            return (Criteria) this;
        }

        public Criteria andDYIDIn(List<String> values) {
            addCriterion("DYID in", values, "DYID");
            return (Criteria) this;
        }

        public Criteria andDYIDNotIn(List<String> values) {
            addCriterion("DYID not in", values, "DYID");
            return (Criteria) this;
        }

        public Criteria andDYIDBetween(String value1, String value2) {
            addCriterion("DYID between", value1, value2, "DYID");
            return (Criteria) this;
        }

        public Criteria andDYIDNotBetween(String value1, String value2) {
            addCriterion("DYID not between", value1, value2, "DYID");
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

        public Criteria andFWLXIsNull() {
            addCriterion("FWLX is null");
            return (Criteria) this;
        }

        public Criteria andFWLXIsNotNull() {
            addCriterion("FWLX is not null");
            return (Criteria) this;
        }

        public Criteria andFWLXEqualTo(String value) {
            addCriterion("FWLX =", value, "FWLX");
            return (Criteria) this;
        }

        public Criteria andFWLXNotEqualTo(String value) {
            addCriterion("FWLX <>", value, "FWLX");
            return (Criteria) this;
        }

        public Criteria andFWLXGreaterThan(String value) {
            addCriterion("FWLX >", value, "FWLX");
            return (Criteria) this;
        }

        public Criteria andFWLXGreaterThanOrEqualTo(String value) {
            addCriterion("FWLX >=", value, "FWLX");
            return (Criteria) this;
        }

        public Criteria andFWLXLessThan(String value) {
            addCriterion("FWLX <", value, "FWLX");
            return (Criteria) this;
        }

        public Criteria andFWLXLessThanOrEqualTo(String value) {
            addCriterion("FWLX <=", value, "FWLX");
            return (Criteria) this;
        }

        public Criteria andFWLXLike(String value) {
            addCriterion("FWLX like", value, "FWLX");
            return (Criteria) this;
        }

        public Criteria andFWLXNotLike(String value) {
            addCriterion("FWLX not like", value, "FWLX");
            return (Criteria) this;
        }

        public Criteria andFWLXIn(List<String> values) {
            addCriterion("FWLX in", values, "FWLX");
            return (Criteria) this;
        }

        public Criteria andFWLXNotIn(List<String> values) {
            addCriterion("FWLX not in", values, "FWLX");
            return (Criteria) this;
        }

        public Criteria andFWLXBetween(String value1, String value2) {
            addCriterion("FWLX between", value1, value2, "FWLX");
            return (Criteria) this;
        }

        public Criteria andFWLXNotBetween(String value1, String value2) {
            addCriterion("FWLX not between", value1, value2, "FWLX");
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

        public Criteria andZHIsNull() {
            addCriterion("ZH is null");
            return (Criteria) this;
        }

        public Criteria andZHIsNotNull() {
            addCriterion("ZH is not null");
            return (Criteria) this;
        }

        public Criteria andZHEqualTo(String value) {
            addCriterion("ZH =", value, "ZH");
            return (Criteria) this;
        }

        public Criteria andZHNotEqualTo(String value) {
            addCriterion("ZH <>", value, "ZH");
            return (Criteria) this;
        }

        public Criteria andZHGreaterThan(String value) {
            addCriterion("ZH >", value, "ZH");
            return (Criteria) this;
        }

        public Criteria andZHGreaterThanOrEqualTo(String value) {
            addCriterion("ZH >=", value, "ZH");
            return (Criteria) this;
        }

        public Criteria andZHLessThan(String value) {
            addCriterion("ZH <", value, "ZH");
            return (Criteria) this;
        }

        public Criteria andZHLessThanOrEqualTo(String value) {
            addCriterion("ZH <=", value, "ZH");
            return (Criteria) this;
        }

        public Criteria andZHLike(String value) {
            addCriterion("ZH like", value, "ZH");
            return (Criteria) this;
        }

        public Criteria andZHNotLike(String value) {
            addCriterion("ZH not like", value, "ZH");
            return (Criteria) this;
        }

        public Criteria andZHIn(List<String> values) {
            addCriterion("ZH in", values, "ZH");
            return (Criteria) this;
        }

        public Criteria andZHNotIn(List<String> values) {
            addCriterion("ZH not in", values, "ZH");
            return (Criteria) this;
        }

        public Criteria andZHBetween(String value1, String value2) {
            addCriterion("ZH between", value1, value2, "ZH");
            return (Criteria) this;
        }

        public Criteria andZHNotBetween(String value1, String value2) {
            addCriterion("ZH not between", value1, value2, "ZH");
            return (Criteria) this;
        }

        public Criteria andDHIsNull() {
            addCriterion("DH is null");
            return (Criteria) this;
        }

        public Criteria andDHIsNotNull() {
            addCriterion("DH is not null");
            return (Criteria) this;
        }

        public Criteria andDHEqualTo(String value) {
            addCriterion("DH =", value, "DH");
            return (Criteria) this;
        }

        public Criteria andDHNotEqualTo(String value) {
            addCriterion("DH <>", value, "DH");
            return (Criteria) this;
        }

        public Criteria andDHGreaterThan(String value) {
            addCriterion("DH >", value, "DH");
            return (Criteria) this;
        }

        public Criteria andDHGreaterThanOrEqualTo(String value) {
            addCriterion("DH >=", value, "DH");
            return (Criteria) this;
        }

        public Criteria andDHLessThan(String value) {
            addCriterion("DH <", value, "DH");
            return (Criteria) this;
        }

        public Criteria andDHLessThanOrEqualTo(String value) {
            addCriterion("DH <=", value, "DH");
            return (Criteria) this;
        }

        public Criteria andDHLike(String value) {
            addCriterion("DH like", value, "DH");
            return (Criteria) this;
        }

        public Criteria andDHNotLike(String value) {
            addCriterion("DH not like", value, "DH");
            return (Criteria) this;
        }

        public Criteria andDHIn(List<String> values) {
            addCriterion("DH in", values, "DH");
            return (Criteria) this;
        }

        public Criteria andDHNotIn(List<String> values) {
            addCriterion("DH not in", values, "DH");
            return (Criteria) this;
        }

        public Criteria andDHBetween(String value1, String value2) {
            addCriterion("DH between", value1, value2, "DH");
            return (Criteria) this;
        }

        public Criteria andDHNotBetween(String value1, String value2) {
            addCriterion("DH not between", value1, value2, "DH");
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

        public Criteria andHBPCIDIsNull() {
            addCriterion("HBPCID is null");
            return (Criteria) this;
        }

        public Criteria andHBPCIDIsNotNull() {
            addCriterion("HBPCID is not null");
            return (Criteria) this;
        }

        public Criteria andHBPCIDEqualTo(String value) {
            addCriterion("HBPCID =", value, "HBPCID");
            return (Criteria) this;
        }

        public Criteria andHBPCIDNotEqualTo(String value) {
            addCriterion("HBPCID <>", value, "HBPCID");
            return (Criteria) this;
        }

        public Criteria andHBPCIDGreaterThan(String value) {
            addCriterion("HBPCID >", value, "HBPCID");
            return (Criteria) this;
        }

        public Criteria andHBPCIDGreaterThanOrEqualTo(String value) {
            addCriterion("HBPCID >=", value, "HBPCID");
            return (Criteria) this;
        }

        public Criteria andHBPCIDLessThan(String value) {
            addCriterion("HBPCID <", value, "HBPCID");
            return (Criteria) this;
        }

        public Criteria andHBPCIDLessThanOrEqualTo(String value) {
            addCriterion("HBPCID <=", value, "HBPCID");
            return (Criteria) this;
        }

        public Criteria andHBPCIDLike(String value) {
            addCriterion("HBPCID like", value, "HBPCID");
            return (Criteria) this;
        }

        public Criteria andHBPCIDNotLike(String value) {
            addCriterion("HBPCID not like", value, "HBPCID");
            return (Criteria) this;
        }

        public Criteria andHBPCIDIn(List<String> values) {
            addCriterion("HBPCID in", values, "HBPCID");
            return (Criteria) this;
        }

        public Criteria andHBPCIDNotIn(List<String> values) {
            addCriterion("HBPCID not in", values, "HBPCID");
            return (Criteria) this;
        }

        public Criteria andHBPCIDBetween(String value1, String value2) {
            addCriterion("HBPCID between", value1, value2, "HBPCID");
            return (Criteria) this;
        }

        public Criteria andHBPCIDNotBetween(String value1, String value2) {
            addCriterion("HBPCID not between", value1, value2, "HBPCID");
            return (Criteria) this;
        }

        public Criteria andHBSJIsNull() {
            addCriterion("HBSJ is null");
            return (Criteria) this;
        }

        public Criteria andHBSJIsNotNull() {
            addCriterion("HBSJ is not null");
            return (Criteria) this;
        }

        public Criteria andHBSJEqualTo(Date value) {
            addCriterion("HBSJ =", value, "HBSJ");
            return (Criteria) this;
        }

        public Criteria andHBSJNotEqualTo(Date value) {
            addCriterion("HBSJ <>", value, "HBSJ");
            return (Criteria) this;
        }

        public Criteria andHBSJGreaterThan(Date value) {
            addCriterion("HBSJ >", value, "HBSJ");
            return (Criteria) this;
        }

        public Criteria andHBSJGreaterThanOrEqualTo(Date value) {
            addCriterion("HBSJ >=", value, "HBSJ");
            return (Criteria) this;
        }

        public Criteria andHBSJLessThan(Date value) {
            addCriterion("HBSJ <", value, "HBSJ");
            return (Criteria) this;
        }

        public Criteria andHBSJLessThanOrEqualTo(Date value) {
            addCriterion("HBSJ <=", value, "HBSJ");
            return (Criteria) this;
        }

        public Criteria andHBSJIn(List<Date> values) {
            addCriterion("HBSJ in", values, "HBSJ");
            return (Criteria) this;
        }

        public Criteria andHBSJNotIn(List<Date> values) {
            addCriterion("HBSJ not in", values, "HBSJ");
            return (Criteria) this;
        }

        public Criteria andHBSJBetween(Date value1, Date value2) {
            addCriterion("HBSJ between", value1, value2, "HBSJ");
            return (Criteria) this;
        }

        public Criteria andHBSJNotBetween(Date value1, Date value2) {
            addCriterion("HBSJ not between", value1, value2, "HBSJ");
            return (Criteria) this;
        }

        public Criteria andHBRIsNull() {
            addCriterion("HBR is null");
            return (Criteria) this;
        }

        public Criteria andHBRIsNotNull() {
            addCriterion("HBR is not null");
            return (Criteria) this;
        }

        public Criteria andHBREqualTo(String value) {
            addCriterion("HBR =", value, "HBR");
            return (Criteria) this;
        }

        public Criteria andHBRNotEqualTo(String value) {
            addCriterion("HBR <>", value, "HBR");
            return (Criteria) this;
        }

        public Criteria andHBRGreaterThan(String value) {
            addCriterion("HBR >", value, "HBR");
            return (Criteria) this;
        }

        public Criteria andHBRGreaterThanOrEqualTo(String value) {
            addCriterion("HBR >=", value, "HBR");
            return (Criteria) this;
        }

        public Criteria andHBRLessThan(String value) {
            addCriterion("HBR <", value, "HBR");
            return (Criteria) this;
        }

        public Criteria andHBRLessThanOrEqualTo(String value) {
            addCriterion("HBR <=", value, "HBR");
            return (Criteria) this;
        }

        public Criteria andHBRLike(String value) {
            addCriterion("HBR like", value, "HBR");
            return (Criteria) this;
        }

        public Criteria andHBRNotLike(String value) {
            addCriterion("HBR not like", value, "HBR");
            return (Criteria) this;
        }

        public Criteria andHBRIn(List<String> values) {
            addCriterion("HBR in", values, "HBR");
            return (Criteria) this;
        }

        public Criteria andHBRNotIn(List<String> values) {
            addCriterion("HBR not in", values, "HBR");
            return (Criteria) this;
        }

        public Criteria andHBRBetween(String value1, String value2) {
            addCriterion("HBR between", value1, value2, "HBR");
            return (Criteria) this;
        }

        public Criteria andHBRNotBetween(String value1, String value2) {
            addCriterion("HBR not between", value1, value2, "HBR");
            return (Criteria) this;
        }

        public Criteria andLAYERIsNull() {
            addCriterion("LAYER is null");
            return (Criteria) this;
        }

        public Criteria andLAYERIsNotNull() {
            addCriterion("LAYER is not null");
            return (Criteria) this;
        }

        public Criteria andLAYEREqualTo(Integer value) {
            addCriterion("LAYER =", value, "LAYER");
            return (Criteria) this;
        }

        public Criteria andLAYERNotEqualTo(Integer value) {
            addCriterion("LAYER <>", value, "LAYER");
            return (Criteria) this;
        }

        public Criteria andLAYERGreaterThan(Integer value) {
            addCriterion("LAYER >", value, "LAYER");
            return (Criteria) this;
        }

        public Criteria andLAYERGreaterThanOrEqualTo(Integer value) {
            addCriterion("LAYER >=", value, "LAYER");
            return (Criteria) this;
        }

        public Criteria andLAYERLessThan(Integer value) {
            addCriterion("LAYER <", value, "LAYER");
            return (Criteria) this;
        }

        public Criteria andLAYERLessThanOrEqualTo(Integer value) {
            addCriterion("LAYER <=", value, "LAYER");
            return (Criteria) this;
        }

        public Criteria andLAYERIn(List<Integer> values) {
            addCriterion("LAYER in", values, "LAYER");
            return (Criteria) this;
        }

        public Criteria andLAYERNotIn(List<Integer> values) {
            addCriterion("LAYER not in", values, "LAYER");
            return (Criteria) this;
        }

        public Criteria andLAYERBetween(Integer value1, Integer value2) {
            addCriterion("LAYER between", value1, value2, "LAYER");
            return (Criteria) this;
        }

        public Criteria andLAYERNotBetween(Integer value1, Integer value2) {
            addCriterion("LAYER not between", value1, value2, "LAYER");
            return (Criteria) this;
        }

        public Criteria andFWLYIsNull() {
            addCriterion("FWLY is null");
            return (Criteria) this;
        }

        public Criteria andFWLYIsNotNull() {
            addCriterion("FWLY is not null");
            return (Criteria) this;
        }

        public Criteria andFWLYEqualTo(String value) {
            addCriterion("FWLY =", value, "FWLY");
            return (Criteria) this;
        }

        public Criteria andFWLYNotEqualTo(String value) {
            addCriterion("FWLY <>", value, "FWLY");
            return (Criteria) this;
        }

        public Criteria andFWLYGreaterThan(String value) {
            addCriterion("FWLY >", value, "FWLY");
            return (Criteria) this;
        }

        public Criteria andFWLYGreaterThanOrEqualTo(String value) {
            addCriterion("FWLY >=", value, "FWLY");
            return (Criteria) this;
        }

        public Criteria andFWLYLessThan(String value) {
            addCriterion("FWLY <", value, "FWLY");
            return (Criteria) this;
        }

        public Criteria andFWLYLessThanOrEqualTo(String value) {
            addCriterion("FWLY <=", value, "FWLY");
            return (Criteria) this;
        }

        public Criteria andFWLYLike(String value) {
            addCriterion("FWLY like", value, "FWLY");
            return (Criteria) this;
        }

        public Criteria andFWLYNotLike(String value) {
            addCriterion("FWLY not like", value, "FWLY");
            return (Criteria) this;
        }

        public Criteria andFWLYIn(List<String> values) {
            addCriterion("FWLY in", values, "FWLY");
            return (Criteria) this;
        }

        public Criteria andFWLYNotIn(List<String> values) {
            addCriterion("FWLY not in", values, "FWLY");
            return (Criteria) this;
        }

        public Criteria andFWLYBetween(String value1, String value2) {
            addCriterion("FWLY between", value1, value2, "FWLY");
            return (Criteria) this;
        }

        public Criteria andFWLYNotBetween(String value1, String value2) {
            addCriterion("FWLY not between", value1, value2, "FWLY");
            return (Criteria) this;
        }

        public Criteria andBZFYTYBHIsNull() {
            addCriterion("BZFYTYBH is null");
            return (Criteria) this;
        }

        public Criteria andBZFYTYBHIsNotNull() {
            addCriterion("BZFYTYBH is not null");
            return (Criteria) this;
        }

        public Criteria andBZFYTYBHEqualTo(String value) {
            addCriterion("BZFYTYBH =", value, "BZFYTYBH");
            return (Criteria) this;
        }

        public Criteria andBZFYTYBHNotEqualTo(String value) {
            addCriterion("BZFYTYBH <>", value, "BZFYTYBH");
            return (Criteria) this;
        }

        public Criteria andBZFYTYBHGreaterThan(String value) {
            addCriterion("BZFYTYBH >", value, "BZFYTYBH");
            return (Criteria) this;
        }

        public Criteria andBZFYTYBHGreaterThanOrEqualTo(String value) {
            addCriterion("BZFYTYBH >=", value, "BZFYTYBH");
            return (Criteria) this;
        }

        public Criteria andBZFYTYBHLessThan(String value) {
            addCriterion("BZFYTYBH <", value, "BZFYTYBH");
            return (Criteria) this;
        }

        public Criteria andBZFYTYBHLessThanOrEqualTo(String value) {
            addCriterion("BZFYTYBH <=", value, "BZFYTYBH");
            return (Criteria) this;
        }

        public Criteria andBZFYTYBHLike(String value) {
            addCriterion("BZFYTYBH like", value, "BZFYTYBH");
            return (Criteria) this;
        }

        public Criteria andBZFYTYBHNotLike(String value) {
            addCriterion("BZFYTYBH not like", value, "BZFYTYBH");
            return (Criteria) this;
        }

        public Criteria andBZFYTYBHIn(List<String> values) {
            addCriterion("BZFYTYBH in", values, "BZFYTYBH");
            return (Criteria) this;
        }

        public Criteria andBZFYTYBHNotIn(List<String> values) {
            addCriterion("BZFYTYBH not in", values, "BZFYTYBH");
            return (Criteria) this;
        }

        public Criteria andBZFYTYBHBetween(String value1, String value2) {
            addCriterion("BZFYTYBH between", value1, value2, "BZFYTYBH");
            return (Criteria) this;
        }

        public Criteria andBZFYTYBHNotBetween(String value1, String value2) {
            addCriterion("BZFYTYBH not between", value1, value2, "BZFYTYBH");
            return (Criteria) this;
        }

        public Criteria andBZXMTYBHIsNull() {
            addCriterion("BZXMTYBH is null");
            return (Criteria) this;
        }

        public Criteria andBZXMTYBHIsNotNull() {
            addCriterion("BZXMTYBH is not null");
            return (Criteria) this;
        }

        public Criteria andBZXMTYBHEqualTo(String value) {
            addCriterion("BZXMTYBH =", value, "BZXMTYBH");
            return (Criteria) this;
        }

        public Criteria andBZXMTYBHNotEqualTo(String value) {
            addCriterion("BZXMTYBH <>", value, "BZXMTYBH");
            return (Criteria) this;
        }

        public Criteria andBZXMTYBHGreaterThan(String value) {
            addCriterion("BZXMTYBH >", value, "BZXMTYBH");
            return (Criteria) this;
        }

        public Criteria andBZXMTYBHGreaterThanOrEqualTo(String value) {
            addCriterion("BZXMTYBH >=", value, "BZXMTYBH");
            return (Criteria) this;
        }

        public Criteria andBZXMTYBHLessThan(String value) {
            addCriterion("BZXMTYBH <", value, "BZXMTYBH");
            return (Criteria) this;
        }

        public Criteria andBZXMTYBHLessThanOrEqualTo(String value) {
            addCriterion("BZXMTYBH <=", value, "BZXMTYBH");
            return (Criteria) this;
        }

        public Criteria andBZXMTYBHLike(String value) {
            addCriterion("BZXMTYBH like", value, "BZXMTYBH");
            return (Criteria) this;
        }

        public Criteria andBZXMTYBHNotLike(String value) {
            addCriterion("BZXMTYBH not like", value, "BZXMTYBH");
            return (Criteria) this;
        }

        public Criteria andBZXMTYBHIn(List<String> values) {
            addCriterion("BZXMTYBH in", values, "BZXMTYBH");
            return (Criteria) this;
        }

        public Criteria andBZXMTYBHNotIn(List<String> values) {
            addCriterion("BZXMTYBH not in", values, "BZXMTYBH");
            return (Criteria) this;
        }

        public Criteria andBZXMTYBHBetween(String value1, String value2) {
            addCriterion("BZXMTYBH between", value1, value2, "BZXMTYBH");
            return (Criteria) this;
        }

        public Criteria andBZXMTYBHNotBetween(String value1, String value2) {
            addCriterion("BZXMTYBH not between", value1, value2, "BZXMTYBH");
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

        public Criteria andGLJZMJIsNull() {
            addCriterion("GLJZMJ is null");
            return (Criteria) this;
        }

        public Criteria andGLJZMJIsNotNull() {
            addCriterion("GLJZMJ is not null");
            return (Criteria) this;
        }

        public Criteria andGLJZMJEqualTo(Integer value) {
            addCriterion("GLJZMJ =", value, "GLJZMJ");
            return (Criteria) this;
        }

        public Criteria andGLJZMJNotEqualTo(Integer value) {
            addCriterion("GLJZMJ <>", value, "GLJZMJ");
            return (Criteria) this;
        }

        public Criteria andGLJZMJGreaterThan(Integer value) {
            addCriterion("GLJZMJ >", value, "GLJZMJ");
            return (Criteria) this;
        }

        public Criteria andGLJZMJGreaterThanOrEqualTo(Integer value) {
            addCriterion("GLJZMJ >=", value, "GLJZMJ");
            return (Criteria) this;
        }

        public Criteria andGLJZMJLessThan(Integer value) {
            addCriterion("GLJZMJ <", value, "GLJZMJ");
            return (Criteria) this;
        }

        public Criteria andGLJZMJLessThanOrEqualTo(Integer value) {
            addCriterion("GLJZMJ <=", value, "GLJZMJ");
            return (Criteria) this;
        }

        public Criteria andGLJZMJIn(List<Integer> values) {
            addCriterion("GLJZMJ in", values, "GLJZMJ");
            return (Criteria) this;
        }

        public Criteria andGLJZMJNotIn(List<Integer> values) {
            addCriterion("GLJZMJ not in", values, "GLJZMJ");
            return (Criteria) this;
        }

        public Criteria andGLJZMJBetween(Integer value1, Integer value2) {
            addCriterion("GLJZMJ between", value1, value2, "GLJZMJ");
            return (Criteria) this;
        }

        public Criteria andGLJZMJNotBetween(Integer value1, Integer value2) {
            addCriterion("GLJZMJ not between", value1, value2, "GLJZMJ");
            return (Criteria) this;
        }

        public Criteria andCCSMJIsNull() {
            addCriterion("CCSMJ is null");
            return (Criteria) this;
        }

        public Criteria andCCSMJIsNotNull() {
            addCriterion("CCSMJ is not null");
            return (Criteria) this;
        }

        public Criteria andCCSMJEqualTo(Integer value) {
            addCriterion("CCSMJ =", value, "CCSMJ");
            return (Criteria) this;
        }

        public Criteria andCCSMJNotEqualTo(Integer value) {
            addCriterion("CCSMJ <>", value, "CCSMJ");
            return (Criteria) this;
        }

        public Criteria andCCSMJGreaterThan(Integer value) {
            addCriterion("CCSMJ >", value, "CCSMJ");
            return (Criteria) this;
        }

        public Criteria andCCSMJGreaterThanOrEqualTo(Integer value) {
            addCriterion("CCSMJ >=", value, "CCSMJ");
            return (Criteria) this;
        }

        public Criteria andCCSMJLessThan(Integer value) {
            addCriterion("CCSMJ <", value, "CCSMJ");
            return (Criteria) this;
        }

        public Criteria andCCSMJLessThanOrEqualTo(Integer value) {
            addCriterion("CCSMJ <=", value, "CCSMJ");
            return (Criteria) this;
        }

        public Criteria andCCSMJIn(List<Integer> values) {
            addCriterion("CCSMJ in", values, "CCSMJ");
            return (Criteria) this;
        }

        public Criteria andCCSMJNotIn(List<Integer> values) {
            addCriterion("CCSMJ not in", values, "CCSMJ");
            return (Criteria) this;
        }

        public Criteria andCCSMJBetween(Integer value1, Integer value2) {
            addCriterion("CCSMJ between", value1, value2, "CCSMJ");
            return (Criteria) this;
        }

        public Criteria andCCSMJNotBetween(Integer value1, Integer value2) {
            addCriterion("CCSMJ not between", value1, value2, "CCSMJ");
            return (Criteria) this;
        }

        public Criteria andSFCTIsNull() {
            addCriterion("SFCT is null");
            return (Criteria) this;
        }

        public Criteria andSFCTIsNotNull() {
            addCriterion("SFCT is not null");
            return (Criteria) this;
        }

        public Criteria andSFCTEqualTo(Short value) {
            addCriterion("SFCT =", value, "SFCT");
            return (Criteria) this;
        }

        public Criteria andSFCTNotEqualTo(Short value) {
            addCriterion("SFCT <>", value, "SFCT");
            return (Criteria) this;
        }

        public Criteria andSFCTGreaterThan(Short value) {
            addCriterion("SFCT >", value, "SFCT");
            return (Criteria) this;
        }

        public Criteria andSFCTGreaterThanOrEqualTo(Short value) {
            addCriterion("SFCT >=", value, "SFCT");
            return (Criteria) this;
        }

        public Criteria andSFCTLessThan(Short value) {
            addCriterion("SFCT <", value, "SFCT");
            return (Criteria) this;
        }

        public Criteria andSFCTLessThanOrEqualTo(Short value) {
            addCriterion("SFCT <=", value, "SFCT");
            return (Criteria) this;
        }

        public Criteria andSFCTIn(List<Short> values) {
            addCriterion("SFCT in", values, "SFCT");
            return (Criteria) this;
        }

        public Criteria andSFCTNotIn(List<Short> values) {
            addCriterion("SFCT not in", values, "SFCT");
            return (Criteria) this;
        }

        public Criteria andSFCTBetween(Short value1, Short value2) {
            addCriterion("SFCT between", value1, value2, "SFCT");
            return (Criteria) this;
        }

        public Criteria andSFCTNotBetween(Short value1, Short value2) {
            addCriterion("SFCT not between", value1, value2, "SFCT");
            return (Criteria) this;
        }

        public Criteria andSFZTZLIsNull() {
            addCriterion("SFZTZL is null");
            return (Criteria) this;
        }

        public Criteria andSFZTZLIsNotNull() {
            addCriterion("SFZTZL is not null");
            return (Criteria) this;
        }

        public Criteria andSFZTZLEqualTo(Short value) {
            addCriterion("SFZTZL =", value, "SFZTZL");
            return (Criteria) this;
        }

        public Criteria andSFZTZLNotEqualTo(Short value) {
            addCriterion("SFZTZL <>", value, "SFZTZL");
            return (Criteria) this;
        }

        public Criteria andSFZTZLGreaterThan(Short value) {
            addCriterion("SFZTZL >", value, "SFZTZL");
            return (Criteria) this;
        }

        public Criteria andSFZTZLGreaterThanOrEqualTo(Short value) {
            addCriterion("SFZTZL >=", value, "SFZTZL");
            return (Criteria) this;
        }

        public Criteria andSFZTZLLessThan(Short value) {
            addCriterion("SFZTZL <", value, "SFZTZL");
            return (Criteria) this;
        }

        public Criteria andSFZTZLLessThanOrEqualTo(Short value) {
            addCriterion("SFZTZL <=", value, "SFZTZL");
            return (Criteria) this;
        }

        public Criteria andSFZTZLIn(List<Short> values) {
            addCriterion("SFZTZL in", values, "SFZTZL");
            return (Criteria) this;
        }

        public Criteria andSFZTZLNotIn(List<Short> values) {
            addCriterion("SFZTZL not in", values, "SFZTZL");
            return (Criteria) this;
        }

        public Criteria andSFZTZLBetween(Short value1, Short value2) {
            addCriterion("SFZTZL between", value1, value2, "SFZTZL");
            return (Criteria) this;
        }

        public Criteria andSFZTZLNotBetween(Short value1, Short value2) {
            addCriterion("SFZTZL not between", value1, value2, "SFZTZL");
            return (Criteria) this;
        }

        public Criteria andSFNRSJTZIsNull() {
            addCriterion("SFNRSJTZ is null");
            return (Criteria) this;
        }

        public Criteria andSFNRSJTZIsNotNull() {
            addCriterion("SFNRSJTZ is not null");
            return (Criteria) this;
        }

        public Criteria andSFNRSJTZEqualTo(Short value) {
            addCriterion("SFNRSJTZ =", value, "SFNRSJTZ");
            return (Criteria) this;
        }

        public Criteria andSFNRSJTZNotEqualTo(Short value) {
            addCriterion("SFNRSJTZ <>", value, "SFNRSJTZ");
            return (Criteria) this;
        }

        public Criteria andSFNRSJTZGreaterThan(Short value) {
            addCriterion("SFNRSJTZ >", value, "SFNRSJTZ");
            return (Criteria) this;
        }

        public Criteria andSFNRSJTZGreaterThanOrEqualTo(Short value) {
            addCriterion("SFNRSJTZ >=", value, "SFNRSJTZ");
            return (Criteria) this;
        }

        public Criteria andSFNRSJTZLessThan(Short value) {
            addCriterion("SFNRSJTZ <", value, "SFNRSJTZ");
            return (Criteria) this;
        }

        public Criteria andSFNRSJTZLessThanOrEqualTo(Short value) {
            addCriterion("SFNRSJTZ <=", value, "SFNRSJTZ");
            return (Criteria) this;
        }

        public Criteria andSFNRSJTZIn(List<Short> values) {
            addCriterion("SFNRSJTZ in", values, "SFNRSJTZ");
            return (Criteria) this;
        }

        public Criteria andSFNRSJTZNotIn(List<Short> values) {
            addCriterion("SFNRSJTZ not in", values, "SFNRSJTZ");
            return (Criteria) this;
        }

        public Criteria andSFNRSJTZBetween(Short value1, Short value2) {
            addCriterion("SFNRSJTZ between", value1, value2, "SFNRSJTZ");
            return (Criteria) this;
        }

        public Criteria andSFNRSJTZNotBetween(Short value1, Short value2) {
            addCriterion("SFNRSJTZ not between", value1, value2, "SFNRSJTZ");
            return (Criteria) this;
        }

        public Criteria andSFGDFIsNull() {
            addCriterion("SFGDF is null");
            return (Criteria) this;
        }

        public Criteria andSFGDFIsNotNull() {
            addCriterion("SFGDF is not null");
            return (Criteria) this;
        }

        public Criteria andSFGDFEqualTo(Short value) {
            addCriterion("SFGDF =", value, "SFGDF");
            return (Criteria) this;
        }

        public Criteria andSFGDFNotEqualTo(Short value) {
            addCriterion("SFGDF <>", value, "SFGDF");
            return (Criteria) this;
        }

        public Criteria andSFGDFGreaterThan(Short value) {
            addCriterion("SFGDF >", value, "SFGDF");
            return (Criteria) this;
        }

        public Criteria andSFGDFGreaterThanOrEqualTo(Short value) {
            addCriterion("SFGDF >=", value, "SFGDF");
            return (Criteria) this;
        }

        public Criteria andSFGDFLessThan(Short value) {
            addCriterion("SFGDF <", value, "SFGDF");
            return (Criteria) this;
        }

        public Criteria andSFGDFLessThanOrEqualTo(Short value) {
            addCriterion("SFGDF <=", value, "SFGDF");
            return (Criteria) this;
        }

        public Criteria andSFGDFIn(List<Short> values) {
            addCriterion("SFGDF in", values, "SFGDF");
            return (Criteria) this;
        }

        public Criteria andSFGDFNotIn(List<Short> values) {
            addCriterion("SFGDF not in", values, "SFGDF");
            return (Criteria) this;
        }

        public Criteria andSFGDFBetween(Short value1, Short value2) {
            addCriterion("SFGDF between", value1, value2, "SFGDF");
            return (Criteria) this;
        }

        public Criteria andSFGDFNotBetween(Short value1, Short value2) {
            addCriterion("SFGDF not between", value1, value2, "SFGDF");
            return (Criteria) this;
        }

        public Criteria andSFZGGFIsNull() {
            addCriterion("SFZGGF is null");
            return (Criteria) this;
        }

        public Criteria andSFZGGFIsNotNull() {
            addCriterion("SFZGGF is not null");
            return (Criteria) this;
        }

        public Criteria andSFZGGFEqualTo(Short value) {
            addCriterion("SFZGGF =", value, "SFZGGF");
            return (Criteria) this;
        }

        public Criteria andSFZGGFNotEqualTo(Short value) {
            addCriterion("SFZGGF <>", value, "SFZGGF");
            return (Criteria) this;
        }

        public Criteria andSFZGGFGreaterThan(Short value) {
            addCriterion("SFZGGF >", value, "SFZGGF");
            return (Criteria) this;
        }

        public Criteria andSFZGGFGreaterThanOrEqualTo(Short value) {
            addCriterion("SFZGGF >=", value, "SFZGGF");
            return (Criteria) this;
        }

        public Criteria andSFZGGFLessThan(Short value) {
            addCriterion("SFZGGF <", value, "SFZGGF");
            return (Criteria) this;
        }

        public Criteria andSFZGGFLessThanOrEqualTo(Short value) {
            addCriterion("SFZGGF <=", value, "SFZGGF");
            return (Criteria) this;
        }

        public Criteria andSFZGGFIn(List<Short> values) {
            addCriterion("SFZGGF in", values, "SFZGGF");
            return (Criteria) this;
        }

        public Criteria andSFZGGFNotIn(List<Short> values) {
            addCriterion("SFZGGF not in", values, "SFZGGF");
            return (Criteria) this;
        }

        public Criteria andSFZGGFBetween(Short value1, Short value2) {
            addCriterion("SFZGGF between", value1, value2, "SFZGGF");
            return (Criteria) this;
        }

        public Criteria andSFZGGFNotBetween(Short value1, Short value2) {
            addCriterion("SFZGGF not between", value1, value2, "SFZGGF");
            return (Criteria) this;
        }

        public Criteria andFWDAHIsNull() {
            addCriterion("FWDAH is null");
            return (Criteria) this;
        }

        public Criteria andFWDAHIsNotNull() {
            addCriterion("FWDAH is not null");
            return (Criteria) this;
        }

        public Criteria andFWDAHEqualTo(String value) {
            addCriterion("FWDAH =", value, "FWDAH");
            return (Criteria) this;
        }

        public Criteria andFWDAHNotEqualTo(String value) {
            addCriterion("FWDAH <>", value, "FWDAH");
            return (Criteria) this;
        }

        public Criteria andFWDAHGreaterThan(String value) {
            addCriterion("FWDAH >", value, "FWDAH");
            return (Criteria) this;
        }

        public Criteria andFWDAHGreaterThanOrEqualTo(String value) {
            addCriterion("FWDAH >=", value, "FWDAH");
            return (Criteria) this;
        }

        public Criteria andFWDAHLessThan(String value) {
            addCriterion("FWDAH <", value, "FWDAH");
            return (Criteria) this;
        }

        public Criteria andFWDAHLessThanOrEqualTo(String value) {
            addCriterion("FWDAH <=", value, "FWDAH");
            return (Criteria) this;
        }

        public Criteria andFWDAHLike(String value) {
            addCriterion("FWDAH like", value, "FWDAH");
            return (Criteria) this;
        }

        public Criteria andFWDAHNotLike(String value) {
            addCriterion("FWDAH not like", value, "FWDAH");
            return (Criteria) this;
        }

        public Criteria andFWDAHIn(List<String> values) {
            addCriterion("FWDAH in", values, "FWDAH");
            return (Criteria) this;
        }

        public Criteria andFWDAHNotIn(List<String> values) {
            addCriterion("FWDAH not in", values, "FWDAH");
            return (Criteria) this;
        }

        public Criteria andFWDAHBetween(String value1, String value2) {
            addCriterion("FWDAH between", value1, value2, "FWDAH");
            return (Criteria) this;
        }

        public Criteria andFWDAHNotBetween(String value1, String value2) {
            addCriterion("FWDAH not between", value1, value2, "FWDAH");
            return (Criteria) this;
        }

        public Criteria andHFQKIsNull() {
            addCriterion("HFQK is null");
            return (Criteria) this;
        }

        public Criteria andHFQKIsNotNull() {
            addCriterion("HFQK is not null");
            return (Criteria) this;
        }

        public Criteria andHFQKEqualTo(String value) {
            addCriterion("HFQK =", value, "HFQK");
            return (Criteria) this;
        }

        public Criteria andHFQKNotEqualTo(String value) {
            addCriterion("HFQK <>", value, "HFQK");
            return (Criteria) this;
        }

        public Criteria andHFQKGreaterThan(String value) {
            addCriterion("HFQK >", value, "HFQK");
            return (Criteria) this;
        }

        public Criteria andHFQKGreaterThanOrEqualTo(String value) {
            addCriterion("HFQK >=", value, "HFQK");
            return (Criteria) this;
        }

        public Criteria andHFQKLessThan(String value) {
            addCriterion("HFQK <", value, "HFQK");
            return (Criteria) this;
        }

        public Criteria andHFQKLessThanOrEqualTo(String value) {
            addCriterion("HFQK <=", value, "HFQK");
            return (Criteria) this;
        }

        public Criteria andHFQKLike(String value) {
            addCriterion("HFQK like", value, "HFQK");
            return (Criteria) this;
        }

        public Criteria andHFQKNotLike(String value) {
            addCriterion("HFQK not like", value, "HFQK");
            return (Criteria) this;
        }

        public Criteria andHFQKIn(List<String> values) {
            addCriterion("HFQK in", values, "HFQK");
            return (Criteria) this;
        }

        public Criteria andHFQKNotIn(List<String> values) {
            addCriterion("HFQK not in", values, "HFQK");
            return (Criteria) this;
        }

        public Criteria andHFQKBetween(String value1, String value2) {
            addCriterion("HFQK between", value1, value2, "HFQK");
            return (Criteria) this;
        }

        public Criteria andHFQKNotBetween(String value1, String value2) {
            addCriterion("HFQK not between", value1, value2, "HFQK");
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
