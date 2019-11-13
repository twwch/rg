package com.chtw.bean;

public class DesignIndustry {
    private Integer id;

    private String designIndustry;

    private Integer designIndustryId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesignIndustry() {
        return designIndustry;
    }

    public void setDesignIndustry(String designIndustry) {
        this.designIndustry = designIndustry == null ? null : designIndustry.trim();
    }

    public Integer getDesignIndustryId() {
        return designIndustryId;
    }

    public void setDesignIndustryId(Integer designIndustryId) {
        this.designIndustryId = designIndustryId;
    }
}