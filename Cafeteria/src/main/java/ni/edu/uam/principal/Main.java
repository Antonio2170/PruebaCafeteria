package ni.edu.uam.principal;

import ni.edu.uam.modelo.*;
import ni.edu.uam.servicio.*;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Cajero cajero = new Cajero("Carlos");
        Cocina cocina = new Cocina();

        Pedido pedido = cliente.realizarPedido();
        cajero.registrarPedido(pedido);
        cajero.enviarACocina(pedido, cocina);
        cajero.notificarCliente(cliente);
    }
}