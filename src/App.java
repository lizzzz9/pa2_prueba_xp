import com.edu.uce.negocio.Pedido;
import com.edu.uce.negocio.PedidoService;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pedido pedido= new Pedido("Ximena Pulupa","Cuaderno", 3,"xlpulupa@uce.edu.ec");
        PedidoService service = new PedidoService();
        service.registrar(pedido);
    }
}
