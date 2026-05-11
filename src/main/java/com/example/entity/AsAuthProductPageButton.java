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
@Table(name = "ASAUTHPRODUCTPAGEBUTTON")
public class AsAuthProductPageButton {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "AUTHPRODUCTPAGEBUTTONGUID")
    private String authProductPageButtonGuid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AUTHPRODUCTPAGEGUID")
    private AsAuthProductPage authProductPage;

    @Column(name = "AUTHBUTTONGUID")
    private String authButtonGuid;
}
