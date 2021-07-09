package com.appsdeveloperblog.ws.api.photos.service;

import java.util.List;

import com.appsdeveloperblog.ws.api.photos.model.Photo;

public interface PhotoService {
	
	public List<Photo> getPhotos();
	public Photo addPhoto(Photo photo);

}
