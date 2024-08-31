package br.com.proway.cursojava.Aula2;

import java.util.Scanner;

public class ExercicioIdadeMaior {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe sua idade:");
        int idade = Integer.parseInt(leitor.nextLine());
        if(idade >= 18){
            System.out.println("Você é maior de idade");
        }
        else{
            System.out.println("Você é menor de idade!");
        }

        System.out.println("Fim do programa");
        leitor.close();
    }
}
