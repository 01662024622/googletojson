package com.google.spreadsheet.json.services.objectimpl;

import com.google.spreadsheet.json.model.Answer;
import com.google.spreadsheet.json.model.DiffQuizze;
import com.google.spreadsheet.json.services.base.BaseObjectConvertService;

public abstract class DiffQuizzeAnswerService extends BaseObjectConvertService<Answer> {
    protected DiffQuizzeAnswerService(int[] row){
        super(row);
    }
}
