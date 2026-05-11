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
@Table(name = "ASAUTHPLANPAGE")
public class AsAuthPlanPage {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "AUTHPLANPAGEGUID")
    private String authPlanPageGuid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AUTHPLANGUID")
    private AsAuthPlan authPlan;

    @Column(name = "AUTHPAGEGUID")
    private String authPageGuid;

    @OneToMany(mappedBy = "authPlanPage", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AsAuthPlanPageButton> pageButtons = new ArrayList<>();
}
