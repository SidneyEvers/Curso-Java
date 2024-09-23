package br.com.proway.cursojava.app.domain.parkInLot;

import br.com.proway.cursojava.app.domain.vehicle.Vehicle;
import br.com.proway.cursojava.app.domain.vehicle.VehicleRepository;

import java.time.LocalDateTime;

public class ParkRegistrationSevice {

    private VehicleRepository vehicleRepository;
    private ParkRegistrationRepository parkRegistrationRepository;

    public ParkRegistrationSevice(VehicleRepository vehicleRepository, ParkRegistrationRepository parkRegistrationRepository){
        this.vehicleRepository = vehicleRepository;
        this.parkRegistrationRepository = parkRegistrationRepository;
    }


    public void registerStart(String plate){

        //Pegar horário atual
        LocalDateTime now = LocalDateTime.now();
        //Buscar o veículo referente a placa
        Vehicle vehicle = vehicleRepository.findByPlate(plate);
        //Criar um registro de estacionamento
        ParkRegistration registration = new ParkRegistration();
        registration.setStart(now);
        registration.setVehicle(vehicle);
        //Salvar o registro de estacionamento
        parkRegistrationRepository.save(registration);


    }

}
