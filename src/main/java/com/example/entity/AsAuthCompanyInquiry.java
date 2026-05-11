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
@Table(name = "ASAUTHCOMPANYINQUIRY")
public class AsAuthCompanyInquiry {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "AUTHCOMPANYINQUIRYGUID")
    private String authCompanyInquiryGuid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AUTHCOMPANYGUID")
    private AsAuthCompany authCompany;

    @Column(name = "INQUIRYSCREENNAMEGUID")
    private String inquiryScreenNameGuid;
}
