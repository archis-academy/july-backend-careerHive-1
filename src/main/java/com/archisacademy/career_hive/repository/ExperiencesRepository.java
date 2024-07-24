package com.archisacademy.career_hive.repository;

import com.archisacademy.career_hive.entity.Experiences;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperiencesRepository extends JpaRepository<Experiences, Long> {
}