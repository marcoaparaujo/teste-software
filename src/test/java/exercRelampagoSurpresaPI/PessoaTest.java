package exercRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveRetornarEscolaridade() {
        Escolaridade escolaridade = new Escolaridade("Mestrado");
        Pessoa pessoa = new Pessoa();
        pessoa.setEscolaridade(escolaridade);
        assertEquals("Mestrado", pessoa.getDescricaoEscolaridade());
    }

    @Test
    void deveRetornarSemEscolaridade() {
        Escolaridade escolaridade = new Escolaridade("Mestrado");
        Pessoa pessoa = new Pessoa();
        assertEquals("Sem escolaridade", pessoa.getDescricaoEscolaridade());
    }

}