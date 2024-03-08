package org.doctor.model.service;

import org.doctor.model.exception.DoctorNotFoundException;
import org.doctor.model.model.Doctor;
import org.doctor.model.repository.DoctorRepositoryImpl;
import org.doctor.model.repository.IDoctorRepository;

import java.sql.Connection;
import java.util.Collections;
import java.util.List;

public class DoctorServiceImpl implements IDoctorService{



    private IDoctorRepository doctorRepository = new DoctorRepositoryImpl();

    @Override
    public void addDoctor(Doctor doctor) {
            doctorRepository.addDoctor(doctor);

    }

    @Override
    public void updateDoctor(int doctorId, double fees) {

    }

    @Override
    public void deleteDoctor(int doctorId) {

    }

    @Override
    public Doctor getByID(int doctorId) throws DoctorNotFoundException {

        Doctor doctorList =doctorRepository.findByID(doctorId);
        if(doctorList == null){
            throw new DoctorNotFoundException("doctor not found for this id");
        }
        return doctorList;
    }

    @Override
    public List<Doctor> getAll() throws DoctorNotFoundException {
        List<Doctor> doctorList =doctorRepository.findAll();
        if(doctorList == null){
            throw new DoctorNotFoundException("not found");
        }
        return doctorList;
    }

    @Override
    public List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException {
        List<Doctor> doctorList =doctorRepository.findBySpeciality(speciality);
        if(doctorList.isEmpty()){
            throw new DoctorNotFoundException("doctor not found ");
        }
        Collections.sort(doctorList,(d1, d2) -> d1.getDoctorName().compareTo(d2.getDoctorName()));
        return doctorList;
    }

    @Override
    public List<Doctor> getBySpecialityAndExperienxe(String speciality, int experience) throws DoctorNotFoundException {
        List<Doctor> doctorList =doctorRepository.findBySpecialityAndExperienxe(speciality,experience);
        if(doctorList.isEmpty()){
            throw new DoctorNotFoundException("doctor not found ");
        }
        Collections.sort(doctorList,(d1, d2) ->((Integer) d2.getExperience()).compareTo(d1.getExperience()));
        return doctorList;

    }

    @Override
    public List<Doctor> getBySpecialityAndLeesFees(String speciality, int fees) throws DoctorNotFoundException {
        List<Doctor> doctorList =doctorRepository.findBySpecialityAndLeesFees(speciality,fees);
        if(doctorList.isEmpty()){
            throw new DoctorNotFoundException("doctor not found ");
        }
        Collections.sort(doctorList,(d1, d2) ->((Double) d1.getFees()).compareTo(d1.getFees()));
        return doctorList;
    }



    @Override
    public List<Doctor> getBySpecialityAndRatings(String speciality, int ratings) throws DoctorNotFoundException {
        List<Doctor> doctorList =doctorRepository.findBySpecialityAndRatings(speciality,ratings);
        if(doctorList.isEmpty()){
            throw new DoctorNotFoundException("doctor not found ");
        }
        Collections.sort(doctorList,(d1, d2) ->((Integer) d1.getRatings()).compareTo(d2.getRatings()));
        return doctorList;
    }

    @Override
    public List<Doctor> getBySpecialityAndNameContains(String speciality, String doctorName) throws DoctorNotFoundException {
        List<Doctor> doctorList =doctorRepository.findBySpecialityAndNameContains(speciality,doctorName);
        if(doctorList.isEmpty()){
            throw new DoctorNotFoundException("doctor not found ");
        }
        Collections.sort(doctorList,(d1, d2) ->( d2.getDoctorName()).compareTo(d1.getDoctorName()));
        return doctorList;
    }
}
