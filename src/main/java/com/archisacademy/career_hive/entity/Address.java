package com.archisacademy.career_hive.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "country")
    private String country;

    @Column(name = "province")
    private String province;

    @OneToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;
}
