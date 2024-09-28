package br.com.proway.cursojava.app.domain.vehicle;

public class VehicleService {

    private VehicleRepository repository;

    public VehicleService(VehicleRepository repository){
        this.repository = repository;
    }

    public boolean registerVehicle(Vehicle vehicle){
        if(vehicle.getPlate() != null && vehicle.getPlate().trim().length() == 7){
            return repository.registerVehicle(vehicle);
        }
        return false;
    }
}
