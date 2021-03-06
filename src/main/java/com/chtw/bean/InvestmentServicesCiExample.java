package com.chtw.bean;

import java.util.ArrayList;
import java.util.List;

public class InvestmentServicesCiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InvestmentServicesCiExample() {
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

        public Criteria andResourceTypeIsNull() {
            addCriterion("resource_type is null");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIsNotNull() {
            addCriterion("resource_type is not null");
            return (Criteria) this;
        }

        public Criteria andResourceTypeEqualTo(String value) {
            addCriterion("resource_type =", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotEqualTo(String value) {
            addCriterion("resource_type <>", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeGreaterThan(String value) {
            addCriterion("resource_type >", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("resource_type >=", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLessThan(String value) {
            addCriterion("resource_type <", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLessThanOrEqualTo(String value) {
            addCriterion("resource_type <=", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLike(String value) {
            addCriterion("resource_type like", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotLike(String value) {
            addCriterion("resource_type not like", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIn(List<String> values) {
            addCriterion("resource_type in", values, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotIn(List<String> values) {
            addCriterion("resource_type not in", values, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeBetween(String value1, String value2) {
            addCriterion("resource_type between", value1, value2, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotBetween(String value1, String value2) {
            addCriterion("resource_type not between", value1, value2, "resourceType");
            return (Criteria) this;
        }

        public Criteria andOriginalMaterialsIsNull() {
            addCriterion("original_materials is null");
            return (Criteria) this;
        }

        public Criteria andOriginalMaterialsIsNotNull() {
            addCriterion("original_materials is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalMaterialsEqualTo(String value) {
            addCriterion("original_materials =", value, "originalMaterials");
            return (Criteria) this;
        }

        public Criteria andOriginalMaterialsNotEqualTo(String value) {
            addCriterion("original_materials <>", value, "originalMaterials");
            return (Criteria) this;
        }

        public Criteria andOriginalMaterialsGreaterThan(String value) {
            addCriterion("original_materials >", value, "originalMaterials");
            return (Criteria) this;
        }

        public Criteria andOriginalMaterialsGreaterThanOrEqualTo(String value) {
            addCriterion("original_materials >=", value, "originalMaterials");
            return (Criteria) this;
        }

        public Criteria andOriginalMaterialsLessThan(String value) {
            addCriterion("original_materials <", value, "originalMaterials");
            return (Criteria) this;
        }

        public Criteria andOriginalMaterialsLessThanOrEqualTo(String value) {
            addCriterion("original_materials <=", value, "originalMaterials");
            return (Criteria) this;
        }

        public Criteria andOriginalMaterialsLike(String value) {
            addCriterion("original_materials like", value, "originalMaterials");
            return (Criteria) this;
        }

        public Criteria andOriginalMaterialsNotLike(String value) {
            addCriterion("original_materials not like", value, "originalMaterials");
            return (Criteria) this;
        }

        public Criteria andOriginalMaterialsIn(List<String> values) {
            addCriterion("original_materials in", values, "originalMaterials");
            return (Criteria) this;
        }

        public Criteria andOriginalMaterialsNotIn(List<String> values) {
            addCriterion("original_materials not in", values, "originalMaterials");
            return (Criteria) this;
        }

        public Criteria andOriginalMaterialsBetween(String value1, String value2) {
            addCriterion("original_materials between", value1, value2, "originalMaterials");
            return (Criteria) this;
        }

        public Criteria andOriginalMaterialsNotBetween(String value1, String value2) {
            addCriterion("original_materials not between", value1, value2, "originalMaterials");
            return (Criteria) this;
        }

        public Criteria andIndustryInvolvedIdIsNull() {
            addCriterion("industry_involved_id is null");
            return (Criteria) this;
        }

        public Criteria andIndustryInvolvedIdIsNotNull() {
            addCriterion("industry_involved_id is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryInvolvedIdEqualTo(Integer value) {
            addCriterion("industry_involved_id =", value, "industryInvolvedId");
            return (Criteria) this;
        }

        public Criteria andIndustryInvolvedIdNotEqualTo(Integer value) {
            addCriterion("industry_involved_id <>", value, "industryInvolvedId");
            return (Criteria) this;
        }

        public Criteria andIndustryInvolvedIdGreaterThan(Integer value) {
            addCriterion("industry_involved_id >", value, "industryInvolvedId");
            return (Criteria) this;
        }

        public Criteria andIndustryInvolvedIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("industry_involved_id >=", value, "industryInvolvedId");
            return (Criteria) this;
        }

        public Criteria andIndustryInvolvedIdLessThan(Integer value) {
            addCriterion("industry_involved_id <", value, "industryInvolvedId");
            return (Criteria) this;
        }

        public Criteria andIndustryInvolvedIdLessThanOrEqualTo(Integer value) {
            addCriterion("industry_involved_id <=", value, "industryInvolvedId");
            return (Criteria) this;
        }

        public Criteria andIndustryInvolvedIdIn(List<Integer> values) {
            addCriterion("industry_involved_id in", values, "industryInvolvedId");
            return (Criteria) this;
        }

        public Criteria andIndustryInvolvedIdNotIn(List<Integer> values) {
            addCriterion("industry_involved_id not in", values, "industryInvolvedId");
            return (Criteria) this;
        }

        public Criteria andIndustryInvolvedIdBetween(Integer value1, Integer value2) {
            addCriterion("industry_involved_id between", value1, value2, "industryInvolvedId");
            return (Criteria) this;
        }

        public Criteria andIndustryInvolvedIdNotBetween(Integer value1, Integer value2) {
            addCriterion("industry_involved_id not between", value1, value2, "industryInvolvedId");
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

        public Criteria andKeywordsIsNull() {
            addCriterion("keywords is null");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNotNull() {
            addCriterion("keywords is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordsEqualTo(String value) {
            addCriterion("keywords =", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotEqualTo(String value) {
            addCriterion("keywords <>", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThan(String value) {
            addCriterion("keywords >", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("keywords >=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThan(String value) {
            addCriterion("keywords <", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThanOrEqualTo(String value) {
            addCriterion("keywords <=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLike(String value) {
            addCriterion("keywords like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotLike(String value) {
            addCriterion("keywords not like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsIn(List<String> values) {
            addCriterion("keywords in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotIn(List<String> values) {
            addCriterion("keywords not in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsBetween(String value1, String value2) {
            addCriterion("keywords between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotBetween(String value1, String value2) {
            addCriterion("keywords not between", value1, value2, "keywords");
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