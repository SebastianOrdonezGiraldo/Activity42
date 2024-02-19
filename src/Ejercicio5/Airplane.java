package Ejercicio5;

import java.util.List;

public class Airplane {
    private String model;
    private int capacity;
    private List<Seat> seatList;

    public Airplane(String model, int capacity, List<Seat> seatList) {
        this.model = model;
        this.capacity = capacity;
        this.seatList = seatList;
    }

    public Seat obtenerAsiento(int number){
        return null;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }
}
