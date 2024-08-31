package br.com.proway.cursojava.Aula2;

import java.util.Scanner;

public class ExercicioParOuImpar {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um número:");
        int numero = Integer.parseInt(leitor.nextLine());
        if(numero != 0){
            if(numero % 2 == 0){
                System.out.println("O " +numero +" é um número par" );
            }
            else{
                System.out.println("O" +numero +" é um número ímpar");
            }
        }
        else{
            System.out.println("O número precisa ser diferente de zero");
        }

        System.out.println("Fim do programa");
        leitor.close();
    }
}
