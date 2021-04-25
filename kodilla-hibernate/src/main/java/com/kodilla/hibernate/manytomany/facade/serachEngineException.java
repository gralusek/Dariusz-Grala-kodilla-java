package com.kodilla.hibernate.manytomany.facade;

public class serachEngineException extends Exception{

    public static String ERR_COMPANY_NOT_FOUND = "Company with given name was not found";
    public static String ERR_EMPLOYEE_NOT_FOUND = "Employee with given name was not found";


    public serachEngineException(String message) {
        super(message);
    }
}
