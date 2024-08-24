package br.com.proway.cursojava;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite o seguro número: ");
        double numero2 = Double.parseDouble(scanner.nextLine());

        double resultadoOperacao = numero1 + numero2 * 3;
        System.out.println("Esse é o resultado da soma do primeiro com a multiplicação do segundo: "+resultadoOperacao);

        double operacao2 = numero2 - numero1;
        System.out.println("Esse é o resultado da subtação: "+operacao2);

        scanner.close();

    }
}
