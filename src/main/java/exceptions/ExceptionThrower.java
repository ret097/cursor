package main.java.exceptions;

import java.io.IOException;

public class ExceptionThrower {
    public void showMessage() {
        try {
            throw new ExceptionA();
        } catch (ExceptionA a) {
            System.out.println(a.getMessage());
        }

        try {
            throw new ExceptionB();
        } catch (ExceptionB b) {
            System.out.println(b.getMessage());
        }

        try {
            throw new IOException();
        } catch (IOException i) {
            System.out.println("Caught some IOException");
        }

        try {
            throw new NullPointerException();
        } catch (NullPointerException n) {
            System.out.println("Caught some NullPointerException");
        }
    }
}