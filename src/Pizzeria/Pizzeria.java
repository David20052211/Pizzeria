/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pizzeria;

/**
 *
 * @author dakar
 */
import Item.Item;
import Cliente.Cliente;
import Pedido.Pedido;
import Pedido.PedidoTelefono;
import Pedido.PedidoOnline;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pizzeria {
    private ArrayList<Item> menu;
    private ArrayList<Cliente> clientes;
    private ArrayList<Pedido> pedidos;
    private String nombre;
    public Pizzeria() {
        this.menu = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public void addItem(Item item) {
        menu.add(item);
    }

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public Item getItem(int index) {
        return menu.get(index);
    }

    public Cliente getCliente(int index) {
        return clientes.get(index);
    }

    public int calcProdMasVendidoCliente(int numCliente) {
        Map<Item, Integer> ventas = new HashMap<>();

        for (Pedido pedido : pedidos) {
            if (pedido.getCliente().equals(clientes.get(numCliente))) {
                for (Item item : pedido.getItems()) {
                    ventas.put(item, ventas.getOrDefault(item, 0) + 1);
                }
            }
        }

        int maxVentas = 0;
        Item productoMasVendido = null;

        for (Map.Entry<Item, Integer> entry : ventas.entrySet()) {
            if (entry.getValue() > maxVentas) {
                maxVentas = entry.getValue();
                productoMasVendido = entry.getKey();
            }
        }

        if (productoMasVendido != null) {
            return menu.indexOf(productoMasVendido);
        } else {
            return -1;
        }
    }
}
