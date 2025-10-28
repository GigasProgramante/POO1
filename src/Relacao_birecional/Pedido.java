package Relacao_birecional;

public class Pedido {
    private int numero;
    private double total;
    private Cliente cliente;

    public Pedido(double total, int numero) {
        this.total = total;
        this.numero = numero;
    }

    public void exibirResumo() {
        System.out.println("Nr-> " + this.numero + "\nTotal-> " + this.total + "\nNome: " + this.cliente.getNome());
    }

    public void aplicarDesconto(double porcentagem) {
        this.total -= this.total * (porcentagem/100);
    }

    public int getNumero() {return numero;}
    public double getTotal() {return total;}

    public void setCliente(Cliente cliente) {this.cliente = cliente;}
}
