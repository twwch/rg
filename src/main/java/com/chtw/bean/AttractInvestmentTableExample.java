package com.chtw.bean;

import java.util.ArrayList;
import java.util.List;

public class AttractInvestmentTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttractInvestmentTableExample() {
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

        public Criteria andResourceIndustryIsNull() {
            addCriterion("resource_industry is null");
            return (Criteria) this;
        }

        public Criteria andResourceIndustryIsNotNull() {
            addCriterion("resource_industry is not null");
            return (Criteria) this;
        }

        public Criteria andResourceIndustryEqualTo(String value) {
            addCriterion("resource_industry =", value, "resourceIndustry");
            return (Criteria) this;
        }

        public Criteria andResourceIndustryNotEqualTo(String value) {
            addCriterion("resource_industry <>", value, "resourceIndustry");
            return (Criteria) this;
        }

        public Criteria andResourceIndustryGreaterThan(String value) {
            addCriterion("resource_industry >", value, "resourceIndustry");
            return (Criteria) this;
        }

        public Criteria andResourceIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("resource_industry >=", value, "resourceIndustry");
            return (Criteria) this;
        }

        public Criteria andResourceIndustryLessThan(String value) {
            addCriterion("resource_industry <", value, "resourceIndustry");
            return (Criteria) this;
        }

        public Criteria andResourceIndustryLessThanOrEqualTo(String value) {
            addCriterion("resource_industry <=", value, "resourceIndustry");
            return (Criteria) this;
        }

        public Criteria andResourceIndustryLike(String value) {
            addCriterion("resource_industry like", value, "resourceIndustry");
            return (Criteria) this;
        }

        public Criteria andResourceIndustryNotLike(String value) {
            addCriterion("resource_industry not like", value, "resourceIndustry");
            return (Criteria) this;
        }

        public Criteria andResourceIndustryIn(List<String> values) {
            addCriterion("resource_industry in", values, "resourceIndustry");
            return (Criteria) this;
        }

        public Criteria andResourceIndustryNotIn(List<String> values) {
            addCriterion("resource_industry not in", values, "resourceIndustry");
            return (Criteria) this;
        }

        public Criteria andResourceIndustryBetween(String value1, String value2) {
            addCriterion("resource_industry between", value1, value2, "resourceIndustry");
            return (Criteria) this;
        }

        public Criteria andResourceIndustryNotBetween(String value1, String value2) {
            addCriterion("resource_industry not between", value1, value2, "resourceIndustry");
            return (Criteria) this;
        }

        public Criteria andIndustryInvolvedIsNull() {
            addCriterion("industry_involved is null");
            return (Criteria) this;
        }

        public Criteria andIndustryInvolvedIsNotNull() {
            addCriterion("industry_involved is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryInvolvedEqualTo(String value) {
            addCriterion("industry_involved =", value, "industryInvolved");
            return (Criteria) this;
        }

        public Criteria andIndustryInvolvedNotEqualTo(String value) {
            addCriterion("industry_involved <>", value, "industryInvolved");
            return (Criteria) this;
        }

        public Criteria andIndustryInvolvedGreaterThan(String value) {
            addCriterion("industry_involved >", value, "industryInvolved");
            return (Criteria) this;
        }

        public Criteria andIndustryInvolvedGreaterThanOrEqualTo(String value) {
            addCriterion("industry_involved >=", value, "industryInvolved");
            return (Criteria) this;
        }

        public Criteria andIndustryInvolvedLessThan(String value) {
            addCriterion("industry_involved <", value, "industryInvolved");
            return (Criteria) this;
        }

        public Criteria andIndustryInvolvedLessThanOrEqualTo(String value) {
            addCriterion("industry_involved <=", value, "industryInvolved");
            return (Criteria) this;
        }

        public Criteria andIndustryInvolvedLike(String value) {
            addCriterion("industry_involved like", value, "industryInvolved");
            return (Criteria) this;
        }

        public Criteria andIndustryInvolvedNotLike(String value) {
            addCriterion("industry_involved not like", value, "industryInvolved");
            return (Criteria) this;
        }

        public Criteria andIndustryInvolvedIn(List<String> values) {
            addCriterion("industry_involved in", values, "industryInvolved");
            return (Criteria) this;
        }

        public Criteria andIndustryInvolvedNotIn(List<String> values) {
            addCriterion("industry_involved not in", values, "industryInvolved");
            return (Criteria) this;
        }

        public Criteria andIndustryInvolvedBetween(String value1, String value2) {
            addCriterion("industry_involved between", value1, value2, "industryInvolved");
            return (Criteria) this;
        }

        public Criteria andIndustryInvolvedNotBetween(String value1, String value2) {
            addCriterion("industry_involved not between", value1, value2, "industryInvolved");
            return (Criteria) this;
        }

        public Criteria andEntryNameIsNull() {
            addCriterion("entry_name is null");
            return (Criteria) this;
        }

        public Criteria andEntryNameIsNotNull() {
            addCriterion("entry_name is not null");
            return (Criteria) this;
        }

        public Criteria andEntryNameEqualTo(String value) {
            addCriterion("entry_name =", value, "entryName");
            return (Criteria) this;
        }

        public Criteria andEntryNameNotEqualTo(String value) {
            addCriterion("entry_name <>", value, "entryName");
            return (Criteria) this;
        }

        public Criteria andEntryNameGreaterThan(String value) {
            addCriterion("entry_name >", value, "entryName");
            return (Criteria) this;
        }

        public Criteria andEntryNameGreaterThanOrEqualTo(String value) {
            addCriterion("entry_name >=", value, "entryName");
            return (Criteria) this;
        }

        public Criteria andEntryNameLessThan(String value) {
            addCriterion("entry_name <", value, "entryName");
            return (Criteria) this;
        }

        public Criteria andEntryNameLessThanOrEqualTo(String value) {
            addCriterion("entry_name <=", value, "entryName");
            return (Criteria) this;
        }

        public Criteria andEntryNameLike(String value) {
            addCriterion("entry_name like", value, "entryName");
            return (Criteria) this;
        }

        public Criteria andEntryNameNotLike(String value) {
            addCriterion("entry_name not like", value, "entryName");
            return (Criteria) this;
        }

        public Criteria andEntryNameIn(List<String> values) {
            addCriterion("entry_name in", values, "entryName");
            return (Criteria) this;
        }

        public Criteria andEntryNameNotIn(List<String> values) {
            addCriterion("entry_name not in", values, "entryName");
            return (Criteria) this;
        }

        public Criteria andEntryNameBetween(String value1, String value2) {
            addCriterion("entry_name between", value1, value2, "entryName");
            return (Criteria) this;
        }

        public Criteria andEntryNameNotBetween(String value1, String value2) {
            addCriterion("entry_name not between", value1, value2, "entryName");
            return (Criteria) this;
        }

        public Criteria andEntryTypeIsNull() {
            addCriterion("entry_type is null");
            return (Criteria) this;
        }

        public Criteria andEntryTypeIsNotNull() {
            addCriterion("entry_type is not null");
            return (Criteria) this;
        }

        public Criteria andEntryTypeEqualTo(String value) {
            addCriterion("entry_type =", value, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeNotEqualTo(String value) {
            addCriterion("entry_type <>", value, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeGreaterThan(String value) {
            addCriterion("entry_type >", value, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeGreaterThanOrEqualTo(String value) {
            addCriterion("entry_type >=", value, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeLessThan(String value) {
            addCriterion("entry_type <", value, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeLessThanOrEqualTo(String value) {
            addCriterion("entry_type <=", value, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeLike(String value) {
            addCriterion("entry_type like", value, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeNotLike(String value) {
            addCriterion("entry_type not like", value, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeIn(List<String> values) {
            addCriterion("entry_type in", values, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeNotIn(List<String> values) {
            addCriterion("entry_type not in", values, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeBetween(String value1, String value2) {
            addCriterion("entry_type between", value1, value2, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeNotBetween(String value1, String value2) {
            addCriterion("entry_type not between", value1, value2, "entryType");
            return (Criteria) this;
        }

        public Criteria andPolicyProvisionsIsNull() {
            addCriterion("policy_provisions is null");
            return (Criteria) this;
        }

        public Criteria andPolicyProvisionsIsNotNull() {
            addCriterion("policy_provisions is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyProvisionsEqualTo(String value) {
            addCriterion("policy_provisions =", value, "policyProvisions");
            return (Criteria) this;
        }

        public Criteria andPolicyProvisionsNotEqualTo(String value) {
            addCriterion("policy_provisions <>", value, "policyProvisions");
            return (Criteria) this;
        }

        public Criteria andPolicyProvisionsGreaterThan(String value) {
            addCriterion("policy_provisions >", value, "policyProvisions");
            return (Criteria) this;
        }

        public Criteria andPolicyProvisionsGreaterThanOrEqualTo(String value) {
            addCriterion("policy_provisions >=", value, "policyProvisions");
            return (Criteria) this;
        }

        public Criteria andPolicyProvisionsLessThan(String value) {
            addCriterion("policy_provisions <", value, "policyProvisions");
            return (Criteria) this;
        }

        public Criteria andPolicyProvisionsLessThanOrEqualTo(String value) {
            addCriterion("policy_provisions <=", value, "policyProvisions");
            return (Criteria) this;
        }

        public Criteria andPolicyProvisionsLike(String value) {
            addCriterion("policy_provisions like", value, "policyProvisions");
            return (Criteria) this;
        }

        public Criteria andPolicyProvisionsNotLike(String value) {
            addCriterion("policy_provisions not like", value, "policyProvisions");
            return (Criteria) this;
        }

        public Criteria andPolicyProvisionsIn(List<String> values) {
            addCriterion("policy_provisions in", values, "policyProvisions");
            return (Criteria) this;
        }

        public Criteria andPolicyProvisionsNotIn(List<String> values) {
            addCriterion("policy_provisions not in", values, "policyProvisions");
            return (Criteria) this;
        }

        public Criteria andPolicyProvisionsBetween(String value1, String value2) {
            addCriterion("policy_provisions between", value1, value2, "policyProvisions");
            return (Criteria) this;
        }

        public Criteria andPolicyProvisionsNotBetween(String value1, String value2) {
            addCriterion("policy_provisions not between", value1, value2, "policyProvisions");
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

        public Criteria andTimeFrameIsNull() {
            addCriterion("time_frame is null");
            return (Criteria) this;
        }

        public Criteria andTimeFrameIsNotNull() {
            addCriterion("time_frame is not null");
            return (Criteria) this;
        }

        public Criteria andTimeFrameEqualTo(String value) {
            addCriterion("time_frame =", value, "timeFrame");
            return (Criteria) this;
        }

        public Criteria andTimeFrameNotEqualTo(String value) {
            addCriterion("time_frame <>", value, "timeFrame");
            return (Criteria) this;
        }

        public Criteria andTimeFrameGreaterThan(String value) {
            addCriterion("time_frame >", value, "timeFrame");
            return (Criteria) this;
        }

        public Criteria andTimeFrameGreaterThanOrEqualTo(String value) {
            addCriterion("time_frame >=", value, "timeFrame");
            return (Criteria) this;
        }

        public Criteria andTimeFrameLessThan(String value) {
            addCriterion("time_frame <", value, "timeFrame");
            return (Criteria) this;
        }

        public Criteria andTimeFrameLessThanOrEqualTo(String value) {
            addCriterion("time_frame <=", value, "timeFrame");
            return (Criteria) this;
        }

        public Criteria andTimeFrameLike(String value) {
            addCriterion("time_frame like", value, "timeFrame");
            return (Criteria) this;
        }

        public Criteria andTimeFrameNotLike(String value) {
            addCriterion("time_frame not like", value, "timeFrame");
            return (Criteria) this;
        }

        public Criteria andTimeFrameIn(List<String> values) {
            addCriterion("time_frame in", values, "timeFrame");
            return (Criteria) this;
        }

        public Criteria andTimeFrameNotIn(List<String> values) {
            addCriterion("time_frame not in", values, "timeFrame");
            return (Criteria) this;
        }

        public Criteria andTimeFrameBetween(String value1, String value2) {
            addCriterion("time_frame between", value1, value2, "timeFrame");
            return (Criteria) this;
        }

        public Criteria andTimeFrameNotBetween(String value1, String value2) {
            addCriterion("time_frame not between", value1, value2, "timeFrame");
            return (Criteria) this;
        }

        public Criteria andResourceProviderIsNull() {
            addCriterion("resource_provider is null");
            return (Criteria) this;
        }

        public Criteria andResourceProviderIsNotNull() {
            addCriterion("resource_provider is not null");
            return (Criteria) this;
        }

        public Criteria andResourceProviderEqualTo(String value) {
            addCriterion("resource_provider =", value, "resourceProvider");
            return (Criteria) this;
        }

        public Criteria andResourceProviderNotEqualTo(String value) {
            addCriterion("resource_provider <>", value, "resourceProvider");
            return (Criteria) this;
        }

        public Criteria andResourceProviderGreaterThan(String value) {
            addCriterion("resource_provider >", value, "resourceProvider");
            return (Criteria) this;
        }

        public Criteria andResourceProviderGreaterThanOrEqualTo(String value) {
            addCriterion("resource_provider >=", value, "resourceProvider");
            return (Criteria) this;
        }

        public Criteria andResourceProviderLessThan(String value) {
            addCriterion("resource_provider <", value, "resourceProvider");
            return (Criteria) this;
        }

        public Criteria andResourceProviderLessThanOrEqualTo(String value) {
            addCriterion("resource_provider <=", value, "resourceProvider");
            return (Criteria) this;
        }

        public Criteria andResourceProviderLike(String value) {
            addCriterion("resource_provider like", value, "resourceProvider");
            return (Criteria) this;
        }

        public Criteria andResourceProviderNotLike(String value) {
            addCriterion("resource_provider not like", value, "resourceProvider");
            return (Criteria) this;
        }

        public Criteria andResourceProviderIn(List<String> values) {
            addCriterion("resource_provider in", values, "resourceProvider");
            return (Criteria) this;
        }

        public Criteria andResourceProviderNotIn(List<String> values) {
            addCriterion("resource_provider not in", values, "resourceProvider");
            return (Criteria) this;
        }

        public Criteria andResourceProviderBetween(String value1, String value2) {
            addCriterion("resource_provider between", value1, value2, "resourceProvider");
            return (Criteria) this;
        }

        public Criteria andResourceProviderNotBetween(String value1, String value2) {
            addCriterion("resource_provider not between", value1, value2, "resourceProvider");
            return (Criteria) this;
        }

        public Criteria andInfoSourcesIsNull() {
            addCriterion("info_sources is null");
            return (Criteria) this;
        }

        public Criteria andInfoSourcesIsNotNull() {
            addCriterion("info_sources is not null");
            return (Criteria) this;
        }

        public Criteria andInfoSourcesEqualTo(String value) {
            addCriterion("info_sources =", value, "infoSources");
            return (Criteria) this;
        }

        public Criteria andInfoSourcesNotEqualTo(String value) {
            addCriterion("info_sources <>", value, "infoSources");
            return (Criteria) this;
        }

        public Criteria andInfoSourcesGreaterThan(String value) {
            addCriterion("info_sources >", value, "infoSources");
            return (Criteria) this;
        }

        public Criteria andInfoSourcesGreaterThanOrEqualTo(String value) {
            addCriterion("info_sources >=", value, "infoSources");
            return (Criteria) this;
        }

        public Criteria andInfoSourcesLessThan(String value) {
            addCriterion("info_sources <", value, "infoSources");
            return (Criteria) this;
        }

        public Criteria andInfoSourcesLessThanOrEqualTo(String value) {
            addCriterion("info_sources <=", value, "infoSources");
            return (Criteria) this;
        }

        public Criteria andInfoSourcesLike(String value) {
            addCriterion("info_sources like", value, "infoSources");
            return (Criteria) this;
        }

        public Criteria andInfoSourcesNotLike(String value) {
            addCriterion("info_sources not like", value, "infoSources");
            return (Criteria) this;
        }

        public Criteria andInfoSourcesIn(List<String> values) {
            addCriterion("info_sources in", values, "infoSources");
            return (Criteria) this;
        }

        public Criteria andInfoSourcesNotIn(List<String> values) {
            addCriterion("info_sources not in", values, "infoSources");
            return (Criteria) this;
        }

        public Criteria andInfoSourcesBetween(String value1, String value2) {
            addCriterion("info_sources between", value1, value2, "infoSources");
            return (Criteria) this;
        }

        public Criteria andInfoSourcesNotBetween(String value1, String value2) {
            addCriterion("info_sources not between", value1, value2, "infoSources");
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