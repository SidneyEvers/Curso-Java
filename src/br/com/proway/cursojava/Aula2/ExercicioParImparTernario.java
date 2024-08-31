package br.com.proway.cursojava.Aula2;

import java.util.Scanner;

public class ExercicioParImparTernario {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um número:");
        int numero = Integer.parseInt(leitor.nextLine());

        String mensagem = (numero % 2) == 0 ? "Par" : "Impar";
        System.out.println(mensagem);
        leitor.close();
    }
}
