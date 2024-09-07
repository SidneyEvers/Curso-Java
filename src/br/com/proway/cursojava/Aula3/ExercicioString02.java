package br.com.proway.cursojava.Aula3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExercicioString02 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe seu primeiro nome: ");
        String nome = leitor.nextLine();

        System.out.println("Informe seu sobrenome");
        String sobrenome = leitor.nextLine();

        String nomeCompleto = nome + sobrenome;
        System.out.println(nomeCompleto);

        boolean contemSilva = sobrenome.contains("Silva");
        System.out.println(contemSilva);
    }
}
