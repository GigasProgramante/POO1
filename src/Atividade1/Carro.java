package Atividade1;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade;
    private boolean ligado;

    public Carro(String marca, String modelo, int ano, int velocidade, boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
        this.ligado = ligado;
    }

    public Carro(String marca, String modelo, int idade, int velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = idade;
        this.velocidade = velocidade;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
        this.velocidade = 0;
    }

    public void acelerar(int valor) {
        if(this.ligado) {
            this.velocidade += valor;
        }
    }

    public void frear(int valor) {
        if(this.ligado) {
            if(valor > this.velocidade){
                this.velocidade = 0;
            } else {
                this.velocidade -= valor;
            }
        }
    }

    public void exibirInfo(){
        if(this.ligado){
            System.out.println("Marca: " + this.marca + "\nModelo: " + this.modelo + "\nAno: " + this.ano + "\nVelocidade: " + this.velocidade + "\nLígado: Lígado");
        } else {
            System.out.println("Marca: " + this.marca + "\nModelo: " + this.modelo + "\nAno: " + this.ano + "\nVelocidade: " + this.velocidade + "\nLígado: Desligado");
        }
    }
}
