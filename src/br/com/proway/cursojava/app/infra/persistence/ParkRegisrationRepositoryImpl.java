package br.com.proway.cursojava.app.infra.persistence;

import br.com.proway.cursojava.app.domain.parkInLot.ParkRegistration;
import br.com.proway.cursojava.app.domain.parkInLot.ParkRegistrationRepository;

import java.util.ArrayList;

public class ParkRegisrationRepositoryImpl implements ParkRegistrationRepository {

    private ArrayList<ParkRegistration> registrations = new ArrayList<>();

    @Override
    public void save(ParkRegistration parkRegistration) {
        registrations.add(parkRegistration);
    }

    @Override
    public ParkRegistration findOpenEntry(String plate) {
        for(ParkRegistration entry: registrations){
            if(entry.getVehicle().getPlate().equalsIgnoreCase(plate) && entry.getEnd() == null){
                return entry;
            }
        }
        return null;
    }
}
