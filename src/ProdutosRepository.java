import java.util.HashMap;
import java.util.Map;

public class ProdutosRepository {
    Map<String, Produto> produtosCadastrados;
    private int quantidadeCadastrados;

    public ProdutosRepository() {
        this.produtosCadastrados = new HashMap<String, Produto>();
        this.quantidadeCadastrados = 0;
    }
    public void cadastraProduto(Produto produto, String produtoID) {
        this.produtosCadastrados.put(produtoID, produto);
        this.quantidadeCadastrados++;
    }

    public boolean produtoExiste(String produtoID) {
        return produtosCadastrados.containsKey(produtoID);
    }

    public String exibeProduto(String produtoID) {
        return this.produtosCadastrados.get(produtoID).toString();
    }
}
