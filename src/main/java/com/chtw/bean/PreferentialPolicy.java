package com.chtw.bean;

import java.util.List;

public class PreferentialPolicy {
    private Integer id;

    private Integer resourceTypeId;

    private List<PreferentialPolicyCi> preCiList;

    private String timeFrame;

    private String resourceProvider;

    private String resourceUseOf;

    private String infoResouces;

    private String bz;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getResourceTypeId() {
        return resourceTypeId;
    }

    public void setResourceTypeId(Integer resourceTypeId) {
        this.resourceTypeId = resourceTypeId;
    }

    public String getTimeFrame() {
        return timeFrame;
    }

    public void setTimeFrame(String timeFrame) {
        this.timeFrame = timeFrame == null ? null : timeFrame.trim();
    }

    public String getResourceProvider() {
        return resourceProvider;
    }

    public void setResourceProvider(String resourceProvider) {
        this.resourceProvider = resourceProvider == null ? null : resourceProvider.trim();
    }

    public String getResourceUseOf() {
        return resourceUseOf;
    }

    public void setResourceUseOf(String resourceUseOf) {
        this.resourceUseOf = resourceUseOf == null ? null : resourceUseOf.trim();
    }

    public String getInfoResouces() {
        return infoResouces;
    }

    public void setInfoResouces(String infoResouces) {
        this.infoResouces = infoResouces == null ? null : infoResouces.trim();
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public List<PreferentialPolicyCi> getPreCiList() {
        return preCiList;
    }

    public void setPreCiList(List<PreferentialPolicyCi> preCiList) {
        this.preCiList = preCiList;
    }
}