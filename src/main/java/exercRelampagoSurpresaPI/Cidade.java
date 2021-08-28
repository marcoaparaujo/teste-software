package exercRelampagoSurpresaPI;

public class Cidade {

    private Estado estado;

    public Cidade(Estado estado) {
        if (estado == null) {
            throw new NullPointerException("Estado é obrigatório");
        }
        this.estado = estado;
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
