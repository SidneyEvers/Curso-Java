package br.com.proway.cursojava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, qual é o seu nome?");
        String nome = scanner.nextLine();
        System.out.println("Qual é o mês de seu aniversário?");
        String mesAniversario = scanner.nextLine();

        System.out.println("O nome é:"+" "+nome +" o mês de aniverário é: "+mesAniversario);
        scanner.close();
    }
}
