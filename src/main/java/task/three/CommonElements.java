package main.java.task.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElements {
    List<String> listOne = new ArrayList<>(Arrays.asList("Chery", "Orange", "Grapefruit", "Apple", "Pineapple"));
    List<String> listTwo = new ArrayList<>(Arrays.asList("Orange", "Banana", "Grapefruit", "Apple", "Pineapple"));

    public void searchForCommonElements() {
        for (String element : listOne) {
            if (listTwo.contains(element)) {
                int some = listTwo.indexOf(element);
                System.out.println("Common elements are: "
                        + element
                        + " and "
                        + listTwo.get(some));
            }
        }
    }
}