package ni.edu.uam.modelo;

import javax.swing.JOptionPane;

public class Cliente {
    private String nombre;

    public Cliente() {
        this.nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
    }

    public Pedido realizarPedido() {
        Pedido pedido = new Pedido(1);

        int opcion;

        do {
            String menu = """
                    MENÚ CAFETERÍA
                    1. Café - $2.5
                    2. Pan - $1.5
                    3. Jugo - $3.0
                    4. Terminar pedido
                    """;

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1 -> pedido.agregarProducto(new Producto("Café", 2.5));
                case 2 -> pedido.agregarProducto(new Producto("Pan", 1.5));
                case 3 -> pedido.agregarProducto(new Producto("Jugo", 3.0));
                case 4 -> JOptionPane.showMessageDialog(null, "Pedido finalizado");
                default -> JOptionPane.showMessageDialog(null, "Opción inválida");
            }

        } while (opcion != 4);

        return pedido;
    }

    public String getNombre() {
        return nombre;
    }
}