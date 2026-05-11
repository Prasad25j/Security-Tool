package com.example.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "ASACCOUNTINGDETAIL")
public class AsAccountingDetail {

    @Id
    private String accountingDetailGuid;

    private String activityGuid;

    private String suspenseGuid;

    private String fundGuid;

    private String chartOfAccountsEntryGuid;

    private String accountNumber;

    private String debitCreditCode;

    private BigDecimal amount;

    private String gainLossFlag;

    private String doReversalAccountingFlag;

    private String entryDescription;

    private Timestamp entryDate;

    private Timestamp activeDate;

    private Timestamp entryGmt;

    private String currencyCode;

    // Getters and setters
    public String getAccountingDetailGuid() {
        return accountingDetailGuid;
    }

    public void setAccountingDetailGuid(String accountingDetailGuid) {
        this.accountingDetailGuid = accountingDetailGuid;
    }

    public String getActivityGuid() {
        return activityGuid;
    }

    public void setActivityGuid(String activityGuid) {
        this.activityGuid = activityGuid;
    }

    public String getSuspenseGuid() {
        return suspenseGuid;
    }

    public void setSuspenseGuid(String suspenseGuid) {
        this.suspenseGuid = suspenseGuid;
    }

    public String getFundGuid() {
        return fundGuid;
    }

    public void setFundGuid(String fundGuid) {
        this.fundGuid = fundGuid;
    }

    public String getChartOfAccountsEntryGuid() {
        return chartOfAccountsEntryGuid;
    }

    public void setChartOfAccountsEntryGuid(String chartOfAccountsEntryGuid) {
        this.chartOfAccountsEntryGuid = chartOfAccountsEntryGuid;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getDebitCreditCode() {
        return debitCreditCode;
    }

    public void setDebitCreditCode(String debitCreditCode) {
        this.debitCreditCode = debitCreditCode;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getGainLossFlag() {
        return gainLossFlag;
    }

    public void setGainLossFlag(String gainLossFlag) {
        this.gainLossFlag = gainLossFlag;
    }

    public String getDoReversalAccountingFlag() {
        return doReversalAccountingFlag;
    }

    public void setDoReversalAccountingFlag(String doReversalAccountingFlag) {
        this.doReversalAccountingFlag = doReversalAccountingFlag;
    }

    public String getEntryDescription() {
        return entryDescription;
    }

    public void setEntryDescription(String entryDescription) {
        this.entryDescription = entryDescription;
    }

    public Timestamp getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Timestamp entryDate) {
        this.entryDate = entryDate;
    }

    public Timestamp getActiveDate() {
        return activeDate;
    }

    public void setActiveDate(Timestamp activeDate) {
        this.activeDate = activeDate;
    }

    public Timestamp getEntryGmt() {
        return entryGmt;
    }

    public void setEntryGmt(Timestamp entryGmt) {
        this.entryGmt = entryGmt;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}