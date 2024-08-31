package br.com.proway.cursojava.Aula2;

import java.util.Scanner;

public class ExemploWhile2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 4){
            System.out.println("1 - Saldo");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sair");

            opcao = Integer.parseInt(leitor.nextLine());
            String mensagem = "";


            switch (opcao){
                case 1:
                    mensagem = "Você escolheu a opção Saldo";
                    break;
                case 2:
                    mensagem = "Você escolheu a opção Sacar";
                    break;
                case 3:
                    mensagem = "Você escolheu a opção Depositar";
                    break;
                case 4:
                    mensagem = "Você escolheu a opção SAIR";
                    break;
                default:
                    mensagem = "Opção inválida";
            }
            System.out.println(mensagem);
        }
        leitor.close();
    }
}
