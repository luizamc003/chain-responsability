package padroescomportamentais.chainofresponsability;

public class TipoChamadoReclamacao implements TipoChamado {

    private static TipoChamadoReclamacao instance = new TipoChamadoReclamacao();
    private TipoChamadoReclamacao() {}
    public static TipoChamadoReclamacao getInstance() {
        return instance;
    }
}