package Ejercicio2;

import java.util.List;

public class Funcion {
    private Movie movie;
    private String startTime;
    private Auditorium auditorium;
    private double ticketCost;

    public Funcion(Movie movie, String  startTime, Auditorium auditorium, double ticketCost) {
        this.movie = movie;
        this.startTime = startTime;
        this.auditorium = auditorium;
        this.ticketCost = ticketCost;
    }

    public boolean reserveSeats(List<Seat> seats) {
        for (Seat seat : seats) {
            if (seat == null || !seat.getStatus().equals("available")) {
                return false;
            }
        }
        for (Seat seat : seats){
            seat.book();
        }
        return true;
    }
    public boolean buyTickets(List<Seat>seats){
        for (Seat seat : seats){
            if (seat == null || !seat.getStatus().equals("Reserved")){
                return false;
            }
        }
        for (Seat seat : seats){
            seat.occupy();
        }
        return true;
    }
}
