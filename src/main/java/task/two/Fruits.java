package main.java.task.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fruits {
    List<String> list = new ArrayList<>(Arrays.asList("Orange", "Banana", "Grapefruit", "Apple", "Pineapple"));

    public void checkList() {
        String orange = "Orange";
        int same = list.indexOf(orange);
        if (list.contains(orange)) list.set(same, "Grapefruit");
    }

    public void print() {
        checkList();
        System.out.println(list);
    }
}