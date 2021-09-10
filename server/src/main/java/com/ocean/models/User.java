package com.ocean.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
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

    @Column(name = "aboutMe")
    private String aboutMe;

    @Column(name = "bday")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy") //Jacson to format our birthday
    private Date bday;

    @Column(name = "proPicUrl")
    private String proPicUrl;

    //constructor for login
    public User(String username, String password) {
        this.username = username;
        this.password = password;
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
       /* this.postList = postList;
        this.commentList = commentList;*/
    }

    //Modified Constructor
    public User(String username, String password, String email, String firstName, String lastName, Date bday) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bday = bday;
    }
}
