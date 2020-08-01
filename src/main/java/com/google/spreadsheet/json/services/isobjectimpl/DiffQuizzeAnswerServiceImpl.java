package com.google.spreadsheet.json.services.isobjectimpl;

import com.google.spreadsheet.json.constants.objects.BasicQuizzeAnswerConstant;
import com.google.spreadsheet.json.constants.objects.DiffQuizzeAnswerConstant;
import com.google.spreadsheet.json.model.Answer;
import com.google.spreadsheet.json.services.objectimpl.DiffQuizzeAnswerService;
import com.google.spreadsheet.json.util.data.DiffQuizzeAnswerUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class DiffQuizzeAnswerServiceImpl extends DiffQuizzeAnswerService {


    @Override
    public List<Answer> getListFromResult(List<List<Object>> results) {
        List<Answer> answers = new ArrayList<Answer>();
        results.forEach((result) -> {
            if (!checkResultNull(result)) {
                Answer answer = DiffQuizzeAnswerUtil.convertResultToSentence(result);
                answers.add(answer);
            }
        });
        return answers;
    }
    private boolean checkResultNull(List<Object> result) {
        int blankCell = 0;
        int size = DiffQuizzeAnswerConstant.row.size();
        for (int i = 0; i < size; i++) {
            if (DiffQuizzeAnswerConstant.row.get(i)>=result.size()) continue;
            String value = result.get(DiffQuizzeAnswerConstant.row.get(i)).toString();
            if (value.equals("null") || value.equals("")) {
                blankCell++;
            }
        }
        return blankCell == size;
    }
}
