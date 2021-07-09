package com.appsdeveloperblog.ws.api.photos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsdeveloperblog.ws.api.photos.model.Photo;
import com.appsdeveloperblog.ws.api.photos.repository.PhotosRepository;

@Service
public class PhotosServieImpl implements PhotoService{

	@Autowired
	PhotosRepository photosRepository;
	
	@Override
	public List<Photo> getPhotos() {
		// TODO Auto-generated method stub
		return photosRepository.findAll();
	}

	@Override
	public Photo addPhoto(Photo photo) {
		// TODO Auto-generated method stub
		return photosRepository.save(photo);
	}

}
