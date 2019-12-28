package main.java.division;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeDivision {
    Scanner scanner = new Scanner(System.in);
    private int a;
    private int b;
    private int value;

    public int scan() {
        value = scanner.nextInt();
        return value;
    }

    public void division() {
        value = a / b;
        System.out.println("Answer:" + value);
    }

    public void getAnswer() {
        System.out.println("Set two numbers");

        try {
            getA();
            getB();
            division();
        } catch (ArithmeticException a) {
            System.out.println("Error: there are no zero actions"
                    + "please repeat the value again");
            getB();
            division();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
    }

    public void getA() {
        this.a = scan();
    }

    public void getB() {
        this.b = scan();
    }
}