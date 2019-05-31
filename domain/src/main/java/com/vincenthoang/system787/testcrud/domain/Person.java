package com.vincenthoang.system787.testcrud.domain;

public class Person {
    String mName;
    int mId;
    int mAge;

    public Person(int id) {
        mId = id;
    }

    public Person(String name, int id, int age) {
        mName = name;
        mId = id;
        mAge = age;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public int getAge() {
        return mAge;
    }

    public void setAge(int age) {
        mAge = age;
    }
}
