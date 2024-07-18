package com.archisacademy.career_hive.repository;

import com.archisacademy.career_hive.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

}
