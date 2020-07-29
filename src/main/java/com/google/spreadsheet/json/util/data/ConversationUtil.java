package com.google.spreadsheet.json.util.data;

import com.google.spreadsheet.json.constants.objects.ConversationConstant;
import com.google.spreadsheet.json.constants.objects.DiffQuizzeAnswerConstant;
import com.google.spreadsheet.json.model.Answer;
import com.google.spreadsheet.json.model.Conversation;

import java.util.List;

public class ConversationUtil {
    public static Conversation convertResultToConversation(List<Object> result) {
        Conversation conversation = new Conversation();
        conversation.setAudioFullUrl(result.get(ConversationConstant.audioFullUrl).toString());
        conversation.setAudioUrlChannel1(result.get(ConversationConstant.audioUrlChannel1).toString());
        conversation.setAudioUrlChannel2(result.get(ConversationConstant.audioUrlChannel2).toString());
        conversation.setDescription(result.get(ConversationConstant.description).toString());
        conversation.setId(result.get(ConversationConstant.id).toString());
        conversation.setTitle(result.get(ConversationConstant.title).toString());
        conversation.setImageUrl(result.get(ConversationConstant.imageUrl).toString());
        conversation.setVideoUrl(result.get(ConversationConstant.videoUrl).toString());
        return conversation;
    }
}
