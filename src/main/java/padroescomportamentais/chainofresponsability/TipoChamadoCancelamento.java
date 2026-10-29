package padroescomportamentais.chainofresponsability;

public class TipoChamadoCancelamento implements TipoChamado {

    private static TipoChamadoCancelamento instance = new TipoChamadoCancelamento();
    private TipoChamadoCancelamento() {}
    public static TipoChamadoCancelamento getInstance() {
        return instance;
    }
}