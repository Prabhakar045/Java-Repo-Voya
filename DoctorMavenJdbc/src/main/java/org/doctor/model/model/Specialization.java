package org.doctor.model.model;

public enum Specialization {



    ORTHO("ORTHOPEDICIAN"),
    PEDIA("PEDIATRICAIN"),
    DENTIST("GYNAECOLIST"),
    PHYSICIAN("GeNERAL PHYSICIAN"),
    NEURO("NEUROLOGIST"),
    DERMA("DERMALOGIST");

    private String speciality;
    Specialization(String speciality){
        this.speciality=speciality;
    }

    public String getSpeciality(){
        return speciality;
    }
}
