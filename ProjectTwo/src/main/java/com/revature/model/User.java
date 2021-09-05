package com.revature.model;



/*	User Model
            Integer Id: serial
            String name not null
            String username Unique not null
            String password not null
            String email Unique not null
            String aboutme char(250) not null
            Date Birthday int
            String picUrl not null*/

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="users")
public class User {
    @Id
    @Column(name="user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
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
    @Column(name="lastname")
    private String proPicUrl;


    //no arg constructor
    public User() {
    }

    //constructor for login
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //constructor for getting all the users info
    public User(Integer id, String username, String password, String email, String firstName, String lastName, Date bday, String proPicUrl) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bday = bday;
        this.proPicUrl = proPicUrl;
    }

    //getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    //toString

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bday=" + bday +
                ", proPicUrl='" + proPicUrl + '\'' +
                '}';
    }
}
