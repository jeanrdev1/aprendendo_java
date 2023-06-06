package enumeradores;

public class Pedido {

    public String name;
    public StatusPedidoEnum status;

    @Override
    public String toString() {
        return String.format("Nome: %s  Status: %s", name, status);
    }
}
