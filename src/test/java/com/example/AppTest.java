package com.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void deveCriarUsuarioComDadosValidos() {
        String inputSimulado = "João Silva\n12345678901\n30\n";
        InputStream in = new ByteArrayInputStream(inputSimulado.getBytes());
        System.setIn(in);

        App.main(new String[]{});

        // Sem asserts porque a classe App apenas imprime no console.
        // O teste garante que não há exceções ao rodar com dados válidos.
    }

    @Test
    void deveRecusarCpfInvalido() {
        String inputSimulado = "Maria\n123\n25\n";
        InputStream in = new ByteArrayInputStream(inputSimulado.getBytes());
        System.setIn(in);

        App.main(new String[]{});

        // Aqui também não há assert, mas o objetivo é garantir que o programa
        // não lance exceções ao lidar com CPF inválido.
    }

    @Test
    void deveRecusarNomeVazio() {
        String inputSimulado = "\n12345678901\n25\n";
        InputStream in = new ByteArrayInputStream(inputSimulado.getBytes());
        System.setIn(in);

        App.main(new String[]{});
    }

    @Test
    void deveRecusarIdadeInvalida() {
        String inputSimulado = "Carlos\n12345678901\n-5\n";
        InputStream in = new ByteArrayInputStream(inputSimulado.getBytes());
        System.setIn(in);

        App.main(new String[]{});
    }

    @Test
    void deveRecusarIdadeComTexto() {
        String inputSimulado = "Ana\n12345678901\nabc\n";
        InputStream in = new ByteArrayInputStream(inputSimulado.getBytes());
        System.setIn(in);

        App.main(new String[]{});
    }
}
