package Ejercicio4;

public class PerishableProduct extends Producto1 {
    private String expiratedDate;


    public String getExpiratedDate() {
        return expiratedDate;
    }

    public void setExpiratedDate(String expiratedDate) {
        this.expiratedDate = expiratedDate;
    }

    @Override
    public String toString() {
        return "Perishable Product: " +
                " expiratedDate: " + expiratedDate + super.toString();
    }

    public PerishableProduct(String nombre, String descripcion, int price, int stock, String expiratedDate) {
        super(nombre, descripcion, price, stock);
        this.expiratedDate = expiratedDate;
    }
}
