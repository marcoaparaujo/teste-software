package salario;

public class Departamento {

    private Funcionario chefe;

    public Funcionario getChefe() {
        return chefe;
    }

    public void setChefe(Funcionario chefe) {
        this.chefe = chefe;
    }

    public float calcularSalarioChefe() {
        if (chefe == null) {
            throw new NullPointerException("Departamento sem chefe");
        }
        return chefe.calcularSalario();
    }

}
