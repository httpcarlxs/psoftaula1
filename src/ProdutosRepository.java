import java.util.HashMap;
import java.util.Map;

public class ProdutosRepository {
    private Map<String, Produto> produtosCadastrados;

    public ProdutosRepository() {
        this.produtosCadastrados = new HashMap<String, Produto>();
    }
    public void adicionaProduto(Produto produto) {
        this.produtosCadastrados.put(produto.getNome(), produto);
    }

    public boolean produtoExiste(String produtoID) {
        return produtosCadastrados.containsKey(produtoID);
    }

    public String exibeProduto(String produtoID) {
        return this.produtosCadastrados.get(produtoID).toString();
    }

    public Produto[] getProdutosAsArray() {
        return produtosCadastrados.values().toArray(new Produto[0]);
    }

    public Produto pegaProduto(String nomeProduto) {
        return this.produtosCadastrados.get(nomeProduto);
    }
}
