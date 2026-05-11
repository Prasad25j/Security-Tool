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
@Table(name = "ASAUTHTRANSACTION")
public class AsAuthTransaction {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "AUTHTRANSACTIONGUID")
    private String authTransactionGuid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AUTHPLANGUID")
    private AsAuthPlan authPlan;

    @Column(name = "TRANSACTIONGUID")
    private String transactionGuid;

    @OneToMany(mappedBy = "authTransaction", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AsAuthTransactionButton> transactionButtons = new ArrayList<>();
}
