package main.java.movies;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovieList {
    private List<Movie> listOne = new ArrayList<>();
    private List<Movie> listTwo = new ArrayList<>();

    public void addMovies() {
        Movie filmOne = new Movie("Drama", 50);
        Movie filmTwo = new Movie("Comedy", 65);
        Movie filmThree = new Movie("Horror", 70);
        Movie filmFour = new Movie("Drama", 65);
        Movie filmFive = new Movie("Comedy", 75);

        listOne.add(filmOne);
        listTwo.add(filmFour);
        listOne.add(filmTwo);
        listTwo.add(filmFive);
        listOne.add(filmThree);
    }

    public void averagePricePerGenre() {
        addMovies();
        List<Movie> allMovie = Stream.concat(listOne.stream(), listTwo.stream()).collect(Collectors.toList());
        Map<String, List<Movie>> groupByGenre = allMovie.stream()
                .collect(Collectors.groupingBy(Movie::getGenre));
        groupByGenre.forEach((key, value) -> {
            System.out.print("\nFilms genre: " + key + " Average price= ");
            System.out.println(value.stream()
                    .mapToDouble(Movie::getTicketPrice)
                    .average()
                    .toString());
            System.out.println("Amount: " + value.size());
        });
    }
}