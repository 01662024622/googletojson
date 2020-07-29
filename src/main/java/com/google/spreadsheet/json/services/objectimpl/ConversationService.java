package com.google.spreadsheet.json.services.objectimpl;

import com.google.spreadsheet.json.model.Conversation;
import com.google.spreadsheet.json.services.base.BaseObjectConvertService;

public abstract class ConversationService extends BaseObjectConvertService<Conversation> {
    protected ConversationService(int[] row){
        super(row);
    }
}
