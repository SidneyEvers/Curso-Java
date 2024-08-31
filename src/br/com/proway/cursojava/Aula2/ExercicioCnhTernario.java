package br.com.proway.cursojava.Aula2;

import java.util.Scanner;

public class ExercicioCnhTernario {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("informe sua idade");
        int idade = Integer.parseInt(leitor.nextLine());

        String mensagem = idade >= 18 ? "Você é de maior" : "Você é de menor";
        System.out.println(mensagem);
        leitor.close();
    }
}
