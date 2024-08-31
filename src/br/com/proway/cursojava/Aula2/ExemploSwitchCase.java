package br.com.proway.cursojava.Aula2;

import java.util.Scanner;

public class ExemploSwitchCase {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("1 - Saldo");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        int opcao = Integer.parseInt(leitor.nextLine());

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
            default:
                mensagem = "Opção inválida";
        }
        System.out.println(mensagem);
        leitor.close();
    }
}
