package exercRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadoTest {
    
    @Test
    void deveRetornarEstadoConstrutor() {
        Estado estado = new Estado("RJ");
        assertEquals("RJ", estado.getNome());
    }

    @Test
    void deveRetornarExcecaoConstrutorDescricaoNula() {
        try {
            Estado estado = new Estado(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoConstrutorDescricaoVazia() {
        try {
            Estado estado = new Estado("");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarEstadoSet() {
        Estado estado = new Estado("RJ");
        estado.setNome("MG");
        assertEquals("MG", estado.getNome());
    }

    @Test
    void deveRetornarExcecaoSetNomeNula() {
        try {
            Estado estado = new Estado("RJ");
            estado.setNome(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoSetNomeVazia() {
        try {
            Estado estado = new Estado("RJ");
            estado.setNome("");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }
}