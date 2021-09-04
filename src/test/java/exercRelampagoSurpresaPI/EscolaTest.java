package exercRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {

    @Test
    void deveRetornarEscolaSemDiretor() {
        Escola escola = new Escola();

        assertEquals("Escola sem diretor", escola.getDescricaoEscolaridadeDiretor());
    }

    @Test
    void deveRetornarDescricaoEscolaridadeDiretor() {
        Professor diretor = new Professor("Ana");
        diretor.setEscolaridade(new Escolaridade("Doutorado"));
        Escola escola = new Escola();
        escola.setDiretor(diretor);

        assertEquals("Doutorado", escola.getDescricaoEscolaridadeDiretor());
    }

    @Test
    void deveRetornarNomeEstado() {
        Cidade cidade = new Cidade("Vassouras", new Estado("RJ"));
        Escola escola = new Escola();
        escola.setCidade(cidade);

        assertEquals("RJ", escola.getNomeEstado());
    }

    @Test
    void deveRetornarSemCidade() {
        Escola escola = new Escola();

        assertEquals("Escola sem cidade", escola.getNomeEstado());
    }

    @Test
    void deveRetornarNomeDiretor() {
        Professor diretor = new Professor("José");
        Escola escola = new Escola();
        escola.setDiretor(diretor);

        assertEquals("José", escola.getNomeDiretor());
    }

    @Test
    void deveRetornarEscolaSemDiretorNome() {
        Escola escola = new Escola();

        assertEquals("Escola sem diretor", escola.getNomeDiretor());
    }
}