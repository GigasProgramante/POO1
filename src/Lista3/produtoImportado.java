package Lista3;

public class produtoImportado extends Produto{
    private double taxaImportação;
    private String paisOrigem;

    public produtoImportado(double preco, String nome, double taxaImportação, String paisOrigem) {
        super(preco, nome);
        this.taxaImportação = taxaImportação;
        this.paisOrigem = paisOrigem;
    }
}