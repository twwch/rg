package com.chtw.bean;

import java.util.ArrayList;
import java.util.List;

public class IndustrialConExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IndustrialConExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSpecificRegionsIsNull() {
            addCriterion("specific_regions is null");
            return (Criteria) this;
        }

        public Criteria andSpecificRegionsIsNotNull() {
            addCriterion("specific_regions is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificRegionsEqualTo(String value) {
            addCriterion("specific_regions =", value, "specificRegions");
            return (Criteria) this;
        }

        public Criteria andSpecificRegionsNotEqualTo(String value) {
            addCriterion("specific_regions <>", value, "specificRegions");
            return (Criteria) this;
        }

        public Criteria andSpecificRegionsGreaterThan(String value) {
            addCriterion("specific_regions >", value, "specificRegions");
            return (Criteria) this;
        }

        public Criteria andSpecificRegionsGreaterThanOrEqualTo(String value) {
            addCriterion("specific_regions >=", value, "specificRegions");
            return (Criteria) this;
        }

        public Criteria andSpecificRegionsLessThan(String value) {
            addCriterion("specific_regions <", value, "specificRegions");
            return (Criteria) this;
        }

        public Criteria andSpecificRegionsLessThanOrEqualTo(String value) {
            addCriterion("specific_regions <=", value, "specificRegions");
            return (Criteria) this;
        }

        public Criteria andSpecificRegionsLike(String value) {
            addCriterion("specific_regions like", value, "specificRegions");
            return (Criteria) this;
        }

        public Criteria andSpecificRegionsNotLike(String value) {
            addCriterion("specific_regions not like", value, "specificRegions");
            return (Criteria) this;
        }

        public Criteria andSpecificRegionsIn(List<String> values) {
            addCriterion("specific_regions in", values, "specificRegions");
            return (Criteria) this;
        }

        public Criteria andSpecificRegionsNotIn(List<String> values) {
            addCriterion("specific_regions not in", values, "specificRegions");
            return (Criteria) this;
        }

        public Criteria andSpecificRegionsBetween(String value1, String value2) {
            addCriterion("specific_regions between", value1, value2, "specificRegions");
            return (Criteria) this;
        }

        public Criteria andSpecificRegionsNotBetween(String value1, String value2) {
            addCriterion("specific_regions not between", value1, value2, "specificRegions");
            return (Criteria) this;
        }

        public Criteria andIndustrialOrientationIsNull() {
            addCriterion("industrial_orientation is null");
            return (Criteria) this;
        }

        public Criteria andIndustrialOrientationIsNotNull() {
            addCriterion("industrial_orientation is not null");
            return (Criteria) this;
        }

        public Criteria andIndustrialOrientationEqualTo(String value) {
            addCriterion("industrial_orientation =", value, "industrialOrientation");
            return (Criteria) this;
        }

        public Criteria andIndustrialOrientationNotEqualTo(String value) {
            addCriterion("industrial_orientation <>", value, "industrialOrientation");
            return (Criteria) this;
        }

        public Criteria andIndustrialOrientationGreaterThan(String value) {
            addCriterion("industrial_orientation >", value, "industrialOrientation");
            return (Criteria) this;
        }

        public Criteria andIndustrialOrientationGreaterThanOrEqualTo(String value) {
            addCriterion("industrial_orientation >=", value, "industrialOrientation");
            return (Criteria) this;
        }

        public Criteria andIndustrialOrientationLessThan(String value) {
            addCriterion("industrial_orientation <", value, "industrialOrientation");
            return (Criteria) this;
        }

        public Criteria andIndustrialOrientationLessThanOrEqualTo(String value) {
            addCriterion("industrial_orientation <=", value, "industrialOrientation");
            return (Criteria) this;
        }

        public Criteria andIndustrialOrientationLike(String value) {
            addCriterion("industrial_orientation like", value, "industrialOrientation");
            return (Criteria) this;
        }

        public Criteria andIndustrialOrientationNotLike(String value) {
            addCriterion("industrial_orientation not like", value, "industrialOrientation");
            return (Criteria) this;
        }

        public Criteria andIndustrialOrientationIn(List<String> values) {
            addCriterion("industrial_orientation in", values, "industrialOrientation");
            return (Criteria) this;
        }

        public Criteria andIndustrialOrientationNotIn(List<String> values) {
            addCriterion("industrial_orientation not in", values, "industrialOrientation");
            return (Criteria) this;
        }

        public Criteria andIndustrialOrientationBetween(String value1, String value2) {
            addCriterion("industrial_orientation between", value1, value2, "industrialOrientation");
            return (Criteria) this;
        }

        public Criteria andIndustrialOrientationNotBetween(String value1, String value2) {
            addCriterion("industrial_orientation not between", value1, value2, "industrialOrientation");
            return (Criteria) this;
        }

        public Criteria andConIdIsNull() {
            addCriterion("con_id is null");
            return (Criteria) this;
        }

        public Criteria andConIdIsNotNull() {
            addCriterion("con_id is not null");
            return (Criteria) this;
        }

        public Criteria andConIdEqualTo(Integer value) {
            addCriterion("con_id =", value, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdNotEqualTo(Integer value) {
            addCriterion("con_id <>", value, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdGreaterThan(Integer value) {
            addCriterion("con_id >", value, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("con_id >=", value, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdLessThan(Integer value) {
            addCriterion("con_id <", value, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdLessThanOrEqualTo(Integer value) {
            addCriterion("con_id <=", value, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdIn(List<Integer> values) {
            addCriterion("con_id in", values, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdNotIn(List<Integer> values) {
            addCriterion("con_id not in", values, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdBetween(Integer value1, Integer value2) {
            addCriterion("con_id between", value1, value2, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdNotBetween(Integer value1, Integer value2) {
            addCriterion("con_id not between", value1, value2, "conId");
            return (Criteria) this;
        }
    }

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