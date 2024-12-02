package com.example.textprocessingtool.services;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexService {
    public List<String> performRegexSearch(String text, String pattern) {
        List<String> matches = new ArrayList<>();
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(text);

        while (matcher.find()) {
            matches.add("Match: '" + matcher.group() + "' at index " + matcher.start());
        }
        return matches;
    }

    public String performRegexReplace(String text, String pattern, String replacement) {
        Pattern regex = Pattern.compile(pattern);
        return regex.matcher(text).replaceAll(replacement);
    }
}

