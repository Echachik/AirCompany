package com.company.exceptions;

public class ListIsEmptyException {
    private String detail = "size of list is null";

    @Override
    public String toString() {
        return "ListIsEmptyException{" +
                "detail='" + detail + '\'' +
                '}';
    }
}
