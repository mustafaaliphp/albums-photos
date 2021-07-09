package com.appsdeveloperblog.ws.api.albums.service;

import java.util.List;
import com.appsdeveloperblog.ws.api.albums.model.Album;

public interface AlbumService {

	List<Album> getAlbums();

	Album addAlbum(Album album);
}
