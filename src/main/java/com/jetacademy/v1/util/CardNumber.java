package com.jetacademy.v1.util;

import java.security.SecureRandom;

public class CardNumber {
    public static String cardNumber(){
        SecureRandom random= new SecureRandom();
        Long num= random.nextLong(1000000000000000L,9999999999999999L);
        return String.valueOf(num);
    }
}
