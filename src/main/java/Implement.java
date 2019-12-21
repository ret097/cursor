package main.java;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Implement {
    private Map<LocalDate, String> listLibrary = new HashMap<>();

    public void put(LocalDate date, String book) {
        listLibrary.put(date, book);
    }

    public void getDate(LocalDate date) {
        String same = listLibrary.get(date);
        if (same != null) {
            System.out.println(same);
        } else {
            System.out.println("Newer book");
        }
    }

    public void lookDates() {
        System.out.println("Written dates in the Library");
        for (LocalDate date : listLibrary.keySet()) {
            System.out.println(date);
        }

    }

    public void lookBookNames() {
        System.out.println("Written book names in the Library");
        for (String name : listLibrary.values()) {
            System.out.println(name);
        }
    }
}