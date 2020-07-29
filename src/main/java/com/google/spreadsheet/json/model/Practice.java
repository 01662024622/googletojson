package com.google.spreadsheet.json.model;

import lombok.Data;

import java.util.List;

@Data
public class Practice {
    private String[] words;
    private String[] phases;
    private String[] sentences;
    private List<BasicQuizze> basic_quizzes;
    private List<DiffQuizze> diff_quizzes;
    private Conversation conversation;

}
