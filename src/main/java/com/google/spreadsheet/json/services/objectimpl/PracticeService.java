package com.google.spreadsheet.json.services.objectimpl;

import com.google.spreadsheet.json.model.Practice;
import com.google.spreadsheet.json.services.base.BaseObjectConvertService;

public abstract class PracticeService extends BaseObjectConvertService<Practice> {
    protected PracticeService(int[] row){
        super(row);
    }
}
