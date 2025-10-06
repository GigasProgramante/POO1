package Lista3;

public class Gerente extends Funcionario{
    private double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + this.bonus;
    }

    public void aprovarProjeto() {
        System.out.println("O gerente aprovou um novo projeto!!");
    }

    public void trabalhar() {
        System.out.println("O gerente está gerenciando a equipe!!");
    }

    public double getBonus() {
        return bonus;
    }
}
