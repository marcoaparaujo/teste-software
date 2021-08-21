package salario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {

    @Test
    void deveCalcularSalarioChefeFuncionarioMensalista() {
        FuncionarioMensalista chefe = new FuncionarioMensalista();
        chefe.setSalarioMensal(1000);

        Departamento departamento = new Departamento();
        departamento.setChefe(chefe);

        assertEquals(1000.0f, departamento.calcularSalarioChefe());
    }

    @Test
    void deveCalcularSalarioChefeFuncionarioDiarista() {
        FuncionarioDiarista chefe = new FuncionarioDiarista();
        chefe.setValorDia(100);
        chefe.setNumDias(20);

        Departamento departamento = new Departamento();
        departamento.setChefe(chefe);

        assertEquals(2000.0f, departamento.calcularSalarioChefe());
    }

    @Test
    void deveCalcularSalarioChefeFuncionarioHorista() {
        FuncionarioHorista chefe = new FuncionarioHorista();
        chefe.setValorHora(30);
        chefe.setNumDias(10);
        chefe.setNumHorasDia(10);

        Departamento departamento = new Departamento();
        departamento.setChefe(chefe);

        assertEquals(3000.0f, departamento.calcularSalarioChefe());
    }

    @Test
    void deveLancarExcecaoDepartamentoSemChefe() {
        try {
            Departamento departamento = new Departamento();
            departamento.calcularSalarioChefe();
            fail();
        }
        catch(NullPointerException e) {
            assertEquals("Departamento sem chefe", e.getMessage());
        }

    }

}