package com.archisacademy.career_hive.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_connections")
public class UserConnection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "user_one",nullable = false)
    private User userOne;

    @Column(name = "user_two",nullable = false)
    private User userTwo;

    @Column(name = "status",nullable = false)
    private  String status;

    @Column(name = "Date")
    private Timestamp Date;

}
