package br.com.proway.cursojava.app.infra.view;

import br.com.proway.cursojava.app.application.parkRegistration.ParkRegistrationController;

import java.util.Scanner;

public class RegisterEntryView {

    private Scanner scanner;
    private ParkRegistrationController controller;


    public RegisterEntryView(Scanner scanner, ParkRegistrationController controller){
        this.scanner = scanner;
        this.controller = controller;
    }

    public void render(){
        System.out.println("====================");
        System.out.println("Registrar a entrada do veículo");
        System.out.println("====================");
        System.out.println("Informe a placa do veículo");
        String plate = scanner.nextLine();
        System.out.println("Informe a data/hora da entrada(Pressione enter para usar a hora atual)");
        String time = scanner.nextLine();

        //Preciso registrar a entrada do veículo
        boolean ok = controller.registryEntry(plate, time);
        if(ok){
            System.out.println("Entrada registrada com sucesso");
        }
        else{
            System.out.println("Não foi possível registrar a entrada");
        }
    }
}
