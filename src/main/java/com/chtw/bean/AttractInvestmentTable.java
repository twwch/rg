package com.chtw.bean;

public class AttractInvestmentTable {
    private Integer id;

    private String resourceIndustry;

    private String industryInvolved;

    private String entryName;

    private String entryType;

    private String policyProvisions;

    private String objectOriented;

    private String keywords;

    private String timeFrame;

    private String resourceProvider;

    private String infoSources;

    private String bz;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResourceIndustry() {
        return resourceIndustry;
    }

    public void setResourceIndustry(String resourceIndustry) {
        this.resourceIndustry = resourceIndustry == null ? null : resourceIndustry.trim();
    }

    public String getIndustryInvolved() {
        return industryInvolved;
    }

    public void setIndustryInvolved(String industryInvolved) {
        this.industryInvolved = industryInvolved == null ? null : industryInvolved.trim();
    }

    public String getEntryName() {
        return entryName;
    }

    public void setEntryName(String entryName) {
        this.entryName = entryName == null ? null : entryName.trim();
    }

    public String getEntryType() {
        return entryType;
    }

    public void setEntryType(String entryType) {
        this.entryType = entryType == null ? null : entryType.trim();
    }

    public String getPolicyProvisions() {
        return policyProvisions;
    }

    public void setPolicyProvisions(String policyProvisions) {
        this.policyProvisions = policyProvisions == null ? null : policyProvisions.trim();
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

    @Override
    public String toString() {
        return "AttractInvestmentTable{" +
                "id=" + id +
                ", resourceIndustry='" + resourceIndustry + '\'' +
                ", industryInvolved='" + industryInvolved + '\'' +
                ", entryName='" + entryName + '\'' +
                ", entryType='" + entryType + '\'' +
                ", policyProvisions='" + policyProvisions + '\'' +
                ", objectOriented='" + objectOriented + '\'' +
                ", keywords='" + keywords + '\'' +
                ", timeFrame='" + timeFrame + '\'' +
                ", resourceProvider='" + resourceProvider + '\'' +
                ", infoSources='" + infoSources + '\'' +
                ", bz='" + bz + '\'' +
                '}';
    }
}