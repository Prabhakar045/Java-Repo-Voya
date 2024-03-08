package org.doctor.model.util;

public class Queries {

    public static final String INSERTQUERY ="insert into doctors(doctor_name, speciality,fees,ratings,experience) values(?,?,?,?,?)";

    public static final String UPDATEQUERY = "update doctors set fees=? where doctor_id=?";

    public static final String DELETEQUERY = "delete from doctors where doctor_id=?";

    public static final String FINDALLQUERY = "select * from doctors";

    public static final String FINDBYSPECIALITY = "select * from doctors where speciality";

    public static final String FINDBYSPECIALITYANDEXPERIENCE = "select * from doctors where speciality=? AND experience >= ?";

    public static final String FINDBYSPECIALITYANDRATINGS = "select * from doctors where speciality=? AND ratings >= ?";

    public static final String FINDBYSPECIALITYANDFEES = "select * from doctors where speciality=? AND fees <= ?";

    public static final String FINDBYSPECIALITYANDNAME = "select * from doctors where speciality=? AND doctor_name like ?";

    public static final String FINDBYIDQUERY = "select * from doctors where doctor_id=?";
/*
    create table doctors(
            doctor_id int primary key auto_increment,
            doctor_name varchar(30),
    speciality varchar(30),
    fees float,
    ratings int,
    experience int
);


 */
}
