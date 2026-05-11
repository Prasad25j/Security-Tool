package com.example.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class AsAccountingDetailFieldId implements Serializable {

    private String accountingDetailGuid;

    private String fieldName;

    // Getters and setters
    public String getAccountingDetailGuid() {
        return accountingDetailGuid;
    }

    public void setAccountingDetailGuid(String accountingDetailGuid) {
        this.accountingDetailGuid = accountingDetailGuid;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}