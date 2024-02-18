package Ejercicio3;

import java.util.List;
import java.util.ArrayList;

public class Wagon {
    private String type;
    private int capacity;
    private final List<Seat> seatList = new ArrayList<>();


    public String obtenerTipo() { return this.type; }
    public int obtenerCapacidad() { return this.capacity; }
    public Seat obtenerAsiento(int number) {
        for (Seat seat : seatList) {
            if (seat.obtenerNumero() == number) {
                return seat;
            }
        }
        return null;
    }
}
