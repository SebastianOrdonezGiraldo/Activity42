package Ejercicio1;

class Property {
    private String address;
    private double value;

    public Property(String address, double value) {
        this.address = address;
        this.value = value;
    }

    public String getAddress() {
        return address;
    }

    public double getValue() {
        return value;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
