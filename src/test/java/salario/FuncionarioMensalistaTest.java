package salario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioMensalistaTest {

    @Test
    void deveCalcularSalario() {
        FuncionarioMensalista funcionario = new FuncionarioMensalista();
        funcionario.setSalarioMensal(1000);

        assertEquals(1000.0f, funcionario.calcularSalario());
    }

}