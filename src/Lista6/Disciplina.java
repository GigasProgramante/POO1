package Lista6;

public class Disciplina {
    private String nome;
    private double cargaHoraria;
    private Professor professor;

    public Disciplina(String nome, double cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public void exibirEmenta() {
        System.out.println("Nome: " + this.nome + "\nCarga Horaria: " + this.cargaHoraria + "\nProfessor: " + this.professor);
    }

    public void exibirProfessor(Professor professor) {
        this.professor = professor;
    }

    public double getCargaHoraria() {return cargaHoraria;}

    public String getNome() {return nome;}
}