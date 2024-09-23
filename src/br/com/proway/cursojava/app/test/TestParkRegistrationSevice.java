package br.com.proway.cursojava.app.test;

import br.com.proway.cursojava.app.domain.parkInLot.ParkRegistration;
import br.com.proway.cursojava.app.domain.parkInLot.ParkRegistrationRepository;
import br.com.proway.cursojava.app.domain.parkInLot.ParkRegistrationSevice;
import br.com.proway.cursojava.app.domain.vehicle.Vehicle;
import br.com.proway.cursojava.app.domain.vehicle.VehicleRepository;

import java.util.ArrayList;
import java.util.List;

public class TestParkRegistrationSevice {

    static class VehicleRepositoryMock implements VehicleRepository{


        List<Vehicle> vehicles = List.of(new Vehicle(1, "DDD1234", "Cinza", "Chevete" ));

        @Override
        public Vehicle findByPlate(String plate) {
            for(Vehicle vehicle : vehicles){
                if(vehicle.getPlate().equals(plate)){
                    return vehicle;
                }
            }
            return null;
        }
    }

    static  class ParkReistrationRepositoryMock implements ParkRegistrationRepository {

        List<ParkRegistration> registrations = new ArrayList<>();
        @Override
        public void save(ParkRegistration parkRegistration) {
                registrations.add(parkRegistration);
        }
    }

    public static void main(String[] args) {

        VehicleRepositoryMock vehicleRepositoryMock = new VehicleRepositoryMock();
        ParkReistrationRepositoryMock parkReistrationRepositoryMock = new ParkReistrationRepositoryMock();

        ParkRegistrationSevice service = new ParkRegistrationSevice(vehicleRepositoryMock, parkReistrationRepositoryMock);

        System.out.println("Testando incluir um registro de estacionamento");
        System.out.println(parkReistrationRepositoryMock.registrations);

        service.registerStart("DDD1234");
        System.out.println(parkReistrationRepositoryMock.registrations);
    }
}
