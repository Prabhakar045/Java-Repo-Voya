package com.voya.inheritance;

public class FInMain {

    public static void main(String[] args) {

        TeamONe teamONe = new TeamONe("policyBazar","raju","Banking",8);

        String[] techStack=teamONe.showTechStack();
        for(String tech:techStack){
            System.out.println(tech);
        }

        TeamTwo teamTwo = new TeamTwo("GamingApp","rahul","Gaming",8);
        teamTwo.showSupportTools();
    }

}
