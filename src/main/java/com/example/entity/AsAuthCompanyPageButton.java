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
@Table(name = "ASAUTHCOMPANYPAGEBUTTON")
public class AsAuthCompanyPageButton {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "AUTHCOMPANYPAGEBUTTONGUID")
    private String authCompanyPageButtonGuid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AUTHCOMPANYPAGEGUID")
    private AsAuthCompanyPage authCompanyPage;

    @Column(name = "AUTHBUTTONGUID")
    private String authButtonGuid;
}
