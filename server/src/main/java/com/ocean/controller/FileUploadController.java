package com.ocean.controller;

import com.ocean.models.*;
import com.ocean.services.S3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
/*
 *    @author
 *      Front End:
 *        -Angel Walker
 *       -Trevor Drury
 *       Back End:
 *        -David Burton
 *        -Shane Danner
 */
@RestController("fileUploadController")
@RequestMapping(value= "api")
@CrossOrigin(value = "http://oceanappbucket.s3-website-us-east-1.amazonaws.com/", allowCredentials = "true")
public class FileUploadController {

    private S3Service s3Service;

    @Autowired
    public FileUploadController(S3Service s3Service){this.s3Service = s3Service;}

    @PostMapping("/profile")
    public ResponseEntity<Response> uploadProfileImage(@RequestParam(value = "file")MultipartFile file) {
        return new ResponseEntity<Response>(s3Service.uploadProfileImage(file), HttpStatus.OK);
    }

    @PostMapping("/image")
    public ResponseEntity<Response> uploadFile(@RequestParam(value = "file")MultipartFile file) {
        return new ResponseEntity<Response>(s3Service.uploadImage(file), HttpStatus.OK);
    }

}