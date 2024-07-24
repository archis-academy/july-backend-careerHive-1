package com.archisacademy.career_hive.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_post_comment_mappers")
public class UserPostCommentMapper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "user_id")
    private User user;

    @Column(name = "post_id")
    private Post post;

    @OneToOne
    @Column(name = "like")
    private Like like;

    @OneToMany(mappedBy = "userPostCommentMapper")
    private List<Comment> commentList;
}
