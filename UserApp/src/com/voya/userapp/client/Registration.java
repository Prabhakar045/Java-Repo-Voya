package com.voya.userapp.client;

import com.voya.userapp.exception.NameExistException;
import com.voya.userapp.exception.TooLongException;
import com.voya.userapp.exception.TooShortException;
import com.voya.userapp.service.ValidationServiceImpl;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) throws NameExistException, TooShortException, TooLongException {

        ValidationServiceImpl validation = new ValidationServiceImpl();
       // validation.validateUserName("Prabhakar");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String password = sc.nextLine();

        if(password.length() < 4){
            throw new TooShortException("too short");
        } else if (password.length() >12) {
            throw  new TooLongException("too long");
        }
    }
}
