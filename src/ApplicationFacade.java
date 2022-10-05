public class ApplicationFacade {
    ProdutoService produtoService = new ProdutoService();
    LoteService loteService = new LoteService();

    public String cadastraProduto(String nome, String fabricante, double preco, String produtoID) {
        //return "funciona até aqui";
        return produtoService.cadastraProduto(nome, fabricante, preco, produtoID);
    }

    public String exibeProduto(String produtoID) {
        return produtoService.exibeProduto(produtoID);
    }

    public String cadastraLote(String produtoID, int quantidade, String data) {
        return null;
    }

    public String listaProdutos() {
        return null;
    }

    public String verificaDisponibilidade(String nome) {
        return null;
    }
}
