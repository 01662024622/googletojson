package com.google.spreadsheet.json.constants.objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicQuizzeConstant {
    public static final int id = 14;
    public static final int title = 15;
    public static final int description = 16;
    public static final int correctAnswerId = 17;
    public static final int imageUrl = 18;
    public static final int audioUrl = 19;
    public static final int videoUrl = 20;
    public static final List<Integer> row = new ArrayList<>(Arrays.asList(id,title,description,correctAnswerId,imageUrl,audioUrl,videoUrl));
}
