package com.voya.interfaceProject.lamdaExpression;

public class CourseLamdaMain {

    public static void main(String[] args) {

        ICourse iCourse = () -> {
          String[] webCourse = {"array", "html", "css"};

            return webCourse;

        };
       String[] web = iCourse.showCourse();
       for(String webCourses : web){
           System.out.println("Web courses: "+webCourses);
       }

        ICourse iCourse1 = () -> {
            String[] cloud = {"aws", "google cloud", "azure"};
            return cloud;
        };
         String[] cloud1=  iCourse1.showCourse();
         for (String cloud:cloud1){
             System.out.println(cloud);
         }

        ICourse iCourse2 = () -> {
            String[] fullsatck = {"java", "spring", "jUnit"};
            return fullsatck;
        };
        String[] fullstack1 =  iCourse1.showCourse();
        for (String fullstack:fullstack1){
            System.out.println(fullstack);
        }




    }
}
