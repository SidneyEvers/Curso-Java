package br.com.proway.cursojava.Aula3;

import java.util.Scanner;

public class ExercicioString04 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = leitor.nextLine();

        String minusculo = nome.toLowerCase();
        System.out.println(minusculo);
    }
}
