package com.example.textprocessingtool.models;

import java.util.Objects;

public class DataModel {
    private String key;
    private String value;

    public DataModel(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataModel dataModel = (DataModel) o;
        return Objects.equals(key, dataModel.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }
}



