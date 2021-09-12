package com.ocean.services;

import org.junit.jupiter.api.Test;

import java.io.File;

public class S3Test {
    S3Service s3 = new S3Service();

    @Test
    public void uploadImage(){
        File imageTest = new File("ImageTest.jpg");

        System.out.println("PathName = " + s3.uploadImage("UploadImageTestUser", imageTest));
    }

    @Test
    public void uploadProfileImage(){
        File profileTest = new File("ProfileTest.png");

        s3.uploadProfileImage("UploadProfileImageTestUser", profileTest);
    }

    @Test
    public void uploadVideo(){
        File videoTest = new File("VideoTest.MOV");

        s3.uploadVideo("UploadVideoTestUser", videoTest);
    }

}
