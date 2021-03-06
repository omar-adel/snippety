package com.fueled.snippety.sample.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Copyright (c) 2017 Fueled. All rights reserved.
 *
 * @author chetansachdeva on 02/05/17
 */

public class TextItem {

    public static final String NUMBERS = "numbers";
    public static final String BULLETS = "bullets";
    public static final String TEXT = "text";

    @SerializedName("type") public String type;
    @SerializedName("text") public String text;
    @SerializedName("list") public List<String> list;

    public boolean isNumbers() {
        return NUMBERS.equals(type);
    }

    public boolean isBullets() {
        return BULLETS.equals(type);
    }

    public boolean isText() {
        return TEXT.equals(type);
    }
}
