package com.api.roopa.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.roopa.models.Image;

@RestController
@RequestMapping(path = "/images", consumes = "application/json", produces = "application/json")
public class ImageController {
    @PostMapping
    public ResponseEntity<Image> createImage(@RequestBody Image image) {
        return new ResponseEntity<Image>(image, HttpStatus.CREATED);
    }
}
