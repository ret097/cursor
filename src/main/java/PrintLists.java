package main.java;

import main.java.task.one.Divisible;
import main.java.task.three.CommonElements;
import main.java.task.two.Fruits;

public class PrintLists {
    public void printAll(){
        Divisible divisible = new Divisible();
        Fruits fruits = new Fruits();
        CommonElements commonElements = new CommonElements();
        commonElements.searchForCommonElements();
        fruits.print();
        divisible.remove();
        divisible.print();
    }
}
