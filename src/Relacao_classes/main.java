package Relacao_classes;

public class main {
    public static void main(String[] args) {
        Cliente objetoCliente = new Cliente("João", "123456");
        Pedido objetoPedido = new Pedido(1, objetoCliente, 200);
        objetoPedido.imprimirResumo();
    }
}
