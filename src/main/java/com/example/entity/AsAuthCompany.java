package com.example.entity;

import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ASAUTHCOMPANY")
public class AsAuthCompany {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "AUTHCOMPANYGUID")
    private String authCompanyGuid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SECURITYGROUPGUID")
    private AsSecurityGroup securityGroup;

    @Column(name = "COMPANYGUID")
    private String companyGuid;

    @OneToMany(mappedBy = "authCompany", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AsAuthCompanyPage> companyPages = new ArrayList<>();

    @OneToMany(mappedBy = "authCompany", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AsAuthCompanyInquiry> companyInquiries = new ArrayList<>();

    @OneToMany(mappedBy = "authCompany", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AsAuthCompanyWebService> companyWebServices = new ArrayList<>();

    @OneToMany(mappedBy = "authCompany", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AsAuthProduct> authProducts = new ArrayList<>();

    @OneToMany(mappedBy = "authCompany", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AsAuthPlan> authPlans = new ArrayList<>();
}
