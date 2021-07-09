package com.appsdeveloperblog.ws.api.photos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.appsdeveloperblog.ws.api.photos.model.Photo;

public interface PhotosRepository extends JpaRepository<Photo, Long>{

}
