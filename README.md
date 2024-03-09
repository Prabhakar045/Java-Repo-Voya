# Java-Repo-Voya

database table for this project 

create database  doctor_database;
use doctor_database;

CREATE TABLE doctor (
    doctor_id INT AUTO_INCREMENT PRIMARY KEY,
    doctor_name VARCHAR(55),
    speciality VARCHAR(55),
     experience INT,
     ratings INT,
    fees DOUBLE
    
);
