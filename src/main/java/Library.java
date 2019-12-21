package main.java;

import java.time.LocalDate;

public class Library {
    public void print() {
        Implement implement = new Implement();

        implement.put(LocalDate.of(2019, 4, 20), "The Witcher");
        implement.put(LocalDate.of(2019, 3, 1), "The Hobbit");
        implement.put(LocalDate.of(2020, 11, 15), "The Coming Storm");
        implement.put(LocalDate.of(2020, 8, 12), "Game of Thrones");

        implement.getDate(LocalDate.of(2019, 5, 13));
        implement.getDate(LocalDate.of(2020, 11, 15));
        implement.getDate(LocalDate.of(2020, 8, 1));
        implement.getDate(LocalDate.of(2019, 3, 1));

        implement.lookDates();
        implement.lookBookNames();

    }
}