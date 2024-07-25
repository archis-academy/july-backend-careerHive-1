package com.archisacademy.career_hive.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "job_postings")
public class JobPostings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "company_name", nullable = false)
    private String companyName;

    @Column(name = "company_description", nullable = false)
    private String companyDescription;

    @Column(name = "job_name", nullable = false)
    private String jobName;

    @Column(name = "job_description", nullable = false)
    private String jobDescription;

    @OneToMany(mappedBy = "jobPostings", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<JobSkill> jobSkills;
}
