package br.com.proway.cursojava.Aula1;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a nota do primeiro aluno: ");
        double nota1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Informe a nota do segundo aluno: ");
        double nota2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Informe a nota do terceiro aluno: ");
        double nota3 = Double.parseDouble(scanner.nextLine());
        System.out.println("Informe a nota do quarto aluno: ");
        double nota4 = Double.parseDouble(scanner.nextLine());
        System.out.println("Informe a nota do quinto aluno: ");
        double nota5 = Double.parseDouble(scanner.nextLine());

        double mediaSala = (nota1 + nota2 + nota3 + nota4 + nota5)/5;

        System.out.println("A média da sala foi de "+mediaSala);
        scanner.close();

    }
}
