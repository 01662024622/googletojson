package com.google.spreadsheet.json.services.isobjectimpl;

import com.google.spreadsheet.json.constants.objects.SentenceConstant;
import com.google.spreadsheet.json.model.Sentence;
import com.google.spreadsheet.json.services.objectimpl.SentenceService;
import com.google.spreadsheet.json.util.data.SentenceUtil;

import java.util.ArrayList;
import java.util.List;

public class SentenceServiceImpl extends SentenceService {

    public SentenceServiceImpl(){
        super(SentenceConstant.row);
    }


    @Override
    public List<Sentence> getListFromResult(List<List<Object>> results) {
        List<Sentence> sentences = new ArrayList<Sentence>();
        results.forEach((result)->{
            if (!checkResultNull(result)) {
                sentences.add(SentenceUtil.convertResultToSentence(result));
            }
        });
        return sentences;
    }

}
