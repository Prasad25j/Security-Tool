package com.example.entity;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "ASVALUATION", schema = "OIPA_PAS")
public class AsValuation {

    @Id
    private String valuationGuid;

    private String fundGuid;

    private String policyGuid;

    private String activityGuid;

    private Timestamp effectiveDate;

    private Timestamp activeFromDate;

    private Timestamp activeToDate;

    private Timestamp rateLockDate;

    private String moneyTypeCode;

    private String removedFromDepositGuid;

    private String seedDepositGuid;

    private String taxLotGuid;

    private Timestamp taxLotTradeDate;

    private BigDecimal taxLotGainLoss;

    private BigDecimal valuationAmount;

    private BigDecimal valuationUnits;

    private BigDecimal valuationGainLoss;

    private BigDecimal valuationPrincipal;

    private BigDecimal gainLossOnShadow;

    private Integer bucket;

    private BigDecimal fundCurrencyAmount;

    private BigDecimal currencyConversionCost;

    private Timestamp depositDepletedDate;

    private Timestamp priceDate;

    private Timestamp gainLossPriceDate;

    private Timestamp shadowGainLossPriceDate;

    private BigDecimal barespreadAmount;

    private BigDecimal cashValueAmount;

    private String lateralFundGuid;

    private Timestamp originalDepositDate;

    // Getters and setters
    public String getValuationGuid() {
        return valuationGuid;
    }

    public void setValuationGuid(String valuationGuid) {
        this.valuationGuid = valuationGuid;
    }

    public String getFundGuid() {
        return fundGuid;
    }

    public void setFundGuid(String fundGuid) {
        this.fundGuid = fundGuid;
    }

    public String getPolicyGuid() {
        return policyGuid;
    }

    public void setPolicyGuid(String policyGuid) {
        this.policyGuid = policyGuid;
    }

    public String getActivityGuid() {
        return activityGuid;
    }

    public void setActivityGuid(String activityGuid) {
        this.activityGuid = activityGuid;
    }

    public Timestamp getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Timestamp effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Timestamp getActiveFromDate() {
        return activeFromDate;
    }

    public void setActiveFromDate(Timestamp activeFromDate) {
        this.activeFromDate = activeFromDate;
    }

    public Timestamp getActiveToDate() {
        return activeToDate;
    }

    public void setActiveToDate(Timestamp activeToDate) {
        this.activeToDate = activeToDate;
    }

    public Timestamp getRateLockDate() {
        return rateLockDate;
    }

    public void setRateLockDate(Timestamp rateLockDate) {
        this.rateLockDate = rateLockDate;
    }

    public String getMoneyTypeCode() {
        return moneyTypeCode;
    }

    public void setMoneyTypeCode(String moneyTypeCode) {
        this.moneyTypeCode = moneyTypeCode;
    }

    public String getRemovedFromDepositGuid() {
        return removedFromDepositGuid;
    }

    public void setRemovedFromDepositGuid(String removedFromDepositGuid) {
        this.removedFromDepositGuid = removedFromDepositGuid;
    }

    public String getSeedDepositGuid() {
        return seedDepositGuid;
    }

    public void setSeedDepositGuid(String seedDepositGuid) {
        this.seedDepositGuid = seedDepositGuid;
    }

    public String getTaxLotGuid() {
        return taxLotGuid;
    }

    public void setTaxLotGuid(String taxLotGuid) {
        this.taxLotGuid = taxLotGuid;
    }

    public Timestamp getTaxLotTradeDate() {
        return taxLotTradeDate;
    }

    public void setTaxLotTradeDate(Timestamp taxLotTradeDate) {
        this.taxLotTradeDate = taxLotTradeDate;
    }

    public BigDecimal getTaxLotGainLoss() {
        return taxLotGainLoss;
    }

    public void setTaxLotGainLoss(BigDecimal taxLotGainLoss) {
        this.taxLotGainLoss = taxLotGainLoss;
    }

    public BigDecimal getValuationAmount() {
        return valuationAmount;
    }

    public void setValuationAmount(BigDecimal valuationAmount) {
        this.valuationAmount = valuationAmount;
    }

    public BigDecimal getValuationUnits() {
        return valuationUnits;
    }

    public void setValuationUnits(BigDecimal valuationUnits) {
        this.valuationUnits = valuationUnits;
    }

    public BigDecimal getValuationGainLoss() {
        return valuationGainLoss;
    }

    public void setValuationGainLoss(BigDecimal valuationGainLoss) {
        this.valuationGainLoss = valuationGainLoss;
    }

    public BigDecimal getValuationPrincipal() {
        return valuationPrincipal;
    }

    public void setValuationPrincipal(BigDecimal valuationPrincipal) {
        this.valuationPrincipal = valuationPrincipal;
    }

    public BigDecimal getGainLossOnShadow() {
        return gainLossOnShadow;
    }

    public void setGainLossOnShadow(BigDecimal gainLossOnShadow) {
        this.gainLossOnShadow = gainLossOnShadow;
    }

    public Integer getBucket() {
        return bucket;
    }

    public void setBucket(Integer bucket) {
        this.bucket = bucket;
    }

    public BigDecimal getFundCurrencyAmount() {
        return fundCurrencyAmount;
    }

    public void setFundCurrencyAmount(BigDecimal fundCurrencyAmount) {
        this.fundCurrencyAmount = fundCurrencyAmount;
    }

    public BigDecimal getCurrencyConversionCost() {
        return currencyConversionCost;
    }

    public void setCurrencyConversionCost(BigDecimal currencyConversionCost) {
        this.currencyConversionCost = currencyConversionCost;
    }

    public Timestamp getDepositDepletedDate() {
        return depositDepletedDate;
    }

    public void setDepositDepletedDate(Timestamp depositDepletedDate) {
        this.depositDepletedDate = depositDepletedDate;
    }

    public Timestamp getPriceDate() {
        return priceDate;
    }

    public void setPriceDate(Timestamp priceDate) {
        this.priceDate = priceDate;
    }

    public Timestamp getGainLossPriceDate() {
        return gainLossPriceDate;
    }

    public void setGainLossPriceDate(Timestamp gainLossPriceDate) {
        this.gainLossPriceDate = gainLossPriceDate;
    }

    public Timestamp getShadowGainLossPriceDate() {
        return shadowGainLossPriceDate;
    }

    public void setShadowGainLossPriceDate(Timestamp shadowGainLossPriceDate) {
        this.shadowGainLossPriceDate = shadowGainLossPriceDate;
    }

    public BigDecimal getBarespreadAmount() {
        return barespreadAmount;
    }

    public void setBarespreadAmount(BigDecimal barespreadAmount) {
        this.barespreadAmount = barespreadAmount;
    }

    public BigDecimal getCashValueAmount() {
        return cashValueAmount;
    }

    public void setCashValueAmount(BigDecimal cashValueAmount) {
        this.cashValueAmount = cashValueAmount;
    }

    public String getLateralFundGuid() {
        return lateralFundGuid;
    }

    public void setLateralFundGuid(String lateralFundGuid) {
        this.lateralFundGuid = lateralFundGuid;
    }

    public Timestamp getOriginalDepositDate() {
        return originalDepositDate;
    }

    public void setOriginalDepositDate(Timestamp originalDepositDate) {
        this.originalDepositDate = originalDepositDate;
    }
}