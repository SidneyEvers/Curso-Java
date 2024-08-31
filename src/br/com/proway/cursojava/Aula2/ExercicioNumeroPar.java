package br.com.proway.cursojava.Aula2;

import java.util.Scanner;

public class ExercicioNumeroPar {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um número:");
        int numero = Integer.parseInt(leitor.nextLine());
        if(numero % 2 == 0){
            System.out.println("O " +numero +" é um número par" );
        }
        System.out.println("O " +numero +" É um número ímpar");
    }
}
