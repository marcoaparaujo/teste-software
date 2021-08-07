import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveReprovarAlunoPorInfrequencia() {
        Aluno aluno = new Aluno();
        aluno.setFrequencia(74.9f);

        assertFalse(aluno.verificarAprovacao());
    }

    @Test
    void deveReprovarAlunoPorMedia() {
        Aluno aluno = new Aluno();
        aluno.setFrequencia(75.0f);
        aluno.setP1(3.9f);
        aluno.setP2(4.0f);

        assertFalse(aluno.verificarAprovacao());
    }

    @Test
    void deveAprovarAlunoPorMedia() {
        Aluno aluno = new Aluno();
        aluno.setFrequencia(75.0f);
        aluno.setP1(7.0f);
        aluno.setP2(7.0f);

        assertTrue(aluno.verificarAprovacao());
    }

    @Test
    void deveReprovarAlunoProvaFinal() {
        Aluno aluno = new Aluno();
        aluno.setFrequencia(75.0f);
        aluno.setP1(4.0f);
        aluno.setP2(4.0f);
        aluno.setProvaFinal(2.9f);

        assertFalse(aluno.verificarAprovacao());
    }

    @Test
    void deveAprovarAlunoProvaFinal() {
        Aluno aluno = new Aluno();
        aluno.setFrequencia(75.0f);
        aluno.setP1(4.0f);
        aluno.setP2(4.0f);
        aluno.setProvaFinal(6.0f);

        assertTrue(aluno.verificarAprovacao());
    }

    @Test
    void deveReprovarAlunoProvaSegundaEpoca() {
        Aluno aluno = new Aluno();
        aluno.setFrequencia(75.0f);
        aluno.setP1(4.0f);
        aluno.setP2(4.0f);
        aluno.setProvaFinal(3.0f);
        aluno.setSegundaEpoca(5.9f);

        assertFalse(aluno.verificarAprovacao());
    }

    @Test
    void deveAprovarAlunoProvaSegundaEpoca() {
        Aluno aluno = new Aluno();
        aluno.setFrequencia(75.0f);
        aluno.setP1(4.0f);
        aluno.setP2(4.0f);
        aluno.setProvaFinal(3.0f);
        aluno.setSegundaEpoca(6.0f);

        assertTrue(aluno.verificarAprovacao());
    }

}