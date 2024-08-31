package br.com.proway.cursojava.Aula2;

import java.util.Scanner;

public class ExercicioMedia {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a nota 1:");
        double nota1 = Double.parseDouble(leitor.nextLine());
        System.out.println("Informe a nota 2:");
        double nota2 = Double.parseDouble(leitor.nextLine());
        System.out.println("Informe a nota 3:");
        double nota3 = Double.parseDouble(leitor.nextLine());

        double media = (nota1 + nota2 + nota3) / 3;

        if(media >= 7){
            System.out.println("Sua média foi de: " +media +" Você foi aprovado");
        }
        else {
            System.out.println("Sua média foi de : " + media + " Você foi reprovado");
        }
        System.out.println("fim");
    }
}
