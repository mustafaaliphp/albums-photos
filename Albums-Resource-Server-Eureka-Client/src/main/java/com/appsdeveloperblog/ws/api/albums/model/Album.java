package com.appsdeveloperblog.ws.api.albums.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "albums", schema = "album_db")
public class Album {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "ALBUM_SEQ", allocationSize = 1)
	
	@Column(name = "ALBUM_ID")
	private Long albumId;
	@Column(name = "ALBUM_TITLE")
	private String albumTitle;
	@Column(name = "ALBUM_DESCRIPTION")
	private String albumDescription;
	@Column(name = "ALBUM_URL")
	private String albumUrl;
}
