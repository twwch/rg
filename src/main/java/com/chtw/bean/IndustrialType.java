package com.chtw.bean;

import java.util.List;

public class IndustrialType {
    private Integer id;

    private String resourceType;

    private Integer numberQiye;

    private String infoSources;

    private String bz;

    private Integer conId;

    private List<IndustrialCon> conList;

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

    public Integer getNumberQiye() {
        return numberQiye;
    }

    public void setNumberQiye(Integer numberQiye) {
        this.numberQiye = numberQiye;
    }

    public String getInfoSources() {
        return infoSources;
    }

    public void setInfoSources(String infoSources) {
        this.infoSources = infoSources == null ? null : infoSources.trim();
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

    public List<IndustrialCon> getConList() {
        return conList;
    }

    public void setConList(List<IndustrialCon> conList) {
        this.conList = conList;
    }
}