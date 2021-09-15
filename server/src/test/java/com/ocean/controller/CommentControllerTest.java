/*
package com.ocean.controller;

import com.ocean.models.Comment;
import com.ocean.models.Response;
import com.ocean.services.CommentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class CommentControllerTest {
    CommentController commentController;

    @Mock
    CommentService commentService;

    @BeforeEach
    void setUp() {
        this.commentController = new CommentController(commentService);
    }

    @Test
    void createComment() {
        //assign
        Comment comment = new Comment();
        Response expectedResult = new Response(true, "logged In and session created", tempUser);

        //Mock
        Mockito.when(commentService);
        //act

        Response actualResult = this.commentController
        //assert
        assertEquals(expectedResult.toString(), actualResult.toString());
    }

    @Test
    void lookForCommentById() {
        //assign
        Comment comment = new Comment();
        Response expectedResult = new Response(true, "logged In and session created", tempUser);

        //Mock
        Mockito.when(commentService);
        //act

        Response actualResult = this.commentController
        //assert
        assertEquals(expectedResult.toString(), actualResult.toString());
    }

    @Test
    void lookForCommentByPostId() {
        //assign
        Comment comment = new Comment();
        Response expectedResult = new Response(true, "logged In and session created", tempUser);

        //Mock
        Mockito.when(commentService);
        //act

        Response actualResult = this.commentController
        //assert
        assertEquals(expectedResult.toString(), actualResult.toString());
    }

    @Test
    void lookForCommentByUserId() {
        //assign
        Comment comment = new Comment();
        Response expectedResult = new Response(true, "logged In and session created", tempUser);

        //Mock
        Mockito.when(commentService);
        //act

        Response actualResult = this.commentController
        //assert
        assertEquals(expectedResult.toString(), actualResult.toString());
    }

    @Test
    void updateComment() {
        //assign
        Comment comment = new Comment();
        Response expectedResult = new Response(true, "logged In and session created", tempUser);

        //Mock
        Mockito.when(commentService);
        //act

        Response actualResult = this.commentController
        //assert
        assertEquals(expectedResult.toString(), actualResult.toString());
    }

    @Test
    void deleteComment() {
        //assign
        Comment comment = new Comment();
        Response expectedResult = new Response(true, "logged In and session created", tempUser);

        //Mock
        Mockito.when(commentService);
        //act

        Response actualResult = this.commentController
        //assert
        assertEquals(expectedResult.toString(), actualResult.toString());
    }
}*/
