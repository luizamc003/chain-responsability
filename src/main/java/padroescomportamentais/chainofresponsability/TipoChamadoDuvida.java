package padroescomportamentais.chainofresponsability;

public class TipoChamadoDuvida implements TipoChamado {

    private static TipoChamadoDuvida instance = new TipoChamadoDuvida();
    private TipoChamadoDuvida() {}
    public static TipoChamadoDuvida getInstance() {
        return instance;
    }
}