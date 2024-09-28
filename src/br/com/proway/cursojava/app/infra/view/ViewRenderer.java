package br.com.proway.cursojava.app.infra.view;

import br.com.proway.cursojava.app.application.parkRegistration.ParkRegistrationController;
import br.com.proway.cursojava.app.application.vehicle.VehicleController;
import br.com.proway.cursojava.app.domain.parkInLot.ParkRegistrationRepository;
import br.com.proway.cursojava.app.domain.parkInLot.ParkRegistrationSevice;
import br.com.proway.cursojava.app.domain.vehicle.VehicleRepository;
import br.com.proway.cursojava.app.domain.vehicle.VehicleService;
import br.com.proway.cursojava.app.infra.persistence.ParkRegisrationRepositoryImpl;
import br.com.proway.cursojava.app.infra.persistence.VehicleRepositoryImpl;

import java.util.Scanner;

public class ViewRenderer {

    private MainMenuView mainMenuView;
    private CreateVehicleView createVehicleView;
    private RegisterEntryView registerEntryView;
    private RegisterExitView registerExitView;


    public void init(){

        Scanner scanner = new Scanner(System.in);
        mainMenuView = new MainMenuView(scanner,this);

        VehicleRepository vehicleRepository = new VehicleRepositoryImpl();
        VehicleService vehicleService = new VehicleService(vehicleRepository);
        VehicleController vehicleController = new VehicleController(vehicleService);
        createVehicleView = new CreateVehicleView(scanner, vehicleController);

        ParkRegistrationRepository parkRegistrationRepository = new ParkRegisrationRepositoryImpl();
        ParkRegistrationSevice parkRegistrationSevice = new ParkRegistrationSevice(vehicleRepository,parkRegistrationRepository);
        ParkRegistrationController parkRegistrationController = new ParkRegistrationController(parkRegistrationSevice);


        registerEntryView = new RegisterEntryView(scanner, parkRegistrationController);
        registerExitView = new RegisterExitView(scanner, parkRegistrationController);
        render(0);
    }

    public void render(int code){
        switch(code){
            case 0:
                //renderiza o menu principal
                mainMenuView.render();
                break;
            case 1:
                //renderiza o menu de cadastro de veículos
                createVehicleView.render();
                break;
            case 2:
                //Renderiza o menu de registro de entrada no estacionamento
                registerEntryView.render();
                break;
            case 3:
                //renderiza o menu de saída do esacionamento
                registerExitView.render();
                break;
        }
    }
}
