package com.revature.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="user")
public class User {
    @Id
    @Column(name = "userId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "firstname", nullable = false)
    private String firstName;

    @Column(name = "lastname", nullable = false)
    private String lastName;

    @Column(name = "aboutMe", nullable = false)
    private String aboutMe;

    @Column(name = "bday", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy") //Jacson to format our birthday
    private Date bday;

    //////////////////Nullable left empty until we get it working.////////////////////
    @Column(name = "proPicUrl")
    private String proPicUrl;

/*    @OneToMany (cascade = CascadeType.ALL)
    private List<Post> postList = new ArrayList<>();

    @OneToMany (cascade = CascadeType.ALL)
    private List<Comment> commentList = new ArrayList<>();*/



    //constructor for login
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

/*    //Modified Constructor
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
    }*/

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



}