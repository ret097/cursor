package main.java.exceptions;

public class ExceptionB extends ExceptionA {
    @Override
    public String getMessage() {
        return "ExceptionB has parent " + super.getMessage();
    }
}