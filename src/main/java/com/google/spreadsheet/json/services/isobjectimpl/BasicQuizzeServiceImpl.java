package com.google.spreadsheet.json.services.isobjectimpl;

import com.google.spreadsheet.json.constants.objects.BasicQuizzeConstant;
import com.google.spreadsheet.json.model.Answer;
import com.google.spreadsheet.json.model.BasicQuizze;
import com.google.spreadsheet.json.services.objectimpl.BasicQuizzeService;
import com.google.spreadsheet.json.util.data.BasicQuizzeAnswerUtil;
import com.google.spreadsheet.json.util.data.BasicQuizzeUtil;

import java.util.ArrayList;
import java.util.List;

public class BasicQuizzeServiceImpl extends BasicQuizzeService {
    private BasicQuizzeAnswerServiceImpl basicQuizzeAnswerService = new BasicQuizzeAnswerServiceImpl();

    public BasicQuizzeServiceImpl() {
        super(BasicQuizzeConstant.row);
    }

    @Override
    public List<BasicQuizze> getListFromResult(List<List<Object>> results) {
        List<BasicQuizze> basicQuizzes = new ArrayList<BasicQuizze>();
        List<List<Object>> result = new ArrayList<List<Object>>();
        result.add(results.get(0));
        for (int i = 1; i < results.size(); i++) {
            if (!checkResultNull(results.get(i))) {
                basicQuizzes.add(getData(result));
                result.clear();
                result.add(results.get(i));
            }else {
                result.add(results.get(i));
            }

        }
        basicQuizzes.add(getData(result));
        return basicQuizzes;
    }

    private BasicQuizze getData(List<List<Object>> results) {
        BasicQuizze basicQuizze = BasicQuizzeUtil.convertResultToBasicQuizze(results.get(0));
        List<Answer> answers = basicQuizzeAnswerService.getListFromResult(results);
        basicQuizze.setAnswers(answers);
        return basicQuizze;
    }
}
