package com.google.spreadsheet.json.util.data;

import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import com.google.spreadsheet.json.constants.RangeConstant;
import com.google.spreadsheet.json.exception.QTTTException;
import com.google.spreadsheet.json.model.Example;
import com.google.spreadsheet.json.model.Phonetic;
import com.google.spreadsheet.json.util.validate.ValidateDatatypeUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class GoogleSheetToJsonUtil {
    public static List<Phonetic> getAllDataFromFile(Sheets sheetsService, String fileId) throws QTTTException {
        String sheetName = RangeConstant.SHEET_NAME;
        String range = sheetName + RangeConstant.RANGE;
        ValueRange response;
        try {
            response = sheetsService.spreadsheets().values().get(fileId, range)
                    .execute();
        } catch (Exception e) {
            throw new QTTTException("File can't find data in sheet name data");
        }
        List<List<Object>> values = response.getValues();
        if (values == null || values.isEmpty()) {
            log.info("File " + sheetName + " No data found.");
            return null;
        } else {
            List<Phonetic> phonetics = new ArrayList<>();
            for (List row : values) {
                if (ValidateDatatypeUtil.isBlankRow(row)) {
                    continue;
                }
            }
            return phonetics;
        }
    }



}
