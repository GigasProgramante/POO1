package Lista3;

public class contaPoupança extends contaBancaria{
    private double taxaRendimento;

    public contaPoupança(String titular, double saldo, double taxaRendimento) {
        super(titular, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public void renderJuros() {
        setSaldo(getSaldo() + (getSaldo() * (this.taxaRendimento/100.0)));
    }

    @Override
    public void exibirSaldo() {
        System.out.println("Saldo: R$" + getSaldo() +"\nTaxa de rendimento: " + this.taxaRendimento + "5");
    }
}
