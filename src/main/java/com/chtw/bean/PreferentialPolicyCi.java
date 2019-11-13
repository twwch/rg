package com.chtw.bean;

import java.util.List;

public class PreferentialPolicyCi {
    private Integer id;

    private String resourceType;

    private Integer conId;

    private List<TextObject> OList;

    private Integer resourceTypeId;

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

    public Integer getConId() {
        return conId;
    }

    public void setConId(Integer conId) {
        this.conId = conId;
    }

    public Integer getResourceTypeId() {
        return resourceTypeId;
    }

    public void setResourceTypeId(Integer resourceTypeId) {
        this.resourceTypeId = resourceTypeId;
    }

    public List<TextObject> getOList() {
        return OList;
    }

    public void setOList(List<TextObject> OList) {
        this.OList = OList;
    }
}