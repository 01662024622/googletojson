package com.google.spreadsheet.json.model;

import lombok.Data;

import java.util.List;

@Data
public class Practice {
    private List<String> words;
    private List<String> phases;
    private List<String> sentences;
    private List<BasicQuizze> basic_quizzes;
    private List<DiffQuizze> diff_quizzes;
    private Conversation conversation;

}
