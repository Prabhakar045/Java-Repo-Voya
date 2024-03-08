package com.voya.threadsBasics.serialization;

import java.io.Serializable;

public class Student implements Serializable {

    private  static long serialVersionUID = 2L;
     private  String stdName;
    private  int id;
    private transient String dept;

    public Student(String stdName, int id, String dept) {
        this.stdName = stdName;
        this.id = id;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdName='" + stdName + '\'' +
                ", id=" + id +
                ", dept='" + dept + '\'' +
                '}';
    }

    public Student() {
    }

    public String getStdName() {
        return stdName;
    }

    public int getId() {
        return id;
    }

    public String getDept() {
        return dept;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
