package com.example.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "ASCLIENTPHONE")
public class AsClientPhone {
  @Id
  private String PHONENUMBERGUID;
  private String CLIENTGUID;
  
public String getPHONENUMBERGUID() {
	return PHONENUMBERGUID;
}
public void setPHONENUMBERGUID(String pHONENUMBERGUID) {
	PHONENUMBERGUID = pHONENUMBERGUID;
}
public String getCLIENTGUID() {
	return CLIENTGUID;
}
public void setCLIENTGUID(String cLIENTGUID) {
	CLIENTGUID = cLIENTGUID;
}
}
