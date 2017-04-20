package com.venomeye.icmsbulgaria.Utilities.ParseUtil;

import com.parse.ParseClassName;

import com.parse.ParseFile;

import com.parse.ParseObject;

@ParseClassName("News")

public class ParseNews extends ParseObject {

    public String getTitle() {
        return getString("title");
    }

    public String getContent() {
        return getString("content");
    }

    public ParseFile getImage() {
        return getParseFile("image");
    }
}
