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
@Table(name = "ASAUTHTRANSACTIONBUTTON")
public class AsAuthTransactionButton {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "AUTHTRANSACTIONBUTTONGUID")
    private String authTransactionButtonGuid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AUTHTRANSACTIONGUID")
    private AsAuthTransaction authTransaction;

    @Column(name = "AUTHBUTTONGUID")
    private String authButtonGuid;
}
