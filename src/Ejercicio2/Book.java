package Ejercicio2;

import java.util.List;

public class Book {
    private Client client;
    private Movie movie;
    private List<Seat> seatList;

    public Book(Client client, Movie movie, List<Seat> seatList) {
        this.client = client;
        this.movie = movie;
        this.seatList = seatList;
    }

    public Client getClient() {
        return client;
    }

    public Movie getMovie() {
        return movie;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }
}
