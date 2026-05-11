package com.example.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class AsSuspenseFieldId implements Serializable {

    private String suspenseGuid;

    private String fieldName;

    // Getters and setters
    public String getSuspenseGuid() {
        return suspenseGuid;
    }

    public void setSuspenseGuid(String suspenseGuid) {
        this.suspenseGuid = suspenseGuid;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}