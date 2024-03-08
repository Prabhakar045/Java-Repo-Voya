package com.voya.inheritance;

public class TeamTwo extends Project{

    String[] tools = {"Junit", "maven","Git","docker"};

    public TeamTwo(String projectName, String domain, String projectManager, int duration) {
        super(projectName, domain, projectManager, duration);
    }

    void showSupportTools(){
        for(String tool:tools){
            System.out.println(tool);
        }
    }
}
