package com.google.spreadsheet.json.util.data;

import com.google.spreadsheet.json.constants.objects.BasicQuizzeAnswerConstant;
import com.google.spreadsheet.json.constants.objects.BasicQuizzeConstant;
import com.google.spreadsheet.json.model.BasicQuizze;

import java.util.List;

public class BasicQuizzeUtil {
    public static BasicQuizze convertResultToBasicQuizze(List<Object> result){
        BasicQuizze basicQuizze = new BasicQuizze();
        basicQuizze.setAudioUrl(result.get(BasicQuizzeConstant.audioUrl).toString());
        basicQuizze.setDescription(result.get(BasicQuizzeConstant.description).toString());
        basicQuizze.setId(result.get(BasicQuizzeConstant.id).toString());
        basicQuizze.setCorrectAnswerId(result.get(BasicQuizzeConstant.correctAnswerId).toString());
        basicQuizze.setImageUrl(result.get(BasicQuizzeConstant.imageUrl).toString());
        basicQuizze.setVideoUrl(result.get(BasicQuizzeConstant.videoUrl).toString());
        basicQuizze.setTitle(result.get(BasicQuizzeConstant.title).toString());
        return basicQuizze;
    }
}
