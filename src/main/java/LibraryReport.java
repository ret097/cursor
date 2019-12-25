package main.java;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class LibraryReport {
    private Map<LocalDate, String> dateToBookName = new HashMap<>();

    public void put(LocalDate date, String book) {
        dateToBookName.put(date, book);
    }

    public void printBookNameByDate(LocalDate date) {
        String bookName = dateToBookName.get(date);
        if (bookName != null) {
            System.out.println(bookName);
        } else {
            System.out.println("Newer book");
        }
    }

    public void lookDates() {
        System.out.println("Written dates in the Library");
        for (LocalDate date : dateToBookName.keySet()) {
            System.out.println(date);
        }

    }

    public void lookBookNames() {
        System.out.println("Written book names in the Library");
        for (String name : dateToBookName.values()) {
            System.out.println(name);
        }
    }
}