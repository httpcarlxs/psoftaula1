import java.util.Objects;

public class Produto {
    private String nome;
    private String fabricante;
    private double preco;
    private String produtoID;

    public Produto(String nome, String fabricante, double preco, String produtoID) {
        this.preco = preco;
        this.fabricante = fabricante;
        this.nome = nome;
        this.produtoID = produtoID;
    }

    public String getNome() {
        return this.nome;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public double getPreco() {
        return this.preco;
    }

    public String getProdutoID() {
        return this.produtoID;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Produto produto = (Produto) obj;
        return Objects.equals(this.produtoID, produto.produtoID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.produtoID);
    }
}
