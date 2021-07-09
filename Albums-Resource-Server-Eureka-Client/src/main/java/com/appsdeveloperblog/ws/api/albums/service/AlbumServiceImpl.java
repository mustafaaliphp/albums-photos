package com.appsdeveloperblog.ws.api.albums.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsdeveloperblog.ws.api.albums.model.Album;
import com.appsdeveloperblog.ws.api.albums.repository.AlbumsRepository;

@Service
public class AlbumServiceImpl implements AlbumService{

	@Autowired
	AlbumsRepository albumsRepository;

	@Override
	public List<Album> getAlbums() {
		// TODO Auto-generated method stub
		return albumsRepository.findAll();
	}

	@Override
	public Album addAlbum(Album album) {
		// TODO Auto-generated method stub
		return albumsRepository.save(album);
	}

	
	

}
