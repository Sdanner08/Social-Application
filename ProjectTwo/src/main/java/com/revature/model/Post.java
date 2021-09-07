package com.revature.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="post")
public class Post {
    @Id
    @Column(name="post_id")
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer id;
    @Column(name="postPicUrl")
    private String postPicUrl;
    @Column(name="postText", nullable=false)
    private String postText;
    @Column(name="postYouUrl") //youtube url link
    private String postYouUrl;
    @ManyToOne(cascade = CascadeType.ALL)
    private User user;
    @OneToMany(mappedBy= "post", cascade = CascadeType.ALL)
    private List<Comment> comment = new ArrayList<>();


    //no arg constructor
    public Post() {
    }
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

    //Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPostPicUrl() {
        return postPicUrl;
    }

    public void setPostPicUrl(String postPicUrl) {
        this.postPicUrl = postPicUrl;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public String getPostYouUrl() {
        return postYouUrl;
    }

    public void setPostYouUrl(String postYouUrl) {
        this.postYouUrl = postYouUrl;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Comment> getComment() {
        return comment;
    }

    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }

    //ToString
    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", postPicUrl='" + postPicUrl + '\'' +
                ", postText='" + postText + '\'' +
                ", postYouUrl='" + postYouUrl + '\'' +
                ", user=" + user +
                ", comment=" + comment +
                '}';
    }
}
