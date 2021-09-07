package com.revature.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="users")
public class User {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    @Column(name="username",unique = true,nullable = false)
    private String username;
    @Column(name="password",nullable = false)
    private String password;
    @Column(name="email",unique = true,nullable = false)
    private String email;
    @Column(name="firstname",nullable = false)
    private String firstName;
    @Column(name="lastname",nullable = false)
    private String lastName;
    @Column(name="bday",nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy") //Jacson to format our birthday
    private Date bday;
    //////////////////Nullable left empty until we get it working.////////////////////
    @Column(name="proPicUrl")
    private String proPicUrl;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Post> postList = new ArrayList<>();

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comment> commentList = new ArrayList<>();

    //no arg constructor
    public User() {
    }

    //constructor for login
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //Modified Constructor
    public User(String username, String password, String email, String firstName, String lastName, Date bday, String proPicUrl, List<Post> postList, List<Comment> commentList) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bday = bday;
        this.proPicUrl = proPicUrl;
        this.postList = postList;
        this.commentList = commentList;
    }

    public User(String username, String password, String email, String firstName, String lastName, Date bday) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bday = bday;
    }
    //Modified Constructor
    public User(String username, String password, String email, String firstName, String lastName, Date bday, String proPicUrl) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bday = bday;
        this.proPicUrl = proPicUrl;
    }

    //constructor for getting all the users info
    public User(Integer userId, String username, String password, String email, String firstName, String lastName, Date bday, String proPicUrl, List<Post> postList) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bday = bday;
        this.proPicUrl = proPicUrl;
        this.postList = postList;
    }
    //Modified Constructor

    //getters and setters
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBday() {
        return bday;
    }

    public void setBday(Date bday) {
        this.bday = bday;
    }

    public String getProPicUrl() {
        return proPicUrl;
    }

    public void setProPicUrl(String proPicUrl) {
        this.proPicUrl = proPicUrl;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }

    //toString


    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bday=" + bday +
                ", proPicUrl='" + proPicUrl + '\'' +
                ", postList=" + postList +
                '}';
    }
}
