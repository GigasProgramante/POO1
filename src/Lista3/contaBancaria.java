package Lista3;

public class contaBancaria {
    private String titular;
    private double saldo;

    public contaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo+=valor;
    }

    public void sacar(double valor) {
        if(this.saldo < valor){
            System.out.println("Saldo insuficiente!!");
        } else {
            this.saldo-=valor;
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo: R$" + this.saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
