package com.google.spreadsheet.json.util.data;

import com.google.spreadsheet.json.constants.objects.SentenceConstant;
import com.google.spreadsheet.json.model.Sentence;

import java.util.List;

public class SentenceUtil {
    public static Sentence convertResultToSentence(List<Object> result){
        Sentence sentence = new Sentence();
        sentence.setAudioFrom(result.get(SentenceConstant.audioFrom).toString());
        sentence.setAudioTo(result.get(SentenceConstant.audioTo).toString());
        sentence.setAudioUrl(result.get(SentenceConstant.audioUrl).toString());
        sentence.setFrom(result.get(SentenceConstant.from).toString());
        sentence.setPriority(result.get(SentenceConstant.priority).toString());
        sentence.setText(result.get(SentenceConstant.text).toString());
        return sentence;
    }
}
