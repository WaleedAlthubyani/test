package com.example.project.api;

public class ApiException extends RuntimeException{

    public ApiException(String message){
        super(message);
    }
}
