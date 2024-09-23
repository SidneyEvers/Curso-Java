package br.com.proway.cursojava.Aula4.Agenda;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        RepositorioContatos repositorioContatos = new RepositorioContatos();
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda(repositorioContatos, scanner);
        agenda.apresentarMenu();
        scanner.close();
    }
}
