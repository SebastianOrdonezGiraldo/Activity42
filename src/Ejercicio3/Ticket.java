package Ejercicio3;

public class Ticket {
    private Client client;
    private Trip trip;
    private Seat seat;

    // Methods
    public Client obtenerCliente() { return this.client; }
    public Trip obtenerViaje() { return this.trip; }
    public Seat obtenerAsiento() { return this.seat; }
}
