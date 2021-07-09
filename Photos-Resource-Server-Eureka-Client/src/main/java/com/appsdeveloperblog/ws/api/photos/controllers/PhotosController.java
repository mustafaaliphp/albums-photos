package com.appsdeveloperblog.ws.api.photos.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.appsdeveloperblog.ws.api.photos.model.Photo;
import com.appsdeveloperblog.ws.api.photos.service.PhotosServieImpl;

@RestController
@RequestMapping("/photos")
public class PhotosController {
    
	@Autowired
	PhotosServieImpl photosServieImpl;
 
    @GetMapping
    public ResponseEntity<List<Photo>> getPhotos() { 
        
    	List<Photo> photoList = photosServieImpl.getPhotos();
    	 return new ResponseEntity<List<Photo>>(photoList,HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Photo> addPhoto(@RequestBody Photo photo) { 
    	Photo newPhoto = photosServieImpl.addPhoto(photo);
    	return new ResponseEntity<Photo>(newPhoto, HttpStatus.CREATED);
 
    }
}
