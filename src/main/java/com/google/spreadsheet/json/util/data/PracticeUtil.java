package com.google.spreadsheet.json.util.data;

import com.google.spreadsheet.json.constants.objects.SentenceConstant;
import com.google.spreadsheet.json.model.Practice;
import com.google.spreadsheet.json.model.Sentence;

import java.util.ArrayList;
import java.util.List;

public class PracticeUtil {
    public static Practice convertResultToPractice(List<Object> result) {
        Practice practice = new Practice();
//        practice.setPhases(result.get(SentenceConstant.audioFrom).toString());
        return practice;
    }

    public static String[] getListString(List<List<Object>> results, int key) {
        List<String> list = new ArrayList<String>();
        results.forEach((result) -> {
            if (result.size() > key) {
                String value = result.get(key).toString();
                if (!value.equals("null") && !value.equals("")) {
                    list.add(value);
                }
            }
        });
        String[] strings = new String[list.size()];
        for (int j = 0; j < list.size(); j++) {
            strings[j] = list.get(j);
        }
        return strings;
    }
}
