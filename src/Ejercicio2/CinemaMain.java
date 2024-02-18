package Ejercicio2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CinemaMain {
    public static void main(String[] args) {
        List<Seat> seatList = new ArrayList<>();
        for (int i = 1; i <=10; i++){
            for (int j = 1; j <=10; j++){
                seatList.add(new Seat(i,j));
            }

        }
        Auditorium auditorium = new Auditorium(1,100,seatList);

        Movie movie = new Movie("Los pitufos");
        Funcion funcion = new Funcion(movie,"18:00",auditorium,10000);

        Client client = new Client("Arle",1092850181,"Cr 18 # 70,20");

        List<Seat> seatsToReserve = new ArrayList<>();
        seatsToReserve.add(auditorium.getSeat(1,1));
        seatsToReserve.add(auditorium.getSeat(3,1));
        boolean book = funcion.reserveSeats(seatsToReserve);
        if (book){
            Book booked = new Book(client,movie,seatsToReserve);
            client.getBookingHistory().add(booked);
            JOptionPane.showMessageDialog(null,"Seats reserved successfully.");
        }else {
            JOptionPane.showMessageDialog(null,"Error reserving seats. Some seats are not available.");
        }
        List<Seat> seatsToBuy = new ArrayList<>();
        seatsToBuy.add(auditorium.getSeat(2,4));
        seatsToBuy.add(auditorium.getSeat(4,12));
        boolean bought = funcion.buyTickets(seatsToBuy);
        if (bought){
            JOptionPane.showMessageDialog(null,"Tickets bought successfully.");
        }else {
            JOptionPane.showMessageDialog(null,"Error buying tickets. Some seats are not reserved.");
        }
    }
}
