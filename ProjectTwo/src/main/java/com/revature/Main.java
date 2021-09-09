package com.revature;

import com.revature.model.Comment;
import com.revature.model.Post;
import com.revature.model.User;
import com.revature.service.CommentService;
import com.revature.service.PostService;
import com.revature.service.S3Service;
import com.revature.service.UserService;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static UserService userService = new UserService();
    public static PostService postService = new PostService();
    public static CommentService commentService = new CommentService();
    public static S3Service s3Service = new S3Service();

    public static void main(String[] args) {
        insertInitialValues();
    }

    public static void insertInitialValues(){



        //Post
        Post p1 = new Post("https://storage.googleapis.com/gd-wagtail-prod-assets/original_images/evolving_google_identity_2x1.jpg","Text Example 1");
        Post p2 = new Post("https://storage.googleapis.com/gd-wagtail-prod-assets/original_images/evolving_google_identity_2x1.jpg","Text Example 2");
        Post p3 = new Post("https://storage.googleapis.com/gd-wagtail-prod-assets/original_images/evolving_google_identity_2x1.jpg","Text Example 3");
        Post p4 = new Post("https://storage.googleapis.com/gd-wagtail-prod-assets/original_images/evolving_google_identity_2x1.jpg","Text Example 4");


        //Comments
        Comment c1 = new Comment("Comment 1");
        Comment c2 = new Comment("Comment 2");
        Comment c3 = new Comment("Comment 3");
        Comment c4 = new Comment("Comment 4");

        //User
        List<Post> postList = new ArrayList<>();
        postList.add(p1);

        List<Comment> commentList = new ArrayList<>();
        commentList.add(c1);
        commentList.add(c4);
        User user1 = new User("Sdanner","password","shane@email.com","Shane","Danner",new Date(11/27/1995),"https://vladmihalcea.com/wp-content/uploads/2017/05/many-to-many-post-tag.png",postList,commentList);
        p1.setComment(commentList);
        p1.setUser(user1);
        c1.setPost(p1);
        c1.setUser(user1);


/*        List<Post> postList = new ArrayList<>();
        postList.add(p1);
        postList.add(p4);
        List<Comment> commentList = new ArrayList<>();
        commentList.add(c1);
        commentList.add(c4);
        User user1 = new User("Sdanner","password","shane@email.com","Shane","Danner",new Date(11/27/1995),"https://vladmihalcea.com/wp-content/uploads/2017/05/many-to-many-post-tag.png",postList,commentList);
        p1.getUser().add(user1);*/

/*
       List<Post> postList1 = new ArrayList<>();
        postList1.add(p2);
        postList1.add(p3);
        List<Comment> commentList1 = new ArrayList<>();
        commentList1.add(c2);
        commentList1.add(c3);
        User user2 = new User("SamTest","password","sam@email.com","Sam","Test",new Date(01/24/2021),"https://vladmihalcea.com/wp-content/uploads/2017/05/many-to-many-post-tag.png",postList1,commentList1);
*/



        postService.createPost(p1);
        postService.createPost(p2);
        postService.createPost(p3);
        postService.createPost(p4);

        commentService.addComment(c1);
        commentService.addComment(c2);
        commentService.addComment(c3);
        commentService.addComment(c4);


        userService.createUser(user1);
        /*userService.createUser(user2);*/

        /*Testing S3Service*/
        //David: I have not run this test yet, because UserController is broken in my copy of the program.
        //David: I will test it as soon as I get the thing updated.
        //David: Danke!

        //Upload Cup.png to the bucket as both an image and a profile image
        File testImage = new File("Cup.png");
        String imagePath = s3Service.uploadImage("SomeGuy", testImage); //Can also just pass a User object if you prefer
        String profileImagePath = s3Service.uploadProfileImage("SomeGuy", testImage);
    }

}
