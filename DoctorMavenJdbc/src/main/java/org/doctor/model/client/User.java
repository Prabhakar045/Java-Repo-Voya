package org.doctor.model.client;

import org.doctor.model.exception.DoctorNotFoundException;
import org.doctor.model.exception.IdNotFoundException;
import org.doctor.model.model.Doctor;
import org.doctor.model.model.Specialization;
import org.doctor.model.service.DoctorServiceImpl;
import org.doctor.model.service.IDoctorService;

import java.util.List;
import java.util.Scanner;

public class User {

    public static void main(String[] args) throws DoctorNotFoundException {


        IDoctorService doctorService = new DoctorServiceImpl();
        Specialization specialization = Specialization.NEURO;
        String speciality = specialization.getSpeciality();

        /*
//        String special = Specialization.DENTIST.getSpeciality();
        Doctor doctor = new Doctor("Allwin",speciality,1000.00,4,2);
        Doctor doctor2 = new Doctor("Farhan",speciality,1200.00,4,3);
        doctorService.addDoctor(doctor2);



        //get All
        try {
            List<Doctor> doctors=  doctorService.getAll();
            for(Doctor doctor : doctors){
                System.out.println(doctor);
            }
        } catch (DoctorNotFoundException e) {
            System.out.println(e.getMessage());
        }

         */

        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();

        try {
            Doctor doctor = doctorService.getByID(id);
        } catch (IdNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
