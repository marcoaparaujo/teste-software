package exercRelampagoSurpresaPI;

public class Escola {

    private Professor diretor;
    private Cidade cidade;

    public Professor getDiretor() {
        return diretor;
    }

    public void setDiretor(Professor diretor) {
        this.diretor = diretor;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getDescricaoEscolaridadeDiretor() {
        if (this.diretor == null) {
            return "Escola sem diretor";
        }
        else {
            return this.diretor.getDescricaoEscolaridade();
        }
    }

    public String getNomeEstado() {
        if (this.cidade == null) {
            return "Escola sem cidade";
        }
        else {
            return this.cidade.getNomeEstado();
        }
    }

    public String getNomeDiretor() {
        if (this.diretor == null) {
            return "Escola sem diretor";
        }
        else {
            return this.diretor.getNome();
        }
    }
}
