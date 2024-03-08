package com.voya.voterApp.service;

import com.voya.voterApp.exception.InvalidVoterIdException;
import com.voya.voterApp.exception.LocalityNotFoundException;
import com.voya.voterApp.exception.UnderAgeException;

public class ElectionBoothServiceImpl implements IElectionBoothService {
    @Override
    public boolean checkEligibility(int age, String locality, int voterId) throws UnderAgeException, LocalityNotFoundException, InvalidVoterIdException {
        checkAge(age);
        checkLocality(locality);
        checkVoterId(voterId);
        return false;
    }

    private void checkAge(int age) throws UnderAgeException {
        if(age<18){
            throw new UnderAgeException("Age should be greater than 18");
        }
    }

    private void checkLocality(String locality) throws LocalityNotFoundException {
        String[] localities ={"Rajajinagara","Laggere","Whitefield"};
        boolean found = false;

        for(String location : localities){
            if(location.equals(locality)){
                found=true;
                break;
            }
            if(!found){
                throw new LocalityNotFoundException("location not found");
            }
        }
    }

    private void checkVoterId(int voterId) throws InvalidVoterIdException {
        if(voterId<0)
          throw new InvalidVoterIdException("voter id not found");
    }
}
