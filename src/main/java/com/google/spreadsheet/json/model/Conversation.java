package com.google.spreadsheet.json.model;

import lombok.Data;

import java.util.List;

@Data
public class Conversation {
    private String id;
    private String title;
    private String description;
    private String imageUrl;
    private String audioFullUrl;
    private String audioUrlChannel1;
    private String audioUrlChannel2;
    private String videoUrl;
    private List<Sentence> sentences;

}
