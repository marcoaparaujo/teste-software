package exercRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveRetornarExcecaoCursoNulo() {
        try {
            Aluno aluno = new Aluno("Ana", null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Curso é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoSetCursoNulo() {
        try {
            Aluno aluno = new Aluno("Ana", new Curso());
            aluno.setCurso(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Curso é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveSetarCursoConstrutor() {
        Curso curso = new Curso();
        Aluno aluno = new Aluno("Ana", curso);

        assertEquals(curso, aluno.getCurso());
    }

    @Test
    void deveSetarCurso() {
        Aluno aluno = new Aluno("Ana", new Curso());
        Curso curso = new Curso();
        aluno.setCurso(curso);

        assertEquals(curso, aluno.getCurso());
    }

    @Test
    void deveRetornarNomeEstadoNaturalidadeAluno() {
        Aluno aluno = new Aluno("Ana", new Curso());
        Cidade cidade = new Cidade("Vassouras", new Estado("RJ"));
        aluno.setNaturalidade(cidade);

        assertEquals("RJ", aluno.getNomeEstadoNaturalidade());
    }

    @Test
    void deveRetornarAlunoSemNaturalidade() {
        Aluno aluno = new Aluno("Ana", new Curso());

        assertEquals("Sem naturalidade", aluno.getNomeEstadoNaturalidade());
    }

    @Test
    void deveRetornarNomeCoordenadorCurso() {
        Curso curso = new Curso();
        Aluno aluno = new Aluno("José", curso);
        Professor professor = new Professor("Julia");
        curso.setCoordenador(professor);

        assertEquals("Julia", aluno.getNomeCoordenadorCurso());
    }

    @Test
    void deveRetornarNomeEstadoCurso() {
        Cidade cidade = new Cidade("Vassouras", new Estado("RJ"));
        Escola escola = new Escola();
        escola.setCidade(cidade);
        Curso curso = new Curso();
        curso.setEscola(escola);
        Aluno aluno = new Aluno("Ana", curso);

        assertEquals("RJ", aluno.getNomeEstadoCurso());
    }

    @Test
    void deveRetornarNomeEstadoCursoMock() {
        Curso curso = createMock(Curso.class);
        expect(curso.getNomeEstadoEscola()).andReturn("RJ");
        replay(curso);
        Aluno aluno = new Aluno("Ana", curso);

        assertEquals("RJ", aluno.getNomeEstadoCurso());
    }

}