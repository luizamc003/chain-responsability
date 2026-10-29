package padroescomportamentais.chainofresponsability;

public class AtendimentoAtendente extends Atendimento {

    public AtendimentoAtendente(Atendimento superior) {
        listaChamados.add(TipoChamadoDuvida.getInstance());
        listaChamados.add(TipoChamadoSegundaVia.getInstance());
        setAtendimentoSuperior(superior);
    }

    public String getDescricaoNivel() {
        return "Atendente";
    }
}