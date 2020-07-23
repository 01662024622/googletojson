package com.google.spreadsheet.json.model;


import lombok.Data;

import java.util.List;

@Data
public class Phonetic {
    private String id;
    private String title;
    private String type;
    private String howToSpeak;
    private String imageUrl;
    private String audioUrl;
    private String videoUrl;
    private Practice practice;
    private List<Example> examples;
}
