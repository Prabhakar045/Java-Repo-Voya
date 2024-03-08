package org.doctor.model.repository;

import org.doctor.model.model.Doctor;

import java.util.List;

public interface IDoctorRepository {

    void addDoctor(Doctor doctor);
    void updateDoctor(int doctorId, double fees);
    void deleteDoctor(int doctorId);
    Doctor findByID(int doctorId);
    List<Doctor> findAll();
    List<Doctor> findBySpeciality(String speciality);
    List<Doctor> findBySpecialityAndExperienxe(String speciality, int experience);
    List<Doctor> findBySpecialityAndLeesFees(String speciality, int fees);
    List<Doctor> findBySpecialityAndRatings(String speciality, int ratings);
    List<Doctor> findBySpecialityAndNameContains(String speciality, String doctorName);
}
