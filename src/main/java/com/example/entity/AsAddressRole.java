package com.example.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "ASADDRESSROLE")
public class AsAddressRole {
	@Id
	private String ADDRESSROLEGUID;
	private String ADDRESSROLECODE;
	private String CLIENTGUID;
	private String ADDRESSGUID;
	private String DEFAULTFLAG;
	private String EMAILCORRESPONDENCEFLAG;
	
	public String getADDRESSROLEGUID() {
		return ADDRESSROLEGUID;
	}
	public void setADDRESSROLEGUID(String aDDRESSROLEGUID) {
		ADDRESSROLEGUID = aDDRESSROLEGUID;
	}
	public String getADDRESSROLECODE() {
		return ADDRESSROLECODE;
	}
	public void setADDRESSROLECODE(String aDDRESSROLECODE) {
		ADDRESSROLECODE = aDDRESSROLECODE;
	}
	public String getCLIENTGUID() {
		return CLIENTGUID;
	}
	public void setCLIENTGUID(String cLIENTGUID) {
		CLIENTGUID = cLIENTGUID;
	}
	public String getADDRESSGUID() {
		return ADDRESSGUID;
	}
	public void setADDRESSGUID(String aDDRESSGUID) {
		ADDRESSGUID = aDDRESSGUID;
	}
	public String getDEFAULTFLAG() {
		return DEFAULTFLAG;
	}
	public void setDEFAULTFLAG(String dEFAULTFLAG) {
		DEFAULTFLAG = dEFAULTFLAG;
	}
	public String getEMAILCORRESPONDENCEFLAG() {
		return EMAILCORRESPONDENCEFLAG;
	}
	public void setEMAILCORRESPONDENCEFLAG(String eMAILCORRESPONDENCEFLAG) {
		EMAILCORRESPONDENCEFLAG = eMAILCORRESPONDENCEFLAG;
	}
}
