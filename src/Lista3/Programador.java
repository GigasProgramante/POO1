package Lista3;

public class Programador extends Funcionario{
    private String linguagem;
    private int horasExtras;
    private double valorHoraExtra;

    public Programador(String nome, double salarioBase, String linguagem, int horasExtras, double valorHoraExtra) {
        super(nome, salarioBase);
        this.linguagem = linguagem;
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public void setValorHoraExtra(double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (this.horasExtras * this.valorHoraExtra);
    }

    public void codificar() {
        System.out.println("O programador está programando em " + this.linguagem);
    }

    @Override
    public void trabalhar() {
        System.out.println("O programador está desenvolvendo novas funcionalidades!!");
    }

}
