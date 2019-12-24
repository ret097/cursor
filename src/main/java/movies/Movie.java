package main.java.movies;

public class Movie {
    private String genre;
    double ticketPrice;

    public Movie(String genre, double ticketPrice) {
        this.genre = genre;
        this.ticketPrice = ticketPrice;
    }

    public String getGenre() {
        return genre;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }
}