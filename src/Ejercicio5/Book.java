package Ejercicio5;

public class Book {
    private Passenger passenger;
    private Flight flight;
    private Seat seat;

    public Book(Passenger passenger, Flight flight, Seat seat) {
        this.passenger = passenger;
        this.flight = flight;
        this.seat = seat;
    }



    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Book:" +
                "passenger=" + passenger +
                ", flight=" + flight +
                ", seat=" + seat ;
    }
}



