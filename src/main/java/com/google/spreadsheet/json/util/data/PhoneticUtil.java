package com.google.spreadsheet.json.util.data;

import com.google.spreadsheet.json.constants.objects.DiffQuizzeConstant;
import com.google.spreadsheet.json.constants.objects.PhoneticConstant;
import com.google.spreadsheet.json.model.DiffQuizze;
import com.google.spreadsheet.json.model.Phonetic;

import java.util.List;

public class PhoneticUtil {
    public static Phonetic convertResultToPhonetic(List<Object> result){
        Phonetic phonetic = new Phonetic();
        phonetic.setId(result.get(PhoneticConstant.id).toString());
        phonetic.setTitle(result.get(PhoneticConstant.title).toString());
        phonetic.setAudioUrl(result.get(PhoneticConstant.audioUrl).toString());
        phonetic.setHowToSpeak(result.get(PhoneticConstant.howToSpeak).toString());
        phonetic.setType(result.get(PhoneticConstant.type).toString());
        phonetic.setImageUrl(result.get(PhoneticConstant.imageUrl).toString());
        phonetic.setVideoUrl(result.get(PhoneticConstant.videoUrl).toString());

        return phonetic;
    }
}
