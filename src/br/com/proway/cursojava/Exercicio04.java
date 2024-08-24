package br.com.proway.cursojava;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da Base do retângulo: ");
        double base = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite a altura do retângulo: ");
        double altura = Double.parseDouble(scanner.nextLine());

        double areaRetângulo = base * altura;

        System.out.println("A área do retângulo é de "+areaRetângulo);
        scanner.close();

    }
}
