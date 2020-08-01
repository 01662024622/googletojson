package com.google.spreadsheet.json.services.isobjectimpl;

import com.google.spreadsheet.json.constants.objects.PhoneticConstant;
import com.google.spreadsheet.json.model.Phonetic;
import com.google.spreadsheet.json.services.objectimpl.ExampleService;
import com.google.spreadsheet.json.services.objectimpl.PhoneticService;
import com.google.spreadsheet.json.util.data.PhoneticUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
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
        log.info(results.toString());
        Phonetic phonetic = PhoneticUtil.convertResultToPhonetic(results.get(0));
        phonetic.setExamples(exampleService.getListFromResult(results));
        phonetic.setPractice(practiceService.getData(results));
        return phonetic;
    }

    private boolean checkResultNull(List<Object> result) {
        if (result.size()==0) return false;
        int blankCell = 0;
        int size = PhoneticConstant.row.size();

        for (int i = 0; i < size; i++) {
            String value = result.get(PhoneticConstant.row.get(i)).toString();
            if (value.equals("null") || value.equals("")||value.equals(" ")) {
                blankCell++;
            }
        }
        return blankCell == size;
    }
}
