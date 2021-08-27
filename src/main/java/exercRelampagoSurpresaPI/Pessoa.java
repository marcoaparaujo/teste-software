package exercRelampagoSurpresaPI;

public class Pessoa {

    private Escolaridade escolaridade;

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
}
