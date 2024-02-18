package Ejercicio2;

public class Seat {
    private int row;
    private int column;
    private String status;

    public Seat(int row, int column) {
        this.row = row;
        this.column = column;
        this.status = "Available";
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public String getStatus() {
        return status;
    }

    public void book(){
        status = "occupied";
    }
    public void occupy(){
        status = "busy";
    }
}
