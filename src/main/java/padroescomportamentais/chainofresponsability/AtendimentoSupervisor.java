package padroescomportamentais.chainofresponsability;

public class AtendimentoSupervisor extends Atendimento {

    public AtendimentoSupervisor(Atendimento superior) {
        listaChamados.add(TipoChamadoReclamacao.getInstance());
        listaChamados.add(TipoChamadoTrocaPlano.getInstance());
        setAtendimentoSuperior(superior);
    }

    public String getDescricaoNivel() {
        return "Supervisor";
    }
}