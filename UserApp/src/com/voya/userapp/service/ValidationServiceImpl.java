package com.voya.userapp.service;

import com.voya.userapp.exception.NameExistException;

public class ValidationServiceImpl implements IValidationService{

    @Override
    public boolean validatePassword(String password) {

        System.out.println(password);
        return false;
    }

    @Override
    public boolean validateUserName(String userName) throws NameExistException {
        String[] userNames = {"Prabhakar","Allwin","Aryan","Farhan"};

        for (String user:userNames){
            if (userName.equals(user)){
                throw new NameExistException("name already exist");
            }

        }

        return false;
    }
}
