package org.doctor.model.service;

import org.doctor.model.exception.DoctorNotFoundException;
import org.doctor.model.exception.IdNotFoundException;
import org.doctor.model.model.Doctor;

import java.util.List;

public interface IDoctorService {

    void addDoctor(Doctor doctor) throws DoctorNotFoundException;
    void updateDoctor(int doctorId, double fees) throws DoctorNotFoundException;
    void deleteDoctor(int doctorId) throws DoctorNotFoundException;
    Doctor getByID(int doctorId) throws IdNotFoundException, DoctorNotFoundException;
    List<Doctor> getAll() throws DoctorNotFoundException;
    List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException;
    List<Doctor> getBySpecialityAndExperienxe(String speciality, int experience) throws DoctorNotFoundException;
    List<Doctor> getBySpecialityAndLeesFees(String speciality, int fees) throws DoctorNotFoundException;
    List<Doctor> getBySpecialityAndRatings(String speciality, int ratings) throws DoctorNotFoundException;
    List<Doctor> getBySpecialityAndNameContains(String speciality, String doctorName) throws DoctorNotFoundException;
}
