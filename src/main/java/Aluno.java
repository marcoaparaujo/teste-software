public class Aluno {

    private String nome;
    private float frequencia;
    private float p1;
    private float p2;
    private float provaFinal;
    private float segundaEpoca;
    private Curso curso;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getFrequencia() {
        return this.frequencia;
    }

    public void setFrequencia(float frequencia) {
        this.frequencia = frequencia;
    }

    public float getP1() {
        return this.p1;
    }

    public void setP1(float p1) {
        this.p1 = p1;
    }

    public float getP2() {
        return this.p2;
    }

    public void setP2(float p2) {
        this.p2 = p2;
    }

    public float getProvaFinal() {
        return this.provaFinal;
    }

    public void setProvaFinal(float provaFinal) {
        this.provaFinal = provaFinal;
    }

    public float getSegundaEpoca() {
        return this.segundaEpoca;
    }

    public void setSegundaEpoca(float segundaEpoca) {
        this.segundaEpoca = segundaEpoca;
    }

    public Curso getCurso() {
        return this.curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public boolean verificarAprovacao() {
        if (this.frequencia < 75.0f) {
            return false;
        }
        else {
            float media = (this.p1 + this.p2) / 2;
            if (media < 4.0f) {
                return false;
            }
            else {
                if (media >= 7.0f) {
                    return true;
                }
                else {
                    if (this.provaFinal < 3.0f) {
                        return false;
                    }
                    else {
                        if (this.provaFinal >= 6.0f) {
                            return true;
                        }
                        else {
                            if (this.segundaEpoca < 6.0f) {
                                return false;
                            }
                            else {
                                return true;
                            }
                        }
                    }
                }
            }
        }
    }

    public String getNomeCurso() {
        if (this.curso == null) {
            throw new NullPointerException("Aluno sem curso");
        }
        return this.curso.getNome();
    }
}



