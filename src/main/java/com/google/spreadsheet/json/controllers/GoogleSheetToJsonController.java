package com.google.spreadsheet.json.controllers;

import com.google.spreadsheet.json.exception.QTTTException;
import com.google.spreadsheet.json.model.Phonetic;
import com.google.spreadsheet.json.services.impl.GoogleToJsonServiceImpl;
import com.google.spreadsheet.json.services.isobjectimpl.PhoneticServiceImpl;
import com.google.spreadsheet.json.services.isservice.GoogleToJsonService;
import com.google.spreadsheet.json.util.data.GoogleSheetToJsonUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

@Controller
public class GoogleSheetToJsonController {
    @RequestMapping(value = "/")
    public ModelAndView getDateAndTime() throws GeneralSecurityException, IOException, QTTTException {
        GoogleToJsonServiceImpl googleToJsonService = new GoogleToJsonServiceImpl();
        List<Phonetic> phonetics = googleToJsonService.importData("1GUnx5sRsc7Vd6KtQYrcCh9AWaCtqB9Vjwd9ffWB1Rvc");
        return new ModelAndView("index");
    }
}
