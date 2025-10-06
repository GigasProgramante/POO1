package Classes_personalizadas;

import java.util.Random;

public class Espada {
    private String nome;
    private double raridade;
    private double dano;
    private int durabilidade, critico;

    Random rd = new Random();

    public Espada(String nome, double dano, int durabilidade, int critico) {
        this.nome = nome;
        this.raridade = 1 + rd.nextDouble(0.0, 1.0);
        this.dano = dano;
        this.durabilidade = durabilidade;
        this.critico = critico;
    }

    public void renomear (String nome) {
        this.nome = nome;
    }

    public void reforjar () {
        this.raridade = 1+ rd.nextDouble(0.0, 1.0);
    }

    public void danificar() {
        this.durabilidade -= 1;
        if (this.durabilidade <= 0) {
            this.durabilidade = 0;
        }
    }

    public void melhorar(int melhoria) {
        this.dano += melhoria;
    }

    public void exibirInfo() {
        System.out.println("\nNome: " + this.nome + "\nRaridade: " + this.raridade + "\nDano: " + this.dano + "\nDurabilidade: " + this.durabilidade + "\nChance crítica: " + this.critico + "%");
    }

    public double passarDano() {
        return this.dano;
    }
}
