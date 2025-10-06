package Atividade1;

public class Animal {
    private String nome;
    private String especie;
    private int idade;
    private double peso;

    public Animal(String nome, String especie, int idade, double peso) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    public void alimentar(double quantidade) {
        this.peso += quantidade;
    }

    public void envelhecer() {
        this.idade += 1;
    }

    public void emitirSom() {
        System.out.println("O animal está emitindo som");
    }

    public void exibirInfo() {
        System.out.println("Nome: " + this.nome + "\nEspecie: " + this.especie + "\nIdade: " + this.idade + "\nPeso: " + this.idade);
    }
}
