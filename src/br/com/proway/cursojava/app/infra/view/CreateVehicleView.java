package br.com.proway.cursojava.app.infra.view;

import br.com.proway.cursojava.app.application.vehicle.VehicleController;
import br.com.proway.cursojava.app.domain.vehicle.Vehicle;

import java.util.Scanner;

public class CreateVehicleView {

    private Scanner scanner = new Scanner(System.in);
    private VehicleController controller;

    public CreateVehicleView(Scanner scanner, VehicleController controller){
        this.controller = controller;
        this.scanner = scanner;
    }

    public void render(){
        System.out.println("===================");
        System.out.println("Cadastrar veículo");
        System.out.println("===================");
        System.out.println("Informe a placa do veículo:");
        String plate = scanner.nextLine();
        System.out.println("Informe o modelo:");
        String model = scanner.nextLine();
        System.out.println("Informe a cor do veículo:");
        String color = scanner.nextLine();

        boolean ok = controller.registerVehicle(plate, model, color);
        if(ok){
            System.out.println("Veículo cadastrado com sucesso.");
        }else{
            System.out.println("Não foi possível cadastrar o veículo");
        }


    }
}
