package com.google.spreadsheet.json.services.objectimpl;

import com.google.spreadsheet.json.model.Example;
import com.google.spreadsheet.json.services.base.BaseObjectConvertService;

public abstract class ExampleService extends BaseObjectConvertService<Example> {
    protected ExampleService(int[] row){
        super(row);
    }
}
