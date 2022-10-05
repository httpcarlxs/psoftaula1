import java.util.HashSet;

public class LotesRepository {
    
    HashSet<Lote> lotes = new HashSet<>();
    public void adicionaLote(Lote lote) {
        this.lotes.add(lote);
    }

    public Lote[] getLotesAsArray() {
        return this.lotes.toArray(new Lote[0]);
    }
}
