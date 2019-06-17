package com.company.exceptions;

public class NegativeParameterException extends Exception {

    private String detail = "parameter cannot be negative";
    @Override
    public String toString() {
        return "NegativeParameterException{" +
                "detail='" + detail + '\'' +
                '}';
    }
}
