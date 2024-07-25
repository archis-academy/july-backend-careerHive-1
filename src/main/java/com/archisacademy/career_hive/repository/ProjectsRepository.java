package com.archisacademy.career_hive.repository;

import com.archisacademy.career_hive.entity.Projects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectsRepository extends JpaRepository<Projects, Long> {
}
