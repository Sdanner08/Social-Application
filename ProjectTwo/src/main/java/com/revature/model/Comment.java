package com.revature.model;


/*	Comment Model
            Integer Id: serial
            String CommText char(250) not null
            Integer PostIdFK:
            Integer UserIdFK:*/
//https://vladmihalcea.com/the-best-way-to-use-the-manytomany-annotation-with-jpa-and-hibernate/
public class Comment {

    private Integer id;
    private String commText;
    private Integer postFk;
    private Integer commAuthFk; //Comment Author FK so we don't confuse with Post Author FK
}
