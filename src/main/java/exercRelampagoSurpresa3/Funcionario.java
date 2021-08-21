package exercRelampagoSurpresa3;

public class Funcionario {

    private String nome;
    private float salarioBruto;
    private float totalAcrescimos;
    private float totalDescontos;
    private boolean administrador;

    public Funcionario(String nome, float salarioBruto, float totalAcrescimos, float totalDescontos) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.totalAcrescimos = totalAcrescimos;
        this.totalDescontos = totalDescontos;
        this.administrador = false;
    }

    public String getNome(Funcionario funcionario) {
        if ((funcionario == null) || (!funcionario.isAdministrador())) {
            throw new IllegalArgumentException("Precisa ser administrador para acessar nome do funcionário");
        }
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            throw new NullPointerException("Nome é obrigatório");
        }
        this.nome = nome;
    }

    public float getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public float getTotalAcrescimos() {
        return totalAcrescimos;
    }

    public void setTotalAcrescimos(float totalAcrescimos) {
        this.totalAcrescimos = totalAcrescimos;
    }

    public float getTotalDescontos() {
        return totalDescontos;
    }

    public void setTotalDescontos(float totalDescontos) {
        this.totalDescontos = totalDescontos;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public float calcularSalarioLiquido() {
        return this.salarioBruto + this.totalAcrescimos - this.totalDescontos;
    }
}
