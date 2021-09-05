package com.revature.model;

/*	Post Model
            Integer Id: serial
            String picUrl not null
            String PostText char(250) not null
            Integer UserFK reference User id
            Youtube link??????*/

public class Post {
    private Integer id;
    private String postPicUrl;
    private String postText;
    private Integer postAuthFk;
    private String postUrl;
}
