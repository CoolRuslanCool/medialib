package com.search.medialib.service;

import com.search.medialib.domain.Photo;
import com.search.medialib.repository.GalleryRepository;
import com.search.medialib.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoService {

    private GalleryRepository galleryRepository;
    private PhotoRepository photoRepository;

    @Autowired
    public PhotoService(GalleryRepository galleryRepository, PhotoRepository photoRepository) {
        this.galleryRepository = galleryRepository;
        this.photoRepository = photoRepository;
    }

    public List<Photo> photos() {
        return photoRepository.findAll();
    }
}
