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
@Table(name = "ASAUTHPLAN")
public class AsAuthPlan {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "AUTHPLANGUID")
    private String authPlanGuid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AUTHCOMPANYGUID")
    private AsAuthCompany authCompany;

    @Column(name = "PLANGUID")
    private String planGuid;

    @OneToMany(mappedBy = "authPlan", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AsAuthPlanPage> planPages = new ArrayList<>();

    @OneToMany(mappedBy = "authPlan", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AsAuthTransaction> planTransactions = new ArrayList<>();
}
