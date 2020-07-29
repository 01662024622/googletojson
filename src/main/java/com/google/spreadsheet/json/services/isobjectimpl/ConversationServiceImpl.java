package com.google.spreadsheet.json.services.isobjectimpl;

import com.google.spreadsheet.json.constants.objects.ConversationConstant;
import com.google.spreadsheet.json.model.Answer;
import com.google.spreadsheet.json.model.Conversation;
import com.google.spreadsheet.json.model.DiffQuizze;
import com.google.spreadsheet.json.model.Sentence;
import com.google.spreadsheet.json.services.objectimpl.ConversationService;
import com.google.spreadsheet.json.services.objectimpl.SentenceService;
import com.google.spreadsheet.json.util.data.ConversationUtil;
import com.google.spreadsheet.json.util.data.DiffQuizzeUtil;

import java.util.ArrayList;
import java.util.List;

public class ConversationServiceImpl extends ConversationService {
    private SentenceService sentenceService = new SentenceServiceImpl();
    public ConversationServiceImpl(){
        super(ConversationConstant.row);
    }

    @Override
    public List<Conversation> getListFromResult(List<List<Object>> results) {
        List<Conversation> conversations = new ArrayList<Conversation>();
        List<List<Object>> result = new ArrayList<List<Object>>();
        result.add(results.get(0));
        for (int i = 1; i < results.size(); i++) {
            if (!checkResultNull(results.get(i))) {
                conversations.add(getData(result));
                result.clear();
                result.add(results.get(i));
            }else {
                result.add(results.get(i));
            }

        }
        conversations.add(getData(result));
        return conversations;
    }
    public Conversation getData(List<List<Object>> results) {
        Conversation conversation = ConversationUtil.convertResultToConversation(results.get(0));
        List<Sentence> sentences = sentenceService.getListFromResult(results);
        conversation.setSentences(sentences);
        return conversation;
    }
}
