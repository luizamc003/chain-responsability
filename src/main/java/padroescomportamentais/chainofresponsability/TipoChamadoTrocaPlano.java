package padroescomportamentais.chainofresponsability;

public class TipoChamadoTrocaPlano implements TipoChamado {

    private static TipoChamadoTrocaPlano instance = new TipoChamadoTrocaPlano();
    private TipoChamadoTrocaPlano() {}
    public static TipoChamadoTrocaPlano getInstance() {
        return instance;
    }
}