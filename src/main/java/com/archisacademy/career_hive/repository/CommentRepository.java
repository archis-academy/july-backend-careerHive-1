package com.archisacademy.career_hive.repository;

import com.archisacademy.career_hive.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
