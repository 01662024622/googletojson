package com.google.spreadsheet.json.util.data;

import com.google.spreadsheet.json.constants.objects.DiffQuizzeAnswerConstant;
import com.google.spreadsheet.json.model.Answer;

import java.util.List;

public class DiffQuizzeAnswerUtil {
    public static Answer convertResultToSentence(List<Object> result){
        int size =  result.size();
        Answer answer = new Answer();
        if (DiffQuizzeAnswerConstant.audioUrl<size){
            answer.setAudioUrl(result.get(DiffQuizzeAnswerConstant.audioUrl).toString());
        }
        if (DiffQuizzeAnswerConstant.description<size){
            answer.setDescription(result.get(DiffQuizzeAnswerConstant.description).toString());
        }
        if (DiffQuizzeAnswerConstant.explain<size){
            answer.setExplain(result.get(DiffQuizzeAnswerConstant.explain).toString());
        }
        if (DiffQuizzeAnswerConstant.id<size){
            answer.setId(result.get(DiffQuizzeAnswerConstant.id).toString());
        }
        if (DiffQuizzeAnswerConstant.imageUrl<size){
            answer.setImageUrl(result.get(DiffQuizzeAnswerConstant.imageUrl).toString());
        }
        if (DiffQuizzeAnswerConstant.videoUrl<size){
            answer.setVideoUrl(result.get(DiffQuizzeAnswerConstant.videoUrl).toString());
        }
        if (DiffQuizzeAnswerConstant.title<size){
            answer.setTitle(result.get(DiffQuizzeAnswerConstant.title).toString());
        }
        return answer;
    }
}
