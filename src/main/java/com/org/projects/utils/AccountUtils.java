package com.org.projects.utils;

import java.time.Year;

public class AccountUtils {

    //response code and response messages
    public static final String ACCOUNT_EXISTS_CODE = "001";
    public static final String ACCOUNT_EXISTS_MESSAGE = "This user already has an account created";

    public static final String ACCOUNT_CREATION_SUCCESS = "002";
    public static final String ACCOUNT_CREATION_MESSAGE = "Account has been successfully created";

    public static final String ACCOUNT_NOT_EXIST_CODE = "003";
    public static final String ACCOUNT_NOT_EXIST_MESSAGE = "User with provided account Number does not exists";

    public static final String ACCOUNT_FOUND_CODE= "004";
    public static final String ACCOUNT_FOUND_SUCCESS= "User Account Found";

    public static final String ACCOUNT_CREDITED_SUCCESS = "005";
    public static final String ACCOUNT_CREDITED_SUCCESS_MESSAGE = "User Account is credited successfully";

    public static final String INSUFFICIENT_BALANCE_CODE = "006";
    public static final String INSUFFICIENT_BALANCE_MESSAGE = "Insufficient Balance";


    public static final String ACCOUNT_DEBITED_SUCCESS = "007";
    public static final String ACCOUNT_DEBITED_SUCCESS_MESSAGE = "User Account is debited successfully";

    public static final String TRANSFER_SUCCESSFUL_CODE = "008";
    public static final String TRANSFER_SUCCESSFUL_MESSAGE = "Transfer Successful";


    public static String generateAccountNumber() {

        /*
         * 10 digit acc number format-> currentYear(ex:2025) +(concat) randomsixdigits
         */
        Year currentYear = Year.now();

        //min- minSixdigitNo, max- maxSixdigitNo
        int min = 100000;
        int max = 999999;

        //generate a random number.   Math.random()- generates bw 0 and 9
        int randNumber = (int) Math.floor(Math.random() * (max - min +1) + min);

        //convert the currentYear and randomnumber into strings and then concatenate
        String year = String.valueOf(currentYear);
        String randomNumber = String.valueOf(randNumber);

        return year + randomNumber;
    }


}
