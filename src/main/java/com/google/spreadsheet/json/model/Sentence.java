package com.google.spreadsheet.json.model;

import lombok.Data;

@Data
public class Sentence {
    private Long priority;
    private String from;
    private String text;
    private String audioUrl;
    private Long audioFrom;
    private Long audioTo;
}
