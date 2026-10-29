package padroescomportamentais.chainofresponsability;

public class AtendimentoOuvidoria extends Atendimento {

    public AtendimentoOuvidoria(Atendimento superior) {
        listaChamados.add(TipoChamadoCancelamento.getInstance());
        setAtendimentoSuperior(superior);
    }

    public String getDescricaoNivel() {
        return "Ouvidoria";
    }
}