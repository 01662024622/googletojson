package com.google.spreadsheet.json.util.data;

import com.google.spreadsheet.json.constants.objects.BasicQuizzeAnswerConstant;
import com.google.spreadsheet.json.model.Answer;

import java.util.List;

public class BasicQuizzeAnswerUtil {
    public static Answer convertResultToBasicQuizzeAnswer(List<Object> result){
        Answer answer = new Answer();
        answer.setAudioUrl(result.get(BasicQuizzeAnswerConstant.audioUrl).toString());
        answer.setDescription(result.get(BasicQuizzeAnswerConstant.description).toString());
        answer.setExplain(result.get(BasicQuizzeAnswerConstant.explain).toString());
        answer.setId(result.get(BasicQuizzeAnswerConstant.id).toString());
        answer.setImageUrl(result.get(BasicQuizzeAnswerConstant.imageUrl).toString());
        answer.setVideoUrl(result.get(BasicQuizzeAnswerConstant.videoUrl).toString());
        answer.setTitle(result.get(BasicQuizzeAnswerConstant.title).toString());
        return answer;
    }
}
