package exercRelampagoSurpresaPI;

public class Escolaridade {

    private String descricao;

    public Escolaridade(String descricao) {
        if ((descricao == null) || (descricao.trim().equals(""))) {
            throw new NullPointerException("Descrição é obrigatória");
        }
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        if ((descricao == null) || (descricao.trim().equals(""))) {
            throw new NullPointerException("Descrição é obrigatória");
        }
        this.descricao = descricao;
    }
}
