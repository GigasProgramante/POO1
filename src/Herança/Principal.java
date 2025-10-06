package Herança;

public class Principal {
    public static void main(String[] args) {
        Professor objetoProfessor = new Professor(25, "João", 3000);
        Aluno objetoAluno = new Aluno(18, "Ana", "Engenharia de software");
        Pessoa objetoPessoa = new Pessoa(17, "Pedro");

        objetoPessoa.apresentar();
        objetoProfessor.ensinar();
        objetoAluno.estudar();

        objetoProfessor.apresentar();
        objetoAluno.apresentar();

    }
}
