package enumeradores;

public class Inicio {

    public static void main(String[] args) {

        Pedido pedido1 = new Pedido();
        pedido1.name = "iFood";
        pedido1.status = StatusPedidoEnum.CONCLUIDO;

        System.out.println(pedido1);
        
    }
}