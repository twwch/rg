package com.chtw.bean;

import java.util.List;

public class InvestmentServices {
    private Integer id;

    private String resourceProvider;

    private String infoSources;

    private Integer conId;

    private List<InvestmentServicesCi> ciList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResourceProvider() {
        return resourceProvider;
    }

    public void setResourceProvider(String resourceProvider) {
        this.resourceProvider = resourceProvider == null ? null : resourceProvider.trim();
    }

    public String getInfoSources() {
        return infoSources;
    }

    public void setInfoSources(String infoSources) {
        this.infoSources = infoSources == null ? null : infoSources.trim();
    }

    public Integer getConId() {
        return conId;
    }

    public void setConId(Integer conId) {
        this.conId = conId;
    }

    public List<InvestmentServicesCi> getCiList() {
        return ciList;
    }

    public void setCiList(List<InvestmentServicesCi> ciList) {
        this.ciList = ciList;
    }
}