package com.api.roopa.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Album {
    private Long id;
    private String albumName;
    private String description;
}
