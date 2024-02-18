package Ejercicio2;

import java.util.List;

public class Client extends Person {
    private List<Book> bookingHistory;

    public Client(String name,int id,String address){
        super(name,id,address);

    }

    public List<Book> getBookingHistory(){
        return bookingHistory;
    }
}
