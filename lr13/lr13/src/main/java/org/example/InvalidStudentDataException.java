package org.example;

public class InvalidStudentDataException extends RuntimeException{
    public InvalidStudentDataException(String message){
        super(message);
    }
}
