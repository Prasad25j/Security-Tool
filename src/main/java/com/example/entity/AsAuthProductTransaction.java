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
@Table(name = "ASAUTHPRODUCTTRANSACTION")
public class AsAuthProductTransaction {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "AUTHPRODUCTTRANSACTIONGUID")
    private String authProductTransactionGuid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AUTHPRODUCTGUID")
    private AsAuthProduct authProduct;

    @Column(name = "TRANSACTIONGUID")
    private String transactionGuid;

    @OneToMany(mappedBy = "authProductTransaction", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AsAuthProductTransactionButton> transactionButtons = new ArrayList<>();
}
