package com.google.spreadsheet.json.model;


import lombok.Data;

@Data
public class Answer {
    private String id;
    private String title;
    private String description;
    private String explain;
    private String imageUrl;
    private String audioUrl;
    private String videoUrl;
}
