package br.com.proway.cursojava.app.infra.view;

import br.com.proway.cursojava.app.application.parkRegistration.ParkRegistrationController;

import java.util.Scanner;

public class RegisterExitView {

    private Scanner scanner;
    private ParkRegistrationController controller;

    public RegisterExitView(Scanner scanner, ParkRegistrationController controller){
        this.scanner = scanner;
        this.controller = controller;
    }

    public void render() {
        System.out.println("====================");
        System.out.println("Registrar a saída do veículo");
        System.out.println("====================");
        System.out.println("Informe a placa do veículo");
        String plate = scanner.nextLine();
        System.out.println("Informe a data/hora da saída(Pressione enter para usar a hora atual)");
        String time = scanner.nextLine();

        //Preciso registrar a saída do veículo
        double totalValue = controller.calculateTotalValue(plate, time);
        System.out.println("Total a pagar é "+ totalValue);

        System.out.println("Digite 'C' para confirmar o pagamento");
        String confirmation = scanner.nextLine();
        if(confirmation.equalsIgnoreCase("c")){
            boolean ok = controller.registryExit(plate, time);
            if(ok){
                System.out.println("Saída registrada com sucesso");
            }else{
                System.out.println("Falha ao registrar a saída");
            }
        }else{
            System.out.println("Saída não registrada");
        }



    }
}
