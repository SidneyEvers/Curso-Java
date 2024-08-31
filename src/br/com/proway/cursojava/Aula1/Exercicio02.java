package br.com.proway.cursojava.Aula1;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o nome do seu time?");
        String time = scanner.nextLine();

        System.out.println("O nome do seu time é: "+" "+time);

        scanner.close();
    }
}
