package com.google.spreadsheet.json.constants.objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SentenceConstant extends BaseConstant{
    public static final int priority = 50;
    public static final int from = 51;
    public static final int text = 52;
    public static final int audioUrl = 53;
    public static final int audioFrom = 54;
    public static final int audioTo = 55;

    public static final List<Integer> row = new ArrayList<>(Arrays.asList(priority, from, text, audioFrom, audioTo, audioUrl));
}
