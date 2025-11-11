package AtividadeOO_BemCompleto;

public class Cliente extends Pessoa{
    private TipoCliente tipo;

    public Cliente(String nome, String cpf, TipoCliente tipo) {
        super(nome, cpf);
        this.tipo = tipo;
    }

    public TipoCliente getTipo() {
        return this.tipo;
    }

    public double aplicarCashback(double valor) {
        if(tipo == TipoCliente.BRONZE) {
            return 0;
        } else if(tipo == TipoCliente.PRATA) {
            return 0.02;
        } else {
            return 0.05;
        }
    }
}
