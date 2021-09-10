package com.ocean.models;

import lombok.*;
import javax.persistence.*;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="posts")
public class Post {

    @Id
    @Column(name="postId")
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer postId;

    @Column(name="postPicUrl")
    private String postPicUrl;

    @Column(name="postText", nullable=false)
    private String postText;

    @Column(name="postYouUrl") //youtube url link
    private String postYouUrl;

    @ManyToOne
    @JoinColumn(name="userId", nullable = false)
    private User user;


    //Modified Constructor
    public Post(Integer postId, String postPicUrl, String postText, User user) {
        this.postId = postId;
        this.postPicUrl = postPicUrl;
        this.postText = postText;
        this.user = user;
    }

    //Modified Constructor
    public Post(String postPicUrl, String postText) {
        this.postPicUrl = postPicUrl;
        this.postText = postText;
    }

}