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
@Table(name = "ASAUTHPLANPAGEBUTTON")
public class AsAuthPlanPageButton {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "AUTHPLANPAGEBUTTONGUID")
    private String authPlanPageButtonGuid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AUTHPLANPAGEGUID")
    private AsAuthPlanPage authPlanPage;

    @Column(name = "AUTHBUTTONGUID")
    private String authButtonGuid;
}
