package com.google.spreadsheet.json.services.isobjectimpl;

import com.google.spreadsheet.json.constants.objects.BasicQuizzeAnswerConstant;
import com.google.spreadsheet.json.constants.objects.DiffQuizzeConstant;
import com.google.spreadsheet.json.model.Answer;
import com.google.spreadsheet.json.model.BasicQuizze;
import com.google.spreadsheet.json.model.DiffQuizze;
import com.google.spreadsheet.json.services.objectimpl.DiffQuizzeAnswerService;
import com.google.spreadsheet.json.services.objectimpl.DiffQuizzeService;
import com.google.spreadsheet.json.util.data.BasicQuizzeUtil;
import com.google.spreadsheet.json.util.data.DiffQuizzeAnswerUtil;
import com.google.spreadsheet.json.util.data.DiffQuizzeUtil;

import java.util.ArrayList;
import java.util.List;

public class DiffQuizzeServiceImpl extends DiffQuizzeService {
    DiffQuizzeAnswerService diffQuizzeAnswerService = new DiffQuizzeAnswerServiceImpl();

    @Override
    public List<DiffQuizze> getListFromResult(List<List<Object>> results) {
        List<DiffQuizze> diffQuizzes = new ArrayList<DiffQuizze>();
        List<List<Object>> result = new ArrayList<List<Object>>();
        result.add(results.get(0));
        for (int i = 1; i < results.size(); i++) {
            if (!checkResultNull(results.get(i))) {
                diffQuizzes.add(getData(result));
                result.clear();
                result.add(results.get(i));
            }else {
                result.add(results.get(i));
            }

        }
        diffQuizzes.add(getData(result));
        return diffQuizzes;
    }
    private DiffQuizze getData(List<List<Object>> results) {
        DiffQuizze diffQuizze = DiffQuizzeUtil.convertResultToDiffQuizze(results.get(0));
        List<Answer> answers = diffQuizzeAnswerService.getListFromResult(results);
        diffQuizze.setAnswers(answers);
        return diffQuizze;
    }
    private boolean checkResultNull(List<Object> result) {
        int blankCell = 0;
        int size = DiffQuizzeConstant.row.size();

        for (int i = 0; i < size; i++) {
            String value = result.get(DiffQuizzeConstant.row.get(i)).toString();
            if (value.equals("null") || value.equals("")) {
                blankCell++;
            }
        }
        return blankCell == size;
    }
}
