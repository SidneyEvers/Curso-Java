package br.com.proway.cursojava.app.infra.persistence;

import br.com.proway.cursojava.app.domain.vehicle.Vehicle;
import br.com.proway.cursojava.app.domain.vehicle.VehicleRepository;

import java.util.ArrayList;

public class VehicleRepositoryImpl implements VehicleRepository {

    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    private static int nextId = 1;


    @Override
    public Vehicle findByPlate(String plate) {
        for(Vehicle vehicle: vehicles){
            if(vehicle.getPlate().equalsIgnoreCase(plate)){
                return vehicle;
            }
        }
        return null;
    }

    @Override
    public boolean registerVehicle(Vehicle vehicle) {
        vehicle.setId(nextId++);
        return vehicles.add(vehicle);
    }
}
