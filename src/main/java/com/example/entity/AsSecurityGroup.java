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
@Table(name = "ASSECURITYGROUP")
public class AsSecurityGroup {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "SECURITYGROUPGUID")
    private String securityGroupGuid;

    @Column(name = "GROUPNAME")
    private String groupName;

    @OneToMany(mappedBy = "securityGroup", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AsAuthCompany> authCompanies = new ArrayList<>();
}
