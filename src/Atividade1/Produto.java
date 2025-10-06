package Atividade1;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private String categoria;

    public Produto(String nome, double preco, int quantidade, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    public void aumentarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    public void diminuirEstoque(int quantidade) {
        if(quantidade > this.quantidade) {
            this.quantidade = 0;
        } else {
            this.quantidade -= quantidade;
        }
    }

    public void atualizarPreco(double preco) {
        this.preco = preco;
    }

    public double calcularValorTotal() {
       return this.quantidade * this.preco;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + this.nome + "\nPreço: " + this.preco + "\nQuantidade: " + this.quantidade + "\nCategoria: " + this.categoria);
    }
}