package com.example.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ASADDRESSPHONE")
public class AsAddressPhone {
 @Id
 private String PHONENUMBERGUID;
 private String ADDRESSGUID;
 
public String getPHONENUMBERGUID() {
	return PHONENUMBERGUID;
}
public void setPHONENUMBERGUID(String pHONENUMBERGUID) {
	PHONENUMBERGUID = pHONENUMBERGUID;
}
public String getADDRESSGUID() {
	return ADDRESSGUID;
}
public void setADDRESSGUID(String aDDRESSGUID) {
	ADDRESSGUID = aDDRESSGUID;
}
}
