package com.archisacademy.career_hive.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Experience")
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "experience_title", nullable = false)
    private String experienceTitle;

    @Column(name = "employment_type", nullable = false)
    private String employmentType;

    @Column(name = "company_name", nullable = false)
    private String companyName;

    @Column(name = "location", nullable = false)
    private String location;

    @Column(name = "location_type", nullable = false)
    private String locationType;

    @Column(name = "still_working", nullabele = false)
    private boolean stillWorking;

    @Column(name = "description", nullable = false)
    private String description;

}