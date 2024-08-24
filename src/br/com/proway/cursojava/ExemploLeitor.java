package br.com.proway.cursojava;

import java.util.Scanner;

public class ExemploLeitor {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = leitor.nextLine();
        System.out.println("Digite seu sobrenome");
        String sobrenome = leitor.nextLine();
        System.out.println("O nome informado foi "+nome);
        System.out.println("O nome completo é "+nome +" "+sobrenome);
        leitor.close();

    }
}
