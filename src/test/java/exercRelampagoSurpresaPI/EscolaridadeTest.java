package exercRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaridadeTest {

    @Test
    void deveRetornarEscolaridadeConstrutor() {
        Escolaridade escolaridade = new Escolaridade("Mestrado");
        assertEquals("Mestrado", escolaridade.getDescricao());
    }

    @Test
    void deveRetornarExcecaoConstrutorDescricaoNula() {
        try {
            Escolaridade escolaridade = new Escolaridade(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Descrição é obrigatória", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoConstrutorDescricaoVazia() {
        try {
            Escolaridade escolaridade = new Escolaridade("");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Descrição é obrigatória", e.getMessage());
        }
    }

    @Test
    void deveRetornarEscolaridadeSet() {
        Escolaridade escolaridade = new Escolaridade("Mestrado");
        escolaridade.setDescricao("Doutorado");
        assertEquals("Doutorado", escolaridade.getDescricao());
    }

    @Test
    void deveRetornarExcecaoSetDescricaoNula() {
        try {
            Escolaridade escolaridade = new Escolaridade("Mestrado");
            escolaridade.setDescricao(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Descrição é obrigatória", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoSetDescricaoVazia() {
        try {
            Escolaridade escolaridade = new Escolaridade("Mestrado");
            escolaridade.setDescricao("");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Descrição é obrigatória", e.getMessage());
        }
    }

}