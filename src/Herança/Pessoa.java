package Herança;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public void apresentar() {
        System.out.println("Olá meu nome é "+ this.nome + ", e eu tenho " + this.nome + " anos de idade!");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
