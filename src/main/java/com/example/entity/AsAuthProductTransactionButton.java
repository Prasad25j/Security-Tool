package com.example.entity;

import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ASAUTHPRODUCTTRANSACTIONBUTTON")
public class AsAuthProductTransactionButton {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "AUTHPRODUCTTRANSACTIONBUTTONGUID")
    private String authProductTransactionButtonGuid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AUTHPRODUCTTRANSACTIONGUID")
    private AsAuthProductTransaction authProductTransaction;

    @Column(name = "AUTHBUTTONGUID")
    private String authButtonGuid;
}
