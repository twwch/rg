package com.chtw.bean;

public class IndustryInvolved {
    private Integer id;

    private String industryInvolved;

    private Integer industryInvolvedId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIndustryInvolved() {
        return industryInvolved;
    }

    public void setIndustryInvolved(String industryInvolved) {
        this.industryInvolved = industryInvolved == null ? null : industryInvolved.trim();
    }

    public Integer getIndustryInvolvedId() {
        return industryInvolvedId;
    }

    public void setIndustryInvolvedId(Integer industryInvolvedId) {
        this.industryInvolvedId = industryInvolvedId;
    }
}