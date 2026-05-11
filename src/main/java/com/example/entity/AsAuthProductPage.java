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
@Table(name = "ASAUTHPRODUCTPAGE")
public class AsAuthProductPage {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "AUTHPRODUCTPAGEGUID")
    private String authProductPageGuid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AUTHPRODUCTGUID")
    private AsAuthProduct authProduct;

    @Column(name = "AUTHPAGEGUID")
    private String authPageGuid;

    @OneToMany(mappedBy = "authProductPage", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AsAuthProductPageButton> pageButtons = new ArrayList<>();
}
