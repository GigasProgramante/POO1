package Lista6;

import java.util.ArrayList;

public class Professor {
    private String nome;
    private String titulacao;
    private ArrayList<Disciplina> listaDisciplinas = new ArrayList<>();

    public Professor(String nome, String titulacao) {
        this.nome = nome;
        this.titulacao = titulacao;
    }

    public void atribuirDisciplina(Disciplina disciplina) {
        this.listaDisciplinas.add(disciplina);
    }

    public double calcularCargaHorariaTotal() {
        double total = 0;

        for(Disciplina disciplina : listaDisciplinas) {
            total += disciplina.getCargaHoraria();
        }

        return total;
    }

    public void exibirPerfil() {
        System.out.println("Nome: " + this.nome + "\nTitulação: " + this.titulacao + "\nDisciplina(s): ");

        for(Disciplina d : listaDisciplinas) {
            System.out.println(d.getNome() + "\n");
        }
    }
}
