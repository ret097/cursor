package main.java;

import main.java.division.SafeDivision;
import main.java.exceptions.ExceptionThrower;

public class AppRunner {
    public void showResult(){
        SafeDivision safeDivision=new SafeDivision();
        safeDivision.getAnswer();
        ExceptionThrower exceptionThrower=new ExceptionThrower();
        exceptionThrower.showMessage();
    }
}