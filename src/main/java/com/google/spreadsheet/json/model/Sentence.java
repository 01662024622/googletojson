package com.google.spreadsheet.json.model;

import lombok.Data;

@Data
public class Sentence {
    private String priority;
    private String from;
    private String text;
    private String audioUrl;
    private String audioFrom;
    private String audioTo;
}
