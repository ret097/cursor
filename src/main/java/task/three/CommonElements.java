package main.java.task.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElements {
    private List<String> listOne = new ArrayList<>(Arrays.asList("Chery", "Orange", "Pineapple", "Apple", "Grapefruit"));
    private List<String> listTwo = new ArrayList<>(Arrays.asList("Orange", "Banana", "Blueberry", "Tangerine", "Pineapple"));

    public void searchForCommonElements() {
        System.out.println("Common elements are: ");
        for (String element : listOne) {
            if (listTwo.contains(element)) {
                int some = listTwo.indexOf(element);
                System.out.println(element
                        + " and "
                        + listTwo.get(some));
            }
        }
    }
}