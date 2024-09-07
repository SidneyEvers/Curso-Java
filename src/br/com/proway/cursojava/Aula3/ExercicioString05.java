package br.com.proway.cursojava.Aula3;

import java.util.Scanner;

public class ExercicioString05 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um nome: ");
        String nome = leitor.nextLine();

        for(int index = 0; index < nome.length(); index++){
            System.out.println(nome.charAt(index));
        }
        leitor.close();
    }
}
