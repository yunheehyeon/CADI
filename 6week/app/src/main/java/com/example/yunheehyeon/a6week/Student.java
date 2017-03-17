package com.example.yunheehyeon.a6week;

/**
 * Created by yunheehyeon on 2017-03-16.
 */

public class Student {
    private String name;
    private String stdnum;

    public Student(String name, String stdnum) {
        this.name = name;
        this.stdnum = stdnum;
    }

    public String getName() {
        return name;
    }

    public String getStdnum() {
        return stdnum;
    }
}
