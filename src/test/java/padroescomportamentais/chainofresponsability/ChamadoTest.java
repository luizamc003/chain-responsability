package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChamadoTest {

    AtendimentoOuvidoria ouvidoria;
    AtendimentoSupervisor supervisor;
    AtendimentoAtendente atendente;

    @BeforeEach
    void setUp() {
        ouvidoria = new AtendimentoOuvidoria(null);
        supervisor = new AtendimentoSupervisor(ouvidoria);
        atendente = new AtendimentoAtendente(supervisor);
    }

    @Test
    void deveRetornarAtendenteParaChamadoDuvida() {
        assertEquals("Atendente", atendente.resolverChamado(new Chamado(TipoChamadoDuvida.getInstance())));
    }

    @Test
    void deveRetornarAtendenteParaChamadoSegundaVia() {
        assertEquals("Atendente", atendente.resolverChamado(new Chamado(TipoChamadoSegundaVia.getInstance())));
    }

    @Test
    void deveRetornarSupervisorParaChamadoReclamacao() {
        assertEquals("Supervisor", atendente.resolverChamado(new Chamado(TipoChamadoReclamacao.getInstance())));
    }

    @Test
    void deveRetornarSupervisorParaChamadoTrocaPlano() {
        assertEquals("Supervisor", atendente.resolverChamado(new Chamado(TipoChamadoTrocaPlano.getInstance())));
    }

    @Test
    void deveRetornarOuvidoriaParaChamadoCancelamento() {
        assertEquals("Ouvidoria", atendente.resolverChamado(new Chamado(TipoChamadoCancelamento.getInstance())));
    }

    @Test
    void deveRetornarNaoResolvidoParaChamadoDuvidaNoSupervisor() {
        assertEquals("Chamado não resolvido", supervisor.resolverChamado(new Chamado(TipoChamadoDuvida.getInstance())));
    }
}