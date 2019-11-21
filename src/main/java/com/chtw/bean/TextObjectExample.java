package com.chtw.bean;

import java.util.ArrayList;
import java.util.List;

public class TextObjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TextObjectExample() {
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

        public Criteria andOriginalDataIsNull() {
            addCriterion("original_data is null");
            return (Criteria) this;
        }

        public Criteria andOriginalDataIsNotNull() {
            addCriterion("original_data is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalDataEqualTo(String value) {
            addCriterion("original_data =", value, "originalData");
            return (Criteria) this;
        }

        public Criteria andOriginalDataNotEqualTo(String value) {
            addCriterion("original_data <>", value, "originalData");
            return (Criteria) this;
        }

        public Criteria andOriginalDataGreaterThan(String value) {
            addCriterion("original_data >", value, "originalData");
            return (Criteria) this;
        }

        public Criteria andOriginalDataGreaterThanOrEqualTo(String value) {
            addCriterion("original_data >=", value, "originalData");
            return (Criteria) this;
        }

        public Criteria andOriginalDataLessThan(String value) {
            addCriterion("original_data <", value, "originalData");
            return (Criteria) this;
        }

        public Criteria andOriginalDataLessThanOrEqualTo(String value) {
            addCriterion("original_data <=", value, "originalData");
            return (Criteria) this;
        }

        public Criteria andOriginalDataLike(String value) {
            addCriterion("original_data like", value, "originalData");
            return (Criteria) this;
        }

        public Criteria andOriginalDataNotLike(String value) {
            addCriterion("original_data not like", value, "originalData");
            return (Criteria) this;
        }

        public Criteria andOriginalDataIn(List<String> values) {
            addCriterion("original_data in", values, "originalData");
            return (Criteria) this;
        }

        public Criteria andOriginalDataNotIn(List<String> values) {
            addCriterion("original_data not in", values, "originalData");
            return (Criteria) this;
        }

        public Criteria andOriginalDataBetween(String value1, String value2) {
            addCriterion("original_data between", value1, value2, "originalData");
            return (Criteria) this;
        }

        public Criteria andOriginalDataNotBetween(String value1, String value2) {
            addCriterion("original_data not between", value1, value2, "originalData");
            return (Criteria) this;
        }

        public Criteria andDesignIndustryIdIsNull() {
            addCriterion("design_industry_id is null");
            return (Criteria) this;
        }

        public Criteria andDesignIndustryIdIsNotNull() {
            addCriterion("design_industry_id is not null");
            return (Criteria) this;
        }

        public Criteria andDesignIndustryIdEqualTo(Integer value) {
            addCriterion("design_industry_id =", value, "designIndustryId");
            return (Criteria) this;
        }

        public Criteria andDesignIndustryIdNotEqualTo(Integer value) {
            addCriterion("design_industry_id <>", value, "designIndustryId");
            return (Criteria) this;
        }

        public Criteria andDesignIndustryIdGreaterThan(Integer value) {
            addCriterion("design_industry_id >", value, "designIndustryId");
            return (Criteria) this;
        }

        public Criteria andDesignIndustryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("design_industry_id >=", value, "designIndustryId");
            return (Criteria) this;
        }

        public Criteria andDesignIndustryIdLessThan(Integer value) {
            addCriterion("design_industry_id <", value, "designIndustryId");
            return (Criteria) this;
        }

        public Criteria andDesignIndustryIdLessThanOrEqualTo(Integer value) {
            addCriterion("design_industry_id <=", value, "designIndustryId");
            return (Criteria) this;
        }

        public Criteria andDesignIndustryIdIn(List<Integer> values) {
            addCriterion("design_industry_id in", values, "designIndustryId");
            return (Criteria) this;
        }

        public Criteria andDesignIndustryIdNotIn(List<Integer> values) {
            addCriterion("design_industry_id not in", values, "designIndustryId");
            return (Criteria) this;
        }

        public Criteria andDesignIndustryIdBetween(Integer value1, Integer value2) {
            addCriterion("design_industry_id between", value1, value2, "designIndustryId");
            return (Criteria) this;
        }

        public Criteria andDesignIndustryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("design_industry_id not between", value1, value2, "designIndustryId");
            return (Criteria) this;
        }

        public Criteria andObjectOrientedIsNull() {
            addCriterion("object_oriented is null");
            return (Criteria) this;
        }

        public Criteria andObjectOrientedIsNotNull() {
            addCriterion("object_oriented is not null");
            return (Criteria) this;
        }

        public Criteria andObjectOrientedEqualTo(String value) {
            addCriterion("object_oriented =", value, "objectOriented");
            return (Criteria) this;
        }

        public Criteria andObjectOrientedNotEqualTo(String value) {
            addCriterion("object_oriented <>", value, "objectOriented");
            return (Criteria) this;
        }

        public Criteria andObjectOrientedGreaterThan(String value) {
            addCriterion("object_oriented >", value, "objectOriented");
            return (Criteria) this;
        }

        public Criteria andObjectOrientedGreaterThanOrEqualTo(String value) {
            addCriterion("object_oriented >=", value, "objectOriented");
            return (Criteria) this;
        }

        public Criteria andObjectOrientedLessThan(String value) {
            addCriterion("object_oriented <", value, "objectOriented");
            return (Criteria) this;
        }

        public Criteria andObjectOrientedLessThanOrEqualTo(String value) {
            addCriterion("object_oriented <=", value, "objectOriented");
            return (Criteria) this;
        }

        public Criteria andObjectOrientedLike(String value) {
            addCriterion("object_oriented like", value, "objectOriented");
            return (Criteria) this;
        }

        public Criteria andObjectOrientedNotLike(String value) {
            addCriterion("object_oriented not like", value, "objectOriented");
            return (Criteria) this;
        }

        public Criteria andObjectOrientedIn(List<String> values) {
            addCriterion("object_oriented in", values, "objectOriented");
            return (Criteria) this;
        }

        public Criteria andObjectOrientedNotIn(List<String> values) {
            addCriterion("object_oriented not in", values, "objectOriented");
            return (Criteria) this;
        }

        public Criteria andObjectOrientedBetween(String value1, String value2) {
            addCriterion("object_oriented between", value1, value2, "objectOriented");
            return (Criteria) this;
        }

        public Criteria andObjectOrientedNotBetween(String value1, String value2) {
            addCriterion("object_oriented not between", value1, value2, "objectOriented");
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