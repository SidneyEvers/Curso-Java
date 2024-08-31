package br.com.proway.cursojava.Aula2;

import java.util.Scanner;

public class ExercicioCnh {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe sua idade:");
        int idade = Integer.parseInt(leitor.nextLine());
        if(idade >= 18){
            System.out.println("Você é maior de idade, e já pode fazer a CNH");
        }
        else{
            int anosFaltantes = 18  - idade;
            System.out.println("Você é menor de idade, ainda faltam "  + anosFaltantes +" para poder fazer a CNH");
        }

        System.out.println("Fim do programa");
        leitor.close();
    }

}
