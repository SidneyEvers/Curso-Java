package br.com.proway.cursojava.app.domain.parkInLot;

import br.com.proway.cursojava.app.domain.BaseEntity;
import br.com.proway.cursojava.app.domain.vehicle.Vehicle;

import java.time.LocalDateTime;

public class ParkRegistration  extends BaseEntity {

    private LocalDateTime start;
    private LocalDateTime end;
    private Vehicle vehicle;

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
