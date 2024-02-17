package Ejercicio4;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Producto1Main {
    public static void main(String[] args) {
        List<Producto1> listaProductos = new ArrayList<>();


        Producto1 producto = new Producto1("Balon de futbol", "Para cancha de pasto", 10000, 50);
        listaProductos.add(producto);
        PerishableProduct perishableProduct = new PerishableProduct("Leche", "Deslactosada", 15000, 16, "21/09/2026");
        listaProductos.add(perishableProduct);


        System.out.println("Lista de productos:");
        for (Producto1 p : listaProductos) {
            System.out.println(p.toString());
        }


        String[] opciones = {"Agregar producto", "Modificar producto", "Eliminar producto", "Salir"};
        while (true) {
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Gestión de productos",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (seleccion) {
                case 0:
                    String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto:");
                    String descripcion = JOptionPane.showInputDialog(null, "Ingrese la descripción del producto:");
                    int precio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el precio del producto:"));
                    int stock = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el stock del producto:"));

                    Producto1 nuevoProducto = new Producto1(nombre, descripcion, precio, stock);
                    listaProductos.add(nuevoProducto);

                    System.out.println("Producto agregado:");
                    System.out.println(nuevoProducto.toString());
                    break;

                case 1:
                    int indiceMod = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el índice del producto a modificar:"));
                    if (indiceMod >= 0 && indiceMod < listaProductos.size()) {
                        Producto1 productoModificar = listaProductos.get(indiceMod);
                        int nuevoPrecio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo precio del producto:"));
                        int nuevoStock = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo stock del producto:"));

                        productoModificar.setPrice(nuevoPrecio);
                        productoModificar.setStock(nuevoStock);

                        System.out.println("Producto modificado:");
                        System.out.println(productoModificar.toString());
                    } else {
                        System.out.println("Índice inválido");
                    }
                    break;

                case 2:
                    int indiceEliminar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el índice del producto a eliminar:"));
                    if (indiceEliminar >= 0 && indiceEliminar < listaProductos.size()) {
                        Producto1 productoEliminar = listaProductos.remove(indiceEliminar);
                        System.out.println("Producto eliminado:");
                        System.out.println(productoEliminar.toString());
                    } else {
                        System.out.println("Índice inválido");
                    }
                    break;

                case 3:
                    System.exit(0);
                    break;
            }
        }
    }
}

