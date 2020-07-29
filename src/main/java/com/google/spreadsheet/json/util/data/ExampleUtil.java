package com.google.spreadsheet.json.util.data;

import com.google.spreadsheet.json.constants.objects.DiffQuizzeAnswerConstant;
import com.google.spreadsheet.json.constants.objects.ExampleConstant;
import com.google.spreadsheet.json.model.Answer;
import com.google.spreadsheet.json.model.Example;

import java.util.List;

public class ExampleUtil {
    public static Example convertResultToExample(List<Object> result){
        Example example = new Example();
        example.setAudioUrl(result.get(ExampleConstant.audioUrl).toString());
        example.setPronunciation(result.get(ExampleConstant.pronunciation).toString());
        example.setType(result.get(ExampleConstant.type).toString());
        example.setWord(result.get(ExampleConstant.word).toString());
        return example;
    }
}
