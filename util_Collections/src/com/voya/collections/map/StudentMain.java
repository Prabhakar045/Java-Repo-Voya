package com.voya.collections.map;

import java.util.*;

public class StudentMain {

    public static void main(String[] args) {
        Map<Department, List<Student>>  map = new LinkedHashMap<>();
        Department department1 = new Department("cse",101,"rahul");
        Department department2 = new Department("ise",102,"madan");
        Department department3 = new Department("ece",103,"kl");
        Department department4 = new Department("eee",104,"rahul");

        map.put(department1,Arrays.asList( new Student("pbk","bengaluru")));
        map.put(department2,Arrays.asList( new Student("allwin","mysore")));
        map.put(department3,Arrays.asList( new Student("manij","klw")));
        map.put(department4,Arrays.asList( new Student("darya","dadar")));

        Set<Map.Entry<Department,List<Student>>> entities = map.entrySet();

        Set<Department> departments = map.keySet();
        for(Department dept:departments){
            System.out.println(dept.getDeptHead()+""+dept.getDeptName());
            List<Student> students = map.get(departments);

            for(Student std: students){
                System.out.println(std.getStdName());
            }
        }
    }
}
