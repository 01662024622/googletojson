package com.google.spreadsheet.json.services.base;

import java.util.List;

public interface BaseObjectConvertService<T> {
    public List<T> getListFromResult();
}
