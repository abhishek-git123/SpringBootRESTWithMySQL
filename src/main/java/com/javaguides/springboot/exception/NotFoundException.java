package com.javaguides.springboot.exception;

public class NotFoundException extends Exception{
    public NotFoundException(String message){
        super(message);
    }
}
