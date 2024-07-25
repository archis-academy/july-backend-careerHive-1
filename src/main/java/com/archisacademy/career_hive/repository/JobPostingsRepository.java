package com.archisacademy.career_hive.repository;

import com.archisacademy.career_hive.entity.JobPostings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPostingsRepository extends JpaRepository<Long, JobPostings> {
}
