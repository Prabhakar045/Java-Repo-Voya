package com.voya.voterApp.client;

import com.voya.voterApp.exception.InvalidVoterIdException;
import com.voya.voterApp.exception.LocalityNotFoundException;
import com.voya.voterApp.exception.NotEligibleException;
import com.voya.voterApp.exception.UnderAgeException;
import com.voya.voterApp.service.ElectionBoothServiceImpl;
import com.voya.voterApp.service.IElectionBoothService;

import java.util.Scanner;

public class Voter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IElectionBoothService election = new ElectionBoothServiceImpl();

        System.out.println("Enter age: ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter locality: ");
        String locality = sc.nextLine();

        System.out.println("Enter voter id: ");
        int voterId = sc.nextInt();


        try {
            election.checkEligibility(age, locality, voterId);
            System.out.println("You are eligible to vote");
        } catch (UnderAgeException e) {
            throw new RuntimeException(e);

        } catch (LocalityNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InvalidVoterIdException e) {
            throw new RuntimeException(e);
        }
        System.out.println("not eligible");

    }


}
