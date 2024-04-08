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

public class PedidoTelefono extends Pedido {
    private String numeroTelefono;

    public PedidoTelefono(Cliente cliente, String numeroTelefono, ArrayList<Item> items) {
        super(cliente, items);
        this.numeroTelefono = numeroTelefono;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }
}