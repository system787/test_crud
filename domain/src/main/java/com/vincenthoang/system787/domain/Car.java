package com.vincenthoang.system787.domain;

public class Car {
    String mMake;
    String mModel;
    String mColor;
    int mYear;
    int mId;

    public Car(String make, String model, String color, int year, int id) {
        mMake = make;
        mModel = model;
        mColor = color;
        mYear = year;
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

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }
}
