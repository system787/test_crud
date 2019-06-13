package com.vincenthoang.system787.testcrud.data.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Person entity for objects used in data layer
 */
public class PersonEntity {

    @SerializedName("id")
    private int mId;

    @SerializedName("name")
    private String mName;

    @SerializedName("age")
    private int mAge;

    public PersonEntity() {
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getAge() {
        return mAge;
    }

    public void setAge(int age) {
        mAge = age;
    }
}
