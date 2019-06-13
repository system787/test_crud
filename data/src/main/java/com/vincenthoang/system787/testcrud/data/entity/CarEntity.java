package com.vincenthoang.system787.testcrud.data.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Car Entity used in the data layer
 */
public class CarEntity {

    @SerializedName("id")
    private int mId;

    @SerializedName("make")
    private String mMake;

    @SerializedName("model")
    private String mModel;

    @SerializedName("color")
    private String mColor;

    @SerializedName("year")
    private int mYear;

    public CarEntity() {
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getMake() {
        return mMake;
    }

    public void setMake(String make) {
        mMake = make;
    }

    public String getModel() {
        return mModel;
    }

    public void setModel(String model) {
        mModel = model;
    }

    public String getColor() {
        return mColor;
    }

    public void setColor(String color) {
        mColor = color;
    }

    public int getYear() {
        return mYear;
    }

    public void setYear(int year) {
        mYear = year;
    }
}
