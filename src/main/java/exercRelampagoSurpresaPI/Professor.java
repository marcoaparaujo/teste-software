package exercRelampagoSurpresaPI;

public class Professor extends Pessoa {

    public Professor(String nome) {
        super(nome);
    }

    private Curso curso;

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getNomeTipoEnsinoCurso() {
        if (this.curso == null) {
            return "Professor sem curso";
        }
        else {
            return this.curso.getNomeTipoEnsino();
        }
    }

    public String getNomeDiretorCurso() {
        if (this.curso == null) {
            return "Professor sem curso";
        }
        else {
            return this.curso.getNomeDiretorEscola();
        }
    }

    public String getNomeCoordenador() {
        if (this.curso == null) {
            return "Professor sem curso";
        }
        else {
            return this.curso.getNomeCoordenador();
        }
    }

}
