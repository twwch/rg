package com.chtw.bean;

import java.util.List;

public class TextObject {
    private Integer id;

    private String originalData;

    private Integer designIndustryId;

    private List<DesignIndustry> dList;

    private String objectOriented;

    private Integer conId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOriginalData() {
        return originalData;
    }

    public void setOriginalData(String originalData) {
        this.originalData = originalData == null ? null : originalData.trim();
    }

    public Integer getDesignIndustryId() {
        return designIndustryId;
    }

    public void setDesignIndustryId(Integer designIndustryId) {
        this.designIndustryId = designIndustryId;
    }

    public String getObjectOriented() {
        return objectOriented;
    }

    public void setObjectOriented(String objectOriented) {
        this.objectOriented = objectOriented == null ? null : objectOriented.trim();
    }

    public Integer getConId() {
        return conId;
    }

    public void setConId(Integer conId) {
        this.conId = conId;
    }

    public List<DesignIndustry> getdList() {
        return dList;
    }

    public void setdList(List<DesignIndustry> dList) {
        this.dList = dList;
    }
}