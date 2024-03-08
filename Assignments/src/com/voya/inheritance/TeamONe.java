package com.voya.inheritance;

public class TeamONe extends Project{

    String techStack;

    public TeamONe(String projectName, String domain, String projectManager, int duration) {
        super(projectName, domain, projectManager, duration);
    }

    String[] showTechStack(){
        return new String[]{"java","Spring"};
    }
}
