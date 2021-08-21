package exercRelampagoSurpresa3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveInstanciarFuncionario() {
        Funcionario funcionario = new Funcionario("Marco", 1000, 100, 200);

        Funcionario administrador = new Funcionario("Antonio", 1000, 100, 100);
        administrador.setAdministrador(true);

        assertEquals("Marco", funcionario.getNome(administrador));
    }

    @Test
    void deveLancarExcecaoAdministradorNulo() {
        try {
            Funcionario funcionario = new Funcionario("Marco", 1000, 100, 200);

            funcionario.getNome(null);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Precisa ser administrador para acessar nome do funcionário", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoFuncionarioNaoAdministrador() {
        try {
            Funcionario funcionario = new Funcionario("Marco", 1000, 100, 200);

            Funcionario administrador = new Funcionario("Antonio", 1000, 100, 100);

            funcionario.getNome(administrador);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Precisa ser administrador para acessar nome do funcionário", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoNomeVazio() {
        try {
            Funcionario funcionario = new Funcionario("Marco", 1000, 100, 200);

            funcionario.setNome(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }

    }

    @Test
    void deveCalcularSalarioLiquido() {
        Funcionario funcionario = new Funcionario("Marco", 1000, 200, 100);

        assertEquals(1100.0f, funcionario.calcularSalarioLiquido());
    }

}