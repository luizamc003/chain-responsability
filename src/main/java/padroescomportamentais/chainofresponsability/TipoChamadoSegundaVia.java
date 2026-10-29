package padroescomportamentais.chainofresponsability;

public class TipoChamadoSegundaVia implements TipoChamado {

    private static TipoChamadoSegundaVia instance = new TipoChamadoSegundaVia();
    private TipoChamadoSegundaVia() {}
    public static TipoChamadoSegundaVia getInstance() {
        return instance;
    }
}