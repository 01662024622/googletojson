package com.google.spreadsheet.json.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GoogleSheetToJsonController {
    @RequestMapping(value = "/")
    public ModelAndView getDateAndTime() {
        return new ModelAndView("index");
    }
}
