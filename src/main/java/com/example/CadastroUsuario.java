package com.example;

public class CadastroUsuario {
    private String nome;
    private String cpf;
    private int idade;

    public CadastroUsuario(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public static boolean validarNome(String nome) {
        return nome != null && !nome.trim().isEmpty();
    }

    public static boolean validarCpf(String cpf) {
        return cpf != null && cpf.matches("\\d{11}");
    }

    public static boolean validarIdade(int idade) {
        return idade >= 0 && idade <= 120;
    }

    public void imprimirDados() {
        System.out.println("\nCadastro realizado com sucesso:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
    }
}

