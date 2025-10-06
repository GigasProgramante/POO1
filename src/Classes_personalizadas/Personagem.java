package Classes_personalizadas;

public class Personagem {
    private String nome;
    private double vida, defesa, dano;
    private int vigor, pocoes;
    private boolean vivo;


    public Personagem(String nome) {
        this.nome = nome;
        this.vida = 100.0;
        this.vigor = 20;
        this.vivo = true;
        this.pocoes = 3;
        this.defesa = 0;
        this.dano = 0;
    }

    public void equiparArmadura (Armadura item) {
        this.defesa = item.passarDefesa();
    }

    public void equiparEspada (Espada item) {
        this.dano = item.passarDano();
    }

    public void danificar (double valor) {
        this.vida -= valor;
        if (this.vida <= 0) {
            this.vivo = false;
            System.out.println("----- " + this.nome + "Morreu! -----\n");
        }
    }

    public void atacar (Personagem alvo) {
        alvo.danificar(this.dano);
        this.vigor -= 1;
    }

    public void curar () {
        this.vida += 30.0;
    }

    public void reviver () {
        if (this.vivo) {
            System.out.println("----- " + this.nome + " está vivo! -----\n");
        } else {
            System.out.println("----- " + this.nome + " foi completamente revigorado! -----\n");
        }
    }

    public void exibirInfo() {
        System.out.println("\nNome: " + this.nome + "\nVida; " + this.vida + "\nVigor: " + this.vigor + "\nPoções: " + this.pocoes + "\nDefesa: " + this.defesa + "\nDano: " + this.defesa);
    }
}
