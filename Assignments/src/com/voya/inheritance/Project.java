package com.voya.inheritance;

public class Project {

    String projectName;
    String projectManager;
    String domain;

    int duration;
    public Project(String projectName, String domain, String projectManager, int duration) {
        this.projectName = projectName;
        this.domain = domain;
        this.projectManager = projectManager;
        this.duration=duration;
    }

    void showPorjectDetails(){

    }
}
