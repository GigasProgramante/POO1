package AtividadeOO_BemCompleto;

public class Vendedor extends Pessoa{
    private String matricula;

    public Vendedor(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public double calcularComissao(double valorVenda) {
        return 0.05 * valorVenda;
    }
}
