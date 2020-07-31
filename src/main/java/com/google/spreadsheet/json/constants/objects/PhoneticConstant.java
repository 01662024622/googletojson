package com.google.spreadsheet.json.constants.objects;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class PhoneticConstant {

    public static final int id = 0;
    public static final int title = 1;
    public static final int type = 2;
    public static final int howToSpeak = 3;
    public static final int imageUrl = 4;
    public static final int audioUrl = 5;
    public static final int videoUrl = 6;
    public static final List<Integer> row = new ArrayList<>(Arrays.asList(id, title, type, howToSpeak, imageUrl, audioUrl, videoUrl));


}
