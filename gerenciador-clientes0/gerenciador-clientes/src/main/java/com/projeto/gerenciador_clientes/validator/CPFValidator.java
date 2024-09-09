package com.projeto.gerenciador_clientes.validator;

public class CPFValidator {

    public static boolean isValid(String cpf) {

        cpf = cpf.replaceAll("\\D", "");

        // Verifica se o CPF tem 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        return verificarDigitos(cpf);
    }

    private static boolean verificarDigitos(String cpf) {

        int primeiroDigitoVerificador = calcularDigito(cpf, 9);

        int segundoDigitoVerificador = calcularDigito(cpf, 10);

        return cpf.charAt(9) == Character.forDigit(primeiroDigitoVerificador, 10) &&
                cpf.charAt(10) == Character.forDigit(segundoDigitoVerificador, 10);
    }

    private static int calcularDigito(String cpf, int tamanho) {
        int soma = 0;
        int peso = tamanho + 1; // Peso começa em 10 para o primeiro dígito e 11 para o segundo

        for (int i = 0; i < tamanho; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * peso--;
        }

        int resto = 11 - (soma % 11);
        return (resto >= 10) ? 0 : resto; // Se resto for 10 ou 11, o dígito verificador é 0
    }
}
