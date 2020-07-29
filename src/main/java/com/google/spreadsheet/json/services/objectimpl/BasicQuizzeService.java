package com.google.spreadsheet.json.services.objectimpl;

import com.google.spreadsheet.json.model.BasicQuizze;
import com.google.spreadsheet.json.services.base.BaseObjectConvertService;

public abstract class BasicQuizzeService extends BaseObjectConvertService<BasicQuizze> {
    protected BasicQuizzeService(int[] row){
        super(row);
    }
}
