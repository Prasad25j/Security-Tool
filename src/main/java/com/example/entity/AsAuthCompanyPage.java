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
@Table(name = "ASAUTHCOMPANYPAGE")
public class AsAuthCompanyPage {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "AUTHCOMPANYPAGEGUID")
    private String authCompanyPageGuid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AUTHCOMPANYGUID")
    private AsAuthCompany authCompany;

    @Column(name = "AUTHPAGEGUID")
    private String authPageGuid;

    @OneToMany(mappedBy = "authCompanyPage", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AsAuthCompanyPageButton> pageButtons = new ArrayList<>();
}
