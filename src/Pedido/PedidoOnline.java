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

public class PedidoOnline extends Pedido {
    private String correoElectronico;

    public PedidoOnline(Cliente cliente, String correoElectronico, ArrayList<Item> items) {
        super(cliente, items);
        this.correoElectronico = correoElectronico;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }
}