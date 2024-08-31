package br.com.proway.cursojava.Aula2;

import java.util.Scanner;

public class ExercicioNotasWhileContinue {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double nota1 = 0;

        while(nota1 != -1){
            System.out.println("Informe a NOTA 1: ");
            nota1 = Double.parseDouble(leitor.nextLine());
            if(nota1 == -1){
                break;
            }
            System.out.println("Informe a NOTA 2: ");
            double nota2 = Double.parseDouble(leitor.nextLine());
            System.out.println("Informe a NOTA 3: ");
            double nota3 = Double.parseDouble(leitor.nextLine());

            double media = (nota1 + nota2 + nota3) / 3;
            System.out.println("Sua média foi de: " +media);
        }
        System.out.println("Programa cancelado");
        leitor.close();

    }
}
