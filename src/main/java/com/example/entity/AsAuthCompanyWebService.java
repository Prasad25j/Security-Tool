package com.example.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ASAUTHCOMPANYWEBSERVICE")
@IdClass(AsAuthCompanyWebServiceId.class)
public class AsAuthCompanyWebService {

    @Id
    @Column(name = "AUTHCOMPANYGUID")
    private String authCompanyGuid;

    @Id
    @Column(name = "AUTHWEBSERVICEGUID")
    private String authWebServiceGuid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AUTHCOMPANYGUID", insertable = false, updatable = false)
    private AsAuthCompany authCompany;
}
