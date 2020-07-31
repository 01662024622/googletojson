package com.google.spreadsheet.json.services.isobjectimpl;

import com.google.spreadsheet.json.constants.objects.BasicQuizzeAnswerConstant;
import com.google.spreadsheet.json.constants.objects.PhoneticConstant;
import com.google.spreadsheet.json.constants.objects.PracticeConstant;
import com.google.spreadsheet.json.model.DiffQuizze;
import com.google.spreadsheet.json.model.Example;
import com.google.spreadsheet.json.model.Phonetic;
import com.google.spreadsheet.json.model.Practice;
import com.google.spreadsheet.json.services.objectimpl.ExampleService;
import com.google.spreadsheet.json.services.objectimpl.PhoneticService;
import com.google.spreadsheet.json.util.data.PracticeUtil;

import java.util.ArrayList;
import java.util.List;

public class PhoneticServiceImpl extends PhoneticService {
    ExampleService exampleService = new ExampleServiceImpl();
    PracticeServiceImpl practiceService =new PracticeServiceImpl();


    @Override
    public List<Phonetic> getListFromResult(List<List<Object>> results) {
        List<Phonetic> phonetics = new ArrayList<Phonetic>();
        List<List<Object>> result = new ArrayList<List<Object>>();
        result.add(results.get(0));
        for (int i = 1; i < results.size(); i++) {
            if (!checkResultNull(results.get(i))) {
                phonetics.add(getData(result));
                result.clear();
                result.add(results.get(i));
            }else {
                result.add(results.get(i));
            }

        }
        phonetics.add(getData(result));
        return phonetics;
    }

    private Phonetic getData(List<List<Object>> results) {
        Phonetic phonetic = new Phonetic();
        phonetic.setExamples(exampleService.getListFromResult(results));
        phonetic.setPractice(practiceService.getData(results));
        return phonetic;
    }
    private boolean checkResultNull(List<Object> result) {
        int blankCell = 0;
        int size = PhoneticConstant.row.size();

        for (int i = 0; i < size; i++) {
            String value = result.get(PhoneticConstant.row.get(i)).toString();
            if (value.equals("null") || value.equals("")) {
                blankCell++;
            }
        }
        return blankCell == size;
    }
}
