package salario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioHoristaTest {

    @Test
    void deveCalcularSalario() {
        FuncionarioHorista funcionario = new FuncionarioHorista();
        funcionario.setNumDias(30);
        funcionario.setNumHorasDia(10);
        funcionario.setValorHora(10);

        assertEquals(3000.0f, funcionario.calcularSalario());
    }

}