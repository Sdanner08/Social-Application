/*
package com.ocean.controller;

import com.ocean.models.Like;
import com.ocean.models.Response;
import com.ocean.services.LikeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class LikeControllerTest {
    LikeController likeController;

    @Mock
    LikeService likeService;

    @BeforeEach
    void setUp() {
        this.likeController = new LikeController(likeService);
    }

    @Test
    void createLike() {
        //assign
        Like like = new Like();
        Response expectedResult = new Response(true, "logged In and session created", tempUser);

        //Mock
        Mockito.when(likeService);
        //act

        Response actualResult = this.likeController
        //assert
        assertEquals(expectedResult.toString(), actualResult.toString());
    }

    @Test
    void getLikeByPostId() {
        //assign
        Like like = new Like();
        Response expectedResult = new Response(true, "logged In and session created", tempUser);

        //Mock
        Mockito.when(likeService);
        //act

        Response actualResult = this.likeController
        //assert
        assertEquals(expectedResult.toString(), actualResult.toString());
    }

    @Test
    void deleteLike() {
        //assign
        Like like = new Like();
        Response expectedResult = new Response(true, "logged In and session created", tempUser);

        //Mock
        Mockito.when(likeService);
        //act

        Response actualResult = this.likeController
        //assert
        assertEquals(expectedResult.toString(), actualResult.toString());
    }
}*/
