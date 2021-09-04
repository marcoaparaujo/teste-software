package exercRelampagoSurpresaPI;

public class Pessoa {

    private String nome;

    private Escolaridade escolaridade;

    private Cidade naturalidade;

    public Pessoa(String nome) {
        if ((nome == null) || (nome.trim().equals(""))) {
            throw new NullPointerException("Nome é obrigatório");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if ((nome == null) || (nome.trim().equals(""))) {
            throw new NullPointerException("Nome é obrigatório");
        }
        this.nome = nome;
    }

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
        if (this.naturalidade == null) {
            return "Sem naturalidade";
        }
        else {
            return this.naturalidade.getNomeEstado();
        }
    }

    public String getNomeCidadeNaturalidade() {
        if (this.naturalidade == null) {
            return "Sem naturalidade";
        }
        else {
            return this.naturalidade.getNome();
        }
    }
}
