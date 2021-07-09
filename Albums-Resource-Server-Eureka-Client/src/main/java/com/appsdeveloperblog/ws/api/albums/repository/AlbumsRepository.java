package com.appsdeveloperblog.ws.api.albums.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appsdeveloperblog.ws.api.albums.model.Album;

public interface AlbumsRepository extends JpaRepository<Album, Long>{

}
