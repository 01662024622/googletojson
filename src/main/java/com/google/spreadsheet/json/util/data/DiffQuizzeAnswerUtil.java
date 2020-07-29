package com.google.spreadsheet.json.util.data;

import com.google.spreadsheet.json.constants.objects.DiffQuizzeAnswerConstant;
import com.google.spreadsheet.json.model.Answer;

import java.util.List;

public class DiffQuizzeAnswerUtil {
    public static Answer convertResultToSentence(List<Object> result){
        Answer answer = new Answer();
        answer.setAudioUrl(result.get(DiffQuizzeAnswerConstant.audioUrl).toString());
        answer.setDescription(result.get(DiffQuizzeAnswerConstant.description).toString());
        answer.setExplain(result.get(DiffQuizzeAnswerConstant.explain).toString());
        answer.setId(result.get(DiffQuizzeAnswerConstant.id).toString());
        answer.setImageUrl(result.get(DiffQuizzeAnswerConstant.imageUrl).toString());
        answer.setVideoUrl(result.get(DiffQuizzeAnswerConstant.videoUrl).toString());
        answer.setTitle(result.get(DiffQuizzeAnswerConstant.title).toString());
        return answer;
    }
}
