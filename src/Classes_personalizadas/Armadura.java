package Classes_personalizadas;

import java.util.Random;

public class Armadura {
    private String nome;
    private double raridade;
    private double defesa;
    private int durabilidade;

    Random rd = new Random();

    public Armadura(String nome, double defesa, int durabilidade) {
        this.nome = nome;
        this.raridade = 1 + rd.nextDouble(0.0, 1.1);
        this.defesa = defesa;
        this.durabilidade = durabilidade;
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
        this.defesa += melhoria;
    }

    public void exibirInfo() {
        System.out.println("\nNome: " + this.nome + "\nRaridade: " + this.raridade + "\nDefesa: " + this.defesa + "\nDurabilidade: " + this.durabilidade);
    }

    public double passarDefesa() {
        return this.defesa;
    }
}
