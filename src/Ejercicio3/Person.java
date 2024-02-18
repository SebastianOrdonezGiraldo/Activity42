package Ejercicio3;

public class Person {
    private String name;
    private int id;
    private String address;

public String obtenerNombre(){
    return this.name;
}
public int obtenerId(){
    return this.id;
}
public String obtenerDirreccion(){
    return this.address;
}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
