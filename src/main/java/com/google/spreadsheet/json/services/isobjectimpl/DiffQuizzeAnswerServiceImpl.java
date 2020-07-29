package com.google.spreadsheet.json.services.isobjectimpl;

import com.google.spreadsheet.json.constants.objects.DiffQuizzeAnswerConstant;
import com.google.spreadsheet.json.model.Answer;
import com.google.spreadsheet.json.services.objectimpl.DiffQuizzeAnswerService;
import com.google.spreadsheet.json.util.data.DiffQuizzeAnswerUtil;

import java.util.ArrayList;
import java.util.List;

public class DiffQuizzeAnswerServiceImpl extends DiffQuizzeAnswerService {
    public DiffQuizzeAnswerServiceImpl() {
        super(DiffQuizzeAnswerConstant.row);
    }

    @Override
    public List<Answer> getListFromResult(List<List<Object>> results) {
        List<Answer> answers = new ArrayList<Answer>();
        results.forEach((result) -> {
            if (!checkResultNull(result)) {
                DiffQuizzeAnswerUtil.convertResultToSentence(result);
            }
        });
        return answers;
    }
}
