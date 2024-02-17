package Ejercicio4;

public class Producto1 {
    private String nombre;
    private String descripcion;
    private int price;
    private int stock;

    public Producto1(String nombre, String descripcion, int price, int stock) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.price = price;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto 1" +
                " nombre:" + nombre +
                ", descripcion:" + descripcion +
                ", price:" + price +
                ", stock:" + stock ;
    }
}