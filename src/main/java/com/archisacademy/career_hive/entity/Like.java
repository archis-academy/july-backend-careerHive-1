package com.archisacademy.career_hive.entity;

import jakarta.persistence.*;

@Entity
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

}
