package com.google.spreadsheet.json.model;


import lombok.Data;

@Data
public class Example {
    private String type;
    private String word;
    private String pronunciation;
    private String audioUrl;
}
