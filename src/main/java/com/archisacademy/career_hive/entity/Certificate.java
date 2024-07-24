package com.archisacademy.career_hive.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.print.attribute.standard.Media;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "certificates")
public class Certificate {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title_name",nullable = false)
    private String titleName;

    @Column(name = "provided_name",nullable = false)
    private String providedName;

    @Column(name = "description")
    private String description;

    @Column(name = "role",nullable = false,length = 40)
    private String role;

    @Column(name = "date")
    private Timestamp date;

    @Column(name = "skill",nullable = false)
    private String skill;

}
