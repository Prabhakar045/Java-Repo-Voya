package com.voya.userapp.service;

import com.voya.userapp.exception.NameExistException;
import com.voya.userapp.exception.TooLongException;
import com.voya.userapp.exception.TooShortException;

public interface IValidationService {

    boolean validatePassword(String password) throws TooLongException, TooShortException;

    boolean validateUserName(String userName) throws NameExistException;
}
