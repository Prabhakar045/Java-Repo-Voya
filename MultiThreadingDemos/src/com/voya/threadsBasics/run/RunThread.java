package com.voya.threadsBasics.run;

import jdk.swing.interop.SwingInterOpUtils;

public class RunThread {

    public static void main(String[] args) {



        Greetings greetings = new Greetings();
        Runner runner1= new Runner("prabhakar",greetings);
        Runner runner2= new Runner("rahul",greetings);
        Runner runner3= new Runner("allwin",greetings);
        Runner runner4= new Runner("modi",greetings);




    }
}
