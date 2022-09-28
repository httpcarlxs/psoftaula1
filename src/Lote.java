public class Lote {
    private final String data;
    private int quantidade;
    private final Produto produto;

    public Lote(int quantidade, String data, Produto produto) {
        this.quantidade = quantidade;
        this.data = data;
        this.produto = produto;
    }

    public String getData() {
        return data;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }
}
