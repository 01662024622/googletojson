package com.google.spreadsheet.json.model;

import lombok.Data;

import java.util.List;

@Data
public class DiffQuizze {
    private String id;
    private String title;
    private String description;
    private String correctAnswerId;
    private String imageUrl;
    private String audioUrl;
    private String videoUrl;
    private List<Answer> answers;
}
