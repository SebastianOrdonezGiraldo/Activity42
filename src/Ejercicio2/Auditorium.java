package Ejercicio2;

import java.util.List;

public class Auditorium {
    private int number;
    private int capacity;
    private List<Seat> seatList;

    public Auditorium(int number, int capacity, List<Seat> seatList) {
        this.number = number;
        this.capacity = capacity;
        this.seatList = seatList;
    }

    public int getNumber() {
        return number;
    }

    public int getCapacity() {
        return capacity;
    }
    public Seat getSeat(int row,int column){
        return null;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }
}
