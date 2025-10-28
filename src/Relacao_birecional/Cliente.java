package Relacao_birecional;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private ArrayList<Pedido> listaPedidos = new ArrayList<>();

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void adicionarPedido(Pedido pedido) {
        pedido.setCliente(this);
        this.listaPedidos.add(pedido);
    }

    public void removerPedido(Pedido pedido) {
        this.listaPedidos.remove(pedido);
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome + "\nCpf: " + this.cpf);

        System.out.println("Pedidos: ");

        for(Pedido p : listaPedidos){
            System.out.println("Nr-> " + p.getNumero() + "\nTotal-> " + p.getTotal());
        }
    }




    // getter and setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
