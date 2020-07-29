package com.google.spreadsheet.json.services.isobjectimpl;

import com.google.spreadsheet.json.constants.objects.ExampleConstant;
import com.google.spreadsheet.json.model.Example;
import com.google.spreadsheet.json.services.objectimpl.ExampleService;
import com.google.spreadsheet.json.util.data.ExampleUtil;

import java.util.ArrayList;
import java.util.List;

public class ExampleServiceImpl extends ExampleService {
    public ExampleServiceImpl(){
        super(ExampleConstant.row);
    }

    @Override
    public List<Example> getListFromResult(List<List<Object>> results) {
        List<Example> examples = new ArrayList<Example>();
        results.forEach((result)->{
            if (!checkResultNull(result)){
                examples.add(ExampleUtil.convertResultToExample(result));
            }
        });
        return examples;
    }
}
