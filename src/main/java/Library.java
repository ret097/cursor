package main.java;

import java.time.LocalDate;

public class Library {
    public void print() {
        LibraryReport libraryReport = new LibraryReport();

        libraryReport.put(LocalDate.of(2019, 4, 20), "The Witcher");
        libraryReport.put(LocalDate.of(2019, 3, 1), "The Hobbit");
        libraryReport.put(LocalDate.of(2020, 11, 15), "The Coming Storm");
        libraryReport.put(LocalDate.of(2020, 8, 12), "Game of Thrones");

        libraryReport.printBookNameByDate(LocalDate.of(2019, 5, 13));
        libraryReport.printBookNameByDate(LocalDate.of(2020, 11, 15));
        libraryReport.printBookNameByDate(LocalDate.of(2020, 8, 1));
        libraryReport.printBookNameByDate(LocalDate.of(2019, 3, 1));

        libraryReport.lookDates();
        libraryReport.lookBookNames();

    }
}