package com.example.textprocessingtool;


import com.example.textprocessingtool.services.RegexService;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.List;

public class TextController {
    private final RegexService regexService = new RegexService();

    @FXML
    private TextArea textInput;

    @FXML
    private TextField regexInput;

    @FXML
    private TextField replacementInput;

    @FXML
    private TextArea resultsOutput;

    @FXML
    public void searchInText() {
        String text = textInput.getText();
        String pattern = regexInput.getText();
        List<String> matches = regexService.performRegexSearch(text, pattern);
        resultsOutput.setText(String.join("\n", matches));
    }

    @FXML
    public void replaceInText() {
        String text = textInput.getText();
        String pattern = regexInput.getText();
        String replacement = replacementInput.getText();
        String replacedText = regexService.performRegexReplace(text, pattern, replacement);
        resultsOutput.setText(replacedText);
    }
}

