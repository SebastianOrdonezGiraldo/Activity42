package Ejercicio5;

import java.util.List;

public class Passenger extends Person{
    private List<Book>bookingHistory;
    public Passenger(String name, int id, String contactInformation) {
        super(name, id, contactInformation);
    }


    public Passenger(String name, int id, String contactInformation, List<Book> bookingHistory) {
        super(name, id, contactInformation);
        this.bookingHistory = bookingHistory;
    }

    public List<Book> getBookingHistory() {
        return bookingHistory;
    }

    public void setBookingHistory(List<Book> bookingHistory) {
        this.bookingHistory = bookingHistory;
    }
}
