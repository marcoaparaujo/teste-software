package exercRelampagoSurpresaPI;

public class Curso {

    private Professor coordenador;
    private Escola escola;
    private TipoEnsino tipoEnsino;

    public Professor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public TipoEnsino getTipoEnsino() {
        return tipoEnsino;
    }

    public void setTipoEnsino(TipoEnsino tipoEnsino) {
        this.tipoEnsino = tipoEnsino;
    }

    public String getDescricaoEscolaridadeCoordenador() {
        if (this.coordenador == null) {
            return "Curso sem coordenador";
        }
        else {
            return this.coordenador.getDescricaoEscolaridade();
        }
    }

    public String getNomeEstadoEscola() {
        if (this.escola == null) {
            return "Curso sem escola";
        }
        else {
            return this.escola.getNomeEstado();
        }
    }

    public String getNomeTipoEnsino() {
        if (this.tipoEnsino == null) {
            return "Curso sem Tipo de Ensino";
        }
        else {
            return this.tipoEnsino.getNome();
        }
    }

    public String getNomeCoordenador() {
        if (this.coordenador == null) {
            return "Curso sem coordenador";
        }
        else {
            return this.coordenador.getNome();
        }
    }

    public String getNomeDiretorEscola() {
        if (this.escola == null) {
            return "Curso sem escola";
        }
        else {
            return this.escola.getNomeDiretor();
        }
    }

}
