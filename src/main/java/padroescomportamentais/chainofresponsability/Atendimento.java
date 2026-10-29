package padroescomportamentais.chainofresponsability;

import java.util.ArrayList;

public abstract class Atendimento {

    protected ArrayList listaChamados = new ArrayList();
    private Atendimento atendimentoSuperior;

    public Atendimento getAtendimentoSuperior() {
        return atendimentoSuperior;
    }

    public void setAtendimentoSuperior(Atendimento atendimentoSuperior) {
        this.atendimentoSuperior = atendimentoSuperior;
    }

    public abstract String getDescricaoNivel();

    public String resolverChamado(Chamado chamado) {
        if (listaChamados.contains(chamado.getTipoChamado())) {
            return getDescricaoNivel();
        }
        else {
            if (atendimentoSuperior != null) {
                return atendimentoSuperior.resolverChamado(chamado);
            }
            else {
                return "Chamado não resolvido";
            }
        }
    }
}