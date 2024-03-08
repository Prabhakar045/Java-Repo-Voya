package org.doctor.model.repository;

import org.doctor.model.client.User;
import org.doctor.model.model.Doctor;
import org.doctor.model.util.DoctorDb;
import org.doctor.model.util.Queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DoctorRepositoryImpl implements IDoctorRepository {


    @Override
    public void addDoctor(Doctor doctor) {
         //establish a connection - create statement - set values for placeholder - execute statement

        try(Connection connection = DoctorDb.openConnection();
            PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY);
        ){
            statement.setString(1,doctor.getDoctorName());
            statement.setString(2,doctor.getSpeciality());
            statement.setDouble(3,doctor.getFees());
            statement.setInt(4,doctor.getRatings());
            statement.setInt(5,doctor.getExperience());

            boolean result = statement.execute();
            System.out.println("One row inserted: "+ !result);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateDoctor(int doctorId, double fees) {

    }

    @Override
    public void deleteDoctor(int doctorId) {

    }

    @Override
    public Doctor findByID(int doctorId) {

        List<Doctor> doctorsList = new ArrayList<>();

        try(Connection connection = DoctorDb.openConnection();
            PreparedStatement statement = connection.prepareStatement(Queries.FINDBYIDQUERY);
            ResultSet resultset = statement.executeQuery();
        ){


            statement.setInt(1,doctorId);
            while(resultset.next()){


                String doctorName = resultset.getString("doctor_name");
                String speciality = resultset.getString("speciality");
                double fees = resultset.getDouble("fees");
                int ratings = resultset.getInt("ratings");
                int experience = resultset.getInt("experience");

                Doctor doctor = new Doctor(doctorName,speciality,fees,ratings,experience);
                doctorsList.add(doctor);

            }



        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Doctor> findAll() {
        List<Doctor> doctorsList = new ArrayList<>();

        try(Connection connection = DoctorDb.openConnection();
            PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY);
            ResultSet resultset = statement.executeQuery(Queries.FINDALLQUERY);
        ){



            while(resultset.next()){

                String doctorName = resultset.getString("doctor_name");
                String speciality = resultset.getString("speciality");
                double fees = resultset.getDouble("fees");
                int ratings = resultset.getInt("ratings");
                int experience = resultset.getInt("experience");

                Doctor doctor = new Doctor(doctorName,speciality,fees,ratings,experience);
                doctorsList.add(doctor);

            }



        }catch (Exception e){
            e.printStackTrace();
        }
        return doctorsList;
    }

    @Override
    public List<Doctor> findBySpeciality(String speciality) {

        List<Doctor> doctorsList = new ArrayList<>();

        try(Connection connection = DoctorDb.openConnection();
            PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECIALITY)){
                statement.setString(1,speciality);
            try(ResultSet resultset = statement.executeQuery();){
                while(resultset.next()){

                    String doctorName = resultset.getString("doctor_name");
                    int doctorId = resultset.getInt("doctor_id");
                    double fees = resultset.getDouble("fees");
                    int ratings = resultset.getInt("ratings");
                    int experience = resultset.getInt("experience");

                    Doctor doctor = new Doctor();

                    doctor.setDoctorName(doctorName);
                    doctor.setSpeciality(speciality);
                    doctor.setExperience(experience);
                    doctor.setRatings(ratings);
                    doctor.setFees(fees);
                    doctor.setDoctorId(doctorId);

                }
            }
            return null;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Doctor> findBySpecialityAndExperienxe(String speciality, int experience) {
        return null;
    }

    @Override
    public List<Doctor> findBySpecialityAndLeesFees(String speciality, int fees) {
        return null;
    }

    @Override
    public List<Doctor> findBySpecialityAndRatings(String speciality, int ratings) {
        return null;
    }

    @Override
    public List<Doctor> findBySpecialityAndNameContains(String speciality, String doctorName) {
        List<Doctor> doctorsList = new ArrayList<>();

        try(Connection connection = DoctorDb.openConnection();
            PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECIALITY)){
            statement.setString(1,speciality);
            statement.setString(2,"%"+doctorName +"%");
            try(ResultSet resultset = statement.executeQuery();){

                while(resultset.next()){


                    Doctor doctor = new Doctor();

                    doctor.setDoctorName(resultset.getString("doctor_name"));
                    doctor.setSpeciality(resultset.getString("speciality"));
                    doctor.setExperience(resultset.getInt("experience"));
                    doctor.setRatings(resultset.getInt("ratings"));
                    doctor.setFees(resultset.getDouble("fees"));
                    doctor.setDoctorId(resultset.getInt("doctor_id"));

                    doctorsList.add(doctor);

                }
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
       return doctorsList;
    }


}
