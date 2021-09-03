package exercRelampagoSurpresaPI;

public class Curso {

    private Professor coordenador;

    public Professor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
    }

    public String getDescricaoEscolaridadeCoordenador() {
        if (this.coordenador == null) {
            return "Curso sem coordenador";
        }
        else {
            return this.coordenador.getDescricaoEscolaridade();
        }
    }
}
