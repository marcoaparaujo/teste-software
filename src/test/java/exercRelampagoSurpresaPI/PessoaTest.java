package exercRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveRetornarEscolaridade() {
        Escolaridade escolaridade = new Escolaridade("Mestrado");
        Pessoa pessoa = new Pessoa("Ana");
        pessoa.setEscolaridade(escolaridade);
        assertEquals("Mestrado", pessoa.getDescricaoEscolaridade());
    }

    @Test
    void deveRetornarSemEscolaridade() {
        Escolaridade escolaridade = new Escolaridade("Mestrado");
        Pessoa pessoa = new Pessoa("Ana");
        assertEquals("Sem escolaridade", pessoa.getDescricaoEscolaridade());
    }

    @Test
    void deveInstanciarPessoa() {
        Pessoa pessoa = new Pessoa("Ana");

        assertEquals("Ana", pessoa.getNome());
    }

    @Test
    void deveRetonarExcecaoNomeNuloConstrutor() {
        try {
            Pessoa pessoa = new Pessoa(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetonarExcecaoNomeVazioConstrutor() {
        try {
            Pessoa pessoa = new Pessoa("");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveMudarNomePessoa() {
        Pessoa pessoa = new Pessoa("Ana");
        pessoa.setNome("Maria");

        assertEquals("Maria", pessoa.getNome());
    }

    @Test
    void deveRetonarExcecaoSetNomeNulo() {
        try {
            Pessoa pessoa = new Pessoa("Ana");
            pessoa.setNome(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetonarExcecaoSetNomeVazio() {
        try {
            Pessoa pessoa = new Pessoa("Ana");
            pessoa.setNome("");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

}