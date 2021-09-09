package com.revature.service;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.revature.model.User;

import java.io.File;

public class S3Service {

    //We'll probably need these to be environment variables when we deploy but while we're testing this is fine.

    private String awsID = "also testId";
    private String awsKey = "testid";
    private String region = "us-east-2";
    private String bucketName = "teamwaterbucket";

    BasicAWSCredentials awsCredentials = new BasicAWSCredentials(awsID, awsKey);

    AmazonS3 s3Client = AmazonS3ClientBuilder
            .standard()
            .withRegion(Regions.fromName(region))
            .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
            .build();

    //We'll need the bucket name whenever we try to upload something.

    private void uploadFile(File file, String pathName){
        System.out.println("S3service.uploadFile");
        s3Client.putObject(bucketName, pathName, file);
    }

    //The pathname example in kevin's explanation of this concept was:
    //"/kevsfolder/"+file.getName()
    //The files, images, path names etc will probably upload to a user's personal folder.

    //Which means that the path we're following would go /username/file type"+file.getName()
    //For example, a profile picture for user SomeGuy would go:
    //"/SomeGuy/profile.[file extension]

    //Ask frontend how they'll handle grabbing profile images. Are we going to have a consistent image file named profile.jpg or something?
    //Questions for later. For now, we know it works, and we're going to have this method return the file path so other
    //parts of the program can use it later.

    public String uploadProfileImage(String username, File file){
        System.out.println("S3service.uploadProfileImage");
        String pathName = "/users/" + username + "/images/profile/" + file.getName();
        uploadFile(file, pathName);
        return pathName;
    }

    public String uploadImage(String username, File file){
        System.out.println("S3service.uploadImage");
        String pathName = "/users/" + username + "/images/" + file.getName();
        uploadFile(file, pathName);
        return pathName;
    }

    public String uploadVideo(String username, File file){
        System.out.println("S3service.uploadVideo");
        String pathName = "/users/" + username + "/videos/" + file.getName();
        uploadFile(file, pathName);
        return pathName;
    }

    public String uploadProfileImage(User user, File file){
        return uploadProfileImage(user.getUsername(), file);
    }

    public String uploadImage(User user, File file){
        return uploadImage(user.getUsername(), file);
    }

    public String uploadVideo(User user, File file){
        return uploadVideo(user.getUsername(), file);
    }

}