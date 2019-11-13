package com.chtw.bean;

import java.util.List;

public class InvestmentServicesCi {
    private Integer id;

    private String resourceType;

    private String originalMaterials;

    private Integer industryInvolvedId;

    private List<IndustryInvolved> induList;

    private String objectOriented;

    private String keywords;

    private String bz;

    private Integer conId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType == null ? null : resourceType.trim();
    }

    public String getOriginalMaterials() {
        return originalMaterials;
    }

    public void setOriginalMaterials(String originalMaterials) {
        this.originalMaterials = originalMaterials == null ? null : originalMaterials.trim();
    }

    public Integer getIndustryInvolvedId() {
        return industryInvolvedId;
    }

    public void setIndustryInvolvedId(Integer industryInvolvedId) {
        this.industryInvolvedId = industryInvolvedId;
    }

    public String getObjectOriented() {
        return objectOriented;
    }

    public void setObjectOriented(String objectOriented) {
        this.objectOriented = objectOriented == null ? null : objectOriented.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public Integer getConId() {
        return conId;
    }

    public void setConId(Integer conId) {
        this.conId = conId;
    }

    public List<IndustryInvolved> getInduList() {
        return induList;
    }

    public void setInduList(List<IndustryInvolved> induList) {
        this.induList = induList;
    }
}