public class ApplicationFacade {
    ProdutoService produtoService = new ProdutoService();
    LoteService loteService = new LoteService();

    public String cadastraProduto(String nome, String fabricante, double preco) {
        return produtoService.cadastraProduto(nome, fabricante, preco);
    }

    public String exibeProduto(String produtoID) {
        return produtoService.exibeProduto(produtoID);
    }

    public String cadastraLote(String nomeProduto, int quantidade, String data) {
        return loteService.cadastraLote(nomeProduto, quantidade, data, produtoService);
    }

    public String listaProdutos() {
        return produtoService.listaProdutos();
    }

    public String listaLotes() {
        return loteService.listaLotes();
    }
}
