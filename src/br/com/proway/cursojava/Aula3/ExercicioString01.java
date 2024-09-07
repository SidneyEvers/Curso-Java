package br.com.proway.cursojava.Aula3;

import java.util.Scanner;

public class ExercicioString01 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um nome: ");
        String nome = leitor.nextLine();

        int qtdeLetras = nome.length();
        System.out.println("Seu nome "+ nome + " Possui "+ qtdeLetras + " Letras");
    }
}
