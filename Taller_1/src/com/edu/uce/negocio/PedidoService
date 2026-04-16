package com.edu.uce.negocio;

public class PedidoService {
    public void registrar(Pedido pedido){
        System.out.println("Registrando pedido");
        System.out.println("cliente: "+pedido.getCliente());
        System.out.println("Total: "+pedido.getTotal());
        System.out.println("Guardando en la base de datos");

        NotificadorMail nl = new NotificadorMail();
        nl.enviar(pedido.getCorreo(),"Se ha creado un pedido para ser atendido" );

    }

}
