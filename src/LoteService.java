import java.util.List;

public class LoteService {
    LotesRepository lotesRepository = new LotesRepository();
    public String listaLotes() {
        StringBuilder lista = new StringBuilder();
        Lote[] lotes = lotesRepository.getLotesAsArray();
        for (Lote lote : lotes) {
            lista.append("- ");
            lista.append(lote.toString());
            lista.append("\n");
        }

        return "Os lotes são:\n" + lista;
    }

    public String cadastraLote(String nomeProduto, int quantidade, String data, ProdutoService produtoService) {
        Lote lote = new Lote(quantidade, data, produtoService.pegaProduto(nomeProduto));
        this.lotesRepository.adicionaLote(lote);
        return "Lote cadastrado com sucesso";
    }

}
