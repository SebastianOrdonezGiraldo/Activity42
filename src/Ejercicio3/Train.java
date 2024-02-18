package Ejercicio3;

import java.util.List;
import java.util.ArrayList;

public class Train {
    private String number;
    private String route;
    private List<Wagon> wagonList = new ArrayList<>();


    public String obtenerNumero() { return this.number; }
    public String obtenerRuta() { return this.route; }
    public Wagon obtenerVagon(String type) {
        for (Wagon wagon : wagonList) {
            if (wagon.obtenerTipo().equals(type)) {
                return wagon;
            }
        }
        return null;
    }
}
