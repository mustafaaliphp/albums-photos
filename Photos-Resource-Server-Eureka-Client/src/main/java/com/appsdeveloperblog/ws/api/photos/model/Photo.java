package com.appsdeveloperblog.ws.api.photos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import javax.persistence.SequenceGenerator;
@Data
@Entity
@Table(name = "photos", schema = "photo_db")
public class Photo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "PHOTO_SEQ", allocationSize = 1)
	@Column(name = "PHOTO_ID")
    private Long photoId;
	@Column(name = "PHOTO_TITLE")
    private String photoTitle;
	@Column(name = "PHOTO_DESCRIPTION")
    private String photoDescription;
	@Column(name = "PHOTO_URL")
    private String photoUrl;
	@Column(name = "ALBUM_ID")
	private Long albumId;
}
