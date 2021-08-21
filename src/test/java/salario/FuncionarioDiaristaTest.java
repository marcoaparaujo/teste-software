package salario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioDiaristaTest {

    @Test
    void deveCalcularSalario() {
        FuncionarioDiarista funcionario = new FuncionarioDiarista();
        funcionario.setNumDias(20);
        funcionario.setValorDia(100);

        assertEquals(2000.0f, funcionario.calcularSalario());
    }

}