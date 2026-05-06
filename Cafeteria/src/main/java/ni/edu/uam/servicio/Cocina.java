package ni.edu.uam.servicio;

import ni.edu.uam.modelo.Pedido;
import javax.swing.JOptionPane;

public class Cocina {

    public void procesarPedido(Pedido pedido) {
        JOptionPane.showMessageDialog(null, "Cocina está preparando el pedido...");
        pedido.setEstado("Completado");
        JOptionPane.showMessageDialog(null, "Pedido completado.");
    }
}