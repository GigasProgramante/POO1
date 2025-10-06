package Herança;

import org.w3c.dom.ls.LSOutput;

public class Professor extends Pessoa {
    private double salario;

    public Professor(int idade, String nome, double salario) {
        super(idade, nome);
        this.salario = salario;
    }

    public void ensinar() {
        System.out.println("Dando aula");
    }

    @Override
    public void apresentar() {
        System.out.println("Olá meu nome é "+ getNome() + ", e eu sou o Professor!");
    }

    public double getSalario() {
        return salario;
    }
}
