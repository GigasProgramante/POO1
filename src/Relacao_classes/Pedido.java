package Relacao_classes;

public class Pedido {
    private int numero;
    private Cliente cliente;
    private double total;

    public Pedido(int numero, Cliente cliente, double total) {
        this.numero = numero;
        this.cliente = cliente;
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void imprimirResumo() {
        System.out.println("Nr pedido: " + this.numero + "\nCliente: " + cliente.getNome() + "\nTotal: R$" + this.total);
    }
}
