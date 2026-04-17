package com.edu.uce.negocio;
import com.edu.uce.negocio.Pedido;
import com.edu.uce.negocio.PedidoService;

public class App {
    public static void main(String[] args) throws Exception {
       
        PedidoService service = new PedidoService();
        //caso1
        Pedido pedido = new Pedido("Ximena Pulupa","Coca Cola",1200,"xlpulupa@example.com");
        service.registrar(pedido);
        //caso2
        Pedido pedido1 = new Pedido("Ximena Pulupa","Coca Cola",90,"xlpulupa@example.com");
        service.registrar(pedido1);
        //caso3
        Pedido pedido2 = new Pedido("Ximena Pulupa","Coca Cola",30,"xlpulupa@example.com");
        service.registrar(pedido2);
    }
}
