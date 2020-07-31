package com.google.spreadsheet.json.constants.objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicQuizzeAnswerConstant {
    public static final int id = 21;
    public static final int title = 22;
    public static final int description = 23;
    public static final int explain = 24;
    public static final int imageUrl = 25;
    public static final int audioUrl = 26;
    public static final int videoUrl = 27;
    public static final List<Integer> row = new ArrayList<>(Arrays.asList(id, title, description, explain, imageUrl, audioUrl, videoUrl));
}
