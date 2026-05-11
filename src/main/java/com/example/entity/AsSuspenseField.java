package com.example.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "ASSUSPENSEFIELD")
public class AsSuspenseField {

    @EmbeddedId
    private AsSuspenseFieldId id;

    private String fieldTypeCode;

    private Timestamp dateValue;

    private String textValue;

    private Integer intValue;

    private BigDecimal floatValue;

    private String currencyCode;

    private Integer optionTextFlag;

    private String optionText;

    @Lob
    private String bigTextValue;

    // Getters and setters
    public AsSuspenseFieldId getId() {
        return id;
    }

    public void setId(AsSuspenseFieldId id) {
        this.id = id;
    }

    public String getFieldTypeCode() {
        return fieldTypeCode;
    }

    public void setFieldTypeCode(String fieldTypeCode) {
        this.fieldTypeCode = fieldTypeCode;
    }

    public Timestamp getDateValue() {
        return dateValue;
    }

    public void setDateValue(Timestamp dateValue) {
        this.dateValue = dateValue;
    }

    public String getTextValue() {
        return textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

    public Integer getIntValue() {
        return intValue;
    }

    public void setIntValue(Integer intValue) {
        this.intValue = intValue;
    }

    public BigDecimal getFloatValue() {
        return floatValue;
    }

    public void setFloatValue(BigDecimal floatValue) {
        this.floatValue = floatValue;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Integer getOptionTextFlag() {
        return optionTextFlag;
    }

    public void setOptionTextFlag(Integer optionTextFlag) {
        this.optionTextFlag = optionTextFlag;
    }

    public String getOptionText() {
        return optionText;
    }

    public void setOptionText(String optionText) {
        this.optionText = optionText;
    }

    public String getBigTextValue() {
        return bigTextValue;
    }

    public void setBigTextValue(String bigTextValue) {
        this.bigTextValue = bigTextValue;
    }
}
