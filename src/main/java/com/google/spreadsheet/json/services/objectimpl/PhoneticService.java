package com.google.spreadsheet.json.services.objectimpl;

import com.google.spreadsheet.json.model.Phonetic;
import com.google.spreadsheet.json.services.base.BaseObjectConvertService;

public abstract class PhoneticService extends BaseObjectConvertService<Phonetic> {
    protected PhoneticService(int[] row){
        super(row);
    }
}
