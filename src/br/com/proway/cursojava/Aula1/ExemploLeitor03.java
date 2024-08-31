package br.com.proway.cursojava.Aula1;

import java.util.Scanner;

public class ExemploLeitor03 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        //Use o Double.parseDouble para converter um texto em um valor do tipo double
        double nota1 = Double.parseDouble(leitor.nextLine());
        System.out.println("Digite a primeira nota: ");
        double nota2 = Double.parseDouble(leitor.nextLine());
        System.out.println("Digite a primeira nota: ");
        double nota3 = Double.parseDouble(leitor.nextLine());
        double media = (nota1 + nota2 + nota3)/3;
        System.out.println("A média das notas é: "+media);

        leitor.close();
    }
}
