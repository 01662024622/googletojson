package com.google.spreadsheet.json.services.objectimpl;

import com.google.spreadsheet.json.model.Answer;
import com.google.spreadsheet.json.services.base.BaseObjectConvertService;

public abstract class BasicQuizzeAnswerService extends BaseObjectConvertService<Answer> {
    protected BasicQuizzeAnswerService(int[] row){
        super(row);
    }
}
