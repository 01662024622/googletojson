package com.google.spreadsheet.json.services.objectimpl;

import com.google.spreadsheet.json.model.DiffQuizze;
import com.google.spreadsheet.json.services.base.BaseObjectConvertService;

public abstract class DiffQuizzeService extends BaseObjectConvertService<DiffQuizze> {
    protected DiffQuizzeService(int[] row){
        super(row);
    }
}
