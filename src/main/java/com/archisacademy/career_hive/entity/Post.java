package com.archisacademy.career_hive.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;
import java.util.List;

@Entity //Tablo old. belirtmek için
@Data // getter-setter getirmesi için
@AllArgsConstructor //dolu constructor
@NoArgsConstructor // boş constructor
@Table(name = "posts" )
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //1234 diye artması için bunu ekledik
    @Column(name = "id") //sütun ismi
    private Long id; //primary key

    @Column(name = "content")
    private String content;

    @Column(name = "created_at") //küçük harflerle ve ikinci kelime gelirse _ koy
    private Timestamp createdAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    @OneToMany(mappedBy = "post")
    private List<UserPostCommentMapper> userPostCommentMappers;

    @OneToMany(mappedBy = "post")
    private List<Like> likes;

    @OneToMany(mappedBy = "post")
    private List<Comment> comments;

}
