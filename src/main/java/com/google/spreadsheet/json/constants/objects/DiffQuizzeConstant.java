package com.google.spreadsheet.json.constants.objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiffQuizzeConstant {
    public static final int id = 28;
    public static final int title = 29;
    public static final int description = 30;
    public static final int correctAnswerId = 31;
    public static final int imageUrl = 32;
    public static final int audioUrl = 33;
    public static final int videoUrl = 34;
    public static final List<Integer> row = new ArrayList<>(Arrays.asList(id, title, description, correctAnswerId, imageUrl, audioUrl, videoUrl));
}
