import java.util.Objects;

public class Lote {
    private final String data;
    private int quantidade;
    private final Produto produto;
    private final String loteID;

    public Lote(int quantidade, String data, Produto produto) {
        this.quantidade = quantidade;
        this.data = data;
        this.produto = produto;
        this.loteID = produto.getProdutoID() + data;
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Lote lote = (Lote) obj;
        return Objects.equals(this.loteID, lote.loteID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.produto.getNome() + this.data);
    }
}
