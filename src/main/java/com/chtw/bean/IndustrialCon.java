package com.chtw.bean;

public class IndustrialCon {
    private Integer id;

    private String specificRegions;

    private String industrialOrientation;

    private Integer conId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpecificRegions() {
        return specificRegions;
    }

    public void setSpecificRegions(String specificRegions) {
        this.specificRegions = specificRegions == null ? null : specificRegions.trim();
    }

    public String getIndustrialOrientation() {
        return industrialOrientation;
    }

    public void setIndustrialOrientation(String industrialOrientation) {
        this.industrialOrientation = industrialOrientation == null ? null : industrialOrientation.trim();
    }

    public Integer getConId() {
        return conId;
    }

    public void setConId(Integer conId) {
        this.conId = conId;
    }
}