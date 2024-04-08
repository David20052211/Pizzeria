/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Item;

/**
 *
 * @author dakar
 */
public class Item {

    private String nombre;
    private double valor;
    private int id;

    public Item(String nombre, double precio) {
        this.nombre = nombre;
        this.valor = precio;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return valor;
    }
}
