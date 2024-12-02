package com.example.textprocessingtool.controllers;

import java.util.HashSet;
import java.util.Set;

public class DataController {
    private final Set<String> dataCollection = new HashSet<>();

    public void addData(String item) {
        dataCollection.add(item);
    }

    public void deleteData(String item) {
        dataCollection.remove(item);
    }

    public Set<String> getAllData() {
        return dataCollection;
    }
}

