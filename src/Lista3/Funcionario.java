package Lista3;

public class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome + "\nSalário: R$ " + this.salarioBase);
    }

    public void trabalhar() {
        System.out.println("O funcionário está trabalhando!!");
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}
