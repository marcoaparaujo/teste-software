package exercRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CidadeTest {

    @Test
    void deveRetornarCidadeConstrutor() {
        Cidade cidade = new Cidade("Vassouras", new Estado("RJ"));
        assertEquals("RJ", cidade.getNomeEstado());
    }

    @Test
    void deveRetornarExcecaoConstrutorEstadoNulo() {
        try {
            Cidade cidade = new Cidade("Vassouras", null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Estado é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoConstrutorCidadeNula() {
        try {
            Cidade cidade = new Cidade(null, new Estado("RJ"));
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoConstrutorCidadeVazia() {
        try {
            Cidade cidade = new Cidade("", new Estado("RJ"));
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarEstadoSet() {
        Cidade cidade = new Cidade("Vassouras", new Estado("RJ"));
        cidade.setEstado(new Estado("MG"));

        assertEquals("MG", cidade.getNomeEstado());
    }

    @Test
    void deveRetornarExcecaoSetNomeNula() {
        try {
            Cidade cidade = new Cidade("Vassouras", new Estado("RJ"));
            cidade.setEstado(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Estado é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoSetCidadeNula() {
        try {
            Cidade cidade = new Cidade("Vassouras", new Estado("RJ"));
            cidade.setNome(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoSetCidadeVazia() {
        try {
            Cidade cidade = new Cidade("Vassouras", new Estado("RJ"));
            cidade.setNome("");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

}