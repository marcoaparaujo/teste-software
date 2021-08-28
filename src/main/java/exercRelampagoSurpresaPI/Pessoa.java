package exercRelampagoSurpresaPI;

public class Pessoa {

    private Escolaridade escolaridade;

    private Cidade naturalidade;

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getDescricaoEscolaridade() {
        if (this.escolaridade == null) {
            return "Sem escolaridade";
        }
        else {
            return this.escolaridade.getDescricao();
        }
    }

    public Cidade getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(Cidade naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getNomeEstadoNaturalidade() {
       return this.naturalidade.getNomeEstado();
    }
}
