package com.google.spreadsheet.json.services.base;

import java.util.List;

public abstract class BaseObjectConvertService<T> {
    private final int[] row;

    protected BaseObjectConvertService(int[] row) {
        this.row = row;
    }


    public abstract List<T> getListFromResult(List<List<Object>> results);

    public boolean checkResultNull(List<Object> result) {
        int blankCell = 0;
        int size = row.length;

        for (int i = 0; i < size; i++) {
            String value = result.get(row[i]).toString();
            if (value.equals("null") || value.equals("")) {
                blankCell++;
            }
        }
        return blankCell == size;
    }
}
