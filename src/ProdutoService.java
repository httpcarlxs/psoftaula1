public class ProdutoService {
    ProdutosRepository produtosRepository = new ProdutosRepository();
    public String cadastraProduto(String nome, String fabricante, double preco, String produtoID) {
        Produto novoProduto = new Produto(nome, fabricante, preco, produtoID);

        produtosRepository.cadastraProduto(novoProduto, produtoID);

        return "O produto foi cadastrado com sucesso!";
    }

    public String exibeProduto(String produtoID) {
        if (!produtosRepository.produtoExiste(produtoID)) {
            return "O produto não está cadastrado";
        }

        return produtosRepository.exibeProduto(produtoID);
    }
}
