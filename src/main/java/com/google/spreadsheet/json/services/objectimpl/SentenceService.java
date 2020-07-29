package com.google.spreadsheet.json.services.objectimpl;

import com.google.spreadsheet.json.model.Sentence;
import com.google.spreadsheet.json.services.base.BaseObjectConvertService;

public abstract class SentenceService extends BaseObjectConvertService<Sentence> {
    protected SentenceService(int[] row) {
        super(row);
    }
}
