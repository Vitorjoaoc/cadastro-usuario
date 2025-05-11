package com.example;

import java.util.Scanner;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        if (!CadastroUsuario.validarNome(nome)) {
            System.out.println("Nome não pode ser vazio.");
            return;
        }

        // CPF
        System.out.print("Digite seu CPF (apenas números): ");
        String cpf = scanner.nextLine();
        if (!CadastroUsuario.validarCpf(cpf)) {
            System.out.println("CPF inválido. Deve conter exatamente 11 dígitos numéricos.");
            return;
        }

        // Idade
        System.out.print("Digite sua idade: ");
        int idade;
        try {
            idade = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Idade inválida. Deve ser um número inteiro.");
            return;
        }

        if (!CadastroUsuario.validarIdade(idade)) {
            System.out.println("Idade inválida. Deve estar entre 0 e 120 anos.");
            return;
        }

        // Cria o objeto e imprime os dados
        CadastroUsuario usuario = new CadastroUsuario(nome, cpf, idade);
        usuario.imprimirDados();

        scanner.close();
    }
}
