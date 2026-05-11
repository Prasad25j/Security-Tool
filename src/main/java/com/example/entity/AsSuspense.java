package com.example.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "ASSUSPENSE")
public class AsSuspense {

    @Id
    private String suspenseGuid;

    private Long suspenseNumber;

    private String typeCode;

    private String statusCode;

    private BigDecimal amount;

    private BigDecimal attachedAmount;

    private String companyGuid;

    private String policyNumber;

    private Timestamp effectiveDate;

    private Timestamp effectiveFromDate;

    private Timestamp effectiveToDate;

    private String clientNumber;

    private String firstName;

    private String lastName;

    private String accountNumber;

    private String bankName;

    private String bankNumber;

    private String checkNumber;

    @Lob
    private String xmlData;

    private String batchNumber;

    private String currencyCode;

    private Timestamp updatedGmt;

    // Getters and setters
    public String getSuspenseGuid() {
        return suspenseGuid;
    }

    public void setSuspenseGuid(String suspenseGuid) {
        this.suspenseGuid = suspenseGuid;
    }

    public Long getSuspenseNumber() {
        return suspenseNumber;
    }

    public void setSuspenseNumber(Long suspenseNumber) {
        this.suspenseNumber = suspenseNumber;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAttachedAmount() {
        return attachedAmount;
    }

    public void setAttachedAmount(BigDecimal attachedAmount) {
        this.attachedAmount = attachedAmount;
    }

    public String getCompanyGuid() {
        return companyGuid;
    }

    public void setCompanyGuid(String companyGuid) {
        this.companyGuid = companyGuid;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public Timestamp getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Timestamp effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Timestamp getEffectiveFromDate() {
        return effectiveFromDate;
    }

    public void setEffectiveFromDate(Timestamp effectiveFromDate) {
        this.effectiveFromDate = effectiveFromDate;
    }

    public Timestamp getEffectiveToDate() {
        return effectiveToDate;
    }

    public void setEffectiveToDate(Timestamp effectiveToDate) {
        this.effectiveToDate = effectiveToDate;
    }

    public String getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(String clientNumber) {
        this.clientNumber = clientNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public String getXmlData() {
        return xmlData;
    }

    public void setXmlData(String xmlData) {
        this.xmlData = xmlData;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Timestamp getUpdatedGmt() {
        return updatedGmt;
    }

    public void setUpdatedGmt(Timestamp updatedGmt) {
        this.updatedGmt = updatedGmt;
    }
}