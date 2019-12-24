package main.java.tasks;

import main.java.dogs.PackOfDogs;
import main.java.movies.MovieList;
import main.java.users.Filter;

public class ListOfTasks {
    public void displayResults(){
        PackOfDogs packOfDogs=new PackOfDogs();
        packOfDogs.sayWoof();
        Filter filter = new Filter();
        filter.sortUsers();
        MovieList movieList=new MovieList();
        movieList.averagePricePerGenre();
    }
}