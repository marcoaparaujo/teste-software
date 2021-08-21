package salario;

public class FuncionarioHorista implements Funcionario {

    private float valorHora;
    private int numHorasDia;
    private int numDias;

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public int getNumHorasDia() {
        return numHorasDia;
    }

    public void setNumHorasDia(int numHorasDia) {
        this.numHorasDia = numHorasDia;
    }

    public int getNumDias() {
        return numDias;
    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    public float calcularSalario() {
        return this.numDias * this.numHorasDia * this.valorHora;
    }
}
