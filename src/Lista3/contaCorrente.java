package Lista3;

public class contaCorrente extends contaBancaria {
    private double limiteChequeEspecial;

    public contaCorrente(String titular, double saldo, double limiteChequeEspecial) {
        super(titular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if((getSaldo() + this.limiteChequeEspecial) < valor){
            System.out.println("Saldo insuficiente!!");
        } else {
            setSaldo(getSaldo()-valor);
        }
    }

    public void cobrarTarifaMensal() {
        setSaldo(getSaldo() - 20);
    }

    @Override
    public void exibirSaldo() {
        System.out.println("Saldo: R$" + getSaldo() + "\nLimite: R$ " + this.limiteChequeEspecial);
    }

}
