package com.example.birdspeciescheckerapp;

import com.google.gson.annotations.SerializedName;

public class RecognitionResponse {
    @SerializedName("class_id")
    private String id;
    @SerializedName("class_name")
    private String name;

    public RecognitionResponse(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public RecognitionResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
