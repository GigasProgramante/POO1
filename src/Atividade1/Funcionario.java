package Atividade1;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private boolean ativo;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.ativo = true;
    }

    public void promover(String cargo, double aumento) {
        this.cargo = cargo;
        this.salario += aumento;
    }

    public void demitir() {
        this.ativo = false;
    }

    public void reajustarSalario(double percentual) {
        this.salario += this.salario * (percentual/100);
    }

    public void exiirInfo() {
        if(ativo){
            System.out.println("Nome: " + this.nome + "\nCargo: " + this.cargo + "\nSalario: R$ " + this.salario + "\nAtivo!");
        } else {
            System.out.println("Nome: " + this.nome + "\nCargo: " + this.cargo + "\nSalario: R$ " + this.salario + "\nInativo!");
        }

    }
}
