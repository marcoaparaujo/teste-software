package exercRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveRetornarDescricaoEscolaridadeCoordenador() {
        Professor coordenador = new Professor("Ana");
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

    @Test
    void deveRetornarNomeEstadoEscola() {
        Cidade cidade = new Cidade("Vassouras", new Estado("RJ"));
        Escola escola = new Escola();
        escola.setCidade(cidade);
        Curso curso = new Curso();
        curso.setEscola(escola);

        assertEquals("RJ", curso.getNomeEstadoEscola());
    }

    @Test
    void deveRetornarCursoSemEscola() {
        Curso curso = new Curso();

        assertEquals("Curso sem escola", curso.getNomeEstadoEscola());
    }

    @Test
    void deveRetonarNomeTipoEnsino() {
        TipoEnsino tipoEnsino = new TipoEnsino();
        tipoEnsino.setNome("Superior");
        Curso curso = new Curso();
        curso.setTipoEnsino(tipoEnsino);

        assertEquals("Superior", curso.getNomeTipoEnsino());
    }

    @Test
    void deveRetonarSemTipoEnsino() {
        Curso curso = new Curso();

        assertEquals("Curso sem Tipo de Ensino", curso.getNomeTipoEnsino());
    }

    @Test
    void deveRetornarNomeCoordenador() {
        Curso curso = new Curso();
        Professor professor = new Professor("Julia");
        curso.setCoordenador(professor);

        assertEquals("Julia", curso.getNomeCoordenador());
    }

    @Test
    void deveRetornarCursoSemNomeCoordenador() {
        Curso curso = new Curso();

        assertEquals("Curso sem coordenador", curso.getNomeCoordenador());
    }

    @Test
    void deveRetornarNomeDiretorEscola() {
        Professor diretor = new Professor("José");
        Escola escola = new Escola();
        Curso curso = new Curso();
        curso.setEscola(escola);
        escola.setDiretor(diretor);

        assertEquals("José", curso.getNomeDiretorEscola());
    }

    @Test
    void deveRetornarSemNomeDiretorEscola() {
        Curso curso = new Curso();

        assertEquals("Curso sem escola", curso.getNomeDiretorEscola());
    }

}