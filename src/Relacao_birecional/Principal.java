package Relacao_birecional;

public class Principal {
    public static void main(String[] args) {
        Cliente objetoCliente = new Cliente("Pedro", "123456");
        Pedido objetoPedido1 = new Pedido(100, 1);
        Pedido objetoPedido2 = new Pedido(200, 2);

        objetoCliente.adicionarPedido(objetoPedido1);
        objetoCliente.adicionarPedido(objetoPedido2);

        objetoPedido1.exibirResumo();
        objetoPedido2.exibirResumo();

        objetoCliente.exibirDados();

        objetoCliente.removerPedido(objetoPedido1);

        objetoPedido2.aplicarDesconto(5);

        objetoCliente.exibirDados();
    }
}