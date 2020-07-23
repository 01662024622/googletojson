package com.google.spreadsheet.json.services.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.api.services.sheets.v4.Sheets;
import com.google.spreadsheet.json.exception.QTTTException;
import com.google.spreadsheet.json.model.Phonetic;
import com.google.spreadsheet.json.services.isservice.GoogleToJsonService;
import com.google.spreadsheet.json.util.data.GoogleSheetToJsonUtil;
import com.google.spreadsheet.json.util.googleapi.SheetsServiceUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

@Service
@Slf4j
public class GoogleToJsonServiceImpl implements GoogleToJsonService {

    Sheets sheetsService;
    ObjectMapper objectMapper = new ObjectMapper();


    public GoogleToJsonServiceImpl() throws GeneralSecurityException, IOException {
        this.sheetsService = SheetsServiceUtil.getSheetsService();
    }


    @Override
    public List<Phonetic> importData(String fileId) throws IOException, QTTTException {

        List<Phonetic> phonetics = GoogleSheetToJsonUtil.getAllDataFromFile(sheetsService, fileId);
        if (phonetics == null) {
            throw new QTTTException("Sheet is not have record");
        } else {
            return phonetics;
        }
    }
}
