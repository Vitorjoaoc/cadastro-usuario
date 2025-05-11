package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CadastroUsuarioTest {

    @Test
    public void testNomeValido() {
        assertTrue(CadastroUsuario.validarNome("João da Silva"));
    }

    @Test
    public void testNomeInvalidoNulo() {
        assertFalse(CadastroUsuario.validarNome(null));
    }

    @Test
    public void testNomeInvalidoVazio() {
        assertFalse(CadastroUsuario.validarNome("  "));
    }

    @Test
    public void testCpfValido() {
        assertTrue(CadastroUsuario.validarCpf("12345678901"));
    }

    @Test
    public void testCpfInvalidoMenosDigitos() {
        assertFalse(CadastroUsuario.validarCpf("1234567890"));
    }

    @Test
    public void testCpfInvalidoComLetras() {
        assertFalse(CadastroUsuario.validarCpf("abc45678901"));
    }

    @Test
    public void testIdadeValida() {
        assertTrue(CadastroUsuario.validarIdade(30));
    }

    @Test
    public void testIdadeInvalidaNegativa() {
        assertFalse(CadastroUsuario.validarIdade(-5));
    }

    @Test
    public void testIdadeInvalidaAcima120() {
        assertFalse(CadastroUsuario.validarIdade(150));
    }
}
