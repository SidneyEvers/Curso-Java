package br.com.proway.cursojava.app.application.vehicle;

import br.com.proway.cursojava.app.domain.vehicle.Vehicle;
import br.com.proway.cursojava.app.domain.vehicle.VehicleService;

public class VehicleController {

    private VehicleService service;

    public VehicleController(VehicleService service){
        this.service = service;
    }

    public boolean registerVehicle(String plate, String model, String color){
        Vehicle vehicle = new Vehicle(null, plate, color, model);

        return service.registerVehicle(vehicle);
    }
}
