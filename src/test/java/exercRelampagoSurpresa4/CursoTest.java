package exercRelampagoSurpresa4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveRetornarNumeroAlunosZerado() {
        Curso curso = new Curso();

        assertEquals(0, curso.getNumeroMatriculas());
    }

    @Test
    void deveMatricularUmAluno() {
        Curso curso = new Curso();
        Aluno aluno = new Aluno();
        curso.matricular(aluno);

        assertEquals(1, curso.getNumeroMatriculas());
    }

    @Test
    void deveMatricularDoisAlunos() {
        Curso curso = new Curso();
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        curso.matricular(aluno1);
        curso.matricular(aluno2);

        assertEquals(2, curso.getNumeroMatriculas());
    }

    @Test
    void deveEncontrarAlunoMatriculado() {
        Curso curso = new Curso();
        Aluno aluno = new Aluno();
        curso.matricular(aluno);

        assertTrue(curso.verificaAluno(aluno));
    }

    @Test
    void naoDeveEncontrarAlunoMatriculado() {
        Curso curso = new Curso();
        Aluno aluno = new Aluno();

        assertFalse(curso.verificaAluno(aluno));
    }

    @Test
    void deveEncontrarAlunoPeloNome() {
        Curso curso = new Curso();
        Aluno aluno = new Aluno();
        aluno.setNome("Bernardo");
        curso.matricular(aluno);

        assertTrue(curso.verificaAlunoPeloNome("Bernardo"));
    }

    @Test
    void naoDeveEncontrarAlunoPeloNome() {
        Curso curso = new Curso();

        assertFalse(curso.verificaAlunoPeloNome("Bernardo"));
    }

}