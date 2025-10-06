package Herança;

public class Aluno extends Pessoa{
    private String curso;

    public Aluno(int idade, String nome, String curso) {
        super(idade, nome);
        this.curso = curso;
    }

    public void estudar() {
        System.out.println("Estudando!!!");
    }

    public void apresentar() {
        System.out.println("Olá meu nome é "+ getNome() + ", e eu sou uma aluna!");
    }

    public String getCurso() {
        return curso;
    }
}
