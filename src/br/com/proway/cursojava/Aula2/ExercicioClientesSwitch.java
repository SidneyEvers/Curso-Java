package br.com.proway.cursojava.Aula2;

import java.util.Scanner;

public class ExercicioClientesSwitch {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá, escolha um número abaixo para a função que deseja: ");
        System.out.println("1 - Cadastrar um cliente");
        System.out.println("2 - Editar um cliente");
        System.out.println("3 - Pesquisar um cliente");
        System.out.println("4 - Excluir um cliente");

        int escolha = Integer.parseInt(leitor.nextLine());

        String mensagem = "";
        switch (escolha){
            case 1:
            mensagem = "Você escolheu Cadastrar um cliente";
                break;
            case 2:
                mensagem = "Você escolheu Editar um cliente";
                break;
            case 3:
                mensagem = "Você escolheu Pesquisar um cliente";
                break;
            case 4:
                mensagem = "Você escolheu Excluir um cliente";
                break;
            default:
                mensagem = "Opção inválida";
        }

        System.out.println(mensagem);
        System.out.println("Fim do programa!");
        leitor.close();
    }
}
