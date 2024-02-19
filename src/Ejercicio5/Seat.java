package Ejercicio5;

public class Seat {
    private int number;
    private String clase;
    private String status;


    public Seat(int number, String clase, String status) {
        this.number = number;
        this.clase = clase;
        this.status = status;
    }

    public void reservar(){
    status = "reservado";
}

public void ocupar(){
    status = "ocupado";
}

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
