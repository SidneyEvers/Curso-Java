package br.com.proway.cursojava.Aula4.Palpite;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Jogador {

    //Atributos privados
    private String nome;
    private int tentativas;
    private Scanner scanner;

    //Construtor
    public Jogador(String nome){
        this.nome = nome;
        this.tentativas = 0; //Inicializa tentativas com 0
        this.scanner = new Scanner(System.in); //Inicializa o Scanner
    }

    //Getter para o Nome
    public String getNome(){
        return nome;
    }
    public int getTentativas(){
        return tentativas;
    }

    //Getter para o número de tentativas
    public void incrementarTentativas(){
        this.tentativas++;
    }

    //Método para solicitar o palpite do jogador
    public int darPalpite(){
        System.out.println("Digite seu palpite: ");
        String entrada = scanner.nextLine(); //Lê a entrada como uma string

        //Verifica se a entrada é numérica
        if(entrada.matches("\\d+")){
            return Integer.parseInt(entrada);
        }else{
            System.out.println("Por favor, digite um número válido");
            return -1;
        }
    }


}
