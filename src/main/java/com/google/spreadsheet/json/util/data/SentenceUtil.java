package com.google.spreadsheet.json.util.data;

import com.google.spreadsheet.json.constants.objects.SentenceConstant;
import com.google.spreadsheet.json.model.Sentence;

import java.util.List;

public class SentenceUtil {
    public static Sentence convertResultToSentence(List<Object> result){
        int size = result.size();
        Sentence sentence = new Sentence();
        if (SentenceConstant.audioFrom<size){
            sentence.setAudioFrom(result.get(SentenceConstant.audioFrom).toString());
        }
        if (SentenceConstant.audioTo<size){
            sentence.setAudioTo(result.get(SentenceConstant.audioTo).toString());
        }
        if (SentenceConstant.audioUrl<size){
            sentence.setAudioUrl(result.get(SentenceConstant.audioUrl).toString());
        }
        if (SentenceConstant.from<size){
            sentence.setFrom(result.get(SentenceConstant.from).toString());
        }if (SentenceConstant.priority<size){
            sentence.setPriority(result.get(SentenceConstant.priority).toString());
        }if (SentenceConstant.text<size){
            sentence.setText(result.get(SentenceConstant.text).toString());
        }

        return sentence;
    }
}
