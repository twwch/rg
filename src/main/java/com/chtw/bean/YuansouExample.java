package com.chtw.bean;

import java.util.ArrayList;
import java.util.List;

public class YuansouExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YuansouExample() {
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

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNull() {
            addCriterion("leader is null");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNotNull() {
            addCriterion("leader is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderEqualTo(String value) {
            addCriterion("leader =", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotEqualTo(String value) {
            addCriterion("leader <>", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThan(String value) {
            addCriterion("leader >", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("leader >=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThan(String value) {
            addCriterion("leader <", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThanOrEqualTo(String value) {
            addCriterion("leader <=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLike(String value) {
            addCriterion("leader like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotLike(String value) {
            addCriterion("leader not like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderIn(List<String> values) {
            addCriterion("leader in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotIn(List<String> values) {
            addCriterion("leader not in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderBetween(String value1, String value2) {
            addCriterion("leader between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotBetween(String value1, String value2) {
            addCriterion("leader not between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andFileIsNull() {
            addCriterion("file is null");
            return (Criteria) this;
        }

        public Criteria andFileIsNotNull() {
            addCriterion("file is not null");
            return (Criteria) this;
        }

        public Criteria andFileEqualTo(String value) {
            addCriterion("file =", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileNotEqualTo(String value) {
            addCriterion("file <>", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileGreaterThan(String value) {
            addCriterion("file >", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileGreaterThanOrEqualTo(String value) {
            addCriterion("file >=", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileLessThan(String value) {
            addCriterion("file <", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileLessThanOrEqualTo(String value) {
            addCriterion("file <=", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileLike(String value) {
            addCriterion("file like", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileNotLike(String value) {
            addCriterion("file not like", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileIn(List<String> values) {
            addCriterion("file in", values, "file");
            return (Criteria) this;
        }

        public Criteria andFileNotIn(List<String> values) {
            addCriterion("file not in", values, "file");
            return (Criteria) this;
        }

        public Criteria andFileBetween(String value1, String value2) {
            addCriterion("file between", value1, value2, "file");
            return (Criteria) this;
        }

        public Criteria andFileNotBetween(String value1, String value2) {
            addCriterion("file not between", value1, value2, "file");
            return (Criteria) this;
        }

        public Criteria andNumberOfIssuesIsNull() {
            addCriterion("number_of_issues is null");
            return (Criteria) this;
        }

        public Criteria andNumberOfIssuesIsNotNull() {
            addCriterion("number_of_issues is not null");
            return (Criteria) this;
        }

        public Criteria andNumberOfIssuesEqualTo(String value) {
            addCriterion("number_of_issues =", value, "numberOfIssues");
            return (Criteria) this;
        }

        public Criteria andNumberOfIssuesNotEqualTo(String value) {
            addCriterion("number_of_issues <>", value, "numberOfIssues");
            return (Criteria) this;
        }

        public Criteria andNumberOfIssuesGreaterThan(String value) {
            addCriterion("number_of_issues >", value, "numberOfIssues");
            return (Criteria) this;
        }

        public Criteria andNumberOfIssuesGreaterThanOrEqualTo(String value) {
            addCriterion("number_of_issues >=", value, "numberOfIssues");
            return (Criteria) this;
        }

        public Criteria andNumberOfIssuesLessThan(String value) {
            addCriterion("number_of_issues <", value, "numberOfIssues");
            return (Criteria) this;
        }

        public Criteria andNumberOfIssuesLessThanOrEqualTo(String value) {
            addCriterion("number_of_issues <=", value, "numberOfIssues");
            return (Criteria) this;
        }

        public Criteria andNumberOfIssuesLike(String value) {
            addCriterion("number_of_issues like", value, "numberOfIssues");
            return (Criteria) this;
        }

        public Criteria andNumberOfIssuesNotLike(String value) {
            addCriterion("number_of_issues not like", value, "numberOfIssues");
            return (Criteria) this;
        }

        public Criteria andNumberOfIssuesIn(List<String> values) {
            addCriterion("number_of_issues in", values, "numberOfIssues");
            return (Criteria) this;
        }

        public Criteria andNumberOfIssuesNotIn(List<String> values) {
            addCriterion("number_of_issues not in", values, "numberOfIssues");
            return (Criteria) this;
        }

        public Criteria andNumberOfIssuesBetween(String value1, String value2) {
            addCriterion("number_of_issues between", value1, value2, "numberOfIssues");
            return (Criteria) this;
        }

        public Criteria andNumberOfIssuesNotBetween(String value1, String value2) {
            addCriterion("number_of_issues not between", value1, value2, "numberOfIssues");
            return (Criteria) this;
        }

        public Criteria andIssueSituationIsNull() {
            addCriterion("issue_situation is null");
            return (Criteria) this;
        }

        public Criteria andIssueSituationIsNotNull() {
            addCriterion("issue_situation is not null");
            return (Criteria) this;
        }

        public Criteria andIssueSituationEqualTo(String value) {
            addCriterion("issue_situation =", value, "issueSituation");
            return (Criteria) this;
        }

        public Criteria andIssueSituationNotEqualTo(String value) {
            addCriterion("issue_situation <>", value, "issueSituation");
            return (Criteria) this;
        }

        public Criteria andIssueSituationGreaterThan(String value) {
            addCriterion("issue_situation >", value, "issueSituation");
            return (Criteria) this;
        }

        public Criteria andIssueSituationGreaterThanOrEqualTo(String value) {
            addCriterion("issue_situation >=", value, "issueSituation");
            return (Criteria) this;
        }

        public Criteria andIssueSituationLessThan(String value) {
            addCriterion("issue_situation <", value, "issueSituation");
            return (Criteria) this;
        }

        public Criteria andIssueSituationLessThanOrEqualTo(String value) {
            addCriterion("issue_situation <=", value, "issueSituation");
            return (Criteria) this;
        }

        public Criteria andIssueSituationLike(String value) {
            addCriterion("issue_situation like", value, "issueSituation");
            return (Criteria) this;
        }

        public Criteria andIssueSituationNotLike(String value) {
            addCriterion("issue_situation not like", value, "issueSituation");
            return (Criteria) this;
        }

        public Criteria andIssueSituationIn(List<String> values) {
            addCriterion("issue_situation in", values, "issueSituation");
            return (Criteria) this;
        }

        public Criteria andIssueSituationNotIn(List<String> values) {
            addCriterion("issue_situation not in", values, "issueSituation");
            return (Criteria) this;
        }

        public Criteria andIssueSituationBetween(String value1, String value2) {
            addCriterion("issue_situation between", value1, value2, "issueSituation");
            return (Criteria) this;
        }

        public Criteria andIssueSituationNotBetween(String value1, String value2) {
            addCriterion("issue_situation not between", value1, value2, "issueSituation");
            return (Criteria) this;
        }

        public Criteria andIssuesIssuesOurIsNull() {
            addCriterion("issues_issues_our is null");
            return (Criteria) this;
        }

        public Criteria andIssuesIssuesOurIsNotNull() {
            addCriterion("issues_issues_our is not null");
            return (Criteria) this;
        }

        public Criteria andIssuesIssuesOurEqualTo(String value) {
            addCriterion("issues_issues_our =", value, "issuesIssuesOur");
            return (Criteria) this;
        }

        public Criteria andIssuesIssuesOurNotEqualTo(String value) {
            addCriterion("issues_issues_our <>", value, "issuesIssuesOur");
            return (Criteria) this;
        }

        public Criteria andIssuesIssuesOurGreaterThan(String value) {
            addCriterion("issues_issues_our >", value, "issuesIssuesOur");
            return (Criteria) this;
        }

        public Criteria andIssuesIssuesOurGreaterThanOrEqualTo(String value) {
            addCriterion("issues_issues_our >=", value, "issuesIssuesOur");
            return (Criteria) this;
        }

        public Criteria andIssuesIssuesOurLessThan(String value) {
            addCriterion("issues_issues_our <", value, "issuesIssuesOur");
            return (Criteria) this;
        }

        public Criteria andIssuesIssuesOurLessThanOrEqualTo(String value) {
            addCriterion("issues_issues_our <=", value, "issuesIssuesOur");
            return (Criteria) this;
        }

        public Criteria andIssuesIssuesOurLike(String value) {
            addCriterion("issues_issues_our like", value, "issuesIssuesOur");
            return (Criteria) this;
        }

        public Criteria andIssuesIssuesOurNotLike(String value) {
            addCriterion("issues_issues_our not like", value, "issuesIssuesOur");
            return (Criteria) this;
        }

        public Criteria andIssuesIssuesOurIn(List<String> values) {
            addCriterion("issues_issues_our in", values, "issuesIssuesOur");
            return (Criteria) this;
        }

        public Criteria andIssuesIssuesOurNotIn(List<String> values) {
            addCriterion("issues_issues_our not in", values, "issuesIssuesOur");
            return (Criteria) this;
        }

        public Criteria andIssuesIssuesOurBetween(String value1, String value2) {
            addCriterion("issues_issues_our between", value1, value2, "issuesIssuesOur");
            return (Criteria) this;
        }

        public Criteria andIssuesIssuesOurNotBetween(String value1, String value2) {
            addCriterion("issues_issues_our not between", value1, value2, "issuesIssuesOur");
            return (Criteria) this;
        }

        public Criteria andFieldOfOurIsNull() {
            addCriterion("field_of_our is null");
            return (Criteria) this;
        }

        public Criteria andFieldOfOurIsNotNull() {
            addCriterion("field_of_our is not null");
            return (Criteria) this;
        }

        public Criteria andFieldOfOurEqualTo(String value) {
            addCriterion("field_of_our =", value, "fieldOfOur");
            return (Criteria) this;
        }

        public Criteria andFieldOfOurNotEqualTo(String value) {
            addCriterion("field_of_our <>", value, "fieldOfOur");
            return (Criteria) this;
        }

        public Criteria andFieldOfOurGreaterThan(String value) {
            addCriterion("field_of_our >", value, "fieldOfOur");
            return (Criteria) this;
        }

        public Criteria andFieldOfOurGreaterThanOrEqualTo(String value) {
            addCriterion("field_of_our >=", value, "fieldOfOur");
            return (Criteria) this;
        }

        public Criteria andFieldOfOurLessThan(String value) {
            addCriterion("field_of_our <", value, "fieldOfOur");
            return (Criteria) this;
        }

        public Criteria andFieldOfOurLessThanOrEqualTo(String value) {
            addCriterion("field_of_our <=", value, "fieldOfOur");
            return (Criteria) this;
        }

        public Criteria andFieldOfOurLike(String value) {
            addCriterion("field_of_our like", value, "fieldOfOur");
            return (Criteria) this;
        }

        public Criteria andFieldOfOurNotLike(String value) {
            addCriterion("field_of_our not like", value, "fieldOfOur");
            return (Criteria) this;
        }

        public Criteria andFieldOfOurIn(List<String> values) {
            addCriterion("field_of_our in", values, "fieldOfOur");
            return (Criteria) this;
        }

        public Criteria andFieldOfOurNotIn(List<String> values) {
            addCriterion("field_of_our not in", values, "fieldOfOur");
            return (Criteria) this;
        }

        public Criteria andFieldOfOurBetween(String value1, String value2) {
            addCriterion("field_of_our between", value1, value2, "fieldOfOur");
            return (Criteria) this;
        }

        public Criteria andFieldOfOurNotBetween(String value1, String value2) {
            addCriterion("field_of_our not between", value1, value2, "fieldOfOur");
            return (Criteria) this;
        }

        public Criteria andXiFieldOfOurIsNull() {
            addCriterion("xi_field_of_our is null");
            return (Criteria) this;
        }

        public Criteria andXiFieldOfOurIsNotNull() {
            addCriterion("xi_field_of_our is not null");
            return (Criteria) this;
        }

        public Criteria andXiFieldOfOurEqualTo(String value) {
            addCriterion("xi_field_of_our =", value, "xiFieldOfOur");
            return (Criteria) this;
        }

        public Criteria andXiFieldOfOurNotEqualTo(String value) {
            addCriterion("xi_field_of_our <>", value, "xiFieldOfOur");
            return (Criteria) this;
        }

        public Criteria andXiFieldOfOurGreaterThan(String value) {
            addCriterion("xi_field_of_our >", value, "xiFieldOfOur");
            return (Criteria) this;
        }

        public Criteria andXiFieldOfOurGreaterThanOrEqualTo(String value) {
            addCriterion("xi_field_of_our >=", value, "xiFieldOfOur");
            return (Criteria) this;
        }

        public Criteria andXiFieldOfOurLessThan(String value) {
            addCriterion("xi_field_of_our <", value, "xiFieldOfOur");
            return (Criteria) this;
        }

        public Criteria andXiFieldOfOurLessThanOrEqualTo(String value) {
            addCriterion("xi_field_of_our <=", value, "xiFieldOfOur");
            return (Criteria) this;
        }

        public Criteria andXiFieldOfOurLike(String value) {
            addCriterion("xi_field_of_our like", value, "xiFieldOfOur");
            return (Criteria) this;
        }

        public Criteria andXiFieldOfOurNotLike(String value) {
            addCriterion("xi_field_of_our not like", value, "xiFieldOfOur");
            return (Criteria) this;
        }

        public Criteria andXiFieldOfOurIn(List<String> values) {
            addCriterion("xi_field_of_our in", values, "xiFieldOfOur");
            return (Criteria) this;
        }

        public Criteria andXiFieldOfOurNotIn(List<String> values) {
            addCriterion("xi_field_of_our not in", values, "xiFieldOfOur");
            return (Criteria) this;
        }

        public Criteria andXiFieldOfOurBetween(String value1, String value2) {
            addCriterion("xi_field_of_our between", value1, value2, "xiFieldOfOur");
            return (Criteria) this;
        }

        public Criteria andXiFieldOfOurNotBetween(String value1, String value2) {
            addCriterion("xi_field_of_our not between", value1, value2, "xiFieldOfOur");
            return (Criteria) this;
        }

        public Criteria andOurCooperationIsNull() {
            addCriterion("our_cooperation is null");
            return (Criteria) this;
        }

        public Criteria andOurCooperationIsNotNull() {
            addCriterion("our_cooperation is not null");
            return (Criteria) this;
        }

        public Criteria andOurCooperationEqualTo(String value) {
            addCriterion("our_cooperation =", value, "ourCooperation");
            return (Criteria) this;
        }

        public Criteria andOurCooperationNotEqualTo(String value) {
            addCriterion("our_cooperation <>", value, "ourCooperation");
            return (Criteria) this;
        }

        public Criteria andOurCooperationGreaterThan(String value) {
            addCriterion("our_cooperation >", value, "ourCooperation");
            return (Criteria) this;
        }

        public Criteria andOurCooperationGreaterThanOrEqualTo(String value) {
            addCriterion("our_cooperation >=", value, "ourCooperation");
            return (Criteria) this;
        }

        public Criteria andOurCooperationLessThan(String value) {
            addCriterion("our_cooperation <", value, "ourCooperation");
            return (Criteria) this;
        }

        public Criteria andOurCooperationLessThanOrEqualTo(String value) {
            addCriterion("our_cooperation <=", value, "ourCooperation");
            return (Criteria) this;
        }

        public Criteria andOurCooperationLike(String value) {
            addCriterion("our_cooperation like", value, "ourCooperation");
            return (Criteria) this;
        }

        public Criteria andOurCooperationNotLike(String value) {
            addCriterion("our_cooperation not like", value, "ourCooperation");
            return (Criteria) this;
        }

        public Criteria andOurCooperationIn(List<String> values) {
            addCriterion("our_cooperation in", values, "ourCooperation");
            return (Criteria) this;
        }

        public Criteria andOurCooperationNotIn(List<String> values) {
            addCriterion("our_cooperation not in", values, "ourCooperation");
            return (Criteria) this;
        }

        public Criteria andOurCooperationBetween(String value1, String value2) {
            addCriterion("our_cooperation between", value1, value2, "ourCooperation");
            return (Criteria) this;
        }

        public Criteria andOurCooperationNotBetween(String value1, String value2) {
            addCriterion("our_cooperation not between", value1, value2, "ourCooperation");
            return (Criteria) this;
        }

        public Criteria andIssuesIssuesTgIsNull() {
            addCriterion("issues_issues_tg is null");
            return (Criteria) this;
        }

        public Criteria andIssuesIssuesTgIsNotNull() {
            addCriterion("issues_issues_tg is not null");
            return (Criteria) this;
        }

        public Criteria andIssuesIssuesTgEqualTo(String value) {
            addCriterion("issues_issues_tg =", value, "issuesIssuesTg");
            return (Criteria) this;
        }

        public Criteria andIssuesIssuesTgNotEqualTo(String value) {
            addCriterion("issues_issues_tg <>", value, "issuesIssuesTg");
            return (Criteria) this;
        }

        public Criteria andIssuesIssuesTgGreaterThan(String value) {
            addCriterion("issues_issues_tg >", value, "issuesIssuesTg");
            return (Criteria) this;
        }

        public Criteria andIssuesIssuesTgGreaterThanOrEqualTo(String value) {
            addCriterion("issues_issues_tg >=", value, "issuesIssuesTg");
            return (Criteria) this;
        }

        public Criteria andIssuesIssuesTgLessThan(String value) {
            addCriterion("issues_issues_tg <", value, "issuesIssuesTg");
            return (Criteria) this;
        }

        public Criteria andIssuesIssuesTgLessThanOrEqualTo(String value) {
            addCriterion("issues_issues_tg <=", value, "issuesIssuesTg");
            return (Criteria) this;
        }

        public Criteria andIssuesIssuesTgLike(String value) {
            addCriterion("issues_issues_tg like", value, "issuesIssuesTg");
            return (Criteria) this;
        }

        public Criteria andIssuesIssuesTgNotLike(String value) {
            addCriterion("issues_issues_tg not like", value, "issuesIssuesTg");
            return (Criteria) this;
        }

        public Criteria andIssuesIssuesTgIn(List<String> values) {
            addCriterion("issues_issues_tg in", values, "issuesIssuesTg");
            return (Criteria) this;
        }

        public Criteria andIssuesIssuesTgNotIn(List<String> values) {
            addCriterion("issues_issues_tg not in", values, "issuesIssuesTg");
            return (Criteria) this;
        }

        public Criteria andIssuesIssuesTgBetween(String value1, String value2) {
            addCriterion("issues_issues_tg between", value1, value2, "issuesIssuesTg");
            return (Criteria) this;
        }

        public Criteria andIssuesIssuesTgNotBetween(String value1, String value2) {
            addCriterion("issues_issues_tg not between", value1, value2, "issuesIssuesTg");
            return (Criteria) this;
        }

        public Criteria andFieldOfTgIsNull() {
            addCriterion("field_of_tg is null");
            return (Criteria) this;
        }

        public Criteria andFieldOfTgIsNotNull() {
            addCriterion("field_of_tg is not null");
            return (Criteria) this;
        }

        public Criteria andFieldOfTgEqualTo(String value) {
            addCriterion("field_of_tg =", value, "fieldOfTg");
            return (Criteria) this;
        }

        public Criteria andFieldOfTgNotEqualTo(String value) {
            addCriterion("field_of_tg <>", value, "fieldOfTg");
            return (Criteria) this;
        }

        public Criteria andFieldOfTgGreaterThan(String value) {
            addCriterion("field_of_tg >", value, "fieldOfTg");
            return (Criteria) this;
        }

        public Criteria andFieldOfTgGreaterThanOrEqualTo(String value) {
            addCriterion("field_of_tg >=", value, "fieldOfTg");
            return (Criteria) this;
        }

        public Criteria andFieldOfTgLessThan(String value) {
            addCriterion("field_of_tg <", value, "fieldOfTg");
            return (Criteria) this;
        }

        public Criteria andFieldOfTgLessThanOrEqualTo(String value) {
            addCriterion("field_of_tg <=", value, "fieldOfTg");
            return (Criteria) this;
        }

        public Criteria andFieldOfTgLike(String value) {
            addCriterion("field_of_tg like", value, "fieldOfTg");
            return (Criteria) this;
        }

        public Criteria andFieldOfTgNotLike(String value) {
            addCriterion("field_of_tg not like", value, "fieldOfTg");
            return (Criteria) this;
        }

        public Criteria andFieldOfTgIn(List<String> values) {
            addCriterion("field_of_tg in", values, "fieldOfTg");
            return (Criteria) this;
        }

        public Criteria andFieldOfTgNotIn(List<String> values) {
            addCriterion("field_of_tg not in", values, "fieldOfTg");
            return (Criteria) this;
        }

        public Criteria andFieldOfTgBetween(String value1, String value2) {
            addCriterion("field_of_tg between", value1, value2, "fieldOfTg");
            return (Criteria) this;
        }

        public Criteria andFieldOfTgNotBetween(String value1, String value2) {
            addCriterion("field_of_tg not between", value1, value2, "fieldOfTg");
            return (Criteria) this;
        }

        public Criteria andXiFieldOfTgIsNull() {
            addCriterion("xi_field_of_tg is null");
            return (Criteria) this;
        }

        public Criteria andXiFieldOfTgIsNotNull() {
            addCriterion("xi_field_of_tg is not null");
            return (Criteria) this;
        }

        public Criteria andXiFieldOfTgEqualTo(String value) {
            addCriterion("xi_field_of_tg =", value, "xiFieldOfTg");
            return (Criteria) this;
        }

        public Criteria andXiFieldOfTgNotEqualTo(String value) {
            addCriterion("xi_field_of_tg <>", value, "xiFieldOfTg");
            return (Criteria) this;
        }

        public Criteria andXiFieldOfTgGreaterThan(String value) {
            addCriterion("xi_field_of_tg >", value, "xiFieldOfTg");
            return (Criteria) this;
        }

        public Criteria andXiFieldOfTgGreaterThanOrEqualTo(String value) {
            addCriterion("xi_field_of_tg >=", value, "xiFieldOfTg");
            return (Criteria) this;
        }

        public Criteria andXiFieldOfTgLessThan(String value) {
            addCriterion("xi_field_of_tg <", value, "xiFieldOfTg");
            return (Criteria) this;
        }

        public Criteria andXiFieldOfTgLessThanOrEqualTo(String value) {
            addCriterion("xi_field_of_tg <=", value, "xiFieldOfTg");
            return (Criteria) this;
        }

        public Criteria andXiFieldOfTgLike(String value) {
            addCriterion("xi_field_of_tg like", value, "xiFieldOfTg");
            return (Criteria) this;
        }

        public Criteria andXiFieldOfTgNotLike(String value) {
            addCriterion("xi_field_of_tg not like", value, "xiFieldOfTg");
            return (Criteria) this;
        }

        public Criteria andXiFieldOfTgIn(List<String> values) {
            addCriterion("xi_field_of_tg in", values, "xiFieldOfTg");
            return (Criteria) this;
        }

        public Criteria andXiFieldOfTgNotIn(List<String> values) {
            addCriterion("xi_field_of_tg not in", values, "xiFieldOfTg");
            return (Criteria) this;
        }

        public Criteria andXiFieldOfTgBetween(String value1, String value2) {
            addCriterion("xi_field_of_tg between", value1, value2, "xiFieldOfTg");
            return (Criteria) this;
        }

        public Criteria andXiFieldOfTgNotBetween(String value1, String value2) {
            addCriterion("xi_field_of_tg not between", value1, value2, "xiFieldOfTg");
            return (Criteria) this;
        }

        public Criteria andTgCooperationIsNull() {
            addCriterion("tg_cooperation is null");
            return (Criteria) this;
        }

        public Criteria andTgCooperationIsNotNull() {
            addCriterion("tg_cooperation is not null");
            return (Criteria) this;
        }

        public Criteria andTgCooperationEqualTo(String value) {
            addCriterion("tg_cooperation =", value, "tgCooperation");
            return (Criteria) this;
        }

        public Criteria andTgCooperationNotEqualTo(String value) {
            addCriterion("tg_cooperation <>", value, "tgCooperation");
            return (Criteria) this;
        }

        public Criteria andTgCooperationGreaterThan(String value) {
            addCriterion("tg_cooperation >", value, "tgCooperation");
            return (Criteria) this;
        }

        public Criteria andTgCooperationGreaterThanOrEqualTo(String value) {
            addCriterion("tg_cooperation >=", value, "tgCooperation");
            return (Criteria) this;
        }

        public Criteria andTgCooperationLessThan(String value) {
            addCriterion("tg_cooperation <", value, "tgCooperation");
            return (Criteria) this;
        }

        public Criteria andTgCooperationLessThanOrEqualTo(String value) {
            addCriterion("tg_cooperation <=", value, "tgCooperation");
            return (Criteria) this;
        }

        public Criteria andTgCooperationLike(String value) {
            addCriterion("tg_cooperation like", value, "tgCooperation");
            return (Criteria) this;
        }

        public Criteria andTgCooperationNotLike(String value) {
            addCriterion("tg_cooperation not like", value, "tgCooperation");
            return (Criteria) this;
        }

        public Criteria andTgCooperationIn(List<String> values) {
            addCriterion("tg_cooperation in", values, "tgCooperation");
            return (Criteria) this;
        }

        public Criteria andTgCooperationNotIn(List<String> values) {
            addCriterion("tg_cooperation not in", values, "tgCooperation");
            return (Criteria) this;
        }

        public Criteria andTgCooperationBetween(String value1, String value2) {
            addCriterion("tg_cooperation between", value1, value2, "tgCooperation");
            return (Criteria) this;
        }

        public Criteria andTgCooperationNotBetween(String value1, String value2) {
            addCriterion("tg_cooperation not between", value1, value2, "tgCooperation");
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

        public Criteria andInfoIsNull() {
            addCriterion("info is null");
            return (Criteria) this;
        }

        public Criteria andInfoIsNotNull() {
            addCriterion("info is not null");
            return (Criteria) this;
        }

        public Criteria andInfoEqualTo(String value) {
            addCriterion("info =", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotEqualTo(String value) {
            addCriterion("info <>", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThan(String value) {
            addCriterion("info >", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThanOrEqualTo(String value) {
            addCriterion("info >=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThan(String value) {
            addCriterion("info <", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThanOrEqualTo(String value) {
            addCriterion("info <=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLike(String value) {
            addCriterion("info like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotLike(String value) {
            addCriterion("info not like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoIn(List<String> values) {
            addCriterion("info in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotIn(List<String> values) {
            addCriterion("info not in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoBetween(String value1, String value2) {
            addCriterion("info between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotBetween(String value1, String value2) {
            addCriterion("info not between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andPictureNameIsNull() {
            addCriterion("picture_name is null");
            return (Criteria) this;
        }

        public Criteria andPictureNameIsNotNull() {
            addCriterion("picture_name is not null");
            return (Criteria) this;
        }

        public Criteria andPictureNameEqualTo(String value) {
            addCriterion("picture_name =", value, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameNotEqualTo(String value) {
            addCriterion("picture_name <>", value, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameGreaterThan(String value) {
            addCriterion("picture_name >", value, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameGreaterThanOrEqualTo(String value) {
            addCriterion("picture_name >=", value, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameLessThan(String value) {
            addCriterion("picture_name <", value, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameLessThanOrEqualTo(String value) {
            addCriterion("picture_name <=", value, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameLike(String value) {
            addCriterion("picture_name like", value, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameNotLike(String value) {
            addCriterion("picture_name not like", value, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameIn(List<String> values) {
            addCriterion("picture_name in", values, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameNotIn(List<String> values) {
            addCriterion("picture_name not in", values, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameBetween(String value1, String value2) {
            addCriterion("picture_name between", value1, value2, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameNotBetween(String value1, String value2) {
            addCriterion("picture_name not between", value1, value2, "pictureName");
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