public class Sistema {

    public static void main(String[] args) {

        Produto p = new Produto("biscoito", "Oreo", 400);
        Lote lote = new Lote(25, "22/05/2023", p);

        System.out.printf("Foi criado um lote de produtos do tipo: %s.\n", lote.getProduto().getNome());
        System.out.printf("O lote possui %d produtos com data de fabricação %s.\n", lote.getQuantidade(), lote.getData());
        System.out.printf("Cada %s possui preço %.2f e é do fabricante %s.", lote.getProduto().getNome(),
                            lote.getProduto().getPreco(), lote.getProduto().getFabricante());
    }
}
