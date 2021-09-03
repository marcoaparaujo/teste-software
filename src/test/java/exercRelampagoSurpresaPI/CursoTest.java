package exercRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveRetornarDescricaoEscolaridadeCoordenador() {
        Professor coordenador = new Professor();
        Escolaridade escolaridade = new Escolaridade("Mestrado");
        coordenador.setEscolaridade(escolaridade);
        Curso curso = new Curso();
        curso.setCoordenador(coordenador);

        assertEquals("Mestrado", curso.getDescricaoEscolaridadeCoordenador());
    }

    @Test
    void deveRetornarCursoSemCoordenador() {
        Curso curso = new Curso();

        assertEquals("Curso sem coordenador", curso.getDescricaoEscolaridadeCoordenador());
    }

}