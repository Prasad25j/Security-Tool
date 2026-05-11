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
@Table(name = "ASAUTHPRODUCT")
public class AsAuthProduct {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "AUTHPRODUCTGUID")
    private String authProductGuid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AUTHCOMPANYGUID")
    private AsAuthCompany authCompany;

    @Column(name = "PRODUCTGUID")
    private String productGuid;

    @OneToMany(mappedBy = "authProduct", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AsAuthProductPage> productPages = new ArrayList<>();

    @OneToMany(mappedBy = "authProduct", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AsAuthProductTransaction> productTransactions = new ArrayList<>();
}
