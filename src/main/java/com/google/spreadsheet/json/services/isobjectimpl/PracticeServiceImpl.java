package com.google.spreadsheet.json.services.isobjectimpl;

import com.google.spreadsheet.json.constants.objects.BasicQuizzeAnswerConstant;
import com.google.spreadsheet.json.constants.objects.PracticeConstant;
import com.google.spreadsheet.json.model.Answer;
import com.google.spreadsheet.json.model.BasicQuizze;
import com.google.spreadsheet.json.model.DiffQuizze;
import com.google.spreadsheet.json.model.Practice;
import com.google.spreadsheet.json.services.objectimpl.*;
import com.google.spreadsheet.json.util.data.DiffQuizzeUtil;
import com.google.spreadsheet.json.util.data.PracticeUtil;

import java.util.List;

public class PracticeServiceImpl extends PracticeService {
    private DiffQuizzeService diffQuizzeService = new DiffQuizzeServiceImpl();
    private BasicQuizzeService basicQuizzeService = new BasicQuizzeServiceImpl();
    private ConversationServiceImpl conversationService = new ConversationServiceImpl();

    @Override
    public List<Practice> getListFromResult(List<List<Object>> results) {
        return null;
    }
    public Practice getData(List<List<Object>> results) {
        Practice practice = new Practice();
        String[] words = PracticeUtil.getListString(results,PracticeConstant.word);
        String[] sentences = PracticeUtil.getListString(results,PracticeConstant.sentence);
        String[] phases = PracticeUtil.getListString(results,PracticeConstant.phase);
        practice.setWords(words);
        practice.setPhases(phases);
        practice.setSentences(sentences);
        practice.setBasic_quizzes(basicQuizzeService.getListFromResult(results));
        practice.setDiff_quizzes(diffQuizzeService.getListFromResult(results));
        practice.setConversation(conversationService.getData(results));
        return practice;
    }
    private boolean checkResultNull(List<Object> result) {
        int blankCell = 0;
        int size = PracticeConstant.row.size();

        for (int i = 0; i < size; i++) {
            String value = result.get(PracticeConstant.row.get(i)).toString();
            if (value.equals("null") || value.equals("")) {
                blankCell++;
            }
        }
        return blankCell == size;
    }
}
