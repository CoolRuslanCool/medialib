package com.search.medialib.web;

import com.search.medialib.domain.Photo;
import com.search.medialib.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class PhotoController {

    private final PhotoService photoService;

    @Autowired
    public PhotoController(PhotoService photoService) {
        this.photoService = photoService;
    }

    @GetMapping(value = "photos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Photo> photos() {
        return photoService.photos();
    }

}
