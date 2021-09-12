package com.example.birdspeciescheckerapp;

import android.graphics.Picture;

public class PictureRequest {
    private Picture picture;

    public PictureRequest(Picture picture) {
        this.picture = picture;
    }

    public PictureRequest() {
    }

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }
}
