package com.google.spreadsheet.json.services.isobjectimpl;

import com.google.spreadsheet.json.constants.objects.BasicQuizzeAnswerConstant;
import com.google.spreadsheet.json.model.Answer;
import com.google.spreadsheet.json.services.objectimpl.BasicQuizzeAnswerService;
import com.google.spreadsheet.json.util.data.BasicQuizzeAnswerUtil;

import java.util.ArrayList;
import java.util.List;

public class BasicQuizzeAnswerServiceImpl extends BasicQuizzeAnswerService {

    @Override
    public List<Answer> getListFromResult(List<List<Object>> results) {
        List<Answer> answers = new ArrayList<Answer>();
        results.forEach((result)->{
            if (!checkResultNull(result)) {
                BasicQuizzeAnswerUtil.convertResultToBasicQuizzeAnswer(result);
            }
        });
        return answers;
    }
    private boolean checkResultNull(List<Object> result) {
        int blankCell = 0;
        int size = BasicQuizzeAnswerConstant.row.size();

        for (int i = 0; i < size; i++) {
            String value = result.get(BasicQuizzeAnswerConstant.row.get(i)).toString();
            if (value.equals("null") || value.equals("")) {
                blankCell++;
            }
        }
        return blankCell == size;
    }
}
