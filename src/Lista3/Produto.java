package Lista3;

public class Produto {
    private String nome;
    private double preco;

    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public void calcularPrecoFinal() {
        System.out.println("Preço: " + this.preco);
    }

    public void aplicarDesconto(double valor) {
        this.preco -= valor;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome + "\nPreço: R$ " + this.preco);
    }


    public double getPreco() {return this.preco;}
}
