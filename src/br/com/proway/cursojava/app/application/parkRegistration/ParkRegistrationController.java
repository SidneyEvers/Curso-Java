package br.com.proway.cursojava.app.application.parkRegistration;

import br.com.proway.cursojava.app.domain.parkInLot.ParkRegistration;
import br.com.proway.cursojava.app.domain.parkInLot.ParkRegistrationSevice;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ParkRegistrationController {

    private ParkRegistrationSevice service;

    public ParkRegistrationController(ParkRegistrationSevice service){
        this.service = service;
    }



    public boolean registryEntry(String plate, String time){
        LocalDateTime dateTime = LocalDateTime.now();
        if(time != null && time.trim().length() > 0){
            dateTime = LocalDateTime.parse(time);
        }
        return service.registerStart(plate, dateTime);
    }

    public double calculateTotalValue(String plate, String time){
        LocalDateTime dateTime = LocalDateTime.now();
        if(time != null && time.trim().length() > 0){
            dateTime = LocalDateTime.parse(time);
        }
        return service.calculateTotalValue(plate, dateTime);
    }
    public boolean registryExit(String plate, String time){
        LocalDateTime dateTime = LocalDateTime.now();
        if(time != null && time.trim().length() > 0){
            dateTime = LocalDateTime.parse(time);
        }
        return service.registerExit(plate, dateTime);
    }
}

