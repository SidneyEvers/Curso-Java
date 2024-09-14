package br.com.proway.cursojava.Aula4.Palpite;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        //Coletando o nome do jogador
        System.out.println("Digite seu nome: ");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();

        //Criando uma instancia do jogador
        Jogador jogador = new Jogador(nome);

        //Criando uma instancia do jogo
        JogoAdvinhacao jogo = new JogoAdvinhacao(5, jogador);
        jogo.iniciarJogo();//Iniciando o jogo 
    }
}
