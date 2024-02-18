package Ejercicio3;

public class Seat {
    private int number;
    private String state;


    public int obtenerNumero() { return this.number; }
    public String obtenerEstado() { return this.state; }
    public void reservar() { this.state = "reservado"; }
    public void ocupar() { this.state = "ocupado"; }
}
