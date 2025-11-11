package POO_relações_avancadas;

public class Jogador {
    private String nome;
    private int idade;
    private String cpf;
    private String posicao;
    private double salario;

    public Jogador(String nome, int idade, String cpf, String posicao, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.posicao = posicao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
