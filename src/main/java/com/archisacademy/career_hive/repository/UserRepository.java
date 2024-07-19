package com.archisacademy.career_hive.repository;

import com.archisacademy.career_hive.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
