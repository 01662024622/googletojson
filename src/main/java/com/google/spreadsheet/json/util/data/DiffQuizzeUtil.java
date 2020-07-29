package com.google.spreadsheet.json.util.data;

import com.google.spreadsheet.json.constants.objects.BasicQuizzeConstant;
import com.google.spreadsheet.json.constants.objects.DiffQuizzeConstant;
import com.google.spreadsheet.json.model.BasicQuizze;
import com.google.spreadsheet.json.model.DiffQuizze;

import java.util.List;

public class DiffQuizzeUtil {
    public static DiffQuizze convertResultToDiffQuizze(List<Object> result){
        DiffQuizze diffQuizze = new DiffQuizze();
        diffQuizze.setAudioUrl(result.get(DiffQuizzeConstant.audioUrl).toString());
        diffQuizze.setDescription(result.get(DiffQuizzeConstant.description).toString());
        diffQuizze.setId(result.get(DiffQuizzeConstant.id).toString());
        diffQuizze.setCorrectAnswerId(result.get(DiffQuizzeConstant.correctAnswerId).toString());
        diffQuizze.setImageUrl(result.get(DiffQuizzeConstant.imageUrl).toString());
        diffQuizze.setVideoUrl(result.get(DiffQuizzeConstant.videoUrl).toString());
        diffQuizze.setTitle(result.get(DiffQuizzeConstant.title).toString());
        return diffQuizze;
    }
}
