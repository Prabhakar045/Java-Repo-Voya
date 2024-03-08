package com.voya.collections.map;

public class Student {

    private String stdName;
    private String city;

    public Student() {
    }

    public Student(String stdName, String city) {
        this.stdName = stdName;
        this.city = city;
    }

    public String getStdName() {
        return stdName;
    }

    public String getCity() {
        return city;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdName='" + stdName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
