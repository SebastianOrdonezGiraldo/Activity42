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
        String rowReserve = JOptionPane.showInputDialog("Ingrese la fila del asiento que desea reservar:");
        String columnReserve = JOptionPane.showInputDialog("Ingrese la columna del asiento que desea reservar:");
        int rowReserveInt = Integer.parseInt(rowReserve);
        int columnReserveInt = Integer.parseInt(columnReserve);
        seatsToReserve.add(auditorium.getSeat(rowReserveInt, columnReserveInt));

        boolean book = funcion.reserveSeats(seatsToReserve);
        if (book){
            Book booked = new Book(client,movie,seatsToReserve);
            client.getBookingHistory().add(booked);
            JOptionPane.showMessageDialog(null,"Seats reserved successfully.");
        }else {
            JOptionPane.showMessageDialog(null,"Error reserving seats. Some seats are not available.");
        }

        List<Seat> seatsToBuy = new ArrayList<>();
        String rowBuy = JOptionPane.showInputDialog("Ingrese la fila del asiento que desea comprar:");
        String columnBuy = JOptionPane.showInputDialog("Ingrese la columna del asiento que desea comprar:");
        int rowBuyInt = Integer.parseInt(rowBuy);
        int columnBuyInt = Integer.parseInt(columnBuy);
        seatsToBuy.add(auditorium.getSeat(rowBuyInt, columnBuyInt));

        boolean bought = funcion.buyTickets(seatsToBuy);
        if (bought){
            JOptionPane.showMessageDialog(null,"Tickets bought successfully.");
        }else {
            JOptionPane.showMessageDialog(null,"Error buying tickets. Some seats are not reserved.");
        }
    }
}
