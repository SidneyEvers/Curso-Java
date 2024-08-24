package br.com.proway.cursojava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, informe seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Informe seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("O nome completo informado é:"+" " +nome + " " +sobrenome);
        scanner.close();
    }
}
