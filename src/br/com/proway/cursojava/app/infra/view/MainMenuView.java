package br.com.proway.cursojava.app.infra.view;

import java.util.Scanner;

public class MainMenuView {
    private Scanner scanner;
    private ViewRenderer renderer;

    public MainMenuView(Scanner scanner, ViewRenderer renderer){
        this.scanner = scanner;
        this.renderer = renderer;
    }

    public void render(){

        int option = -1;
        while(option != 4){
            System.out.println("===========================");
            System.out.println("1 - Menu principal");
            System.out.println("===========================");
            System.out.println("1 - Cadastrar veículo");
            System.out.println("2 - Registrar entrada");
            System.out.println("3 - Registrar saída");
            System.out.println("4 - Sair");
            option = Integer.parseInt(scanner.nextLine());
            executeOption(option);
        }
    }
    private void executeOption(int option){
        if(option > 0){
            renderer.render(option);
        }
    }
}
