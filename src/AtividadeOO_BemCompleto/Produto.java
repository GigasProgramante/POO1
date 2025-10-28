package AtividadeOO_BemCompleto;

public class Produto {
    private String codigo;
    private String descricao;
    private double preco;

    public Produto(String codigo, String descricao, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }
}
