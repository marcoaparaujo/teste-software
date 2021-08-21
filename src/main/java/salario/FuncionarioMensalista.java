package salario;

public class FuncionarioMensalista implements Funcionario {

    private float salarioMensal;

    public float getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(float salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public float calcularSalario() {
        return this.salarioMensal;
    }
}
