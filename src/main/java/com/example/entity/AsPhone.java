package com.example.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "ASPHONE")
public class AsPhone {
	@Id
  private String PHONENUMBERGUID;
	private String COUNTRYCODE;
	private String PHONETYPECODE;
	private String STATUSCODE;
	private String TYPECODE;
	private String CALLINGCODE;
	private String PHONENUMBER;
	private String EXTENSION;
	private String PREFERRED;
	
	public String getPHONENUMBERGUID() {
		return PHONENUMBERGUID;
	}
	public void setPHONENUMBERGUID(String pHONENUMBERGUID) {
		PHONENUMBERGUID = pHONENUMBERGUID;
	}
	public String getCOUNTRYCODE() {
		return COUNTRYCODE;
	}
	public void setCOUNTRYCODE(String cOUNTRYCODE) {
		COUNTRYCODE = cOUNTRYCODE;
	}
	public String getPHONETYPECODE() {
		return PHONETYPECODE;
	}
	public void setPHONETYPECODE(String pHONETYPECODE) {
		PHONETYPECODE = pHONETYPECODE;
	}
	public String getSTATUSCODE() {
		return STATUSCODE;
	}
	public void setSTATUSCODE(String sTATUSCODE) {
		STATUSCODE = sTATUSCODE;
	}
	public String getTYPECODE() {
		return TYPECODE;
	}
	public void setTYPECODE(String tYPECODE) {
		TYPECODE = tYPECODE;
	}
	public String getCALLINGCODE() {
		return CALLINGCODE;
	}
	public void setCALLINGCODE(String cALLINGCODE) {
		CALLINGCODE = cALLINGCODE;
	}
	public String getPHONENUMBER() {
		return PHONENUMBER;
	}
	public void setPHONENUMBER(String pHONENUMBER) {
		PHONENUMBER = pHONENUMBER;
	}
	public String getEXTENSION() {
		return EXTENSION;
	}
	public void setEXTENSION(String eXTENSION) {
		EXTENSION = eXTENSION;
	}
	public String getPREFERRED() {
		return PREFERRED;
	}
	public void setPREFERRED(String pREFERRED) {
		PREFERRED = pREFERRED;
	}
}
