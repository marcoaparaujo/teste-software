package exercRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveRetornarEscolaridade() {
        Escolaridade escolaridade = new Escolaridade("Mestrado");
        Professor professor = new Professor();
        professor.setEscolaridade(escolaridade);
        assertEquals("Mestrado", professor.getDescricaoEscolaridade());
    }

    @Test
    void deveRetornarSemEscolaridade() {
        Escolaridade escolaridade = new Escolaridade("Mestrado");
        Professor professor = new Professor();
        assertEquals("Sem escolaridade", professor.getDescricaoEscolaridade());
    }

}