package POO_relações_avancadas;

import java.util.ArrayList;
import java.util.Random;

public class Time {
    private String nome;
    private String anoFundacao;
    private int vitorias;
    private int derrotas;
    private ArrayList<Jogador> listaJogadores = new ArrayList<>();

    public Time(String nome, String anoFundacao) {
        this.nome = nome;
        this.anoFundacao = anoFundacao;
    }

    public void escalarJogador(Jogador jogador) {
        if(listaJogadores.contains(jogador)) {
            System.out.println("O jogador já está escalado!!!");
        } else {
            listaJogadores.add(jogador);
        }
    }

    public void aumentarSalario(Jogador jogador, double valor) {
        if(listaJogadores.contains(jogador)) {
            jogador.setSalario(jogador.getSalario()+valor);
        } else {
            System.out.println("O jogador não está no time:");
        }
    }

    public void jogar() {
        Random random = new Random();
        boolean valor = random.nextBoolean();

        if(valor) {
            this.vitorias+=1;
        } else {
            this.derrotas+=1;
        }
    }

    public void verTime() {
        for (Jogador j : listaJogadores) {
            System.out.println("Nome: " + j.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(String anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public ArrayList<Jogador> getListaJogadores() {
        return listaJogadores;
    }

    public void setListaJogadores(ArrayList<Jogador> listaJogadores) {
        this.listaJogadores = listaJogadores;
    }
}
