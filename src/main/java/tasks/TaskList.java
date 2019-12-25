package main.java.tasks;

import main.java.dogs.Pack;
import main.java.movies.MovieList;
import main.java.users.Filter;

public class TaskList {
    public void displayResults(){
        Pack packOfDogs=new Pack();
        packOfDogs.sayWoof();
        Filter filter = new Filter();
        filter.sortUsers();
        MovieList movieList=new MovieList();
        movieList.averagePricePerGenre();
    }
}