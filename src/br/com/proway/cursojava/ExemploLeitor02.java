package br.com.proway.cursojava;

import java.util.Scanner;

public class ExemploLeitor02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = Integer.parseInt(scanner.nextLine());//converter texto em inteiro use o Integer.parseInt
        int idadeMaisDez = idade + 10;
        System.out.println("Sua idade daqui a 10 anos será "+idadeMaisDez);
        scanner.close();
    }
}
