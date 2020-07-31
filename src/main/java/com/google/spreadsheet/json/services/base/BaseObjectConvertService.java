package com.google.spreadsheet.json.services.base;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class BaseObjectConvertService<T> {


    public abstract List<T> getListFromResult(List<List<Object>> results);


}
