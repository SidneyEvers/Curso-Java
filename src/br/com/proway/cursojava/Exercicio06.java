package br.com.proway.cursojava;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da Base: ");
        double base = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite o valor da altura: ");
        double altura = Double.parseDouble(scanner.nextLine());

        double areaTriangulo = (base * altura)/2;

        System.out.println("A área de triângulo é de "+areaTriangulo);
        scanner.close();
    }
}
