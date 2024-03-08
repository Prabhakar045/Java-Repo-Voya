package com.voya.voterApp.service;

import com.voya.voterApp.exception.InvalidVoterIdException;
import com.voya.voterApp.exception.LocalityNotFoundException;
import com.voya.voterApp.exception.UnderAgeException;

public interface IElectionBoothService {
    boolean checkEligibility(int age, String locality, int voterId) throws UnderAgeException, LocalityNotFoundException, InvalidVoterIdException;
}
