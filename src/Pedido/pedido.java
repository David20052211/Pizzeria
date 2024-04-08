/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pedido;

/**
 *
 * @author dakar
 */
import Cliente.Cliente;
import Item.Item;
import java.util.ArrayList;

public class Pedido {
    private Cliente cliente;
    private ArrayList<Item> items;

    public Pedido(Cliente cliente, ArrayList<Item> items) {
        this.cliente = cliente;
        this.items = items;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}