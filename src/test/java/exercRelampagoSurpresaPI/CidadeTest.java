package exercRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CidadeTest {

    @Test
    void deveRetornarCidadeConstrutor() {
        Cidade cidade = new Cidade(new Estado("RJ"));
        assertEquals("RJ", cidade.getNomeEstado());
    }

    @Test
    void deveRetornarExcecaoConstrutorEstadoNulo() {
        try {
            Cidade cidade = new Cidade(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Estado é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarEstadoSet() {
        Cidade cidade = new Cidade(new Estado("RJ"));
        cidade.setEstado(new Estado("MG"));

        assertEquals("MG", cidade.getNomeEstado());
    }

    @Test
    void deveRetornarExcecaoSetNomeNula() {
        try {
            Cidade cidade = new Cidade(new Estado("RJ"));
            cidade.setEstado(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Estado é obrigatório", e.getMessage());
        }
    }

}