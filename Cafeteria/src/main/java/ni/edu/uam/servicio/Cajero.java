package ni.edu.uam.servicio;

import ni.edu.uam.modelo.*;
import javax.swing.JOptionPane;

public class Cajero {
    private String nombre;

    public Cajero(String nombre) {
        this.nombre = nombre;
    }

    public void registrarPedido(Pedido pedido) {
        JOptionPane.showMessageDialog(null, nombre + " registró el pedido.");
        pedido.mostrarPedido();
    }

    public void enviarACocina(Pedido pedido, Cocina cocina) {
        JOptionPane.showMessageDialog(null, nombre + " envía el pedido a cocina...");
        cocina.procesarPedido(pedido);
    }

    public void notificarCliente(Cliente cliente) {
        JOptionPane.showMessageDialog(null,
                "Pedido listo para " + cliente.getNombre());
    }
}
