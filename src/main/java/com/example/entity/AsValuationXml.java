package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "ASVALUATIONXML", schema = "OIPA_PAS")
public class AsValuationXml {

    @Id
    private String activityGuid;

    @Lob
    private String xmlData;

    // Getters and setters
    public String getActivityGuid() {
        return activityGuid;
    }

    public void setActivityGuid(String activityGuid) {
        this.activityGuid = activityGuid;
    }

    public String getXmlData() {
        return xmlData;
    }

    public void setXmlData(String xmlData) {
        this.xmlData = xmlData;
    }
}