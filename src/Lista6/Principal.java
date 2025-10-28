package Lista6;

public class Principal {
    public static void main(String[] args) {
        Professor objetoProfessor = new Professor("Hélio", "Mestre");
        Disciplina objetoDisciplina = new Disciplina("Desenvolvimento de software II", 60);

        objetoProfessor.atribuirDisciplina(objetoDisciplina);

        objetoProfessor.exibirPerfil();
    }
}
