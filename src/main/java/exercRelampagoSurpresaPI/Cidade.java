package exercRelampagoSurpresaPI;

public class Cidade {

    private String nome;
    private Estado estado;

    public Cidade(String nome, Estado estado) {
        if ((nome == null) || (nome.trim().equals(""))) {
            throw new NullPointerException("Nome é obrigatório");
        }
        if (estado == null) {
            throw new NullPointerException("Estado é obrigatório");
        }
        this.nome = nome;
        this.estado = estado;
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        if (estado == null) {
            throw new NullPointerException("Estado é obrigatório");
        }
        this.estado = estado;
    }

    public String getNomeEstado() {
        if (estado == null) {
            throw new NullPointerException("Estado é obrigatório");
        }
        return this.estado.getNome();
    }
}
