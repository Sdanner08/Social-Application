package com.revature.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="post")
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
    @MapsId("userId")
    private User user;

//    @OneToMany(cascade = CascadeType.ALL)
//    private List<Comment> commentList = new ArrayList<>();

/*    @OneToMany(cascade = CascadeType.ALL)
    private List<Like> LikeList = new ArrayList<>();*/





   //Modified Constructor
    public Post(Integer id, String postPicUrl, String postText, User user) {
        this.id = id;
        this.postPicUrl = postPicUrl;
        this.postText = postText;
        this.user = user;
    }
    //Modified Constructor
    public Post(Integer id, String postPicUrl, String postText, User user, List<Comment> comment) {
        this.id = id;
        this.postPicUrl = postPicUrl;
        this.postText = postText;
        this.user = user;
        this.comment = comment;
    }
    //Modified Constructor
    public Post(String postPicUrl, String postText, List<Comment> comment) {
        this.postPicUrl = postPicUrl;
        this.postText = postText;
        this.comment = comment;
    }
    //Modified Constructor
    public Post(String postPicUrl, String postText) {
        this.postPicUrl = postPicUrl;
        this.postText = postText;
    }

    //All arg constructor
    public Post(Integer id, String postPicUrl, String postText, String postYouUrl, User user, List<Comment> comment) {
        this.id = id;
        this.postPicUrl = postPicUrl;
        this.postText = postText;
        this.postYouUrl = postYouUrl;
        this.user = user;
        this.comment = comment;
    }
}
