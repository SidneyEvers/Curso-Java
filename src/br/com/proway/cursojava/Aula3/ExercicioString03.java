package br.com.proway.cursojava.Aula3;

import java.util.Scanner;

public class ExercicioString03 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = leitor.nextLine();

        String maiusculo = nome.toUpperCase();
        System.out.println(maiusculo);
    }
}
