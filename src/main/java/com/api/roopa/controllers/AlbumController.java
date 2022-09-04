package com.api.roopa.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.roopa.models.Album;

@RestController
@RequestMapping(path = "/albums", consumes = "application/json", produces = "application/json")
public class AlbumController {
    
    @PostMapping
    public ResponseEntity<Album> createAlbum(@RequestBody Album album) {
        return new ResponseEntity<Album>(album, HttpStatus.CREATED);
    }
}
