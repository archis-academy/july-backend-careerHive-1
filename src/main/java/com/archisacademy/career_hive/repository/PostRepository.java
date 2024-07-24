package com.archisacademy.career_hive.repository;

import com.archisacademy.career_hive.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
