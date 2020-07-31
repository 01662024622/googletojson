package com.google.spreadsheet.json.constants.objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversationConstant {
    public static final int id = 42;
    public static final int title = 43;
    public static final int description = 44;
    public static final int imageUrl = 45;
    public static final int audioFullUrl = 46;
    public static final int audioUrlChannel1 = 47;
    public static final int audioUrlChannel2 = 48;
    public static final int videoUrl = 49;
    public static final List<Integer> row = new ArrayList<>(Arrays.asList(id, title, description, imageUrl, audioFullUrl, audioUrlChannel1, audioUrlChannel2, videoUrl));

}
