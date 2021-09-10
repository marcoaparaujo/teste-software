package exercRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveRetornarEscolaridade() {
        Escolaridade escolaridade = new Escolaridade("Mestrado");
        Professor professor = new Professor("Ana");
        professor.setEscolaridade(escolaridade);
        assertEquals("Mestrado", professor.getDescricaoEscolaridade());
    }

    @Test
    void deveRetornarSemEscolaridade() {
        Escolaridade escolaridade = new Escolaridade("Mestrado");
        Professor professor = new Professor("Ana");
        assertEquals("Sem escolaridade", professor.getDescricaoEscolaridade());
    }

    @Test
    void deveRetornarCidadeNaturalidade() {
        Professor professor = new Professor("Ana");
        Cidade cidade = new Cidade("Vassouras", new Estado("RJ"));
        professor.setNaturalidade(cidade);

        assertEquals("Vassouras", professor.getNomeCidadeNaturalidade());
    }

    @Test
    void deveRetornarSemNaturalidade() {
        Professor professor = new Professor("Ana");

        assertEquals("Sem naturalidade", professor.getNomeCidadeNaturalidade());
    }

    @Test
    void deveRetornarNomeTipoEnsinoCurso() {
        TipoEnsino tipoEnsino = new TipoEnsino();
        tipoEnsino.setNome("Superior");
        Curso curso = new Curso();
        curso.setTipoEnsino(tipoEnsino);
        Professor professor = new Professor("Ana");
        professor.setCurso(curso);

        assertEquals("Superior", professor.getNomeTipoEnsinoCurso());
    }


    @Test
    void deveRetornarSemNomeTipoEnsinoCurso() {
        Professor professor = new Professor("Ana");

        assertEquals("Professor sem curso", professor.getNomeTipoEnsinoCurso());
    }

    @Test
    void deveRetornarNomeDiretorCursoEsccola() {
        Professor diretor = new Professor("José");
        Escola escola = new Escola();
        Curso curso = new Curso();
        Professor professor = new Professor("Ana");
        professor.setCurso(curso);
        curso.setEscola(escola);
        escola.setDiretor(diretor);

        assertEquals("José", professor.getNomeDiretorCurso());
    }

    @Test
    void deveRetornarSemNomeDiretorCursoEscola() {
        Professor professor = new Professor("Ana");

        assertEquals("Professor sem curso", professor.getNomeDiretorCurso());
    }

    @Test
    void deveRetornarNomeCoordenadorCurso() {
        Professor coordenador = new Professor("Antonio");
        Professor professor = new Professor("Ana");
        Curso curso = new Curso();
        professor.setCurso(curso);
        curso.setCoordenador(coordenador);

        assertEquals("Antonio", professor.getNomeCoordenador());
    }

    @Test
    void deveRetornarSemNomeCoordenadorCurso() {
        Professor professor = new Professor("Ana");

        assertEquals("Professor sem curso", professor.getNomeCoordenador());
    }

    @Test
    void deveRetornarNomeDiretorCursoEscolaMock() {
        Professor professor = new Professor("Ana");
        Curso cursoMock = createMock(Curso.class);
        expect(cursoMock.getNomeDiretorEscola()).andReturn("José");
        replay(cursoMock);
        professor.setCurso(cursoMock);

        assertEquals("José", professor.getNomeDiretorCurso());
    }
}