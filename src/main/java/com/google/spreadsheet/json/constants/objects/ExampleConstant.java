package com.google.spreadsheet.json.constants.objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleConstant {
    public static final int type = 7;
    public static final int word = 8;
    public static final int pronunciation = 9;
    public static final int audioUrl = 10;
    public static final List<Integer> row = new ArrayList<>(Arrays.asList(type, word, pronunciation, audioUrl));

}
