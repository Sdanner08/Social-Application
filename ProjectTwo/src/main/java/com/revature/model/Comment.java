package com.revature.model;


import javax.persistence.*;

@Entity
@Table(name="comment")
public class Comment {
    @Id
    @Column(name="comment_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="commText")
    private String commText;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "post_id")
    private Post post;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    //no arg constructor
    public Comment() {
    }
    //Modified Constructor
    public Comment(String commText) {
        this.commText = commText;
    }

    //All arg constructor
    public Comment(Integer id, String commText, Post post, User user) {
        this.id = id;
        this.commText = commText;
        this.post = post;
        this.user = user;
    }

    //Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommText() {
        return commText;
    }

    public void setCommText(String commText) {
        this.commText = commText;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    //toString
    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", commText='" + commText + '\'' +
                ", post=" + post +
                ", user=" + user +
                '}';
    }
}
