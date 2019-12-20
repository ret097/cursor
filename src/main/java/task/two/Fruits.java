package main.java.task.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Fruits {
    private List<String> list = new ArrayList<>(Arrays.asList("Orange", "Banana", "Grapefruit", "Apple", "Pineapple"));

    public void checkList() {
        String grapefruit = "Grapefruit";
        String orange = "Orange";
        if (!list.contains(grapefruit)) {
            if (list.contains(orange)) Collections.replaceAll(list, orange, grapefruit);
        }
    }

    public void print() {
        checkList();
        System.out.println(list);
    }
}