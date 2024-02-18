package Ejercicio2;

public class Client extends Person {
    private String bookingHistory;

    public Client(String name, int id, String address) {
        super(name, id, address);
    }

    public String getBookingHistory() {
        return bookingHistory;
    }
}
