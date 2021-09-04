package exercRelampagoSurpresaPI;

public class Aluno extends Pessoa {

    private Curso curso;

    public Aluno(String nome, Curso curso) {
        super(nome);
        if (curso == null) {
            throw new NullPointerException("Curso é obrigatório");
        }
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        if (curso == null) {
            throw new NullPointerException("Curso é obrigatório");
        }
        this.curso = curso;
    }

    public String getNomeEstadoCurso() {
        if (this.curso == null) {
            throw new NullPointerException("Curso é obrigatório");
        }
        return this.curso.getNomeEstadoEscola();
    }

    public String getNomeCoordenadorCurso() {
        if (this.curso == null) {
            throw new NullPointerException("Curso é obrigatório");
        }
        return this.curso.getNomeCoordenador();
    }
}
