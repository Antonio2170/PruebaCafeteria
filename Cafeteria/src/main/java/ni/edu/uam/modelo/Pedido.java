package ni.edu.uam.modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Pedido {
    private int id;
    private ArrayList<Producto> productos;
    private String estado;

    public Pedido(int id) {
        this.id = id;
        this.productos = new ArrayList<>();
        this.estado = "Pendiente";
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void mostrarPedido() {
        StringBuilder detalle = new StringBuilder("Pedido #" + id + "\n");

        for (Producto p : productos) {
            detalle.append("- ").append(p.getNombre())
                    .append(" $").append(p.getPrecio()).append("\n");
        }

        JOptionPane.showMessageDialog(null, detalle.toString());
    }
}