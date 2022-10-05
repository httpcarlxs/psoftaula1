import java.util.HashMap;
import java.util.Map;

public class ProdutoService {
    ProdutosRepository produtosRepository = new ProdutosRepository();
    public String cadastraProduto(String nome, String fabricante, double preco) {
        Produto novoProduto = new Produto(nome, fabricante, preco);

        produtosRepository.adicionaProduto(novoProduto);

        return "O produto foi cadastrado com sucesso!";
    }

    public String exibeProduto(String produtoID) {
        if (!produtosRepository.produtoExiste(produtoID)) {
            return "O produto não está cadastrado";
        }

        return produtosRepository.exibeProduto(produtoID);
    }

    public String listaProdutos() {
        StringBuilder lista = new StringBuilder();
        Produto[] produtos = produtosRepository.getProdutosAsArray();
        for (Produto produto : produtos) {
            lista.append("- ");
            lista.append(produto.toString());
            lista.append("\n");
        }

        return "Os produtos cadastrados são:\n" + lista;

    }

    public Produto pegaProduto(String nomeProduto) {
        return this.produtosRepository.pegaProduto(nomeProduto);
    }
}
