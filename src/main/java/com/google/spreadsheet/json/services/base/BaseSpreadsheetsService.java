package com.google.spreadsheet.json.services.base;

import com.google.spreadsheet.json.exception.QTTTException;
import com.google.spreadsheet.json.model.Phonetic;

import java.io.IOException;
import java.util.List;

public interface BaseSpreadsheetsService<T>{


  List<T> importData(String fileId) throws IOException, QTTTException;

}
