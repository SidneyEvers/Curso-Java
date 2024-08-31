package br.com.proway.cursojava.Aula2;

import java.util.Scanner;

public class ExemploIf {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número entre 1 e 10");
        int numero = Integer.parseInt(leitor.nextLine());
        if(numero == 3){
            System.out.println("Parabéns!!!!");
            System.out.println("Você acertou o número secreto");
        }
        System.out.println("Fim!");
        leitor.close();
    }
}
