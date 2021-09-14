package com.ocean.controller;

import com.ocean.models.*;
import com.ocean.services.S3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController("fileUploadController")
@RequestMapping(value= "api")
@CrossOrigin(value = "http://localhost:4200/", allowCredentials = "true")
public class FileUploadController {

    private S3Service s3Service;

    @Autowired
    public FileUploadController(S3Service s3Service){this.s3Service = s3Service;}

    @PostMapping("/profile")
    public ResponseEntity<Response> uploadProfileImage(@RequestParam(value = "file")MultipartFile file) {
        return new ResponseEntity<Response>(s3Service.uploadImage(file), HttpStatus.OK);
    }

    @PostMapping("/image")
    public ResponseEntity<Response> uploadFile(@RequestParam(value = "file")MultipartFile file) {
        return new ResponseEntity<Response>(s3Service.uploadImage(file), HttpStatus.OK);
    }

    /*@PostMapping("/profile")
    public Response uploadProfile(@RequestBody String username, FileUp fileUp){
        Response response;
        String uploadProUrl = this.s3Service.uploadProfileImage(username, fileUp);
        if(uploadProUrl != null){
            response = new Response(true,"Here is your URL",uploadProUrl);
        }else{
            response = new Response(false,"your picture failed to upload", null);
        }
        return response;
    }*/

    /*@PostMapping("/image")
    public Response uploadPostImage(@RequestBody String username, FileUp fileUp){
        Response response;
        String uploadPostImage = this.s3Service.uploadImage(username, fileUp);
        if(uploadPostImage != null){
            response = new Response(true,"Your post image was uploaded", uploadPostImage);
        }else{
            response = new Response(false, "your image was not uploaded", null);
        }
        return response;
    }*/
}