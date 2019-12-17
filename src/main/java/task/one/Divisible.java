package main.java.task.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Divisible {
    private List<Integer> list = new ArrayList<>(Arrays.asList(3, 9, 11, 18, 20, 22));

    public void remove() {
        for (int start = 0; start < list.size(); start++) {
            if (list.get(start) % 3 == 0) {
                list.remove(start);
                start--;
            }
        }
    }

    public void print() {
        remove();
        System.out.println(list);
    }
}