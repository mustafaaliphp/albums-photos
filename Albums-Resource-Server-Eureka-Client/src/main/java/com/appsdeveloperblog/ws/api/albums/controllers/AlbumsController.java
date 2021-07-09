package com.appsdeveloperblog.ws.api.albums.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appsdeveloperblog.ws.api.albums.model.Album;
import com.appsdeveloperblog.ws.api.albums.service.AlbumServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
@RequestMapping("/albums")
public class AlbumsController {
    
	@Autowired
	AlbumServiceImpl albumServiceImpl;
	
    @GetMapping
    public ResponseEntity<List<Album>> getAlbums() { 
        
    	List<Album> albumList = albumServiceImpl.getAlbums();
    	 return new ResponseEntity<List<Album>>(albumList,HttpStatus.OK);
    }
 
    @PostMapping
    public ResponseEntity<Album> addAlbum(@RequestBody Album album) { 
    	Album newAlbum = albumServiceImpl.addAlbum(album);
    	return new ResponseEntity<Album>(newAlbum, HttpStatus.CREATED);
 
    }
}
