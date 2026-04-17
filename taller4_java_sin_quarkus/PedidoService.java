package com.edu.uce.negocio;
import com.edu.uce.negocio.NotificadorSMS;
import com.edu.uce.negocio.NotificadorMail;
import com.edu.uce.negocio.NotificadorWhatsapp;
import com.edu.uce.negocio.Pedido;

public class PedidoService {
    
  public void registrar(Pedido pedido) {
  
    System.out.println("registrando pedido");
    System.out.println(" cliente: " + pedido.getCliente());
    System.out.println("Total " + pedido.getTotal());
    System.out.println("guardando en la base de datos");

    if(pedido.getTotal()> 100){
        NotificadorMail ml= new NotificadorMail();
        ml.enviar(pedido.getCorreo(),"Se enviara por correo");
    }
    if(pedido.getTotal()<=50){
      NotificadorWhatsapp ws= new NotificadorWhatsapp();
      ws.enviar(pedido.getNumero(),"Se enviara por whatsapp");

      }else{
        NotificadorSMS sms= new NotificadorSMS();
        sms.enviar(pedido.getNumero(),"se enviara por sms");

    }

  }

}
